package com.google.android.gms.internal;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import org.jasypt.digest.StandardStringDigester;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzhz extends zzhq {
    private MessageDigest zzbah;
    private final int zzbak;
    private final int zzbal;

    public zzhz(int i) {
        int i2 = i / 8;
        this.zzbak = i % 8 > 0 ? i2 + 1 : i2;
        this.zzbal = i;
    }

    @Override // com.google.android.gms.internal.zzhq
    public final byte[] zzy(String str) {
        synchronized (this.mLock) {
            MessageDigest zzhd = zzhd();
            this.zzbah = zzhd;
            if (zzhd == null) {
                return new byte[0];
            }
            zzhd.reset();
            this.zzbah.update(str.getBytes(Charset.forName(StandardStringDigester.MESSAGE_CHARSET)));
            byte[] digest = this.zzbah.digest();
            int length = digest.length;
            int i = this.zzbak;
            if (length <= i) {
                i = digest.length;
            }
            byte[] bArr = new byte[i];
            System.arraycopy(digest, 0, bArr, 0, i);
            if (this.zzbal % 8 > 0) {
                long j = 0;
                for (int i2 = 0; i2 < i; i2++) {
                    if (i2 > 0) {
                        j <<= 8;
                    }
                    j += bArr[i2] & 255;
                }
                long j2 = j >>> (8 - (this.zzbal % 8));
                for (int i3 = this.zzbak - 1; i3 >= 0; i3--) {
                    bArr[i3] = (byte) (255 & j2);
                    j2 >>>= 8;
                }
            }
            return bArr;
        }
    }
}
