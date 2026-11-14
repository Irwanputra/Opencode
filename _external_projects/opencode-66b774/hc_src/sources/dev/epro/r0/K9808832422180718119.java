package dev.epro.r0;

import ads_mobile_sdk.au0;
import ads_mobile_sdk.j;
import ads_mobile_sdk.kv0;
import ads_mobile_sdk.wm1;
import java.util.ArrayList;
import java.util.RandomAccess;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class K9808832422180718119 extends au0 {
    public final void c(ArrayList arrayList) {
        RandomAccess randomAccess;
        U12378827310912896889 u12378827310912896889;
        b();
        kv0 kv0Var = (kv0) this.b;
        randomAccess = kv0Var.experimentId_;
        if (!((j) randomAccess).a) {
            wm1 wm1Var = (wm1) randomAccess;
            kv0Var.experimentId_ = wm1Var.a(wm1Var.c * 2);
        }
        u12378827310912896889 = kv0Var.experimentId_;
        au0.a(arrayList, u12378827310912896889);
    }
}
