package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class G13471683174973708537 implements L12639328004344855510 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ G13471683174973708537(byte b, long j, Object obj, Object obj2) {
        this.a = b;
        this.b = j;
        this.c = obj;
        this.d = obj2;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        byte b2 = 2;
        byte b3 = 1;
        switch (b) {
            case 0:
                M3727281027331139839 m3727281027331139839 = (M3727281027331139839) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!m3727281027331139839.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    m3727281027331139839.U();
                } else {
                    D1286559660607336098.l(this.b, ((L10797789142392276788) m3727281027331139839.j(V6937487778750555249.a)).m, S10823041268949770285.T(417635459, new U8464449497680896203((T1241271073913685060) obj4, (J12078565427869724451) obj3, b3), m3727281027331139839), m3727281027331139839, 384);
                }
                break;
            case 1:
                M3727281027331139839 m37272810273311398392 = (M3727281027331139839) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                V3118049853945785650 v3118049853945785650 = (V3118049853945785650) obj4;
                if (!m37272810273311398392.R(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    m37272810273311398392.U();
                } else {
                    D6962450040782876658 d6962450040782876658 = E14826043354371714545.a;
                    J7864302246393130751 j7864302246393130751B = E14826043354371714545.b(0L, this.b, m37272810273311398392, 13);
                    boolean zF = m37272810273311398392.f(v3118049853945785650);
                    Object objM = m37272810273311398392.M();
                    if (zF || objM == O9023047933786425027.a) {
                        objM = new T3172189321250154605(v3118049853945785650, (byte) 4);
                        m37272810273311398392.k0(objM);
                    }
                    U16229988784104357932.p((B13729205492206812220) objM, null, false, null, j7864302246393130751B, null, S10823041268949770285.T(521110564, new N15874412918248872285((String) obj3, b2), m37272810273311398392), m37272810273311398392, 805306368, 494);
                }
                break;
            default:
                M3727281027331139839 m37272810273311398393 = (M3727281027331139839) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!m37272810273311398393.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    m37272810273311398393.U();
                } else {
                    S12227320117525376577.b(this.b, (S16571168858015125610) obj4, (L12639328004344855510) obj3, m37272810273311398393, 0);
                }
                break;
        }
        return o9245300239821758723;
    }
}
