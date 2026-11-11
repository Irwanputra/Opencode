package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdut implements zzdpp {
    private final zzdvf zzlzl;
    private final zzdqa zzlzm;
    private final int zzlzn;

    public zzdut(zzdvf zzdvfVar, zzdqa zzdqaVar, int i) {
        this.zzlzl = zzdvfVar;
        this.zzlzm = zzdqaVar;
        this.zzlzn = i;
    }

    @Override // com.google.android.gms.internal.zzdpp
    public final byte[] zzd(byte[] bArr, byte[] bArr2) {
        byte[] zzag = this.zzlzl.zzag(bArr);
        return zzdua.zzc(zzag, this.zzlzm.zzac(zzdua.zzc(bArr2, zzag, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }
}
