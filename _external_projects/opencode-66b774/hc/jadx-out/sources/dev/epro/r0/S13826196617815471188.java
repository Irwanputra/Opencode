package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class S13826196617815471188 implements L12639328004344855510 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ P11273374321045165714 b;
    public final /* synthetic */ A81664135048468380 c;

    public /* synthetic */ S13826196617815471188(P11273374321045165714 p11273374321045165714, A81664135048468380 a81664135048468380, byte b) {
        this.a = b;
        this.b = p11273374321045165714;
        this.c = a81664135048468380;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        A81664135048468380 a81664135048468380 = this.c;
        P11273374321045165714 p11273374321045165714 = this.b;
        float fFloatValue = ((Float) obj).floatValue();
        float fFloatValue2 = ((Float) obj2).floatValue();
        switch (b) {
            case 0:
                F9886074403848142923 f9886074403848142923 = p11273374321045165714.a;
                f9886074403848142923.f.h(fFloatValue);
                f9886074403848142923.g.h(fFloatValue2);
                a81664135048468380.a = fFloatValue;
                break;
            default:
                F9886074403848142923 f98860744038481429232 = p11273374321045165714.a;
                f98860744038481429232.f.h(fFloatValue);
                f98860744038481429232.g.h(fFloatValue2);
                a81664135048468380.a = fFloatValue;
                break;
        }
        return o9245300239821758723;
    }
}
