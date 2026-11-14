package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
final class C13648834854383503398 extends A8269341136279542501 {
    public final T1241271073913685060 a;

    public C13648834854383503398(T1241271073913685060 t1241271073913685060) {
        this.a = t1241271073913685060;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        B12901127339566752809 b12901127339566752809 = new B12901127339566752809();
        b12901127339566752809.q = this.a;
        return b12901127339566752809;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        B12901127339566752809 b12901127339566752809 = (B12901127339566752809) r15896830329318850690;
        T1241271073913685060 t1241271073913685060 = b12901127339566752809.q;
        T1241271073913685060 t12412710739136850602 = this.a;
        if (t12412710739136850602.equals(t1241271073913685060)) {
            return;
        }
        b12901127339566752809.q = t12412710739136850602;
        b12901127339566752809.i1();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C13648834854383503398) {
            return ((C13648834854383503398) obj).a.equals(this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
