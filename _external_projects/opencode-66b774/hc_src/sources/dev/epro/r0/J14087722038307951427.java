package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final /* synthetic */ class J14087722038307951427 implements B13729205492206812220 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ D2717688760023469083 b;

    public /* synthetic */ J14087722038307951427(D2717688760023469083 d2717688760023469083, byte b) {
        this.a = b;
        this.b = d2717688760023469083;
    }

    @Override // dev.epro.r0.B13729205492206812220
    public final Object invoke() {
        B1029012102904255937 q;
        S6349823729575121924 s6349823729575121924;
        byte b = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        D2717688760023469083 d2717688760023469083 = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                V697849047308847220 v697849047308847220 = d2717688760023469083.s;
                N1420218926656397722 n1420218926656397722 = d2717688760023469083.a;
                boolean d = F12478849263529740365.d(n1420218926656397722.d().d);
                if (((d && ((S5779100572589057142) v697849047308847220.getValue()) == S5779100572589057142.b) || (!d && ((S5779100572589057142) v697849047308847220.getValue()) == S5779100572589057142.c)) && d2717688760023469083.l() == null && ((Boolean) d2717688760023469083.k.getValue()).booleanValue() && (q = d2717688760023469083.q()) != null) {
                    S6349823729575121924 T = M18113111391818111737.T(q);
                    S6349823729575121924 a = E2166724654553415323.a(q.O(T.f()), T.e());
                    B1029012102904255937 q2 = d2717688760023469083.q();
                    if (q2 == null) {
                        Y16081827717826519461.d("textLayoutCoordinates should not be null.");
                        Z3383101362411723454.n();
                        break;
                    } else {
                        if (F12478849263529740365.d(n1420218926656397722.d().d)) {
                            S6349823729575121924 k = d2717688760023469083.k();
                            s6349823729575121924 = E2166724654553415323.a(q2.O(k.f()), k.e());
                        } else {
                            long O = q2.O(d2717688760023469083.o(true));
                            long O2 = q2.O(d2717688760023469083.o(false));
                            if (d2717688760023469083.b.c() == null) {
                                s6349823729575121924 = S6349823729575121924.e;
                            } else {
                                float intBitsToFloat = Float.intBitsToFloat((int) (q2.O((Float.floatToRawIntBits(r0.c((int) (r7 >> 32)).b) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32)) & 4294967295L));
                                float intBitsToFloat2 = Float.intBitsToFloat((int) (q2.O((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(r0.c((int) (r7 & 4294967295L)).b) & 4294967295L)) & 4294967295L));
                                int i = (int) (O >> 32);
                                int i2 = (int) (O2 >> 32);
                                float min = Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                                float max = Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                                if (min == max) {
                                    max += 1.0f;
                                }
                                s6349823729575121924 = new S6349823729575121924(min, Math.min(intBitsToFloat, intBitsToFloat2), max, Math.max(Float.intBitsToFloat((int) (O & 4294967295L)), Float.intBitsToFloat((int) (O2 & 4294967295L))));
                            }
                        }
                        if (s6349823729575121924.i(a)) {
                            break;
                        }
                    }
                }
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                d2717688760023469083.b();
                break;
            case 7:
                break;
            case 8:
                J9879469284241532070 j9879469284241532070 = d2717688760023469083.a.a;
                j9879469284241532070.b.a().m();
                F13711604687869105489 f13711604687869105489 = j9879469284241532070.b;
                E2166724654553415323.q(f13711604687869105489, 0, f13711604687869105489.b.length());
                j9879469284241532070.b(true, E1418573787900340271.a);
                j9879469284241532070.g(true);
                j9879469284241532070.f(j9879469284241532070.b.d);
                break;
            default:
                B13729205492206812220 b13729205492206812220 = d2717688760023469083.l;
                if (b13729205492206812220 != null) {
                    b13729205492206812220.invoke();
                    break;
                }
                break;
        }
        return o9245300239821758723;
    }
}
