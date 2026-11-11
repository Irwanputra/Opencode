package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzduf {
    private zzdub zzlym;
    private int[] zzlyn;
    private int[] zzlyo;
    private int[] zzlyp = new int[16];
    private int zzlyq = 0;
    private boolean zzlyr;

    public zzduf(zzdub zzdubVar, byte[] bArr, int i) {
        this.zzlym = zzdubVar;
        int[] zzd = zzdubVar.zzd(bArr, i);
        this.zzlyn = zzd;
        this.zzlyo = zzdubVar.zze(zzd);
        this.zzlyr = false;
    }

    public final int[] zzbqj() {
        this.zzlyr = true;
        int[] iArr = this.zzlyo;
        int i = this.zzlyq;
        System.arraycopy(iArr, i, this.zzlyp, 0, 16 - i);
        this.zzlym.zzg(this.zzlyn);
        int[] zze = this.zzlym.zze(this.zzlyn);
        this.zzlyo = zze;
        int[] iArr2 = this.zzlyp;
        int i2 = this.zzlyq;
        System.arraycopy(zze, 0, iArr2, 16 - i2, i2);
        return this.zzlyp;
    }

    public final byte[] zzge(int i) {
        if (this.zzlyr) {
            throw new IllegalStateException("first can only be called once and before next().");
        }
        this.zzlyr = true;
        this.zzlyq = 8;
        ByteBuffer order = ByteBuffer.allocate(32).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(this.zzlyo, 0, 8);
        return order.array();
    }
}
