package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Z16746971161691315984 extends M458157582077333589 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public Z16746971161691315984(float f, float f2, float f3, float f4) {
        super(1);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z16746971161691315984)) {
            return false;
        }
        Z16746971161691315984 z16746971161691315984 = (Z16746971161691315984) obj;
        return Float.compare(this.c, z16746971161691315984.c) == 0 && Float.compare(this.d, z16746971161691315984.d) == 0 && Float.compare(this.e, z16746971161691315984.e) == 0 && Float.compare(this.f, z16746971161691315984.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + E12098517352909843120.e(this.e, E12098517352909843120.e(this.d, Float.hashCode(this.c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder k = G11450220448113054352.k("QuadTo(x1=", this.c, ", y1=", this.d, ", x2=");
        k.append(this.e);
        k.append(", y2=");
        k.append(this.f);
        k.append(")");
        return k.toString();
    }
}
