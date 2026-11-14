package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J7269307902547280975 implements L12639328004344855510 {
    public final /* synthetic */ R8029976778412248429 a;
    public final /* synthetic */ boolean b;

    public J7269307902547280975(R8029976778412248429 r8029976778412248429, boolean z) {
        this.a = r8029976778412248429;
        this.b = z;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        M3727281027331139839 m3727281027331139839 = (M3727281027331139839) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (m3727281027331139839.R(iIntValue & 1, (iIntValue & 3) != 2)) {
            int i = S16343116836002986007.l.b;
            for (int i2 = 0; i2 < i; i2++) {
                int iC = S16343116836002986007.l.c(i2);
                boolean zD = m3727281027331139839.d(i2);
                Object objM = m3727281027331139839.M();
                if (zD || objM == O9023047933786425027.a) {
                    objM = new O16774394856129852758(i2, (byte) 10);
                    m3727281027331139839.k0(objM);
                }
                S16343116836002986007.d(J11170665878571083300.b(V10993962107938880611.a, false, (F4096073349764486348) objM), this.a, iC, this.b, m3727281027331139839, 0);
            }
        } else {
            m3727281027331139839.U();
        }
        return O9245300239821758723.a;
    }
}
