package dev.epro.r0;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class N16536369055082677148 implements L17598299826319227431 {
    public final C18156294336905801584 a;
    public final Q7316561721656982910 b;
    public O3228356295430981133 c;
    public O3228356295430981133 d;

    public N16536369055082677148() {
        V14115061890849225617 v14115061890849225617 = A10225670138084435446.e;
        C18156294336905801584 c18156294336905801584 = new C18156294336905801584();
        c18156294336905801584.a = v14115061890849225617;
        c18156294336905801584.b = F10342546226345611902.a;
        c18156294336905801584.c = D2564719420886839927.a;
        c18156294336905801584.d = 0L;
        this.a = c18156294336905801584;
        this.b = new Q7316561721656982910(this);
    }

    public static O3228356295430981133 a(N16536369055082677148 n16536369055082677148, long j, Q15653065705375360223 q15653065705375360223, float f, int i) {
        O3228356295430981133 o3228356295430981133D = n16536369055082677148.d(q15653065705375360223);
        if (f != 1.0f) {
            j = U10174709222559481877.b(U10174709222559481877.c(j) * f, j);
        }
        long jI = o3228356295430981133D.i();
        int i2 = U10174709222559481877.i;
        if (!P15388715743159210616.a(jI, j)) {
            o3228356295430981133D.o(j);
        }
        if (((Shader) o3228356295430981133D.c) != null) {
            o3228356295430981133D.r(null);
        }
        if (!S10823041268949770285.t((R3103059035698929241) o3228356295430981133D.d, null)) {
            o3228356295430981133D.p(null);
        }
        if (o3228356295430981133D.a != i) {
            o3228356295430981133D.n(i);
        }
        if (((Paint) o3228356295430981133D.b).isFilterBitmap()) {
            return o3228356295430981133D;
        }
        o3228356295430981133D.q(1);
        return o3228356295430981133D;
    }

    @Override // dev.epro.r0.L17598299826319227431
    public final void A0(D14208870094104617988 d14208870094104617988, float f, long j, Q15653065705375360223 q15653065705375360223) {
        this.a.c.q(f, j, b(d14208870094104617988, q15653065705375360223, 1.0f, null, 3, 1));
    }

    @Override // dev.epro.r0.L17598299826319227431
    public final void C0(long j, long j2, long j3, float f, int i, int i2) {
        V1715405128288489768 v1715405128288489768 = this.a.c;
        O3228356295430981133 o3228356295430981133G = this.d;
        if (o3228356295430981133G == null) {
            o3228356295430981133G = E12775674050813925581.g();
            o3228356295430981133G.v(1);
            this.d = o3228356295430981133G;
        }
        Paint paint = (Paint) o3228356295430981133G.b;
        long jI = o3228356295430981133G.i();
        int i3 = U10174709222559481877.i;
        if (!P15388715743159210616.a(jI, j)) {
            o3228356295430981133G.o(j);
        }
        if (((Shader) o3228356295430981133G.c) != null) {
            o3228356295430981133G.r(null);
        }
        if (!S10823041268949770285.t((R3103059035698929241) o3228356295430981133G.d, null)) {
            o3228356295430981133G.p(null);
        }
        if (o3228356295430981133G.a != i2) {
            o3228356295430981133G.n(i2);
        }
        if (paint.getStrokeWidth() != f) {
            o3228356295430981133G.u(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (o3228356295430981133G.j() != i) {
            o3228356295430981133G.s(i);
        }
        if (o3228356295430981133G.k() != 0) {
            o3228356295430981133G.t(0);
        }
        if (!paint.isFilterBitmap()) {
            o3228356295430981133G.q(1);
        }
        v1715405128288489768.g(j2, j3, o3228356295430981133G);
    }

    @Override // dev.epro.r0.L17598299826319227431
    public final void J(D14208870094104617988 d14208870094104617988, long j, long j2, long j3, float f, Q15653065705375360223 q15653065705375360223) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        this.a.c.r(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), b(d14208870094104617988, q15653065705375360223, f, null, 3, 1));
    }

    @Override // dev.epro.r0.L17598299826319227431
    public final void P(O9197885956465164423 o9197885956465164423, float f, long j, Q15653065705375360223 q15653065705375360223) {
        this.a.c.c(Float.intBitsToFloat(0), Float.intBitsToFloat(0), Float.intBitsToFloat((int) (j >> 32)) + Float.intBitsToFloat(0), Float.intBitsToFloat((int) (4294967295L & j)) + Float.intBitsToFloat(0), f, 3.0f, true, b(o9197885956465164423, q15653065705375360223, 1.0f, null, 3, 1));
    }

    @Override // dev.epro.r0.L17598299826319227431
    public final Q7316561721656982910 R() {
        return this.b;
    }

    @Override // dev.epro.r0.L17598299826319227431
    public final void S(long j, float f, float f2, long j2, long j3, float f3, Q15653065705375360223 q15653065705375360223) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.a.c.c(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, false, a(this, j, q15653065705375360223, f3, 3));
    }

    @Override // dev.epro.r0.L17598299826319227431
    public final void U(B1061516154492673368 b1061516154492673368, long j, float f, Q15653065705375360223 q15653065705375360223) {
        this.a.c.o(b1061516154492673368, a(this, j, q15653065705375360223, f, 3));
    }

    public final O3228356295430981133 b(D14208870094104617988 d14208870094104617988, Q15653065705375360223 q15653065705375360223, float f, R3103059035698929241 r3103059035698929241, int i, int i2) {
        O3228356295430981133 o3228356295430981133D = d(q15653065705375360223);
        Paint paint = (Paint) o3228356295430981133D.b;
        if (d14208870094104617988 != null) {
            d14208870094104617988.a(f, e(), o3228356295430981133D);
        } else {
            if (((Shader) o3228356295430981133D.c) != null) {
                o3228356295430981133D.r(null);
            }
            long jI = o3228356295430981133D.i();
            long j = U10174709222559481877.b;
            if (!P15388715743159210616.a(jI, j)) {
                o3228356295430981133D.o(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                o3228356295430981133D.m(f);
            }
        }
        if (!S10823041268949770285.t((R3103059035698929241) o3228356295430981133D.d, r3103059035698929241)) {
            o3228356295430981133D.p(r3103059035698929241);
        }
        if (o3228356295430981133D.a != i) {
            o3228356295430981133D.n(i);
        }
        if (paint.isFilterBitmap() == i2) {
            return o3228356295430981133D;
        }
        o3228356295430981133D.q(i2);
        return o3228356295430981133D;
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float c() {
        return this.a.a.c();
    }

    public final O3228356295430981133 d(Q15653065705375360223 q15653065705375360223) {
        if (S10823041268949770285.t(q15653065705375360223, C10274207051762801329.a)) {
            O3228356295430981133 o3228356295430981133 = this.c;
            if (o3228356295430981133 != null) {
                return o3228356295430981133;
            }
            O3228356295430981133 o3228356295430981133G = E12775674050813925581.g();
            o3228356295430981133G.v(0);
            this.c = o3228356295430981133G;
            return o3228356295430981133G;
        }
        if (!(q15653065705375360223 instanceof I1470541803076273897)) {
            Z3383101362411723454.g();
            return null;
        }
        O3228356295430981133 o3228356295430981133G2 = this.d;
        if (o3228356295430981133G2 == null) {
            o3228356295430981133G2 = E12775674050813925581.g();
            o3228356295430981133G2.v(1);
            this.d = o3228356295430981133G2;
        }
        Paint paint = (Paint) o3228356295430981133G2.b;
        float strokeWidth = paint.getStrokeWidth();
        I1470541803076273897 i1470541803076273897 = (I1470541803076273897) q15653065705375360223;
        float f = i1470541803076273897.a;
        if (strokeWidth != f) {
            o3228356295430981133G2.u(f);
        }
        int iJ = o3228356295430981133G2.j();
        int i = i1470541803076273897.c;
        if (iJ != i) {
            o3228356295430981133G2.s(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = i1470541803076273897.b;
        if (strokeMiter != f2) {
            paint.setStrokeMiter(f2);
        }
        int iK = o3228356295430981133G2.k();
        int i2 = i1470541803076273897.d;
        if (iK == i2) {
            return o3228356295430981133G2;
        }
        o3228356295430981133G2.t(i2);
        return o3228356295430981133G2;
    }

    @Override // dev.epro.r0.L17598299826319227431
    public final void e0(long j, float f, long j2, Q15653065705375360223 q15653065705375360223, int i) {
        this.a.c.q(f, j2, a(this, j, q15653065705375360223, 1.0f, i));
    }

    @Override // dev.epro.r0.L17598299826319227431
    public final F10342546226345611902 getLayoutDirection() {
        return this.a.b;
    }

    @Override // dev.epro.r0.L17598299826319227431
    public final void i0(B1061516154492673368 b1061516154492673368, D14208870094104617988 d14208870094104617988, float f, Q15653065705375360223 q15653065705375360223, int i) {
        this.a.c.o(b1061516154492673368, b(d14208870094104617988, q15653065705375360223, f, null, i, 1));
    }

    @Override // dev.epro.r0.L17598299826319227431
    public final void q(F2238012860950049442 f2238012860950049442, long j, long j2, long j3, float f, R3103059035698929241 r3103059035698929241, int i) {
        this.a.c.e(f2238012860950049442, j, j2, j3, b(null, C10274207051762801329.a, f, r3103059035698929241, 3, i));
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float s() {
        return this.a.a.s();
    }

    @Override // dev.epro.r0.L17598299826319227431
    public final void w(D14208870094104617988 d14208870094104617988, long j, long j2, float f, Q15653065705375360223 q15653065705375360223) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        this.a.c.k(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (4294967295L & j2)) + Float.intBitsToFloat(i2), b(d14208870094104617988, q15653065705375360223, f, null, 3, 1));
    }

    @Override // dev.epro.r0.L17598299826319227431
    public final void y(long j, long j2, long j3, long j4, Q15653065705375360223 q15653065705375360223) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.a.c.r(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), a(this, j, q15653065705375360223, 1.0f, 3));
    }

    @Override // dev.epro.r0.L17598299826319227431
    public final void y0(long j, long j2, long j3, float f, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.a.c.k(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j3)) + Float.intBitsToFloat(i3), a(this, j, C10274207051762801329.a, f, i));
    }
}
