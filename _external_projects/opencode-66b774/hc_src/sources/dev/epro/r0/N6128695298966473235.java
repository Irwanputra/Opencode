package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class N6128695298966473235 {
    public static final U11450443558875589191 i = new U11450443558875589191((byte) 3);
    public final int a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final boolean g;
    public final L8604775722691123943 h;

    public N6128695298966473235(int i2, String str, String str2, long j, long j2, long j3, boolean z, int i3) {
        j3 = (i3 & 32) != 0 ? System.currentTimeMillis() : j3;
        z = (i3 & 64) != 0 ? true : z;
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = z;
        if (str.length() == 0 && str2.length() == 0) {
            S10973172697741180971.j("Either pre or post text must not be empty");
            throw null;
        }
        this.h = (str.length() != 0 || str2.length() <= 0) ? (str.length() <= 0 || str2.length() != 0) ? L8604775722691123943.c : L8604775722691123943.b : L8604775722691123943.a;
    }

    public final U13060775246442823499 a() {
        L8604775722691123943 l8604775722691123943 = this.h;
        L8604775722691123943 l86047757226911239432 = L8604775722691123943.b;
        U13060775246442823499 u13060775246442823499 = U13060775246442823499.d;
        if (l8604775722691123943 != l86047757226911239432) {
            return u13060775246442823499;
        }
        long j = this.e;
        if (!F12478849263529740365.d(j)) {
            return u13060775246442823499;
        }
        long j2 = this.d;
        if (F12478849263529740365.d(j2)) {
            return ((int) (j2 >> 32)) > ((int) (j >> 32)) ? U13060775246442823499.a : U13060775246442823499.b;
        }
        int i2 = (int) (j2 >> 32);
        return (i2 == ((int) (j >> 32)) && i2 == this.a) ? U13060775246442823499.c : u13060775246442823499;
    }
}
