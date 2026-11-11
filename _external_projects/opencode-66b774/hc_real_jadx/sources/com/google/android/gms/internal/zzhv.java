package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzhv extends zzhq {
    private MessageDigest zzbah;

    @Override // com.google.android.gms.internal.zzhq
    public final byte[] zzy(String str) {
        byte[] bArr;
        byte[] bArr2;
        String[] split = str.split(" ");
        int i = 4;
        if (split.length == 1) {
            int zzaa = zzhu.zzaa(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(zzaa);
            bArr2 = allocate.array();
        } else {
            if (split.length < 5) {
                bArr = new byte[split.length << 1];
                for (int i2 = 0; i2 < split.length; i2++) {
                    int zzaa2 = zzhu.zzaa(split[i2]);
                    int i3 = (zzaa2 >> 16) ^ (65535 & zzaa2);
                    byte[] bArr3 = {(byte) i3, (byte) (i3 >> 8)};
                    int i4 = i2 << 1;
                    bArr[i4] = bArr3[0];
                    bArr[i4 + 1] = bArr3[1];
                }
            } else {
                bArr = new byte[split.length];
                for (int i5 = 0; i5 < split.length; i5++) {
                    int zzaa3 = zzhu.zzaa(split[i5]);
                    bArr[i5] = (byte) ((zzaa3 >> 24) ^ (((zzaa3 & Base64.BASELENGTH) ^ ((zzaa3 >> 8) & Base64.BASELENGTH)) ^ ((zzaa3 >> 16) & Base64.BASELENGTH)));
                }
            }
            bArr2 = bArr;
        }
        this.zzbah = zzhd();
        synchronized (this.mLock) {
            MessageDigest messageDigest = this.zzbah;
            if (messageDigest == null) {
                return new byte[0];
            }
            messageDigest.reset();
            this.zzbah.update(bArr2);
            byte[] digest = this.zzbah.digest();
            if (digest.length <= 4) {
                i = digest.length;
            }
            byte[] bArr4 = new byte[i];
            System.arraycopy(digest, 0, bArr4, 0, i);
            return bArr4;
        }
    }
}
