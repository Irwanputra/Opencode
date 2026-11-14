package dev.epro.r0;

import android.graphics.Typeface;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class B734579365046261692 {
    public final Typeface a;
    public final String b;
    public final int c;

    public B734579365046261692(Typeface typeface, String str, int i) {
        this.a = typeface;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof B734579365046261692)) {
            return false;
        }
        B734579365046261692 b734579365046261692 = (B734579365046261692) obj;
        return this.c == b734579365046261692.c && Objects.equals(this.a, b734579365046261692.a) && Objects.equals(this.b, b734579365046261692.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c));
    }
}
