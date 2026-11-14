package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J11694349994993559002 {
    public final String a;
    public final Long b;

    public J11694349994993559002(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J11694349994993559002)) {
            return false;
        }
        J11694349994993559002 j11694349994993559002 = (J11694349994993559002) obj;
        return this.a.equals(j11694349994993559002.a) && this.b.equals(j11694349994993559002.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Preference(key=" + this.a + ", value=" + this.b + ')';
    }
}
