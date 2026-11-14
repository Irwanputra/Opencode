package dev.epro.r0;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
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
        HashMap hashMap = new HashMap();
        m = hashMap;
        HashMap hashMap2 = new HashMap();
        n = hashMap2;
        hashMap.put('0', WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR);
        hashMap.put('a', "\u0007");
        hashMap.put('b', "\b");
        hashMap.put('t', "\t");
        hashMap.put('n', "\n");
        hashMap.put('v', "\u000b");
        hashMap.put('f', "\f");
        hashMap.put('r', "\r");
        hashMap.put('e', "\u001b");
        hashMap.put(' ', " ");
        hashMap.put('\"', "\"");
        hashMap.put('\\', "\\");
        hashMap.put('N', "\u0085");
        hashMap.put('_', " ");
        hashMap.put('L', "\u2028");
        hashMap.put('P', "\u2029");
        hashMap2.put('x', 2);
        hashMap2.put('u', 4);
        hashMap2.put('U', 8);
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
        F16470721565862751885 c = f7278720905790609885.c();
        b(new E13494234869954508959(c, c));
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
            int a = ((R7459884459278244289) arrayList.get(0)).a();
            for (int i : iArr) {
                if (a == i) {
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
        int i3;
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
        F16470721565862751885 c4 = f7278720905790609885.c();
        f7278720905790609885.b(1);
        int d = f7278720905790609885.d();
        if (d == 45 || d == 43) {
            Boolean bool2 = d == 43 ? Boolean.TRUE : Boolean.FALSE;
            f7278720905790609885.b(1);
            int d2 = f7278720905790609885.d();
            if (Character.isDigit(d2)) {
                int parseInt = Integer.parseInt(String.valueOf(Character.toChars(d2)));
                if (parseInt == 0) {
                    K2042933864045806308.k("while scanning a block scalar", c4, "expected indentation indicator in the range 1-9, but found 0", f7278720905790609885.c());
                    return;
                } else {
                    f7278720905790609885.b(1);
                    bool = bool2;
                    i = parseInt;
                }
            } else {
                bool = bool2;
                i = -1;
            }
        } else {
            if (Character.isDigit(d)) {
                i = Integer.parseInt(String.valueOf(Character.toChars(d)));
                if (i == 0) {
                    K2042933864045806308.k("while scanning a block scalar", c4, "expected indentation indicator in the range 1-9, but found 0", f7278720905790609885.c());
                    return;
                }
                f7278720905790609885.b(1);
                int d3 = f7278720905790609885.d();
                if (d3 == 45 || d3 == 43) {
                    bool = d3 == 43 ? Boolean.TRUE : Boolean.FALSE;
                    f7278720905790609885.b(1);
                }
            } else {
                i = -1;
            }
            bool = null;
        }
        int d4 = f7278720905790609885.d();
        if (P14266383314427251510.f.b(d4)) {
            K2042933864045806308.k("while scanning a block scalar", c4, G6547577305291411977.p(d4, "expected chomping or indentation indicators, but found ", String.valueOf(Character.toChars(d4)), "(", ")"), f7278720905790609885.c());
            return;
        }
        while (f7278720905790609885.d() == 32) {
            f7278720905790609885.b(1);
        }
        K13664774137076998873 r = f7278720905790609885.d() == 35 ? r(3) : null;
        int d5 = f7278720905790609885.d();
        if (u().isEmpty() && d5 != 0) {
            K2042933864045806308.k("while scanning a block scalar", c4, G6547577305291411977.p(d5, "expected a comment or a line break, but found ", String.valueOf(Character.toChars(d5)), "(", ")"), f7278720905790609885.c());
            return;
        }
        int i4 = this.g + 1;
        if (i4 < 1) {
            i4 = 1;
        }
        if (i == -1) {
            StringBuilder sb2 = new StringBuilder();
            F16470721565862751885 c5 = f7278720905790609885.c();
            int i5 = 0;
            while (true) {
                P14266383314427251510 p14266383314427251510 = P14266383314427251510.d;
                i2 = 2;
                int d6 = f7278720905790609885.d();
                if (!p14266383314427251510.a(d6) && " \r".indexOf(d6) == -1) {
                    break;
                }
                if (f7278720905790609885.d() != 32) {
                    sb2.append(u());
                    c5 = f7278720905790609885.c();
                } else {
                    f7278720905790609885.b(1);
                    int i6 = f7278720905790609885.i;
                    if (i6 > i5) {
                        i5 = i6;
                    }
                }
            }
            Object[] objArr = {sb2.toString(), Integer.valueOf(i5), c5};
            str = (String) objArr[0];
            int intValue = ((Integer) objArr[1]).intValue();
            f16470721565862751885 = (F16470721565862751885) objArr[2];
            i3 = Math.max(i4, intValue);
        } else {
            i2 = 2;
            i3 = (i4 + i) - 1;
            Object[] q = q(i3);
            str = (String) q[0];
            f16470721565862751885 = (F16470721565862751885) q[1];
        }
        String str2 = "";
        while (f7278720905790609885.i == i3 && f7278720905790609885.d() != 0) {
            sb.append(str);
            char c6 = " \t".indexOf(f7278720905790609885.d()) == -1 ? c3 : (char) 0;
            int i7 = 0;
            while (P14266383314427251510.e.b(f7278720905790609885.e(i7))) {
                i7++;
            }
            sb.append(f7278720905790609885.g(i7));
            str2 = u();
            Object[] q2 = q(i3);
            String str3 = (String) q2[0];
            F16470721565862751885 f164707215658627518853 = (F16470721565862751885) q2[c3];
            c2 = c3;
            if (f7278720905790609885.i != i3 || f7278720905790609885.d() == 0) {
                f164707215658627518852 = f164707215658627518853;
                str = str3;
                break;
            }
            if (!z || !"\n".equals(str2) || c6 == 0 || " \t".indexOf(f7278720905790609885.d()) != -1) {
                sb.append(str2);
            } else if (str3.isEmpty()) {
                sb.append(' ');
            }
            f16470721565862751885 = f164707215658627518853;
            str = str3;
            c3 = c2;
        }
        c2 = c3;
        f164707215658627518852 = f16470721565862751885;
        if (bool == null || bool.booleanValue()) {
            sb.append(str2);
        }
        if (bool != null && bool.booleanValue()) {
            sb.append(str);
        }
        E18402120839174749722 e18402120839174749722 = new E18402120839174749722(sb.toString(), false, c4, f164707215658627518852, Q3209512064461050809.a(Character.valueOf(c)));
        int i8 = i2;
        R7459884459278244289[] r7459884459278244289Arr = new R7459884459278244289[i8];
        r7459884459278244289Arr[0] = r;
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
        F16470721565862751885 c = f7278720905790609885.c();
        f7278720905790609885.b(3);
        F16470721565862751885 c2 = f7278720905790609885.c();
        b(z ? new B10191660839256065701(c, c2, (byte) 4) : new B10191660839256065701(c, c2, (byte) 3));
    }

    public final void g(boolean z) {
        n();
        this.c--;
        this.j = false;
        F7278720905790609885 f7278720905790609885 = this.a;
        F16470721565862751885 c = f7278720905790609885.c();
        f7278720905790609885.b(1);
        F16470721565862751885 c2 = f7278720905790609885.c();
        b(z ? new B10191660839256065701(c, c2, (byte) 6) : new B10191660839256065701(c, c2, (byte) 8));
    }

    public final void h(boolean z) {
        o();
        this.c++;
        this.j = true;
        F7278720905790609885 f7278720905790609885 = this.a;
        F16470721565862751885 c = f7278720905790609885.c();
        f7278720905790609885.b(1);
        F16470721565862751885 c2 = f7278720905790609885.c();
        b(z ? new B10191660839256065701(c, c2, (byte) 7) : new B10191660839256065701(c, c2, (byte) 9));
    }

    public final void i(char c) {
        o();
        this.j = false;
        boolean z = c == '\"';
        StringBuilder sb = new StringBuilder();
        F7278720905790609885 f7278720905790609885 = this.a;
        F16470721565862751885 c2 = f7278720905790609885.c();
        int d = f7278720905790609885.d();
        f7278720905790609885.b(1);
        t(z, c2, sb);
        while (f7278720905790609885.d() != d) {
            int i = 0;
            while (" \t".indexOf(f7278720905790609885.e(i)) != -1) {
                i++;
            }
            String g = f7278720905790609885.g(i);
            if (f7278720905790609885.d() == 0) {
                K2042933864045806308.k("while scanning a quoted scalar", c2, "found unexpected end of stream", f7278720905790609885.c());
                return;
            }
            String u = u();
            if (u.isEmpty()) {
                sb.append(g);
            } else {
                String s = s(c2);
                if (!"\n".equals(u)) {
                    sb.append(u);
                } else if (s.isEmpty()) {
                    sb.append(' ');
                }
                sb.append(s);
            }
            t(z, c2, sb);
        }
        f7278720905790609885.b(1);
        b(new E18402120839174749722(sb.toString(), false, c2, f7278720905790609885.c(), Q3209512064461050809.a(Character.valueOf(c))));
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0703 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0466  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 1912
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
        F16470721565862751885 c = f7278720905790609885.c();
        String str = f7278720905790609885.d() == 42 ? "alias" : "anchor";
        boolean z2 = true;
        f7278720905790609885.b(1);
        int e = f7278720905790609885.e(0);
        int i = 0;
        while (true) {
            p14266383314427251510 = P14266383314427251510.g;
            if (p14266383314427251510.a(e) || ":,[]{}/.*&".indexOf(e) != -1) {
                break;
            }
            i++;
            e = f7278720905790609885.e(i);
        }
        if (i == 0) {
            K2042933864045806308.k("while scanning an ".concat(str), c, G6547577305291411977.p(e, "unexpected character found ", String.valueOf(Character.toChars(e)), "(", ")"), f7278720905790609885.c());
            return null;
        }
        String g = f7278720905790609885.g(i);
        int d = f7278720905790609885.d();
        if (!p14266383314427251510.a(d) && "?:,]}%@`".indexOf(d) == -1) {
            z2 = false;
        }
        if (z2) {
            F16470721565862751885 c2 = f7278720905790609885.c();
            return z ? new P9699585765777919733(g, c, c2) : new V9411617340026015285(g, c, c2);
        }
        K2042933864045806308.k("while scanning an ".concat(str), c, G6547577305291411977.p(d, "unexpected character found ", String.valueOf(Character.toChars(d)), "(", ")"), f7278720905790609885.c());
        return null;
    }

    public final Object[] q(int i) {
        StringBuilder sb = new StringBuilder();
        F7278720905790609885 f7278720905790609885 = this.a;
        F16470721565862751885 c = f7278720905790609885.c();
        for (int i2 = f7278720905790609885.i; i2 < i && f7278720905790609885.d() == 32; i2++) {
            f7278720905790609885.b(1);
        }
        while (true) {
            String u = u();
            if (u.isEmpty()) {
                return new Object[]{sb.toString(), c};
            }
            sb.append(u);
            c = f7278720905790609885.c();
            for (int i3 = f7278720905790609885.i; i3 < i && f7278720905790609885.d() == 32; i3++) {
                f7278720905790609885.b(1);
            }
        }
    }

    public final K13664774137076998873 r(int i) {
        F7278720905790609885 f7278720905790609885 = this.a;
        F16470721565862751885 c = f7278720905790609885.c();
        f7278720905790609885.b(1);
        int i2 = 0;
        while (P14266383314427251510.e.b(f7278720905790609885.e(i2))) {
            i2++;
        }
        return new K13664774137076998873(i, f7278720905790609885.g(i2), c, f7278720905790609885.c());
    }

    public final String s(F16470721565862751885 f16470721565862751885) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            F7278720905790609885 f7278720905790609885 = this.a;
            String f = f7278720905790609885.f(3);
            if (("---".equals(f) || "...".equals(f)) && P14266383314427251510.g.a(f7278720905790609885.e(3))) {
                K2042933864045806308.k("while scanning a quoted scalar", f16470721565862751885, "found unexpected document separator", f7278720905790609885.c());
                return null;
            }
            while (" \t".indexOf(f7278720905790609885.d()) != -1) {
                f7278720905790609885.b(1);
            }
            String u = u();
            if (u.isEmpty()) {
                return sb.toString();
            }
            sb.append(u);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r0 == 39) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(boolean r9, dev.epro.r0.F16470721565862751885 r10, java.lang.StringBuilder r11) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.F8163388105092107628.t(boolean, dev.epro.r0.F16470721565862751885, java.lang.StringBuilder):void");
    }

    public final String u() {
        F7278720905790609885 f7278720905790609885 = this.a;
        int d = f7278720905790609885.d();
        if (d != 13 && d != 10 && d != 133) {
            if (d != 8232 && d != 8233) {
                return "";
            }
            f7278720905790609885.b(1);
            return String.valueOf(Character.toChars(d));
        }
        if (d == 13 && 10 == f7278720905790609885.e(1)) {
            f7278720905790609885.b(2);
            return "\n";
        }
        f7278720905790609885.b(1);
        return "\n";
    }

    public final String v(String str, F16470721565862751885 f16470721565862751885) {
        F7278720905790609885 f7278720905790609885 = this.a;
        int d = f7278720905790609885.d();
        if (d != 33) {
            K2042933864045806308.k("while scanning a ".concat(str), f16470721565862751885, G6547577305291411977.p(d, "expected '!', but found ", String.valueOf(Character.toChars(d)), "(", ")"), f7278720905790609885.c());
            return null;
        }
        int i = 1;
        int e = f7278720905790609885.e(1);
        if (e != 32) {
            int i2 = 1;
            while (P14266383314427251510.i.a(e)) {
                i2++;
                e = f7278720905790609885.e(i2);
            }
            if (e != 33) {
                f7278720905790609885.b(i2);
                K2042933864045806308.k("while scanning a ".concat(str), f16470721565862751885, G6547577305291411977.p(e, "expected '!', but found ", String.valueOf(Character.toChars(e)), "(", ")"), f7278720905790609885.c());
                return null;
            }
            i = 1 + i2;
        }
        return f7278720905790609885.g(i);
    }

    public final String w(String str, F16470721565862751885 f16470721565862751885) {
        StringBuilder sb = new StringBuilder();
        F7278720905790609885 f7278720905790609885 = this.a;
        int e = f7278720905790609885.e(0);
        int i = 0;
        while (P14266383314427251510.h.a(e)) {
            if (e == 37) {
                sb.append(f7278720905790609885.g(i));
                int i2 = 1;
                while (f7278720905790609885.e(i2 * 3) == 37) {
                    i2++;
                }
                F16470721565862751885 c = f7278720905790609885.c();
                ByteBuffer allocate = ByteBuffer.allocate(i2);
                while (f7278720905790609885.d() == 37) {
                    f7278720905790609885.b(1);
                    try {
                        allocate.put((byte) Integer.parseInt(f7278720905790609885.f(2), 16));
                        f7278720905790609885.b(2);
                    } catch (NumberFormatException unused) {
                        int d = f7278720905790609885.d();
                        String valueOf = String.valueOf(Character.toChars(d));
                        int e2 = f7278720905790609885.e(1);
                        String valueOf2 = String.valueOf(Character.toChars(e2));
                        String concat = "while scanning a ".concat(str);
                        StringBuilder x = G6547577305291411977.x(d, "expected URI escape sequence of 2 hexadecimal numbers, but found ", valueOf, "(", ") and ");
                        x.append(valueOf2);
                        x.append("(");
                        x.append(e2);
                        x.append(")");
                        K2042933864045806308.k(concat, f16470721565862751885, x.toString(), f7278720905790609885.c());
                        return null;
                    }
                }
                allocate.flip();
                try {
                    sb.append(A993230717920875259.a.decode(allocate).toString());
                    i = 0;
                } catch (CharacterCodingException e3) {
                    throw new P13193549499509261669("while scanning a ".concat(str), f16470721565862751885, "expected URI in UTF-8: " + e3.getMessage(), c);
                }
            } else {
                i++;
            }
            e = f7278720905790609885.e(i);
        }
        if (i != 0) {
            sb.append(f7278720905790609885.g(i));
        }
        if (sb.length() != 0) {
            return sb.toString();
        }
        K2042933864045806308.k("while scanning a ".concat(str), f16470721565862751885, G6547577305291411977.p(e, "expected URI, but found ", String.valueOf(Character.toChars(e)), "(", ")"), f7278720905790609885.c());
        return null;
    }

    public final Integer x(F16470721565862751885 f16470721565862751885) {
        F7278720905790609885 f7278720905790609885 = this.a;
        int d = f7278720905790609885.d();
        if (!Character.isDigit(d)) {
            K2042933864045806308.k("while scanning a directive", f16470721565862751885, G6547577305291411977.p(d, "expected a digit, but found ", String.valueOf(Character.toChars(d)), "(", ")"), f7278720905790609885.c());
            return null;
        }
        int i = 0;
        while (Character.isDigit(f7278720905790609885.e(i))) {
            i++;
        }
        String g = f7278720905790609885.g(i);
        if (i <= 3) {
            return Integer.valueOf(Integer.parseInt(g));
        }
        K2042933864045806308.k("while scanning a YAML directive", f16470721565862751885, "found a number which cannot represent a valid version: ".concat(g), f7278720905790609885.c());
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
            F16470721565862751885 c = this.a.c();
            this.g = ((Integer) this.h.l()).intValue();
            b(new B10191660839256065701(c, c, (byte) 0));
        }
    }
}
