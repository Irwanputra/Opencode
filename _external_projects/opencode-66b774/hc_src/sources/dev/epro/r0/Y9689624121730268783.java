package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Y9689624121730268783 implements T12552481909083146428 {
    public final long a;

    public Y9689624121730268783(long j) {
        this.a = j;
        if (j != 16) {
            return;
        }
        T12055643479535528558.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // dev.epro.r0.T12552481909083146428
    public final float a() {
        return U10174709222559481877.c(this.a);
    }

    @Override // dev.epro.r0.T12552481909083146428
    public final long b() {
        return this.a;
    }

    @Override // dev.epro.r0.T12552481909083146428
    public final D14208870094104617988 c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y9689624121730268783)) {
            return false;
        }
        long j = ((Y9689624121730268783) obj).a;
        int i = U10174709222559481877.i;
        return P15388715743159210616.a(this.a, j);
    }

    public final int hashCode() {
        int i = U10174709222559481877.i;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return G6547577305291411977.s("ColorStyle(value=", U10174709222559481877.h(this.a), ")");
    }
}
