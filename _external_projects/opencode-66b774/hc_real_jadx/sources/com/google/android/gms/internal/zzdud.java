package com.google.android.gms.internal;

import java.nio.ByteBuffer;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdud extends zzdue {
    private zzdud(byte[] bArr) {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.zzdub
    public final zzduf zzaj(byte[] bArr) {
        return new zzduf(this, bArr, 1);
    }

    @Override // com.google.android.gms.internal.zzdub
    public final int zzbqi() {
        return 12;
    }

    @Override // com.google.android.gms.internal.zzdub
    public final int[] zzd(byte[] bArr, int i) {
        int[] iArr = new int[16];
        zzdue.zzh(iArr);
        zzdue.zza(iArr, this.zzlyl.getBytes());
        iArr[12] = i;
        System.arraycopy(zzdub.zza(ByteBuffer.wrap(bArr)), 0, iArr, 13, 3);
        return iArr;
    }

    @Override // com.google.android.gms.internal.zzdub
    public final void zzg(int[] iArr) {
        iArr[12] = iArr[12] + 1;
    }
}
