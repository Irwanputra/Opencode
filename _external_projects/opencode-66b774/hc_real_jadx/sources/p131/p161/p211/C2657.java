package p131.p161.p211;

import p131.p161.p211.p213.C2534;
import p131.p161.p211.p213.C2535;
import p131.p161.p211.p213.EnumC2533;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2657 extends AbstractC2658<Number> {
    public C2657(C2673 c2673) {
    }

    @Override // p131.p161.p211.AbstractC2658
    /* renamed from: 〺つふすそ */
    public void mo4533(C2534 c2534, Number number) {
        Number number2 = number;
        if (number2 == null) {
            c2534.mo4541();
        } else {
            C2673.m4642(number2.doubleValue());
            c2534.mo4554(number2);
        }
    }

    @Override // p131.p161.p211.AbstractC2658
    /* renamed from: げつ〴ぬぐ */
    public Number mo4534(C2535 c2535) {
        if (c2535.mo4559() != EnumC2533.NULL) {
            return Double.valueOf(c2535.mo4578());
        }
        c2535.mo4572();
        return null;
    }
}
