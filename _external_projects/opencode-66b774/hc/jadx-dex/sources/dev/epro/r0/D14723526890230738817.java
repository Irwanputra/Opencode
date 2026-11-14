package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D14723526890230738817 {
    public final dev.epro.r0.A15589771493980083692 a;

    static {
        new dev.epro.r0.D14723526890230738817("", 0, 0);
    }

    public D14723526890230738817(java.lang.String str, int i, int i2) {
        this.a = new dev.epro.r0.A15589771493980083692(str, i, i2);
    }

    public static dev.epro.r0.D14723526890230738817 a(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        java.lang.String string;
        if (z) {
            int i7 = i / 2;
            int i8 = i2 / 2;
            java.lang.StringBuilder sbP = dev.epro.r0.E12098517352909843120.p(i8, i7, "M0,", " A", ",");
            dev.epro.r0.G6547577305291411977.A(sbP, i8, " 0 1,1 ", i, ",");
            dev.epro.r0.G6547577305291411977.A(sbP, i8, " A", i7, ",");
            sbP.append(i8);
            sbP.append(" 0 1,1 0,");
            sbP.append(i8);
            sbP.append(" Z");
            string = sbP.toString();
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("M ");
            int iMin = java.lang.Math.min(i / 2, i2 / 2);
            int iMin2 = java.lang.Math.min(iMin, i3);
            int iMin3 = java.lang.Math.min(iMin, i4);
            int iMin4 = java.lang.Math.min(iMin, i5);
            int iMin5 = java.lang.Math.min(iMin, i6);
            sb.append(iMin2);
            sb.append(",0 L ");
            sb.append(i - iMin3);
            sb.append(",0");
            if (iMin3 > 0) {
                sb.append(" A ");
                sb.append(iMin3);
                sb.append(",");
                sb.append(iMin3);
                sb.append(" 0 0,1 ");
                sb.append(i);
                sb.append(",");
                sb.append(iMin3);
            }
            sb.append(" L ");
            sb.append(i);
            sb.append(",");
            sb.append(i2 - iMin4);
            if (iMin4 > 0) {
                sb.append(" A ");
                sb.append(iMin4);
                sb.append(",");
                sb.append(iMin4);
                sb.append(" 0 0,1 ");
                sb.append(i - iMin4);
                sb.append(",");
                sb.append(i2);
            }
            sb.append(" L ");
            sb.append(iMin5);
            sb.append(",");
            sb.append(i2);
            if (iMin5 > 0) {
                sb.append(" A ");
                sb.append(iMin5);
                sb.append(",");
                sb.append(iMin5);
                sb.append(" 0 0,1 0,");
                sb.append(i2 - iMin5);
            }
            if (iMin2 > 0) {
                sb.append(" L 0,");
                sb.append(iMin2);
                sb.append(" A ");
                sb.append(iMin2);
                sb.append(",");
                sb.append(iMin2);
                sb.append(" 0 0,1 ");
                sb.append(iMin2);
                sb.append(",0");
            }
            sb.append(" Z");
            string = sb.toString();
        }
        return new dev.epro.r0.D14723526890230738817(string, i, i2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dev.epro.r0.D14723526890230738817) {
            return this.a.equals(((dev.epro.r0.D14723526890230738817) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }
}
