package dev.epro.r0;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class W3646014350333091735 {
    public static final Class a;
    public static final R1604357493379982192 b;
    public static final R1604357493379982192 c;

    static {
        Class<?> cls;
        Class<?> cls2;
        Class cls3 = E6993330184355272251.a;
        R1604357493379982192 r1604357493379982192 = null;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            Class cls4 = E6993330184355272251.a;
            try {
                cls2 = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                r1604357493379982192 = (R1604357493379982192) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        b = r1604357493379982192;
        c = new R1604357493379982192();
    }

    public static int a(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof U9933786248742319541)) {
            int iG = 0;
            while (i < size) {
                iG += A5011514514014580540.g(((Integer) list.get(i)).intValue());
                i++;
            }
            return iG;
        }
        U9933786248742319541 u9933786248742319541 = (U9933786248742319541) list;
        int iG2 = 0;
        while (i < size) {
            iG2 += A5011514514014580540.g(u9933786248742319541.c(i));
            i++;
        }
        return iG2;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (A5011514514014580540.e(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (A5011514514014580540.e(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof U9933786248742319541)) {
            int iG = 0;
            while (i < size) {
                iG += A5011514514014580540.g(((Integer) list.get(i)).intValue());
                i++;
            }
            return iG;
        }
        U9933786248742319541 u9933786248742319541 = (U9933786248742319541) list;
        int iG2 = 0;
        while (i < size) {
            iG2 += A5011514514014580540.g(u9933786248742319541.c(i));
            i++;
        }
        return iG2;
    }

    public static int e(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof K908934630684087819)) {
            int iG = 0;
            while (i < size) {
                iG += A5011514514014580540.g(((Long) list.get(i)).longValue());
                i++;
            }
            return iG;
        }
        K908934630684087819 k908934630684087819 = (K908934630684087819) list;
        int iG2 = 0;
        while (i < size) {
            iG2 += A5011514514014580540.g(k908934630684087819.c(i));
            i++;
        }
        return iG2;
    }

    public static int f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof U9933786248742319541)) {
            int iB = 0;
            while (i < size) {
                iB += A5011514514014580540.b(((Integer) list.get(i)).intValue());
                i++;
            }
            return iB;
        }
        U9933786248742319541 u9933786248742319541 = (U9933786248742319541) list;
        int iB2 = 0;
        while (i < size) {
            iB2 += A5011514514014580540.b(u9933786248742319541.c(i));
            i++;
        }
        return iB2;
    }

    public static int g(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof K908934630684087819)) {
            int iC = 0;
            while (i < size) {
                iC += A5011514514014580540.c(((Long) list.get(i)).longValue());
                i++;
            }
            return iC;
        }
        K908934630684087819 k908934630684087819 = (K908934630684087819) list;
        int iC2 = 0;
        while (i < size) {
            iC2 += A5011514514014580540.c(k908934630684087819.c(i));
            i++;
        }
        return iC2;
    }

    public static int h(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof U9933786248742319541)) {
            int iF = 0;
            while (i < size) {
                iF += A5011514514014580540.f(((Integer) list.get(i)).intValue());
                i++;
            }
            return iF;
        }
        U9933786248742319541 u9933786248742319541 = (U9933786248742319541) list;
        int iF2 = 0;
        while (i < size) {
            iF2 += A5011514514014580540.f(u9933786248742319541.c(i));
            i++;
        }
        return iF2;
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof K908934630684087819)) {
            int iG = 0;
            while (i < size) {
                iG += A5011514514014580540.g(((Long) list.get(i)).longValue());
                i++;
            }
            return iG;
        }
        K908934630684087819 k908934630684087819 = (K908934630684087819) list;
        int iG2 = 0;
        while (i < size) {
            iG2 += A5011514514014580540.g(k908934630684087819.c(i));
            i++;
        }
        return iG2;
    }

    public static void k(R1604357493379982192 r1604357493379982192, Object obj, Object obj2) {
        r1604357493379982192.getClass();
        Z14368087615735085238 z14368087615735085238 = (Z14368087615735085238) obj;
        C10101319439186475078 c10101319439186475078 = z14368087615735085238.unknownFields;
        C10101319439186475078 c101013194391864750782 = ((Z14368087615735085238) obj2).unknownFields;
        C10101319439186475078 c101013194391864750783 = C10101319439186475078.f;
        if (!c101013194391864750783.equals(c101013194391864750782)) {
            if (c101013194391864750783.equals(c10101319439186475078)) {
                int i = c10101319439186475078.a + c101013194391864750782.a;
                int[] iArrCopyOf = Arrays.copyOf(c10101319439186475078.b, i);
                System.arraycopy(c101013194391864750782.b, 0, iArrCopyOf, c10101319439186475078.a, c101013194391864750782.a);
                Object[] objArrCopyOf = Arrays.copyOf(c10101319439186475078.c, i);
                System.arraycopy(c101013194391864750782.c, 0, objArrCopyOf, c10101319439186475078.a, c101013194391864750782.a);
                c10101319439186475078 = new C10101319439186475078(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                c10101319439186475078.getClass();
                if (!c101013194391864750782.equals(c101013194391864750783)) {
                    if (!c10101319439186475078.e) {
                        Z3383101362411723454.t();
                        return;
                    }
                    int i2 = c10101319439186475078.a + c101013194391864750782.a;
                    c10101319439186475078.a(i2);
                    System.arraycopy(c101013194391864750782.b, 0, c10101319439186475078.b, c10101319439186475078.a, c101013194391864750782.a);
                    System.arraycopy(c101013194391864750782.c, 0, c10101319439186475078.c, c10101319439186475078.a, c101013194391864750782.a);
                    c10101319439186475078.a = i2;
                }
            }
        }
        z14368087615735085238.unknownFields = c10101319439186475078;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i, List list, H12843822278061842084 h12843822278061842084, boolean z) throws I8626815837691735180 {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof N2953453778378988595;
        A5011514514014580540 a5011514514014580540 = (A5011514514014580540) h12843822278061842084.b;
        int i2 = 0;
        if (z2) {
            if (z) {
                a5011514514014580540.t(i, 2);
                a5011514514014580540.v(0);
                return;
            }
            return;
        }
        if (!z) {
            while (i2 < list.size()) {
                a5011514514014580540.j(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        a5011514514014580540.t(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        a5011514514014580540.v(i3);
        while (i2 < list.size()) {
            a5011514514014580540.i(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void n(int i, List list, H12843822278061842084 h12843822278061842084, boolean z) throws I8626815837691735180 {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof T8586479527660021265;
        A5011514514014580540 a5011514514014580540 = (A5011514514014580540) h12843822278061842084.b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    a5011514514014580540.n(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            a5011514514014580540.t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).getClass();
                i3 += 8;
            }
            a5011514514014580540.v(i3);
            while (i2 < list.size()) {
                a5011514514014580540.o(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        T8586479527660021265 t8586479527660021265 = (T8586479527660021265) list;
        if (!z) {
            while (i2 < 0) {
                t8586479527660021265.c(i2);
                a5011514514014580540.n(i, Double.doubleToRawLongBits(t8586479527660021265.b[i2]));
                i2++;
            }
            return;
        }
        a5011514514014580540.t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            t8586479527660021265.c(i6);
            double d = t8586479527660021265.b[i6];
            i5 += 8;
        }
        a5011514514014580540.v(i5);
        while (i2 < 0) {
            t8586479527660021265.c(i2);
            a5011514514014580540.o(Double.doubleToRawLongBits(t8586479527660021265.b[i2]));
            i2++;
        }
    }

    public static void o(int i, List list, H12843822278061842084 h12843822278061842084, boolean z) throws I8626815837691735180 {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof U9933786248742319541;
        A5011514514014580540 a5011514514014580540 = (A5011514514014580540) h12843822278061842084.b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    a5011514514014580540.p(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            a5011514514014580540.t(i, 2);
            int iG = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iG += A5011514514014580540.g(((Integer) list.get(i3)).intValue());
            }
            a5011514514014580540.v(iG);
            while (i2 < list.size()) {
                a5011514514014580540.q(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        U9933786248742319541 u9933786248742319541 = (U9933786248742319541) list;
        if (!z) {
            while (i2 < 0) {
                a5011514514014580540.p(i, u9933786248742319541.c(i2));
                i2++;
            }
            return;
        }
        a5011514514014580540.t(i, 2);
        int iG2 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iG2 += A5011514514014580540.g(u9933786248742319541.c(i4));
        }
        a5011514514014580540.v(iG2);
        while (i2 < 0) {
            a5011514514014580540.q(u9933786248742319541.c(i2));
            i2++;
        }
    }

    public static void p(int i, List list, H12843822278061842084 h12843822278061842084, boolean z) throws I8626815837691735180 {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof U9933786248742319541;
        A5011514514014580540 a5011514514014580540 = (A5011514514014580540) h12843822278061842084.b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    a5011514514014580540.l(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            a5011514514014580540.t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            a5011514514014580540.v(i3);
            while (i2 < list.size()) {
                a5011514514014580540.m(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        U9933786248742319541 u9933786248742319541 = (U9933786248742319541) list;
        if (!z) {
            while (i2 < 0) {
                a5011514514014580540.l(i, u9933786248742319541.c(i2));
                i2++;
            }
            return;
        }
        a5011514514014580540.t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            u9933786248742319541.c(i6);
            i5 += 4;
        }
        a5011514514014580540.v(i5);
        while (i2 < 0) {
            a5011514514014580540.m(u9933786248742319541.c(i2));
            i2++;
        }
    }

    public static void q(int i, List list, H12843822278061842084 h12843822278061842084, boolean z) throws I8626815837691735180 {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof K908934630684087819;
        A5011514514014580540 a5011514514014580540 = (A5011514514014580540) h12843822278061842084.b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    a5011514514014580540.n(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            a5011514514014580540.t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            a5011514514014580540.v(i3);
            while (i2 < list.size()) {
                a5011514514014580540.o(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        K908934630684087819 k908934630684087819 = (K908934630684087819) list;
        if (!z) {
            while (i2 < 0) {
                a5011514514014580540.n(i, k908934630684087819.c(i2));
                i2++;
            }
            return;
        }
        a5011514514014580540.t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            k908934630684087819.c(i6);
            i5 += 8;
        }
        a5011514514014580540.v(i5);
        while (i2 < 0) {
            a5011514514014580540.o(k908934630684087819.c(i2));
            i2++;
        }
    }

    public static void r(int i, List list, H12843822278061842084 h12843822278061842084, boolean z) throws I8626815837691735180 {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof Q17312955529835048400;
        A5011514514014580540 a5011514514014580540 = (A5011514514014580540) h12843822278061842084.b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    a5011514514014580540.l(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            a5011514514014580540.t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                i3 += 4;
            }
            a5011514514014580540.v(i3);
            while (i2 < list.size()) {
                a5011514514014580540.m(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        Q17312955529835048400 q17312955529835048400 = (Q17312955529835048400) list;
        if (!z) {
            while (i2 < 0) {
                q17312955529835048400.c(i2);
                a5011514514014580540.l(i, Float.floatToRawIntBits(q17312955529835048400.b[i2]));
                i2++;
            }
            return;
        }
        a5011514514014580540.t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            q17312955529835048400.c(i6);
            float f = q17312955529835048400.b[i6];
            i5 += 4;
        }
        a5011514514014580540.v(i5);
        while (i2 < 0) {
            q17312955529835048400.c(i2);
            a5011514514014580540.m(Float.floatToRawIntBits(q17312955529835048400.b[i2]));
            i2++;
        }
    }

    public static void s(int i, List list, H12843822278061842084 h12843822278061842084, boolean z) throws I8626815837691735180 {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof U9933786248742319541;
        A5011514514014580540 a5011514514014580540 = (A5011514514014580540) h12843822278061842084.b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    a5011514514014580540.p(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            a5011514514014580540.t(i, 2);
            int iG = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iG += A5011514514014580540.g(((Integer) list.get(i3)).intValue());
            }
            a5011514514014580540.v(iG);
            while (i2 < list.size()) {
                a5011514514014580540.q(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        U9933786248742319541 u9933786248742319541 = (U9933786248742319541) list;
        if (!z) {
            while (i2 < 0) {
                a5011514514014580540.p(i, u9933786248742319541.c(i2));
                i2++;
            }
            return;
        }
        a5011514514014580540.t(i, 2);
        int iG2 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iG2 += A5011514514014580540.g(u9933786248742319541.c(i4));
        }
        a5011514514014580540.v(iG2);
        while (i2 < 0) {
            a5011514514014580540.q(u9933786248742319541.c(i2));
            i2++;
        }
    }

    public static void t(int i, List list, H12843822278061842084 h12843822278061842084, boolean z) throws I8626815837691735180 {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof K908934630684087819;
        A5011514514014580540 a5011514514014580540 = (A5011514514014580540) h12843822278061842084.b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    a5011514514014580540.w(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            a5011514514014580540.t(i, 2);
            int iG = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iG += A5011514514014580540.g(((Long) list.get(i3)).longValue());
            }
            a5011514514014580540.v(iG);
            while (i2 < list.size()) {
                a5011514514014580540.x(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        K908934630684087819 k908934630684087819 = (K908934630684087819) list;
        if (!z) {
            while (i2 < 0) {
                a5011514514014580540.w(i, k908934630684087819.c(i2));
                i2++;
            }
            return;
        }
        a5011514514014580540.t(i, 2);
        int iG2 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iG2 += A5011514514014580540.g(k908934630684087819.c(i4));
        }
        a5011514514014580540.v(iG2);
        while (i2 < 0) {
            a5011514514014580540.x(k908934630684087819.c(i2));
            i2++;
        }
    }

    public static void u(int i, List list, H12843822278061842084 h12843822278061842084, boolean z) throws I8626815837691735180 {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof U9933786248742319541;
        A5011514514014580540 a5011514514014580540 = (A5011514514014580540) h12843822278061842084.b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    a5011514514014580540.l(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            a5011514514014580540.t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            a5011514514014580540.v(i3);
            while (i2 < list.size()) {
                a5011514514014580540.m(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        U9933786248742319541 u9933786248742319541 = (U9933786248742319541) list;
        if (!z) {
            while (i2 < 0) {
                a5011514514014580540.l(i, u9933786248742319541.c(i2));
                i2++;
            }
            return;
        }
        a5011514514014580540.t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            u9933786248742319541.c(i6);
            i5 += 4;
        }
        a5011514514014580540.v(i5);
        while (i2 < 0) {
            a5011514514014580540.m(u9933786248742319541.c(i2));
            i2++;
        }
    }

    public static void v(int i, List list, H12843822278061842084 h12843822278061842084, boolean z) throws I8626815837691735180 {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof K908934630684087819;
        A5011514514014580540 a5011514514014580540 = (A5011514514014580540) h12843822278061842084.b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    a5011514514014580540.n(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            a5011514514014580540.t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            a5011514514014580540.v(i3);
            while (i2 < list.size()) {
                a5011514514014580540.o(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        K908934630684087819 k908934630684087819 = (K908934630684087819) list;
        if (!z) {
            while (i2 < 0) {
                a5011514514014580540.n(i, k908934630684087819.c(i2));
                i2++;
            }
            return;
        }
        a5011514514014580540.t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            k908934630684087819.c(i6);
            i5 += 8;
        }
        a5011514514014580540.v(i5);
        while (i2 < 0) {
            a5011514514014580540.o(k908934630684087819.c(i2));
            i2++;
        }
    }

    public static void w(int i, List list, H12843822278061842084 h12843822278061842084, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof U9933786248742319541;
        A5011514514014580540 a5011514514014580540 = (A5011514514014580540) h12843822278061842084.b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    a5011514514014580540.u(i, (iIntValue >> 31) ^ (iIntValue << 1));
                    i2++;
                }
                return;
            }
            a5011514514014580540.t(i, 2);
            int iB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iB += A5011514514014580540.b(((Integer) list.get(i3)).intValue());
            }
            a5011514514014580540.v(iB);
            while (i2 < list.size()) {
                int iIntValue2 = ((Integer) list.get(i2)).intValue();
                a5011514514014580540.v((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                i2++;
            }
            return;
        }
        U9933786248742319541 u9933786248742319541 = (U9933786248742319541) list;
        if (!z) {
            while (i2 < 0) {
                int iC = u9933786248742319541.c(i2);
                a5011514514014580540.u(i, (iC >> 31) ^ (iC << 1));
                i2++;
            }
            return;
        }
        a5011514514014580540.t(i, 2);
        int iB2 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iB2 += A5011514514014580540.b(u9933786248742319541.c(i4));
        }
        a5011514514014580540.v(iB2);
        while (i2 < 0) {
            int iC2 = u9933786248742319541.c(i2);
            a5011514514014580540.v((iC2 >> 31) ^ (iC2 << 1));
            i2++;
        }
    }

    public static void x(int i, List list, H12843822278061842084 h12843822278061842084, boolean z) throws I8626815837691735180 {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof K908934630684087819;
        A5011514514014580540 a5011514514014580540 = (A5011514514014580540) h12843822278061842084.b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    a5011514514014580540.w(i, (jLongValue >> 63) ^ (jLongValue << 1));
                    i2++;
                }
                return;
            }
            a5011514514014580540.t(i, 2);
            int iC = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iC += A5011514514014580540.c(((Long) list.get(i3)).longValue());
            }
            a5011514514014580540.v(iC);
            while (i2 < list.size()) {
                long jLongValue2 = ((Long) list.get(i2)).longValue();
                a5011514514014580540.x((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                i2++;
            }
            return;
        }
        K908934630684087819 k908934630684087819 = (K908934630684087819) list;
        if (!z) {
            while (i2 < 0) {
                long jC = k908934630684087819.c(i2);
                a5011514514014580540.w(i, (jC >> 63) ^ (jC << 1));
                i2++;
            }
            return;
        }
        a5011514514014580540.t(i, 2);
        int iC2 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iC2 += A5011514514014580540.c(k908934630684087819.c(i4));
        }
        a5011514514014580540.v(iC2);
        while (i2 < 0) {
            long jC2 = k908934630684087819.c(i2);
            a5011514514014580540.x((jC2 >> 63) ^ (jC2 << 1));
            i2++;
        }
    }

    public static void y(int i, List list, H12843822278061842084 h12843822278061842084, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof U9933786248742319541;
        A5011514514014580540 a5011514514014580540 = (A5011514514014580540) h12843822278061842084.b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    a5011514514014580540.u(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            a5011514514014580540.t(i, 2);
            int iF = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iF += A5011514514014580540.f(((Integer) list.get(i3)).intValue());
            }
            a5011514514014580540.v(iF);
            while (i2 < list.size()) {
                a5011514514014580540.v(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        U9933786248742319541 u9933786248742319541 = (U9933786248742319541) list;
        if (!z) {
            while (i2 < 0) {
                a5011514514014580540.u(i, u9933786248742319541.c(i2));
                i2++;
            }
            return;
        }
        a5011514514014580540.t(i, 2);
        int iF2 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iF2 += A5011514514014580540.f(u9933786248742319541.c(i4));
        }
        a5011514514014580540.v(iF2);
        while (i2 < 0) {
            a5011514514014580540.v(u9933786248742319541.c(i2));
            i2++;
        }
    }

    public static void z(int i, List list, H12843822278061842084 h12843822278061842084, boolean z) throws I8626815837691735180 {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof K908934630684087819;
        A5011514514014580540 a5011514514014580540 = (A5011514514014580540) h12843822278061842084.b;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    a5011514514014580540.w(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            a5011514514014580540.t(i, 2);
            int iG = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iG += A5011514514014580540.g(((Long) list.get(i3)).longValue());
            }
            a5011514514014580540.v(iG);
            while (i2 < list.size()) {
                a5011514514014580540.x(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        K908934630684087819 k908934630684087819 = (K908934630684087819) list;
        if (!z) {
            while (i2 < 0) {
                a5011514514014580540.w(i, k908934630684087819.c(i2));
                i2++;
            }
            return;
        }
        a5011514514014580540.t(i, 2);
        int iG2 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iG2 += A5011514514014580540.g(k908934630684087819.c(i4));
        }
        a5011514514014580540.v(iG2);
        while (i2 < 0) {
            a5011514514014580540.x(k908934630684087819.c(i2));
            i2++;
        }
    }

    public static Object j(Object obj, int i, A10696933611341011168 a10696933611341011168, Object obj2, R1604357493379982192 r1604357493379982192) {
        return obj2;
    }
}
