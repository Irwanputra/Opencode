package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class V15955572429703851621 implements L12639328004344855510 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public V15955572429703851621(E6969320725925327626 e6969320725925327626, boolean z, boolean z2, M7102034154292440921 m7102034154292440921, L12639328004344855510 l12639328004344855510) {
        this.a = (byte) 3;
        this.d = e6969320725925327626;
        this.b = z;
        this.c = z2;
        this.e = m7102034154292440921;
        this.f = l12639328004344855510;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                M3727281027331139839 m3727281027331139839 = (M3727281027331139839) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!m3727281027331139839.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    m3727281027331139839.U();
                } else {
                    T13350664027331345869.A.h(this.b, this.c, (S9385204271696540760) obj5, null, (M15706644554150934798) obj4, (I5573661370475160895) obj3, 0.0f, 0.0f, m3727281027331139839, 100663296, 200);
                }
                break;
            case 1:
                M3727281027331139839 m37272810273311398392 = (M3727281027331139839) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!m37272810273311398392.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    m37272810273311398392.U();
                } else {
                    T13350664027331345869.A.h(this.b, this.c, (S9385204271696540760) obj5, null, (M15706644554150934798) obj4, (I5573661370475160895) obj3, 0.0f, 0.0f, m37272810273311398392, 100663296, 200);
                }
                break;
            case 2:
                M3727281027331139839 m37272810273311398393 = (M3727281027331139839) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!m37272810273311398393.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    m37272810273311398393.U();
                } else {
                    T13350664027331345869.A.h(this.b, this.c, (S9385204271696540760) obj5, null, (M15706644554150934798) obj4, (I5573661370475160895) obj3, 0.0f, 0.0f, m37272810273311398393, 100663296, 200);
                }
                break;
            default:
                M3727281027331139839 m37272810273311398394 = (M3727281027331139839) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (!m37272810273311398394.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    m37272810273311398394.U();
                } else {
                    E6969320725925327626 e6969320725925327626 = (E6969320725925327626) obj5;
                    D1286559660607336098.l(((U10174709222559481877) H632806210664807941.a(!this.c ? e6969320725925327626.g : this.b ? e6969320725925327626.b : e6969320725925327626.e, (M7102034154292440921) obj4, null, m37272810273311398394, 0, 12).getValue()).a, V6937487778750555249.a(E12775674050813925581.t, m37272810273311398394), (L12639328004344855510) obj3, m37272810273311398394, 0);
                }
                break;
        }
        return o9245300239821758723;
    }

    public /* synthetic */ V15955572429703851621(boolean z, boolean z2, S9385204271696540760 s9385204271696540760, M15706644554150934798 m15706644554150934798, I5573661370475160895 i5573661370475160895, byte b) {
        this.a = b;
        this.b = z;
        this.c = z2;
        this.d = s9385204271696540760;
        this.e = m15706644554150934798;
        this.f = i5573661370475160895;
    }
}
