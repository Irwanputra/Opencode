package dev.epro.r0;

import ads_mobile_sdk.da3;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class N5587541019643124865 implements Callable {
    public final /* synthetic */ da3 a;
    public final /* synthetic */ int b;

    public /* synthetic */ N5587541019643124865(da3 da3Var, int i) {
        this.a = da3Var;
        this.b = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int iA = L11610354117192841236.A(this.b);
        da3 da3Var = this.a;
        if (iA == 1) {
            return (K17751841687800543607) da3Var.a.get();
        }
        if (iA == 2) {
            return (K17751841687800543607) da3Var.b.get();
        }
        if (iA == 3) {
            return (K17751841687800543607) da3Var.c.get();
        }
        if (iA == 4) {
            return (K17751841687800543607) da3Var.d.get();
        }
        K2042933864045806308.h();
        return null;
    }
}
