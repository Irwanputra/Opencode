package com.google.android.gms.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzby implements Runnable {
    private zzby() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            MessageDigest unused = zzbw.zzyx = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused2) {
        } catch (Throwable th) {
            zzbw.zzza.countDown();
            throw th;
        }
        zzbw.zzza.countDown();
    }
}
