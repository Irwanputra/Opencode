package dev.epro.r0;

import ads_mobile_sdk.au0;
import ads_mobile_sdk.se2;
import ads_mobile_sdk.te2;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class S590478652786116557 extends au0 {
    public final void c(long j) {
        int i;
        b();
        te2 te2Var = (te2) this.b;
        i = te2Var.bitField0_;
        te2Var.bitField0_ = i | 32;
        te2Var.timeInCacheMs_ = j;
    }

    public final void d(se2 se2Var) {
        int i;
        b();
        te2 te2Var = (te2) this.b;
        te2Var.getClass();
        te2Var.cacheMissReason_ = se2Var.getNumber();
        i = te2Var.bitField0_;
        te2Var.bitField0_ = i | 4;
    }

    public final void e(boolean z) {
        int i;
        b();
        te2 te2Var = (te2) this.b;
        i = te2Var.bitField0_;
        te2Var.bitField0_ = i | 1;
        te2Var.cacheHit_ = z;
    }

    public final void f(int i) {
        int i2;
        b();
        te2 te2Var = (te2) this.b;
        i2 = te2Var.bitField0_;
        te2Var.bitField0_ = i2 | 8;
        te2Var.numRequestedAds_ = i;
    }
}
