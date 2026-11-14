package dev.epro.r0;

import androidx.work.OverwritingInputMerger;
import net.zetetic.database.CursorWindow;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class L16425900549479658727 {
    public final String a;
    public Y8203071358079267502 b;
    public final String c;
    public final String d;
    public Z4023314114778119473 e;
    public final Z4023314114778119473 f;
    public final long g;
    public final long h;
    public final long i;
    public K13184022901285147448 j;
    public final int k;
    public final Y6144095862626460568 l;
    public final long m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f345o;
    public final long p;
    public boolean q;
    public final W17497847401432715949 r;
    public final int s;
    public final int t;
    public final long u;
    public final int v;
    public final int w;
    public String x;
    public final Boolean y;

    static {
        B14824868959299866349.o("WorkSpec");
    }

    public /* synthetic */ L16425900549479658727(String str, Y8203071358079267502 y8203071358079267502, String str2, String str3, Z4023314114778119473 z4023314114778119473, Z4023314114778119473 z40233141147781194732, long j, long j2, long j3, K13184022901285147448 k13184022901285147448, int i, Y6144095862626460568 y6144095862626460568, long j4, long j5, long j6, long j7, boolean z, W17497847401432715949 w17497847401432715949, int i2, long j8, int i3, int i4, String str4, Boolean bool, int i5) {
        this(str, (i5 & 2) != 0 ? Y8203071358079267502.a : y8203071358079267502, str2, (i5 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i5 & 16) != 0 ? Z4023314114778119473.b : z4023314114778119473, (i5 & 32) != 0 ? Z4023314114778119473.b : z40233141147781194732, (i5 & 64) != 0 ? 0L : j, (i5 & 128) != 0 ? 0L : j2, (i5 & 256) != 0 ? 0L : j3, (i5 & 512) != 0 ? K13184022901285147448.j : k13184022901285147448, (i5 & 1024) != 0 ? 0 : i, (i5 & 2048) != 0 ? Y6144095862626460568.a : y6144095862626460568, (i5 & 4096) != 0 ? 30000L : j4, (i5 & 8192) != 0 ? -1L : j5, (i5 & CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE) == 0 ? j6 : 0L, (32768 & i5) != 0 ? -1L : j7, (65536 & i5) != 0 ? false : z, (131072 & i5) != 0 ? W17497847401432715949.a : w17497847401432715949, (262144 & i5) != 0 ? 0 : i2, 0, (1048576 & i5) != 0 ? Long.MAX_VALUE : j8, (2097152 & i5) != 0 ? 0 : i3, (4194304 & i5) != 0 ? -256 : i4, (8388608 & i5) != 0 ? null : str4, (i5 & 16777216) != 0 ? Boolean.FALSE : bool);
    }

    public static L16425900549479658727 b(L16425900549479658727 l16425900549479658727, String str, Z4023314114778119473 z4023314114778119473) {
        String str2 = l16425900549479658727.a;
        Y8203071358079267502 y8203071358079267502 = l16425900549479658727.b;
        String str3 = l16425900549479658727.d;
        Z4023314114778119473 z40233141147781194732 = l16425900549479658727.f;
        long j = l16425900549479658727.g;
        long j2 = l16425900549479658727.h;
        long j3 = l16425900549479658727.i;
        K13184022901285147448 k13184022901285147448 = l16425900549479658727.j;
        int i = l16425900549479658727.k;
        Y6144095862626460568 y6144095862626460568 = l16425900549479658727.l;
        long j4 = l16425900549479658727.m;
        long j5 = l16425900549479658727.n;
        long j6 = l16425900549479658727.f345o;
        long j7 = l16425900549479658727.p;
        boolean z = l16425900549479658727.q;
        W17497847401432715949 w17497847401432715949 = l16425900549479658727.r;
        int i2 = l16425900549479658727.s;
        int i3 = l16425900549479658727.t;
        long j8 = l16425900549479658727.u;
        int i4 = l16425900549479658727.v;
        int i5 = l16425900549479658727.w;
        String str4 = l16425900549479658727.x;
        Boolean bool = l16425900549479658727.y;
        str2.getClass();
        y8203071358079267502.getClass();
        str3.getClass();
        z40233141147781194732.getClass();
        k13184022901285147448.getClass();
        y6144095862626460568.getClass();
        w17497847401432715949.getClass();
        return new L16425900549479658727(str2, y8203071358079267502, str, str3, z4023314114778119473, z40233141147781194732, j, j2, j3, k13184022901285147448, i, y6144095862626460568, j4, j5, j6, j7, z, w17497847401432715949, i2, i3, j8, i4, i5, str4, bool);
    }

    public final long a() {
        Y8203071358079267502 y8203071358079267502 = this.b;
        Y8203071358079267502 y82030713580792675022 = Y8203071358079267502.a;
        int i = this.k;
        boolean z = y8203071358079267502 == y82030713580792675022 && i > 0;
        long j = this.n;
        boolean zC = c();
        Y6144095862626460568 y6144095862626460568 = this.l;
        y6144095862626460568.getClass();
        long j2 = this.u;
        int i2 = this.s;
        if (j2 != Long.MAX_VALUE && zC) {
            if (i2 != 0) {
                long j3 = j + 900000;
                if (j2 < j3) {
                    return j3;
                }
            }
            return j2;
        }
        if (z) {
            Y6144095862626460568 y61440958626264605682 = Y6144095862626460568.b;
            long j4 = this.m;
            long jScalb = y6144095862626460568 == y61440958626264605682 ? j4 * ((long) i) : (long) Math.scalb(j4, i - 1);
            if (jScalb > 18000000) {
                jScalb = 18000000;
            }
            return j + jScalb;
        }
        long j5 = this.g;
        if (!zC) {
            if (j == -1) {
                return Long.MAX_VALUE;
            }
            return j + j5;
        }
        long j6 = this.h;
        long j7 = i2 == 0 ? j + j5 : j + j6;
        long j8 = this.i;
        return (j8 == j6 || i2 != 0) ? j7 : (j6 - j8) + j7;
    }

    public final boolean c() {
        return this.h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L16425900549479658727)) {
            return false;
        }
        L16425900549479658727 l16425900549479658727 = (L16425900549479658727) obj;
        return S10823041268949770285.t(this.a, l16425900549479658727.a) && this.b == l16425900549479658727.b && S10823041268949770285.t(this.c, l16425900549479658727.c) && S10823041268949770285.t(this.d, l16425900549479658727.d) && S10823041268949770285.t(this.e, l16425900549479658727.e) && S10823041268949770285.t(this.f, l16425900549479658727.f) && this.g == l16425900549479658727.g && this.h == l16425900549479658727.h && this.i == l16425900549479658727.i && S10823041268949770285.t(this.j, l16425900549479658727.j) && this.k == l16425900549479658727.k && this.l == l16425900549479658727.l && this.m == l16425900549479658727.m && this.n == l16425900549479658727.n && this.f345o == l16425900549479658727.f345o && this.p == l16425900549479658727.p && this.q == l16425900549479658727.q && this.r == l16425900549479658727.r && this.s == l16425900549479658727.s && this.t == l16425900549479658727.t && this.u == l16425900549479658727.u && this.v == l16425900549479658727.v && this.w == l16425900549479658727.w && S10823041268949770285.t(this.x, l16425900549479658727.x) && S10823041268949770285.t(this.y, l16425900549479658727.y);
    }

    public final int hashCode() {
        int iF = X2485016533998461232.f(this.w, X2485016533998461232.f(this.v, G6547577305291411977.j(X2485016533998461232.f(this.t, X2485016533998461232.f(this.s, (this.r.hashCode() + G6547577305291411977.i(G6547577305291411977.j(G6547577305291411977.j(G6547577305291411977.j(G6547577305291411977.j((this.l.hashCode() + X2485016533998461232.f(this.k, (this.j.hashCode() + G6547577305291411977.j(G6547577305291411977.j(G6547577305291411977.j((this.f.hashCode() + ((this.e.hashCode() + E12098517352909843120.h(E12098517352909843120.h((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31)) * 31, this.g, 31), this.h, 31), this.i, 31)) * 31, 31)) * 31, this.m, 31), this.n, 31), this.f345o, 31), this.p, 31), 31, this.q)) * 31, 31), 31), this.u, 31), 31), 31);
        String str = this.x;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.y;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "{WorkSpec: " + this.a + '}';
    }

    public L16425900549479658727(String str, Y8203071358079267502 y8203071358079267502, String str2, String str3, Z4023314114778119473 z4023314114778119473, Z4023314114778119473 z40233141147781194732, long j, long j2, long j3, K13184022901285147448 k13184022901285147448, int i, Y6144095862626460568 y6144095862626460568, long j4, long j5, long j6, long j7, boolean z, W17497847401432715949 w17497847401432715949, int i2, int i3, long j8, int i4, int i5, String str4, Boolean bool) {
        str.getClass();
        y8203071358079267502.getClass();
        str2.getClass();
        str3.getClass();
        z4023314114778119473.getClass();
        z40233141147781194732.getClass();
        k13184022901285147448.getClass();
        y6144095862626460568.getClass();
        w17497847401432715949.getClass();
        this.a = str;
        this.b = y8203071358079267502;
        this.c = str2;
        this.d = str3;
        this.e = z4023314114778119473;
        this.f = z40233141147781194732;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = k13184022901285147448;
        this.k = i;
        this.l = y6144095862626460568;
        this.m = j4;
        this.n = j5;
        this.f345o = j6;
        this.p = j7;
        this.q = z;
        this.r = w17497847401432715949;
        this.s = i2;
        this.t = i3;
        this.u = j8;
        this.v = i4;
        this.w = i5;
        this.x = str4;
        this.y = bool;
    }
}
