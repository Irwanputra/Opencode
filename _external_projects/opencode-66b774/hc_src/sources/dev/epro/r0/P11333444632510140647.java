package dev.epro.r0;

import java.util.Arrays;
import net.zetetic.database.R;
import o.bwmna.gdrqkg.izmyclvb;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class P11333444632510140647 implements G13792465322404021864 {
    public final /* synthetic */ P8646985343900033725 a;
    public final /* synthetic */ C10288805116980491173 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ F4096073349764486348 e;
    public final /* synthetic */ R14253319523827250490 f;
    public final /* synthetic */ I8721020176854850835 g;

    public P11333444632510140647(P8646985343900033725 p8646985343900033725, C10288805116980491173 c10288805116980491173, int i, int i2, F4096073349764486348 f4096073349764486348, R14253319523827250490 r14253319523827250490, I8721020176854850835 i8721020176854850835) {
        this.a = p8646985343900033725;
        this.b = c10288805116980491173;
        this.c = i;
        this.d = i2;
        this.e = f4096073349764486348;
        this.f = r14253319523827250490;
        this.g = i8721020176854850835;
    }

    @Override // dev.epro.r0.G13792465322404021864
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj2).intValue();
        M3727281027331139839 m3727281027331139839 = (M3727281027331139839) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 48) == 0) {
            intValue2 |= m3727281027331139839.d(intValue) ? 32 : 16;
        }
        final byte b = 1;
        if (m3727281027331139839.R(intValue2 & 1, (intValue2 & 145) != 144)) {
            final int i = intValue + this.a.a;
            String a = F17068667133831649611.a(i, this.b.a, 7);
            I1722681268793429505 h = V16747615581620678882.h(V10993962107938880611.a, E18444280280170001567.A, E18444280280170001567.z);
            boolean z = i == this.c;
            boolean z2 = i == this.d;
            final F4096073349764486348 f4096073349764486348 = this.e;
            boolean f = m3727281027331139839.f(f4096073349764486348) | m3727281027331139839.d(i);
            Object M = m3727281027331139839.M();
            if (f || M == O9023047933786425027.a) {
                M = new B13729205492206812220(f4096073349764486348, i, b) { // from class: dev.epro.r0.I9110172795330256004
                    public final /* synthetic */ byte a;
                    public final /* synthetic */ F4096073349764486348 b;
                    public final /* synthetic */ int c;

                    static {
                        izmyclvb.dpqpjfpoanwt1(1752);
                    }

                    private native void xbygznekpobp(F4096073349764486348 f40960733497644863482, int i2, byte b2);

                    @Override // dev.epro.r0.B13729205492206812220
                    public final native Object invoke();

                    {
                        this.a = b;
                        this.b = f4096073349764486348;
                        this.c = i;
                        xbygznekpobp(f4096073349764486348, i, b);
                    }
                };
                m3727281027331139839.k0(M);
            }
            Q12339807957388524498.m(a, h, z, z2, (B13729205492206812220) M, this.f.a(i), String.format(H4776669175763245653.h(R.string.m3c_date_picker_navigate_to_year_description, m3727281027331139839), Arrays.copyOf(new Object[]{a}, 1)), this.g, m3727281027331139839, 48);
        } else {
            m3727281027331139839.U();
        }
        return O9245300239821758723.a;
    }
}
