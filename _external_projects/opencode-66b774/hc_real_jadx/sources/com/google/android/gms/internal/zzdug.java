package com.google.android.gms.internal;

import java.nio.ByteBuffer;

/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class zzdug implements zzdpp {
    private final zzdub zzlym;

    private zzdug(zzdub zzdubVar) {
        this.zzlym = zzdubVar;
    }

    public static zzdug zzak(byte[] bArr) {
        return new zzdui(zzdub.zzai(bArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzgf(int i) {
        return (((i + 16) - 1) / 16) << 4;
    }

    public abstract byte[] zza(byte[] bArr, ByteBuffer byteBuffer);

    @Override // com.google.android.gms.internal.zzdpp
    public final byte[] zzd(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocate = ByteBuffer.allocate(this.zzlym.zzbqi() + bArr.length + 16);
        if (allocate.remaining() < this.zzlym.zzbqi() + bArr.length + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int position = allocate.position();
        this.zzlym.zza(allocate, bArr);
        allocate.position(position);
        byte[] bArr3 = new byte[this.zzlym.zzbqi()];
        allocate.get(bArr3);
        allocate.limit(allocate.limit() - 16);
        byte[] zzf = zzdvh.zzf(new zzduf(this.zzlym, bArr3, 0).zzge(32), zza(bArr2, allocate));
        allocate.limit(allocate.limit() + 16);
        allocate.put(zzf);
        return allocate.array();
    }
}
