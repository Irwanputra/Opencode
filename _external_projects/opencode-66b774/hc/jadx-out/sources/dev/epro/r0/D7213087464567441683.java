package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class D7213087464567441683 {
    public final boolean a;
    public final boolean b;

    public D7213087464567441683(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D7213087464567441683)) {
            return false;
        }
        D7213087464567441683 d7213087464567441683 = (D7213087464567441683) obj;
        return this.a == d7213087464567441683.a && this.b == d7213087464567441683.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "InputTextSuggestionState(isCommittedByInputMethodEditor=" + this.a + ", suggestionSelected=" + this.b + ")";
    }
}
