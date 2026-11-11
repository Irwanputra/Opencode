package com.google.android.gms.internal;

import androidx.core.app.NotificationCompat;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzfdb {
    private final byte[] zzpbi = new byte[NotificationCompat.FLAG_LOCAL_ONLY];
    private int zzpbj;
    private int zzpbk;

    public zzfdb(byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            this.zzpbi[i] = (byte) i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            byte[] bArr2 = this.zzpbi;
            i2 = (i2 + bArr2[i3] + bArr[i3 % bArr.length]) & Base64.BASELENGTH;
            byte b = bArr2[i3];
            bArr2[i3] = bArr2[i2];
            bArr2[i2] = b;
        }
        this.zzpbj = 0;
        this.zzpbk = 0;
    }

    public final void zzay(byte[] bArr) {
        int i = this.zzpbj;
        int i2 = this.zzpbk;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) & Base64.BASELENGTH;
            byte[] bArr2 = this.zzpbi;
            i2 = (i2 + bArr2[i]) & Base64.BASELENGTH;
            byte b = bArr2[i];
            bArr2[i] = bArr2[i2];
            bArr2[i2] = b;
            bArr[i3] = (byte) (bArr2[(bArr2[i] + bArr2[i2]) & Base64.BASELENGTH] ^ bArr[i3]);
        }
        this.zzpbj = i;
        this.zzpbk = i2;
    }
}
