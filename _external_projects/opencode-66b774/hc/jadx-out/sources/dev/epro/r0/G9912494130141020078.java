package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class G9912494130141020078 implements H1203938712873468075 {
    public final int a;
    public final int b;
    public final long c;
    public final T7401211383959175309 d;
    public final M3397403720270972864 e;
    public final T9619163566559319688 f;
    public final int g;
    public final int h;
    public final J12504654702430902626 i;

    public G9912494130141020078(int i, int i2, long j, T7401211383959175309 t7401211383959175309, M3397403720270972864 m3397403720270972864, T9619163566559319688 t9619163566559319688, int i3, int i4, J12504654702430902626 j12504654702430902626) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = t7401211383959175309;
        this.e = m3397403720270972864;
        this.f = t9619163566559319688;
        this.g = i3;
        this.h = i4;
        this.i = j12504654702430902626;
        E6417708602094478350[] e6417708602094478350Arr = J5593409210068682756.b;
        if (J5593409210068682756.a(j, J5593409210068682756.c)) {
            return;
        }
        if (J5593409210068682756.c(j) >= 0.0f) {
            return;
        }
        T12055643479535528558.b("lineHeight can't be negative (" + J5593409210068682756.c(j) + ")");
    }

    public final G9912494130141020078 a(G9912494130141020078 g9912494130141020078) {
        return g9912494130141020078 == null ? this : Z2262836071278548716.a(this, g9912494130141020078.a, g9912494130141020078.b, g9912494130141020078.c, g9912494130141020078.d, g9912494130141020078.e, g9912494130141020078.f, g9912494130141020078.g, g9912494130141020078.h, g9912494130141020078.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G9912494130141020078)) {
            return false;
        }
        G9912494130141020078 g9912494130141020078 = (G9912494130141020078) obj;
        return this.a == g9912494130141020078.a && this.b == g9912494130141020078.b && J5593409210068682756.a(this.c, g9912494130141020078.c) && S10823041268949770285.t(this.d, g9912494130141020078.d) && S10823041268949770285.t(this.e, g9912494130141020078.e) && S10823041268949770285.t(this.f, g9912494130141020078.f) && this.g == g9912494130141020078.g && this.h == g9912494130141020078.h && S10823041268949770285.t(this.i, g9912494130141020078.i);
    }

    public final int hashCode() {
        int iF = X2485016533998461232.f(this.b, Integer.hashCode(this.a) * 31, 31);
        E6417708602094478350[] e6417708602094478350Arr = J5593409210068682756.b;
        int iJ = G6547577305291411977.j(iF, this.c, 31);
        T7401211383959175309 t7401211383959175309 = this.d;
        int iHashCode = (iJ + (t7401211383959175309 != null ? t7401211383959175309.hashCode() : 0)) * 31;
        M3397403720270972864 m3397403720270972864 = this.e;
        int iHashCode2 = (iHashCode + (m3397403720270972864 != null ? m3397403720270972864.hashCode() : 0)) * 31;
        T9619163566559319688 t9619163566559319688 = this.f;
        int iF2 = X2485016533998461232.f(this.h, X2485016533998461232.f(this.g, (iHashCode2 + (t9619163566559319688 != null ? t9619163566559319688.hashCode() : 0)) * 31, 31), 31);
        J12504654702430902626 j12504654702430902626 = this.i;
        return iF2 + (j12504654702430902626 != null ? j12504654702430902626.hashCode() : 0);
    }

    public final String toString() {
        String strA = K1718469374495436264.a(this.a);
        String strA2 = Y16210233841292394854.a(this.b);
        String strD = J5593409210068682756.d(this.c);
        String strA3 = F13694370688786214365.a(this.g);
        String strA4 = N14524310585567679303.a(this.h);
        StringBuilder sbY = G6547577305291411977.y("ParagraphStyle(textAlign=", strA, ", textDirection=", strA2, ", lineHeight=");
        sbY.append(strD);
        sbY.append(", textIndent=");
        sbY.append(this.d);
        sbY.append(", platformStyle=");
        sbY.append(this.e);
        sbY.append(", lineHeightStyle=");
        sbY.append(this.f);
        sbY.append(", lineBreak=");
        G6547577305291411977.B(sbY, strA3, ", hyphens=", strA4, ", textMotion=");
        sbY.append(this.i);
        sbY.append(")");
        return sbY.toString();
    }
}
