package dev.epro.r0;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Y523155941519587740 {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final byte f;
    public final int g;

    /* JADX WARN: Multi-variable type inference failed */
    public Y523155941519587740(String str, int i, String str2, String str3, int i2, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
        this.f = i2;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        this.g = M8927913404651150384.L(upperCase, "INT", false) ? 3 : (M8927913404651150384.L(upperCase, "CHAR", false) || M8927913404651150384.L(upperCase, "CLOB", false) || M8927913404651150384.L(upperCase, "TEXT", false)) ? 2 : M8927913404651150384.L(upperCase, "BLOB", false) ? 5 : (M8927913404651150384.L(upperCase, "REAL", false) || M8927913404651150384.L(upperCase, "FLOA", false) || M8927913404651150384.L(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Y523155941519587740) {
                boolean z = this.d > 0;
                Y523155941519587740 y523155941519587740 = (Y523155941519587740) obj;
                byte b = y523155941519587740.f;
                if (z == (y523155941519587740.d > 0) && S10823041268949770285.t(this.a, y523155941519587740.a) && this.c == y523155941519587740.c) {
                    String str = y523155941519587740.e;
                    byte b2 = this.f;
                    String str2 = this.e;
                    if ((b2 != 1 || b != 2 || str2 == null || D6215562826263076784.k(str2, str)) && ((b2 != 2 || b != 1 || str == null || D6215562826263076784.k(str, str2)) && ((b2 == 0 || b2 != b || (str2 == null ? str == null : D6215562826263076784.k(str2, str))) && this.g == y523155941519587740.g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.g) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   type = '");
        sb.append(this.b);
        sb.append("',\n            |   affinity = '");
        sb.append(this.g);
        sb.append("',\n            |   notNull = '");
        sb.append(this.c);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.d);
        sb.append("',\n            |   defaultValue = '");
        String str = this.e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return G5759126466240281083.s(G5759126466240281083.u(sb.toString()));
    }
}
