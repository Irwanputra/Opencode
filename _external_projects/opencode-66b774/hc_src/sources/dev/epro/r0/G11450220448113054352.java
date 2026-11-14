package dev.epro.r0;

import android.content.Context;
import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class G11450220448113054352 {
    public static int a(Boolean bool) {
        if (bool == null) {
            return 1;
        }
        return bool.booleanValue() ? 2 : 3;
    }

    public static /* synthetic */ byte b(int i) {
        if (i == 1) {
            return (byte) 0;
        }
        if (i == 2) {
            return (byte) 1;
        }
        if (i == 3) {
            return (byte) 2;
        }
        throw null;
    }

    public static int c(S16571168858015125610 s16571168858015125610, int i, int i2) {
        return (s16571168858015125610.hashCode() + i) * i2;
    }

    public static V14323974914327418545 d(float f, float f2) {
        V14323974914327418545 v14323974914327418545 = new V14323974914327418545((byte) 3);
        v14323974914327418545.j(f, f2);
        return v14323974914327418545;
    }

    public static M8821877208104636290 e(int i, M3727281027331139839 m3727281027331139839, boolean z) {
        m3727281027331139839.a0(i);
        m3727281027331139839.q(z);
        return new M8821877208104636290();
    }

    public static M8821877208104636290 f(String str) {
        Y16081827717826519461.b(str);
        return new M8821877208104636290();
    }

    public static A2789795882633926065 g(N11611180034702960692 n11611180034702960692, N11611180034702960692 n116111800347029606922) {
        P9515452679798920290 b = V3311072669930093336.b();
        n11611180034702960692.getClass();
        return O8620973563946607355.a(S10823041268949770285.O(n116111800347029606922, b));
    }

    public static String h(int i, int i2, String str, String str2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static String i(M3727281027331139839 m3727281027331139839, int i, int i2, M3727281027331139839 m37272810273311398392, boolean z) {
        m3727281027331139839.a0(i);
        String q = T1335862270807194835.q(i2, m37272810273311398392);
        m3727281027331139839.q(z);
        return q;
    }

    public static String j(Locale locale, String str, Locale locale2) {
        locale.getClass();
        String lowerCase = str.toLowerCase(locale2);
        lowerCase.getClass();
        return lowerCase;
    }

    public static StringBuilder k(String str, float f, String str2, float f2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(f);
        sb.append(str2);
        sb.append(f2);
        sb.append(str3);
        return sb;
    }

    public static void l(int i, int i2, int i3, int i4, int i5) {
        S10823041268949770285.h(i);
        S10823041268949770285.h(i2);
        S10823041268949770285.h(i3);
        S10823041268949770285.h(i4);
        S10823041268949770285.h(i5);
    }

    public static void m(int i, T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, boolean z) {
        t15443218846549482730.invoke(m3727281027331139839, Integer.valueOf(i));
        m3727281027331139839.q(z);
    }

    public static void n(Context context, int i, Object[] objArr, G9506192477171422664 g9506192477171422664) {
        String string = context.getString(i, objArr);
        string.getClass();
        g9506192477171422664.add(string);
    }

    public static void o(V14323974914327418545 v14323974914327418545, float f, float f2, float f3) {
        v14323974914327418545.h(f, f2);
        v14323974914327418545.s(f3);
        v14323974914327418545.c();
    }

    public static void p(V14323974914327418545 v14323974914327418545, float f, float f2, float f3, float f4) {
        v14323974914327418545.h(f, f2);
        v14323974914327418545.h(f3, f4);
        v14323974914327418545.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void q(R1119249027005566153 r1119249027005566153) {
        boolean isTerminated;
        if (r1119249027005566153 instanceof AutoCloseable) {
            r1119249027005566153.close();
            return;
        }
        if (!(r1119249027005566153 instanceof ExecutorService)) {
            K2042933864045806308.h();
            return;
        }
        ExecutorService executorService = (ExecutorService) r1119249027005566153;
        if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ void r(Object obj) {
        boolean isTerminated;
        if (obj instanceof AutoCloseable) {
            ((AutoCloseable) obj).close();
            return;
        }
        if (!(obj instanceof ExecutorService)) {
            if (obj instanceof TypedArray) {
                ((TypedArray) obj).recycle();
                return;
            }
            if (obj instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) obj).release();
                return;
            } else if (obj instanceof MediaDrm) {
                ((MediaDrm) obj).release();
                return;
            } else {
                K2042933864045806308.h();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) obj;
        if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static void s(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
    }

    public static void t(boolean z, N9422779686621825495 n9422779686621825495, Map map, String str) {
        String valueOf = String.valueOf(z);
        n9422779686621825495.getClass();
        map.put(str, N9422779686621825495.f(valueOf));
    }

    public static void u(V14323974914327418545 v14323974914327418545, float f, float f2, float f3, float f4) {
        v14323974914327418545.j(f, f2);
        v14323974914327418545.g(f3);
        v14323974914327418545.s(f4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void v(R1119249027005566153 r1119249027005566153) {
        boolean isTerminated;
        if (r1119249027005566153 instanceof AutoCloseable) {
            r1119249027005566153.close();
            return;
        }
        if (!(r1119249027005566153 instanceof ExecutorService)) {
            K2042933864045806308.h();
            return;
        }
        ExecutorService executorService = (ExecutorService) r1119249027005566153;
        if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static void w(V14323974914327418545 v14323974914327418545, float f, float f2, float f3, float f4) {
        v14323974914327418545.c();
        v14323974914327418545.j(f, f2);
        v14323974914327418545.h(f3, f4);
    }

    public static /* synthetic */ String x(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String y(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "PRECISE" : "PUBLISHER_PROVIDED" : "ESTIMATED" : "UNKNOWN";
    }
}
