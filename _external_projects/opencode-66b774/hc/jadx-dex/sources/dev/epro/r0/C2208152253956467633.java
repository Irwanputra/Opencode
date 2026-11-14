package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C2208152253956467633 implements dev.epro.r0.B9345618057833789735 {
    public final dev.epro.r0.B9345618057833789735 a;
    public final int b;

    public C2208152253956467633(dev.epro.r0.B9345618057833789735 b9345618057833789735, int i) {
        this.a = b9345618057833789735;
        this.b = i;
    }

    @Override // dev.epro.r0.B9345618057833789735
    public final int a(dev.epro.r0.R8540738700654750557 r8540738700654750557, dev.epro.r0.F10342546226345611902 f10342546226345611902) {
        if (((f10342546226345611902 == dev.epro.r0.F10342546226345611902.a ? 8 : 2) & this.b) != 0) {
            return this.a.a(r8540738700654750557, f10342546226345611902);
        }
        return 0;
    }

    @Override // dev.epro.r0.B9345618057833789735
    public final int b(dev.epro.r0.R8540738700654750557 r8540738700654750557) {
        if ((this.b & 16) != 0) {
            return this.a.b(r8540738700654750557);
        }
        return 0;
    }

    @Override // dev.epro.r0.B9345618057833789735
    public final int c(dev.epro.r0.R8540738700654750557 r8540738700654750557, dev.epro.r0.F10342546226345611902 f10342546226345611902) {
        if (((f10342546226345611902 == dev.epro.r0.F10342546226345611902.a ? 4 : 1) & this.b) != 0) {
            return this.a.c(r8540738700654750557, f10342546226345611902);
        }
        return 0;
    }

    @Override // dev.epro.r0.B9345618057833789735
    public final int d(dev.epro.r0.R8540738700654750557 r8540738700654750557) {
        if ((this.b & 32) != 0) {
            return this.a.d(r8540738700654750557);
        }
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dev.epro.r0.C2208152253956467633)) {
            return false;
        }
        dev.epro.r0.C2208152253956467633 c2208152253956467633 = (dev.epro.r0.C2208152253956467633) obj;
        return dev.epro.r0.S10823041268949770285.t(this.a, c2208152253956467633.a) && this.b == c2208152253956467633.b;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = this.b;
        int i2 = dev.epro.r0.V3311072669930093336.b;
        if ((i & i2) == i2) {
            dev.epro.r0.V3311072669930093336.s(sb, "Start");
        }
        int i3 = dev.epro.r0.V3311072669930093336.d;
        if ((i & i3) == i3) {
            dev.epro.r0.V3311072669930093336.s(sb, "Left");
        }
        if ((i & 16) == 16) {
            dev.epro.r0.V3311072669930093336.s(sb, "Top");
        }
        int i4 = dev.epro.r0.V3311072669930093336.c;
        if ((i & i4) == i4) {
            dev.epro.r0.V3311072669930093336.s(sb, "End");
        }
        int i5 = dev.epro.r0.V3311072669930093336.e;
        if ((i & i5) == i5) {
            dev.epro.r0.V3311072669930093336.s(sb, "Right");
        }
        if ((i & 32) == 32) {
            dev.epro.r0.V3311072669930093336.s(sb, "Bottom");
        }
        return "(" + this.a + " only " + dev.epro.r0.G6547577305291411977.s("WindowInsetsSides(", sb.toString(), ")") + ")";
    }
}
