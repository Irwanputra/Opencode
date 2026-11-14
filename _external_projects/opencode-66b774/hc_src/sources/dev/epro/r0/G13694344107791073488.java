package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class G13694344107791073488 implements J12078565427869724451 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ L12639328004344855510 b;

    public /* synthetic */ G13694344107791073488(L12639328004344855510 l12639328004344855510, byte b) {
        this.a = b;
        this.b = l12639328004344855510;
    }

    @Override // dev.epro.r0.J12078565427869724451
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        L12639328004344855510 l12639328004344855510 = this.b;
        switch (b) {
            case 0:
                M3727281027331139839 m3727281027331139839 = (M3727281027331139839) obj2;
                int intValue = ((Number) obj3).intValue();
                if (!m3727281027331139839.R(intValue & 1, (intValue & 17) != 16)) {
                    m3727281027331139839.U();
                    break;
                } else {
                    l12639328004344855510.invoke(m3727281027331139839, 0);
                    break;
                }
            default:
                M3727281027331139839 m37272810273311398392 = (M3727281027331139839) obj2;
                int intValue2 = ((Number) obj3).intValue();
                if (!m37272810273311398392.R(intValue2 & 1, (intValue2 & 17) != 16)) {
                    m37272810273311398392.U();
                    break;
                } else {
                    F9678537450618663970.c(l12639328004344855510, m37272810273311398392, 0);
                    break;
                }
        }
        return o9245300239821758723;
    }
}
