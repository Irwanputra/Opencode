package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes4.dex */
public final class Z7022156542152740569 {
    public static int k;
    public static final J3301701597851028733 l = new J3301701597851028733(14);
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final A9257386642212911937 f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;

    public Z7022156542152740569(String str, float f, float f2, float f3, float f4, A9257386642212911937 a9257386642212911937, long j, int i, boolean z) {
        int i2;
        synchronized (l) {
            i2 = k;
            k = i2 + 1;
        }
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = a9257386642212911937;
        this.g = j;
        this.h = i;
        this.i = z;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z7022156542152740569)) {
            return false;
        }
        Z7022156542152740569 z7022156542152740569 = (Z7022156542152740569) obj;
        if (!S10823041268949770285.t(this.a, z7022156542152740569.a) || !A891803927997771281.b(this.b, z7022156542152740569.b) || !A891803927997771281.b(this.c, z7022156542152740569.c) || this.d != z7022156542152740569.d || this.e != z7022156542152740569.e || !this.f.equals(z7022156542152740569.f)) {
            return false;
        }
        long j = z7022156542152740569.g;
        int i = U10174709222559481877.i;
        return P15388715743159210616.a(this.g, j) && this.h == z7022156542152740569.h && this.i == z7022156542152740569.i;
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + E12098517352909843120.e(this.e, E12098517352909843120.e(this.d, E12098517352909843120.e(this.c, E12098517352909843120.e(this.b, this.a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i = U10174709222559481877.i;
        return Boolean.hashCode(this.i) + X2485016533998461232.f(this.h, G6547577305291411977.j(hashCode, this.g, 31), 31);
    }
}
