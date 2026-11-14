package ads_mobile_sdk;

import android.content.Context;
import android.util.Log;
import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.E17928301615710791514;
import dev.epro.r0.M9197813449740923653;
import dev.epro.r0.N13798149404328803870;
import dev.epro.r0.N4718165958758773250;
import dev.epro.r0.O6641393078261985068;
import dev.epro.r0.Q14045283675743224921;
import dev.epro.r0.T15504973625601650233;
import dev.epro.r0.U11450443558875589191;
import dev.epro.r0.Z3383101362411723454;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public abstract class xv {
    public static ci3 a;

    /* renamed from: a, reason: collision with other field name */
    public static q22 f2a;

    /* renamed from: a, reason: collision with other field name */
    public static Context f3a;

    /* renamed from: a, reason: collision with other field name */
    public static final M9197813449740923653 f4a = new M9197813449740923653((Object) new T15504973625601650233(29), (byte) 15);
    public static volatile int b;

    public static void a(Object obj, Object obj2) {
        cu0 cu0Var = (cu0) obj;
        bm3 bm3Var = cu0Var.b;
        bm3 bm3Var2 = ((cu0) obj2).b;
        bm3 bm3Var3 = bm3.f;
        if (!bm3Var3.equals(bm3Var2)) {
            if (bm3Var3.equals(bm3Var)) {
                int i = bm3Var.a + bm3Var2.a;
                int[] copyOf = Arrays.copyOf(bm3Var.b, i);
                System.arraycopy(bm3Var2.b, 0, copyOf, bm3Var.a, bm3Var2.a);
                Object[] copyOf2 = Arrays.copyOf(bm3Var.c, i);
                System.arraycopy(bm3Var2.c, 0, copyOf2, bm3Var.a, bm3Var2.a);
                bm3Var = new bm3(i, copyOf, copyOf2, true);
            } else {
                bm3Var.getClass();
                if (!bm3Var2.equals(bm3Var3)) {
                    if (!bm3Var.e) {
                        Z3383101362411723454.t();
                        return;
                    }
                    int i2 = bm3Var.a + bm3Var2.a;
                    bm3Var.a(i2);
                    System.arraycopy(bm3Var2.b, 0, bm3Var.b, bm3Var.a, bm3Var2.a);
                    System.arraycopy(bm3Var2.c, 0, bm3Var.c, bm3Var.a, bm3Var2.a);
                    bm3Var.a = i2;
                }
            }
        }
        cu0Var.b = bm3Var;
    }

    public static void b(int i, List list, w8 w8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yu yuVar = (yu) w8Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                yuVar.d(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        yuVar.g(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        yuVar.m(i3);
        while (i2 < list.size()) {
            yuVar.c(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void c(int i, List list, w8 w8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yu yuVar = (yu) w8Var.a;
        int i2 = 0;
        if (!(list instanceof jb1)) {
            if (!z) {
                while (i2 < list.size()) {
                    yuVar.f(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            yuVar.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += yu.a(((Integer) list.get(i4)).intValue());
            }
            yuVar.m(i3);
            while (i2 < list.size()) {
                yuVar.l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        jb1 jb1Var = (jb1) list;
        if (!z) {
            while (i2 < jb1Var.c) {
                jb1Var.d(i2);
                yuVar.f(i, jb1Var.b[i2]);
                i2++;
            }
            return;
        }
        yuVar.g(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < jb1Var.c; i6++) {
            jb1Var.d(i6);
            i5 += yu.a(jb1Var.b[i6]);
        }
        yuVar.m(i5);
        while (i2 < jb1Var.c) {
            jb1Var.d(i2);
            yuVar.l(jb1Var.b[i2]);
            i2++;
        }
    }

    public static void d(int i, List list, w8 w8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yu yuVar = (yu) w8Var.a;
        int i2 = 0;
        if (!(list instanceof jb1)) {
            if (!z) {
                while (i2 < list.size()) {
                    yuVar.e(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            yuVar.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            yuVar.m(i3);
            while (i2 < list.size()) {
                yuVar.k(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        jb1 jb1Var = (jb1) list;
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

    public static void e(int i, List list, w8 w8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yu yuVar = (yu) w8Var.a;
        int i2 = 0;
        if (!(list instanceof wm1)) {
            if (!z) {
                while (i2 < list.size()) {
                    yuVar.d(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            yuVar.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            yuVar.m(i3);
            while (i2 < list.size()) {
                yuVar.c(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        wm1 wm1Var = (wm1) list;
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

    public static void f(int i, List list, w8 w8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yu yuVar = (yu) w8Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                yuVar.e(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        yuVar.g(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        yuVar.m(i3);
        while (i2 < list.size()) {
            yuVar.k(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void g(int i, List list, w8 w8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yu yuVar = (yu) w8Var.a;
        int i2 = 0;
        if (!(list instanceof jb1)) {
            if (!z) {
                while (i2 < list.size()) {
                    yuVar.f(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            yuVar.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += yu.a(((Integer) list.get(i4)).intValue());
            }
            yuVar.m(i3);
            while (i2 < list.size()) {
                yuVar.l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        jb1 jb1Var = (jb1) list;
        if (!z) {
            while (i2 < jb1Var.c) {
                jb1Var.d(i2);
                yuVar.f(i, jb1Var.b[i2]);
                i2++;
            }
            return;
        }
        yuVar.g(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < jb1Var.c; i6++) {
            jb1Var.d(i6);
            i5 += yu.a(jb1Var.b[i6]);
        }
        yuVar.m(i5);
        while (i2 < jb1Var.c) {
            jb1Var.d(i2);
            yuVar.l(jb1Var.b[i2]);
            i2++;
        }
    }

    public static void h(int i, List list, w8 w8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yu yuVar = (yu) w8Var.a;
        int i2 = 0;
        if (!(list instanceof wm1)) {
            if (!z) {
                while (i2 < list.size()) {
                    yuVar.e(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            yuVar.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += yu.a(((Long) list.get(i4)).longValue());
            }
            yuVar.m(i3);
            while (i2 < list.size()) {
                yuVar.d(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        wm1 wm1Var = (wm1) list;
        if (!z) {
            while (i2 < wm1Var.c) {
                wm1Var.c(i2);
                yuVar.e(i, wm1Var.b[i2]);
                i2++;
            }
            return;
        }
        yuVar.g(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < wm1Var.c; i6++) {
            wm1Var.c(i6);
            i5 += yu.a(wm1Var.b[i6]);
        }
        yuVar.m(i5);
        while (i2 < wm1Var.c) {
            wm1Var.c(i2);
            yuVar.d(wm1Var.b[i2]);
            i2++;
        }
    }

    public static void i(int i, List list, w8 w8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yu yuVar = (yu) w8Var.a;
        int i2 = 0;
        if (!(list instanceof jb1)) {
            if (!z) {
                while (i2 < list.size()) {
                    yuVar.e(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            yuVar.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            yuVar.m(i3);
            while (i2 < list.size()) {
                yuVar.k(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        jb1 jb1Var = (jb1) list;
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

    public static void j(int i, List list, w8 w8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yu yuVar = (yu) w8Var.a;
        int i2 = 0;
        if (!(list instanceof wm1)) {
            if (!z) {
                while (i2 < list.size()) {
                    yuVar.d(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            yuVar.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            yuVar.m(i3);
            while (i2 < list.size()) {
                yuVar.c(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        wm1 wm1Var = (wm1) list;
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

    public static void k(int i, List list, w8 w8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yu yuVar = (yu) w8Var.a;
        int i2 = 0;
        if (!(list instanceof jb1)) {
            if (!z) {
                while (i2 < list.size()) {
                    yuVar.h(i, yu.j(((Integer) list.get(i2)).intValue()));
                    i2++;
                }
                return;
            }
            yuVar.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += yu.i(yu.j(((Integer) list.get(i4)).intValue()));
            }
            yuVar.m(i3);
            while (i2 < list.size()) {
                yuVar.m(yu.j(((Integer) list.get(i2)).intValue()));
                i2++;
            }
            return;
        }
        jb1 jb1Var = (jb1) list;
        if (!z) {
            while (i2 < jb1Var.c) {
                jb1Var.d(i2);
                yuVar.h(i, yu.j(jb1Var.b[i2]));
                i2++;
            }
            return;
        }
        yuVar.g(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < jb1Var.c; i6++) {
            jb1Var.d(i6);
            i5 += yu.i(yu.j(jb1Var.b[i6]));
        }
        yuVar.m(i5);
        while (i2 < jb1Var.c) {
            jb1Var.d(i2);
            yuVar.m(yu.j(jb1Var.b[i2]));
            i2++;
        }
    }

    public static void l(int i, List list, w8 w8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yu yuVar = (yu) w8Var.a;
        int i2 = 0;
        if (!(list instanceof wm1)) {
            if (!z) {
                while (i2 < list.size()) {
                    yuVar.e(i, yu.b(((Long) list.get(i2)).longValue()));
                    i2++;
                }
                return;
            }
            yuVar.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += yu.a(yu.b(((Long) list.get(i4)).longValue()));
            }
            yuVar.m(i3);
            while (i2 < list.size()) {
                yuVar.d(yu.b(((Long) list.get(i2)).longValue()));
                i2++;
            }
            return;
        }
        wm1 wm1Var = (wm1) list;
        if (!z) {
            while (i2 < wm1Var.c) {
                wm1Var.c(i2);
                yuVar.e(i, yu.b(wm1Var.b[i2]));
                i2++;
            }
            return;
        }
        yuVar.g(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < wm1Var.c; i6++) {
            wm1Var.c(i6);
            i5 += yu.a(yu.b(wm1Var.b[i6]));
        }
        yuVar.m(i5);
        while (i2 < wm1Var.c) {
            wm1Var.c(i2);
            yuVar.d(yu.b(wm1Var.b[i2]));
            i2++;
        }
    }

    public static void m(int i, List list, w8 w8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yu yuVar = (yu) w8Var.a;
        int i2 = 0;
        if (!(list instanceof jb1)) {
            if (!z) {
                while (i2 < list.size()) {
                    yuVar.h(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            yuVar.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += yu.i(((Integer) list.get(i4)).intValue());
            }
            yuVar.m(i3);
            while (i2 < list.size()) {
                yuVar.m(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        jb1 jb1Var = (jb1) list;
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
            i5 += yu.i(jb1Var.b[i6]);
        }
        yuVar.m(i5);
        while (i2 < jb1Var.c) {
            jb1Var.d(i2);
            yuVar.m(jb1Var.b[i2]);
            i2++;
        }
    }

    public static void n(int i, List list, w8 w8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yu yuVar = (yu) w8Var.a;
        int i2 = 0;
        if (!(list instanceof wm1)) {
            if (!z) {
                while (i2 < list.size()) {
                    yuVar.e(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            yuVar.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += yu.a(((Long) list.get(i4)).longValue());
            }
            yuVar.m(i3);
            while (i2 < list.size()) {
                yuVar.d(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        wm1 wm1Var = (wm1) list;
        if (!z) {
            while (i2 < wm1Var.c) {
                wm1Var.c(i2);
                yuVar.e(i, wm1Var.b[i2]);
                i2++;
            }
            return;
        }
        yuVar.g(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < wm1Var.c; i6++) {
            wm1Var.c(i6);
            i5 += yu.a(wm1Var.b[i6]);
        }
        yuVar.m(i5);
        while (i2 < wm1Var.c) {
            wm1Var.c(i2);
            yuVar.d(wm1Var.b[i2]);
            i2++;
        }
    }

    public static int b(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof jb1)) {
            int i2 = 0;
            while (i < size) {
                i2 += yu.a(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        jb1 jb1Var = (jb1) list;
        int i3 = 0;
        while (i < size) {
            jb1Var.d(i);
            i3 += yu.a(jb1Var.b[i]);
            i++;
        }
        return i3;
    }

    public static int f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof wm1)) {
            int i2 = 0;
            while (i < size) {
                i2 += yu.a(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        wm1 wm1Var = (wm1) list;
        int i3 = 0;
        while (i < size) {
            wm1Var.c(i);
            i3 += yu.a(wm1Var.b[i]);
            i++;
        }
        return i3;
    }

    public static void a(String str) {
        IllegalStateException illegalStateException = new IllegalStateException(str);
        ci3 ci3Var = a;
        if (ci3Var != null) {
            ci3Var.a(str, (Throwable) illegalStateException);
        }
    }

    public static ii a(String str, int i, long j) {
        hh3 hh3Var = new hh3(str);
        int i2 = aw.k;
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        return new ii(new ThreadPoolExecutor(i, i, E17093345031926825464.k(j, N13798149404328803870.SECONDS), TimeUnit.SECONDS, new LinkedBlockingQueue(), hh3Var), hh3Var);
    }

    public static void a(String str, Exception exc) {
        M9197813449740923653 m9197813449740923653 = f4a;
        Iterator d = ((E17928301615710791514) m9197813449740923653.b).d(m9197813449740923653, str);
        while (true) {
            Q14045283675743224921 q14045283675743224921 = (Q14045283675743224921) d;
            if (!q14045283675743224921.hasNext()) {
                break;
            }
            Thread.currentThread().getName();
        }
        if (exc != null) {
            Log.getStackTraceString(exc).getClass();
        }
    }

    public static Object a(Object obj, int i, O6641393078261985068 o6641393078261985068, N4718165958758773250 n4718165958758773250, Object obj2) {
        if (n4718165958758773250 == null) {
            return obj2;
        }
        if (o6641393078261985068 != null) {
            int size = o6641393078261985068.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = (Integer) o6641393078261985068.get(i3);
                int intValue = num.intValue();
                if (n4718165958758773250.a(intValue)) {
                    if (i3 != i2) {
                        o6641393078261985068.set(i2, num);
                    }
                    i2++;
                } else {
                    obj2 = a(i, intValue, obj, obj2);
                }
            }
            if (i2 != size) {
                o6641393078261985068.subList(i2, size).clear();
            }
            return obj2;
        }
        Iterator it = o6641393078261985068.iterator();
        while (it.hasNext()) {
            int intValue2 = ((Integer) it.next()).intValue();
            if (!n4718165958758773250.a(intValue2)) {
                obj2 = a(i, intValue2, obj, obj2);
                it.remove();
            }
        }
        return obj2;
    }

    public static int a() {
        if (b == 0 && f3a != null) {
            synchronized (xv.class) {
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
                    } catch (RuntimeException unused) {
                    }
                }
            }
        }
        if (b == 0) {
            return 3;
        }
        return b;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m8a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int e(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof jb1)) {
            int i2 = 0;
            while (i < size) {
                i2 += yu.a(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        jb1 jb1Var = (jb1) list;
        int i3 = 0;
        while (i < size) {
            jb1Var.d(i);
            i3 += yu.a(jb1Var.b[i]);
            i++;
        }
        return i3;
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof jb1)) {
            int i2 = 0;
            while (i < size) {
                i2 += yu.i(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        jb1 jb1Var = (jb1) list;
        int i3 = 0;
        while (i < size) {
            jb1Var.d(i);
            i3 += yu.i(jb1Var.b[i]);
            i++;
        }
        return i3;
    }

    public static int j(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof wm1)) {
            int i2 = 0;
            while (i < size) {
                i2 += yu.a(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        wm1 wm1Var = (wm1) list;
        int i3 = 0;
        while (i < size) {
            wm1Var.c(i);
            i3 += yu.a(wm1Var.b[i]);
            i++;
        }
        return i3;
    }

    public static Object a(int i, int i2, Object obj, Object obj2) {
        if (obj2 == null) {
            obj2 = U11450443558875589191.d(obj);
        }
        ((bm3) obj2).a(i << 3, Long.valueOf(i2));
        return obj2;
    }

    public static void a(int i, List list, w8 w8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yu yuVar = (yu) w8Var.a;
        int i2 = 0;
        if (z) {
            yuVar.g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).getClass();
                i3++;
            }
            yuVar.m(i3);
            while (i2 < list.size()) {
                yuVar.a(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            yuVar.a(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    public static int h(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof wm1)) {
            int i2 = 0;
            while (i < size) {
                i2 += yu.a(yu.b(((Long) list.get(i)).longValue()));
                i++;
            }
            return i2;
        }
        wm1 wm1Var = (wm1) list;
        int i3 = 0;
        while (i < size) {
            wm1Var.c(i);
            i3 += yu.a(yu.b(wm1Var.b[i]));
            i++;
        }
        return i3;
    }

    public static int e(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (yu.h(i) + 8) * size;
    }

    public static void c(String str, Exception exc) {
        str.getClass();
        M9197813449740923653 m9197813449740923653 = f4a;
        Iterator d = ((E17928301615710791514) m9197813449740923653.b).d(m9197813449740923653, str);
        while (true) {
            Q14045283675743224921 q14045283675743224921 = (Q14045283675743224921) d;
            if (!q14045283675743224921.hasNext()) {
                break;
            }
            Thread.currentThread().getName();
        }
        if (exc != null) {
            Log.getStackTraceString(exc).getClass();
        }
    }

    public static int g(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof jb1)) {
            int i2 = 0;
            while (i < size) {
                i2 += yu.i(yu.j(((Integer) list.get(i)).intValue()));
                i++;
            }
            return i2;
        }
        jb1 jb1Var = (jb1) list;
        int i3 = 0;
        while (i < size) {
            jb1Var.d(i);
            i3 += yu.i(yu.j(jb1Var.b[i]));
            i++;
        }
        return i3;
    }
}
