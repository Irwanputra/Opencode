package dev.epro.r0;

import ads_mobile_sdk.jr0;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes2.dex */
public class O17574792317020433029 {
    public final /* synthetic */ byte b;

    static {
        izmyclvb.dpqpjfpoanwt1(1399);
    }

    public static final native void a(int i, B13729205492206812220 b13729205492206812220, F4096073349764486348 f4096073349764486348, A9686630263571354636 a9686630263571354636, M3727281027331139839 m3727281027331139839, int i2);

    public static native int b(int i, int i2, String str, byte[] bArr);

    public static final native void b(int i, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i2);

    public static Integer c(jr0 jr0Var, String str, int i) {
        jr0Var.getClass();
        return Integer.valueOf(i);
    }

    public static final boolean d(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj != obj2 && !S10823041268949770285.t(obj, obj2)) {
                if (obj != null && obj2 != null) {
                    if ((obj instanceof Bundle) && (obj2 instanceof Bundle)) {
                        if (!d((Bundle) obj, (Bundle) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                        if (!O5378677881740157249.l0((Object[]) obj, (Object[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                        if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                        if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                        if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                        if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                        if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                        if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                        if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                        if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            return false;
                        }
                    } else if (!obj.equals(obj2)) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static final int e(Bundle bundle) {
        Iterator<String> it = bundle.keySet().iterator();
        int iE = 1;
        while (it.hasNext()) {
            Object obj = bundle.get(it.next());
            iE = (iE * 31) + (obj instanceof Bundle ? e((Bundle) obj) : obj instanceof Object[] ? Arrays.deepHashCode((Object[]) obj) : obj instanceof byte[] ? Arrays.hashCode((byte[]) obj) : obj instanceof short[] ? Arrays.hashCode((short[]) obj) : obj instanceof int[] ? Arrays.hashCode((int[]) obj) : obj instanceof long[] ? Arrays.hashCode((long[]) obj) : obj instanceof float[] ? Arrays.hashCode((float[]) obj) : obj instanceof double[] ? Arrays.hashCode((double[]) obj) : obj instanceof char[] ? Arrays.hashCode((char[]) obj) : obj instanceof boolean[] ? Arrays.hashCode((boolean[]) obj) : obj != null ? obj.hashCode() : 0);
        }
        return iE;
    }

    public static InvocationHandler f() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, k()).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static final int g(CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final int h(CharSequence charSequence, int i) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    public static ColorStateList i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (!l(xmlPullParser, "tint")) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        int i = typedValue.type;
        if (i == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
        }
        if (i >= 28 && i <= 31) {
            return ColorStateList.valueOf(typedValue.data);
        }
        Resources resources = typedArray.getResources();
        int resourceId = typedArray.getResourceId(1, 0);
        ThreadLocal threadLocal = U3773161118279281523.a;
        try {
            return U3773161118279281523.a(resources, resources.getXml(resourceId), theme);
        } catch (Exception unused) {
            return null;
        }
    }

    public static N12245111110189169079 j(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        N12245111110189169079 n12245111110189169079E;
        if (l(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new N12245111110189169079((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                n12245111110189169079E = N12245111110189169079.e(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception unused) {
                n12245111110189169079E = null;
            }
            if (n12245111110189169079E != null) {
                return n12245111110189169079E;
            }
        }
        return new N12245111110189169079((Shader) null, (ColorStateList) null, 0);
    }

    public static ClassLoader k() {
        if (Build.VERSION.SDK_INT >= 28) {
            return WebView.getWebViewClassLoader();
        }
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, null).getClass().getClassLoader();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            Q11088980322693754445.k(e);
            return null;
        }
    }

    public static boolean l(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static final native boolean m(String str);

    public static TypedArray n(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void o(dev.epro.r0.V1715405128288489768 r10, dev.epro.r0.Q17957571128037780363 r11) throws java.lang.Throwable {
        /*
            dev.epro.r0.V11538895333762958192 r0 = r11.b
            boolean r1 = r11.d()
            dev.epro.r0.K10916014851776401112 r2 = r11.a
            if (r1 == 0) goto L13
            int r1 = r2.f
            r3 = 3
            if (r1 != r3) goto L10
            goto L13
        L10:
            r1 = 1
        L11:
            r7 = r1
            goto L15
        L13:
            r1 = 0
            goto L11
        L15:
            if (r7 == 0) goto L40
            long r3 = r11.c
            r11 = 32
            long r5 = r3 >> r11
            int r1 = (int) r5
            float r1 = (float) r1
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            int r3 = (int) r3
            float r3 = (float) r3
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r8 = (long) r1
            int r1 = java.lang.Float.floatToRawIntBits(r3)
            long r3 = (long) r1
            long r8 = r8 << r11
            long r3 = r3 & r5
            long r3 = r3 | r8
            r5 = 0
            dev.epro.r0.S6349823729575121924 r11 = dev.epro.r0.E2166724654553415323.a(r5, r3)
            r10.l()
            dev.epro.r0.V1715405128288489768.n(r10, r11)
        L40:
            dev.epro.r0.S16571168858015125610 r11 = r2.b
            dev.epro.r0.W1742516786250891319 r11 = r11.a
            dev.epro.r0.W7621125212597703960 r1 = r11.m
            dev.epro.r0.T12552481909083146428 r2 = r11.a
            if (r1 != 0) goto L4c
            dev.epro.r0.W7621125212597703960 r1 = dev.epro.r0.W7621125212597703960.b
        L4c:
            r5 = r1
            dev.epro.r0.H7281108764511748709 r1 = r11.n
            if (r1 != 0) goto L53
            dev.epro.r0.H7281108764511748709 r1 = dev.epro.r0.H7281108764511748709.d
        L53:
            r4 = r1
            dev.epro.r0.Q15653065705375360223 r11 = r11.p
            if (r11 != 0) goto L5a
            dev.epro.r0.C10274207051762801329 r11 = dev.epro.r0.C10274207051762801329.a
        L5a:
            r6 = r11
            r11 = r2
            dev.epro.r0.D14208870094104617988 r2 = r11.c()     // Catch: java.lang.Throwable -> L95
            dev.epro.r0.D10940439092163644790 r1 = dev.epro.r0.D10940439092163644790.a
            if (r2 == 0) goto L7e
            if (r11 == r1) goto L71
            float r11 = r11.a()     // Catch: java.lang.Throwable -> L6d
        L6a:
            r1 = r10
            r3 = r11
            goto L74
        L6d:
            r0 = move-exception
            r11 = r0
            r1 = r10
            goto L98
        L71:
            r11 = 1065353216(0x3f800000, float:1.0)
            goto L6a
        L74:
            dev.epro.r0.V11538895333762958192.j(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L7a
            r10 = r1
            r1 = r10
            goto L8d
        L7a:
            r0 = move-exception
            r10 = r1
        L7c:
            r11 = r0
            goto L98
        L7e:
            if (r11 == r1) goto L87
            long r1 = r11.b()     // Catch: java.lang.Throwable -> L6d
        L84:
            r2 = r1
            r1 = r10
            goto L8a
        L87:
            long r1 = dev.epro.r0.U10174709222559481877.b     // Catch: java.lang.Throwable -> L95
            goto L84
        L8a:
            dev.epro.r0.V11538895333762958192.i(r0, r1, r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L93
        L8d:
            if (r7 == 0) goto L92
            r1.j()
        L92:
            return
        L93:
            r0 = move-exception
            goto L7c
        L95:
            r0 = move-exception
            r1 = r10
            goto L7c
        L98:
            if (r7 == 0) goto L9d
            r1.j()
        L9d:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.O17574792317020433029.o(dev.epro.r0.V1715405128288489768, dev.epro.r0.Q17957571128037780363):void");
    }

    public static final native void p(JSONObject jSONObject, String str, boolean z);

    public static final void q() {
        throw new UnsupportedOperationException();
    }

    public final native int a(int i, int i2, String str, byte[] bArr);

    public native int a(String str);

    public final native String a(int i, byte[] bArr, int i2);
}
