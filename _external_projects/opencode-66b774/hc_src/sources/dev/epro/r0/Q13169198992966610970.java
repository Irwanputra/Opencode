package dev.epro.r0;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Process;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.zetetic.database.R;
import o.bwmna.gdrqkg.izmyclvb;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public abstract class Q13169198992966610970 {
    public static final R17432272336056160915 a;
    public static final T15443218846549482730 b;
    public static final N9612381160928060518 c;
    public static M9197813449740923653 d;
    public static String e;
    public static final Object f;
    public static final Q7316561721656982910 g;
    public static Q7316561721656982910 h;
    public static final int[] i;
    public static final int[] j;
    public static final Z14997871575210439922 k;

    public static final native void A(F16705069398168805061 f16705069398168805061, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i2);

    public static final void B(B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839) {
        Z17561488864728364842 z17561488864728364842 = m3727281027331139839.M.b.a;
        z17561488864728364842.e0(K8158766997635849744.c);
        Z860808776098365610.M(z17561488864728364842, 0, b13729205492206812220);
    }

    public static final native void C(J15344204527961023255 j15344204527961023255, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void D(String str, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void E(boolean z, String str, B13729205492206812220 b13729205492206812220, F4096073349764486348 f4096073349764486348, B13729205492206812220 b137292054922068122202, boolean z2, String str2, B13729205492206812220 b137292054922068122203, F4096073349764486348 f40960733497644863482, boolean z3, String str3, B13729205492206812220 b137292054922068122204, F4096073349764486348 f40960733497644863483, boolean z4, String str4, B13729205492206812220 b137292054922068122205, F4096073349764486348 f40960733497644863484, boolean z5, String str5, B13729205492206812220 b137292054922068122206, F4096073349764486348 f40960733497644863485, B13729205492206812220 b137292054922068122207, M3727281027331139839 m3727281027331139839, int i2, int i3, int i4);

    public static final native void F(boolean z, String str, String str2, String str3, F4096073349764486348 f4096073349764486348, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, B13729205492206812220 b137292054922068122203, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void G(boolean z, List list, int i2, B13729205492206812220 b13729205492206812220, F4096073349764486348 f4096073349764486348, boolean z2, String str, B13729205492206812220 b137292054922068122202, F4096073349764486348 f40960733497644863482, B13729205492206812220 b137292054922068122203, boolean z3, String str2, B13729205492206812220 b137292054922068122204, F4096073349764486348 f40960733497644863483, boolean z4, String str3, B13729205492206812220 b137292054922068122205, F4096073349764486348 f40960733497644863484, boolean z5, String str4, B13729205492206812220 b137292054922068122206, F4096073349764486348 f40960733497644863485, boolean z6, String str5, B13729205492206812220 b137292054922068122207, F4096073349764486348 f40960733497644863486, B13729205492206812220 b137292054922068122208, M3727281027331139839 m3727281027331139839, int i3, int i4, int i5);

    public static final native void H(String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, String str3, boolean z5, String str4, String str5, String str6, B13729205492206812220 b13729205492206812220, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, F4096073349764486348 f40960733497644863483, F4096073349764486348 f40960733497644863484, B13729205492206812220 b137292054922068122202, B13729205492206812220 b137292054922068122203, F4096073349764486348 f40960733497644863485, B13729205492206812220 b137292054922068122204, B13729205492206812220 b137292054922068122205, B13729205492206812220 b137292054922068122206, B13729205492206812220 b137292054922068122207, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i2, int i3, int i4);

    public static final native void I(String str, String str2, boolean z, F4096073349764486348 f4096073349764486348, boolean z2, M3727281027331139839 m3727281027331139839, int i2, int i3);

    public static final native void J(String str, String str2, String str3, B13729205492206812220 b13729205492206812220, F4096073349764486348 f4096073349764486348, B13729205492206812220 b137292054922068122202, boolean z, M3727281027331139839 m3727281027331139839, int i2, int i3);

    public static final float K(T1241271073913685060 t1241271073913685060, F10342546226345611902 f10342546226345611902) {
        return f10342546226345611902 == F10342546226345611902.a ? t1241271073913685060.c(f10342546226345611902) : t1241271073913685060.d(f10342546226345611902);
    }

    public static final float L(T1241271073913685060 t1241271073913685060, F10342546226345611902 f10342546226345611902) {
        return f10342546226345611902 == F10342546226345611902.a ? t1241271073913685060.d(f10342546226345611902) : t1241271073913685060.c(f10342546226345611902);
    }

    public static void M(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Q9005017131391967988.q, i2, i3);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                O(context, j, "Theme.MaterialComponents");
            }
        }
        O(context, i, "Theme.AppCompat");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0.getResourceId(0, -1) != (-1)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void N(android.content.Context r5, android.util.AttributeSet r6, int[] r7, int r8, int r9, int... r10) {
        /*
            int[] r0 = dev.epro.r0.Q9005017131391967988.q
            android.content.res.TypedArray r0 = r5.obtainStyledAttributes(r6, r0, r8, r9)
            r1 = 2
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L12
            r0.recycle()
            return
        L12:
            int r1 = r10.length
            r3 = 1
            r4 = -1
            if (r1 != 0) goto L1f
            int r5 = r0.getResourceId(r2, r4)
            if (r5 == r4) goto L3a
        L1d:
            r2 = r3
            goto L3a
        L1f:
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r7, r8, r9)
            int r6 = r10.length
            r7 = r2
        L25:
            if (r7 >= r6) goto L36
            r8 = r10[r7]
            int r8 = r5.getResourceId(r8, r4)
            if (r8 != r4) goto L33
            r5.recycle()
            goto L3a
        L33:
            int r7 = r7 + 1
            goto L25
        L36:
            r5.recycle()
            goto L1d
        L3a:
            r0.recycle()
            if (r2 == 0) goto L40
            return
        L40:
            java.lang.String r5 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            dev.epro.r0.S10973172697741180971.j(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Q13169198992966610970.N(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    public static void O(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (!obtainStyledAttributes.hasValue(i2)) {
                obtainStyledAttributes.recycle();
                S10973172697741180971.j(G6547577305291411977.s("The style on this component requires your app theme to be ", str, " (or a descendant)."));
                return;
            }
        }
        obtainStyledAttributes.recycle();
    }

    public static final native int P(O3963944098342584804 o3963944098342584804);

    public static final native int Q(Exception exc);

    public static final W5797197595347441198 R(M3727281027331139839 m3727281027331139839) {
        return new J7267075846786943343(m3727281027331139839.R);
    }

    public static final R11406268294969300236 S(Context context) {
        context.getClass();
        R11406268294969300236 r11406268294969300236 = new R11406268294969300236(context);
        L841391951668269384 l841391951668269384 = r11406268294969300236.b;
        G1840519957725232630 g1840519957725232630 = l841391951668269384.s;
        g1840519957725232630.a(new C11885081443955050043(g1840519957725232630));
        G1840519957725232630 g18405199577252326302 = l841391951668269384.s;
        g18405199577252326302.a(new E405169748098369564());
        g18405199577252326302.a(new S11892176994350381461());
        return r11406268294969300236;
    }

    public static final P9699383776227634085 T(String str) {
        Pattern compile = Pattern.compile("[^dMy/\\-.]");
        compile.getClass();
        str.getClass();
        String replaceAll = compile.matcher(str).replaceAll("");
        replaceAll.getClass();
        Pattern compile2 = Pattern.compile("d{1,2}");
        compile2.getClass();
        String replaceAll2 = compile2.matcher(replaceAll).replaceAll("dd");
        replaceAll2.getClass();
        Pattern compile3 = Pattern.compile("M{1,2}");
        compile3.getClass();
        String replaceAll3 = compile3.matcher(replaceAll2).replaceAll("MM");
        replaceAll3.getClass();
        Pattern compile4 = Pattern.compile("y{1,4}");
        compile4.getClass();
        String replaceAll4 = compile4.matcher(replaceAll3).replaceAll("yyyy");
        replaceAll4.getClass();
        String j0 = M8927913404651150384.j0(Z13168519540281190457.D(false, replaceAll4, "My", "M/y"), ".");
        Pattern compile5 = Pattern.compile("[/\\-.]");
        compile5.getClass();
        Matcher matcher = compile5.matcher(j0);
        matcher.getClass();
        U12307647644992999381 l = U8836654130139556418.l(matcher, 0, j0);
        l.getClass();
        X13869420807587484607 b2 = l.c.b(0);
        b2.getClass();
        return new P9699383776227634085(j0, b2.a.charAt(0));
    }

    public static final int U(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public static final Object V(Context context, Class cls) {
        Application application;
        Context applicationContext = context.getApplicationContext();
        if (!(applicationContext instanceof Application)) {
            Context context2 = applicationContext;
            while (context2 instanceof ContextWrapper) {
                context2 = ((ContextWrapper) context2).getBaseContext();
                if (context2 instanceof Application) {
                    application = (Application) context2;
                }
            }
            Q11088980322693754445.m("Could not find an Application in the given context: ", applicationContext);
            return null;
        }
        application = (Application) applicationContext;
        return S10823041268949770285.J(application, cls);
    }

    public static M9197813449740923653 X(Context context, String str, boolean z) {
        synchronized (f) {
            try {
                String str2 = e;
                if (str2 != null && !str.equals(str2)) {
                    throw new IllegalStateException("getHttpFlags() called multiple times with different versions");
                }
                M9197813449740923653 m9197813449740923653 = d;
                if (m9197813449740923653 != null) {
                    return m9197813449740923653;
                }
                e = str;
                U1748733558996603759.b("HttpFlagsLoader#getHttpFlags loading flags");
                try {
                    X2572926153895124306 b0 = !M18113111391818111737.F(context).getBoolean("android.net.http.ReadHttpFlags", true) ? null : b0(context);
                    if (b0 == null) {
                        K17275736824900228431 a2 = ((D5130720463069386173) ((X17832762133164229673) X2572926153895124306.f.a(5))).a();
                        a2.getClass();
                        if (!K17275736824900228431.d(a2, true)) {
                            throw new K2053872328549434758();
                        }
                        b0 = (X2572926153895124306) a2;
                    }
                    context.getPackageName();
                    M9197813449740923653 m = M9197813449740923653.m(b0, str, z);
                    d = m;
                    if (Collections.unmodifiableMap((HashMap) m.b).get("Cronet_log_me") != null) {
                        throw new ClassCastException();
                    }
                    M9197813449740923653 m91978134497409236532 = d;
                    Trace.endSection();
                    return m91978134497409236532;
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final int Y(KeyEvent keyEvent) {
        return (keyEvent.isAltPressed() ? 1 : 0) | (keyEvent.isCtrlPressed() ? 2 : 0) | (keyEvent.isMetaPressed() ? 4 : 0) | (keyEvent.isShiftPressed() ? 8 : 0);
    }

    public static final native Object Z(Throwable th);

    public static final native void a(String str, long j2, M3727281027331139839 m3727281027331139839, int i2);

    public static final void a0(E3889562084885881810 e3889562084885881810, H11725168162114556860 h11725168162114556860) {
        long O = ((I16141028645763443416) h11725168162114556860.F.d).O(0L);
        int round = Math.round(Float.intBitsToFloat((int) (O >> 32)));
        int round2 = Math.round(Float.intBitsToFloat((int) (O & 4294967295L)));
        e3889562084885881810.layout(round, round2, e3889562084885881810.getMeasuredWidth() + round, e3889562084885881810.getMeasuredHeight() + round2);
    }

    public static final native void b(B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i2);

    public static X2572926153895124306 b0(Context context) {
        ApplicationInfo applicationInfo;
        try {
            U1748733558996603759.b("HttpFlagsLoader#getProviderApplicationInfo");
            try {
                ResolveInfo resolveService = context.getPackageManager().resolveService(new Intent("android.net.http.FLAGS_FILE_PROVIDER"), 1048576);
                if (resolveService == null) {
                    Trace.endSection();
                    applicationInfo = null;
                } else {
                    applicationInfo = resolveService.serviceInfo.applicationInfo;
                    Trace.endSection();
                }
                if (applicationInfo != null) {
                    File file = new File(new File(new File(applicationInfo.deviceProtectedDataDir), "app_httpflags"), "flags.binarypb");
                    file.getAbsolutePath();
                    X2572926153895124306 c0 = c0(file);
                    if (c0 != null) {
                        c0.toString();
                        return c0;
                    }
                }
            } finally {
            }
        } catch (RuntimeException unused) {
        }
        return null;
    }

    public static final void c(Object obj, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839) {
        boolean f2 = m3727281027331139839.f(obj);
        Object M = m3727281027331139839.M();
        if (f2 || M == O9023047933786425027.a) {
            M = new I8347111651163613119(f4096073349764486348);
            m3727281027331139839.k0(M);
        }
    }

    public static X2572926153895124306 c0(File file) {
        U1748733558996603759.b("HttpFlagsLoader#loadFlagsFile");
        try {
            try {
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        X2572926153895124306 g2 = X2572926153895124306.g(fileInputStream);
                        fileInputStream.close();
                        Trace.endSection();
                        return g2;
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (FileNotFoundException unused) {
                file.getPath();
                Trace.endSection();
                return null;
            }
        } catch (IOException e2) {
            throw new RuntimeException("Unable to read HTTP flags file", e2);
        }
    }

    public static final void d(Object obj, Object obj2, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839) {
        boolean f2 = m3727281027331139839.f(obj) | m3727281027331139839.f(obj2);
        Object M = m3727281027331139839.M();
        if (f2 || M == O9023047933786425027.a) {
            M = new I8347111651163613119(f4096073349764486348);
            m3727281027331139839.k0(M);
        }
    }

    public static final R3229391822211813842 d0(J12043550928838212009 j12043550928838212009, L12639328004344855510 l12639328004344855510) {
        return new R3229391822211813842(j12043550928838212009, l12639328004344855510, (byte) 2);
    }

    public static final void e(Object[] objArr, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        boolean d2 = m3727281027331139839.d(copyOf.length);
        for (Object obj : copyOf) {
            d2 |= m3727281027331139839.f(obj);
        }
        Object M = m3727281027331139839.M();
        if (d2 || M == O9023047933786425027.a) {
            m3727281027331139839.k0(new I8347111651163613119(f4096073349764486348));
        }
    }

    public static final I1722681268793429505 e0(I1722681268793429505 i1722681268793429505, T1241271073913685060 t1241271073913685060) {
        return i1722681268793429505.Q0(new F4745638527783833984(t1241271073913685060));
    }

    public static final native void f(Z7022156542152740569 z7022156542152740569, Z7022156542152740569 z70221565421527405692, boolean z, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i2);

    public static final I1722681268793429505 f0(I1722681268793429505 i1722681268793429505, float f2) {
        return i1722681268793429505.Q0(new R3885319007288790589(f2, f2, f2, f2));
    }

    public static final native void g(long j2, M3727281027331139839 m3727281027331139839, int i2);

    public static final I1722681268793429505 g0(I1722681268793429505 i1722681268793429505, float f2, float f3) {
        return i1722681268793429505.Q0(new R3885319007288790589(f2, f3, f2, f3));
    }

    public static final native void h(int i2, M3727281027331139839 m3727281027331139839, boolean z);

    public static I1722681268793429505 h0(I1722681268793429505 i1722681268793429505, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return g0(i1722681268793429505, f2, f3);
    }

    public static final native void i(B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i2);

    public static final I1722681268793429505 i0(I1722681268793429505 i1722681268793429505, float f2, float f3, float f4, float f5) {
        return i1722681268793429505.Q0(new R3885319007288790589(f2, f3, f4, f5));
    }

    public static final native void j(List list, M3727281027331139839 m3727281027331139839, int i2);

    public static I1722681268793429505 j0(I1722681268793429505 i1722681268793429505, float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        return i0(i1722681268793429505, f2, f3, f4, f5);
    }

    public static final native void k(List list, H12676546736423743030 h12676546736423743030, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, int i2);

    public static final L1256556220631237103 k0(int i2, M3727281027331139839 m3727281027331139839) {
        TypedValue typedValue;
        Context context = (Context) m3727281027331139839.j(T15795698139970521497.b);
        Resources resources = (Resources) m3727281027331139839.j(T15795698139970521497.c);
        Y1947707678054676053 y1947707678054676053 = (Y1947707678054676053) m3727281027331139839.j(T15795698139970521497.e);
        synchronized (y1947707678054676053) {
            typedValue = (TypedValue) y1947707678054676053.a.b(i2);
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i2, typedValue, true);
                Q9908018528090167751 q9908018528090167751 = y1947707678054676053.a;
                int d2 = q9908018528090167751.d(i2);
                Object[] objArr = q9908018528090167751.c;
                Object obj = objArr[d2];
                q9908018528090167751.b[d2] = i2;
                objArr[d2] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || !M8927913404651150384.P(charSequence, ".xml")) {
            m3727281027331139839.a0(-1771643000);
            boolean f2 = m3727281027331139839.f(context.getTheme()) | m3727281027331139839.f(charSequence) | m3727281027331139839.d(i2);
            Object M = m3727281027331139839.M();
            if (f2 || M == O9023047933786425027.a) {
                try {
                    Drawable drawable = resources.getDrawable(i2, null);
                    drawable.getClass();
                    M = new F2238012860950049442(((BitmapDrawable) drawable).getBitmap());
                    m3727281027331139839.k0(M);
                } catch (Exception e2) {
                    throw new M8821877208104636290("Error attempting to load resource: " + ((Object) charSequence), e2);
                }
            }
            E1681831271425360860 e1681831271425360860 = new E1681831271425360860((F2238012860950049442) M, (r3.a.getHeight() & 4294967295L) | (r3.a.getWidth() << 32));
            m3727281027331139839.q(false);
            return e1681831271425360860;
        }
        m3727281027331139839.a0(-1771798434);
        Resources.Theme theme = context.getTheme();
        int i3 = typedValue.changingConfigurations;
        U17891631287099220228 u17891631287099220228 = (U17891631287099220228) m3727281027331139839.j(T15795698139970521497.d);
        Z10164087513921968071 z10164087513921968071 = new Z10164087513921968071(theme, i2);
        WeakReference weakReference = (WeakReference) u17891631287099220228.a.get(z10164087513921968071);
        S18102156289003884608 s18102156289003884608 = weakReference != null ? (S18102156289003884608) weakReference.get() : null;
        if (s18102156289003884608 == null) {
            XmlResourceParser xml = resources.getXml(i2);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (!S10823041268949770285.t(xml.getName(), "vector")) {
                S10973172697741180971.j("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                return null;
            }
            s18102156289003884608 = A15222901130456174747.q(theme, resources, xml, i3);
            u17891631287099220228.a.put(z10164087513921968071, new WeakReference(s18102156289003884608));
        }
        S10891339096889981600 i4 = V16504496955554646429.i(s18102156289003884608.a, m3727281027331139839);
        m3727281027331139839.q(false);
        return i4;
    }

    public static final void l(L12639328004344855510 l12639328004344855510, M3727281027331139839 m3727281027331139839, Object obj) {
        G8001132634698687269 g8001132634698687269 = m3727281027331139839.R;
        boolean f2 = m3727281027331139839.f(obj);
        Object M = m3727281027331139839.M();
        if (f2 || M == O9023047933786425027.a) {
            M = new P2812398473959651581(g8001132634698687269, l12639328004344855510);
            m3727281027331139839.k0(M);
        }
    }

    public static final Object l0(Object obj) {
        return obj instanceof T13610764347093379131 ? E17665849472693074628.d(((T13610764347093379131) obj).a) : obj;
    }

    public static final void m(Object obj, Object obj2, L12639328004344855510 l12639328004344855510, M3727281027331139839 m3727281027331139839) {
        G8001132634698687269 g8001132634698687269 = m3727281027331139839.R;
        boolean f2 = m3727281027331139839.f(obj) | m3727281027331139839.f(obj2);
        Object M = m3727281027331139839.M();
        if (f2 || M == O9023047933786425027.a) {
            M = new P2812398473959651581(g8001132634698687269, l12639328004344855510);
            m3727281027331139839.k0(M);
        }
    }

    public static final R11406268294969300236 m0(E4135271276212975889[] e4135271276212975889Arr, M3727281027331139839 m3727281027331139839) {
        final Context context = (Context) m3727281027331139839.j(T15795698139970521497.b);
        Object[] copyOf = Arrays.copyOf(e4135271276212975889Arr, e4135271276212975889Arr.length);
        final byte b2 = 4;
        V10300877997588547986 v10300877997588547986 = new V10300877997588547986((Object) new L2311487989567145532((byte) 21), (Object) new F4096073349764486348(context, b2) { // from class: dev.epro.r0.Z569352264951016144
            public final /* synthetic */ byte a;
            public final /* synthetic */ Context b;

            static {
                izmyclvb.qbtpmwoxbgtw3(35);
            }

            private native void munmbxlmwufp(Context context2, byte b3);

            @Override // dev.epro.r0.F4096073349764486348
            public final native Object invoke(Object obj);

            {
                this.a = b2;
                this.b = context;
                munmbxlmwufp(context, b2);
            }
        }, (byte) 20);
        boolean h2 = m3727281027331139839.h(context);
        Object M = m3727281027331139839.M();
        if (h2 || M == O9023047933786425027.a) {
            M = new E16494084322564567437(context, (byte) 6);
            m3727281027331139839.k0(M);
        }
        R11406268294969300236 r11406268294969300236 = (R11406268294969300236) C468629748621011703.m(copyOf, v10300877997588547986, (B13729205492206812220) M, m3727281027331139839, 0);
        for (E4135271276212975889 e4135271276212975889 : e4135271276212975889Arr) {
            r11406268294969300236.b.s.a(e4135271276212975889);
        }
        return r11406268294969300236;
    }

    public static final void n(Object obj, Object obj2, Object obj3, L12639328004344855510 l12639328004344855510, M3727281027331139839 m3727281027331139839) {
        G8001132634698687269 g8001132634698687269 = m3727281027331139839.R;
        boolean f2 = m3727281027331139839.f(obj) | m3727281027331139839.f(obj2) | m3727281027331139839.f(obj3);
        Object M = m3727281027331139839.M();
        if (f2 || M == O9023047933786425027.a) {
            M = new P2812398473959651581(g8001132634698687269, l12639328004344855510);
            m3727281027331139839.k0(M);
        }
    }

    public static final native S12510057686440098678 n0(M3727281027331139839 m3727281027331139839);

    public static final void o(Object[] objArr, L12639328004344855510 l12639328004344855510, M3727281027331139839 m3727281027331139839) {
        G8001132634698687269 g8001132634698687269 = m3727281027331139839.R;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        boolean d2 = m3727281027331139839.d(copyOf.length);
        for (Object obj : copyOf) {
            d2 |= m3727281027331139839.f(obj);
        }
        Object M = m3727281027331139839.M();
        if (d2 || M == O9023047933786425027.a) {
            m3727281027331139839.k0(new P2812398473959651581(g8001132634698687269, l12639328004344855510));
        }
    }

    public static final void o0(Matrix matrix, float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[12];
        float f12 = fArr[13];
        float f13 = fArr[15];
        fArr[0] = f2;
        fArr[1] = f6;
        fArr[2] = f11;
        fArr[3] = f3;
        fArr[4] = f7;
        fArr[5] = f12;
        fArr[6] = f5;
        fArr[7] = f9;
        fArr[8] = f13;
        matrix.setValues(fArr);
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f4;
        fArr[3] = f5;
        fArr[4] = f6;
        fArr[5] = f7;
        fArr[6] = f8;
        fArr[7] = f9;
        fArr[8] = f10;
    }

    public static final native void p(String str, boolean z, I1722681268793429505 i1722681268793429505, long j2, M3727281027331139839 m3727281027331139839, int i2, int i3);

    public static final void p0(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        fArr[0] = f2;
        fArr[1] = f5;
        fArr[2] = 0.0f;
        fArr[3] = f8;
        fArr[4] = f3;
        fArr[5] = f6;
        fArr[6] = 0.0f;
        fArr[7] = f9;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f4;
        fArr[13] = f7;
        fArr[14] = 0.0f;
        fArr[15] = f10;
    }

    public static final native void q(String str, M3727281027331139839 m3727281027331139839, int i2);

    public static final native long q0(int i2, M3727281027331139839 m3727281027331139839);

    public static final native void r(String str, M3727281027331139839 m3727281027331139839, int i2);

    public static byte[] r0(Object obj, Q9140341247415722307 q9140341247415722307, Q9140341247415722307 q91403412474157223072) {
        byte[] bArr;
        Class<?> cls = obj.getClass();
        if (V12599130403671467129.class.equals(cls)) {
            ByteBuffer slice = ((V12599130403671467129) obj).a.slice();
            byte[] bArr2 = new byte[slice.remaining()];
            slice.get(bArr2);
            return bArr2;
        }
        if (q9140341247415722307 == null || q9140341247415722307 == Q9140341247415722307.a) {
            return P5201717407242849942.b(obj);
        }
        switch (q9140341247415722307.ordinal()) {
            case 1:
                L13834037291440535306 l13834037291440535306 = (L13834037291440535306) cls.getDeclaredAnnotation(L13834037291440535306.class);
                if (l13834037291440535306 != null && l13834037291440535306.type() == Q9140341247415722307.b) {
                    return P5201717407242849942.e(obj);
                }
                break;
            case 2:
                if (obj instanceof Integer) {
                    long intValue = ((Integer) obj).intValue();
                    int i2 = P5201717407242849942.a;
                    return P5201717407242849942.a(0, false, 2, BigInteger.valueOf(intValue).toByteArray());
                }
                if (obj instanceof Long) {
                    long longValue = ((Long) obj).longValue();
                    int i3 = P5201717407242849942.a;
                    return P5201717407242849942.a(0, false, 2, BigInteger.valueOf(longValue).toByteArray());
                }
                if (obj instanceof BigInteger) {
                    int i4 = P5201717407242849942.a;
                    return P5201717407242849942.a(0, false, 2, ((BigInteger) obj).toByteArray());
                }
                break;
            case 3:
                if (obj instanceof String) {
                    String str = (String) obj;
                    int i5 = P5201717407242849942.a;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    String[] split = str.split("\\.");
                    if (split.length < 2) {
                        throw new W16495563625558853219("OBJECT IDENTIFIER must contain at least two nodes: ".concat(str));
                    }
                    try {
                        int parseInt = Integer.parseInt(split[0]);
                        if (parseInt > 6 || parseInt < 0) {
                            throw new W16495563625558853219(G6547577305291411977.n(parseInt, "Invalid value for node #1: "));
                        }
                        try {
                            int parseInt2 = Integer.parseInt(split[1]);
                            if (parseInt2 >= 40 || parseInt2 < 0) {
                                throw new W16495563625558853219(G6547577305291411977.n(parseInt2, "Invalid value for node #2: "));
                            }
                            int i6 = (parseInt * 40) + parseInt2;
                            if (i6 > 255) {
                                throw new W16495563625558853219(E12098517352909843120.l("First two nodes out of range: ", parseInt, parseInt2, "."));
                            }
                            byteArrayOutputStream.write(i6);
                            for (int i7 = 2; i7 < split.length; i7++) {
                                String str2 = split[i7];
                                try {
                                    int parseInt3 = Integer.parseInt(str2);
                                    if (parseInt3 < 0) {
                                        throw new W16495563625558853219("Invalid value for node #" + (i7 + 1) + ": " + parseInt3);
                                    }
                                    if (parseInt3 <= 127) {
                                        byteArrayOutputStream.write(parseInt3);
                                    } else if (parseInt3 < 16384) {
                                        byteArrayOutputStream.write((parseInt3 >> 7) | 128);
                                        byteArrayOutputStream.write(parseInt3 & 127);
                                    } else {
                                        if (parseInt3 >= 2097152) {
                                            throw new W16495563625558853219("Node #" + (i7 + 1) + " too large: " + parseInt3);
                                        }
                                        byteArrayOutputStream.write((parseInt3 >> 14) | 128);
                                        byteArrayOutputStream.write((127 & (parseInt3 >> 7)) | 128);
                                        byteArrayOutputStream.write(parseInt3 & 127);
                                    }
                                } catch (NumberFormatException unused) {
                                    throw new W16495563625558853219("Node #" + (i7 + 1) + " not numeric: " + str2);
                                }
                            }
                            return P5201717407242849942.a(0, false, 6, byteArrayOutputStream.toByteArray());
                        } catch (NumberFormatException unused2) {
                            throw new W16495563625558853219("Node #2 not numeric: " + split[1]);
                        }
                    } catch (NumberFormatException unused3) {
                        throw new W16495563625558853219("Node #1 not numeric: " + split[0]);
                    }
                }
                break;
            case 4:
            case 8:
                if (obj instanceof ByteBuffer) {
                    ByteBuffer byteBuffer = (ByteBuffer) obj;
                    bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.slice().get(bArr);
                } else {
                    bArr = obj instanceof byte[] ? (byte[]) obj : null;
                }
                if (bArr != null) {
                    return P5201717407242849942.a(0, false, C775827382551829194.P(q9140341247415722307), bArr);
                }
                break;
            case 5:
                L13834037291440535306 l138340372914405353062 = (L13834037291440535306) cls.getDeclaredAnnotation(L13834037291440535306.class);
                if (l138340372914405353062 != null && l138340372914405353062.type() == Q9140341247415722307.c) {
                    return P5201717407242849942.f(obj, false);
                }
                break;
            case 6:
                return P5201717407242849942.g((Collection) obj, q91403412474157223072, false);
            case 7:
                return P5201717407242849942.g((Collection) obj, q91403412474157223072, true);
            case 9:
            case 10:
                if (obj instanceof String) {
                    return P5201717407242849942.a(0, false, C775827382551829194.P(q9140341247415722307), ((String) obj).getBytes());
                }
                break;
            case 11:
                if (obj instanceof Boolean) {
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    int i8 = P5201717407242849942.a;
                    byte[] bArr3 = new byte[1];
                    if (booleanValue) {
                        bArr3[0] = 1;
                    } else {
                        bArr3[0] = 0;
                    }
                    return P5201717407242849942.a(0, false, 1, bArr3);
                }
                break;
        }
        throw new W16495563625558853219("Unsupported conversion: " + cls.getName() + " to ASN.1 " + q9140341247415722307);
    }

    public static D6962450040782876658 s(int i2, float f2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        return new D6962450040782876658(f2, 0.0f, f2, 0.0f);
    }

    public static final Exception s0(String str, FileNotFoundException fileNotFoundException) {
        int i2;
        boolean z = false;
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
            method.getClass();
            try {
                Parcel obtain = Parcel.obtain();
                obtain.getClass();
                Process.myUserHandle().writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                i2 = obtain.readInt();
            } catch (Throwable unused) {
                i2 = 0;
            }
            Object invoke = method.invoke(null, "sys.user." + i2 + ".ce_available", "false");
            invoke.getClass();
            z = ((String) invoke).equals("true");
        } catch (Throwable th) {
            O8620973563946607355.m(fileNotFoundException, th);
        }
        if (z || str == null) {
            return fileNotFoundException;
        }
        File file = new File(str, "siblingTestFile.txt");
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            return fileNotFoundException;
        } catch (IOException unused2) {
            return new C16368566182381472770(fileNotFoundException);
        } finally {
            file.delete();
        }
    }

    public static D6962450040782876658 t(float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        return new D6962450040782876658(f2, f3, f4, f5);
    }

    public static final native void u(int i2, B13729205492206812220 b13729205492206812220, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, String str);

    public static final native void v(String str, String str2, boolean z, long j2, long j3, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void w(I1722681268793429505 i1722681268793429505, B13729205492206812220 b13729205492206812220, T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i2, int i3);

    public static final native void x(String str, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void y(List list, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void z(boolean z, boolean z2, String str, boolean z3, boolean z4, String str2, String str3, boolean z5, String str4, String str5, String str6, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, F4096073349764486348 f40960733497644863483, F4096073349764486348 f40960733497644863484, F4096073349764486348 f40960733497644863485, F4096073349764486348 f40960733497644863486, F4096073349764486348 f40960733497644863487, F4096073349764486348 f40960733497644863488, F4096073349764486348 f40960733497644863489, B13729205492206812220 b13729205492206812220, F4096073349764486348 f409607334976448634810, F4096073349764486348 f409607334976448634811, B13729205492206812220 b137292054922068122202, B13729205492206812220 b137292054922068122203, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i2, int i3);

    public void W(K6473381917781246827 k6473381917781246827, float f2, float f3) {
        float f4 = f3 * f2;
        k6473381917781246827.d(f4, 180.0f, 90.0f);
        double d2 = f4;
        k6473381917781246827.c((float) (Math.sin(Math.toRadians(90.0d)) * d2), (float) (Math.sin(Math.toRadians(0.0d)) * d2));
    }

    static {
        izmyclvb.qgayjvbiagej2(155);
        a = new R17432272336056160915();
        b = new T15443218846549482730(210148896, false, new H4191455248956457601((byte) 20));
        c = new N9612381160928060518();
        f = new Object();
        Object obj = null;
        g = new Q7316561721656982910(obj, obj, obj, (byte) 28);
        i = new int[]{R.attr.colorPrimary};
        j = new int[]{R.attr.colorPrimaryVariant};
        k = new Z14997871575210439922((byte) 10);
    }
}
