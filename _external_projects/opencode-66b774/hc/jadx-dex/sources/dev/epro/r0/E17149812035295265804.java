package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E17149812035295265804 implements dev.epro.r0.F2699648658094956990, dev.epro.r0.B13906740428466697912, dev.epro.r0.A6527624962738679687, dev.epro.r0.P14632082186738269386, dev.epro.r0.I6255327262428024138, dev.epro.r0.V4371024969283281503, dev.epro.r0.O16368343340005843063, dev.epro.r0.I15982850730816748353 {
    public final /* synthetic */ byte a;

    public E17149812035295265804() {
        this.a = (byte) 22;
        new java.util.HashMap();
        new java.util.HashMap();
        java.lang.String property = java.lang.System.getProperty("java.runtime.name");
        if (property != null && property.startsWith("Android Runtime")) {
            return;
        }
        try {
            java.lang.Class.forName("java.beans.Introspector");
        } catch (java.lang.ClassNotFoundException unused) {
        }
    }

    public static android.graphics.Typeface h(java.lang.String str, dev.epro.r0.R6694982557896913324 r6694982557896913324, int i) {
        if (i == 0 && dev.epro.r0.S10823041268949770285.t(r6694982557896913324, dev.epro.r0.R6694982557896913324.c) && (str == null || str.length() == 0)) {
            return android.graphics.Typeface.DEFAULT;
        }
        int iX = dev.epro.r0.Y582199805280922215.x(r6694982557896913324, i);
        return (str == null || str.length() == 0) ? android.graphics.Typeface.defaultFromStyle(iX) : android.graphics.Typeface.create(str, iX);
    }

    public static dev.epro.r0.U3985905046772670199 k(dev.epro.r0.H1172266339307530335 h1172266339307530335) {
        return h1172266339307530335.b ? new dev.epro.r0.U3985905046772670199("surface_bright", new dev.epro.r0.A12662543779246224881((byte) 27), new dev.epro.r0.A12662543779246224881((byte) 28), true, (java.util.function.Function) null, (java.util.function.Function) null, (dev.epro.r0.G4425564197697489570) null, (java.util.function.Function) null) : new dev.epro.r0.U3985905046772670199("surface_dim", new dev.epro.r0.F11242842454977356935((byte) 19), new dev.epro.r0.I10051424186108607289((byte) 0), true, (java.util.function.Function) null, (java.util.function.Function) null, (dev.epro.r0.G4425564197697489570) null, (java.util.function.Function) null);
    }

    public static dev.epro.r0.U3985905046772670199 l() {
        return new dev.epro.r0.U3985905046772670199("inverse_surface", new dev.epro.r0.Z3838016174256315005((byte) 13), new dev.epro.r0.Z3838016174256315005((byte) 14), false, (java.util.function.Function) null, (java.util.function.Function) null, (dev.epro.r0.G4425564197697489570) null, (java.util.function.Function) null);
    }

    public dev.epro.r0.U3985905046772670199 A() {
        return new dev.epro.r0.U3985905046772670199("tertiary_fixed_dim", new dev.epro.r0.W7537226175090183024((byte) 13), new dev.epro.r0.W7537226175090183024((byte) 14), true, new dev.epro.r0.A12662543779246224881(this, (byte) 9), (java.util.function.Function) null, new dev.epro.r0.G4425564197697489570(1.0d, 1.0d, 3.0d, 4.5d), new dev.epro.r0.H10891550656504408564(this, (byte) 8));
    }

    @Override // dev.epro.r0.B13906740428466697912, dev.epro.r0.A6527624962738679687
    public float a() {
        return 0.0f;
    }

    public android.graphics.Typeface c(dev.epro.r0.S13128812947675933386 s13128812947675933386, dev.epro.r0.R6694982557896913324 r6694982557896913324, int i) {
        java.lang.String strConcat = s13128812947675933386.f;
        int i2 = r6694982557896913324.a / 100;
        if (i2 >= 0 && i2 < 2) {
            strConcat = strConcat.concat("-thin");
        } else if (2 <= i2 && i2 < 4) {
            strConcat = strConcat.concat("-light");
        } else if (i2 != 4) {
            if (i2 == 5) {
                strConcat = strConcat.concat("-medium");
            } else if ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) {
                strConcat = strConcat.concat("-black");
            }
        }
        android.graphics.Typeface typeface = null;
        if (strConcat.length() != 0) {
            android.graphics.Typeface typefaceH = h(strConcat, r6694982557896913324, i);
            if (!dev.epro.r0.S10823041268949770285.t(typefaceH, android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, dev.epro.r0.Y582199805280922215.x(r6694982557896913324, i))) && !dev.epro.r0.S10823041268949770285.t(typefaceH, h(null, r6694982557896913324, i))) {
                typeface = typefaceH;
            }
        }
        return typeface == null ? h(s13128812947675933386.f, r6694982557896913324, i) : typeface;
    }

    public java.lang.Object e(java.lang.String str, java.security.Provider provider) {
        switch (this.a) {
            case 10:
                return provider == null ? javax.crypto.Cipher.getInstance(str) : javax.crypto.Cipher.getInstance(str, provider);
            default:
                return provider == null ? javax.crypto.Mac.getInstance(str) : javax.crypto.Mac.getInstance(str, provider);
        }
    }

    @Override // dev.epro.r0.B13906740428466697912
    public void f(dev.epro.r0.R8540738700654750557 r8540738700654750557, int i, int[] iArr, dev.epro.r0.F10342546226345611902 f10342546226345611902, int[] iArr2) {
        if (f10342546226345611902 == dev.epro.r0.F10342546226345611902.a) {
            dev.epro.r0.V1475975160983963926.J(i, iArr, iArr2, false);
        } else {
            dev.epro.r0.V1475975160983963926.J(i, iArr, iArr2, true);
        }
    }

    public android.graphics.Typeface g(dev.epro.r0.R6694982557896913324 r6694982557896913324, int i) {
        return h(null, r6694982557896913324, i);
    }

    public dev.epro.r0.U3985905046772670199 i() {
        return new dev.epro.r0.U3985905046772670199("error", new dev.epro.r0.Z3838016174256315005((byte) 6), new dev.epro.r0.Z3838016174256315005((byte) 7), true, new dev.epro.r0.A12662543779246224881(this, (byte) 9), (java.util.function.Function) null, new dev.epro.r0.G4425564197697489570(3.0d, 4.5d, 7.0d, 7.0d), new dev.epro.r0.H10891550656504408564(this, (byte) 0));
    }

    public dev.epro.r0.U3985905046772670199 j() {
        return new dev.epro.r0.U3985905046772670199("error_container", new dev.epro.r0.Z3838016174256315005((byte) 18), new dev.epro.r0.Z3838016174256315005((byte) 19), true, new dev.epro.r0.A12662543779246224881(this, (byte) 9), (java.util.function.Function) null, new dev.epro.r0.G4425564197697489570(1.0d, 1.0d, 3.0d, 4.5d), new dev.epro.r0.H10891550656504408564(this, (byte) 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dev.epro.r0.T10370494902461206356 n(android.view.KeyEvent r14) {
        /*
            Method dump skipped, instruction units count: 1117
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.E17149812035295265804.n(android.view.KeyEvent):dev.epro.r0.T10370494902461206356");
    }

    @Override // dev.epro.r0.A6527624962738679687
    public void o(dev.epro.r0.R8540738700654750557 r8540738700654750557, int i, int[] iArr, int[] iArr2) {
        dev.epro.r0.V1475975160983963926.J(i, iArr, iArr2, false);
    }

    public dev.epro.r0.U3985905046772670199 p() {
        return new dev.epro.r0.U3985905046772670199("primary", new dev.epro.r0.Z3838016174256315005((byte) 23), new dev.epro.r0.Z3838016174256315005((byte) 24), true, new dev.epro.r0.A12662543779246224881(this, (byte) 9), (java.util.function.Function) null, new dev.epro.r0.G4425564197697489570(3.0d, 4.5d, 7.0d, 7.0d), new dev.epro.r0.H10891550656504408564(this, (byte) 3));
    }

    public dev.epro.r0.U3985905046772670199 q() {
        return new dev.epro.r0.U3985905046772670199("primary_container", new dev.epro.r0.A12662543779246224881((byte) 15), new dev.epro.r0.A12662543779246224881(this, (byte) 16), true, new dev.epro.r0.A12662543779246224881(this, (byte) 9), (java.util.function.Function) null, new dev.epro.r0.G4425564197697489570(1.0d, 1.0d, 3.0d, 4.5d), new dev.epro.r0.H10891550656504408564(this, (byte) 6));
    }

    public dev.epro.r0.U3985905046772670199 r() {
        return new dev.epro.r0.U3985905046772670199("primary_fixed", new dev.epro.r0.W7537226175090183024((byte) 28), new dev.epro.r0.W7537226175090183024((byte) 29), true, new dev.epro.r0.A12662543779246224881(this, (byte) 9), (java.util.function.Function) null, new dev.epro.r0.G4425564197697489570(1.0d, 1.0d, 3.0d, 4.5d), new dev.epro.r0.H10891550656504408564(this, (byte) 10));
    }

    public dev.epro.r0.U3985905046772670199 s() {
        return new dev.epro.r0.U3985905046772670199("primary_fixed_dim", new dev.epro.r0.F11242842454977356935((byte) 1), new dev.epro.r0.F11242842454977356935((byte) 2), true, new dev.epro.r0.A12662543779246224881(this, (byte) 9), (java.util.function.Function) null, new dev.epro.r0.G4425564197697489570(1.0d, 1.0d, 3.0d, 4.5d), new dev.epro.r0.H10891550656504408564(this, (byte) 11));
    }

    public dev.epro.r0.U3985905046772670199 t() {
        return new dev.epro.r0.U3985905046772670199("secondary", new dev.epro.r0.F11242842454977356935((byte) 8), new dev.epro.r0.F11242842454977356935((byte) 10), true, new dev.epro.r0.A12662543779246224881(this, (byte) 9), (java.util.function.Function) null, new dev.epro.r0.G4425564197697489570(3.0d, 4.5d, 7.0d, 7.0d), new dev.epro.r0.H10891550656504408564(this, (byte) 13));
    }

    public java.lang.String toString() {
        switch (this.a) {
            case 1:
                return "Arrangement#Center";
            case 6:
                return "Empty";
            default:
                return super.toString();
        }
    }

    public dev.epro.r0.U3985905046772670199 u() {
        return new dev.epro.r0.U3985905046772670199("secondary_container", new dev.epro.r0.A12662543779246224881((byte) 7), new dev.epro.r0.A12662543779246224881(this, (byte) 8), true, new dev.epro.r0.A12662543779246224881(this, (byte) 9), (java.util.function.Function) null, new dev.epro.r0.G4425564197697489570(1.0d, 1.0d, 3.0d, 4.5d), new dev.epro.r0.H10891550656504408564(this, (byte) 5));
    }

    public dev.epro.r0.U3985905046772670199 v() {
        return new dev.epro.r0.U3985905046772670199("secondary_fixed", new dev.epro.r0.W7537226175090183024((byte) 6), new dev.epro.r0.W7537226175090183024((byte) 7), true, new dev.epro.r0.A12662543779246224881(this, (byte) 9), (java.util.function.Function) null, new dev.epro.r0.G4425564197697489570(1.0d, 1.0d, 3.0d, 4.5d), new dev.epro.r0.H10891550656504408564(this, (byte) 7));
    }

    public dev.epro.r0.U3985905046772670199 w() {
        return new dev.epro.r0.U3985905046772670199("secondary_fixed_dim", new dev.epro.r0.W7537226175090183024((byte) 22), new dev.epro.r0.W7537226175090183024((byte) 23), true, new dev.epro.r0.A12662543779246224881(this, (byte) 9), (java.util.function.Function) null, new dev.epro.r0.G4425564197697489570(1.0d, 1.0d, 3.0d, 4.5d), new dev.epro.r0.H10891550656504408564(this, (byte) 9));
    }

    public dev.epro.r0.U3985905046772670199 x() {
        return new dev.epro.r0.U3985905046772670199("tertiary", new dev.epro.r0.A12662543779246224881((byte) 2), new dev.epro.r0.A12662543779246224881((byte) 3), true, new dev.epro.r0.A12662543779246224881(this, (byte) 9), (java.util.function.Function) null, new dev.epro.r0.G4425564197697489570(3.0d, 4.5d, 7.0d, 7.0d), new dev.epro.r0.H10891550656504408564(this, (byte) 4));
    }

    public dev.epro.r0.U3985905046772670199 y() {
        return new dev.epro.r0.U3985905046772670199("tertiary_container", new dev.epro.r0.F11242842454977356935((byte) 3), new dev.epro.r0.F11242842454977356935(this), true, new dev.epro.r0.A12662543779246224881(this, (byte) 9), (java.util.function.Function) null, new dev.epro.r0.G4425564197697489570(1.0d, 1.0d, 3.0d, 4.5d), new dev.epro.r0.H10891550656504408564(this, (byte) 12));
    }

    public dev.epro.r0.U3985905046772670199 z() {
        return new dev.epro.r0.U3985905046772670199("tertiary_fixed", new dev.epro.r0.Z3838016174256315005((byte) 21), new dev.epro.r0.Z3838016174256315005((byte) 22), true, new dev.epro.r0.A12662543779246224881(this, (byte) 9), (java.util.function.Function) null, new dev.epro.r0.G4425564197697489570(1.0d, 1.0d, 3.0d, 4.5d), new dev.epro.r0.H10891550656504408564(this, (byte) 2));
    }

    public /* synthetic */ E17149812035295265804(byte b) {
        this.a = b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.G6332201275426833390 */
    public java.lang.Object b(dev.epro.r0.G6332201275426833390 g6332201275426833390) throws dev.epro.r0.G6332201275426833390 {
        throw g6332201275426833390;
    }

    public void m(int i, java.lang.Object obj) {
    }

    public void d(boolean z, int i, int i2, int i3) {
    }

    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }
}
