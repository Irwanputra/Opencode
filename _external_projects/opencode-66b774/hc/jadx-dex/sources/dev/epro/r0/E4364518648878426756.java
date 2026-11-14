package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final /* synthetic */ class E4364518648878426756 implements dev.epro.r0.G13792465322404021864 {
    public final /* synthetic */ dev.epro.r0.H17052510251737830620 a;
    public final /* synthetic */ dev.epro.r0.R14289894334981469490 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ dev.epro.r0.V4145611664959724223 d;
    public final /* synthetic */ dev.epro.r0.L13148442655056575112 e;

    public /* synthetic */ E4364518648878426756(dev.epro.r0.H17052510251737830620 h17052510251737830620, dev.epro.r0.R14289894334981469490 r14289894334981469490, boolean z, dev.epro.r0.U12915095113365621352 u12915095113365621352, dev.epro.r0.L13148442655056575112 l13148442655056575112) {
        this.a = h17052510251737830620;
        this.b = r14289894334981469490;
        this.c = z;
        this.d = u12915095113365621352;
        this.e = l13148442655056575112;
    }

    public final java.lang.Object i(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        java.lang.Object objPrevious;
        dev.epro.r0.X314302845361963991 x314302845361963991 = (dev.epro.r0.X314302845361963991) obj;
        dev.epro.r0.R14289894334981469490 r14289894334981469490 = (dev.epro.r0.R14289894334981469490) obj2;
        dev.epro.r0.M3727281027331139839 m3727281027331139839 = (dev.epro.r0.M3727281027331139839) obj3;
        ((java.lang.Integer) obj4).getClass();
        boolean zT = dev.epro.r0.S10823041268949770285.t(this.a.c.getValue(), this.b);
        if (!this.c && !zT) {
            java.util.List list = (java.util.List) this.e.getValue();
            java.util.ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                if (dev.epro.r0.S10823041268949770285.t(r14289894334981469490, (dev.epro.r0.R14289894334981469490) objPrevious)) {
                    break;
                }
            }
            r14289894334981469490 = (dev.epro.r0.R14289894334981469490) objPrevious;
        }
        if (r14289894334981469490 == null) {
            m3727281027331139839.a0(872360807);
            m3727281027331139839.q(false);
        } else {
            m3727281027331139839.a0(-1218785318);
            dev.epro.r0.D15445857918358799638.f(r14289894334981469490, this.d, dev.epro.r0.S10823041268949770285.T(-1138044367, new dev.epro.r0.B1246560328695757114(r14289894334981469490, x314302845361963991, (byte) 18), m3727281027331139839), m3727281027331139839, 384);
            m3727281027331139839.q(false);
        }
        return dev.epro.r0.O9245300239821758723.a;
    }
}
