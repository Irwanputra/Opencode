package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B11560398899948625180 implements L12639328004344855510 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ L12639328004344855510 c;

    public /* synthetic */ B11560398899948625180(long j, L12639328004344855510 l12639328004344855510, byte b) {
        this.a = b;
        this.b = j;
        this.c = l12639328004344855510;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        L12639328004344855510 l12639328004344855510 = this.c;
        long j = this.b;
        switch (b) {
            case 0:
                M3727281027331139839 m3727281027331139839 = (M3727281027331139839) obj;
                int intValue = ((Number) obj2).intValue();
                if (!m3727281027331139839.R(intValue & 1, (intValue & 3) != 2)) {
                    m3727281027331139839.U();
                    break;
                } else {
                    D1286559660607336098.a(L11610354117192841236.n(j, F14501669313667597110.a), l12639328004344855510, m3727281027331139839, 8);
                    break;
                }
            case 1:
                M3727281027331139839 m37272810273311398392 = (M3727281027331139839) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (!m37272810273311398392.R(intValue2 & 1, (intValue2 & 3) != 2)) {
                    m37272810273311398392.U();
                    break;
                } else {
                    D1286559660607336098.a(L11610354117192841236.n(j, F14501669313667597110.a), l12639328004344855510, m37272810273311398392, 8);
                    break;
                }
            case 2:
                M3727281027331139839 m37272810273311398393 = (M3727281027331139839) obj;
                int intValue3 = ((Number) obj2).intValue();
                if (!m37272810273311398393.R(intValue3 & 1, (intValue3 & 3) != 2)) {
                    m37272810273311398393.U();
                    break;
                } else {
                    S12227320117525376577.c(j, l12639328004344855510, m37272810273311398393, 0);
                    break;
                }
            default:
                M3727281027331139839 m37272810273311398394 = (M3727281027331139839) obj;
                int intValue4 = ((Number) obj2).intValue();
                if (!m37272810273311398394.R(intValue4 & 1, (intValue4 & 3) != 2)) {
                    m37272810273311398394.U();
                    break;
                } else {
                    S12227320117525376577.c(j, l12639328004344855510, m37272810273311398394, 0);
                    break;
                }
        }
        return o9245300239821758723;
    }
}
