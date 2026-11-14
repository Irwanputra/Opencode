package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class X4698849316906551159 {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public String h;

    public X4698849316906551159(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, int i3) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = z3;
        this.e = z4;
        this.f = i2;
        this.g = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof X4698849316906551159)) {
            return false;
        }
        X4698849316906551159 x4698849316906551159 = (X4698849316906551159) obj;
        return this.a == x4698849316906551159.a && this.b == x4698849316906551159.b && this.c == x4698849316906551159.c && S10823041268949770285.t(this.h, x4698849316906551159.h) && this.d == x4698849316906551159.d && this.e == x4698849316906551159.e && this.f == x4698849316906551159.f && this.g == x4698849316906551159.g;
    }

    public final int hashCode() {
        int i = (((((this.a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31) + this.c) * 31;
        return ((((((((((((i + (this.h != null ? r1.hashCode() : 0)) * 29791) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + this.f) * 31) + this.g) * 31) - 1) * 31) - 1;
    }

    public final String toString() {
        String str = this.h;
        StringBuilder sb = new StringBuilder(X4698849316906551159.class.getSimpleName());
        sb.append("(");
        if (this.a) {
            sb.append("launchSingleTop ");
        }
        if (this.b) {
            sb.append("restoreState ");
        }
        if ((str != null || this.c != -1) && str != null) {
            sb.append("popUpTo(");
            sb.append(str);
            if (this.d) {
                sb.append(" inclusive");
            }
            if (this.e) {
                sb.append(" saveState");
            }
            sb.append(")");
        }
        int i = this.g;
        int i2 = this.f;
        if (i2 != -1 || i != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i2));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(")");
        }
        return sb.toString();
    }
}
