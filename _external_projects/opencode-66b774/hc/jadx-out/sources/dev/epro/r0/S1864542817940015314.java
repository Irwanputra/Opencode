package dev.epro.r0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class S1864542817940015314 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public S1864542817940015314(String str, List list, String str2, List list2, String str3) {
        X2485016533998461232.i(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S1864542817940015314)) {
            return false;
        }
        S1864542817940015314 s1864542817940015314 = (S1864542817940015314) obj;
        if (S10823041268949770285.t(this.a, s1864542817940015314.a) && S10823041268949770285.t(this.b, s1864542817940015314.b) && S10823041268949770285.t(this.c, s1864542817940015314.c) && this.d.equals(s1864542817940015314.d)) {
            return this.e.equals(s1864542817940015314.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + G6547577305291411977.h(E12098517352909843120.h(E12098517352909843120.h(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return G5759126466240281083.s(G5759126466240281083.u("\n            |ForeignKey {\n            |   referenceTable = '" + this.a + "',\n            |   onDelete = '" + this.b + "',\n            |   onUpdate = '" + this.c + "',\n            |   columnNames = {" + D6215562826263076784.o(R9411874267597469228.V0(this.d)) + "\n            |   referenceColumnNames = {" + D6215562826263076784.n(R9411874267597469228.V0(this.e)) + "\n            |}\n        "));
    }
}
