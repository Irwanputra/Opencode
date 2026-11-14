package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class W10348577308927504951 {
    public static final W10348577308927504951 c = new W10348577308927504951(0.0f, new W11178805066658661419(0.0f));
    public final float a;
    public final W11178805066658661419 b;

    public W10348577308927504951(float f, W11178805066658661419 w11178805066658661419) {
        this.a = f;
        this.b = w11178805066658661419;
        if (Float.isNaN(f)) {
            S10973172697741180971.j("current must not be NaN");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W10348577308927504951)) {
            return false;
        }
        W10348577308927504951 w10348577308927504951 = (W10348577308927504951) obj;
        return this.a == w10348577308927504951.a && S10823041268949770285.t(this.b, w10348577308927504951.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.a + ", range=" + this.b + ", steps=0)";
    }
}
