package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class S13297578932192364679 implements D14012262140144083539 {
    public final boolean a;

    public S13297578932192364679(boolean z) {
        this.a = z;
    }

    @Override // dev.epro.r0.D14012262140144083539
    public final boolean b() {
        return this.a;
    }

    @Override // dev.epro.r0.D14012262140144083539
    public final D15128981762807597517 d() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.a ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
