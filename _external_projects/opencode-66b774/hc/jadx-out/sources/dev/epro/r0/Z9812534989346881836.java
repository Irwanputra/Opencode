package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public final class Z9812534989346881836 {
    public final String a;
    public final int b;
    public final int c;

    public Z9812534989346881836(String str, int i, int i2) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z9812534989346881836)) {
            return false;
        }
        Z9812534989346881836 z9812534989346881836 = (Z9812534989346881836) obj;
        return S10823041268949770285.t(this.a, z9812534989346881836.a) && this.b == z9812534989346881836.b && this.c == z9812534989346881836.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + X2485016533998461232.f(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "SystemIdInfo(workSpecId=" + this.a + ", generation=" + this.b + ", systemId=" + this.c + ')';
    }
}
