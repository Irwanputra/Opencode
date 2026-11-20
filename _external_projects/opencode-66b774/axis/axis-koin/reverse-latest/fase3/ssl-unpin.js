// Fase 3 — SSL unpinning for AXISnet 11.1.0 (compact, custom; no codeshare dependency).
// Hooks: OkHttp CertificatePinner + TrustManagerImpl + X509TrustManager +
// SSLContext init + HostnameVerifier. Use together with axisnet-hooks.js
// (frida -U -f com.axis.net -l ssl-unpin.js -l axisnet-hooks.js --no-pause).
// CA must be installed in the emulator (user CA via /data/misc/user/0/cacerts-added
// or system CA in /system/etc/security/cacerts) AND emulator proxy pointed at mitmproxy.

'use strict';

function log(tag, msg) { send('[' + tag + '] ' + msg); }

Java.perform(function () {
    log('UNPIN', 'ssl-unpin script loaded');

    // 1. OkHttp CertificatePinner.check(hostname, peerCertificates)
    try {
        const Pinner = Java.use('okhttp3.CertificatePinner');
        Pinner.check.overload('java.lang.String', 'java.util.List').implementation = function (host, certs) {
            log('UNPIN', 'CertificatePinner.check BYPASSED for ' + host);
            return;
        };
        Pinner.check.overload('java.lang.String', '[Ljava.security.cert.Certificate;').implementation = function (host, certs) {
            log('UNPIN', 'CertificatePinner.check(array) BYPASSED for ' + host);
            return;
        };
        log('UNPIN', 'hooked CertificatePinner');
    } catch (e) { log('UNPIN', 'CertificatePinner not present: ' + e); }

    // 2. TrustManagerImpl.verifyChain / checkTrustedRecursive (Android)
    try {
        const TMI = Java.use('com.android.org.conscrypt.TrustManagerImpl');
        try {
            TMI.verifyChain.implementation = function () {
                log('UNPIN', 'TrustManagerImpl.verifyChain BYPASSED');
                return Java.use('java.util.ArrayList').$new();
            };
        } catch (e) { log('UNPIN', 'verifyChain overload n/a: ' + e); }
        try {
            TMI.checkTrustedRecursive.implementation = function () {
                log('UNPIN', 'TrustManagerImpl.checkTrustedRecursive BYPASSED');
                return Java.use('java.util.ArrayList').$new();
            };
        } catch (e) { log('UNPIN', 'checkTrustedRecursive n/a: ' + e); }
        log('UNPIN', 'hooked TrustManagerImpl');
    } catch (e) { log('UNPIN', 'TrustManagerImpl not present: ' + e); }

    // 3. X509TrustManager.checkServerTrusted -> no-op (covers custom TrustManagers)
    try {
        const X509TM = Java.use('javax.net.ssl.X509TrustManager');
        // interface: can't hook directly; hook known impls instead via enumerateLoadedClasses
        Java.enumerateLoadedClasses({
            onMatch: function (name) {
                if (name.indexOf('com.axis.net') !== 0 && name.indexOf('okhttp3') !== 0) return;
                try {
                    const C = Java.use(name);
                    if (C.checkServerTrusted) {
                        C.checkServerTrusted.overloads.forEach(function (ov) {
                            ov.implementation = function () { log('UNPIN', 'checkServerTrusted BYPASSED in ' + name); return; };
                        });
                    }
                } catch (ignored) {}
            },
            onComplete: function () {}
        });
        log('UNPIN', 'scanned app/okhttp classes for checkServerTrusted');
    } catch (e) { log('UNPIN', 'X509 scan failed: ' + e); }

    // 4. SSLContext.init -> replace trust managers with a trusting one
    try {
        const SSLContext = Java.use('javax.net.ssl.SSLContext');
        const TrustManager = Java.use('javax.net.ssl.X509TrustManager');
        const TrustingTM = Java.registerClass({
            name: 'com.axis.fase3.TrustingTM',
            implements: [TrustManager],
            methods: {
                checkClientTrusted: function (chain, authType) {},
                checkServerTrusted: function (chain, authType) {},
                getAcceptedIssuers: function () { return []; }
            }
        });
        SSLContext.init.overload('[Ljavax.net.ssl.KeyManager;', '[Ljavax.net.ssl.TrustManager;', 'java.security.SecureRandom').implementation = function (km, tm, sr) {
            log('UNPIN', 'SSLContext.init intercepted, swapping TrustManager');
            return this.init.call(this, km, [TrustingTM.$new()], sr);
        };
        log('UNPIN', 'hooked SSLContext.init');
    } catch (e) { log('UNPIN', 'SSLContext hook failed: ' + e); }

    // 5. HostnameVerifier.verify -> always true
    try {
        const HV = Java.use('javax.net.ssl.HostnameVerifier');
        log('UNPIN', 'HostnameVerifier interface present (impls hooked via OkHttp below)');
    } catch (e) { log('UNPIN', 'HostnameVerifier n/a: ' + e); }
    try {
        const OkHostnameVerifier = Java.use('okhttp3.internal.tls.OkHostnameVerifier');
        OkHostnameVerifier.verify.overload('java.lang.String', 'javax.net.ssl.SSLSession').implementation = function (h, s) {
            log('UNPIN', 'OkHostnameVerifier.verify BYPASSED for ' + h);
            return true;
        };
        log('UNPIN', 'hooked OkHostnameVerifier');
    } catch (e) { log('UNPIN', 'OkHostnameVerifier n/a (okhttp version differs): ' + e); }
});
