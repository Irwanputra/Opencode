package dev.epro.r0;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class K2393395423856546155 {
    public static final Class a;
    public static final B4833153077418241720 b;
    public static final B4833153077418241720 c;

    static {
        Class<?> cls;
        Class<?> cls2;
        X8293765978123339002 x8293765978123339002 = X8293765978123339002.c;
        B4833153077418241720 b4833153077418241720 = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            X8293765978123339002 x82937659781233390022 = X8293765978123339002.c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                b4833153077418241720 = (B4833153077418241720) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        b = b4833153077418241720;
        c = new B4833153077418241720();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += W12822723367527402820.j(((Integer) list.get(i)).intValue());
        }
        return iJ;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (W12822723367527402820.h(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (W12822723367527402820.h(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += W12822723367527402820.j(((Integer) list.get(i)).intValue());
        }
        return iJ;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += W12822723367527402820.j(((Long) list.get(i)).longValue());
        }
        return iJ;
    }

    public static int f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int iIntValue = ((Integer) list.get(i2)).intValue();
            i += W12822723367527402820.i((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return i;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iJ += W12822723367527402820.j((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iJ;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += W12822723367527402820.i(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += W12822723367527402820.j(((Long) list.get(i)).longValue());
        }
        return iJ;
    }

    public static void k(B4833153077418241720 b4833153077418241720, Object obj, Object obj2) {
        b4833153077418241720.getClass();
        T3817383632789307090 t3817383632789307090 = (T3817383632789307090) obj;
        Q11287569198401486162 q11287569198401486162 = t3817383632789307090.unknownFields;
        Q11287569198401486162 q112875691984014861622 = ((T3817383632789307090) obj2).unknownFields;
        Q11287569198401486162 q112875691984014861623 = Q11287569198401486162.f;
        if (!q112875691984014861623.equals(q112875691984014861622)) {
            if (q112875691984014861623.equals(q11287569198401486162)) {
                int i = q11287569198401486162.a + q112875691984014861622.a;
                int[] iArrCopyOf = Arrays.copyOf(q11287569198401486162.b, i);
                System.arraycopy(q112875691984014861622.b, 0, iArrCopyOf, q11287569198401486162.a, q112875691984014861622.a);
                Object[] objArrCopyOf = Arrays.copyOf(q11287569198401486162.c, i);
                System.arraycopy(q112875691984014861622.c, 0, objArrCopyOf, q11287569198401486162.a, q112875691984014861622.a);
                q11287569198401486162 = new Q11287569198401486162(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                q11287569198401486162.getClass();
                if (!q112875691984014861622.equals(q112875691984014861623)) {
                    if (!q11287569198401486162.e) {
                        Z3383101362411723454.t();
                        return;
                    }
                    int i2 = q11287569198401486162.a + q112875691984014861622.a;
                    q11287569198401486162.a(i2);
                    System.arraycopy(q112875691984014861622.b, 0, q11287569198401486162.b, q11287569198401486162.a, q112875691984014861622.a);
                    System.arraycopy(q112875691984014861622.c, 0, q11287569198401486162.c, q11287569198401486162.a, q112875691984014861622.a);
                    q11287569198401486162.a = i2;
                }
            }
        }
        t3817383632789307090.unknownFields = q11287569198401486162;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i, List list, H12843822278061842084 h12843822278061842084, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        W12822723367527402820 w12822723367527402820 = (W12822723367527402820) h12843822278061842084.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                w12822723367527402820.o(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        w12822723367527402820.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        w12822723367527402820.D(i3);
        while (i2 < list.size()) {
            w12822723367527402820.m(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void n(int i, List list, H12843822278061842084 h12843822278061842084, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        W12822723367527402820 w12822723367527402820 = (W12822723367527402820) h12843822278061842084.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                w12822723367527402820.t(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        w12822723367527402820.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        w12822723367527402820.D(i3);
        while (i2 < list.size()) {
            w12822723367527402820.u(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void o(int i, List list, H12843822278061842084 h12843822278061842084, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        W12822723367527402820 w12822723367527402820 = (W12822723367527402820) h12843822278061842084.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                w12822723367527402820.v(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        w12822723367527402820.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += W12822723367527402820.j(((Integer) list.get(i3)).intValue());
        }
        w12822723367527402820.D(iJ);
        while (i2 < list.size()) {
            w12822723367527402820.w(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void p(int i, List list, H12843822278061842084 h12843822278061842084, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        W12822723367527402820 w12822723367527402820 = (W12822723367527402820) h12843822278061842084.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                w12822723367527402820.r(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        w12822723367527402820.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        w12822723367527402820.D(i3);
        while (i2 < list.size()) {
            w12822723367527402820.s(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void q(int i, List list, H12843822278061842084 h12843822278061842084, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        W12822723367527402820 w12822723367527402820 = (W12822723367527402820) h12843822278061842084.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                w12822723367527402820.t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        w12822723367527402820.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        w12822723367527402820.D(i3);
        while (i2 < list.size()) {
            w12822723367527402820.u(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void r(int i, List list, H12843822278061842084 h12843822278061842084, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        W12822723367527402820 w12822723367527402820 = (W12822723367527402820) h12843822278061842084.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                w12822723367527402820.r(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        w12822723367527402820.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        w12822723367527402820.D(i3);
        while (i2 < list.size()) {
            w12822723367527402820.s(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void s(int i, List list, H12843822278061842084 h12843822278061842084, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        W12822723367527402820 w12822723367527402820 = (W12822723367527402820) h12843822278061842084.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                w12822723367527402820.v(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        w12822723367527402820.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += W12822723367527402820.j(((Integer) list.get(i3)).intValue());
        }
        w12822723367527402820.D(iJ);
        while (i2 < list.size()) {
            w12822723367527402820.w(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void t(int i, List list, H12843822278061842084 h12843822278061842084, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        W12822723367527402820 w12822723367527402820 = (W12822723367527402820) h12843822278061842084.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                w12822723367527402820.E(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        w12822723367527402820.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += W12822723367527402820.j(((Long) list.get(i3)).longValue());
        }
        w12822723367527402820.D(iJ);
        while (i2 < list.size()) {
            w12822723367527402820.F(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void u(int i, List list, H12843822278061842084 h12843822278061842084, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        W12822723367527402820 w12822723367527402820 = (W12822723367527402820) h12843822278061842084.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                w12822723367527402820.r(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        w12822723367527402820.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        w12822723367527402820.D(i3);
        while (i2 < list.size()) {
            w12822723367527402820.s(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void v(int i, List list, H12843822278061842084 h12843822278061842084, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        W12822723367527402820 w12822723367527402820 = (W12822723367527402820) h12843822278061842084.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                w12822723367527402820.t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        w12822723367527402820.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        w12822723367527402820.D(i3);
        while (i2 < list.size()) {
            w12822723367527402820.u(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void w(int i, List list, H12843822278061842084 h12843822278061842084, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        W12822723367527402820 w12822723367527402820 = (W12822723367527402820) h12843822278061842084.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                w12822723367527402820.C(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i2++;
            }
            return;
        }
        w12822723367527402820.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int iIntValue2 = ((Integer) list.get(i4)).intValue();
            i3 += W12822723367527402820.i((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        w12822723367527402820.D(i3);
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            w12822723367527402820.D((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i2++;
        }
    }

    public static void x(int i, List list, H12843822278061842084 h12843822278061842084, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        W12822723367527402820 w12822723367527402820 = (W12822723367527402820) h12843822278061842084.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                w12822723367527402820.E(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        w12822723367527402820.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iJ += W12822723367527402820.j((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        w12822723367527402820.D(iJ);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            w12822723367527402820.F((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    public static void y(int i, List list, H12843822278061842084 h12843822278061842084, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        W12822723367527402820 w12822723367527402820 = (W12822723367527402820) h12843822278061842084.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                w12822723367527402820.C(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        w12822723367527402820.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += W12822723367527402820.i(((Integer) list.get(i4)).intValue());
        }
        w12822723367527402820.D(i3);
        while (i2 < list.size()) {
            w12822723367527402820.D(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void z(int i, List list, H12843822278061842084 h12843822278061842084, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        W12822723367527402820 w12822723367527402820 = (W12822723367527402820) h12843822278061842084.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                w12822723367527402820.E(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        w12822723367527402820.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += W12822723367527402820.j(((Long) list.get(i3)).longValue());
        }
        w12822723367527402820.D(iJ);
        while (i2 < list.size()) {
            w12822723367527402820.F(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static Object j(Object obj, int i, D11116981298317247998 d11116981298317247998, Object obj2, B4833153077418241720 b4833153077418241720) {
        return obj2;
    }
}
