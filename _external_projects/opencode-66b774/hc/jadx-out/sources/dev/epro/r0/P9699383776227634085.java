package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P9699383776227634085 {
    public final String a;
    public final char b;
    public final String c;

    public P9699383776227634085(String str, char c) {
        this.a = str;
        this.b = c;
        this.c = Z13168519540281190457.D(false, str, String.valueOf(c), "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P9699383776227634085)) {
            return false;
        }
        P9699383776227634085 p9699383776227634085 = (P9699383776227634085) obj;
        return this.a.equals(p9699383776227634085.a) && this.b == p9699383776227634085.b;
    }

    public final int hashCode() {
        return Character.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DateInputFormat(patternWithDelimiters=" + this.a + ", delimiter=" + this.b + ')';
    }
}
