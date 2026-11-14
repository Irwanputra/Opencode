package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class A16798789777035163011 {
    public static final A16798789777035163011 d = new A16798789777035163011("", "", false);
    public static final A16798789777035163011 e = new A16798789777035163011("\n", "  ", true);
    public final String a;
    public final String b;
    public final boolean c;

    public A16798789777035163011(String str, String str2, boolean z) {
        if (!str.matches("[\r\n]*")) {
            S10973172697741180971.j("Only combinations of \\n and \\r are allowed in newline.");
            throw null;
        }
        if (!str2.matches("[ \t]*")) {
            S10973172697741180971.j("Only combinations of spaces and tabs are allowed in indent.");
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = z;
    }
}
