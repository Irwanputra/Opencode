package dev.epro.r0;

import android.graphics.Path;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final /* synthetic */ class G3380524581901889884 implements F4096073349764486348 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ G3380524581901889884(int i, int i2, P1576149285030538153 p1576149285030538153, byte b) {
        this.a = b;
        this.b = i;
        this.c = i2;
        this.d = p1576149285030538153;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        byte b = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        int i = this.c;
        int i2 = this.b;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                P1576149285030538153 p1576149285030538153 = (P1576149285030538153) obj2;
                F13711604687869105489 f13711604687869105489 = (F13711604687869105489) obj;
                long g = p1576149285030538153.g(T1335862270807194835.d(0, f13711604687869105489.b.length()));
                int g2 = F12478849263529740365.g(g);
                int f = F12478849263529740365.f(g);
                if (i2 < g2) {
                    i2 = g2;
                }
                if (i2 <= f) {
                    f = i2;
                }
                int g3 = F12478849263529740365.g(g);
                int f2 = F12478849263529740365.f(g);
                if (i < g3) {
                    i = g3;
                }
                if (i <= f2) {
                    f2 = i;
                }
                f13711604687869105489.g(p1576149285030538153.f(T1335862270807194835.d(f, f2)));
                break;
            case 1:
                P1576149285030538153 p15761492850305381532 = (P1576149285030538153) obj2;
                F13711604687869105489 f137116046878691054892 = (F13711604687869105489) obj;
                if (i2 < 0 || i < 0) {
                    Y16081827717826519461.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i2 + " and " + i + " respectively.");
                }
                long g4 = p15761492850305381532.g(f137116046878691054892.f);
                int f3 = F12478849263529740365.f(g4);
                int i3 = f3 + i;
                if (((f3 ^ i3) & (i ^ i3)) < 0) {
                    i3 = p15761492850305381532.e();
                }
                long f4 = p15761492850305381532.f(T1335862270807194835.d(F12478849263529740365.f(g4), Math.min(i3, p15761492850305381532.e())));
                D15445857918358799638.M(f137116046878691054892, F12478849263529740365.g(f4), F12478849263529740365.f(f4));
                int g5 = F12478849263529740365.g(g4);
                int i4 = g5 - i2;
                if (((g5 ^ i4) & (i2 ^ g5)) < 0) {
                    i4 = 0;
                }
                long f5 = p15761492850305381532.f(T1335862270807194835.d(Math.max(0, i4), F12478849263529740365.g(g4)));
                D15445857918358799638.M(f137116046878691054892, F12478849263529740365.g(f5), F12478849263529740365.f(f5));
                break;
            case 2:
                P1576149285030538153 p15761492850305381533 = (P1576149285030538153) obj2;
                F13711604687869105489 f137116046878691054893 = (F13711604687869105489) obj;
                F12478849263529740365 f12478849263529740365 = f137116046878691054893.g;
                C8612968177090877106 c8612968177090877106 = f137116046878691054893.b;
                if (f12478849263529740365 != null) {
                    f137116046878691054893.f(null);
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i < 0) {
                    i = 0;
                }
                long f6 = p15761492850305381533.f(T1335862270807194835.d(i2, i));
                int q = W7808703833045379622.q(F12478849263529740365.g(f6), 0, c8612968177090877106.length());
                int q2 = W7808703833045379622.q(F12478849263529740365.f(f6), 0, c8612968177090877106.length());
                if (q != q2) {
                    if (q >= q2) {
                        f137116046878691054893.e(q2, q, null);
                        break;
                    } else {
                        f137116046878691054893.e(q, q2, null);
                        break;
                    }
                }
                break;
            default:
                B1061516154492673368 b1061516154492673368 = (B1061516154492673368) obj2;
                Z2489793023059154243 z2489793023059154243 = (Z2489793023059154243) obj;
                R8360857824092671497 r8360857824092671497 = z2489793023059154243.a;
                int d = z2489793023059154243.d(i2);
                int d2 = z2489793023059154243.d(i);
                CharSequence charSequence = r8360857824092671497.e;
                if (d < 0 || d > d2 || d2 > charSequence.length()) {
                    int length = charSequence.length();
                    StringBuilder p = E12098517352909843120.p(d, d2, "start(", ") or end(", ") is out of range [0..");
                    p.append(length);
                    p.append("], or start > end!");
                    T12055643479535528558.a(p.toString());
                }
                Path path = new Path();
                I18150855591218230259 i18150855591218230259 = r8360857824092671497.d;
                i18150855591218230259.f.getSelectionPath(d, d2, path);
                int i5 = i18150855591218230259.h;
                if (i5 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i5);
                }
                B1061516154492673368 b10615161544926733682 = new B1061516154492673368(path);
                float f7 = z2489793023059154243.f;
                b10615161544926733682.i((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L));
                B1061516154492673368.a(b1061516154492673368, b10615161544926733682);
                break;
        }
        return o9245300239821758723;
    }

    public /* synthetic */ G3380524581901889884(Object obj, int i, int i2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.c = i2;
    }
}
