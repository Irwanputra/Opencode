package com.google.android.libraries.ads.mobile.sdk.internal.util;

import android.os.Bundle;
import dev.epro.r0.D13396727227989475489;
import dev.epro.r0.F14240031463097426304;
import dev.epro.r0.K10678596132709730734;
import dev.epro.r0.Y14132333989764804283;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class BundleTypeAdapter extends K10678596132709730734 {
    public final F14240031463097426304 a;

    public BundleTypeAdapter(F14240031463097426304 f14240031463097426304) {
        f14240031463097426304.getClass();
        this.a = f14240031463097426304;
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final Object b(D13396727227989475489 d13396727227989475489) {
        return new Bundle();
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final void c(Y14132333989764804283 y14132333989764804283, Object obj) {
        Bundle bundle = (Bundle) obj;
        if (y14132333989764804283 == null) {
            return;
        }
        if (bundle == null) {
            y14132333989764804283.p();
            return;
        }
        y14132333989764804283.d();
        for (String str : bundle.keySet()) {
            if (str != null) {
                y14132333989764804283.j(str);
                Object obj2 = bundle.get(str);
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
