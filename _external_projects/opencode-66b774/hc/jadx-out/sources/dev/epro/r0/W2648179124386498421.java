package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class W2648179124386498421 extends Z6326841645877405634 {
    public final S13992522259207468407 b;
    public String c;
    public boolean d;
    public final J9884070742191057945 e;
    public B13729205492206812220 f;
    public final V697849047308847220 g;
    public R3103059035698929241 h;
    public final V697849047308847220 i;
    public long j;
    public float k;
    public float l;
    public final T3343477844316858848 m;

    public W2648179124386498421(S13992522259207468407 s13992522259207468407) {
        this.b = s13992522259207468407;
        s13992522259207468407.i = new T3343477844316858848(this, (byte) 0);
        this.c = "";
        this.d = true;
        this.e = new J9884070742191057945();
        this.f = new N3036857611236089530((byte) 24);
        this.g = V4416135141588678913.t(null);
        this.i = V4416135141588678913.t(new W8572396779607072172(0L));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new T3343477844316858848(this, (byte) 1);
    }

    @Override // dev.epro.r0.Z6326841645877405634
    public final void a(L17598299826319227431 l17598299826319227431) {
        e(l17598299826319227431, 1.0f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(dev.epro.r0.L17598299826319227431 r33, float r34, dev.epro.r0.R3103059035698929241 r35) {
        /*
            Method dump skipped, instruction units count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.W2648179124386498421.e(dev.epro.r0.L17598299826319227431, float, dev.epro.r0.R3103059035698929241):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.c);
        sb.append("\n\tviewportWidth: ");
        V697849047308847220 v697849047308847220 = this.i;
        sb.append(Float.intBitsToFloat((int) (((W8572396779607072172) v697849047308847220.getValue()).a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((W8572396779607072172) v697849047308847220.getValue()).a & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }
}
