package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
final class J3193063299506776700 extends A8269341136279542501 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final long k;
    public final I5573661370475160895 l;
    public final boolean m;
    public final long n;

    /* renamed from: o, reason: collision with root package name */
    public final long f312o;
    public final int p;
    public final int q;
    public final R3103059035698929241 r;
    public final X3174009376965511256 s;

    public J3193063299506776700(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, I5573661370475160895 i5573661370475160895, boolean z, long j2, long j3, int i, int i2, R3103059035698929241 r3103059035698929241, X3174009376965511256 x3174009376965511256) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
        this.i = f9;
        this.j = f10;
        this.k = j;
        this.l = i5573661370475160895;
        this.m = z;
        this.n = j2;
        this.f312o = j3;
        this.p = i;
        this.q = i2;
        this.r = r3103059035698929241;
        this.s = x3174009376965511256;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        X6003309733835155255 x6003309733835155255 = new X6003309733835155255();
        x6003309733835155255.f574o = this.a;
        x6003309733835155255.p = this.b;
        x6003309733835155255.q = this.c;
        x6003309733835155255.r = this.d;
        x6003309733835155255.s = this.e;
        x6003309733835155255.t = this.f;
        x6003309733835155255.u = this.g;
        x6003309733835155255.v = this.h;
        x6003309733835155255.w = this.i;
        x6003309733835155255.x = this.j;
        x6003309733835155255.y = this.k;
        x6003309733835155255.z = this.l;
        x6003309733835155255.A = this.m;
        x6003309733835155255.B = this.n;
        x6003309733835155255.C = this.f312o;
        x6003309733835155255.D = this.p;
        x6003309733835155255.E = this.q;
        x6003309733835155255.F = this.r;
        x6003309733835155255.G = this.s;
        x6003309733835155255.H = new K13841493441907392258(x6003309733835155255, (byte) 3);
        return x6003309733835155255;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        Y4989033692226475498 y4989033692226475498;
        X6003309733835155255 x6003309733835155255 = (X6003309733835155255) r15896830329318850690;
        x6003309733835155255.f574o = this.a;
        x6003309733835155255.p = this.b;
        x6003309733835155255.q = this.c;
        x6003309733835155255.r = this.d;
        x6003309733835155255.s = this.e;
        x6003309733835155255.t = this.f;
        x6003309733835155255.u = this.g;
        x6003309733835155255.v = this.h;
        x6003309733835155255.w = this.i;
        x6003309733835155255.x = this.j;
        x6003309733835155255.y = this.k;
        x6003309733835155255.z = this.l;
        x6003309733835155255.A = this.m;
        x6003309733835155255.B = this.n;
        x6003309733835155255.C = this.f312o;
        x6003309733835155255.D = this.p;
        x6003309733835155255.E = this.q;
        x6003309733835155255.F = this.r;
        x6003309733835155255.G = this.s;
        K13841493441907392258 k13841493441907392258 = x6003309733835155255.H;
        if (x6003309733835155255.a.n && (y4989033692226475498 = R7033599853981556291.P(x6003309733835155255, 2).v) != null) {
            y4989033692226475498.E1(k13841493441907392258, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J3193063299506776700)) {
            return false;
        }
        J3193063299506776700 j3193063299506776700 = (J3193063299506776700) obj;
        if (Float.compare(this.a, j3193063299506776700.a) != 0 || Float.compare(this.b, j3193063299506776700.b) != 0 || Float.compare(this.c, j3193063299506776700.c) != 0 || Float.compare(this.d, j3193063299506776700.d) != 0 || Float.compare(this.e, j3193063299506776700.e) != 0 || Float.compare(this.f, j3193063299506776700.f) != 0 || Float.compare(this.g, j3193063299506776700.g) != 0 || Float.compare(this.h, j3193063299506776700.h) != 0 || Float.compare(this.i, j3193063299506776700.i) != 0 || Float.compare(this.j, j3193063299506776700.j) != 0 || !N13757329872968394114.a(this.k, j3193063299506776700.k) || !S10823041268949770285.t(this.l, j3193063299506776700.l) || this.m != j3193063299506776700.m) {
            return false;
        }
        long j = j3193063299506776700.n;
        int i = U10174709222559481877.i;
        return P15388715743159210616.a(this.n, j) && P15388715743159210616.a(this.f312o, j3193063299506776700.f312o) && this.p == j3193063299506776700.p && this.q == j3193063299506776700.q && S10823041268949770285.t(this.r, j3193063299506776700.r) && S10823041268949770285.t(this.s, j3193063299506776700.s);
    }

    public final int hashCode() {
        int e = E12098517352909843120.e(this.j, E12098517352909843120.e(this.i, E12098517352909843120.e(this.h, E12098517352909843120.e(this.g, E12098517352909843120.e(this.f, E12098517352909843120.e(this.e, E12098517352909843120.e(this.d, E12098517352909843120.e(this.c, E12098517352909843120.e(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = N13757329872968394114.c;
        int i2 = G6547577305291411977.i((this.l.hashCode() + G6547577305291411977.j(e, this.k, 31)) * 31, 961, this.m);
        int i3 = U10174709222559481877.i;
        int f = X2485016533998461232.f(this.q, X2485016533998461232.f(this.p, G6547577305291411977.j(G6547577305291411977.j(i2, this.n, 31), this.f312o, 31), 31), 31);
        R3103059035698929241 r3103059035698929241 = this.r;
        return this.s.hashCode() + ((f + (r3103059035698929241 == null ? 0 : r3103059035698929241.hashCode())) * 31);
    }

    public final String toString() {
        String b = N13757329872968394114.b(this.k);
        String h = U10174709222559481877.h(this.n);
        String h2 = U10174709222559481877.h(this.f312o);
        String o2 = G6547577305291411977.o(this.p, "CompositingStrategy(value=", ")");
        String J = D15913187640519482289.J(this.q);
        StringBuilder k = G11450220448113054352.k("GraphicsLayerElement(scaleX=", this.a, ", scaleY=", this.b, ", alpha=");
        k.append(this.c);
        k.append(", translationX=");
        k.append(this.d);
        k.append(", translationY=");
        k.append(this.e);
        k.append(", shadowElevation=");
        k.append(this.f);
        k.append(", rotationX=");
        k.append(this.g);
        k.append(", rotationY=");
        k.append(this.h);
        k.append(", rotationZ=");
        k.append(this.i);
        k.append(", cameraDistance=");
        k.append(this.j);
        k.append(", transformOrigin=");
        k.append(b);
        k.append(", shape=");
        k.append(this.l);
        k.append(", clip=");
        X2485016533998461232.j(", renderEffect=null, ambientShadowColor=", h, ", spotShadowColor=", k, this.m);
        G6547577305291411977.B(k, h2, ", compositingStrategy=", o2, ", blendMode=");
        k.append(J);
        k.append(", colorFilter=");
        k.append(this.r);
        k.append(", outsets=");
        k.append(this.s);
        k.append(")");
        return k.toString();
    }
}
