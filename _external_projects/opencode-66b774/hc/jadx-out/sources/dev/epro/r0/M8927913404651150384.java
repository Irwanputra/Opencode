package dev.epro.r0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class M8927913404651150384 extends Z13168519540281190457 {
    public static CharSequence A0(CharSequence charSequence, int i) {
        charSequence.getClass();
        if (i < 0) {
            S10973172697741180971.i(G6547577305291411977.o(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = charSequence.length();
        if (i > length) {
            i = length;
        }
        return charSequence.subSequence(0, i);
    }

    public static String B0(int i, String str) {
        str.getClass();
        if (i < 0) {
            S10973172697741180971.i(G6547577305291411977.o(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static Boolean C0(String str) {
        if (str.equals("true")) {
            return Boolean.TRUE;
        }
        if (str.equals("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static CharSequence D0(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zK = M9216324016624295870.K(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zK) {
                    break;
                }
                length--;
            } else if (zK) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static CharSequence E0(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i = length - 1;
            if (!M9216324016624295870.K(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i < 0) {
                return "";
            }
            length = i;
        }
    }

    public static String F0(char[] cArr, String str) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!O5378677881740157249.k0(cArr, str.charAt(length))) {
                    charSequenceSubSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
            charSequenceSubSequence = "";
        } else {
            charSequenceSubSequence = "";
        }
        return charSequenceSubSequence.toString();
    }

    public static CharSequence G0(String str) {
        str.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!M9216324016624295870.K(str.charAt(i))) {
                return str.subSequence(i, str.length());
            }
        }
        return "";
    }

    public static String H0(char[] cArr, String str) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                charSequenceSubSequence = "";
                break;
            }
            if (!O5378677881740157249.k0(cArr, str.charAt(i))) {
                charSequenceSubSequence = str.subSequence(i, str.length());
                break;
            }
            i++;
        }
        return charSequenceSubSequence.toString();
    }

    public static ArrayList K(String str) {
        str.getClass();
        P13747563277035175218.d(2, 2);
        int length = str.length();
        int i = 0;
        ArrayList arrayList = new ArrayList((length / 2) + (length % 2 == 0 ? 0 : 1));
        while (i >= 0 && i < length) {
            int i2 = i + 2;
            CharSequence charSequenceSubSequence = str.subSequence(i, (i2 < 0 || i2 > length) ? length : i2);
            charSequenceSubSequence.getClass();
            arrayList.add(charSequenceSubSequence.toString());
            i = i2;
        }
        return arrayList;
    }

    public static boolean L(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (charSequence2 instanceof String) {
            if (W(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (U(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean M(CharSequence charSequence, char c) {
        charSequence.getClass();
        return V(charSequence, c, 0, 2) >= 0;
    }

    public static String N(int i, String str) {
        str.getClass();
        if (i < 0) {
            S10973172697741180971.i(G6547577305291411977.o(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(i);
    }

    public static boolean O(CharSequence charSequence, char c) {
        return charSequence.length() > 0 && M9216324016624295870.B(charSequence.charAt(charSequence.length() - 1), c, false);
    }

    public static boolean P(CharSequence charSequence, String str) {
        return charSequence instanceof String ? Z13168519540281190457.z((String) charSequence, str, false) : h0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static char Q(String str) {
        str.getClass();
        if (str.length() != 0) {
            return str.charAt(0);
        }
        K2042933864045806308.n("Char sequence is empty.");
        return (char) 0;
    }

    public static int R(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }

    public static Character S(int i, String str) {
        if (i < 0 || i >= str.length()) {
            return null;
        }
        return Character.valueOf(str.charAt(i));
    }

    public static final int T(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        return (z || !(charSequence instanceof String)) ? U(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    public static final int U(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        I12982432556619280823 i12982432556619280823;
        if (z2) {
            int iR = R(charSequence);
            if (i > iR) {
                i = iR;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            i12982432556619280823 = new I12982432556619280823(i, i2, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            i12982432556619280823 = new P8646985343900033725(i, i2, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i3 = i12982432556619280823.c;
        int i4 = i12982432556619280823.b;
        int i5 = i12982432556619280823.a;
        if (!z3 || !(charSequence2 instanceof String)) {
            boolean z4 = z;
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    boolean z5 = z4;
                    z4 = z5;
                    if (!h0(charSequence4, 0, charSequence3, i5, charSequence2.length(), z5)) {
                        if (i5 == i4) {
                            break;
                        }
                        i5 += i3;
                        charSequence2 = charSequence4;
                        charSequence = charSequence3;
                    } else {
                        return i5;
                    }
                }
            }
        } else if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            int i6 = i5;
            while (true) {
                String str = (String) charSequence2;
                boolean z6 = z;
                if (!Z13168519540281190457.B(0, i6, str.length(), str, (String) charSequence, z6)) {
                    if (i6 == i4) {
                        break;
                    }
                    i6 += i3;
                    z = z6;
                } else {
                    return i6;
                }
            }
        }
        return -1;
    }

    public static int V(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        return !(charSequence instanceof String) ? X(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int W(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return T(charSequence, str, i, z);
    }

    public static final int X(CharSequence charSequence, char[] cArr, int i, boolean z) {
        charSequence.getClass();
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(O5378677881740157249.N0(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (M9216324016624295870.B(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == length) {
                return -1;
            }
            i++;
        }
    }

    public static boolean Y(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!M9216324016624295870.K(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static char Z(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(charSequence.length() - 1);
        }
        K2042933864045806308.n("Char sequence is empty.");
        return (char) 0;
    }

    public static int a0(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = R(charSequence);
        }
        charSequence.getClass();
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(O5378677881740157249.N0(cArr), i);
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            i = length;
        }
        while (-1 < i) {
            if (M9216324016624295870.B(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static int b0(CharSequence charSequence, String str, int i) {
        int length = (i & 2) != 0 ? charSequence.length() - 1 : 0;
        str.getClass();
        return !(charSequence instanceof String) ? U(charSequence, str, length, 0, false, true) : ((String) charSequence).lastIndexOf(str, length);
    }

    public static V11146580314972738611 c0(CharSequence charSequence) {
        charSequence.getClass();
        return new V11146580314972738611(charSequence, (byte) 4);
    }

    public static List d0(CharSequence charSequence) {
        charSequence.getClass();
        R17739948736946712447 r17739948736946712447 = new R17739948736946712447(charSequence);
        if (!r17739948736946712447.hasNext()) {
            return O2161699089510411363.a;
        }
        Object next = r17739948736946712447.next();
        if (!r17739948736946712447.hasNext()) {
            return K5751602218013079365.U(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (r17739948736946712447.hasNext()) {
            arrayList.add(r17739948736946712447.next());
        }
        return arrayList;
    }

    public static String e0(int i, String str) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        if (i < 0) {
            S10973172697741180971.j(G6547577305291411977.o(i, "Desired length ", " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            sb.append((CharSequence) str);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('=');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static String f0(String str, int i, char c) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        if (i < 0) {
            S10973172697741180971.j(G6547577305291411977.o(i, "Desired length ", " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(c);
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static Y10296912117440622376 g0(CharSequence charSequence, char[] cArr, int i) {
        m0(i);
        return new Y10296912117440622376(charSequence, i, new D3094385331126751133(cArr, (byte) 12));
    }

    public static final boolean h0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!M9216324016624295870.B(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String i0(String str, String str2) {
        str.getClass();
        return Z13168519540281190457.F(str, str2, false) ? str.substring(str2.length()) : str;
    }

    public static String j0(String str, String str2) {
        str.getClass();
        return P(str, str2) ? str.substring(0, str.length() - str2.length()) : str;
    }

    public static String k0(String str, String str2, String str3) {
        str.getClass();
        return (str.length() >= str3.length() + str2.length() && Z13168519540281190457.F(str, str2, false) && P(str, str3)) ? str.substring(str2.length(), str.length() - str3.length()) : str;
    }

    public static StringBuilder l0(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < i) {
            W4415201450379021245.a(G11450220448113054352.h(i2, i, "End index (", ") is less than start index (", ")."));
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence, 0, i);
        sb.append(charSequence2);
        sb.append(charSequence, i2, charSequence.length());
        return sb;
    }

    public static final void m0(int i) {
        if (i >= 0) {
            return;
        }
        S10973172697741180971.i(G6547577305291411977.n(i, "Limit must be non-negative, but was "));
    }

    public static final List n0(CharSequence charSequence, String str, int i) {
        m0(i);
        int iT = T(charSequence, str, 0, false);
        if (iT == -1 || i == 1) {
            return K5751602218013079365.U(charSequence.toString());
        }
        boolean z = i > 0;
        int i2 = 10;
        if (z && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iT).toString());
            length = str.length() + iT;
            if (z && arrayList.size() == i - 1) {
                break;
            }
            iT = T(charSequence, str, length, false);
        } while (iT != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List o0(CharSequence charSequence, char[] cArr, int i) {
        byte b = 2;
        int i2 = (i & 4) != 0 ? 0 : 2;
        charSequence.getClass();
        if (cArr.length == 1) {
            return n0(charSequence, String.valueOf(cArr[0]), i2);
        }
        V11296664775587403736 v11296664775587403736 = new V11296664775587403736(g0(charSequence, cArr, i2), b);
        ArrayList arrayList = new ArrayList(Z115818233709597990.k0(v11296664775587403736, 10));
        Iterator it = v11296664775587403736.iterator();
        while (true) {
            G12653093637352814222 g12653093637352814222 = (G12653093637352814222) it;
            if (!g12653093637352814222.hasNext()) {
                return arrayList;
            }
            arrayList.add(s0(charSequence, (P8646985343900033725) g12653093637352814222.next()));
        }
    }

    public static List p0(CharSequence charSequence, String[] strArr, int i) {
        byte b = 2;
        int i2 = (i & 4) != 0 ? 0 : 2;
        charSequence.getClass();
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() > 0) {
                return n0(charSequence, str, i2);
            }
        }
        m0(i2);
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        V11296664775587403736 v11296664775587403736 = new V11296664775587403736(new Y10296912117440622376(charSequence, i2, new Q5257107720850990263(listAsList, (byte) 6)), b);
        ArrayList arrayList = new ArrayList(Z115818233709597990.k0(v11296664775587403736, 10));
        Iterator it = v11296664775587403736.iterator();
        while (true) {
            G12653093637352814222 g12653093637352814222 = (G12653093637352814222) it;
            if (!g12653093637352814222.hasNext()) {
                return arrayList;
            }
            arrayList.add(s0(charSequence, (P8646985343900033725) g12653093637352814222.next()));
        }
    }

    public static B2664082256516729321 q0(char[] cArr, String str) {
        return T2881242016550624223.F(g0(str, cArr, 0), new F17325007439613749879(str, (byte) 0));
    }

    public static boolean r0(CharSequence charSequence, char c) {
        charSequence.getClass();
        return charSequence.length() > 0 && M9216324016624295870.B(charSequence.charAt(0), c, false);
    }

    public static final String s0(CharSequence charSequence, P8646985343900033725 p8646985343900033725) {
        charSequence.getClass();
        p8646985343900033725.getClass();
        return charSequence.subSequence(p8646985343900033725.a, p8646985343900033725.b + 1).toString();
    }

    public static String t0(String str, char c, String str2) {
        str.getClass();
        int iV = V(str, c, 0, 6);
        return iV == -1 ? str2 : str.substring(iV + 1, str.length());
    }

    public static String u0(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        int iW = W(str, str2, 0, false, 6);
        return iW == -1 ? str3 : str.substring(str2.length() + iW, str.length());
    }

    public static String v0(String str, char c, String str2) {
        str.getClass();
        str2.getClass();
        int iA0 = a0(str, c, 0, 6);
        return iA0 == -1 ? str2 : str.substring(iA0 + 1, str.length());
    }

    public static String w0(String str, String str2, String str3) {
        int iB0 = b0(str, str2, 6);
        return iB0 == -1 ? str3 : str.substring(str2.length() + iB0, str.length());
    }

    public static String x0(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        int iW = W(str, str2, 0, false, 6);
        return iW == -1 ? str3 : str.substring(0, iW);
    }

    public static String y0(String str, char c) {
        str.getClass();
        str.getClass();
        int iV = V(str, c, 0, 6);
        return iV == -1 ? str : str.substring(0, iV);
    }

    public static String z0(String str) {
        int iA0 = a0(str, '@', 0, 6);
        return iA0 == -1 ? str : str.substring(0, iA0);
    }
}
