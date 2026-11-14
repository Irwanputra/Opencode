package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class X14437668849694674461 {
    public final Float a;
    public J6301524036964264730 b;

    public X14437668849694674461(Float f, J6301524036964264730 j6301524036964264730) {
        this.a = f;
        this.b = j6301524036964264730;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X14437668849694674461)) {
            return false;
        }
        X14437668849694674461 x14437668849694674461 = (X14437668849694674461) obj;
        return x14437668849694674461.a.equals(this.a) && S10823041268949770285.t(x14437668849694674461.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + X2485016533998461232.f(0, this.a.hashCode() * 31, 31);
    }
}
