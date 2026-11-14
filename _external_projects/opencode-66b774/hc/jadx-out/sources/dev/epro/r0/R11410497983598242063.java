package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R11410497983598242063 implements I5573661370475160895 {
    public final N17688611401319956784 a;
    public final N17688611401319956784 b;
    public final N17688611401319956784 c;
    public final N17688611401319956784 d;

    public R11410497983598242063(N17688611401319956784 n17688611401319956784, N17688611401319956784 n176886114013199567842, N17688611401319956784 n176886114013199567843, N17688611401319956784 n176886114013199567844) {
        this.a = n17688611401319956784;
        this.b = n176886114013199567842;
        this.c = n176886114013199567843;
        this.d = n176886114013199567844;
    }

    public static R11410497983598242063 b(R11410497983598242063 r11410497983598242063, N17688611401319956784 n17688611401319956784, N17688611401319956784 n176886114013199567842, N17688611401319956784 n176886114013199567843, N17688611401319956784 n176886114013199567844, int i) {
        if ((i & 1) != 0) {
            n17688611401319956784 = r11410497983598242063.a;
        }
        if ((i & 2) != 0) {
            n176886114013199567842 = r11410497983598242063.b;
        }
        if ((i & 4) != 0) {
            n176886114013199567843 = r11410497983598242063.c;
        }
        if ((i & 8) != 0) {
            n176886114013199567844 = r11410497983598242063.d;
        }
        r11410497983598242063.getClass();
        return new R11410497983598242063(n17688611401319956784, n176886114013199567842, n176886114013199567843, n176886114013199567844);
    }

    @Override // dev.epro.r0.I5573661370475160895
    public final J8045362843799184672 a(long j, F10342546226345611902 f10342546226345611902, R8540738700654750557 r8540738700654750557) {
        float fA = this.a.a(j, r8540738700654750557);
        float fA2 = this.b.a(j, r8540738700654750557);
        float fA3 = this.c.a(j, r8540738700654750557);
        float fA4 = this.d.a(j, r8540738700654750557);
        float fB = W8572396779607072172.b(j);
        float f = fA + fA4;
        if (f > fB) {
            float f2 = fB / f;
            fA *= f2;
            fA4 *= f2;
        }
        float f3 = fA2 + fA3;
        if (f3 > fB) {
            float f4 = fB / f3;
            fA2 *= f4;
            fA3 *= f4;
        }
        if (fA < 0.0f || fA2 < 0.0f || fA3 < 0.0f || fA4 < 0.0f) {
            StringBuilder sbK = G11450220448113054352.k("Corner size in Px can't be negative(topStart = ", fA, ", topEnd = ", fA2, ", bottomEnd = ");
            sbK.append(fA3);
            sbK.append(", bottomStart = ");
            sbK.append(fA4);
            sbK.append(")!");
            Y16081827717826519461.a(sbK.toString());
        }
        if (fA + fA2 + fA3 + fA4 == 0.0f) {
            return new K10859651572364480586(E2166724654553415323.a(0L, j));
        }
        S6349823729575121924 s6349823729575121924A = E2166724654553415323.a(0L, j);
        F10342546226345611902 f103425462263456119022 = F10342546226345611902.a;
        float f5 = f10342546226345611902 == f103425462263456119022 ? fA : fA2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
        if (f10342546226345611902 == f103425462263456119022) {
            fA = fA2;
        }
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fA)) << 32) | (((long) Float.floatToRawIntBits(fA)) & 4294967295L);
        float f6 = f10342546226345611902 == f103425462263456119022 ? fA3 : fA4;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
        if (f10342546226345611902 != f103425462263456119022) {
            fA4 = fA3;
        }
        return new K14082636229475424456(new V14120702150497747934(s6349823729575121924A.a, s6349823729575121924A.b, s6349823729575121924A.c, s6349823729575121924A.d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(fA4)) << 32) | (((long) Float.floatToRawIntBits(fA4)) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof R11410497983598242063)) {
            return false;
        }
        R11410497983598242063 r11410497983598242063 = (R11410497983598242063) obj;
        return S10823041268949770285.t(this.a, r11410497983598242063.a) && S10823041268949770285.t(this.b, r11410497983598242063.b) && S10823041268949770285.t(this.c, r11410497983598242063.c) && S10823041268949770285.t(this.d, r11410497983598242063.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ")";
    }
}
