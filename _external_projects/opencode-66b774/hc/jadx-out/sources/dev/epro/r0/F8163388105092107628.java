package dev.epro.r0;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class F8163388105092107628 {
    public static final Pattern l = Pattern.compile("[^0-9A-Fa-f]");
    public static final HashMap m;
    public static final HashMap n;
    public final F7278720905790609885 a;
    public final ArrayList d;
    public R7459884459278244289 e;
    public final V14323974914327418545 h;
    public final J7183379813836568005 i;
    public final LinkedHashMap k;
    public boolean b = false;
    public int c = 0;
    public int f = 0;
    public int g = -1;
    public boolean j = true;

    static {
        HashMap map = new HashMap();
        m = map;
        HashMap map2 = new HashMap();
        n = map2;
        map.put('0', WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR);
        map.put('a', "\u0007");
        map.put('b', "\b");
        map.put('t', "\t");
        map.put('n', "\n");
        map.put('v', "\u000b");
        map.put('f', "\f");
        map.put('r', "\r");
        map.put('e', "\u001b");
        map.put(' ', " ");
        map.put('\"', "\"");
        map.put('\\', "\\");
        map.put('N', "\u0085");
        map.put('_', " ");
        map.put('L', "\u2028");
        map.put('P', "\u2029");
        map2.put('x', 2);
        map2.put('u', 4);
        map2.put('U', 8);
    }

    public F8163388105092107628(F7278720905790609885 f7278720905790609885, J7183379813836568005 j7183379813836568005) {
        if (j7183379813836568005 == null) {
            Z3383101362411723454.k("LoaderOptions must be provided.");
            throw null;
        }
        this.a = f7278720905790609885;
        this.d = new ArrayList(100);
        this.h = new V14323974914327418545(10, (byte) 1);
        this.k = new LinkedHashMap();
        this.i = j7183379813836568005;
        F16470721565862751885 f16470721565862751885C = f7278720905790609885.c();
        b(new E13494234869954508959(f16470721565862751885C, f16470721565862751885C));
    }

    public final boolean a(int i) {
        int i2 = this.g;
        if (i2 >= i) {
            return false;
        }
        this.h.m(Integer.valueOf(i2));
        this.g = i;
        return true;
    }

    public final void b(R7459884459278244289 r7459884459278244289) {
        this.e = r7459884459278244289;
        this.d.add(r7459884459278244289);
    }

    public final boolean c(int i) {
        while (l()) {
            j();
        }
        ArrayList arrayList = this.d;
        return !arrayList.isEmpty() && ((R7459884459278244289) arrayList.get(0)).a() == i;
    }

    public final boolean d(int... iArr) {
        while (l()) {
            j();
        }
        ArrayList arrayList = this.d;
        if (!arrayList.isEmpty()) {
            if (iArr.length == 0) {
                return true;
            }
            int iA = ((R7459884459278244289) arrayList.get(0)).a();
            for (int i : iArr) {
                if (iA == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void e(char c) {
        Boolean bool;
        int i;
        int i2;
        int iMax;
        String str;
        F16470721565862751885 f16470721565862751885;
        char c2;
        F16470721565862751885 f164707215658627518852;
        char c3 = 1;
        this.j = true;
        n();
        boolean z = c == '>';
        StringBuilder sb = new StringBuilder();
        F7278720905790609885 f7278720905790609885 = this.a;
        F16470721565862751885 f16470721565862751885C = f7278720905790609885.c();
        f7278720905790609885.b(1);
        int iD = f7278720905790609885.d();
        if (iD == 45 || iD == 43) {
            Boolean bool2 = iD == 43 ? Boolean.TRUE : Boolean.FALSE;
            f7278720905790609885.b(1);
            int iD2 = f7278720905790609885.d();
            if (Character.isDigit(iD2)) {
                int i3 = Integer.parseInt(String.valueOf(Character.toChars(iD2)));
                if (i3 == 0) {
                    K2042933864045806308.k("while scanning a block scalar", f16470721565862751885C, "expected indentation indicator in the range 1-9, but found 0", f7278720905790609885.c());
                    return;
                } else {
                    f7278720905790609885.b(1);
                    bool = bool2;
                    i = i3;
                }
            } else {
                bool = bool2;
                i = -1;
            }
        } else {
            if (Character.isDigit(iD)) {
                i = Integer.parseInt(String.valueOf(Character.toChars(iD)));
                if (i == 0) {
                    K2042933864045806308.k("while scanning a block scalar", f16470721565862751885C, "expected indentation indicator in the range 1-9, but found 0", f7278720905790609885.c());
                    return;
                }
                f7278720905790609885.b(1);
                int iD3 = f7278720905790609885.d();
                if (iD3 == 45 || iD3 == 43) {
                    bool = iD3 == 43 ? Boolean.TRUE : Boolean.FALSE;
                    f7278720905790609885.b(1);
                }
            } else {
                i = -1;
            }
            bool = null;
        }
        int iD4 = f7278720905790609885.d();
        if (P14266383314427251510.f.b(iD4)) {
            K2042933864045806308.k("while scanning a block scalar", f16470721565862751885C, G6547577305291411977.p(iD4, "expected chomping or indentation indicators, but found ", String.valueOf(Character.toChars(iD4)), "(", ")"), f7278720905790609885.c());
            return;
        }
        while (f7278720905790609885.d() == 32) {
            f7278720905790609885.b(1);
        }
        K13664774137076998873 k13664774137076998873R = f7278720905790609885.d() == 35 ? r(3) : null;
        int iD5 = f7278720905790609885.d();
        if (u().isEmpty() && iD5 != 0) {
            K2042933864045806308.k("while scanning a block scalar", f16470721565862751885C, G6547577305291411977.p(iD5, "expected a comment or a line break, but found ", String.valueOf(Character.toChars(iD5)), "(", ")"), f7278720905790609885.c());
            return;
        }
        int i4 = this.g + 1;
        if (i4 < 1) {
            i4 = 1;
        }
        if (i == -1) {
            StringBuilder sb2 = new StringBuilder();
            F16470721565862751885 f16470721565862751885C2 = f7278720905790609885.c();
            int i5 = 0;
            while (true) {
                P14266383314427251510 p14266383314427251510 = P14266383314427251510.d;
                i2 = 2;
                int iD6 = f7278720905790609885.d();
                if (!p14266383314427251510.a(iD6) && " \r".indexOf(iD6) == -1) {
                    break;
                }
                if (f7278720905790609885.d() != 32) {
                    sb2.append(u());
                    f16470721565862751885C2 = f7278720905790609885.c();
                } else {
                    f7278720905790609885.b(1);
                    int i6 = f7278720905790609885.i;
                    if (i6 > i5) {
                        i5 = i6;
                    }
                }
            }
            Object[] objArr = {sb2.toString(), Integer.valueOf(i5), f16470721565862751885C2};
            str = (String) objArr[0];
            int iIntValue = ((Integer) objArr[1]).intValue();
            f16470721565862751885 = (F16470721565862751885) objArr[2];
            iMax = Math.max(i4, iIntValue);
        } else {
            i2 = 2;
            iMax = (i4 + i) - 1;
            Object[] objArrQ = q(iMax);
            str = (String) objArrQ[0];
            f16470721565862751885 = (F16470721565862751885) objArrQ[1];
        }
        String strU = "";
        while (f7278720905790609885.i == iMax && f7278720905790609885.d() != 0) {
            sb.append(str);
            char c4 = " \t".indexOf(f7278720905790609885.d()) == -1 ? c3 : (char) 0;
            int i7 = 0;
            while (P14266383314427251510.e.b(f7278720905790609885.e(i7))) {
                i7++;
            }
            sb.append(f7278720905790609885.g(i7));
            strU = u();
            Object[] objArrQ2 = q(iMax);
            String str2 = (String) objArrQ2[0];
            F16470721565862751885 f164707215658627518853 = (F16470721565862751885) objArrQ2[c3];
            c2 = c3;
            if (f7278720905790609885.i != iMax || f7278720905790609885.d() == 0) {
                f164707215658627518852 = f164707215658627518853;
                str = str2;
                break;
            }
            if (!z || !"\n".equals(strU) || c4 == 0 || " \t".indexOf(f7278720905790609885.d()) != -1) {
                sb.append(strU);
            } else if (str2.isEmpty()) {
                sb.append(' ');
            }
            f16470721565862751885 = f164707215658627518853;
            str = str2;
            c3 = c2;
        }
        c2 = c3;
        f164707215658627518852 = f16470721565862751885;
        if (bool == null || bool.booleanValue()) {
            sb.append(strU);
        }
        if (bool != null && bool.booleanValue()) {
            sb.append(str);
        }
        E18402120839174749722 e18402120839174749722 = new E18402120839174749722(sb.toString(), false, f16470721565862751885C, f164707215658627518852, Q3209512064461050809.a(Character.valueOf(c)));
        int i8 = i2;
        R7459884459278244289[] r7459884459278244289Arr = new R7459884459278244289[i8];
        r7459884459278244289Arr[0] = k13664774137076998873R;
        r7459884459278244289Arr[c2] = e18402120839174749722;
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < i8; i9++) {
            R7459884459278244289 r7459884459278244289 = r7459884459278244289Arr[i9];
            if (r7459884459278244289 != null && !(r7459884459278244289 instanceof K13664774137076998873)) {
                arrayList.add(r7459884459278244289);
            }
        }
        this.e = (R7459884459278244289) arrayList.get(arrayList.size() - 1);
        this.d.addAll(arrayList);
    }

    public final void f(boolean z) {
        z(-1);
        n();
        this.j = false;
        F7278720905790609885 f7278720905790609885 = this.a;
        F16470721565862751885 f16470721565862751885C = f7278720905790609885.c();
        f7278720905790609885.b(3);
        F16470721565862751885 f16470721565862751885C2 = f7278720905790609885.c();
        b(z ? new B10191660839256065701(f16470721565862751885C, f16470721565862751885C2, (byte) 4) : new B10191660839256065701(f16470721565862751885C, f16470721565862751885C2, (byte) 3));
    }

    public final void g(boolean z) {
        n();
        this.c--;
        this.j = false;
        F7278720905790609885 f7278720905790609885 = this.a;
        F16470721565862751885 f16470721565862751885C = f7278720905790609885.c();
        f7278720905790609885.b(1);
        F16470721565862751885 f16470721565862751885C2 = f7278720905790609885.c();
        b(z ? new B10191660839256065701(f16470721565862751885C, f16470721565862751885C2, (byte) 6) : new B10191660839256065701(f16470721565862751885C, f16470721565862751885C2, (byte) 8));
    }

    public final void h(boolean z) {
        o();
        this.c++;
        this.j = true;
        F7278720905790609885 f7278720905790609885 = this.a;
        F16470721565862751885 f16470721565862751885C = f7278720905790609885.c();
        f7278720905790609885.b(1);
        F16470721565862751885 f16470721565862751885C2 = f7278720905790609885.c();
        b(z ? new B10191660839256065701(f16470721565862751885C, f16470721565862751885C2, (byte) 7) : new B10191660839256065701(f16470721565862751885C, f16470721565862751885C2, (byte) 9));
    }

    public final void i(char c) {
        o();
        this.j = false;
        boolean z = c == '\"';
        StringBuilder sb = new StringBuilder();
        F7278720905790609885 f7278720905790609885 = this.a;
        F16470721565862751885 f16470721565862751885C = f7278720905790609885.c();
        int iD = f7278720905790609885.d();
        f7278720905790609885.b(1);
        t(z, f16470721565862751885C, sb);
        while (f7278720905790609885.d() != iD) {
            int i = 0;
            while (" \t".indexOf(f7278720905790609885.e(i)) != -1) {
                i++;
            }
            String strG = f7278720905790609885.g(i);
            if (f7278720905790609885.d() == 0) {
                K2042933864045806308.k("while scanning a quoted scalar", f16470721565862751885C, "found unexpected end of stream", f7278720905790609885.c());
                return;
            }
            String strU = u();
            if (strU.isEmpty()) {
                sb.append(strG);
            } else {
                String strS = s(f16470721565862751885C);
                if (!"\n".equals(strU)) {
                    sb.append(strU);
                } else if (strS.isEmpty()) {
                    sb.append(' ');
                }
                sb.append(strS);
            }
            t(z, f16470721565862751885C, sb);
        }
        f7278720905790609885.b(1);
        b(new E18402120839174749722(sb.toString(), false, f16470721565862751885C, f7278720905790609885.c(), Q3209512064461050809.a(Character.valueOf(c))));
    }

    /* JADX WARN: Removed duplicated region for block: B:230:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0609  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instruction units count: 1912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.F8163388105092107628.j():void");
    }

    public final R7459884459278244289 k() {
        this.f++;
        return (R7459884459278244289) this.d.remove(0);
    }

    public final boolean l() {
        if (this.b) {
            return false;
        }
        if (this.d.isEmpty()) {
            return true;
        }
        y();
        LinkedHashMap linkedHashMap = this.k;
        return (!linkedHashMap.isEmpty() ? ((U12281394911709091011) linkedHashMap.values().iterator().next()).a : -1) == this.f;
    }

    public final R7459884459278244289 m() {
        while (l()) {
            j();
        }
        return (R7459884459278244289) this.d.get(0);
    }

    public final void n() {
        U12281394911709091011 u12281394911709091011 = (U12281394911709091011) this.k.remove(Integer.valueOf(this.c));
        if (u12281394911709091011 == null || !u12281394911709091011.b) {
            return;
        }
        K2042933864045806308.k("while scanning a simple key", u12281394911709091011.f, "could not find expected ':'", this.a.c());
    }

    public final void o() {
        int i = this.c;
        F7278720905790609885 f7278720905790609885 = this.a;
        boolean z = i == 0 && this.g == f7278720905790609885.i;
        boolean z2 = this.j;
        if (!z2 && z) {
            throw new M8821877208104636290("A simple key is required only if it is the first token in the current line");
        }
        if (z2) {
            n();
            this.k.put(Integer.valueOf(this.c), new U12281394911709091011(this.d.size() + this.f, z, f7278720905790609885.f, f7278720905790609885.h, f7278720905790609885.i, f7278720905790609885.c()));
        }
    }

    public final R7459884459278244289 p(boolean z) {
        P14266383314427251510 p14266383314427251510;
        F7278720905790609885 f7278720905790609885 = this.a;
        F16470721565862751885 f16470721565862751885C = f7278720905790609885.c();
        String str = f7278720905790609885.d() == 42 ? "alias" : "anchor";
        boolean z2 = true;
        f7278720905790609885.b(1);
        int iE = f7278720905790609885.e(0);
        int i = 0;
        while (true) {
            p14266383314427251510 = P14266383314427251510.g;
            if (p14266383314427251510.a(iE) || ":,[]{}/.*&".indexOf(iE) != -1) {
                break;
            }
            i++;
            iE = f7278720905790609885.e(i);
        }
        if (i == 0) {
            K2042933864045806308.k("while scanning an ".concat(str), f16470721565862751885C, G6547577305291411977.p(iE, "unexpected character found ", String.valueOf(Character.toChars(iE)), "(", ")"), f7278720905790609885.c());
            return null;
        }
        String strG = f7278720905790609885.g(i);
        int iD = f7278720905790609885.d();
        if (!p14266383314427251510.a(iD) && "?:,]}%@`".indexOf(iD) == -1) {
            z2 = false;
        }
        if (z2) {
            F16470721565862751885 f16470721565862751885C2 = f7278720905790609885.c();
            return z ? new P9699585765777919733(strG, f16470721565862751885C, f16470721565862751885C2) : new V9411617340026015285(strG, f16470721565862751885C, f16470721565862751885C2);
        }
        K2042933864045806308.k("while scanning an ".concat(str), f16470721565862751885C, G6547577305291411977.p(iD, "unexpected character found ", String.valueOf(Character.toChars(iD)), "(", ")"), f7278720905790609885.c());
        return null;
    }

    public final Object[] q(int i) {
        StringBuilder sb = new StringBuilder();
        F7278720905790609885 f7278720905790609885 = this.a;
        F16470721565862751885 f16470721565862751885C = f7278720905790609885.c();
        for (int i2 = f7278720905790609885.i; i2 < i && f7278720905790609885.d() == 32; i2++) {
            f7278720905790609885.b(1);
        }
        while (true) {
            String strU = u();
            if (strU.isEmpty()) {
                return new Object[]{sb.toString(), f16470721565862751885C};
            }
            sb.append(strU);
            f16470721565862751885C = f7278720905790609885.c();
            for (int i3 = f7278720905790609885.i; i3 < i && f7278720905790609885.d() == 32; i3++) {
                f7278720905790609885.b(1);
            }
        }
    }

    public final K13664774137076998873 r(int i) {
        F7278720905790609885 f7278720905790609885 = this.a;
        F16470721565862751885 f16470721565862751885C = f7278720905790609885.c();
        f7278720905790609885.b(1);
        int i2 = 0;
        while (P14266383314427251510.e.b(f7278720905790609885.e(i2))) {
            i2++;
        }
        return new K13664774137076998873(i, f7278720905790609885.g(i2), f16470721565862751885C, f7278720905790609885.c());
    }

    public final String s(F16470721565862751885 f16470721565862751885) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            F7278720905790609885 f7278720905790609885 = this.a;
            String strF = f7278720905790609885.f(3);
            if (("---".equals(strF) || "...".equals(strF)) && P14266383314427251510.g.a(f7278720905790609885.e(3))) {
                K2042933864045806308.k("while scanning a quoted scalar", f16470721565862751885, "found unexpected document separator", f7278720905790609885.c());
                return null;
            }
            while (" \t".indexOf(f7278720905790609885.d()) != -1) {
                f7278720905790609885.b(1);
            }
            String strU = u();
            if (strU.isEmpty()) {
                return sb.toString();
            }
            sb.append(strU);
        }
    }

    public final void t(boolean z, F16470721565862751885 f16470721565862751885, StringBuilder sb) {
        F7278720905790609885 f7278720905790609885;
        while (true) {
            int i = 0;
            while (true) {
                P14266383314427251510 p14266383314427251510 = P14266383314427251510.g;
                f7278720905790609885 = this.a;
                int iE = f7278720905790609885.e(i);
                if (p14266383314427251510.a(iE) || "'\"\\".indexOf(iE) != -1) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != 0) {
                sb.append(f7278720905790609885.g(i));
            }
            int iD = f7278720905790609885.d();
            if (!z && iD == 39 && f7278720905790609885.e(1) == 39) {
                sb.append('\'');
                f7278720905790609885.b(2);
            } else if ((z && iD == 39) || (!z && "\"\\".indexOf(iD) != -1)) {
                sb.appendCodePoint(iD);
                f7278720905790609885.b(1);
            } else {
                if (!z || iD != 92) {
                    return;
                }
                f7278720905790609885.b(1);
                int iD2 = f7278720905790609885.d();
                if (!Character.isSupplementaryCodePoint(iD2)) {
                    char c = (char) iD2;
                    Character chValueOf = Character.valueOf(c);
                    HashMap map = m;
                    if (map.containsKey(chValueOf)) {
                        sb.append((String) map.get(Character.valueOf(c)));
                        f7278720905790609885.b(1);
                    }
                }
                if (!Character.isSupplementaryCodePoint(iD2)) {
                    char c2 = (char) iD2;
                    Character chValueOf2 = Character.valueOf(c2);
                    HashMap map2 = n;
                    if (map2.containsKey(chValueOf2)) {
                        int iIntValue = ((Integer) map2.get(Character.valueOf(c2))).intValue();
                        f7278720905790609885.b(1);
                        String strF = f7278720905790609885.f(iIntValue);
                        if (l.matcher(strF).find()) {
                            K2042933864045806308.k("while scanning a double-quoted scalar", f16470721565862751885, "expected escape sequence of " + iIntValue + " hexadecimal numbers, but found: " + strF, f7278720905790609885.c());
                            return;
                        }
                        try {
                            sb.appendCodePoint(Integer.parseInt(strF, 16));
                            f7278720905790609885.b(iIntValue);
                        } catch (IllegalArgumentException unused) {
                            K2042933864045806308.k("while scanning a double-quoted scalar", f16470721565862751885, "found unknown escape character ".concat(strF), f7278720905790609885.c());
                            return;
                        }
                    }
                }
                if (u().isEmpty()) {
                    K2042933864045806308.k("while scanning a double-quoted scalar", f16470721565862751885, G6547577305291411977.p(iD2, "found unknown escape character ", String.valueOf(Character.toChars(iD2)), "(", ")"), f7278720905790609885.c());
                    return;
                }
                sb.append(s(f16470721565862751885));
            }
        }
    }

    public final String u() {
        F7278720905790609885 f7278720905790609885 = this.a;
        int iD = f7278720905790609885.d();
        if (iD != 13 && iD != 10 && iD != 133) {
            if (iD != 8232 && iD != 8233) {
                return "";
            }
            f7278720905790609885.b(1);
            return String.valueOf(Character.toChars(iD));
        }
        if (iD == 13 && 10 == f7278720905790609885.e(1)) {
            f7278720905790609885.b(2);
            return "\n";
        }
        f7278720905790609885.b(1);
        return "\n";
    }

    public final String v(String str, F16470721565862751885 f16470721565862751885) {
        F7278720905790609885 f7278720905790609885 = this.a;
        int iD = f7278720905790609885.d();
        if (iD != 33) {
            K2042933864045806308.k("while scanning a ".concat(str), f16470721565862751885, G6547577305291411977.p(iD, "expected '!', but found ", String.valueOf(Character.toChars(iD)), "(", ")"), f7278720905790609885.c());
            return null;
        }
        int i = 1;
        int iE = f7278720905790609885.e(1);
        if (iE != 32) {
            int i2 = 1;
            while (P14266383314427251510.i.a(iE)) {
                i2++;
                iE = f7278720905790609885.e(i2);
            }
            if (iE != 33) {
                f7278720905790609885.b(i2);
                K2042933864045806308.k("while scanning a ".concat(str), f16470721565862751885, G6547577305291411977.p(iE, "expected '!', but found ", String.valueOf(Character.toChars(iE)), "(", ")"), f7278720905790609885.c());
                return null;
            }
            i = 1 + i2;
        }
        return f7278720905790609885.g(i);
    }

    public final String w(String str, F16470721565862751885 f16470721565862751885) {
        StringBuilder sb = new StringBuilder();
        F7278720905790609885 f7278720905790609885 = this.a;
        int iE = f7278720905790609885.e(0);
        int i = 0;
        while (P14266383314427251510.h.a(iE)) {
            if (iE == 37) {
                sb.append(f7278720905790609885.g(i));
                int i2 = 1;
                while (f7278720905790609885.e(i2 * 3) == 37) {
                    i2++;
                }
                F16470721565862751885 f16470721565862751885C = f7278720905790609885.c();
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i2);
                while (f7278720905790609885.d() == 37) {
                    f7278720905790609885.b(1);
                    try {
                        byteBufferAllocate.put((byte) Integer.parseInt(f7278720905790609885.f(2), 16));
                        f7278720905790609885.b(2);
                    } catch (NumberFormatException unused) {
                        int iD = f7278720905790609885.d();
                        String strValueOf = String.valueOf(Character.toChars(iD));
                        int iE2 = f7278720905790609885.e(1);
                        String strValueOf2 = String.valueOf(Character.toChars(iE2));
                        String strConcat = "while scanning a ".concat(str);
                        StringBuilder sbX = G6547577305291411977.x(iD, "expected URI escape sequence of 2 hexadecimal numbers, but found ", strValueOf, "(", ") and ");
                        sbX.append(strValueOf2);
                        sbX.append("(");
                        sbX.append(iE2);
                        sbX.append(")");
                        K2042933864045806308.k(strConcat, f16470721565862751885, sbX.toString(), f7278720905790609885.c());
                        return null;
                    }
                }
                byteBufferAllocate.flip();
                try {
                    sb.append(A993230717920875259.a.decode(byteBufferAllocate).toString());
                    i = 0;
                } catch (CharacterCodingException e) {
                    throw new P13193549499509261669("while scanning a ".concat(str), f16470721565862751885, "expected URI in UTF-8: " + e.getMessage(), f16470721565862751885C);
                }
            } else {
                i++;
            }
            iE = f7278720905790609885.e(i);
        }
        if (i != 0) {
            sb.append(f7278720905790609885.g(i));
        }
        if (sb.length() != 0) {
            return sb.toString();
        }
        K2042933864045806308.k("while scanning a ".concat(str), f16470721565862751885, G6547577305291411977.p(iE, "expected URI, but found ", String.valueOf(Character.toChars(iE)), "(", ")"), f7278720905790609885.c());
        return null;
    }

    public final Integer x(F16470721565862751885 f16470721565862751885) {
        F7278720905790609885 f7278720905790609885 = this.a;
        int iD = f7278720905790609885.d();
        if (!Character.isDigit(iD)) {
            K2042933864045806308.k("while scanning a directive", f16470721565862751885, G6547577305291411977.p(iD, "expected a digit, but found ", String.valueOf(Character.toChars(iD)), "(", ")"), f7278720905790609885.c());
            return null;
        }
        int i = 0;
        while (Character.isDigit(f7278720905790609885.e(i))) {
            i++;
        }
        String strG = f7278720905790609885.g(i);
        if (i <= 3) {
            return Integer.valueOf(Integer.parseInt(strG));
        }
        K2042933864045806308.k("while scanning a YAML directive", f16470721565862751885, "found a number which cannot represent a valid version: ".concat(strG), f7278720905790609885.c());
        return null;
    }

    public final void y() {
        LinkedHashMap linkedHashMap = this.k;
        if (linkedHashMap.isEmpty()) {
            return;
        }
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            U12281394911709091011 u12281394911709091011 = (U12281394911709091011) it.next();
            int i = u12281394911709091011.d;
            F7278720905790609885 f7278720905790609885 = this.a;
            if (i != f7278720905790609885.h || f7278720905790609885.f - u12281394911709091011.c > 1024) {
                if (u12281394911709091011.b) {
                    K2042933864045806308.k("while scanning a simple key", u12281394911709091011.f, "could not find expected ':'", f7278720905790609885.c());
                    return;
                }
                it.remove();
            }
        }
    }

    public final void z(int i) {
        if (this.c != 0) {
            return;
        }
        while (this.g > i) {
            F16470721565862751885 f16470721565862751885C = this.a.c();
            this.g = ((Integer) this.h.l()).intValue();
            b(new B10191660839256065701(f16470721565862751885C, f16470721565862751885C, (byte) 0));
        }
    }
}
