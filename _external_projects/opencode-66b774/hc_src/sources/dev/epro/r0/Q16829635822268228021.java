package dev.epro.r0;

import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final /* synthetic */ class Q16829635822268228021 implements F4096073349764486348 {
    public final /* synthetic */ String a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ Q16829635822268228021(String str, List list, int i, boolean z) {
        this.a = str;
        this.b = list;
        this.c = i;
        this.d = z;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        F13711604687869105489 f13711604687869105489 = (F13711604687869105489) obj;
        F12478849263529740365 f12478849263529740365 = f13711604687869105489.g;
        String str = this.a;
        List list = this.b;
        if (f12478849263529740365 != null) {
            long j = f12478849263529740365.a;
            int i = (int) (j >> 32);
            D15445857918358799638.N(f13711604687869105489, i, (int) (j & 4294967295L), str);
            if (str.length() > 0) {
                f13711604687869105489.e(i, str.length() + i, list);
            }
        } else {
            int g = F12478849263529740365.g(f13711604687869105489.f);
            D15445857918358799638.N(f13711604687869105489, g, F12478849263529740365.f(f13711604687869105489.f), str);
            if (str.length() > 0) {
                f13711604687869105489.e(g, str.length() + g, list);
            }
        }
        int g2 = F12478849263529740365.g(f13711604687869105489.f);
        int i2 = this.c;
        int length = i2 > 0 ? (g2 + i2) - 1 : (g2 + i2) - str.length();
        f13711604687869105489.d = this.d;
        int q = W7808703833045379622.q(length, 0, f13711604687869105489.b.length());
        f13711604687869105489.g(T1335862270807194835.d(q, q));
        return O9245300239821758723.a;
    }
}
