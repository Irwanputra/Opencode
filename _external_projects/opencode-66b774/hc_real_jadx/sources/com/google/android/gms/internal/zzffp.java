package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzffp {
    private static final zzffn<?> zzpgi = new zzffo();
    private static final zzffn<?> zzpgj = zzcxc();

    private static zzffn<?> zzcxc() {
        try {
            return (zzffn) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static zzffn<?> zzcxd() {
        return zzpgi;
    }

    public static zzffn<?> zzcxe() {
        zzffn<?> zzffnVar = zzpgj;
        if (zzffnVar != null) {
            return zzffnVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
