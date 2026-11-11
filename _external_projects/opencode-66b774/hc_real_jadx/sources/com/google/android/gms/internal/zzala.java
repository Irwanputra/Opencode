package com.google.android.gms.internal;

import java.util.concurrent.Executor;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzala {
    public static final Executor zzdfe;
    public static final Executor zzdff;
    private static zzakz zzdfg;
    private static zzakz zzdfh;

    static {
        zzalb zzalbVar = new zzalb();
        zzdfe = zzalbVar;
        zzalc zzalcVar = new zzalc();
        zzdff = zzalcVar;
        zzdfg = zza(zzalbVar);
        zzdfh = zza(zzalcVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.zzakz, com.google.android.gms.internal.zzald] */
    private static zzakz zza(Executor executor) {
        return new zzald(executor, null);
    }
}
