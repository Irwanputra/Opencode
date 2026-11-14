package dev.epro.r0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class K10916014851776401112 {
    public final M11181104712105445833 a;
    public final S16571168858015125610 b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final R8540738700654750557 g;
    public final F10342546226345611902 h;
    public final U14340554418656580554 i;
    public final long j;

    public K10916014851776401112(M11181104712105445833 m11181104712105445833, S16571168858015125610 s16571168858015125610, List list, int i, boolean z, int i2, R8540738700654750557 r8540738700654750557, F10342546226345611902 f10342546226345611902, U14340554418656580554 u14340554418656580554, long j) {
        this.a = m11181104712105445833;
        this.b = s16571168858015125610;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = r8540738700654750557;
        this.h = f10342546226345611902;
        this.i = u14340554418656580554;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K10916014851776401112)) {
            return false;
        }
        K10916014851776401112 k10916014851776401112 = (K10916014851776401112) obj;
        return S10823041268949770285.t(this.a, k10916014851776401112.a) && S10823041268949770285.t(this.b, k10916014851776401112.b) && S10823041268949770285.t(this.c, k10916014851776401112.c) && this.d == k10916014851776401112.d && this.e == k10916014851776401112.e && this.f == k10916014851776401112.f && S10823041268949770285.t(this.g, k10916014851776401112.g) && this.h == k10916014851776401112.h && S10823041268949770285.t(this.i, k10916014851776401112.i) && I16980768508151520658.c(this.j, k10916014851776401112.j);
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + X2485016533998461232.f(this.f, G6547577305291411977.i((G6547577305291411977.h(G11450220448113054352.c(this.b, this.a.hashCode() * 31, 31), 31, this.c) + this.d) * 31, 31, this.e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        int i = this.f;
        String str = i == 1 ? "Clip" : i == 2 ? "Ellipsis" : i == 5 ? "MiddleEllipsis" : i == 3 ? "Visible" : i == 4 ? "StartEllipsis" : "Invalid";
        String strL = I16980768508151520658.l(this.j);
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", placeholders=");
        sb.append(this.c);
        sb.append(", maxLines=");
        sb.append(this.d);
        sb.append(", softWrap=");
        X2485016533998461232.j(", overflow=", str, ", density=", sb, this.e);
        sb.append(this.g);
        sb.append(", layoutDirection=");
        sb.append(this.h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.i);
        sb.append(", constraints=");
        sb.append(strL);
        sb.append(")");
        return sb.toString();
    }
}
