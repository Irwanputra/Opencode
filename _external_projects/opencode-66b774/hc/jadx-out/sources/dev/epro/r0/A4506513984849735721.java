package dev.epro.r0;

import net.zetetic.database.R;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A4506513984849735721 implements J12078565427869724451 {
    public final /* synthetic */ T15443218846549482730 a;
    public final /* synthetic */ boolean b;

    public A4506513984849735721(T15443218846549482730 t15443218846549482730, boolean z) {
        this.a = t15443218846549482730;
        this.b = z;
    }

    @Override // dev.epro.r0.J12078565427869724451
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String strH;
        M3727281027331139839 m3727281027331139839 = (M3727281027331139839) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if (m3727281027331139839.R(iIntValue & 1, (iIntValue & 17) != 16)) {
            this.a.invoke(m3727281027331139839, 0);
            float f = E14826043354371714545.e;
            V10993962107938880611 v10993962107938880611 = V10993962107938880611.a;
            M17147082063200071302.c(m3727281027331139839, V16747615581620678882.k(v10993962107938880611, f));
            Z7022156542152740569 z7022156542152740569P = O5354877807466160604.P();
            boolean z = this.b;
            if (z) {
                m3727281027331139839.a0(1509384391);
                strH = H4776669175763245653.h(R.string.m3c_date_picker_switch_to_day_selection, m3727281027331139839);
                m3727281027331139839.q(false);
            } else {
                m3727281027331139839.a0(1509478662);
                strH = H4776669175763245653.h(R.string.m3c_date_picker_switch_to_year_selection, m3727281027331139839);
                m3727281027331139839.q(false);
            }
            E7602387177581033328.a(z7022156542152740569P, strH, V3311072669930093336.q(v10993962107938880611, z ? 180.0f : 0.0f), 0L, m3727281027331139839, 0, 8);
        } else {
            m3727281027331139839.U();
        }
        return O9245300239821758723.a;
    }
}
