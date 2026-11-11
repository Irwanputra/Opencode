package com.google.android.gms.internal;

import androidx.core.app.NotificationCompat;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdtz implements zzdpp {
    private final SecretKey zzlyi;

    public zzdtz(byte[] bArr) {
        this.zzlyi = new SecretKeySpec(bArr, "AES");
    }

    @Override // com.google.android.gms.internal.zzdpp
    public final byte[] zzd(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 12 + 16];
        byte[] zzgh = zzdvi.zzgh(12);
        System.arraycopy(zzgh, 0, bArr3, 0, 12);
        Cipher zzos = zzduu.zzlzp.zzos("AES/GCM/NoPadding");
        zzos.init(1, this.zzlyi, new GCMParameterSpec(NotificationCompat.FLAG_HIGH_PRIORITY, zzgh));
        zzos.updateAAD(bArr2);
        zzos.doFinal(bArr, 0, bArr.length, bArr3, 12);
        return bArr3;
    }
}
