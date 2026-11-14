package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class R3941951701978557941 implements L12639328004344855510 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    public /* synthetic */ R3941951701978557941(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                M3727281027331139839 m3727281027331139839 = (M3727281027331139839) obj;
                int intValue = ((Number) obj2).intValue();
                if (!m3727281027331139839.R(1 & intValue, (intValue & 3) != 2)) {
                    m3727281027331139839.U();
                    break;
                } else {
                    Object M = m3727281027331139839.M();
                    if (M == O9023047933786425027.a) {
                        M = new V10450421848591554621((byte) 0);
                        m3727281027331139839.k0(M);
                    }
                    F2465500022857960993.b(this.b, J11170665878571083300.a(V10993962107938880611.a, (F4096073349764486348) M), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, m3727281027331139839, 0, 0, 262140);
                    break;
                }
            case 1:
                M3727281027331139839 m37272810273311398392 = (M3727281027331139839) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (!m37272810273311398392.R(intValue2 & 1, (intValue2 & 3) != 2)) {
                    m37272810273311398392.U();
                    break;
                } else {
                    F2465500022857960993.b(this.b, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, m37272810273311398392, 0, 0, 262142);
                    break;
                }
            default:
                M3727281027331139839 m37272810273311398393 = (M3727281027331139839) obj;
                int intValue3 = ((Number) obj2).intValue();
                if (!m37272810273311398393.R(intValue3 & 1, (intValue3 & 3) != 2)) {
                    m37272810273311398393.U();
                    break;
                } else {
                    F2465500022857960993.b(this.b, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, m37272810273311398393, 0, 0, 262142);
                    break;
                }
        }
        return o9245300239821758723;
    }
}
