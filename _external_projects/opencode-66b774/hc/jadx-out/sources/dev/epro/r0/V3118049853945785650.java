package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class V3118049853945785650 {
    public final A859764726080529380 a;
    public final H7219028874700587498 b;

    public V3118049853945785650(A859764726080529380 a859764726080529380, H7219028874700587498 h7219028874700587498) {
        this.a = a859764726080529380;
        this.b = h7219028874700587498;
    }

    public final void a() {
        H7219028874700587498 h7219028874700587498 = this.b;
        if (h7219028874700587498.s() instanceof B9271643986061518267) {
            h7219028874700587498.resumeWith(X7212110667969877701.a);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && V3118049853945785650.class == obj.getClass()) {
            V3118049853945785650 v3118049853945785650 = (V3118049853945785650) obj;
            return S10823041268949770285.t(this.a, v3118049853945785650.a) && this.b == v3118049853945785650.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
