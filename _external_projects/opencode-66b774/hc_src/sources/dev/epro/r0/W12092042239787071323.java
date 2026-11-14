package dev.epro.r0;

import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class W12092042239787071323 {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public W12092042239787071323(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        abstractSet.getClass();
        this.a = str;
        this.b = map;
        this.c = abstractSet;
        this.d = abstractSet2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W12092042239787071323)) {
            return false;
        }
        W12092042239787071323 w12092042239787071323 = (W12092042239787071323) obj;
        if (!this.a.equals(w12092042239787071323.a) || !this.b.equals(w12092042239787071323.b) || !this.c.equals(w12092042239787071323.c)) {
            return false;
        }
        Set set2 = this.d;
        if (set2 == null || (set = w12092042239787071323.d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.a);
        sb.append("',\n            |    columns = {");
        sb.append(D6215562826263076784.m(R9411874267597469228.W0(this.b.values(), new J10770752472956524045((byte) 15))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(D6215562826263076784.m(this.c));
        sb.append("\n            |    indices = {");
        Set set = this.d;
        sb.append(D6215562826263076784.m(set != null ? R9411874267597469228.W0(set, new J10770752472956524045((byte) 16)) : O2161699089510411363.a));
        sb.append("\n            |}\n        ");
        return G5759126466240281083.u(sb.toString());
    }
}
