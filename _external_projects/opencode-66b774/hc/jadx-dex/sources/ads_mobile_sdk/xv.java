package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class xv {
    public static ads_mobile_sdk.ci3 a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static ads_mobile_sdk.q22 f2a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static android.content.Context f3a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static final dev.epro.r0.M9197813449740923653 f4a = new dev.epro.r0.M9197813449740923653(new dev.epro.r0.T15504973625601650233((byte) 29), (byte) 15);
    public static volatile int b;

    public static void a(java.lang.Object obj, java.lang.Object obj2) {
        ads_mobile_sdk.cu0 cu0Var = (ads_mobile_sdk.cu0) obj;
        ads_mobile_sdk.bm3 bm3Var = cu0Var.b;
        ads_mobile_sdk.bm3 bm3Var2 = ((ads_mobile_sdk.cu0) obj2).b;
        ads_mobile_sdk.bm3 bm3Var3 = ads_mobile_sdk.bm3.f;
        if (!bm3Var3.equals(bm3Var2)) {
            if (bm3Var3.equals(bm3Var)) {
                int i = bm3Var.a + bm3Var2.a;
                int[] iArrCopyOf = java.util.Arrays.copyOf(bm3Var.b, i);
                java.lang.System.arraycopy(bm3Var2.b, 0, iArrCopyOf, bm3Var.a, bm3Var2.a);
                java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(bm3Var.c, i);
                java.lang.System.arraycopy(bm3Var2.c, 0, objArrCopyOf, bm3Var.a, bm3Var2.a);
                bm3Var = new ads_mobile_sdk.bm3(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                bm3Var.getClass();
                if (!bm3Var2.equals(bm3Var3)) {
                    if (!bm3Var.e) {
                        dev.epro.r0.Z3383101362411723454.t();
                        return;
                    }
                    int i2 = bm3Var.a + bm3Var2.a;
                    bm3Var.a(i2);
                    java.lang.System.arraycopy(bm3Var2.b, 0, bm3Var.b, bm3Var.a, bm3Var2.a);
                    java.lang.System.arraycopy(bm3Var2.c, 0, bm3Var.c, bm3Var.a, bm3Var2.a);
                    bm3Var.a = i2;
                }
            }
        }
        cu0Var.b = bm3Var;
    }

    public static void b(int i, java.util.List list, ads_mobile_sdk.w8 w8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ads_mobile_sdk.yu yuVar = (ads_mobile_sdk.yu) w8Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                yuVar.d(i, java.lang.Double.doubleToRawLongBits(((java.lang.Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        yuVar.g(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((java.lang.Double) list.get(i4)).getClass();
            i3 += 8;
        }
        yuVar.m(i3);
        while (i2 < list.size()) {
            yuVar.c(java.lang.Double.doubleToRawLongBits(((java.lang.Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void c(int i, java.util.List list, ads_mobile_sdk.w8 w8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ads_mobile_sdk.yu yuVar = (ads_mobile_sdk.yu) w8Var.a;
        int i2 = 0;
        if (!(list instanceof ads_mobile_sdk.jb1)) {
            if (!z) {
                while (i2 < list.size()) {
                    yuVar.f(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            yuVar.g(i, 2);
            int iA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iA += ads_mobile_sdk.yu.a(((java.lang.Integer) list.get(i3)).intValue());
            }
            yuVar.m(iA);
            while (i2 < list.size()) {
                yuVar.l(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ads_mobile_sdk.jb1 jb1Var = (ads_mobile_sdk.jb1) list;
        if (!z) {
            while (i2 < jb1Var.c) {
                jb1Var.d(i2);
                yuVar.f(i, jb1Var.b[i2]);
                i2++;
            }
            return;
        }
        yuVar.g(i, 2);
        int iA2 = 0;
        for (int i4 = 0; i4 < jb1Var.c; i4++) {
            jb1Var.d(i4);
            iA2 += ads_mobile_sdk.yu.a(jb1Var.b[i4]);
        }
        yuVar.m(iA2);
        while (i2 < jb1Var.c) {
            jb1Var.d(i2);
            yuVar.l(jb1Var.b[i2]);
            i2++;
        }
    }

    public static void d(int i, java.util.List list, ads_mobile_sdk.w8 w8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ads_mobile_sdk.yu yuVar = (ads_mobile_sdk.yu) w8Var.a;
        int i2 = 0;
        if (!(list instanceof ads_mobile_sdk.jb1)) {
            if (!z) {
                while (i2 < list.size()) {
                    yuVar.e(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            yuVar.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            yuVar.m(i3);
            while (i2 < list.size()) {
                yuVar.k(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ads_mobile_sdk.jb1 jb1Var = (ads_mobile_sdk.jb1) list;
        if (!z) {
            while (i2 < jb1Var.c) {
                jb1Var.d(i2);
                yuVar.e(i, jb1Var.b[i2]);
                i2++;
            }
            return;
        }
        yuVar.g(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < jb1Var.c; i6++) {
            jb1Var.d(i6);
            int i7 = jb1Var.b[i6];
            i5 += 4;
        }
        yuVar.m(i5);
        while (i2 < jb1Var.c) {
            jb1Var.d(i2);
            yuVar.k(jb1Var.b[i2]);
            i2++;
        }
    }

    public static void e(int i, java.util.List list, ads_mobile_sdk.w8 w8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ads_mobile_sdk.yu yuVar = (ads_mobile_sdk.yu) w8Var.a;
        int i2 = 0;
        if (!(list instanceof ads_mobile_sdk.wm1)) {
            if (!z) {
                while (i2 < list.size()) {
                    yuVar.d(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            yuVar.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Long) list.get(i4)).getClass();
                i3 += 8;
            }
            yuVar.m(i3);
            while (i2 < list.size()) {
                yuVar.c(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        ads_mobile_sdk.wm1 wm1Var = (ads_mobile_sdk.wm1) list;
        if (!z) {
            while (i2 < wm1Var.c) {
                wm1Var.c(i2);
                yuVar.d(i, wm1Var.b[i2]);
                i2++;
            }
            return;
        }
        yuVar.g(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < wm1Var.c; i6++) {
            wm1Var.c(i6);
            long j = wm1Var.b[i6];
            i5 += 8;
        }
        yuVar.m(i5);
        while (i2 < wm1Var.c) {
            wm1Var.c(i2);
            yuVar.c(wm1Var.b[i2]);
            i2++;
        }
    }

    public static void f(int i, java.util.List list, ads_mobile_sdk.w8 w8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ads_mobile_sdk.yu yuVar = (ads_mobile_sdk.yu) w8Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                yuVar.e(i, java.lang.Float.floatToRawIntBits(((java.lang.Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        yuVar.g(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((java.lang.Float) list.get(i4)).getClass();
            i3 += 4;
        }
        yuVar.m(i3);
        while (i2 < list.size()) {
            yuVar.k(java.lang.Float.floatToRawIntBits(((java.lang.Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void g(int i, java.util.List list, ads_mobile_sdk.w8 w8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ads_mobile_sdk.yu yuVar = (ads_mobile_sdk.yu) w8Var.a;
        int i2 = 0;
        if (!(list instanceof ads_mobile_sdk.jb1)) {
            if (!z) {
                while (i2 < list.size()) {
                    yuVar.f(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            yuVar.g(i, 2);
            int iA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iA += ads_mobile_sdk.yu.a(((java.lang.Integer) list.get(i3)).intValue());
            }
            yuVar.m(iA);
            while (i2 < list.size()) {
                yuVar.l(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ads_mobile_sdk.jb1 jb1Var = (ads_mobile_sdk.jb1) list;
        if (!z) {
            while (i2 < jb1Var.c) {
                jb1Var.d(i2);
                yuVar.f(i, jb1Var.b[i2]);
                i2++;
            }
            return;
        }
        yuVar.g(i, 2);
        int iA2 = 0;
        for (int i4 = 0; i4 < jb1Var.c; i4++) {
            jb1Var.d(i4);
            iA2 += ads_mobile_sdk.yu.a(jb1Var.b[i4]);
        }
        yuVar.m(iA2);
        while (i2 < jb1Var.c) {
            jb1Var.d(i2);
            yuVar.l(jb1Var.b[i2]);
            i2++;
        }
    }

    public static void h(int i, java.util.List list, ads_mobile_sdk.w8 w8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ads_mobile_sdk.yu yuVar = (ads_mobile_sdk.yu) w8Var.a;
        int i2 = 0;
        if (!(list instanceof ads_mobile_sdk.wm1)) {
            if (!z) {
                while (i2 < list.size()) {
                    yuVar.e(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            yuVar.g(i, 2);
            int iA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iA += ads_mobile_sdk.yu.a(((java.lang.Long) list.get(i3)).longValue());
            }
            yuVar.m(iA);
            while (i2 < list.size()) {
                yuVar.d(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        ads_mobile_sdk.wm1 wm1Var = (ads_mobile_sdk.wm1) list;
        if (!z) {
            while (i2 < wm1Var.c) {
                wm1Var.c(i2);
                yuVar.e(i, wm1Var.b[i2]);
                i2++;
            }
            return;
        }
        yuVar.g(i, 2);
        int iA2 = 0;
        for (int i4 = 0; i4 < wm1Var.c; i4++) {
            wm1Var.c(i4);
            iA2 += ads_mobile_sdk.yu.a(wm1Var.b[i4]);
        }
        yuVar.m(iA2);
        while (i2 < wm1Var.c) {
            wm1Var.c(i2);
            yuVar.d(wm1Var.b[i2]);
            i2++;
        }
    }

    public static void i(int i, java.util.List list, ads_mobile_sdk.w8 w8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ads_mobile_sdk.yu yuVar = (ads_mobile_sdk.yu) w8Var.a;
        int i2 = 0;
        if (!(list instanceof ads_mobile_sdk.jb1)) {
            if (!z) {
                while (i2 < list.size()) {
                    yuVar.e(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            yuVar.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            yuVar.m(i3);
            while (i2 < list.size()) {
                yuVar.k(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ads_mobile_sdk.jb1 jb1Var = (ads_mobile_sdk.jb1) list;
        if (!z) {
            while (i2 < jb1Var.c) {
                jb1Var.d(i2);
                yuVar.e(i, jb1Var.b[i2]);
                i2++;
            }
            return;
        }
        yuVar.g(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < jb1Var.c; i6++) {
            jb1Var.d(i6);
            int i7 = jb1Var.b[i6];
            i5 += 4;
        }
        yuVar.m(i5);
        while (i2 < jb1Var.c) {
            jb1Var.d(i2);
            yuVar.k(jb1Var.b[i2]);
            i2++;
        }
    }

    public static void j(int i, java.util.List list, ads_mobile_sdk.w8 w8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ads_mobile_sdk.yu yuVar = (ads_mobile_sdk.yu) w8Var.a;
        int i2 = 0;
        if (!(list instanceof ads_mobile_sdk.wm1)) {
            if (!z) {
                while (i2 < list.size()) {
                    yuVar.d(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            yuVar.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Long) list.get(i4)).getClass();
                i3 += 8;
            }
            yuVar.m(i3);
            while (i2 < list.size()) {
                yuVar.c(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        ads_mobile_sdk.wm1 wm1Var = (ads_mobile_sdk.wm1) list;
        if (!z) {
            while (i2 < wm1Var.c) {
                wm1Var.c(i2);
                yuVar.d(i, wm1Var.b[i2]);
                i2++;
            }
            return;
        }
        yuVar.g(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < wm1Var.c; i6++) {
            wm1Var.c(i6);
            long j = wm1Var.b[i6];
            i5 += 8;
        }
        yuVar.m(i5);
        while (i2 < wm1Var.c) {
            wm1Var.c(i2);
            yuVar.c(wm1Var.b[i2]);
            i2++;
        }
    }

    public static void k(int i, java.util.List list, ads_mobile_sdk.w8 w8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ads_mobile_sdk.yu yuVar = (ads_mobile_sdk.yu) w8Var.a;
        int i2 = 0;
        if (!(list instanceof ads_mobile_sdk.jb1)) {
            if (!z) {
                while (i2 < list.size()) {
                    yuVar.h(i, ads_mobile_sdk.yu.j(((java.lang.Integer) list.get(i2)).intValue()));
                    i2++;
                }
                return;
            }
            yuVar.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ads_mobile_sdk.yu.i(ads_mobile_sdk.yu.j(((java.lang.Integer) list.get(i4)).intValue()));
            }
            yuVar.m(i3);
            while (i2 < list.size()) {
                yuVar.m(ads_mobile_sdk.yu.j(((java.lang.Integer) list.get(i2)).intValue()));
                i2++;
            }
            return;
        }
        ads_mobile_sdk.jb1 jb1Var = (ads_mobile_sdk.jb1) list;
        if (!z) {
            while (i2 < jb1Var.c) {
                jb1Var.d(i2);
                yuVar.h(i, ads_mobile_sdk.yu.j(jb1Var.b[i2]));
                i2++;
            }
            return;
        }
        yuVar.g(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < jb1Var.c; i6++) {
            jb1Var.d(i6);
            i5 += ads_mobile_sdk.yu.i(ads_mobile_sdk.yu.j(jb1Var.b[i6]));
        }
        yuVar.m(i5);
        while (i2 < jb1Var.c) {
            jb1Var.d(i2);
            yuVar.m(ads_mobile_sdk.yu.j(jb1Var.b[i2]));
            i2++;
        }
    }

    public static void l(int i, java.util.List list, ads_mobile_sdk.w8 w8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ads_mobile_sdk.yu yuVar = (ads_mobile_sdk.yu) w8Var.a;
        int i2 = 0;
        if (!(list instanceof ads_mobile_sdk.wm1)) {
            if (!z) {
                while (i2 < list.size()) {
                    yuVar.e(i, ads_mobile_sdk.yu.b(((java.lang.Long) list.get(i2)).longValue()));
                    i2++;
                }
                return;
            }
            yuVar.g(i, 2);
            int iA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iA += ads_mobile_sdk.yu.a(ads_mobile_sdk.yu.b(((java.lang.Long) list.get(i3)).longValue()));
            }
            yuVar.m(iA);
            while (i2 < list.size()) {
                yuVar.d(ads_mobile_sdk.yu.b(((java.lang.Long) list.get(i2)).longValue()));
                i2++;
            }
            return;
        }
        ads_mobile_sdk.wm1 wm1Var = (ads_mobile_sdk.wm1) list;
        if (!z) {
            while (i2 < wm1Var.c) {
                wm1Var.c(i2);
                yuVar.e(i, ads_mobile_sdk.yu.b(wm1Var.b[i2]));
                i2++;
            }
            return;
        }
        yuVar.g(i, 2);
        int iA2 = 0;
        for (int i4 = 0; i4 < wm1Var.c; i4++) {
            wm1Var.c(i4);
            iA2 += ads_mobile_sdk.yu.a(ads_mobile_sdk.yu.b(wm1Var.b[i4]));
        }
        yuVar.m(iA2);
        while (i2 < wm1Var.c) {
            wm1Var.c(i2);
            yuVar.d(ads_mobile_sdk.yu.b(wm1Var.b[i2]));
            i2++;
        }
    }

    public static void m(int i, java.util.List list, ads_mobile_sdk.w8 w8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ads_mobile_sdk.yu yuVar = (ads_mobile_sdk.yu) w8Var.a;
        int i2 = 0;
        if (!(list instanceof ads_mobile_sdk.jb1)) {
            if (!z) {
                while (i2 < list.size()) {
                    yuVar.h(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            yuVar.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ads_mobile_sdk.yu.i(((java.lang.Integer) list.get(i4)).intValue());
            }
            yuVar.m(i3);
            while (i2 < list.size()) {
                yuVar.m(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ads_mobile_sdk.jb1 jb1Var = (ads_mobile_sdk.jb1) list;
        if (!z) {
            while (i2 < jb1Var.c) {
                jb1Var.d(i2);
                yuVar.h(i, jb1Var.b[i2]);
                i2++;
            }
            return;
        }
        yuVar.g(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < jb1Var.c; i6++) {
            jb1Var.d(i6);
            i5 += ads_mobile_sdk.yu.i(jb1Var.b[i6]);
        }
        yuVar.m(i5);
        while (i2 < jb1Var.c) {
            jb1Var.d(i2);
            yuVar.m(jb1Var.b[i2]);
            i2++;
        }
    }

    public static void n(int i, java.util.List list, ads_mobile_sdk.w8 w8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ads_mobile_sdk.yu yuVar = (ads_mobile_sdk.yu) w8Var.a;
        int i2 = 0;
        if (!(list instanceof ads_mobile_sdk.wm1)) {
            if (!z) {
                while (i2 < list.size()) {
                    yuVar.e(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            yuVar.g(i, 2);
            int iA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iA += ads_mobile_sdk.yu.a(((java.lang.Long) list.get(i3)).longValue());
            }
            yuVar.m(iA);
            while (i2 < list.size()) {
                yuVar.d(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        ads_mobile_sdk.wm1 wm1Var = (ads_mobile_sdk.wm1) list;
        if (!z) {
            while (i2 < wm1Var.c) {
                wm1Var.c(i2);
                yuVar.e(i, wm1Var.b[i2]);
                i2++;
            }
            return;
        }
        yuVar.g(i, 2);
        int iA2 = 0;
        for (int i4 = 0; i4 < wm1Var.c; i4++) {
            wm1Var.c(i4);
            iA2 += ads_mobile_sdk.yu.a(wm1Var.b[i4]);
        }
        yuVar.m(iA2);
        while (i2 < wm1Var.c) {
            wm1Var.c(i2);
            yuVar.d(wm1Var.b[i2]);
            i2++;
        }
    }

    public static int b(java.util.List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ads_mobile_sdk.jb1)) {
            int iA = 0;
            while (i < size) {
                iA += ads_mobile_sdk.yu.a(((java.lang.Integer) list.get(i)).intValue());
                i++;
            }
            return iA;
        }
        ads_mobile_sdk.jb1 jb1Var = (ads_mobile_sdk.jb1) list;
        int iA2 = 0;
        while (i < size) {
            jb1Var.d(i);
            iA2 += ads_mobile_sdk.yu.a(jb1Var.b[i]);
            i++;
        }
        return iA2;
    }

    public static int f(java.util.List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ads_mobile_sdk.wm1)) {
            int iA = 0;
            while (i < size) {
                iA += ads_mobile_sdk.yu.a(((java.lang.Long) list.get(i)).longValue());
                i++;
            }
            return iA;
        }
        ads_mobile_sdk.wm1 wm1Var = (ads_mobile_sdk.wm1) list;
        int iA2 = 0;
        while (i < size) {
            wm1Var.c(i);
            iA2 += ads_mobile_sdk.yu.a(wm1Var.b[i]);
            i++;
        }
        return iA2;
    }

    public static void a(java.lang.String str) {
        java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException(str);
        ads_mobile_sdk.ci3 ci3Var = a;
        if (ci3Var != null) {
            ci3Var.a(str, (java.lang.Throwable) illegalStateException);
        }
    }

    public static ads_mobile_sdk.ii a(java.lang.String str, int i, long j) {
        ads_mobile_sdk.hh3 hh3Var = new ads_mobile_sdk.hh3(str);
        int i2 = ads_mobile_sdk.aw.k;
        dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
        return new ads_mobile_sdk.ii(new java.util.concurrent.ThreadPoolExecutor(i, i, dev.epro.r0.E17093345031926825464.k(j, dev.epro.r0.N13798149404328803870.e), java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), hh3Var), hh3Var);
    }

    public static void a(java.lang.String str, java.lang.Exception exc) {
        dev.epro.r0.M9197813449740923653 m9197813449740923653 = f4a;
        dev.epro.r0.Q14045283675743224921 q14045283675743224921D = ((dev.epro.r0.E17928301615710791514) m9197813449740923653.b).d(m9197813449740923653, str);
        while (true) {
            dev.epro.r0.Q14045283675743224921 q14045283675743224921 = q14045283675743224921D;
            if (!q14045283675743224921.hasNext()) {
                break;
            }
            java.lang.Thread.currentThread().getName();
        }
        if (exc != null) {
            android.util.Log.getStackTraceString(exc).getClass();
        }
    }

    public static java.lang.Object a(java.lang.Object obj, int i, dev.epro.r0.O6641393078261985068 o6641393078261985068, dev.epro.r0.N4718165958758773250 n4718165958758773250, java.lang.Object obj2) {
        if (n4718165958758773250 == null) {
            return obj2;
        }
        if (o6641393078261985068 != null) {
            int size = o6641393078261985068.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                java.lang.Integer num = (java.lang.Integer) o6641393078261985068.get(i3);
                int iIntValue = num.intValue();
                if (n4718165958758773250.a(iIntValue)) {
                    if (i3 != i2) {
                        o6641393078261985068.set(i2, num);
                    }
                    i2++;
                } else {
                    obj2 = a(i, iIntValue, obj, obj2);
                }
            }
            if (i2 != size) {
                o6641393078261985068.subList(i2, size).clear();
            }
            return obj2;
        }
        java.util.Iterator it = o6641393078261985068.iterator();
        while (it.hasNext()) {
            int iIntValue2 = ((java.lang.Integer) it.next()).intValue();
            if (!n4718165958758773250.a(iIntValue2)) {
                obj2 = a(i, iIntValue2, obj, obj2);
                it.remove();
            }
        }
        return obj2;
    }

    public static int a() {
        if (b == 0 && f3a != null) {
            synchronized (ads_mobile_sdk.xv.class) {
                if (f3a != null && b == 0) {
                    try {
                        int i = f3a.getResources().getConfiguration().uiMode & 15;
                        int i2 = 1;
                        if (i == 1) {
                            i2 = 2;
                        } else if (i != 4) {
                            i2 = 3;
                        }
                        b = i2;
                    } catch (java.lang.RuntimeException unused) {
                    }
                }
            }
        }
        if (b == 0) {
            return 3;
        }
        return b;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m13a(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int e(java.util.List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ads_mobile_sdk.jb1)) {
            int iA = 0;
            while (i < size) {
                iA += ads_mobile_sdk.yu.a(((java.lang.Integer) list.get(i)).intValue());
                i++;
            }
            return iA;
        }
        ads_mobile_sdk.jb1 jb1Var = (ads_mobile_sdk.jb1) list;
        int iA2 = 0;
        while (i < size) {
            jb1Var.d(i);
            iA2 += ads_mobile_sdk.yu.a(jb1Var.b[i]);
            i++;
        }
        return iA2;
    }

    public static int i(java.util.List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ads_mobile_sdk.jb1)) {
            int i2 = 0;
            while (i < size) {
                i2 += ads_mobile_sdk.yu.i(((java.lang.Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        ads_mobile_sdk.jb1 jb1Var = (ads_mobile_sdk.jb1) list;
        int i3 = 0;
        while (i < size) {
            jb1Var.d(i);
            i3 += ads_mobile_sdk.yu.i(jb1Var.b[i]);
            i++;
        }
        return i3;
    }

    public static int j(java.util.List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ads_mobile_sdk.wm1)) {
            int iA = 0;
            while (i < size) {
                iA += ads_mobile_sdk.yu.a(((java.lang.Long) list.get(i)).longValue());
                i++;
            }
            return iA;
        }
        ads_mobile_sdk.wm1 wm1Var = (ads_mobile_sdk.wm1) list;
        int iA2 = 0;
        while (i < size) {
            wm1Var.c(i);
            iA2 += ads_mobile_sdk.yu.a(wm1Var.b[i]);
            i++;
        }
        return iA2;
    }

    public static java.lang.Object a(int i, int i2, java.lang.Object obj, java.lang.Object obj2) {
        if (obj2 == null) {
            obj2 = dev.epro.r0.U11450443558875589191.d(obj);
        }
        ((ads_mobile_sdk.bm3) obj2).a(i << 3, java.lang.Long.valueOf(i2));
        return obj2;
    }

    public static void a(int i, java.util.List list, ads_mobile_sdk.w8 w8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ads_mobile_sdk.yu yuVar = (ads_mobile_sdk.yu) w8Var.a;
        int i2 = 0;
        if (z) {
            yuVar.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Boolean) list.get(i4)).getClass();
                i3++;
            }
            yuVar.m(i3);
            while (i2 < list.size()) {
                yuVar.a(((java.lang.Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            yuVar.a(i, ((java.lang.Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    public static int h(java.util.List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ads_mobile_sdk.wm1)) {
            int iA = 0;
            while (i < size) {
                iA += ads_mobile_sdk.yu.a(ads_mobile_sdk.yu.b(((java.lang.Long) list.get(i)).longValue()));
                i++;
            }
            return iA;
        }
        ads_mobile_sdk.wm1 wm1Var = (ads_mobile_sdk.wm1) list;
        int iA2 = 0;
        while (i < size) {
            wm1Var.c(i);
            iA2 += ads_mobile_sdk.yu.a(ads_mobile_sdk.yu.b(wm1Var.b[i]));
            i++;
        }
        return iA2;
    }

    public static int e(int i, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (ads_mobile_sdk.yu.h(i) + 8) * size;
    }

    public static void c(java.lang.String str, java.lang.Exception exc) {
        str.getClass();
        dev.epro.r0.M9197813449740923653 m9197813449740923653 = f4a;
        dev.epro.r0.Q14045283675743224921 q14045283675743224921D = ((dev.epro.r0.E17928301615710791514) m9197813449740923653.b).d(m9197813449740923653, str);
        while (true) {
            dev.epro.r0.Q14045283675743224921 q14045283675743224921 = q14045283675743224921D;
            if (!q14045283675743224921.hasNext()) {
                break;
            }
            java.lang.Thread.currentThread().getName();
        }
        if (exc != null) {
            android.util.Log.getStackTraceString(exc).getClass();
        }
    }

    public static int g(java.util.List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ads_mobile_sdk.jb1)) {
            int i2 = 0;
            while (i < size) {
                i2 += ads_mobile_sdk.yu.i(ads_mobile_sdk.yu.j(((java.lang.Integer) list.get(i)).intValue()));
                i++;
            }
            return i2;
        }
        ads_mobile_sdk.jb1 jb1Var = (ads_mobile_sdk.jb1) list;
        int i3 = 0;
        while (i < size) {
            jb1Var.d(i);
            i3 += ads_mobile_sdk.yu.i(ads_mobile_sdk.yu.j(jb1Var.b[i]));
            i++;
        }
        return i3;
    }
}
