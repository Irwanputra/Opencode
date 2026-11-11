package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzfex {
    private final byte[] buffer;
    private final zzffg zzpfl;

    private zzfex(int i) {
        byte[] bArr = new byte[i];
        this.buffer = bArr;
        this.zzpfl = zzffg.zzbc(bArr);
    }

    public /* synthetic */ zzfex(int i, zzfet zzfetVar) {
        this(i);
    }

    public final zzfes zzcvr() {
        this.zzpfl.zzcwt();
        return new zzfez(this.buffer);
    }

    public final zzffg zzcvs() {
        return this.zzpfl;
    }
}
