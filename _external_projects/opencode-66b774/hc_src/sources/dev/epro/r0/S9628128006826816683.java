package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class S9628128006826816683 implements S5658423376814904854 {
    public final String a;
    public final int b;
    public final String c;
    public final String d;

    public S9628128006826816683(String str, int i, String str2, String str3) {
        if (i < 0) {
            S10973172697741180971.j("proxyPort must be non-negative");
            throw null;
        }
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
    }

    public S9628128006826816683(int i) {
        this("127.0.0.1", i, null, null);
    }
}
