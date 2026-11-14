package dev.epro.r0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class T1225794268786662319 {
    public static final B1412794554478658227 a = new B1412794554478658227(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final W929662112881511578 d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new F13067510361649884247((byte) 1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new W929662112881511578(0);
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((O5645052741531709506) list.get(i2)).g);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static T9198164096090695723 b(String str, Context context, List list, int i) {
        int i2;
        Typeface typefaceI;
        B1412794554478658227 b1412794554478658227 = a;
        Trace.beginSection(U8836654130139556418.B("getFontSync"));
        try {
            Typeface typeface = (Typeface) b1412794554478658227.c(str);
            if (typeface != null) {
                return new T9198164096090695723(typeface);
            }
            Q6203700555324584864 q6203700555324584864A = W11651948933197276719.a(context, list);
            List list2 = (List) q6203700555324584864A.b;
            boolean z = q6203700555324584864A.a;
            if (z) {
                i2 = !z ? -3 : -2;
            } else {
                J18236984568855953541[] j18236984568855953541Arr = (J18236984568855953541[]) list2.get(0);
                if (j18236984568855953541Arr == null || j18236984568855953541Arr.length == 0) {
                    i2 = 1;
                } else {
                    int length = j18236984568855953541Arr.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            i2 = 0;
                            break;
                        }
                        int i4 = j18236984568855953541Arr[i3].f;
                        if (i4 == 0) {
                            i3++;
                        } else if (i4 >= 0) {
                            i2 = i4;
                        }
                    }
                }
            }
            if (i2 != 0) {
                return new T9198164096090695723(i2);
            }
            if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                J18236984568855953541[] j18236984568855953541Arr2 = (J18236984568855953541[]) list2.get(0);
                Z14316276734425062790 z14316276734425062790 = K4066258037408482587.a;
                Trace.beginSection(U8836654130139556418.B("TypefaceCompat.createFromFontInfo"));
                typefaceI = K4066258037408482587.a.i(context, j18236984568855953541Arr2, i);
                Trace.endSection();
            } else {
                Z14316276734425062790 z143162767344250627902 = K4066258037408482587.a;
                Trace.beginSection(U8836654130139556418.B("TypefaceCompat.createFromFontInfoWithFallback"));
                typefaceI = K4066258037408482587.a.j(context, list2, i);
                Trace.endSection();
            }
            if (typefaceI == null) {
                return new T9198164096090695723(-3);
            }
            b1412794554478658227.d(str, typefaceI);
            return new T9198164096090695723(typefaceI);
        } catch (PackageManager.NameNotFoundException unused) {
            return new T9198164096090695723(-1);
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }
}
