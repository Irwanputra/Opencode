package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A4506513984849735721 implements dev.epro.r0.J12078565427869724451 {
    public final /* synthetic */ dev.epro.r0.T15443218846549482730 a;
    public final /* synthetic */ boolean b;

    public A4506513984849735721(dev.epro.r0.T15443218846549482730 t15443218846549482730, boolean z) {
        this.a = t15443218846549482730;
        this.b = z;
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String strH;
        dev.epro.r0.M3727281027331139839 m3727281027331139839 = (dev.epro.r0.M3727281027331139839) obj2;
        int iIntValue = ((java.lang.Number) obj3).intValue();
        if (m3727281027331139839.R(iIntValue & 1, (iIntValue & 17) != 16)) {
            this.a.invoke(m3727281027331139839, 0);
            float f = dev.epro.r0.E14826043354371714545.e;
            dev.epro.r0.V10993962107938880611 v10993962107938880611 = dev.epro.r0.V10993962107938880611.a;
            dev.epro.r0.M17147082063200071302.c(m3727281027331139839, dev.epro.r0.V16747615581620678882.k(v10993962107938880611, f));
            dev.epro.r0.Z7022156542152740569 z7022156542152740569P = dev.epro.r0.O5354877807466160604.P();
            boolean z = this.b;
            if (z) {
                m3727281027331139839.a0(1509384391);
                strH = dev.epro.r0.H4776669175763245653.h(2131821395, m3727281027331139839);
                m3727281027331139839.q(false);
            } else {
                m3727281027331139839.a0(1509478662);
                strH = dev.epro.r0.H4776669175763245653.h(2131821399, m3727281027331139839);
                m3727281027331139839.q(false);
            }
            dev.epro.r0.E7602387177581033328.a(z7022156542152740569P, strH, dev.epro.r0.V3311072669930093336.q(v10993962107938880611, z ? 180.0f : 0.0f), 0L, m3727281027331139839, 0, 8);
        } else {
            m3727281027331139839.U();
        }
        return dev.epro.r0.O9245300239821758723.a;
    }
}
