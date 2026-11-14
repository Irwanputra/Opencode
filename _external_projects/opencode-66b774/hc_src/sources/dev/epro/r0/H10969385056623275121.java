package dev.epro.r0;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class H10969385056623275121 {
    public final String a;
    public final boolean b;
    public final List c;
    public final List d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public H10969385056623275121(String str, boolean z, List list, List list2) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof H10969385056623275121) {
            H10969385056623275121 h10969385056623275121 = (H10969385056623275121) obj;
            String str = h10969385056623275121.a;
            if (this.b == h10969385056623275121.b && this.c.equals(h10969385056623275121.c) && S10823041268949770285.t(this.d, h10969385056623275121.d)) {
                String str2 = this.a;
                return Z13168519540281190457.F(str2, "index_", false) ? Z13168519540281190457.F(str, "index_", false) : str2.equals(str);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + G6547577305291411977.h((((Z13168519540281190457.F(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.b ? 1 : 0)) * 31, 31, this.c);
    }

    public final String toString() {
        return G5759126466240281083.s(G5759126466240281083.u("\n            |Index {\n            |   name = '" + this.a + "',\n            |   unique = '" + this.b + "',\n            |   columns = {" + D6215562826263076784.o(this.c) + "\n            |   orders = {" + D6215562826263076784.n(this.d) + "\n            |}\n        "));
    }
}
