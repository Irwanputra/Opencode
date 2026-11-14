package dev.epro.r0;

import java.util.Objects;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class E6758797890281795541 {
    public static final E6758797890281795541 g = new E6758797890281795541("320x50_mb", 320, 50, 56);
    public static final E6758797890281795541 h;
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;

    static {
        new E6758797890281795541(468, 60);
        new E6758797890281795541(320, 100);
        new E6758797890281795541(728, 90);
        new E6758797890281795541(300, 250);
        h = new E6758797890281795541("320x50_mb", -3, -4, 56);
    }

    public E6758797890281795541(String str, int i, int i2, int i3) {
        str = (i3 & 4) != 0 ? null : str;
        boolean z = (i3 & 8) == 0;
        boolean z2 = (i3 & 16) == 0;
        boolean z3 = (i3 & 32) == 0;
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        if (str == null) {
            str = i + "x" + i2 + "_as";
        }
        this.f = str;
        if (i < 0 && i != -3) {
            S10973172697741180971.i(G6547577305291411977.n(i, "Invalid width for AdSize: "));
            throw null;
        }
        if (i2 < 0 && i2 != -4) {
            S10973172697741180971.i(G6547577305291411977.n(i2, "Invalid height for AdSize: "));
            throw null;
        }
        if (z2 && z) {
            S10973172697741180971.j("AdSize cannot be both inline and anchored adaptive");
            throw null;
        }
        if (z2 && z3) {
            S10973172697741180971.j("AdSize cannot be both inline and large anchored adaptive");
            throw null;
        }
        if (z && z3) {
            S10973172697741180971.j("AdSize cannot be both anchored and large anchored adaptive");
            throw null;
        }
        if (!z2 || i2 >= 1) {
            return;
        }
        S10973172697741180971.j("An inline AdSize must have a positive height");
        throw null;
    }

    public final boolean a() {
        return this.a == -3 && this.b == -4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof E6758797890281795541)) {
            return false;
        }
        E6758797890281795541 e6758797890281795541 = (E6758797890281795541) obj;
        return this.a == e6758797890281795541.a && this.b == e6758797890281795541.b && S10823041268949770285.t(this.f, e6758797890281795541.f);
    }

    public final int hashCode() {
        return Objects.hash(this.f, Boolean.valueOf(a()));
    }

    public final String toString() {
        return this.f + " " + (a() ? "fluid" : "");
    }

    public E6758797890281795541(int i, int i2) {
        this(null, i, i2, 56);
    }
}
