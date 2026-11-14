package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Y6694875389454854989 implements H4526303238406690808 {
    public final Object a;
    public final Object b;

    public Y6694875389454854989(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // dev.epro.r0.H4526303238406690808
    public final Object b() {
        return this.a;
    }

    @Override // dev.epro.r0.H4526303238406690808
    public final Object d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof H4526303238406690808)) {
            return false;
        }
        H4526303238406690808 h4526303238406690808 = (H4526303238406690808) obj;
        return S10823041268949770285.t(this.a, h4526303238406690808.b()) && S10823041268949770285.t(this.b, h4526303238406690808.d());
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
