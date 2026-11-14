package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class U6672801493511051432 {
    public final int a;
    public final int b;
    public final String c;

    static {
        int i = 320;
        new U6672801493511051432(i, 50, "320x50_mb");
        String str = null;
        new U6672801493511051432(468, 60, str);
        new U6672801493511051432(i, 100, str);
        new U6672801493511051432(728, 90, str);
        new U6672801493511051432(300, 250, str);
        int i2 = -3;
        new U6672801493511051432(i2, -4, "fluid");
        int i3 = 0;
        new U6672801493511051432(i2, i3, "search_v2");
        new U6672801493511051432(i3, i3, "invalid");
        new U6672801493511051432(160, 600, "160x600_as");
    }

    public U6672801493511051432(int i, int i2, String str, boolean z, boolean z2) {
        this.a = i;
        this.b = i2;
        if (str == null) {
            str = i + "x" + i2 + "_as";
        }
        this.c = str;
        if (i < 0 && i != -3) {
            S10973172697741180971.i(G6547577305291411977.n(i, "Invalid width for AdSize: "));
            throw null;
        }
        if (i2 < 0 && i2 != -4) {
            S10973172697741180971.i(G6547577305291411977.n(i2, "Invalid height for AdSize: "));
            throw null;
        }
        if (z && z2) {
            S10973172697741180971.j("AdSize cannot be both inline and anchored adaptive");
            throw null;
        }
        if (!z2 || i2 >= 1) {
            return;
        }
        S10973172697741180971.j("An inline AdSize must have a positive height");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof U6672801493511051432)) {
            return false;
        }
        U6672801493511051432 u6672801493511051432 = (U6672801493511051432) obj;
        return this.a == u6672801493511051432.a && this.b == u6672801493511051432.b && S10823041268949770285.t(this.c, u6672801493511051432.c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return this.c;
    }

    public /* synthetic */ U6672801493511051432(int i, int i2, String str) {
        this(i, i2, str, false, false);
    }
}
