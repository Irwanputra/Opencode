package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J15219773361714290912 extends A8269341136279542501 {
    public final F17594658268783405200 a;

    public J15219773361714290912(F17594658268783405200 f17594658268783405200) {
        this.a = f17594658268783405200;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        T7434775781595675721 t7434775781595675721 = new T7434775781595675721();
        t7434775781595675721.f509o = this.a;
        return t7434775781595675721;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        T7434775781595675721 t7434775781595675721 = (T7434775781595675721) r15896830329318850690;
        t7434775781595675721.f509o = this.a;
        E10717724117948616506.n(t7434775781595675721);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof J15219773361714290912) {
            return this.a == ((J15219773361714290912) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
