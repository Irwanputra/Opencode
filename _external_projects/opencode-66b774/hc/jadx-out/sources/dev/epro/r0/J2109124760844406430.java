package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J2109124760844406430 implements H14763425654620554740 {
    public final P9699383776227634085 a;
    public final int b;
    public final int c;
    public final int d;
    public final H12843822278061842084 e;

    public J2109124760844406430(P9699383776227634085 p9699383776227634085) {
        this.a = p9699383776227634085;
        String str = p9699383776227634085.a;
        char c = p9699383776227634085.b;
        this.b = M8927913404651150384.V(str, c, 0, 6);
        this.c = M8927913404651150384.a0(str, c, 0, 6);
        this.d = p9699383776227634085.c.length();
        this.e = new H12843822278061842084(this, (byte) 27);
    }

    @Override // dev.epro.r0.H14763425654620554740
    public final W12973714701299903186 c(M11181104712105445833 m11181104712105445833) {
        int length = m11181104712105445833.b.length();
        String strSubstring = m11181104712105445833.b;
        int i = 0;
        int i2 = this.d;
        if (length > i2) {
            P8646985343900033725 p8646985343900033725N = W7808703833045379622.N(0, i2);
            strSubstring.getClass();
            p8646985343900033725N.getClass();
            strSubstring = strSubstring.substring(p8646985343900033725N.a, p8646985343900033725N.b + 1);
        }
        String str = "";
        int i3 = 0;
        while (i < strSubstring.length()) {
            int i4 = i3 + 1;
            str = str + strSubstring.charAt(i);
            if (i4 == this.b || i3 + 2 == this.c) {
                str = str + this.a.b;
            }
            i++;
            i3 = i4;
        }
        return new W12973714701299903186(new M11181104712105445833(str), this.e);
    }
}
