package com.google.android.libraries.ads.mobile.sdk.internal.util;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class AndroidBundleTypeAdapterFactory implements dev.epro.r0.V4446577237959483780 {
    public final dev.epro.r0.K10678596132709730734 a(dev.epro.r0.F14240031463097426304 f14240031463097426304, dev.epro.r0.K11898134656129953686 k11898134656129953686) {
        f14240031463097426304.getClass();
        k11898134656129953686.getClass();
        if (android.os.Bundle.class.isAssignableFrom(k11898134656129953686.a)) {
            return new com.google.android.libraries.ads.mobile.sdk.internal.util.BundleTypeAdapter(f14240031463097426304);
        }
        return null;
    }
}
