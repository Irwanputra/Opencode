package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class H14390007865053637179 implements B321559534056331132 {
    public final P10756132848474239277 a;
    public final int b;
    public final W12973714701299903186 c;
    public final B13729205492206812220 d;

    public H14390007865053637179(P10756132848474239277 p10756132848474239277, int i, W12973714701299903186 w12973714701299903186, B13729205492206812220 b13729205492206812220) {
        this.a = p10756132848474239277;
        this.b = i;
        this.c = w12973714701299903186;
        this.d = b13729205492206812220;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof H14390007865053637179) {
            H14390007865053637179 h14390007865053637179 = (H14390007865053637179) obj;
            if (this.a == h14390007865053637179.a && this.b == h14390007865053637179.b && this.c.equals(h14390007865053637179.c) && S10823041268949770285.t(this.d, h14390007865053637179.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // dev.epro.r0.B321559534056331132
    public final H11646813293457574213 h(I5164649337253478959 i5164649337253478959, G17613326942144185441 g17613326942144185441, long j) {
        Z17471428274427141949 z17471428274427141949D = g17613326942144185441.d(I16980768508151520658.b(j, 0, 0, 0, Integer.MAX_VALUE, 7));
        int iMin = Math.min(z17471428274427141949D.b, I16980768508151520658.h(j));
        return i5164649337253478959.m(z17471428274427141949D.a, iMin, X9852054718446117252.a, new C16936830270381006423(this, z17471428274427141949D, iMin, (byte) 6));
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + X2485016533998461232.f(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ")";
    }
}
