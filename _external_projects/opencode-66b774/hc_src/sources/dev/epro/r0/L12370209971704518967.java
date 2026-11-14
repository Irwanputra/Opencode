package dev.epro.r0;

import net.zetetic.database.R;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L12370209971704518967 implements J12078565427869724451 {
    public static final L12370209971704518967 b = new L12370209971704518967(0);
    public static final L12370209971704518967 c = new L12370209971704518967(1);
    public static final L12370209971704518967 d = new L12370209971704518967(2);
    public static final L12370209971704518967 e = new L12370209971704518967(3);
    public final /* synthetic */ byte a;

    public /* synthetic */ L12370209971704518967(byte b2) {
        this.a = b2;
    }

    @Override // dev.epro.r0.J12078565427869724451
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b2 = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b2) {
            case 0:
                V3118049853945785650 v3118049853945785650 = (V3118049853945785650) obj;
                M3727281027331139839 m3727281027331139839 = (M3727281027331139839) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= m3727281027331139839.f(v3118049853945785650) ? 4 : 2;
                }
                if (!m3727281027331139839.R(intValue & 1, (intValue & 19) != 18)) {
                    m3727281027331139839.U();
                    break;
                } else {
                    E15826830759497041750.f(v3118049853945785650, null, null, 0L, 0L, 0L, 0L, 0L, m3727281027331139839, intValue & 14);
                    break;
                }
            case 1:
                M3727281027331139839 m37272810273311398392 = (M3727281027331139839) obj2;
                int intValue2 = ((Number) obj3).intValue();
                if (!m37272810273311398392.R(intValue2 & 1, (intValue2 & 17) != 16)) {
                    m37272810273311398392.U();
                    break;
                } else {
                    F2465500022857960993.b(H4776669175763245653.h(R.string.m3c_time_picker_pm, m37272810273311398392), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, m37272810273311398392, 0, 0, 262142);
                    break;
                }
            case 2:
                M3727281027331139839 m37272810273311398393 = (M3727281027331139839) obj2;
                int intValue3 = ((Number) obj3).intValue();
                if (!m37272810273311398393.R(intValue3 & 1, (intValue3 & 17) != 16)) {
                    m37272810273311398393.U();
                    break;
                } else {
                    F2465500022857960993.b(H4776669175763245653.h(R.string.m3c_time_picker_am, m37272810273311398393), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, m37272810273311398393, 0, 0, 262142);
                    break;
                }
        }
        return o9245300239821758723;
    }
}
