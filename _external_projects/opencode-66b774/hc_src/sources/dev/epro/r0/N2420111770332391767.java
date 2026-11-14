package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public abstract class N2420111770332391767 {
    public static final Y16414919402539525744 a = new Y16414919402539525744(B868928847454221112.a, 0, 0);

    public static final W12973714701299903186 a(H14763425654620554740 h14763425654620554740, M11181104712105445833 m11181104712105445833) {
        W12973714701299903186 c = h14763425654620554740.c(m11181104712105445833);
        int length = m11181104712105445833.b.length();
        M11181104712105445833 m111811047121054458332 = c.a;
        R17143752899285419206 r17143752899285419206 = c.b;
        int length2 = m111811047121054458332.b.length();
        int min = Math.min(length, 100);
        for (int i = 0; i < min; i++) {
            b(r17143752899285419206.s(i), length2, i);
        }
        b(r17143752899285419206.s(length), length2, length);
        int min2 = Math.min(length2, 100);
        for (int i2 = 0; i2 < min2; i2++) {
            c(r17143752899285419206.p(i2), length, i2);
        }
        c(r17143752899285419206.p(length2), length, length2);
        return new W12973714701299903186(m111811047121054458332, new Y16414919402539525744(r17143752899285419206, m11181104712105445833.b.length(), m111811047121054458332.b.length()));
    }

    public static final void b(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder p = E12098517352909843120.p(i3, i, "OffsetMapping.originalToTransformed returned invalid mapping: ", " -> ", " is not in range of transformed text [0, ");
        p.append(i2);
        p.append("]");
        Y16081827717826519461.c(p.toString());
    }

    public static final void c(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder p = E12098517352909843120.p(i3, i, "OffsetMapping.transformedToOriginal returned invalid mapping: ", " -> ", " is not in range of original text [0, ");
        p.append(i2);
        p.append("]");
        Y16081827717826519461.c(p.toString());
    }
}
