package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A16798789777035163011 {
    public static final dev.epro.r0.A16798789777035163011 d = new dev.epro.r0.A16798789777035163011("", "", false);
    public static final dev.epro.r0.A16798789777035163011 e = new dev.epro.r0.A16798789777035163011("\n", "  ", true);
    public final java.lang.String a;
    public final java.lang.String b;
    public final boolean c;

    public A16798789777035163011(java.lang.String str, java.lang.String str2, boolean z) {
        if (!str.matches("[\r\n]*")) {
            dev.epro.r0.S10973172697741180971.j("Only combinations of \\n and \\r are allowed in newline.");
            throw null;
        }
        if (!str2.matches("[ \t]*")) {
            dev.epro.r0.S10973172697741180971.j("Only combinations of spaces and tabs are allowed in indent.");
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = z;
    }
}
