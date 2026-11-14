package dev.epro.r0;

import android.graphics.Typeface;
import java.security.Provider;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class E17149812035295265804 implements F2699648658094956990, B13906740428466697912, A6527624962738679687, P14632082186738269386, I6255327262428024138, V4371024969283281503, O16368343340005843063, I15982850730816748353 {
    public final /* synthetic */ byte a;

    public E17149812035295265804() {
        this.a = (byte) 22;
        new HashMap();
        new HashMap();
        String property = System.getProperty("java.runtime.name");
        if (property != null && property.startsWith("Android Runtime")) {
            return;
        }
        try {
            Class.forName("java.beans.Introspector");
        } catch (ClassNotFoundException unused) {
        }
    }

    public static Typeface h(String str, R6694982557896913324 r6694982557896913324, int i) {
        if (i == 0 && S10823041268949770285.t(r6694982557896913324, R6694982557896913324.c) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iX = Y582199805280922215.x(r6694982557896913324, i);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iX) : Typeface.create(str, iX);
    }

    public static U3985905046772670199 k(H1172266339307530335 h1172266339307530335) {
        return h1172266339307530335.b ? new U3985905046772670199("surface_bright", new A12662543779246224881((byte) 27), new A12662543779246224881((byte) 28), true, null, null, null, null) : new U3985905046772670199("surface_dim", new F11242842454977356935((byte) 19), new I10051424186108607289((byte) 0), true, null, null, null, null);
    }

    public static U3985905046772670199 l() {
        return new U3985905046772670199("inverse_surface", new Z3838016174256315005((byte) 13), new Z3838016174256315005((byte) 14), false, null, null, null, null);
    }

    public U3985905046772670199 A() {
        return new U3985905046772670199("tertiary_fixed_dim", new W7537226175090183024((byte) 13), new W7537226175090183024((byte) 14), true, new A12662543779246224881(this, (byte) 9), null, new G4425564197697489570(1.0d, 1.0d, 3.0d, 4.5d), new H10891550656504408564(this, (byte) 8));
    }

    @Override // dev.epro.r0.B13906740428466697912, dev.epro.r0.A6527624962738679687
    public float a() {
        return 0.0f;
    }

    @Override // dev.epro.r0.V4371024969283281503
    public Typeface c(S13128812947675933386 s13128812947675933386, R6694982557896913324 r6694982557896913324, int i) {
        String strConcat = s13128812947675933386.f;
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
        Typeface typeface = null;
        if (strConcat.length() != 0) {
            Typeface typefaceH = h(strConcat, r6694982557896913324, i);
            if (!S10823041268949770285.t(typefaceH, Typeface.create(Typeface.DEFAULT, Y582199805280922215.x(r6694982557896913324, i))) && !S10823041268949770285.t(typefaceH, h(null, r6694982557896913324, i))) {
                typeface = typefaceH;
            }
        }
        return typeface == null ? h(s13128812947675933386.f, r6694982557896913324, i) : typeface;
    }

    @Override // dev.epro.r0.P14632082186738269386
    public Object e(String str, Provider provider) {
        switch (this.a) {
            case 10:
                return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
            default:
                return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
        }
    }

    @Override // dev.epro.r0.B13906740428466697912
    public void f(R8540738700654750557 r8540738700654750557, int i, int[] iArr, F10342546226345611902 f10342546226345611902, int[] iArr2) {
        if (f10342546226345611902 == F10342546226345611902.a) {
            V1475975160983963926.J(i, iArr, iArr2, false);
        } else {
            V1475975160983963926.J(i, iArr, iArr2, true);
        }
    }

    @Override // dev.epro.r0.V4371024969283281503
    public Typeface g(R6694982557896913324 r6694982557896913324, int i) {
        return h(null, r6694982557896913324, i);
    }

    public U3985905046772670199 i() {
        return new U3985905046772670199("error", new Z3838016174256315005((byte) 6), new Z3838016174256315005((byte) 7), true, new A12662543779246224881(this, (byte) 9), null, new G4425564197697489570(3.0d, 4.5d, 7.0d, 7.0d), new H10891550656504408564(this, (byte) 0));
    }

    public U3985905046772670199 j() {
        return new U3985905046772670199("error_container", new Z3838016174256315005((byte) 18), new Z3838016174256315005((byte) 19), true, new A12662543779246224881(this, (byte) 9), null, new G4425564197697489570(1.0d, 1.0d, 3.0d, 4.5d), new H10891550656504408564(this, (byte) 1));
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
    public void o(R8540738700654750557 r8540738700654750557, int i, int[] iArr, int[] iArr2) {
        V1475975160983963926.J(i, iArr, iArr2, false);
    }

    public U3985905046772670199 p() {
        return new U3985905046772670199("primary", new Z3838016174256315005((byte) 23), new Z3838016174256315005((byte) 24), true, new A12662543779246224881(this, (byte) 9), null, new G4425564197697489570(3.0d, 4.5d, 7.0d, 7.0d), new H10891550656504408564(this, (byte) 3));
    }

    public U3985905046772670199 q() {
        return new U3985905046772670199("primary_container", new A12662543779246224881((byte) 15), new A12662543779246224881(this, (byte) 16), true, new A12662543779246224881(this, (byte) 9), null, new G4425564197697489570(1.0d, 1.0d, 3.0d, 4.5d), new H10891550656504408564(this, (byte) 6));
    }

    public U3985905046772670199 r() {
        return new U3985905046772670199("primary_fixed", new W7537226175090183024((byte) 28), new W7537226175090183024((byte) 29), true, new A12662543779246224881(this, (byte) 9), null, new G4425564197697489570(1.0d, 1.0d, 3.0d, 4.5d), new H10891550656504408564(this, (byte) 10));
    }

    public U3985905046772670199 s() {
        return new U3985905046772670199("primary_fixed_dim", new F11242842454977356935((byte) 1), new F11242842454977356935((byte) 2), true, new A12662543779246224881(this, (byte) 9), null, new G4425564197697489570(1.0d, 1.0d, 3.0d, 4.5d), new H10891550656504408564(this, (byte) 11));
    }

    public U3985905046772670199 t() {
        return new U3985905046772670199("secondary", new F11242842454977356935((byte) 8), new F11242842454977356935((byte) 10), true, new A12662543779246224881(this, (byte) 9), null, new G4425564197697489570(3.0d, 4.5d, 7.0d, 7.0d), new H10891550656504408564(this, (byte) 13));
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "Arrangement#Center";
            case 6:
                return "Empty";
            default:
                return super.toString();
        }
    }

    public U3985905046772670199 u() {
        return new U3985905046772670199("secondary_container", new A12662543779246224881((byte) 7), new A12662543779246224881(this, (byte) 8), true, new A12662543779246224881(this, (byte) 9), null, new G4425564197697489570(1.0d, 1.0d, 3.0d, 4.5d), new H10891550656504408564(this, (byte) 5));
    }

    public U3985905046772670199 v() {
        return new U3985905046772670199("secondary_fixed", new W7537226175090183024((byte) 6), new W7537226175090183024((byte) 7), true, new A12662543779246224881(this, (byte) 9), null, new G4425564197697489570(1.0d, 1.0d, 3.0d, 4.5d), new H10891550656504408564(this, (byte) 7));
    }

    public U3985905046772670199 w() {
        byte b = 9;
        return new U3985905046772670199("secondary_fixed_dim", new W7537226175090183024((byte) 22), new W7537226175090183024((byte) 23), true, new A12662543779246224881(this, b), null, new G4425564197697489570(1.0d, 1.0d, 3.0d, 4.5d), new H10891550656504408564(this, b));
    }

    public U3985905046772670199 x() {
        return new U3985905046772670199("tertiary", new A12662543779246224881((byte) 2), new A12662543779246224881((byte) 3), true, new A12662543779246224881(this, (byte) 9), null, new G4425564197697489570(3.0d, 4.5d, 7.0d, 7.0d), new H10891550656504408564(this, (byte) 4));
    }

    public U3985905046772670199 y() {
        return new U3985905046772670199("tertiary_container", new F11242842454977356935((byte) 3), new F11242842454977356935(this), true, new A12662543779246224881(this, (byte) 9), null, new G4425564197697489570(1.0d, 1.0d, 3.0d, 4.5d), new H10891550656504408564(this, (byte) 12));
    }

    public U3985905046772670199 z() {
        return new U3985905046772670199("tertiary_fixed", new Z3838016174256315005((byte) 21), new Z3838016174256315005((byte) 22), true, new A12662543779246224881(this, (byte) 9), null, new G4425564197697489570(1.0d, 1.0d, 3.0d, 4.5d), new H10891550656504408564(this, (byte) 2));
    }

    public /* synthetic */ E17149812035295265804(byte b) {
        this.a = b;
    }

    @Override // dev.epro.r0.I6255327262428024138
    public Object b(G6332201275426833390 g6332201275426833390) throws G6332201275426833390 {
        throw g6332201275426833390;
    }

    @Override // dev.epro.r0.O16368343340005843063
    public void m(int i, Object obj) {
    }

    @Override // dev.epro.r0.I15982850730816748353
    public void d(boolean z, int i, int i2, int i3) {
    }

    @Override // dev.epro.r0.I15982850730816748353
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }
}
