package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class G16328427575579136251 implements N17688611401319956784 {
    public final float a;

    public G16328427575579136251(float f) {
        this.a = f;
    }

    @Override // dev.epro.r0.N17688611401319956784
    public final float a(long j, R8540738700654750557 r8540738700654750557) {
        return r8540738700654750557.K(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof G16328427575579136251) && A891803927997771281.b(this.a, ((G16328427575579136251) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".dp)";
    }
}
