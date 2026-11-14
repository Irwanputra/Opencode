package dev.epro.r0;

import java.util.Locale;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L6737218101458117862 {
    public final Locale a;

    public L6737218101458117862(Locale locale) {
        this.a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof L6737218101458117862)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return S10823041268949770285.t(this.a.toLanguageTag(), ((L6737218101458117862) obj).a.toLanguageTag());
    }

    public final int hashCode() {
        return this.a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.a.toLanguageTag();
    }
}
