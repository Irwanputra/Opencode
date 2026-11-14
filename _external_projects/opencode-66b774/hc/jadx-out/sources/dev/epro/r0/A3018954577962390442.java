package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A3018954577962390442 implements J12078565427869724451 {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ H14763425654620554740 d;
    public final /* synthetic */ S9385204271696540760 e;
    public final /* synthetic */ L12639328004344855510 f;
    public final /* synthetic */ I5573661370475160895 g;
    public final /* synthetic */ M15706644554150934798 h;

    public A3018954577962390442(String str, boolean z, boolean z2, H14763425654620554740 h14763425654620554740, S9385204271696540760 s9385204271696540760, L12639328004344855510 l12639328004344855510, I5573661370475160895 i5573661370475160895, M15706644554150934798 m15706644554150934798) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = h14763425654620554740;
        this.e = s9385204271696540760;
        this.f = l12639328004344855510;
        this.g = i5573661370475160895;
        this.h = m15706644554150934798;
    }

    @Override // dev.epro.r0.J12078565427869724451
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        L12639328004344855510 l12639328004344855510 = (L12639328004344855510) obj;
        M3727281027331139839 m3727281027331139839 = (M3727281027331139839) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= m3727281027331139839.h(l12639328004344855510) ? 4 : 2;
        }
        if (m3727281027331139839.R(iIntValue & 1, (iIntValue & 19) != 18)) {
            B14824868959299866349.t.h(this.a, l12639328004344855510, this.b, this.c, this.d, this.e, this.f, this.g, this.h, null, null, m3727281027331139839, (iIntValue << 3) & 112);
        } else {
            m3727281027331139839.U();
        }
        return O9245300239821758723.a;
    }
}
