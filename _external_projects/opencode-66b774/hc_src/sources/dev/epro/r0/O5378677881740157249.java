package dev.epro.r0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class O5378677881740157249 extends O5354877807466160604 {
    public static void A0(long[] jArr, long j) {
        int length = jArr.length;
        jArr.getClass();
        Arrays.fill(jArr, 0, length, j);
    }

    public static ArrayList B0(Object[] objArr) {
        objArr.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object C0(Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            return objArr[0];
        }
        K2042933864045806308.n("Array is empty.");
        return null;
    }

    public static Object D0(Object[] objArr) {
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static P8646985343900033725 E0(byte[] bArr) {
        bArr.getClass();
        return new P8646985343900033725(0, bArr.length - 1, 1);
    }

    public static P8646985343900033725 F0(int[] iArr) {
        return new P8646985343900033725(0, iArr.length - 1, 1);
    }

    public static int G0(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static Byte H0(int i, byte[] bArr) {
        if (i < 0 || i >= bArr.length) {
            return null;
        }
        return Byte.valueOf(bArr[i]);
    }

    public static Object I0(int i, Object[] objArr) {
        objArr.getClass();
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static int J0(Object obj, Object[] objArr) {
        objArr.getClass();
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static String K0(int i, String str, Object[] objArr) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str2 = (i & 2) != 0 ? "" : "innermostOf(";
        String str3 = (i & 4) == 0 ? ")" : "";
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i2 = 0;
        for (Object obj : objArr) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            B6030175592171028728.i(sb, obj, null);
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    public static String L0(byte[] bArr, String str, F4096073349764486348 f4096073349764486348, int i) {
        String str2 = (i & 2) != 0 ? "" : "[";
        String str3 = (i & 4) == 0 ? "]" : "";
        if ((i & 32) != 0) {
            f4096073349764486348 = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i2 = 0;
        for (byte b : bArr) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            if (f4096073349764486348 != null) {
                sb.append((CharSequence) f4096073349764486348.invoke(Byte.valueOf(b)));
            } else {
                sb.append((CharSequence) String.valueOf((int) b));
            }
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    public static byte[] M0(byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, copyOf, length, length2);
        return copyOf;
    }

    public static char N0(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            K2042933864045806308.n("Array is empty.");
            return (char) 0;
        }
        if (length == 1) {
            return cArr[0];
        }
        S10973172697741180971.j("Array has more than one element.");
        return (char) 0;
    }

    public static final void O0(Object[] objArr) {
        objArr.getClass();
        if (objArr.length > 1) {
            Arrays.sort(objArr);
        }
    }

    public static List P0(Object[] objArr, Comparator comparator) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, objArr.length);
            if (objArr.length > 1) {
                Arrays.sort(objArr, comparator);
            }
        }
        List asList = Arrays.asList(objArr);
        asList.getClass();
        return asList;
    }

    public static List Q0(int i, byte[] bArr) {
        if (i < 0) {
            S10973172697741180971.i(G6547577305291411977.o(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return O2161699089510411363.a;
        }
        if (i >= bArr.length) {
            return T0(bArr);
        }
        if (i == 1) {
            return K5751602218013079365.U(Byte.valueOf(bArr[0]));
        }
        ArrayList arrayList = new ArrayList(i);
        int i2 = 0;
        for (byte b : bArr) {
            arrayList.add(Byte.valueOf(b));
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return arrayList;
    }

    public static List R0(int i, Object[] objArr) {
        objArr.getClass();
        if (i < 0) {
            S10973172697741180971.i(G6547577305291411977.o(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return O2161699089510411363.a;
        }
        if (i >= objArr.length) {
            return U0(objArr);
        }
        if (i == 1) {
            return K5751602218013079365.U(objArr[0]);
        }
        List asList = Arrays.asList(v0(objArr, 0, i));
        asList.getClass();
        return asList;
    }

    public static final void S0(Object[] objArr, HashSet hashSet) {
        for (Object obj : objArr) {
            hashSet.add(obj);
        }
    }

    public static List T0(byte[] bArr) {
        int length = bArr.length;
        if (length == 0) {
            return O2161699089510411363.a;
        }
        if (length == 1) {
            return K5751602218013079365.U(Byte.valueOf(bArr[0]));
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b : bArr) {
            arrayList.add(Byte.valueOf(b));
        }
        return arrayList;
    }

    public static List U0(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return O2161699089510411363.a;
        }
        if (length == 1) {
            return K5751602218013079365.U(objArr[0]);
        }
        List asList = Arrays.asList(Arrays.copyOf(objArr, objArr.length));
        asList.getClass();
        return asList;
    }

    public static Set V0(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return H15747516787109764287.a;
        }
        if (length == 1) {
            return T8598786036980488824.z(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(E4951175994894594588.u0(objArr.length));
        S0(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static U16443665883761795894 i0(Object[] objArr) {
        return objArr.length == 0 ? W10854829702748386039.a : new V11146580314972738611(objArr, (byte) 0);
    }

    public static boolean j0(Object obj, Object[] objArr) {
        objArr.getClass();
        return J0(obj, objArr) >= 0;
    }

    public static boolean k0(char[] cArr, char c) {
        int length = cArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (c == cArr[i]) {
                break;
            }
            i++;
        }
        return i >= 0;
    }

    public static boolean l0(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr.length == objArr2.length) {
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                Object obj = objArr[i];
                Object obj2 = objArr2[i];
                if (obj != obj2) {
                    if (obj != null && obj2 != null) {
                        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                            if (!l0((Object[]) obj, (Object[]) obj2)) {
                            }
                        } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                            if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            }
                        } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                            if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            }
                        } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                            if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            }
                        } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                            if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            }
                        } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                            if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            }
                        } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                            if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            }
                        } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                            if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            }
                        } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                            if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            }
                        } else if (!obj.equals(obj2)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static void m0(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void n0(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static void o0(int i, int i2, byte[] bArr, int i3, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static void p0(char[] cArr, char[] cArr2, int i, int i2, int i3) {
        cArr.getClass();
        cArr2.getClass();
        System.arraycopy(cArr, i2, cArr2, i, i3 - i2);
    }

    public static void q0(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        jArr.getClass();
        jArr2.getClass();
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    public static /* synthetic */ void r0(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        m0(i, 0, i2, iArr, iArr2);
    }

    public static /* synthetic */ void s0(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        n0(0, i, i2, objArr, objArr2);
    }

    public static /* synthetic */ void t0(int i, byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        o0(i, i2, bArr, i3, bArr2);
    }

    public static byte[] u0(int i, byte[] bArr, int i2) {
        bArr.getClass();
        O5354877807466160604.J(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        copyOfRange.getClass();
        return copyOfRange;
    }

    public static Object[] v0(Object[] objArr, int i, int i2) {
        objArr.getClass();
        O5354877807466160604.J(i2, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i2);
        copyOfRange.getClass();
        return copyOfRange;
    }

    public static List w0(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length - 2;
        if (length < 0) {
            length = 0;
        }
        if (length < 0) {
            S10973172697741180971.i(G6547577305291411977.o(length, "Requested element count ", " is less than zero."));
            return null;
        }
        if (length == 0) {
            return O2161699089510411363.a;
        }
        int length2 = objArr.length;
        if (length >= length2) {
            return U0(objArr);
        }
        if (length == 1) {
            return K5751602218013079365.U(objArr[length2 - 1]);
        }
        List asList = Arrays.asList(v0(objArr, length2 - length, length2));
        asList.getClass();
        return asList;
    }

    public static void x0(int i, int i2, Object obj, Object[] objArr) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, obj);
    }

    public static void y0(int i, byte[] bArr, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int length = bArr.length;
        bArr.getClass();
        Arrays.fill(bArr, i, length, (byte) 0);
    }
}
