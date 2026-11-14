package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class H10924029057425269323 {
    public final byte a;

    public final boolean equals(Object obj) {
        if (obj instanceof H10924029057425269323) {
            return this.a == ((H10924029057425269323) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        byte b = this.a;
        return b == 0 ? "Button" : b == 1 ? "Checkbox" : b == 2 ? "Switch" : b == 3 ? "RadioButton" : b == 4 ? "Tab" : b == 5 ? "Image" : b == 6 ? "DropdownList" : b == 7 ? "Picker" : b == 8 ? "Carousel" : "Unknown";
    }
}
