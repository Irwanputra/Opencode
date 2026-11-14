package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class X6003309733835155255 extends R15896830329318850690 implements D10205225622993155321, T11401768751197276141 {
    public boolean A;
    public long B;
    public long C;
    public int D;
    public int E;
    public R3103059035698929241 F;
    public X3174009376965511256 G;
    public K13841493441907392258 H;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f574o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public long y;
    public I5573661370475160895 z;

    @Override // dev.epro.r0.T11401768751197276141
    public final void V(S2460821117650695638 s2460821117650695638) {
        if (this.A) {
            U4676709778812953726.o(s2460821117650695638, this.z);
        }
    }

    @Override // dev.epro.r0.R15896830329318850690
    public final boolean W0() {
        return false;
    }

    @Override // dev.epro.r0.D10205225622993155321
    public final H11646813293457574213 h(I5164649337253478959 i5164649337253478959, G17613326942144185441 g17613326942144185441, long j) {
        Z17471428274427141949 z17471428274427141949D = g17613326942144185441.d(j);
        return i5164649337253478959.m(z17471428274427141949D.a, z17471428274427141949D.b, X9852054718446117252.a, new F16051537739966011766(z17471428274427141949D, this, (byte) 24));
    }

    @Override // dev.epro.r0.T11401768751197276141
    public final boolean k() {
        return false;
    }

    public final String toString() {
        float f = this.f574o;
        float f2 = this.p;
        float f3 = this.q;
        float f4 = this.r;
        float f5 = this.s;
        float f6 = this.t;
        float f7 = this.u;
        float f8 = this.v;
        float f9 = this.w;
        float f10 = this.x;
        String strB = N13757329872968394114.b(this.y);
        I5573661370475160895 i5573661370475160895 = this.z;
        boolean z = this.A;
        String strH = U10174709222559481877.h(this.B);
        String strH2 = U10174709222559481877.h(this.C);
        String strO = G6547577305291411977.o(this.D, "CompositingStrategy(value=", ")");
        String strJ = D15913187640519482289.J(this.E);
        R3103059035698929241 r3103059035698929241 = this.F;
        X3174009376965511256 x3174009376965511256 = this.G;
        StringBuilder sbK = G11450220448113054352.k("SimpleGraphicsLayerModifier(scaleX=", f, ", scaleY=", f2, ", alpha = ");
        sbK.append(f3);
        sbK.append(", translationX=");
        sbK.append(f4);
        sbK.append(", translationY=");
        sbK.append(f5);
        sbK.append(", shadowElevation=");
        sbK.append(f6);
        sbK.append(", rotationX=");
        sbK.append(f7);
        sbK.append(", rotationY=");
        sbK.append(f8);
        sbK.append(", rotationZ=");
        sbK.append(f9);
        sbK.append(", cameraDistance=");
        sbK.append(f10);
        sbK.append(", transformOrigin=");
        sbK.append(strB);
        sbK.append(", shape=");
        sbK.append(i5573661370475160895);
        sbK.append(", clip=");
        X2485016533998461232.j(", renderEffect=null, ambientShadowColor=", strH, ", spotShadowColor=", sbK, z);
        G6547577305291411977.B(sbK, strH2, ", compositingStrategy=", strO, ", blendMode=");
        sbK.append(strJ);
        sbK.append(", colorFilter=");
        sbK.append(r3103059035698929241);
        sbK.append("outsets=");
        sbK.append(x3174009376965511256);
        sbK.append(")");
        return sbK.toString();
    }
}
