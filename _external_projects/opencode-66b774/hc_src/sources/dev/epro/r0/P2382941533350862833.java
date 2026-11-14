package dev.epro.r0;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Display;
import android.view.DisplayCutout;
import androidx.work.WorkerParameters;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class P2382941533350862833 implements I13705844976240322740, R12081023847482212386, J4138103533341651975, E12579343433108873398 {
    public static P2382941533350862833 b;
    public final /* synthetic */ byte a;
    public static final P2382941533350862833 c = new P2382941533350862833(1);
    public static final P2382941533350862833 d = new P2382941533350862833(2);
    public static final /* synthetic */ P2382941533350862833 e = new P2382941533350862833(3);
    public static final O4934609777781722916 f = new O4934609777781722916((byte) 5);
    public static final X4712621039624176170 g = new X4712621039624176170((byte) 20);
    public static final X4712621039624176170 h = new X4712621039624176170((byte) 21);
    public static final X4712621039624176170 i = new X4712621039624176170((byte) 22);
    public static final X4712621039624176170 j = new X4712621039624176170((byte) 23);
    public static final F17594658268783405200 k = new F17594658268783405200((byte) 21);
    public static final P2382941533350862833 l = new P2382941533350862833(4);
    public static final P2382941533350862833 m = new P2382941533350862833(5);
    public static final P2382941533350862833 n = new P2382941533350862833(6);

    /* renamed from: o, reason: collision with root package name */
    public static final S6349823729575121924 f428o = new S6349823729575121924(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
    public static final /* synthetic */ P2382941533350862833 p = new P2382941533350862833(8);
    public static final P2382941533350862833 q = new P2382941533350862833(9);
    public static final P2382941533350862833 r = new P2382941533350862833(10);
    public static final P2382941533350862833 s = new P2382941533350862833(11);
    public static final P2382941533350862833 t = new P2382941533350862833(12);
    public static final P2382941533350862833 u = new P2382941533350862833(13);
    public static final P2382941533350862833 v = new P2382941533350862833(14);
    public static final K2042933864045806308 w = new K2042933864045806308(26);
    public static final K2042933864045806308 x = new K2042933864045806308(27);
    public static final Z3383101362411723454 y = new Z3383101362411723454(1);
    public static final P2382941533350862833 z = new P2382941533350862833(17);
    public static final P2382941533350862833 A = new P2382941533350862833(18);
    public static final P2382941533350862833 B = new P2382941533350862833(19);
    public static final P2382941533350862833 C = new P2382941533350862833(20);
    public static final P2382941533350862833 D = new P2382941533350862833(21);
    public static final P2382941533350862833 E = new P2382941533350862833(22);
    public static final P2382941533350862833 F = new P2382941533350862833(23);
    public static final P2382941533350862833 G = new P2382941533350862833(24);
    public static final P2382941533350862833 H = new P2382941533350862833(25);
    public static final P2382941533350862833 I = new P2382941533350862833(26);
    public static final P2382941533350862833 J = new P2382941533350862833(27);
    public static final P2382941533350862833 K = new P2382941533350862833(28);
    public static final P2382941533350862833 L = new P2382941533350862833(29);

    public /* synthetic */ P2382941533350862833(byte b2) {
        this.a = b2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f7, code lost:
    
        r6 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean f(android.content.pm.PackageInfo r13) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.P2382941533350862833.f(android.content.pm.PackageInfo):boolean");
    }

    public static X11923164775252425411 g(PackageInfo packageInfo, X11923164775252425411... x11923164775252425411Arr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        A17967766361996370775 a17967766361996370775 = new A17967766361996370775(packageInfo.signatures[0].toByteArray());
        for (int i2 = 0; i2 < x11923164775252425411Arr.length; i2++) {
            if (x11923164775252425411Arr[i2].equals(a17967766361996370775)) {
                return x11923164775252425411Arr[i2];
            }
        }
        return null;
    }

    @Override // dev.epro.r0.E12579343433108873398
    public int a(int i2, int i3, int i4, int i5) {
        return 0;
    }

    @Override // dev.epro.r0.J4138103533341651975
    public long b(R3610722646682213723 r3610722646682213723, int i2) {
        return r3610722646682213723.f.k(i2);
    }

    public void c(Drawable drawable, M3727281027331139839 m3727281027331139839, int i2) {
        m3727281027331139839.b0(257732500);
        int i3 = (m3727281027331139839.h(drawable) ? 4 : 2) | i2;
        if (m3727281027331139839.R(i3 & 1, (i3 & 3) != 2)) {
            I1722681268793429505 k2 = V16747615581620678882.k(V10993962107938880611.a, B9885277060684763358.e);
            boolean h2 = m3727281027331139839.h(drawable);
            Object M = m3727281027331139839.M();
            if (h2 || M == O9023047933786425027.a) {
                M = new K13841493441907392258((Object) drawable, (byte) 14);
                m3727281027331139839.k0(M);
            }
            Z6714950837425363575.a(Z1953481206310471956.E(k2, (F4096073349764486348) M), m3727281027331139839, 0);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 t2 = m3727281027331139839.t();
        if (t2 != null) {
            t2.d = new I17176798189566499417(this, drawable, i2, (byte) 18);
        }
    }

    @Override // dev.epro.r0.I13705844976240322740
    public Rect d(Activity activity) {
        int safeInsetLeft;
        int safeInsetRight;
        int safeInsetTop;
        int safeInsetBottom;
        int safeInsetBottom2;
        int safeInsetRight2;
        N5158094851646208854 n5158094851646208854 = I13705844976240322740.No;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        DisplayCutout displayCutout = null;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                invoke.getClass();
                rect.set((Rect) invoke);
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                invoke2.getClass();
                rect.set((Rect) invoke2);
            }
        } catch (Exception e2) {
            if (!(e2 instanceof NoSuchFieldException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException)) {
                throw e2;
            }
            n5158094851646208854.getClass();
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i2 = rect.bottom + dimensionPixelSize;
            if (i2 == point.y) {
                rect.bottom = i2;
            } else {
                int i3 = rect.right + dimensionPixelSize;
                if (i3 == point.x) {
                    rect.right = i3;
                } else if (rect.left == dimensionPixelSize) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
            try {
                Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                constructor.setAccessible(true);
                Object newInstance = constructor.newInstance(null);
                Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(defaultDisplay, newInstance);
                Field declaredField2 = newInstance.getClass().getDeclaredField("displayCutout");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(newInstance);
                if (V5057341886547923963.s(obj2)) {
                    displayCutout = V5057341886547923963.f(obj2);
                }
            } catch (Exception e3) {
                if (!(e3 instanceof ClassNotFoundException) && !(e3 instanceof NoSuchMethodException) && !(e3 instanceof NoSuchFieldException) && !(e3 instanceof IllegalAccessException) && !(e3 instanceof InvocationTargetException) && !(e3 instanceof InstantiationException)) {
                    throw e3;
                }
                n5158094851646208854.getClass();
            }
            if (displayCutout != null) {
                int i4 = rect.left;
                safeInsetLeft = displayCutout.getSafeInsetLeft();
                if (i4 == safeInsetLeft) {
                    rect.left = 0;
                }
                int i5 = point.x - rect.right;
                safeInsetRight = displayCutout.getSafeInsetRight();
                if (i5 == safeInsetRight) {
                    int i6 = rect.right;
                    safeInsetRight2 = displayCutout.getSafeInsetRight();
                    rect.right = safeInsetRight2 + i6;
                }
                int i7 = rect.top;
                safeInsetTop = displayCutout.getSafeInsetTop();
                if (i7 == safeInsetTop) {
                    rect.top = 0;
                }
                int i8 = point.y - rect.bottom;
                safeInsetBottom = displayCutout.getSafeInsetBottom();
                if (i8 == safeInsetBottom) {
                    int i9 = rect.bottom;
                    safeInsetBottom2 = displayCutout.getSafeInsetBottom();
                    rect.bottom = safeInsetBottom2 + i9;
                }
            }
        }
        return rect;
    }

    public P14960607863193493823 e(Context context, String str, WorkerParameters workerParameters) {
        str.getClass();
        workerParameters.getClass();
        try {
            Class<? extends U> asSubclass = Class.forName(str).asSubclass(P14960607863193493823.class);
            asSubclass.getClass();
            try {
                Object newInstance = asSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                newInstance.getClass();
                P14960607863193493823 p14960607863193493823 = (P14960607863193493823) newInstance;
                if (!p14960607863193493823.d) {
                    return p14960607863193493823;
                }
                throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
            } finally {
            }
        } finally {
        }
    }

    public String toString() {
        switch (this.a) {
            case 6:
                return "{}";
            case 13:
                return "Start";
            default:
                return super.toString();
        }
    }
}
