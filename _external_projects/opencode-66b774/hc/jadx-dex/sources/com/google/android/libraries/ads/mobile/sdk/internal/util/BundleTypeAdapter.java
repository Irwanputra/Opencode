package com.google.android.libraries.ads.mobile.sdk.internal.util;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class BundleTypeAdapter extends dev.epro.r0.K10678596132709730734 {
    public final dev.epro.r0.F14240031463097426304 a;

    public BundleTypeAdapter(dev.epro.r0.F14240031463097426304 f14240031463097426304) {
        f14240031463097426304.getClass();
        this.a = f14240031463097426304;
    }

    public final java.lang.Object b(dev.epro.r0.D13396727227989475489 d13396727227989475489) {
        return new android.os.Bundle();
    }

    public final void c(dev.epro.r0.Y14132333989764804283 y14132333989764804283, java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (y14132333989764804283 == null) {
            return;
        }
        if (bundle == null) {
            y14132333989764804283.p();
            return;
        }
        y14132333989764804283.d();
        for (java.lang.String str : bundle.keySet()) {
            if (str != null) {
                y14132333989764804283.j(str);
                java.lang.Object obj2 = bundle.get(str);
                if (obj2 == null) {
                    y14132333989764804283.p();
                } else {
                    this.a.i(obj2, obj2.getClass(), y14132333989764804283);
                }
            }
        }
        y14132333989764804283.h();
    }
}
