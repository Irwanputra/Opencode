package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class H8936484157561155754 implements F4096073349764486348 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ D14208870094104617988 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ I1470541803076273897 h;

    public /* synthetic */ H8936484157561155754(boolean z, H10765568533039107979 h10765568533039107979, long j, float f, float f2, long j2, long j3, I1470541803076273897 i1470541803076273897) {
        this.a = z;
        this.b = h10765568533039107979;
        this.c = j;
        this.d = f;
        this.e = f2;
        this.f = j2;
        this.g = j3;
        this.h = i1470541803076273897;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) throws Throwable {
        long j;
        N17396598995248644478 n17396598995248644478 = (N17396598995248644478) obj;
        n17396598995248644478.a();
        N16536369055082677148 n16536369055082677148 = n17396598995248644478.a;
        boolean z = this.a;
        D14208870094104617988 d14208870094104617988 = this.b;
        long j2 = this.c;
        if (z) {
            L17598299826319227431.D0(n17396598995248644478, d14208870094104617988, 0L, 0L, j2, null, 246);
        } else {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            float f = this.d;
            if (fIntBitsToFloat < f) {
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (n16536369055082677148.e() >> 32));
                float f2 = this.e;
                float f3 = fIntBitsToFloat2 - f2;
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (n16536369055082677148.e() & 4294967295L)) - f2;
                Q7316561721656982910 q7316561721656982910 = n16536369055082677148.b;
                long jF = q7316561721656982910.F();
                q7316561721656982910.A().l();
                try {
                    ((Q7316561721656982910) ((H12843822278061842084) q7316561721656982910.b).b).A().h(f2, f2, f3, fIntBitsToFloat3, 0);
                    j = jF;
                    try {
                        L17598299826319227431.D0(n17396598995248644478, d14208870094104617988, 0L, 0L, j2, null, 246);
                        L11610354117192841236.w(q7316561721656982910, j);
                    } catch (Throwable th) {
                        th = th;
                        L11610354117192841236.w(q7316561721656982910, j);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j = jF;
                }
            } else {
                L17598299826319227431.D0(n17396598995248644478, d14208870094104617988, this.f, this.g, E18444280280170001567.U(f, j2), this.h, 208);
            }
        }
        return O9245300239821758723.a;
    }
}
