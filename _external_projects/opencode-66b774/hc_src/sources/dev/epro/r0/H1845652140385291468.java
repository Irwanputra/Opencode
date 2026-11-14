package dev.epro.r0;

import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class H1845652140385291468 {
    public String a;
    public String b;
    public List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H1845652140385291468)) {
            return false;
        }
        H1845652140385291468 h1845652140385291468 = (H1845652140385291468) obj;
        return Objects.equals(this.a, h1845652140385291468.a) && Objects.equals(this.b, h1845652140385291468.b) && Objects.equals(this.c, h1845652140385291468.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
