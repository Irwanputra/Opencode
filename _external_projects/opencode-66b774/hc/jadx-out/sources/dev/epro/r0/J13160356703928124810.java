package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J13160356703928124810 {
    public final String a;
    public String b;
    public boolean c = false;
    public U12360584732002626345 d = null;

    public J13160356703928124810(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J13160356703928124810)) {
            return false;
        }
        J13160356703928124810 j13160356703928124810 = (J13160356703928124810) obj;
        return S10823041268949770285.t(this.a, j13160356703928124810.a) && S10823041268949770285.t(this.b, j13160356703928124810.b) && this.c == j13160356703928124810.c && S10823041268949770285.t(this.d, j13160356703928124810.d);
    }

    public final int hashCode() {
        int i = G6547577305291411977.i(E12098517352909843120.h(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        U12360584732002626345 u12360584732002626345 = this.d;
        return i + (u12360584732002626345 == null ? 0 : u12360584732002626345.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.d + ", isShowingSubstitution=" + this.c + ")";
    }
}
