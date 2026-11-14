package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C18014685612837461274 implements dev.epro.r0.B321559534056331132 {
    public final dev.epro.r0.P10756132848474239277 a;
    public final int b;
    public final dev.epro.r0.W12973714701299903186 c;
    public final dev.epro.r0.B13729205492206812220 d;

    public C18014685612837461274(dev.epro.r0.P10756132848474239277 p10756132848474239277, int i, dev.epro.r0.W12973714701299903186 w12973714701299903186, dev.epro.r0.B13729205492206812220 b13729205492206812220) {
        this.a = p10756132848474239277;
        this.b = i;
        this.c = w12973714701299903186;
        this.d = b13729205492206812220;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dev.epro.r0.C18014685612837461274) {
            dev.epro.r0.C18014685612837461274 c18014685612837461274 = (dev.epro.r0.C18014685612837461274) obj;
            if (this.a == c18014685612837461274.a && this.b == c18014685612837461274.b && this.c.equals(c18014685612837461274.c) && dev.epro.r0.S10823041268949770285.t(this.d, c18014685612837461274.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // dev.epro.r0.B321559534056331132
    public final dev.epro.r0.H11646813293457574213 h(dev.epro.r0.I5164649337253478959 i5164649337253478959, dev.epro.r0.G17613326942144185441 g17613326942144185441, long j) {
        long j2;
        if (g17613326942144185441.a0(dev.epro.r0.I16980768508151520658.h(j)) < dev.epro.r0.I16980768508151520658.i(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = dev.epro.r0.I16980768508151520658.b(j2, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        dev.epro.r0.Z17471428274427141949 z17471428274427141949D = g17613326942144185441.d(j);
        int iMin = java.lang.Math.min(z17471428274427141949D.a, dev.epro.r0.I16980768508151520658.i(j2));
        return i5164649337253478959.m(iMin, z17471428274427141949D.b, dev.epro.r0.X9852054718446117252.a, new dev.epro.r0.T6869589956726384891(this, i5164649337253478959, z17471428274427141949D, iMin, (byte) 2));
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + dev.epro.r0.X2485016533998461232.f(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final java.lang.String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ")";
    }
}
