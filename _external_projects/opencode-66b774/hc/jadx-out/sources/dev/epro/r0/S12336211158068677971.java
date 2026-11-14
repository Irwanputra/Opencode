package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class S12336211158068677971 extends A8269341136279542501 {
    public final M7102034154292440921 a;
    public final M7102034154292440921 b;
    public final M7102034154292440921 c;

    public S12336211158068677971(M7102034154292440921 m7102034154292440921, M7102034154292440921 m71020341542924409212, M7102034154292440921 m71020341542924409213) {
        this.a = m7102034154292440921;
        this.b = m71020341542924409212;
        this.c = m71020341542924409213;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        F8767558602150655989 f8767558602150655989 = new F8767558602150655989();
        f8767558602150655989.f239o = this.a;
        f8767558602150655989.p = this.b;
        f8767558602150655989.q = this.c;
        return f8767558602150655989;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        F8767558602150655989 f8767558602150655989 = (F8767558602150655989) r15896830329318850690;
        f8767558602150655989.f239o = this.a;
        f8767558602150655989.p = this.b;
        f8767558602150655989.q = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S12336211158068677971)) {
            return false;
        }
        S12336211158068677971 s12336211158068677971 = (S12336211158068677971) obj;
        return this.a.equals(s12336211158068677971.a) && this.b.equals(s12336211158068677971.b) && this.c.equals(s12336211158068677971.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.a + ", placementSpec=" + this.b + ", fadeOutSpec=" + this.c + ")";
    }
}
