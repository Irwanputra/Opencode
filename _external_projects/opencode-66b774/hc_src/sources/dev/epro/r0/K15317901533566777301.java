package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class K15317901533566777301 {
    public final I15162792415829416729 a;
    public int b;
    public int c;
    public int d;
    public int e;

    public K15317901533566777301(M11181104712105445833 m11181104712105445833, long j) {
        String str = m11181104712105445833.b;
        I15162792415829416729 i15162792415829416729 = new I15162792415829416729();
        i15162792415829416729.d = str;
        i15162792415829416729.b = -1;
        i15162792415829416729.c = -1;
        this.a = i15162792415829416729;
        this.b = F12478849263529740365.g(j);
        this.c = F12478849263529740365.f(j);
        this.d = -1;
        this.e = -1;
        int g = F12478849263529740365.g(j);
        int f = F12478849263529740365.f(j);
        if (g < 0 || g > str.length()) {
            W4415201450379021245.a(E12098517352909843120.l("start (", g, str.length(), ") offset is outside of text region "));
            throw null;
        }
        if (f < 0 || f > str.length()) {
            W4415201450379021245.a(E12098517352909843120.l("end (", f, str.length(), ") offset is outside of text region "));
            throw null;
        }
        if (g <= f) {
            return;
        }
        S10973172697741180971.j(E12098517352909843120.l("Do not set reversed range: ", g, f, " > "));
        throw null;
    }

    public final void a(int i, int i2) {
        long d = T1335862270807194835.d(i, i2);
        this.a.q(i, i2, "");
        long S = M18113111391818111737.S(T1335862270807194835.d(this.b, this.c), d);
        h(F12478849263529740365.g(S));
        g(F12478849263529740365.f(S));
        int i3 = this.d;
        if (i3 != -1) {
            long S2 = M18113111391818111737.S(T1335862270807194835.d(i3, this.e), d);
            if (F12478849263529740365.d(S2)) {
                this.d = -1;
                this.e = -1;
            } else {
                this.d = F12478849263529740365.g(S2);
                this.e = F12478849263529740365.f(S2);
            }
        }
    }

    public final char b(int i) {
        I15162792415829416729 i15162792415829416729 = this.a;
        T17027910246883169756 t17027910246883169756 = (T17027910246883169756) i15162792415829416729.e;
        if (t17027910246883169756 == null) {
            return ((String) i15162792415829416729.d).charAt(i);
        }
        if (i < i15162792415829416729.b) {
            return ((String) i15162792415829416729.d).charAt(i);
        }
        int a = t17027910246883169756.b - t17027910246883169756.a();
        int i2 = i15162792415829416729.b;
        if (i >= a + i2) {
            return ((String) i15162792415829416729.d).charAt(i - ((a - i15162792415829416729.c) + i2));
        }
        int i3 = i - i2;
        int i4 = t17027910246883169756.d;
        char[] cArr = t17027910246883169756.c;
        return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + t17027910246883169756.e];
    }

    public final F12478849263529740365 c() {
        int i = this.d;
        if (i != -1) {
            return new F12478849263529740365(T1335862270807194835.d(i, this.e));
        }
        return null;
    }

    public final void d(int i, int i2, String str) {
        I15162792415829416729 i15162792415829416729 = this.a;
        if (i < 0 || i > i15162792415829416729.c()) {
            W4415201450379021245.a(E12098517352909843120.l("start (", i, i15162792415829416729.c(), ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > i15162792415829416729.c()) {
            W4415201450379021245.a(E12098517352909843120.l("end (", i2, i15162792415829416729.c(), ") offset is outside of text region "));
            return;
        }
        if (i > i2) {
            S10973172697741180971.j(E12098517352909843120.l("Do not set reversed range: ", i, i2, " > "));
            return;
        }
        i15162792415829416729.q(i, i2, str);
        h(str.length() + i);
        g(str.length() + i);
        this.d = -1;
        this.e = -1;
    }

    public final void e(int i, int i2) {
        I15162792415829416729 i15162792415829416729 = this.a;
        if (i < 0 || i > i15162792415829416729.c()) {
            W4415201450379021245.a(E12098517352909843120.l("start (", i, i15162792415829416729.c(), ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > i15162792415829416729.c()) {
            W4415201450379021245.a(E12098517352909843120.l("end (", i2, i15162792415829416729.c(), ") offset is outside of text region "));
        } else if (i >= i2) {
            S10973172697741180971.j(E12098517352909843120.l("Do not set reversed or empty range: ", i, i2, " > "));
        } else {
            this.d = i;
            this.e = i2;
        }
    }

    public final void f(int i, int i2) {
        I15162792415829416729 i15162792415829416729 = this.a;
        if (i < 0 || i > i15162792415829416729.c()) {
            W4415201450379021245.a(E12098517352909843120.l("start (", i, i15162792415829416729.c(), ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > i15162792415829416729.c()) {
            W4415201450379021245.a(E12098517352909843120.l("end (", i2, i15162792415829416729.c(), ") offset is outside of text region "));
        } else if (i > i2) {
            S10973172697741180971.j(E12098517352909843120.l("Do not set reversed range: ", i, i2, " > "));
        } else {
            h(i);
            g(i2);
        }
    }

    public final void g(int i) {
        if (!(i >= 0)) {
            T12055643479535528558.a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.c = i;
    }

    public final void h(int i) {
        if (!(i >= 0)) {
            T12055643479535528558.a("Cannot set selectionStart to a negative value: " + i);
        }
        this.b = i;
    }

    public final String toString() {
        return this.a.toString();
    }
}
