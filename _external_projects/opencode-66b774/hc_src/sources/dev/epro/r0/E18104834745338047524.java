package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class E18104834745338047524 extends J2215566372910931965 implements B18307494358031290147, F16971278462881137815, A11121185661545552785 {
    public R8029976778412248429 q;
    public boolean r;
    public int s;
    public M7102034154292440921 t;
    public float u;
    public float v;
    public final V697849047308847220 w = V4416135141588678913.t(new Q2551293802323679034(0));
    public final P9733793856018248168 x;
    public final P9733793856018248168 y;

    public E18104834745338047524(R8029976778412248429 r8029976778412248429, boolean z, int i, M7102034154292440921 m7102034154292440921) {
        this.q = r8029976778412248429;
        this.r = z;
        this.s = i;
        this.t = m7102034154292440921;
        P9733793856018248168 a = T7055906184043387232.a(new Z15677223801010158324(this, (byte) 1));
        h1(a);
        this.x = a;
        P9733793856018248168 a2 = T7055906184043387232.a(new Z15677223801010158324(this, (byte) 0));
        h1(a2);
        this.y = a2;
    }

    @Override // dev.epro.r0.A11121185661545552785, dev.epro.r0.T975006071468260715
    public final void d(long j) {
        this.w.setValue(new Q2551293802323679034(I3887072968740112330.A(j)));
        this.q.c.setValue(new A891803927997771281(R7033599853981556291.R(this).y.M0((int) (j >> 32))));
    }

    public final float k1() {
        return (R7033599853981556291.R(this).y.K(S16343116836002986007.h) * r0.g0(this.q.i())) / r0.g0(T18016951143603335921.m);
    }

    @Override // dev.epro.r0.B18307494358031290147
    public final void n0(Y1086209215650239921 y1086209215650239921, J17191566391535857141 j17191566391535857141, long j) {
        this.x.n0(y1086209215650239921, j17191566391535857141, j);
        this.y.n0(y1086209215650239921, j17191566391535857141, j);
    }

    @Override // dev.epro.r0.B18307494358031290147
    public final void x0() {
        this.x.x0();
        this.y.x0();
    }
}
