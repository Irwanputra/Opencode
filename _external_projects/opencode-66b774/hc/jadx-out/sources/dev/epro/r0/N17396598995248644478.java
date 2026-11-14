package dev.epro.r0;

import android.graphics.Paint;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class N17396598995248644478 implements L17598299826319227431 {
    public final N16536369055082677148 a = new N16536369055082677148();
    public V6844203142031704410 b;

    @Override // dev.epro.r0.L17598299826319227431
    public final void A0(D14208870094104617988 d14208870094104617988, float f, long j, Q15653065705375360223 q15653065705375360223) {
        this.a.A0(d14208870094104617988, f, j, q15653065705375360223);
    }

    @Override // dev.epro.r0.L17598299826319227431
    public final void C0(long j, long j2, long j3, float f, int i, int i2) {
        this.a.C0(j, j2, j3, f, i, i2);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final long E0(float f) {
        return this.a.E0(f);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final long G(float f) {
        return this.a.G(f);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final long I(long j) {
        return this.a.I(j);
    }

    @Override // dev.epro.r0.L17598299826319227431
    public final void J(D14208870094104617988 d14208870094104617988, long j, long j2, long j3, float f, Q15653065705375360223 q15653065705375360223) {
        this.a.J(d14208870094104617988, j, j2, j3, f, q15653065705375360223);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float K(float f) {
        return this.a.c() * f;
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float M0(int i) {
        return this.a.M0(i);
    }

    @Override // dev.epro.r0.L17598299826319227431
    public final void P(O9197885956465164423 o9197885956465164423, float f, long j, Q15653065705375360223 q15653065705375360223) {
        this.a.P(o9197885956465164423, f, j, q15653065705375360223);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float P0(float f) {
        return f / this.a.c();
    }

    @Override // dev.epro.r0.L17598299826319227431
    public final Q7316561721656982910 R() {
        return this.a.b;
    }

    @Override // dev.epro.r0.L17598299826319227431
    public final void S(long j, float f, float f2, long j2, long j3, float f3, Q15653065705375360223 q15653065705375360223) {
        this.a.S(j, f, f2, j2, j3, f3, q15653065705375360223);
    }

    @Override // dev.epro.r0.L17598299826319227431
    public final void U(B1061516154492673368 b1061516154492673368, long j, float f, Q15653065705375360223 q15653065705375360223) {
        this.a.U(b1061516154492673368, j, f, q15653065705375360223);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final int X(long j) {
        return this.a.X(j);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float Y(long j) {
        return this.a.Y(j);
    }

    public final void a() {
        N16536369055082677148 n16536369055082677148 = this.a;
        Q7316561721656982910 q7316561721656982910 = n16536369055082677148.b;
        V1715405128288489768 v1715405128288489768A = n16536369055082677148.b.A();
        R16749699847173633337 r16749699847173633337 = this.b;
        if (r16749699847173633337 == null) {
            throw L11610354117192841236.j("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        R15896830329318850690 r15896830329318850690 = (R15896830329318850690) r16749699847173633337;
        R15896830329318850690 r15896830329318850690M = r15896830329318850690.a.f;
        if (r15896830329318850690M == null || (r15896830329318850690M.d & 4) == 0) {
            r15896830329318850690M = null;
        } else {
            while (r15896830329318850690M != null) {
                int i = r15896830329318850690M.c;
                if ((i & 2) != 0) {
                    break;
                } else if ((i & 4) != 0) {
                    break;
                } else {
                    r15896830329318850690M = r15896830329318850690M.f;
                }
            }
            r15896830329318850690M = null;
        }
        if (r15896830329318850690M == null) {
            Y4989033692226475498 y4989033692226475498P = R7033599853981556291.P(r16749699847173633337, 4);
            if (y4989033692226475498P.e1() == r15896830329318850690.a) {
                y4989033692226475498P = y4989033692226475498P.v;
                y4989033692226475498P.getClass();
            }
            y4989033692226475498P.u1(v1715405128288489768A, (B9692660393722135472) q7316561721656982910.c);
            return;
        }
        D389890677992184566 d389890677992184566 = null;
        while (r15896830329318850690M != null) {
            if (r15896830329318850690M instanceof V6844203142031704410) {
                V6844203142031704410 v6844203142031704410 = (V6844203142031704410) r15896830329318850690M;
                B9692660393722135472 b9692660393722135472 = (B9692660393722135472) q7316561721656982910.c;
                Y4989033692226475498 y4989033692226475498P2 = R7033599853981556291.P(v6844203142031704410, 4);
                long jQ = I3887072968740112330.Q(y4989033692226475498P2.c);
                H11725168162114556860 h11725168162114556860 = y4989033692226475498P2.u;
                h11725168162114556860.getClass();
                ((S7974369370986781936) P12010630787994328224.a(h11725168162114556860)).getSharedDrawScope().b(v1715405128288489768A, jQ, y4989033692226475498P2, v6844203142031704410, b9692660393722135472);
            } else if ((r15896830329318850690M.c & 4) != 0 && (r15896830329318850690M instanceof J2215566372910931965)) {
                int i2 = 0;
                for (R15896830329318850690 r158968303293188506902 = ((J2215566372910931965) r15896830329318850690M).p; r158968303293188506902 != null; r158968303293188506902 = r158968303293188506902.f) {
                    if ((r158968303293188506902.c & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            r15896830329318850690M = r158968303293188506902;
                        } else {
                            if (d389890677992184566 == null) {
                                d389890677992184566 = new D389890677992184566(0, new R15896830329318850690[16]);
                            }
                            if (r15896830329318850690M != null) {
                                d389890677992184566.b(r15896830329318850690M);
                                r15896830329318850690M = null;
                            }
                            d389890677992184566.b(r158968303293188506902);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            r15896830329318850690M = R7033599853981556291.M(d389890677992184566);
        }
    }

    public final void b(V1715405128288489768 v1715405128288489768, long j, Y4989033692226475498 y4989033692226475498, V6844203142031704410 v6844203142031704410, B9692660393722135472 b9692660393722135472) {
        V6844203142031704410 v68442031420317044102 = this.b;
        this.b = v6844203142031704410;
        F10342546226345611902 f10342546226345611902 = y4989033692226475498.u.z;
        Q7316561721656982910 q7316561721656982910 = this.a.b;
        R8540738700654750557 r8540738700654750557C = q7316561721656982910.C();
        F10342546226345611902 f10342546226345611902E = q7316561721656982910.E();
        V1715405128288489768 v1715405128288489768A = q7316561721656982910.A();
        long jF = q7316561721656982910.F();
        B9692660393722135472 b96926603937221354722 = (B9692660393722135472) q7316561721656982910.c;
        q7316561721656982910.M(y4989033692226475498);
        q7316561721656982910.O(f10342546226345611902);
        q7316561721656982910.L(v1715405128288489768);
        q7316561721656982910.P(j);
        q7316561721656982910.c = b9692660393722135472;
        v1715405128288489768.l();
        try {
            v6844203142031704410.E(this);
            v1715405128288489768.j();
            q7316561721656982910.M(r8540738700654750557C);
            q7316561721656982910.O(f10342546226345611902E);
            q7316561721656982910.L(v1715405128288489768A);
            q7316561721656982910.P(jF);
            q7316561721656982910.c = b96926603937221354722;
            this.b = v68442031420317044102;
        } catch (Throwable th) {
            v1715405128288489768.j();
            q7316561721656982910.M(r8540738700654750557C);
            q7316561721656982910.O(f10342546226345611902E);
            q7316561721656982910.L(v1715405128288489768A);
            q7316561721656982910.P(jF);
            q7316561721656982910.c = b96926603937221354722;
            throw th;
        }
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float c() {
        return this.a.c();
    }

    public final void d(D14208870094104617988 d14208870094104617988, long j, long j2, float f, float f2) {
        N16536369055082677148 n16536369055082677148 = this.a;
        V1715405128288489768 v1715405128288489768 = n16536369055082677148.a.c;
        O3228356295430981133 o3228356295430981133G = n16536369055082677148.d;
        if (o3228356295430981133G == null) {
            o3228356295430981133G = E12775674050813925581.g();
            o3228356295430981133G.v(1);
            n16536369055082677148.d = o3228356295430981133G;
        }
        Paint paint = (Paint) o3228356295430981133G.b;
        if (d14208870094104617988 != null) {
            d14208870094104617988.a(f2, n16536369055082677148.e(), o3228356295430981133G);
        } else if (paint.getAlpha() / 255.0f != f2) {
            o3228356295430981133G.m(f2);
        }
        if (!S10823041268949770285.t((R3103059035698929241) o3228356295430981133G.d, null)) {
            o3228356295430981133G.p(null);
        }
        if (o3228356295430981133G.a != 3) {
            o3228356295430981133G.n(3);
        }
        if (paint.getStrokeWidth() != f) {
            o3228356295430981133G.u(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (o3228356295430981133G.j() != 0) {
            o3228356295430981133G.s(0);
        }
        if (o3228356295430981133G.k() != 0) {
            o3228356295430981133G.t(0);
        }
        if (!paint.isFilterBitmap()) {
            o3228356295430981133G.q(1);
        }
        v1715405128288489768.g(j, j2, o3228356295430981133G);
    }

    @Override // dev.epro.r0.L17598299826319227431
    public final long e() {
        return this.a.e();
    }

    @Override // dev.epro.r0.L17598299826319227431
    public final void e0(long j, float f, long j2, Q15653065705375360223 q15653065705375360223, int i) {
        this.a.e0(j, f, j2, q15653065705375360223, i);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final int g0(float f) {
        return this.a.g0(f);
    }

    @Override // dev.epro.r0.L17598299826319227431
    public final F10342546226345611902 getLayoutDirection() {
        return this.a.a.b;
    }

    @Override // dev.epro.r0.L17598299826319227431
    public final void i0(B1061516154492673368 b1061516154492673368, D14208870094104617988 d14208870094104617988, float f, Q15653065705375360223 q15653065705375360223, int i) {
        this.a.i0(b1061516154492673368, d14208870094104617988, f, q15653065705375360223, i);
    }

    @Override // dev.epro.r0.L17598299826319227431
    public final long m0() {
        return this.a.m0();
    }

    @Override // dev.epro.r0.L17598299826319227431
    public final void q(F2238012860950049442 f2238012860950049442, long j, long j2, long j3, float f, R3103059035698929241 r3103059035698929241, int i) {
        this.a.q(f2238012860950049442, j, j2, j3, f, r3103059035698929241, i);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float s() {
        return this.a.s();
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final long t0(long j) {
        return this.a.t0(j);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float v0(long j) {
        return this.a.v0(j);
    }

    @Override // dev.epro.r0.L17598299826319227431
    public final void w(D14208870094104617988 d14208870094104617988, long j, long j2, float f, Q15653065705375360223 q15653065705375360223) {
        this.a.w(d14208870094104617988, j, j2, f, q15653065705375360223);
    }

    @Override // dev.epro.r0.L17598299826319227431
    public final void y(long j, long j2, long j3, long j4, Q15653065705375360223 q15653065705375360223) {
        this.a.y(j, j2, j3, j4, q15653065705375360223);
    }

    @Override // dev.epro.r0.L17598299826319227431
    public final void y0(long j, long j2, long j3, float f, int i) {
        this.a.y0(j, j2, j3, f, i);
    }
}
