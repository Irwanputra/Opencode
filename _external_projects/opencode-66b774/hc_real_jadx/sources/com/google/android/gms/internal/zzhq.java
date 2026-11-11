package com.google.android.gms.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class zzhq {
    private static MessageDigest zzbaa;
    public Object mLock = new Object();

    public final MessageDigest zzhd() {
        synchronized (this.mLock) {
            MessageDigest messageDigest = zzbaa;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    zzbaa = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return zzbaa;
        }
    }

    public abstract byte[] zzy(String str);
}
