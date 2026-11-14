package dev.epro.r0;

import android.content.res.Resources;
import java.util.Objects;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class E6296634938622743063 {
    public final Resources a;
    public final Resources.Theme b;

    public E6296634938622743063(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && E6296634938622743063.class == obj.getClass()) {
            E6296634938622743063 e6296634938622743063 = (E6296634938622743063) obj;
            if (this.a.equals(e6296634938622743063.a) && Objects.equals(this.b, e6296634938622743063.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
