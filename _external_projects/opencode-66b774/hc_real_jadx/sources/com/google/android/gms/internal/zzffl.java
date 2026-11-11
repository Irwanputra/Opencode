package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzffl {
    private static Class<?> zzpgd = zzcwy();

    private static Class<?> zzcwy() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static zzffm zzcwz() {
        if (zzpgd != null) {
            try {
                return zztu("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return zzffm.zzpgg;
    }

    private static final zzffm zztu(String str) {
        return (zzffm) zzpgd.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }
}
