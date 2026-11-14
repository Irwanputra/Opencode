package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Y16840787370955519329 implements N17688611401319956784 {
    public final float a;

    public Y16840787370955519329(float f) {
        this.a = f;
        if (f < 0.0f || f > 100.0f) {
            Y16081827717826519461.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // dev.epro.r0.N17688611401319956784
    public final float a(long j, R8540738700654750557 r8540738700654750557) {
        return (this.a / 100.0f) * W8572396779607072172.b(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Y16840787370955519329) && Float.compare(this.a, ((Y16840787370955519329) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}
