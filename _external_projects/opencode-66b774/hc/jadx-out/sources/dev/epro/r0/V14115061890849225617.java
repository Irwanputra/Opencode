package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class V14115061890849225617 implements R8540738700654750557 {
    public final float a;
    public final float b;

    public V14115061890849225617(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V14115061890849225617)) {
            return false;
        }
        V14115061890849225617 v14115061890849225617 = (V14115061890849225617) obj;
        return Float.compare(this.a, v14115061890849225617.a) == 0 && Float.compare(this.b, v14115061890849225617.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float s() {
        return this.b;
    }

    public final String toString() {
        return "DensityImpl(density=" + this.a + ", fontScale=" + this.b + ")";
    }
}
