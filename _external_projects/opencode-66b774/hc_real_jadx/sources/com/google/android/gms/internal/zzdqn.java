package com.google.android.gms.internal;

import java.nio.ByteBuffer;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdqn implements zzdpp {
    private static final byte[] zzltb = new byte[0];
    private final zzdtd zzltc;
    private final zzdpp zzltd;

    public zzdqn(zzdtd zzdtdVar, zzdpp zzdppVar) {
        this.zzltc = zzdtdVar;
        this.zzltd = zzdppVar;
    }

    @Override // com.google.android.gms.internal.zzdpp
    public final byte[] zzd(byte[] bArr, byte[] bArr2) {
        byte[] byteArray = zzdqe.zzb(this.zzltc).toByteArray();
        byte[] zzd = this.zzltd.zzd(byteArray, zzltb);
        byte[] zzd2 = ((zzdpp) zzdqe.zzf(this.zzltc.zzbon(), byteArray)).zzd(bArr, bArr2);
        return ByteBuffer.allocate(zzd.length + 4 + zzd2.length).putInt(zzd.length).put(zzd).put(zzd2).array();
    }
}
