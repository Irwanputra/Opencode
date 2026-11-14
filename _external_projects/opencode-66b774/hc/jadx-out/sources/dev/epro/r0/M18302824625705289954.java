package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M18302824625705289954 extends A8269341136279542501 {
    public final R8029976778412248429 a;
    public final boolean b;
    public final int c;
    public final M7102034154292440921 d;

    public M18302824625705289954(R8029976778412248429 r8029976778412248429, boolean z, int i, M7102034154292440921 m7102034154292440921) {
        this.a = r8029976778412248429;
        this.b = z;
        this.c = i;
        this.d = m7102034154292440921;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        return new E18104834745338047524(this.a, this.b, this.c, this.d);
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        E18104834745338047524 e18104834745338047524 = (E18104834745338047524) r15896830329318850690;
        R8029976778412248429 r8029976778412248429 = this.a;
        e18104834745338047524.q = r8029976778412248429;
        e18104834745338047524.r = this.b;
        M7102034154292440921 m7102034154292440921 = this.d;
        e18104834745338047524.t = m7102034154292440921;
        int i = e18104834745338047524.s;
        int i2 = this.c;
        if (i == i2) {
            return;
        }
        e18104834745338047524.s = i2;
        R7033599853981556291.E(e18104834745338047524.V0(), null, null, new Y14354959068095823168(r8029976778412248429, m7102034154292440921, null, (byte) 12), 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M18302824625705289954)) {
            return false;
        }
        M18302824625705289954 m18302824625705289954 = (M18302824625705289954) obj;
        return S10823041268949770285.t(this.a, m18302824625705289954.a) && this.b == m18302824625705289954.b && this.c == m18302824625705289954.c && this.d.equals(m18302824625705289954.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + X2485016533998461232.f(this.c, G6547577305291411977.i(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClockDialModifier(state=");
        sb.append(this.a);
        sb.append(", autoSwitchToMinute=");
        sb.append(this.b);
        sb.append(", selection=");
        int i = this.c;
        sb.append((Object) (i == 0 ? "Hour" : i == 1 ? "Minute" : ""));
        sb.append(", animationSpec=");
        sb.append(this.d);
        sb.append(')');
        return sb.toString();
    }
}
