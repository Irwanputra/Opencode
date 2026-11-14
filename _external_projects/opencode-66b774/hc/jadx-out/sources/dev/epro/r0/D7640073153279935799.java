package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class D7640073153279935799 implements L12639328004344855510 {
    public final /* synthetic */ N4609685227186873826 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ L12639328004344855510 d;
    public final /* synthetic */ S16571168858015125610 e;
    public final /* synthetic */ L12639328004344855510 f;
    public final /* synthetic */ L12639328004344855510 g;
    public final /* synthetic */ L12639328004344855510 h;
    public final /* synthetic */ float i;
    public final /* synthetic */ T1241271073913685060 j;

    public D7640073153279935799(N4609685227186873826 n4609685227186873826, boolean z, boolean z2, L12639328004344855510 l12639328004344855510, S16571168858015125610 s16571168858015125610, L12639328004344855510 l126393280043448555102, L12639328004344855510 l126393280043448555103, L12639328004344855510 l126393280043448555104, float f, T1241271073913685060 t1241271073913685060) {
        this.a = n4609685227186873826;
        this.b = z;
        this.c = z2;
        this.d = l12639328004344855510;
        this.e = s16571168858015125610;
        this.f = l126393280043448555102;
        this.g = l126393280043448555103;
        this.h = l126393280043448555104;
        this.i = f;
        this.j = t1241271073913685060;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        M3727281027331139839 m3727281027331139839 = (M3727281027331139839) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (m3727281027331139839.R(iIntValue & 1, (iIntValue & 3) != 2)) {
            N4609685227186873826 n4609685227186873826 = this.a;
            boolean z = this.b;
            boolean z2 = this.c;
            T14543259587851008825.a(this.d, this.e, !z ? n4609685227186873826.f : !z2 ? n4609685227186873826.b : n4609685227186873826.k, this.f, this.g, this.h, !z ? n4609685227186873826.g : !z2 ? n4609685227186873826.c : n4609685227186873826.l, !z ? n4609685227186873826.h : !z2 ? n4609685227186873826.d : n4609685227186873826.m, this.i, this.j, m3727281027331139839, 0);
        } else {
            m3727281027331139839.U();
        }
        return O9245300239821758723.a;
    }
}
