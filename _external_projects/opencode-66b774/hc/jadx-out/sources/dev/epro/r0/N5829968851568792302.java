package dev.epro.r0;

import ads_mobile_sdk.au0;
import ads_mobile_sdk.ax;
import ads_mobile_sdk.j;
import ads_mobile_sdk.jb1;
import ads_mobile_sdk.ob1;
import ads_mobile_sdk.yw;
import java.util.ArrayList;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class N5829968851568792302 extends au0 {
    public final void c(ArrayList arrayList) {
        b();
        ax axVar = (ax) this.b;
        RandomAccess randomAccess = axVar.allowedApis_;
        if (!((j) randomAccess).a) {
            jb1 jb1Var = (jb1) randomAccess;
            axVar.allowedApis_ = jb1Var.a(jb1Var.c * 2);
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((jb1) axVar.allowedApis_).b(((yw) obj).getNumber());
        }
    }

    public final ob1 d() {
        ax axVar = (ax) this.b;
        axVar.getClass();
        return new ob1(axVar.allowedApis_, ax.allowedApis_converter_);
    }
}
