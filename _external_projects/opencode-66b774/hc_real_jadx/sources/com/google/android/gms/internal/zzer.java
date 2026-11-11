package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jasypt.digest.StandardStringDigester;

/* loaded from: /tmp/opencode/hc_real.dex */
public class zzer {
    private static String TAG = "zzer";
    private final String className;
    private final zzdm zzagr;
    private final String zzaku;
    private final Class<?>[] zzakx;
    private final int zzakv = 2;
    private volatile Method zzakw = null;
    private CountDownLatch zzaky = new CountDownLatch(1);

    public zzer(zzdm zzdmVar, String str, String str2, Class<?>... clsArr) {
        this.zzagr = zzdmVar;
        this.className = str;
        this.zzaku = str2;
        this.zzakx = clsArr;
        zzdmVar.zzag().submit(new zzes(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbc() {
        try {
            try {
                Class loadClass = this.zzagr.zzah().loadClass(zzc(this.zzagr.zzaj(), this.className));
                if (loadClass != null) {
                    this.zzakw = loadClass.getMethod(zzc(this.zzagr.zzaj(), this.zzaku), this.zzakx);
                    Method method = this.zzakw;
                }
            } catch (zzcy | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
            }
        } finally {
            this.zzaky.countDown();
        }
    }

    private final String zzc(byte[] bArr, String str) {
        return new String(this.zzagr.zzai().zzb(bArr, str), StandardStringDigester.MESSAGE_CHARSET);
    }

    public final Method zzbd() {
        if (this.zzakw != null) {
            return this.zzakw;
        }
        try {
            if (this.zzaky.await(2L, TimeUnit.SECONDS)) {
                return this.zzakw;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
