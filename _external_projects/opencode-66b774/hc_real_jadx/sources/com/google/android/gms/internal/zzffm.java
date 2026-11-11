package com.google.android.gms.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /tmp/opencode/hc_real.dex */
public class zzffm {
    private static volatile boolean zzpge;
    private static final Class<?> zzpgf = zzcxa();
    public static final zzffm zzpgg = new zzffm(true);
    private final Map<Object, Object> zzpgh;

    public zzffm() {
        this.zzpgh = new HashMap();
    }

    private zzffm(boolean z) {
        this.zzpgh = Collections.emptyMap();
    }

    private static Class<?> zzcxa() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static zzffm zzcxb() {
        return zzffl.zzcwz();
    }
}
