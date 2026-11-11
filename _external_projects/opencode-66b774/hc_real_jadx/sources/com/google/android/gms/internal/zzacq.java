package com.google.android.gms.internal;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Future;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzacq {
    private WeakHashMap<Context, zzacs> zzcuk = new WeakHashMap<>();

    public final Future<zzaco> zzo(Context context) {
        return zzahh.zza(zzahh.zzdar, new zzacr(this, context));
    }
}
