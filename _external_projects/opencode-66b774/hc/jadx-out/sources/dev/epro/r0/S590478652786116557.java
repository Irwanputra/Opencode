package dev.epro.r0;

import ads_mobile_sdk.au0;
import ads_mobile_sdk.se2;
import ads_mobile_sdk.te2;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class S590478652786116557 extends au0 {
    public final void c(long j) {
        b();
        te2 te2Var = (te2) this.b;
        te2Var.bitField0_ |= 32;
        te2Var.timeInCacheMs_ = j;
    }

    public final void d(se2 se2Var) {
        b();
        te2 te2Var = (te2) this.b;
        te2Var.getClass();
        te2Var.cacheMissReason_ = se2Var.getNumber();
        te2Var.bitField0_ |= 4;
    }

    public final void e(boolean z) {
        b();
        te2 te2Var = (te2) this.b;
        te2Var.bitField0_ |= 1;
        te2Var.cacheHit_ = z;
    }

    public final void f(int i) {
        b();
        te2 te2Var = (te2) this.b;
        te2Var.bitField0_ |= 8;
        te2Var.numRequestedAds_ = i;
    }
}
