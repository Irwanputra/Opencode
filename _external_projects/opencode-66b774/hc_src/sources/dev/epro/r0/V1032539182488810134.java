package dev.epro.r0;

import ads_mobile_sdk.ay0;
import ads_mobile_sdk.iy0;
import ads_mobile_sdk.tx0;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class V1032539182488810134 implements Y4798753258822141670 {
    @Override // dev.epro.r0.Y4798753258822141670
    public final Object a(tx0 tx0Var, Map map, R4833348786910499294 r4833348786910499294) {
        boolean contains = map.keySet().contains("start");
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        if (contains) {
            iy0 b = tx0Var.b();
            b.l.incrementAndGet();
            b.d();
            return o9245300239821758723;
        }
        if (map.keySet().contains("stop")) {
            iy0 b2 = tx0Var.b();
            b2.l.decrementAndGet();
            b2.d();
            return o9245300239821758723;
        }
        if (map.keySet().contains("cancel")) {
            iy0 b3 = tx0Var.b();
            b3.k.set(true);
            R7033599853981556291.E(b3.c, null, null, new ay0(b3, null, (byte) 0), 3);
            b3.d();
        }
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final int b() {
        return 8;
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final boolean c() {
        return true;
    }
}
