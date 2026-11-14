package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M3397403720270972864 {
    public static final M3397403720270972864 c = new M3397403720270972864(0, false);
    public final boolean a;
    public final int b;

    public M3397403720270972864() {
        this.a = false;
        this.b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M3397403720270972864)) {
            return false;
        }
        M3397403720270972864 m3397403720270972864 = (M3397403720270972864) obj;
        return this.a == m3397403720270972864.a && this.b == m3397403720270972864.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.a + ", emojiSupportMatch=" + K971002982358050436.a(this.b) + ")";
    }

    public M3397403720270972864(int i, boolean z) {
        this.a = z;
        this.b = i;
    }
}
