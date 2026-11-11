package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdui extends zzdug {
    private zzdui(zzdub zzdubVar) {
        super(zzdubVar);
    }

    @Override // com.google.android.gms.internal.zzdug
    public final byte[] zza(byte[] bArr, ByteBuffer byteBuffer) {
        int zzgf;
        int zzgf2;
        zzgf = zzdug.zzgf(bArr.length);
        int remaining = byteBuffer.remaining();
        zzgf2 = zzdug.zzgf(remaining);
        int i = zzgf2 + zzgf;
        ByteBuffer order = ByteBuffer.allocate(i + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(zzgf);
        order.put(byteBuffer);
        order.position(i);
        order.putLong(bArr.length);
        order.putLong(remaining);
        return order.array();
    }
}
