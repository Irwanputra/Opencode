package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class R13606847544478402433 extends R10975805389692362869 {
    public final Z4023314114778119473 a = Z4023314114778119473.b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || R13606847544478402433.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((R13606847544478402433) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (R13606847544478402433.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }
}
