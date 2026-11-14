package dev.epro.r0;

import android.os.Build;
import android.os.LocaleList;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final /* synthetic */ class G16887229053736045178 implements B13729205492206812220 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ S7974369370986781936 b;

    public /* synthetic */ G16887229053736045178(S7974369370986781936 s7974369370986781936, byte b) {
        this.a = b;
        this.b = s7974369370986781936;
    }

    @Override // dev.epro.r0.B13729205492206812220
    public final Object invoke() {
        byte b = this.a;
        int i = 0;
        S7974369370986781936 s7974369370986781936 = this.b;
        switch (b) {
            case 0:
                M17822984967589214345 m17822984967589214345 = s7974369370986781936.N;
                if (m17822984967589214345 != null) {
                    int childCount = m17822984967589214345.getChildCount();
                    while (i < childCount) {
                        View childAt = m17822984967589214345.getChildAt(i);
                        N5230833122018532994 n5230833122018532994 = childAt instanceof N5230833122018532994 ? (N5230833122018532994) childAt : null;
                        if (n5230833122018532994 != null && n5230833122018532994.isLayoutRequested()) {
                            n5230833122018532994.layout(n5230833122018532994.getLeft(), n5230833122018532994.getTop(), n5230833122018532994.getRight(), n5230833122018532994.getBottom());
                        }
                        i++;
                    }
                }
                return O9245300239821758723.a;
            case 1:
                if (Build.VERSION.SDK_INT > 28 && s7974369370986781936.isAttachedToWindow()) {
                    if (S7974369370986781936.M0 == null) {
                        Z3874088516406380299 z3874088516406380299 = new Z3874088516406380299((byte) 1);
                        S7974369370986781936.M0 = z3874088516406380299;
                        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                        try {
                            if (S7974369370986781936.I0 == null) {
                                S7974369370986781936.I0 = Class.forName("android.os.SystemProperties");
                            }
                            Method method = S7974369370986781936.K0;
                            if (method == null) {
                                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                                Class cls = S7974369370986781936.I0;
                                method = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                                S7974369370986781936.K0 = method;
                            }
                            if (method != null) {
                                method.invoke(null, z3874088516406380299);
                            }
                        } catch (Throwable unused) {
                        }
                        StrictMode.setVmPolicy(vmPolicy);
                    }
                    U9803441765912152712 u9803441765912152712 = S7974369370986781936.L0;
                    synchronized (u9803441765912152712) {
                        u9803441765912152712.a(s7974369370986781936);
                    }
                }
                return O9245300239821758723.a;
            case 2:
                Boolean bool = (Boolean) s7974369370986781936.p.getValue();
                bool.getClass();
                return bool;
            case 3:
                LocaleList locales = s7974369370986781936.getConfiguration().getLocales();
                J10695037395247619504 j10695037395247619504 = new J10695037395247619504(new Z13811601408893342202(locales));
                if (locales.isEmpty()) {
                    j10695037395247619504 = new J10695037395247619504(new Z13811601408893342202(LocaleList.getDefault()));
                }
                int size = j10695037395247619504.a.a.size();
                ArrayList arrayList = new ArrayList(size);
                while (i < size) {
                    Locale b2 = j10695037395247619504.b(i);
                    b2.getClass();
                    arrayList.add(new L6737218101458117862(b2));
                    i++;
                }
                return new A5535629440393075509(arrayList);
            default:
                MotionEvent motionEvent = s7974369370986781936.n0;
                if (motionEvent != null) {
                    boolean contains = K5751602218013079365.V(9, 7, 8).contains(Integer.valueOf(motionEvent.getActionMasked()));
                    MotionEvent motionEvent2 = s7974369370986781936.n0;
                    if (motionEvent2 != null && motionEvent2.getButtonState() == 0) {
                        i = 1;
                    }
                    if (contains && i != 0) {
                        s7974369370986781936.o0 = SystemClock.uptimeMillis();
                        s7974369370986781936.post(s7974369370986781936.v0);
                    }
                }
                s7974369370986781936.B0.invoke();
                return O9245300239821758723.a;
        }
    }
}
