// Fase 3 — Frida hooks for AXISnet 11.1.0 (com.axis.net), SETUP-ONLY / NO LOGIN.
// Run: frida -U -f com.axis.net -l axisnet-hooks.js --no-pause -o /home/boxd/fase3-frida.log
// (frida-server 17.27.4 must be running on the emulator first.)
// Goals: capture (a) decrypted Signature key material RETURN values,
// (b) AxisnetHelpers.getStringDecrypt / getPos* inputs+outputs,
// (c) OkHttp request URL+headers (Tempest signing inputs),
// (d) JCA Mac/Cipher usage (HMAC/AES) as a safety net,
// (e) list of loaded com.axis.net classes (proves V-Key dex decrypted in memory).
// NOTE: values are logged to the local log file only. Do NOT paste raw secrets
// into chat reports — describe by name/length/format only.

'use strict';

function log(tag, msg) {
    send('[' + tag + '] ' + msg);
}

function shortStr(s) {
    if (s === null || s === undefined) return '<null>';
    try {
        const str = s.toString();
        return str.length + ' chars: ' + str.slice(0, 120) + (str.length > 120 ? '...' : '');
    } catch (e) { return '<unprintable ' + typeof s + '>'; }
}

Java.perform(function () {
    log('BOOT', 'hooks loaded, pid=' + Process.id + ' pkg=' + Java.use('android.app.ActivityThread').currentApplication().getApplicationContext().getPackageName());

    // ---- (e) enumerate loaded com.axis.net classes ----
    try {
        Java.enumerateLoadedClasses({
            onMatch: function (name) {
                if (name.indexOf('com.axis.net') === 0) log('CLASS', name);
            },
            onComplete: function () { log('CLASS', '--- enumerate done ---'); }
        });
    } catch (e) { log('ERR', 'enumerateLoadedClasses: ' + e); }

    // ---- (a) com.axis.net.config.Signature getters (native, return ciphertext blobs) ----
    try {
        const Sig = Java.use('com.axis.net.config.Signature');
        const sigMethods = ['apiKey', 'keyTempest', 'keyTempestCapital', 'keyTempestMarket', 'keyTempestMarketCapital', 'keyTempestGuardian'];
        sigMethods.forEach(function (m) {
            try {
                const impl = Sig[m];
                if (!impl) { log('SIG', m + ': NOT FOUND on class'); return; }
                impl.implementation = function () {
                    const ret = impl.call(this);
                    log('SIG', m + '() -> ' + shortStr(ret));
                    return ret;
                };
                log('SIG', 'hooked ' + m);
            } catch (e) { log('ERR', 'Signature.' + m + ': ' + e); }
        });
    } catch (e) { log('ERR', 'Signature class not loadable (yet): ' + e); }

    // ---- (b) AxisnetHelpers: getStringDecrypt + getPos* + salt/secret ----
    try {
        const H = Java.use('com.axis.net.helper.AxisnetHelpers');
        const names = ['getStringDecrypt', 'getPos1', 'getPos2', 'getPos3', 'getPos4',
            'getPos5', 'getPos6', 'getPos7', 'getPos9', 'getPos10', 'getPos11', 'getPos12',
            'getSaltKey', 'getMsisdnSaltKey', 'getSecretKey', 'getPassword', 'getOtpCode'];
        names.forEach(function (m) {
            try {
                const overloads = H[m].overloads;
                overloads.forEach(function (ov) {
                    ov.implementation = function () {
                        const args = [];
                        for (let i = 0; i < arguments.length; i++) args.push(shortStr(arguments[i]));
                        let ret;
                        try { ret = ov.apply(this, arguments); }
                        catch (e) { log('HELP', m + '(' + args.join(', ') + ') THREW ' + e); throw e; }
                        log('HELP', m + '(' + args.join(', ') + ') -> ' + shortStr(ret));
                        return ret;
                    };
                });
                log('HELP', 'hooked ' + m + ' (' + overloads.length + ' overloads)');
            } catch (e) { log('ERR', 'AxisnetHelpers.' + m + ': ' + e); }
        });
    } catch (e) { log('ERR', 'AxisnetHelpers class not loadable (yet): ' + e); }

    // ---- RequestInterceptor: hook okhttp3.Interceptor implementations generically ----
    try {
        const Interceptor = Java.use('okhttp3.Interceptor');
        log('OKHTTP', 'okhttp3.Interceptor present');
    } catch (e) { log('OKHTTP', 'okhttp3.Interceptor NOT in classpath: ' + e); }

    // ---- (c) OkHttp: hook RealCall.execute / enqueue via OkHttpClient.newCall ----
    try {
        const RealCall = Java.use('okhttp3.internal.connection.RealCall');
        RealCall.execute.implementation = function () {
            const req = this.request();
            dumpRequest('RealCall.execute', req);
            const resp = this.execute.call(this);
            dumpResponse('RealCall.execute', resp);
            return resp;
        };
        log('OKHTTP', 'hooked RealCall.execute');
    } catch (e) { log('OKHTTP', 'RealCall hook failed: ' + e); }
    try {
        const Call = Java.use('okhttp3.Call');
        log('OKHTTP', 'okhttp3.Call present');
    } catch (e) { log('OKHTTP', 'okhttp3.Call NOT present: ' + e); }

    // Fallback: hook okhttp3.Request$Builder.build() to see URL+headers at build time.
    try {
        const RB = Java.use('okhttp3.Request$Builder');
        RB.build.implementation = function () {
            const req = this.build.call(this);
            dumpRequest('Request.build', req);
            return req;
        };
        log('OKHTTP', 'hooked Request$Builder.build');
    } catch (e) { log('OKHTTP', 'Request$Builder hook failed: ' + e); }

    // ---- (d) JCA safety net: Mac (HMAC) + Cipher (AES) + MessageDigest ----
    try {
        const Mac = Java.use('javax.crypto.Mac');
        Mac.init.overload('java.security.Key', 'java.security.spec.AlgorithmParameterSpec').implementation = function (k, p) {
            log('JCA', 'Mac.init alg=' + this.getAlgorithm() + ' key=' + shortStr(keyBytes(k)));
            return this.init.call(this, k, p);
        };
        Mac.init.overload('java.security.Key').implementation = function (k) {
            log('JCA', 'Mac.init alg=' + this.getAlgorithm() + ' key=' + shortStr(keyBytes(k)));
            return this.init.call(this, k);
        };
        Mac.doFinal.overload('[B').implementation = function (data) {
            const out = this.doFinal.call(this, data);
            log('JCA', 'Mac.doFinal alg=' + this.getAlgorithm() + ' input=' + bytesInfo(data) + ' out=' + bytesInfo(out));
            return out;
        };
        Mac.update.overload('[B').implementation = function (data) {
            log('JCA', 'Mac.update alg=' + this.getAlgorithm() + ' data=' + bytesInfo(data));
            return this.update.call(this, data);
        };
        log('JCA', 'hooked Mac');
    } catch (e) { log('ERR', 'Mac hook failed: ' + e); }

    try {
        const Cipher = Java.use('javax.crypto.Cipher');
        Cipher.doFinal.overload('[B').implementation = function (data) {
            let out;
            try { out = this.doFinal.call(this, data); }
            catch (e) { log('JCA', 'Cipher.doFinal alg=' + this.getAlgorithm() + ' THREW ' + e); throw e; }
            log('JCA', 'Cipher.doFinal alg=' + this.getAlgorithm() + ' mode=' + this.getMode() + ' in=' + bytesInfo(data) + ' out=' + bytesInfo(out));
            return out;
        };
        log('JCA', 'hooked Cipher.doFinal');
    } catch (e) { log('ERR', 'Cipher hook failed: ' + e); }

    // ---- native lib loads (V-Key loader visibility) ----
    try {
        const System = Java.use('java.lang.System');
        System.loadLibrary.implementation = function (name) {
            log('NATIVE', 'loadLibrary(' + name + ')');
            return this.loadLibrary.call(this, name);
        };
        const Runtime = Java.use('java.lang.Runtime');
        Runtime.loadLibrary.overload('java.lang.String').implementation = function (name) {
            log('NATIVE', 'Runtime.loadLibrary(' + name + ')');
            return this.loadLibrary.call(this, name);
        };
        log('NATIVE', 'hooked loadLibrary');
    } catch (e) { log('ERR', 'loadLibrary hook failed: ' + e); }

    function dumpRequest(where, req) {
        try {
            const url = req.url().toString();
            const method = req.method();
            const headers = req.headers();
            let hs = '';
            for (let i = 0; i < headers.size(); i++) {
                hs += headers.name(i) + '=' + headers.value(i) + '; ';
            }
            log('HTTP', where + ' ' + method + ' ' + url + ' | headers: ' + hs);
            try {
                const body = req.body();
                if (body !== null) {
                    const Buffer = Java.use('okio.Buffer');
                    const buf = Buffer.$new();
                    body.writeTo(buf);
                    const s = buf.readUtf8();
                    log('HTTP', where + ' body(' + s.length + '): ' + s.slice(0, 2000));
                }
            } catch (e) { log('HTTP', where + ' body unreadable: ' + e); }
        } catch (e) { log('ERR', 'dumpRequest: ' + e); }
    }

    function dumpResponse(where, resp) {
        try {
            log('HTTP', where + ' <- ' + resp.code() + ' ' + resp.request().url().toString());
        } catch (e) { log('ERR', 'dumpResponse: ' + e); }
    }

    function bytesInfo(b) {
        if (b === null || b === undefined) return '<null>';
        try {
            const len = b.length;
            let s = '';
            const n = Math.min(len, 64);
            for (let i = 0; i < n; i++) {
                const c = b[i] & 0xff;
                s += (c >= 32 && c < 127) ? String.fromCharCode(c) : '.';
            }
            return len + ' bytes: [' + s + ']' + (len > 64 ? '...' : '');
        } catch (e) { return '<bytes?>'; }
    }

    function keyBytes(k) {
        try {
            const enc = k.getEncoded();
            if (enc === null) return '<no encoded form>';
            return enc;
        } catch (e) { return '<key?>'; }
    }
});
