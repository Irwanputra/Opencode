package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class C18014685612837461274 implements B321559534056331132 {
    public final P10756132848474239277 a;
    public final int b;
    public final W12973714701299903186 c;
    public final B13729205492206812220 d;

    public C18014685612837461274(P10756132848474239277 p10756132848474239277, int i, W12973714701299903186 w12973714701299903186, B13729205492206812220 b13729205492206812220) {
        this.a = p10756132848474239277;
        this.b = i;
        this.c = w12973714701299903186;
        this.d = b13729205492206812220;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C18014685612837461274) {
            C18014685612837461274 c18014685612837461274 = (C18014685612837461274) obj;
            if (this.a == c18014685612837461274.a && this.b == c18014685612837461274.b && this.c.equals(c18014685612837461274.c) && S10823041268949770285.t(this.d, c18014685612837461274.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // dev.epro.r0.B321559534056331132
    public final H11646813293457574213 h(I5164649337253478959 i5164649337253478959, G17613326942144185441 g17613326942144185441, long j) {
        long j2;
        if (g17613326942144185441.a0(I16980768508151520658.h(j)) < I16980768508151520658.i(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = I16980768508151520658.b(j2, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        Z17471428274427141949 d = g17613326942144185441.d(j);
        int min = Math.min(d.a, I16980768508151520658.i(j2));
        return i5164649337253478959.m(min, d.b, X9852054718446117252.a, new T6869589956726384891(this, i5164649337253478959, d, min, (byte) 2));
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + X2485016533998461232.f(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ")";
    }
}
