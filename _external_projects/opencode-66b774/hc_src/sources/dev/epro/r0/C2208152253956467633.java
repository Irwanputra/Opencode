package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class C2208152253956467633 implements B9345618057833789735 {
    public final B9345618057833789735 a;
    public final int b;

    public C2208152253956467633(B9345618057833789735 b9345618057833789735, int i) {
        this.a = b9345618057833789735;
        this.b = i;
    }

    @Override // dev.epro.r0.B9345618057833789735
    public final int a(R8540738700654750557 r8540738700654750557, F10342546226345611902 f10342546226345611902) {
        if (((f10342546226345611902 == F10342546226345611902.a ? 8 : 2) & this.b) != 0) {
            return this.a.a(r8540738700654750557, f10342546226345611902);
        }
        return 0;
    }

    @Override // dev.epro.r0.B9345618057833789735
    public final int b(R8540738700654750557 r8540738700654750557) {
        if ((this.b & 16) != 0) {
            return this.a.b(r8540738700654750557);
        }
        return 0;
    }

    @Override // dev.epro.r0.B9345618057833789735
    public final int c(R8540738700654750557 r8540738700654750557, F10342546226345611902 f10342546226345611902) {
        if (((f10342546226345611902 == F10342546226345611902.a ? 4 : 1) & this.b) != 0) {
            return this.a.c(r8540738700654750557, f10342546226345611902);
        }
        return 0;
    }

    @Override // dev.epro.r0.B9345618057833789735
    public final int d(R8540738700654750557 r8540738700654750557) {
        if ((this.b & 32) != 0) {
            return this.a.d(r8540738700654750557);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2208152253956467633)) {
            return false;
        }
        C2208152253956467633 c2208152253956467633 = (C2208152253956467633) obj;
        return S10823041268949770285.t(this.a, c2208152253956467633.a) && this.b == c2208152253956467633.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.b;
        int i2 = V3311072669930093336.b;
        if ((i & i2) == i2) {
            V3311072669930093336.s(sb, "Start");
        }
        int i3 = V3311072669930093336.d;
        if ((i & i3) == i3) {
            V3311072669930093336.s(sb, "Left");
        }
        if ((i & 16) == 16) {
            V3311072669930093336.s(sb, "Top");
        }
        int i4 = V3311072669930093336.c;
        if ((i & i4) == i4) {
            V3311072669930093336.s(sb, "End");
        }
        int i5 = V3311072669930093336.e;
        if ((i & i5) == i5) {
            V3311072669930093336.s(sb, "Right");
        }
        if ((i & 32) == 32) {
            V3311072669930093336.s(sb, "Bottom");
        }
        return "(" + this.a + " only " + G6547577305291411977.s("WindowInsetsSides(", sb.toString(), ")") + ")";
    }
}
