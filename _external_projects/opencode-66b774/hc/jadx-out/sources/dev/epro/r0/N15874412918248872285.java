package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class N15874412918248872285 implements J12078565427869724451 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    public /* synthetic */ N15874412918248872285(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    @Override // dev.epro.r0.J12078565427869724451
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        String str = this.b;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                A1226367871988398046 a1226367871988398046 = (A1226367871988398046) obj;
                M3727281027331139839 m3727281027331139839 = (M3727281027331139839) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? m3727281027331139839.f(a1226367871988398046) : m3727281027331139839.h(a1226367871988398046) ? 4 : 2;
                }
                if (!m3727281027331139839.R(iIntValue & 1, (iIntValue & 19) != 18)) {
                    m3727281027331139839.U();
                } else {
                    Z3703597371693563980.a(a1226367871988398046, null, 0.0f, null, 0L, 0L, S10823041268949770285.T(1905952188, new R3941951701978557941(str, (byte) 1), m3727281027331139839), m3727281027331139839, (iIntValue & 14) | 805306368);
                }
                break;
            case 1:
                A1226367871988398046 a12263678719883980462 = (A1226367871988398046) obj;
                M3727281027331139839 m37272810273311398392 = (M3727281027331139839) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? m37272810273311398392.f(a12263678719883980462) : m37272810273311398392.h(a12263678719883980462) ? 4 : 2;
                }
                if (!m37272810273311398392.R(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    m37272810273311398392.U();
                } else {
                    Z3703597371693563980.a(a12263678719883980462, null, 0.0f, null, 0L, 0L, S10823041268949770285.T(-999924215, new R3941951701978557941(str, (byte) 2), m37272810273311398392), m37272810273311398392, (iIntValue2 & 14) | 805306368);
                }
                break;
            default:
                M3727281027331139839 m37272810273311398393 = (M3727281027331139839) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if (!m37272810273311398393.R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    m37272810273311398393.U();
                } else {
                    F2465500022857960993.b(this.b, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, m37272810273311398393, 0, 0, 262142);
                }
                break;
        }
        return o9245300239821758723;
    }
}
