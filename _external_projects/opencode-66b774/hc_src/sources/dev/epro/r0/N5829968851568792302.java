package dev.epro.r0;

import ads_mobile_sdk.au0;
import ads_mobile_sdk.ax;
import ads_mobile_sdk.j;
import ads_mobile_sdk.jb1;
import ads_mobile_sdk.ob1;
import ads_mobile_sdk.yw;
import java.util.ArrayList;
import java.util.RandomAccess;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class N5829968851568792302 extends au0 {
    public final void c(ArrayList arrayList) {
        RandomAccess randomAccess;
        R17185427375111049466 r17185427375111049466;
        b();
        ax axVar = (ax) this.b;
        randomAccess = axVar.allowedApis_;
        if (!((j) randomAccess).a) {
            jb1 jb1Var = (jb1) randomAccess;
            axVar.allowedApis_ = jb1Var.a(jb1Var.c * 2);
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            r17185427375111049466 = axVar.allowedApis_;
            ((jb1) r17185427375111049466).b(((yw) obj).getNumber());
        }
    }

    public final ob1 d() {
        R17185427375111049466 r17185427375111049466;
        B4259731004323267459 b4259731004323267459;
        ax axVar = (ax) this.b;
        axVar.getClass();
        r17185427375111049466 = axVar.allowedApis_;
        b4259731004323267459 = ax.allowedApis_converter_;
        return new ob1(r17185427375111049466, b4259731004323267459);
    }
}
