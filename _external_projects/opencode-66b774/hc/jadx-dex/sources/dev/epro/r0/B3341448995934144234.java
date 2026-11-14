package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B3341448995934144234 implements dev.epro.r0.S17354436298385972004 {
    public final dev.epro.r0.S17354436298385972004 a;
    public final float b;

    public B3341448995934144234(float f, dev.epro.r0.S17354436298385972004 s17354436298385972004) {
        while (s17354436298385972004 instanceof dev.epro.r0.B3341448995934144234) {
            s17354436298385972004 = ((dev.epro.r0.B3341448995934144234) s17354436298385972004).a;
            f += ((dev.epro.r0.B3341448995934144234) s17354436298385972004).b;
        }
        this.a = s17354436298385972004;
        this.b = f;
    }

    public final float a(android.graphics.RectF rectF) {
        return java.lang.Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dev.epro.r0.B3341448995934144234)) {
            return false;
        }
        dev.epro.r0.B3341448995934144234 b3341448995934144234 = (dev.epro.r0.B3341448995934144234) obj;
        return this.a.equals(b3341448995934144234.a) && this.b == b3341448995934144234.b;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.a, java.lang.Float.valueOf(this.b)});
    }
}
