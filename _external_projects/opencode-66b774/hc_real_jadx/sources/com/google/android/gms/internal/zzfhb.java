package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzfhb {
    private static final zzfgz zzpis = zzcyu();
    private static final zzfgz zzpit = new zzfha();

    public static zzfgz zzcys() {
        return zzpis;
    }

    public static zzfgz zzcyt() {
        return zzpit;
    }

    private static zzfgz zzcyu() {
        try {
            return (zzfgz) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
