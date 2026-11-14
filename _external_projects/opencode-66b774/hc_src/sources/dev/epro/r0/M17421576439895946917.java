package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class M17421576439895946917 implements S5658423376814904854 {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;

    public M17421576439895946917(int i, String str, String str2, String str3, String str4) {
        if (i < 0) {
            S10973172697741180971.j("proxyPort must be non-negative");
            throw null;
        }
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        if (str4 == null || !str4.startsWith("socks4")) {
            this.e = 2;
        } else {
            this.e = 1;
        }
    }
}
