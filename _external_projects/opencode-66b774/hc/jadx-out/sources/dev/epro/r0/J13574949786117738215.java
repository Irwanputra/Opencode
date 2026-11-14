package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
final class J13574949786117738215 extends A8269341136279542501 {
    public final K15228821986458594157 a;

    public J13574949786117738215(K15228821986458594157 k15228821986458594157) {
        this.a = k15228821986458594157;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        return new P16630550584911471521(this.a);
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        P16630550584911471521 p16630550584911471521 = (P16630550584911471521) r15896830329318850690;
        K15228821986458594157 k15228821986458594157 = this.a;
        p16630550584911471521.f424o = k15228821986458594157;
        if (p16630550584911471521.n) {
            k15228821986458594157.invoke(p16630550584911471521.p);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof J13574949786117738215) {
            return this.a == ((J13574949786117738215) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
