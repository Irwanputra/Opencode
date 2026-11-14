package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class O18396636586660755082 {
    public final I18162204724392517348 a;
    public final int b;

    public O18396636586660755082(I18162204724392517348 i18162204724392517348, int i) {
        this.a = i18162204724392517348;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O18396636586660755082)) {
            return false;
        }
        O18396636586660755082 o18396636586660755082 = (O18396636586660755082) obj;
        return this.b == o18396636586660755082.b && this.a.equals(o18396636586660755082.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}
