package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B734579365046261692 {
    public final android.graphics.Typeface a;
    public final java.lang.String b;
    public final int c;

    public B734579365046261692(android.graphics.Typeface typeface, java.lang.String str, int i) {
        this.a = typeface;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof dev.epro.r0.B734579365046261692)) {
            return false;
        }
        dev.epro.r0.B734579365046261692 b734579365046261692 = (dev.epro.r0.B734579365046261692) obj;
        return this.c == b734579365046261692.c && java.util.Objects.equals(this.a, b734579365046261692.a) && java.util.Objects.equals(this.b, b734579365046261692.b);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.a, this.b, java.lang.Integer.valueOf(this.c));
    }
}
