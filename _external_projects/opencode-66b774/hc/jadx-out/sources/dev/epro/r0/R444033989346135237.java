package dev.epro.r0;

import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R444033989346135237 {
    public final String a;
    public final String b;
    public final Set c;

    public R444033989346135237(String str, String str2, Set set) {
        this.a = str;
        this.b = str2;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof R444033989346135237)) {
            return false;
        }
        R444033989346135237 r444033989346135237 = (R444033989346135237) obj;
        return Objects.equals(this.a, r444033989346135237.a) && Objects.equals(this.b, r444033989346135237.b) && Objects.equals(this.c, r444033989346135237.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
