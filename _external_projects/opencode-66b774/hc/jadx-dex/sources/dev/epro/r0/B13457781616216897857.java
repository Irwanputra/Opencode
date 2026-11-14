package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B13457781616216897857 extends dev.epro.r0.P9893650590651797888 implements dev.epro.r0.J12078565427869724451 {
    public final /* synthetic */ java.lang.Object i;
    public final /* synthetic */ dev.epro.r0.R5670552972627103399 j;
    public final /* synthetic */ dev.epro.r0.O7205211285568135375 k;
    public final /* synthetic */ dev.epro.r0.T15443218846549482730 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B13457781616216897857(java.lang.Object obj, dev.epro.r0.R5670552972627103399 r5670552972627103399, dev.epro.r0.O7205211285568135375 o7205211285568135375, dev.epro.r0.T15443218846549482730 t15443218846549482730) {
        super(3);
        this.i = obj;
        this.j = r5670552972627103399;
        this.k = o7205211285568135375;
        this.l = t15443218846549482730;
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        dev.epro.r0.W15770782626803742669 w15770782626803742669 = (dev.epro.r0.N4285382858303960736) obj;
        dev.epro.r0.M3727281027331139839 m3727281027331139839 = (dev.epro.r0.M3727281027331139839) obj2;
        int iIntValue = ((java.lang.Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? m3727281027331139839.f(w15770782626803742669) : m3727281027331139839.h(w15770782626803742669) ? 4 : 2;
        }
        if (m3727281027331139839.R(iIntValue & 1, (iIntValue & 19) != 18)) {
            dev.epro.r0.R5670552972627103399 r5670552972627103399 = this.j;
            boolean zF = m3727281027331139839.f(r5670552972627103399);
            java.lang.Object obj4 = this.i;
            boolean zH = zF | m3727281027331139839.h(obj4);
            dev.epro.r0.O7205211285568135375 o7205211285568135375 = this.k;
            boolean zH2 = zH | m3727281027331139839.h(o7205211285568135375);
            java.lang.Object objM = m3727281027331139839.M();
            dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.O9023047933786425027.a;
            if (zH2 || objM == e17149812035295265804) {
                objM = new dev.epro.r0.L5797456297497726278(r5670552972627103399, obj4, o7205211285568135375, (byte) 2);
                m3727281027331139839.k0(objM);
            }
            dev.epro.r0.Q13169198992966610970.d(w15770782626803742669, obj4, (dev.epro.r0.F4096073349764486348) objM, m3727281027331139839);
            dev.epro.r0.A4559761392562572984 a4559761392562572984 = o7205211285568135375.d;
            w15770782626803742669.getClass();
            a4559761392562572984.n(obj4, w15770782626803742669.a);
            java.lang.Object objM2 = m3727281027331139839.M();
            if (objM2 == e17149812035295265804) {
                objM2 = new dev.epro.r0.X314302845361963991();
                m3727281027331139839.k0(objM2);
            }
            this.l.i((dev.epro.r0.X314302845361963991) objM2, obj4, m3727281027331139839, 0);
        } else {
            m3727281027331139839.U();
        }
        return dev.epro.r0.O9245300239821758723.a;
    }
}
