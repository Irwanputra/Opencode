package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class T4643696886244492064 {
    public final String a;
    public final int b;

    public T4643696886244492064(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T4643696886244492064)) {
            return false;
        }
        T4643696886244492064 t4643696886244492064 = (T4643696886244492064) obj;
        return S10823041268949770285.t(this.a, t4643696886244492064.a) && this.b == t4643696886244492064.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WorkGenerationalId(workSpecId=" + this.a + ", generation=" + this.b + ')';
    }
}
