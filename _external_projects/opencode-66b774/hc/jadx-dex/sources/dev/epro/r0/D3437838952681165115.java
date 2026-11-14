package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class D3437838952681165115 {
    public static final dev.epro.r0.Y2677586711477821327 a;

    static {
        int i = dev.epro.r0.U9214787009581580404.a;
        a = new dev.epro.r0.Y2677586711477821327((byte) 19);
    }

    public static void a(int i, java.util.List list, dev.epro.r0.M204440408817344908 m204440408817344908, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        dev.epro.r0.M15366967277392692994 m15366967277392692994 = (dev.epro.r0.M15366967277392692994) m204440408817344908.b;
        int i2 = 0;
        if (!(list instanceof dev.epro.r0.M15067098841499153540)) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((java.lang.Integer) list.get(i2)).intValue();
                    m15366967277392692994.Y(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            m15366967277392692994.X(i, 2);
            int iH = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((java.lang.Integer) list.get(i3)).intValue();
                iH += dev.epro.r0.M15366967277392692994.H((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            m15366967277392692994.Z(iH);
            while (i2 < list.size()) {
                int iIntValue3 = ((java.lang.Integer) list.get(i2)).intValue();
                m15366967277392692994.Z((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        dev.epro.r0.M15067098841499153540 m15067098841499153540 = (dev.epro.r0.M15067098841499153540) list;
        if (!z) {
            while (i2 < m15067098841499153540.c) {
                int iB = m15067098841499153540.b(i2);
                m15366967277392692994.Y(i, (iB >> 31) ^ (iB + iB));
                i2++;
            }
            return;
        }
        m15366967277392692994.X(i, 2);
        int iH2 = 0;
        for (int i4 = 0; i4 < m15067098841499153540.c; i4++) {
            int iB2 = m15067098841499153540.b(i4);
            iH2 += dev.epro.r0.M15366967277392692994.H((iB2 >> 31) ^ (iB2 + iB2));
        }
        m15366967277392692994.Z(iH2);
        while (i2 < m15067098841499153540.c) {
            int iB3 = m15067098841499153540.b(i2);
            m15366967277392692994.Z((iB3 >> 31) ^ (iB3 + iB3));
            i2++;
        }
    }

    public static void b(int i, java.util.List list, dev.epro.r0.M204440408817344908 m204440408817344908, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        dev.epro.r0.M15366967277392692994 m15366967277392692994 = (dev.epro.r0.M15366967277392692994) m204440408817344908.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((java.lang.Long) list.get(i2)).longValue();
                m15366967277392692994.a0(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i2++;
            }
            return;
        }
        m15366967277392692994.X(i, 2);
        int I = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((java.lang.Long) list.get(i3)).longValue();
            I += dev.epro.r0.M15366967277392692994.I((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        m15366967277392692994.Z(I);
        while (i2 < list.size()) {
            long jLongValue3 = ((java.lang.Long) list.get(i2)).longValue();
            m15366967277392692994.b0((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i2++;
        }
    }

    public static void c(int i, java.util.List list, dev.epro.r0.M204440408817344908 m204440408817344908, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        dev.epro.r0.M15366967277392692994 m15366967277392692994 = (dev.epro.r0.M15366967277392692994) m204440408817344908.b;
        int i2 = 0;
        if (!(list instanceof dev.epro.r0.M15067098841499153540)) {
            if (!z) {
                while (i2 < list.size()) {
                    m15366967277392692994.Y(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            m15366967277392692994.X(i, 2);
            int iH = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iH += dev.epro.r0.M15366967277392692994.H(((java.lang.Integer) list.get(i3)).intValue());
            }
            m15366967277392692994.Z(iH);
            while (i2 < list.size()) {
                m15366967277392692994.Z(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        dev.epro.r0.M15067098841499153540 m15067098841499153540 = (dev.epro.r0.M15067098841499153540) list;
        if (!z) {
            while (i2 < m15067098841499153540.c) {
                m15366967277392692994.Y(i, m15067098841499153540.b(i2));
                i2++;
            }
            return;
        }
        m15366967277392692994.X(i, 2);
        int iH2 = 0;
        for (int i4 = 0; i4 < m15067098841499153540.c; i4++) {
            iH2 += dev.epro.r0.M15366967277392692994.H(m15067098841499153540.b(i4));
        }
        m15366967277392692994.Z(iH2);
        while (i2 < m15067098841499153540.c) {
            m15366967277392692994.Z(m15067098841499153540.b(i2));
            i2++;
        }
    }

    public static void d(int i, java.util.List list, dev.epro.r0.M204440408817344908 m204440408817344908, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        dev.epro.r0.M15366967277392692994 m15366967277392692994 = (dev.epro.r0.M15366967277392692994) m204440408817344908.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                m15366967277392692994.a0(i, ((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        m15366967277392692994.X(i, 2);
        int I = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            I += dev.epro.r0.M15366967277392692994.I(((java.lang.Long) list.get(i3)).longValue());
        }
        m15366967277392692994.Z(I);
        while (i2 < list.size()) {
            m15366967277392692994.b0(((java.lang.Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static boolean e(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int f(java.util.List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof dev.epro.r0.M15067098841499153540)) {
            int I = 0;
            while (i < size) {
                I += dev.epro.r0.M15366967277392692994.I(((java.lang.Integer) list.get(i)).intValue());
                i++;
            }
            return I;
        }
        dev.epro.r0.M15067098841499153540 m15067098841499153540 = (dev.epro.r0.M15067098841499153540) list;
        int I2 = 0;
        while (i < size) {
            I2 += dev.epro.r0.M15366967277392692994.I(m15067098841499153540.b(i));
            i++;
        }
        return I2;
    }

    public static int g(int i, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (dev.epro.r0.M15366967277392692994.H(i << 3) + 4) * size;
    }

    public static int h(int i, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (dev.epro.r0.M15366967277392692994.H(i << 3) + 8) * size;
    }

    public static int i(java.util.List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof dev.epro.r0.M15067098841499153540)) {
            int I = 0;
            while (i < size) {
                I += dev.epro.r0.M15366967277392692994.I(((java.lang.Integer) list.get(i)).intValue());
                i++;
            }
            return I;
        }
        dev.epro.r0.M15067098841499153540 m15067098841499153540 = (dev.epro.r0.M15067098841499153540) list;
        int I2 = 0;
        while (i < size) {
            I2 += dev.epro.r0.M15366967277392692994.I(m15067098841499153540.b(i));
            i++;
        }
        return I2;
    }

    public static int j(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int I = 0;
        for (int i = 0; i < size; i++) {
            I += dev.epro.r0.M15366967277392692994.I(((java.lang.Long) list.get(i)).longValue());
        }
        return I;
    }

    public static int k(java.util.List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof dev.epro.r0.M15067098841499153540)) {
            int iH = 0;
            while (i < size) {
                int iIntValue = ((java.lang.Integer) list.get(i)).intValue();
                iH += dev.epro.r0.M15366967277392692994.H((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iH;
        }
        dev.epro.r0.M15067098841499153540 m15067098841499153540 = (dev.epro.r0.M15067098841499153540) list;
        int iH2 = 0;
        while (i < size) {
            int iB = m15067098841499153540.b(i);
            iH2 += dev.epro.r0.M15366967277392692994.H((iB >> 31) ^ (iB + iB));
            i++;
        }
        return iH2;
    }

    public static int l(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int I = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((java.lang.Long) list.get(i)).longValue();
            I += dev.epro.r0.M15366967277392692994.I((jLongValue >> 63) ^ (jLongValue + jLongValue));
        }
        return I;
    }

    public static int m(java.util.List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof dev.epro.r0.M15067098841499153540)) {
            int iH = 0;
            while (i < size) {
                iH += dev.epro.r0.M15366967277392692994.H(((java.lang.Integer) list.get(i)).intValue());
                i++;
            }
            return iH;
        }
        dev.epro.r0.M15067098841499153540 m15067098841499153540 = (dev.epro.r0.M15067098841499153540) list;
        int iH2 = 0;
        while (i < size) {
            iH2 += dev.epro.r0.M15366967277392692994.H(m15067098841499153540.b(i));
            i++;
        }
        return iH2;
    }

    public static int n(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int I = 0;
        for (int i = 0; i < size; i++) {
            I += dev.epro.r0.M15366967277392692994.I(((java.lang.Long) list.get(i)).longValue());
        }
        return I;
    }

    public static void o(java.lang.Object obj, java.lang.Object obj2) {
        dev.epro.r0.I10827619964430248728 i10827619964430248728 = (dev.epro.r0.I10827619964430248728) obj;
        dev.epro.r0.G17287098475146498869 g17287098475146498869 = i10827619964430248728.zzc;
        dev.epro.r0.G17287098475146498869 g172870984751464988692 = ((dev.epro.r0.I10827619964430248728) obj2).zzc;
        dev.epro.r0.G17287098475146498869 g172870984751464988693 = dev.epro.r0.G17287098475146498869.e;
        if (!g172870984751464988693.equals(g172870984751464988692)) {
            if (g172870984751464988693.equals(g17287098475146498869)) {
                g17287098475146498869.getClass();
                g172870984751464988692.getClass();
                int[] iArrCopyOf = java.util.Arrays.copyOf(g17287098475146498869.a, 0);
                java.lang.System.arraycopy(g172870984751464988692.a, 0, iArrCopyOf, 0, 0);
                java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(g17287098475146498869.b, 0);
                java.lang.System.arraycopy(g172870984751464988692.b, 0, objArrCopyOf, 0, 0);
                g17287098475146498869 = new dev.epro.r0.G17287098475146498869(iArrCopyOf, objArrCopyOf, true);
            } else {
                g17287098475146498869.getClass();
                if (!g172870984751464988692.equals(g172870984751464988693)) {
                    if (!g17287098475146498869.d) {
                        dev.epro.r0.Z3383101362411723454.t();
                        return;
                    } else {
                        java.lang.System.arraycopy(g172870984751464988692.a, 0, g17287098475146498869.a, 0, 0);
                        java.lang.System.arraycopy(g172870984751464988692.b, 0, g17287098475146498869.b, 0, 0);
                    }
                }
            }
        }
        i10827619964430248728.zzc = g17287098475146498869;
    }

    public static void p(int i, java.util.List list, dev.epro.r0.M204440408817344908 m204440408817344908, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        dev.epro.r0.M15366967277392692994 m15366967277392692994 = (dev.epro.r0.M15366967277392692994) m204440408817344908.b;
        byte[] bArr = m15366967277392692994.f;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                byte bBooleanValue = ((java.lang.Boolean) list.get(i2)).booleanValue();
                m15366967277392692994.K(11);
                m15366967277392692994.N(i << 3);
                int i3 = m15366967277392692994.h;
                bArr[i3] = bBooleanValue;
                m15366967277392692994.h = i3 + 1;
                i2++;
            }
            return;
        }
        m15366967277392692994.X(i, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((java.lang.Boolean) list.get(i5)).getClass();
            i4++;
        }
        m15366967277392692994.Z(i4);
        while (i2 < list.size()) {
            byte bBooleanValue2 = ((java.lang.Boolean) list.get(i2)).booleanValue();
            if (m15366967277392692994.h == m15366967277392692994.g) {
                m15366967277392692994.J();
            }
            int i6 = m15366967277392692994.h;
            bArr[i6] = bBooleanValue2;
            m15366967277392692994.h = i6 + 1;
            i2++;
        }
    }

    public static void q(int i, java.util.List list, dev.epro.r0.M204440408817344908 m204440408817344908, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        dev.epro.r0.M15366967277392692994 m15366967277392692994 = (dev.epro.r0.M15366967277392692994) m204440408817344908.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                m15366967277392692994.S(i, java.lang.Double.doubleToRawLongBits(((java.lang.Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        m15366967277392692994.X(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((java.lang.Double) list.get(i4)).getClass();
            i3 += 8;
        }
        m15366967277392692994.Z(i3);
        while (i2 < list.size()) {
            m15366967277392692994.T(java.lang.Double.doubleToRawLongBits(((java.lang.Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void r(int i, java.util.List list, dev.epro.r0.M204440408817344908 m204440408817344908, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        dev.epro.r0.M15366967277392692994 m15366967277392692994 = (dev.epro.r0.M15366967277392692994) m204440408817344908.b;
        int i2 = 0;
        if (!(list instanceof dev.epro.r0.M15067098841499153540)) {
            if (!z) {
                while (i2 < list.size()) {
                    m15366967277392692994.U(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            m15366967277392692994.X(i, 2);
            int I = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                I += dev.epro.r0.M15366967277392692994.I(((java.lang.Integer) list.get(i3)).intValue());
            }
            m15366967277392692994.Z(I);
            while (i2 < list.size()) {
                m15366967277392692994.V(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        dev.epro.r0.M15067098841499153540 m15067098841499153540 = (dev.epro.r0.M15067098841499153540) list;
        if (!z) {
            while (i2 < m15067098841499153540.c) {
                m15366967277392692994.U(i, m15067098841499153540.b(i2));
                i2++;
            }
            return;
        }
        m15366967277392692994.X(i, 2);
        int I2 = 0;
        for (int i4 = 0; i4 < m15067098841499153540.c; i4++) {
            I2 += dev.epro.r0.M15366967277392692994.I(m15067098841499153540.b(i4));
        }
        m15366967277392692994.Z(I2);
        while (i2 < m15067098841499153540.c) {
            m15366967277392692994.V(m15067098841499153540.b(i2));
            i2++;
        }
    }

    public static void s(int i, java.util.List list, dev.epro.r0.M204440408817344908 m204440408817344908, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        dev.epro.r0.M15366967277392692994 m15366967277392692994 = (dev.epro.r0.M15366967277392692994) m204440408817344908.b;
        int i2 = 0;
        if (!(list instanceof dev.epro.r0.M15067098841499153540)) {
            if (!z) {
                while (i2 < list.size()) {
                    m15366967277392692994.Q(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            m15366967277392692994.X(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            m15366967277392692994.Z(i3);
            while (i2 < list.size()) {
                m15366967277392692994.R(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        dev.epro.r0.M15067098841499153540 m15067098841499153540 = (dev.epro.r0.M15067098841499153540) list;
        if (!z) {
            while (i2 < m15067098841499153540.c) {
                m15366967277392692994.Q(i, m15067098841499153540.b(i2));
                i2++;
            }
            return;
        }
        m15366967277392692994.X(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < m15067098841499153540.c; i6++) {
            m15067098841499153540.b(i6);
            i5 += 4;
        }
        m15366967277392692994.Z(i5);
        while (i2 < m15067098841499153540.c) {
            m15366967277392692994.R(m15067098841499153540.b(i2));
            i2++;
        }
    }

    public static void t(int i, java.util.List list, dev.epro.r0.M204440408817344908 m204440408817344908, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        dev.epro.r0.M15366967277392692994 m15366967277392692994 = (dev.epro.r0.M15366967277392692994) m204440408817344908.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                m15366967277392692994.S(i, ((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        m15366967277392692994.X(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((java.lang.Long) list.get(i4)).getClass();
            i3 += 8;
        }
        m15366967277392692994.Z(i3);
        while (i2 < list.size()) {
            m15366967277392692994.T(((java.lang.Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void u(int i, java.util.List list, dev.epro.r0.M204440408817344908 m204440408817344908, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        dev.epro.r0.M15366967277392692994 m15366967277392692994 = (dev.epro.r0.M15366967277392692994) m204440408817344908.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                m15366967277392692994.Q(i, java.lang.Float.floatToRawIntBits(((java.lang.Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        m15366967277392692994.X(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((java.lang.Float) list.get(i4)).getClass();
            i3 += 4;
        }
        m15366967277392692994.Z(i3);
        while (i2 < list.size()) {
            m15366967277392692994.R(java.lang.Float.floatToRawIntBits(((java.lang.Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void v(int i, java.util.List list, dev.epro.r0.M204440408817344908 m204440408817344908, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        dev.epro.r0.M15366967277392692994 m15366967277392692994 = (dev.epro.r0.M15366967277392692994) m204440408817344908.b;
        int i2 = 0;
        if (!(list instanceof dev.epro.r0.M15067098841499153540)) {
            if (!z) {
                while (i2 < list.size()) {
                    m15366967277392692994.U(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            m15366967277392692994.X(i, 2);
            int I = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                I += dev.epro.r0.M15366967277392692994.I(((java.lang.Integer) list.get(i3)).intValue());
            }
            m15366967277392692994.Z(I);
            while (i2 < list.size()) {
                m15366967277392692994.V(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        dev.epro.r0.M15067098841499153540 m15067098841499153540 = (dev.epro.r0.M15067098841499153540) list;
        if (!z) {
            while (i2 < m15067098841499153540.c) {
                m15366967277392692994.U(i, m15067098841499153540.b(i2));
                i2++;
            }
            return;
        }
        m15366967277392692994.X(i, 2);
        int I2 = 0;
        for (int i4 = 0; i4 < m15067098841499153540.c; i4++) {
            I2 += dev.epro.r0.M15366967277392692994.I(m15067098841499153540.b(i4));
        }
        m15366967277392692994.Z(I2);
        while (i2 < m15067098841499153540.c) {
            m15366967277392692994.V(m15067098841499153540.b(i2));
            i2++;
        }
    }

    public static void w(int i, java.util.List list, dev.epro.r0.M204440408817344908 m204440408817344908, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        dev.epro.r0.M15366967277392692994 m15366967277392692994 = (dev.epro.r0.M15366967277392692994) m204440408817344908.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                m15366967277392692994.a0(i, ((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        m15366967277392692994.X(i, 2);
        int I = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            I += dev.epro.r0.M15366967277392692994.I(((java.lang.Long) list.get(i3)).longValue());
        }
        m15366967277392692994.Z(I);
        while (i2 < list.size()) {
            m15366967277392692994.b0(((java.lang.Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void x(int i, java.util.List list, dev.epro.r0.M204440408817344908 m204440408817344908, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        dev.epro.r0.M15366967277392692994 m15366967277392692994 = (dev.epro.r0.M15366967277392692994) m204440408817344908.b;
        int i2 = 0;
        if (!(list instanceof dev.epro.r0.M15067098841499153540)) {
            if (!z) {
                while (i2 < list.size()) {
                    m15366967277392692994.Q(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            m15366967277392692994.X(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            m15366967277392692994.Z(i3);
            while (i2 < list.size()) {
                m15366967277392692994.R(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        dev.epro.r0.M15067098841499153540 m15067098841499153540 = (dev.epro.r0.M15067098841499153540) list;
        if (!z) {
            while (i2 < m15067098841499153540.c) {
                m15366967277392692994.Q(i, m15067098841499153540.b(i2));
                i2++;
            }
            return;
        }
        m15366967277392692994.X(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < m15067098841499153540.c; i6++) {
            m15067098841499153540.b(i6);
            i5 += 4;
        }
        m15366967277392692994.Z(i5);
        while (i2 < m15067098841499153540.c) {
            m15366967277392692994.R(m15067098841499153540.b(i2));
            i2++;
        }
    }

    public static void y(int i, java.util.List list, dev.epro.r0.M204440408817344908 m204440408817344908, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        dev.epro.r0.M15366967277392692994 m15366967277392692994 = (dev.epro.r0.M15366967277392692994) m204440408817344908.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                m15366967277392692994.S(i, ((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        m15366967277392692994.X(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((java.lang.Long) list.get(i4)).getClass();
            i3 += 8;
        }
        m15366967277392692994.Z(i3);
        while (i2 < list.size()) {
            m15366967277392692994.T(((java.lang.Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
