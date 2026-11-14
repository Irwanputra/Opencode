package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class X12405373366696798504 implements L12639328004344855510 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ V3118049853945785650 b;

    public /* synthetic */ X12405373366696798504(V3118049853945785650 v3118049853945785650, byte b) {
        this.a = b;
        this.b = v3118049853945785650;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        V3118049853945785650 v3118049853945785650 = this.b;
        switch (b) {
            case 0:
                M3727281027331139839 m3727281027331139839 = (M3727281027331139839) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!m3727281027331139839.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    m3727281027331139839.U();
                } else {
                    F2465500022857960993.b(v3118049853945785650.a.a(), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, m3727281027331139839, 0, 0, 262142);
                }
                break;
            default:
                M3727281027331139839 m37272810273311398392 = (M3727281027331139839) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!m37272810273311398392.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    m37272810273311398392.U();
                } else {
                    boolean zF = m37272810273311398392.f(v3118049853945785650);
                    Object objM = m37272810273311398392.M();
                    if (zF || objM == O9023047933786425027.a) {
                        objM = new T3172189321250154605(v3118049853945785650, (byte) 5);
                        m37272810273311398392.k0(objM);
                    }
                    S10823041268949770285.f((B13729205492206812220) objM, null, false, null, null, J1162358285882497030.a, m37272810273311398392, 1572864, 62);
                }
                break;
        }
        return o9245300239821758723;
    }
}
