package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J12504654702430902626 {
    public static final J12504654702430902626 c = new J12504654702430902626(2, false);
    public static final J12504654702430902626 d = new J12504654702430902626(1, true);
    public final int a;
    public final boolean b;

    public J12504654702430902626(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J12504654702430902626)) {
            return false;
        }
        J12504654702430902626 j12504654702430902626 = (J12504654702430902626) obj;
        return this.a == j12504654702430902626.a && this.b == j12504654702430902626.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return equals(c) ? "TextMotion.Static" : equals(d) ? "TextMotion.Animated" : "Invalid";
    }
}
