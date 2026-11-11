package p034.p095;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Looper;
import android.os.RemoteException;
import android.security.KeyChainException;
import android.text.TextUtils;
import android.util.Property;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import de.blinkt.openvpn.core.NativeUtils;
import de.blinkt.openvpn.core.OpenVPNService;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URL;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Logger;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC0592;
import p000.C0698;
import p000.C0712;
import p010.p011.p012.C0775;
import p010.p011.p012.p013.C0749;
import p010.p011.p012.p013.C0753;
import p010.p011.p012.p013.C0759;
import p010.p011.p012.p013.ServiceConnectionC0766;
import p010.p011.p012.p014.InterfaceC0778;
import p015.p016.p019.AbstractC0917;
import p015.p016.p019.C0913;
import p015.p016.p019.C0914;
import p015.p016.p019.InterfaceC0915;
import p015.p016.p020.AbstractC0974;
import p015.p016.p020.C0976;
import p034.p035.p038.C1011;
import p034.p035.p043.C1067;
import p034.p035.p045.C1096;
import p034.p050.p053.C1260;
import p034.p050.p055.p056.C1266;
import p034.p080.C1501;
import p034.p081.p082.p083.C1508;
import p034.p081.p082.p083.C1509;
import p034.p081.p082.p083.C1510;
import p107.p108.p109.p110.p113.p116.InterfaceC1855;
import p131.p135.p137.C1980;
import p131.p135.p137.C1982;
import p131.p135.p137.EnumC1988;
import p131.p135.p139.C2008;
import p131.p135.p139.C2009;
import p131.p135.p142.AbstractC2024;
import p131.p135.p142.InterfaceC2022;
import p131.p135.p143.C2026;
import p131.p135.p144.RunnableC2027;
import p131.p145.p147.p148.C2031;
import p131.p145.p149.AbstractC2040;
import p131.p145.p149.C2073;
import p131.p145.p149.C2074;
import p131.p155.p156.p157.C2098;
import p131.p161.p162.p163.p167.C2145;
import p131.p161.p162.p163.p171.C2156;
import p131.p161.p162.p163.p173.C2163;
import p131.p161.p162.p163.p173.C2179;
import p131.p161.p162.p163.p173.C2186;
import p131.p161.p162.p163.p173.C2189;
import p131.p161.p162.p163.p185.C2256;
import p131.p161.p162.p163.p185.C2265;
import p131.p161.p162.p163.p185.C2270;
import p131.p161.p162.p163.p185.C2271;
import p131.p161.p162.p163.p185.C2288;
import p131.p161.p162.p163.p185.InterfaceC2263;
import p131.p161.p162.p163.p185.InterfaceC2285;
import p131.p161.p162.p163.p185.ViewOnAttachStateChangeListenerC2257;
import p131.p161.p162.p163.p189.InterfaceC2327;
import p243.C2810;
import p243.C2819;
import p243.InterfaceC2805;

/* renamed from: づざかべべ.は〲ぱなで.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1687 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static boolean f7805;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static Method f7806;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static Method f7807;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public static Boolean f7808;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static boolean f7809;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static Method f7810;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static Field f7811;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public static Boolean f7812;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static boolean f7813;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public static InterfaceC1855 f7814;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static LayoutTransition f7815;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public static AbstractC2024 f7816;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public static Boolean f7817;

    /* renamed from: 〱〴なぱへて, reason: contains not printable characters */
    public static boolean m3651() {
        return Build.VERSION.SDK_INT >= 21;
    }

    /* renamed from: 〱〵つてう, reason: contains not printable characters */
    public static boolean m3652() {
        return Build.VERSION.SDK_INT >= 17;
    }

    /* renamed from: 〱かけばぜぐ, reason: contains not printable characters */
    public static PorterDuff.Mode m3653(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: 〱こか〺ぃせ, reason: contains not printable characters */
    public static void m3654(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("String must not be empty");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static Animator m3655(InterfaceC2327 interfaceC2327, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(interfaceC2327, (Property<InterfaceC2327, V>) InterfaceC2327.C2329.f9615, (TypeEvaluator) InterfaceC2327.C2328.f9613, (Object[]) new InterfaceC2327.C2331[]{new InterfaceC2327.C2331(f, f2, f3)});
        if (Build.VERSION.SDK_INT < 21) {
            return ofObject;
        }
        InterfaceC2327.C2331 revealInfo = interfaceC2327.getRevealInfo();
        if (revealInfo == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) interfaceC2327, (int) f, (int) f2, revealInfo.f9617, f3);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofObject, createCircularReveal);
        return animatorSet;
    }

    /* renamed from: 〴ねぷぐくぼ, reason: contains not printable characters */
    public static PropertyValuesHolder m3656(Property<?, PointF> property, Path path) {
        return Build.VERSION.SDK_INT >= 21 ? PropertyValuesHolder.ofObject(property, (TypeConverter) null, path) : PropertyValuesHolder.ofFloat(new C1733(property, path), 0.0f, 1.0f);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: 〺〲に〼へ〸, reason: contains not printable characters */
    public static void m3657(View view, CharSequence charSequence) {
        if (!(Build.VERSION.SDK_INT >= 16) || view == null || charSequence == null) {
            return;
        }
        view.announceForAccessibility(charSequence);
    }

    @TargetApi(21)
    /* renamed from: 〺えなひあ, reason: contains not printable characters */
    public static boolean m3658(Context context) {
        if (f7817 == null) {
            f7817 = Boolean.valueOf(m3651() && context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f7817.booleanValue();
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static void m3659(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public static C2145 m3660(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return new C2145(context, resourceId);
    }

    /* renamed from: 〻しざ〹おま, reason: contains not printable characters */
    public static String m3661(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public static ColorStateList m3662(Context context, TypedArray typedArray, int i) {
        int color;
        int resourceId;
        ColorStateList m2929;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (m2929 = C1266.m2929(context, resourceId)) == null) ? (Build.VERSION.SDK_INT > 15 || (color = typedArray.getColor(i, -1)) == -1) ? typedArray.getColorStateList(i) : ColorStateList.valueOf(color) : m2929;
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static C0913 m3663(AbstractC0917 abstractC0917, C0976 c0976) {
        C0913 c0913 = new C0913();
        m3698(new C0914(c0976, c0913, abstractC0917), c0976);
        return c0913;
    }

    /* renamed from: ぁないぼぎへ, reason: contains not printable characters */
    public static void m3664(InterfaceC2022 interfaceC2022, long j, long j2, long j3, boolean z) {
        ((C2009) C2008.m4114().f8733).f8736.execute(new RunnableC2027(null, j, j2, j3, z));
    }

    /* renamed from: ぁにあがあ, reason: contains not printable characters */
    public static boolean m3665() {
        return Build.VERSION.SDK_INT >= 19;
    }

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public static void m3666(String str, String str2) {
        m3718(4, str, str2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x00c6, code lost:
    
        return r1;
     */
    /* renamed from: いいにぽつ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.view.animation.Interpolator m3667(android.content.Context r4, org.xmlpull.v1.XmlPullParser r5) {
        /*
            int r0 = r5.getDepth()
            r1 = 0
        L5:
            int r2 = r5.next()
            r3 = 3
            if (r2 != r3) goto L12
            int r3 = r5.getDepth()
            if (r3 <= r0) goto Lc6
        L12:
            r3 = 1
            if (r2 == r3) goto Lc6
            r3 = 2
            if (r2 == r3) goto L19
            goto L5
        L19:
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r5)
            java.lang.String r2 = r5.getName()
            java.lang.String r3 = "linearInterpolator"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L2f
            android.view.animation.LinearInterpolator r1 = new android.view.animation.LinearInterpolator
            r1.<init>()
            goto L5
        L2f:
            java.lang.String r3 = "accelerateInterpolator"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L3e
            android.view.animation.AccelerateInterpolator r2 = new android.view.animation.AccelerateInterpolator
            r2.<init>(r4, r1)
        L3c:
            r1 = r2
            goto L5
        L3e:
            java.lang.String r3 = "decelerateInterpolator"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L4c
            android.view.animation.DecelerateInterpolator r2 = new android.view.animation.DecelerateInterpolator
            r2.<init>(r4, r1)
            goto L3c
        L4c:
            java.lang.String r3 = "accelerateDecelerateInterpolator"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L5a
            android.view.animation.AccelerateDecelerateInterpolator r1 = new android.view.animation.AccelerateDecelerateInterpolator
            r1.<init>()
            goto L5
        L5a:
            java.lang.String r3 = "cycleInterpolator"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L68
            android.view.animation.CycleInterpolator r2 = new android.view.animation.CycleInterpolator
            r2.<init>(r4, r1)
            goto L3c
        L68:
            java.lang.String r3 = "anticipateInterpolator"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L76
            android.view.animation.AnticipateInterpolator r2 = new android.view.animation.AnticipateInterpolator
            r2.<init>(r4, r1)
            goto L3c
        L76:
            java.lang.String r3 = "overshootInterpolator"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L84
            android.view.animation.OvershootInterpolator r2 = new android.view.animation.OvershootInterpolator
            r2.<init>(r4, r1)
            goto L3c
        L84:
            java.lang.String r3 = "anticipateOvershootInterpolator"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L92
            android.view.animation.AnticipateOvershootInterpolator r2 = new android.view.animation.AnticipateOvershootInterpolator
            r2.<init>(r4, r1)
            goto L3c
        L92:
            java.lang.String r3 = "bounceInterpolator"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto La1
            android.view.animation.BounceInterpolator r1 = new android.view.animation.BounceInterpolator
            r1.<init>()
            goto L5
        La1:
            java.lang.String r3 = "pathInterpolator"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Laf
            づざかべべ.ごづごきえ.げつ〴ぬぐ.げつ〴ぬぐ.づざかべべ r2 = new づざかべべ.ごづごきえ.げつ〴ぬぐ.げつ〴ぬぐ.づざかべべ
            r2.<init>(r4, r1, r5)
            goto L3c
        Laf:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r0 = "Unknown interpolator name: "
            java.lang.StringBuilder r0 = p131.p155.p156.p157.C2098.m4207(r0)
            java.lang.String r5 = r5.getName()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
        Lc6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p095.C1687.m3667(android.content.Context, org.xmlpull.v1.XmlPullParser):android.view.animation.Interpolator");
    }

    /* renamed from: いたぷすいだ, reason: contains not printable characters */
    public static void m3668(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* renamed from: ぅばづそほせ, reason: contains not printable characters */
    public static void m3669(View view, C2163 c2163) {
        C2156 c2156 = c2163.f9045.f9067;
        if (c2156 != null && c2156.f9025) {
            float m3729 = m3729(view);
            C2163.C2164 c2164 = c2163.f9045;
            if (c2164.f9085 != m3729) {
                c2164.f9085 = m3729;
                c2163.m4269();
            }
        }
    }

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public static SharedPreferences m3670(Context context) {
        return context.getSharedPreferences(context.getPackageName() + "_preferences", 4);
    }

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public static String m3671(Context context) {
        return context.getCacheDir().getAbsolutePath() + "/android.conf";
    }

    /* renamed from: ぇいうげ〱〹, reason: contains not printable characters */
    public static String[] m3672(String[] strArr) {
        strArr[0] = strArr[0].replace("pie_openvpn", "nopie_openvpn");
        return strArr;
    }

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public static DateFormat m3673(int i, int i2) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (i == 0) {
            str = "EEEE, MMMM d, yyyy";
        } else if (i == 1) {
            str = "MMMM d, yyyy";
        } else if (i == 2) {
            str = "MMM d, yyyy";
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(C2098.m4208("Unknown DateFormat style: ", i));
            }
            str = "M/d/yy";
        }
        sb.append(str);
        sb.append(" ");
        if (i2 == 0 || i2 == 1) {
            str2 = "h:mm:ss a z";
        } else if (i2 == 2) {
            str2 = "h:mm:ss a";
        } else {
            if (i2 != 3) {
                throw new IllegalArgumentException(C2098.m4208("Unknown DateFormat style: ", i2));
            }
            str2 = "h:mm a";
        }
        sb.append(str2);
        return new SimpleDateFormat(sb.toString(), Locale.US);
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public static float m3674(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    /* renamed from: えがぐせほち, reason: contains not printable characters */
    public static boolean m3675(View view) {
        return C1096.m2491(view) == 1;
    }

    /* renamed from: えみにぃほす, reason: contains not printable characters */
    public static void m3676(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public static ColorStateList m3677(Context context, C1260 c1260, int i) {
        int color;
        int resourceId;
        ColorStateList m2929;
        return (!c1260.f6162.hasValue(i) || (resourceId = c1260.f6162.getResourceId(i, 0)) == 0 || (m2929 = C1266.m2929(context, resourceId)) == null) ? (Build.VERSION.SDK_INT > 15 || (color = c1260.f6162.getColor(i, -1)) == -1) ? c1260.m2917(i) : ColorStateList.valueOf(color) : m2929;
    }

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public static int m3678(Context context, float f) {
        return Math.round(f * context.getResources().getDisplayMetrics().density);
    }

    /* renamed from: ぉねぞはがぞ, reason: contains not printable characters */
    public static TypedValue m3679(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public static Proxy m3680(URL url) {
        System.setProperty("java.net.useSystemProxies", "true");
        List<Proxy> select = ProxySelector.getDefault().select(url.toURI());
        if (select == null) {
            return null;
        }
        for (Proxy proxy : select) {
            if (proxy.address() != null) {
                return proxy;
            }
        }
        return null;
    }

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public static int m3681(int i, int i2, int i3, int i4, ImageView.ScaleType scaleType) {
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            return i == 0 ? i3 : i;
        }
        if (i == 0) {
            double d = i2;
            double d2 = i4;
            Double.isNaN(d);
            Double.isNaN(d2);
            double d3 = i3;
            Double.isNaN(d3);
            return (int) (d3 * (d / d2));
        }
        if (i2 == 0) {
            return i;
        }
        double d4 = i4;
        double d5 = i3;
        Double.isNaN(d4);
        Double.isNaN(d5);
        double d6 = d4 / d5;
        if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            double d7 = i;
            Double.isNaN(d7);
            double d8 = i2;
            if (d7 * d6 >= d8) {
                return i;
            }
            Double.isNaN(d8);
            return (int) (d8 / d6);
        }
        double d9 = i;
        Double.isNaN(d9);
        double d10 = i2;
        if (d9 * d6 <= d10) {
            return i;
        }
        Double.isNaN(d10);
        return (int) (d10 / d6);
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public static void m3682(View view, InterfaceC2263 interfaceC2263) {
        C1096.m2503(view, new C2256(interfaceC2263, new C2271(C1096.m2513(view), view.getPaddingTop(), C1096.m2500(view), view.getPaddingBottom())));
        if (C1096.m2507(view)) {
            C1096.m2518(view);
        } else {
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2257());
        }
    }

    /* renamed from: かづげぃぁ〺, reason: contains not printable characters */
    public static <T> ObjectAnimator m3683(T t, Property<T, PointF> property, Path path) {
        return Build.VERSION.SDK_INT >= 21 ? ObjectAnimator.ofObject(t, property, (TypeConverter) null, path) : ObjectAnimator.ofFloat(t, new C1733(property, path), 0.0f, 1.0f);
    }

    /* renamed from: がぐくいおす, reason: contains not printable characters */
    public static void m3684(C0775 c0775, Context context) {
        c0775.getClass();
        String packageName = context.getPackageName();
        Intent intent = new Intent(context, (Class<?>) OpenVPNService.class);
        intent.putExtra(C2098.m4205(packageName, ".profileUUID"), c0775.f4984.toString());
        intent.putExtra(packageName + ".profileVersion", c0775.f4976);
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    /* renamed from: きぬどぼみ〸, reason: contains not printable characters */
    public static void m3685(AnimatorSet animatorSet, List<Animator> list) {
        int size = list.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = list.get(i);
            j = Math.max(j, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }

    /* renamed from: ぎきぁ〱ぢ, reason: contains not printable characters */
    public static String[] m3686(String str, char c) {
        int i = 1;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == c) {
                i++;
            }
        }
        String[] strArr = new String[i];
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            if (i3 >= str.length()) {
                strArr[i4] = "";
            } else {
                int indexOf = str.indexOf(c, i3);
                if (indexOf == -1) {
                    indexOf = str.length();
                }
                strArr[i4] = str.substring(i3, indexOf);
                i3 = indexOf + 1;
            }
        }
        return strArr;
    }

    /* renamed from: くぎぶ〼のそ, reason: contains not printable characters */
    public static void m3687(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static <T> T m3688(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: くねねぱす〻, reason: contains not printable characters */
    public static String m3689(String str) {
        return m3717(str).trim();
    }

    /* renamed from: けときぜと, reason: contains not printable characters */
    public static C2073 m3690(View view, float f, float f2) {
        AbstractC2040.C2042 c2042 = new AbstractC2040.C2042(0.0f, 1.0f);
        AbstractC2040.C2042 c20422 = new AbstractC2040.C2042(0.275f, f);
        AbstractC2040.C2042 c20423 = new AbstractC2040.C2042(0.69f, f2);
        AbstractC2040.C2042 c20424 = new AbstractC2040.C2042(1.0f, 1.0f);
        C2074 m4164 = C2074.m4164("scaleX", c2042, c20422, c20423, c20424);
        C2074 m41642 = C2074.m4164("scaleY", c2042, c20422, c20423, c20424);
        Object obj = view;
        if (C2031.f8757) {
            obj = C2031.m4122(view);
        }
        C2073 m4161 = C2073.m4161(obj, m4164, m41642);
        m4161.m4162(544L);
        return m4161;
    }

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public static boolean m3691() {
        return Build.VERSION.SDK_INT >= 21;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static C0759 m3692(Context context, String str) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && myLooper == context.getMainLooper()) {
            throw new IllegalStateException("calling this from your main thread can lead to deadlock");
        }
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(1);
        ServiceConnectionC0766 serviceConnectionC0766 = new ServiceConnectionC0766(linkedBlockingQueue);
        Intent intent = new Intent("de.blinkt.openvpn.api.ExternalCertificateProvider");
        intent.setPackage(str);
        if (context.bindService(intent, serviceConnectionC0766, 1)) {
            return new C0759(context, serviceConnectionC0766, (InterfaceC0778) linkedBlockingQueue.take());
        }
        throw new KeyChainException(C2098.m4205("could not bind to external authticator app: ", str));
    }

    /* renamed from: こ〲しでおか, reason: contains not printable characters */
    public static float m3693(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public static boolean m3694(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: ごまけがぢは, reason: contains not printable characters */
    public static int m3695(int i, int i2, float f) {
        return C1011.m2352(C1011.m2351(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public static Certificate[] m3696(String str) {
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        Vector vector = new Vector();
        if (!C0775.m2091(str)) {
            return new Certificate[]{certificateFactory.generateCertificate(new FileInputStream(str))};
        }
        int indexOf = str.indexOf("-----BEGIN CERTIFICATE-----");
        do {
            int max = Math.max(0, indexOf);
            vector.add(certificateFactory.generateCertificate(new ByteArrayInputStream(str.substring(max).getBytes())));
            indexOf = str.indexOf("-----BEGIN CERTIFICATE-----", max + 1);
        } while (indexOf > 0);
        return (Certificate[]) vector.toArray(new Certificate[vector.size()]);
    }

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public static void m3697(String str, String str2) {
        m3718(6, str, str2, null);
    }

    /* renamed from: しげにけぃ, reason: contains not printable characters */
    public static void m3698(InterfaceC0915 interfaceC0915, AbstractC0974 abstractC0974) {
        AbstractC0974 abstractC09742 = abstractC0974;
        int i = 0;
        while (abstractC09742 != null) {
            interfaceC0915.mo2241(abstractC09742, i);
            if (abstractC09742.mo2285() > 0) {
                abstractC09742 = abstractC09742.mo2280().get(0);
                i++;
            } else {
                while (abstractC09742.m2291() == null && i > 0) {
                    interfaceC0915.mo2240(abstractC09742, i);
                    abstractC09742 = abstractC09742.f5308;
                    i--;
                }
                interfaceC0915.mo2240(abstractC09742, i);
                if (abstractC09742 == abstractC0974) {
                    return;
                } else {
                    abstractC09742 = abstractC09742.m2291();
                }
            }
        }
    }

    /* renamed from: しぷげへが, reason: contains not printable characters */
    public static int m3699(Context context, int i, String str) {
        TypedValue m3679 = m3679(context, i);
        if (m3679 != null) {
            return m3679.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public static Drawable m3700(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable m2928;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (m2928 = C1266.m2928(context, resourceId)) == null) ? typedArray.getDrawable(i) : m2928;
    }

    /* renamed from: ずまげせび〳, reason: contains not printable characters */
    public static void m3701(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Object must not be null");
        }
    }

    /* renamed from: せだてはぺて, reason: contains not printable characters */
    public static byte[] m3702(Context context, String str, String str2, byte[] bArr) {
        try {
            try {
                return m3692(context.getApplicationContext(), null).f4897.mo2106(str2, bArr);
            } finally {
            }
        } catch (RemoteException e) {
            throw new KeyChainException(e);
        }
    }

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public static Vector<String> m3703(Context context, boolean z) {
        Vector<String> vector = new Vector<>();
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 21) {
            for (Network network : connectivityManager.getAllNetworks()) {
                connectivityManager.getNetworkInfo(network);
                LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                if (!networkCapabilities.hasTransport(4) && !networkCapabilities.hasTransport(0)) {
                    for (LinkAddress linkAddress : linkProperties.getLinkAddresses()) {
                        if (((linkAddress.getAddress() instanceof Inet4Address) && !z) || ((linkAddress.getAddress() instanceof Inet6Address) && z)) {
                            vector.add(linkAddress.toString());
                        }
                    }
                }
            }
        } else {
            if (z) {
                return vector;
            }
            String[] ifconfig = NativeUtils.getIfconfig();
            for (int i = 0; i < ifconfig.length; i += 3) {
                String str = ifconfig[i];
                String str2 = ifconfig[i + 1];
                String str3 = ifconfig[i + 2];
                if (str != null && !str.equals("lo") && !str.startsWith("tun") && !str.startsWith("rmnet")) {
                    if (str2 == null || str3 == null) {
                        StringBuilder m4207 = C2098.m4207("Local routes are broken?! (Report to author) ");
                        m4207.append(TextUtils.join("|", ifconfig));
                        C0753.m2031(m4207.toString());
                    } else {
                        StringBuilder m4179 = C2098.m4179(str2, "/");
                        m4179.append(C0749.m2024(str3));
                        vector.add(m4179.toString());
                    }
                }
            }
        }
        return vector;
    }

    /* renamed from: ち〴みぎ〻び, reason: contains not printable characters */
    public static boolean m3704() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        String str = Build.VERSION.CODENAME;
        return "O".equals(str) || str.startsWith("OMR") || str.startsWith("ODR");
    }

    /* renamed from: つしけおつ, reason: contains not printable characters */
    public static void m3705(OutputStream outputStream, int i, String str) {
        if (i >= 0 && i <= 255) {
            outputStream.write(i);
            return;
        }
        throw new IOException(str + ". The value " + i + " is not within the allowed range for bytes");
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static void m3706(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: ておぞぞはね, reason: contains not printable characters */
    public static boolean m3707() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public static C1980<Bitmap> m3708(C0712 c0712, int i, int i2, Bitmap.Config config, ImageView.ScaleType scaleType) {
        Bitmap bitmap;
        InterfaceC2805 mo1728;
        C2819 c2819;
        BitmapFactory.Options options = new BitmapFactory.Options();
        byte[] bArr = new byte[0];
        try {
            mo1728 = c0712.f4752.mo1728();
            Logger logger = C2810.f10480;
            c2819 = new C2819();
        } catch (IOException unused) {
        }
        if (mo1728 == null) {
            throw new NullPointerException("source == null");
        }
        c2819.m4912(mo1728);
        bArr = c2819.m4917();
        if (i == 0 && i2 == 0) {
            options.inPreferredConfig = config;
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i3 = options.outWidth;
            int i4 = options.outHeight;
            int m3681 = m3681(i, i2, i3, i4, scaleType);
            int m36812 = m3681(i2, i, i4, i3, scaleType);
            options.inJustDecodeBounds = false;
            double d = i3;
            double d2 = m3681;
            Double.isNaN(d);
            Double.isNaN(d2);
            Double.isNaN(d);
            Double.isNaN(d2);
            Double.isNaN(d);
            Double.isNaN(d2);
            double d3 = d / d2;
            double d4 = i4;
            double d5 = m36812;
            Double.isNaN(d4);
            Double.isNaN(d5);
            Double.isNaN(d4);
            Double.isNaN(d5);
            Double.isNaN(d4);
            Double.isNaN(d5);
            float f = 1.0f;
            while (true) {
                float f2 = 2.0f * f;
                if (f2 > Math.min(d3, d4 / d5)) {
                    break;
                }
                f = f2;
            }
            options.inSampleSize = (int) f;
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (decodeByteArray == null || (decodeByteArray.getWidth() <= m3681 && decodeByteArray.getHeight() <= m36812)) {
                bitmap = decodeByteArray;
            } else {
                bitmap = Bitmap.createScaledBitmap(decodeByteArray, m3681, m36812, true);
                decodeByteArray.recycle();
            }
        }
        return bitmap == null ? new C1980<>(new C2026(c0712)) : new C1980<>(bitmap);
    }

    /* renamed from: でどあくず, reason: contains not printable characters */
    public static int m3709(Context context, int i, int i2) {
        TypedValue m3679 = m3679(context, i);
        return m3679 != null ? m3679.data : i2;
    }

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public static int m3710(int i, int i2) {
        switch (i) {
            case 0:
            case 2:
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
                return 31;
            case 1:
                return ((i2 % 4 != 0 || i2 % 100 == 0) && i2 % 400 != 0) ? 28 : 29;
            case 3:
            case 5:
            case 8:
            case 10:
                return 30;
            default:
                throw new IllegalArgumentException("Invalid Month");
        }
    }

    /* renamed from: な〱ちぉじ, reason: contains not printable characters */
    public static boolean m3711(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    /* renamed from: ながふずは, reason: contains not printable characters */
    public static boolean m3712(Context context, String... strArr) {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        if (context == null) {
            throw new IllegalArgumentException("Can't check permissions for null context");
        }
        for (String str : strArr) {
            if (C1067.m2407(context, str) != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static void m3713(C0712 c0712, C1982 c1982) {
        AbstractC0592 abstractC0592;
        if (c1982.f8621 == EnumC1988.OK_HTTP_RESPONSE || c0712 == null || (abstractC0592 = c0712.f4752) == null || abstractC0592.mo1728() == null) {
            return;
        }
        try {
            c0712.f4752.mo1728().close();
        } catch (Exception unused) {
        }
    }

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public static InterfaceC2285 m3714(View view) {
        ViewGroup m3725 = m3725(view);
        if (m3725 != null) {
            if (Build.VERSION.SDK_INT >= 18) {
                return new C2270(m3725);
            }
            ViewGroup m37252 = m3725(m3725);
            if (m37252 != null) {
                int childCount = m37252.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = m37252.getChildAt(i);
                    if (childAt instanceof C2265.C2266) {
                        return ((C2265.C2266) childAt).f9451;
                    }
                }
                return new C2288(m37252.getContext(), m37252, m3725);
            }
        }
        return null;
    }

    /* renamed from: にぢ〱ぁな, reason: contains not printable characters */
    public static boolean m3715(Context context, int i, boolean z) {
        TypedValue m3679 = m3679(context, i);
        return (m3679 == null || m3679.type != 18) ? z : m3679.data != 0;
    }

    /* renamed from: のかまじえ, reason: contains not printable characters */
    public static void m3716(String str) {
        if (!(Looper.getMainLooper() == Looper.myLooper())) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: のね〱ばぁぢ, reason: contains not printable characters */
    public static String m3717(String str) {
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    /* renamed from: のびぶけせ, reason: contains not printable characters */
    public static void m3718(int i, String str, String str2, Throwable th) {
        InterfaceC1855 interfaceC1855 = f7814;
        if (interfaceC1855 != null) {
            interfaceC1855.mo1717(i, str, str2, th);
        }
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public static float m3719(float f, float f2, float f3, float f4) {
        return (float) Math.hypot(f3 - f, f4 - f2);
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public static void m3720(Canvas canvas, boolean z) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i < 21) {
            return;
        }
        if (i >= 29) {
            if (z) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (i == 28) {
            throw new IllegalStateException("This method doesn't work on Pie!");
        }
        if (!f7809) {
            try {
                Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                f7810 = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                f7806 = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f7809 = true;
        }
        if (z) {
            try {
                Method method2 = f7810;
                if (method2 != null) {
                    method2.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException unused2) {
                return;
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        if (z || (method = f7806) == null) {
            return;
        }
        method.invoke(canvas, new Object[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x008b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00e6 -> B:30:0x00eb). Please report as a decompilation issue!!! */
    /* renamed from: はつきどっ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m3721(int r17, java.lang.String[] r18, int[] r19, java.lang.Object... r20) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p095.C1687.m3721(int, java.lang.String[], int[], java.lang.Object[]):void");
    }

    /* renamed from: ばおぢでぎか, reason: contains not printable characters */
    public static void m3722(boolean z) {
        if (!z) {
            throw new IllegalArgumentException("Must be true");
        }
    }

    /* renamed from: ぱでかぁ〻〹, reason: contains not printable characters */
    public static PorterDuffColorFilter m3723(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }

    /* renamed from: ひぞ〴つき, reason: contains not printable characters */
    public static Set m3724(int i) {
        return i <= 256 ? new C1501(i) : new HashSet(i, 1.0f);
    }

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public static ViewGroup m3725(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static <T> T m3726(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: びちづぼぬ, reason: contains not printable characters */
    public static String m3727(C0698 c0698) {
        String m1959 = c0698.m1959();
        String m1955 = c0698.m1955();
        if (m1955 == null) {
            return m1959;
        }
        return m1959 + '?' + m1955;
    }

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public static int m3728(View view, int i) {
        return m3699(view.getContext(), i, view.getClass().getCanonicalName());
    }

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public static float m3729(View view) {
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += C1096.m2522((View) parent);
        }
        return f;
    }

    /* renamed from: へ〱そかのず, reason: contains not printable characters */
    public static void m3730(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: へえどぜせ, reason: contains not printable characters */
    public static void m3731(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof C2163) {
            C2163 c2163 = (C2163) background;
            C2163.C2164 c2164 = c2163.f9045;
            if (c2164.f9072 != f) {
                c2164.f9072 = f;
                c2163.m4269();
            }
        }
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public static float m3732(float f, float f2, float f3, float f4, float f5, float f6) {
        float m3719 = m3719(f, f2, f3, f4);
        float m37192 = m3719(f, f2, f5, f4);
        float m37193 = m3719(f, f2, f5, f6);
        float m37194 = m3719(f, f2, f3, f6);
        return (m3719 <= m37192 || m3719 <= m37193 || m3719 <= m37194) ? (m37192 <= m37193 || m37192 <= m37194) ? m37193 > m37194 ? m37193 : m37194 : m37192 : m3719;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.io.FileOutputStream] */
    /* renamed from: へぼ〳〻び, reason: contains not printable characters */
    public static void m3733(C0712 c0712, String str, String str2) {
        Throwable th;
        ?? r4;
        byte[] bArr = new byte[2048];
        InputStream inputStream = null;
        try {
            InputStream mo4871 = c0712.f4752.mo1728().mo4871();
            try {
                File file = new File(str);
                if (!file.exists()) {
                    file.mkdirs();
                }
                ?? fileOutputStream = new FileOutputStream(new File(file, str2));
                while (true) {
                    try {
                        int read = mo4871.read(bArr);
                        if (read == -1) {
                            break;
                        } else {
                            fileOutputStream.write(bArr, 0, read);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = fileOutputStream;
                        InputStream inputStream2 = inputStream;
                        inputStream = mo4871;
                        r4 = inputStream2;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        if (r4 != 0) {
                            try {
                                r4.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                }
                fileOutputStream.flush();
                try {
                    mo4871.close();
                } catch (IOException unused3) {
                }
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            r4 = 0;
        }
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public static C2186 m3734(int i) {
        return i != 0 ? i != 1 ? new C2189() : new C2179() : new C2189();
    }

    /* renamed from: ぺがぅす〹ち, reason: contains not printable characters */
    public static Interpolator m3735(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return AnimationUtils.loadInterpolator(context, i);
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                if (i == 17563663) {
                    return new C1510();
                }
                if (i == 17563661) {
                    return new C1508();
                }
                if (i == 17563662) {
                    return new C1509();
                }
                XmlResourceParser animation = context.getResources().getAnimation(i);
                context.getResources();
                context.getTheme();
                Interpolator m3667 = m3667(context, animation);
                animation.close();
                return m3667;
            } catch (IOException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException.initCause(e);
                throw notFoundException;
            } catch (XmlPullParserException e2) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException2.initCause(e2);
                throw notFoundException2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public static C2026 m3736(C2026 c2026, C1982 c1982, int i) {
        AbstractC0592 abstractC0592;
        c1982.getClass();
        try {
            C0712 c0712 = c2026.f8750;
            if (c0712 != null && (abstractC0592 = c0712.f4752) != null && abstractC0592.mo1728() != null) {
                InterfaceC2805 mo1728 = c2026.f8750.f4752.mo1728();
                Logger logger = C2810.f10480;
                C2819 c2819 = new C2819();
                if (mo1728 == null) {
                    throw new NullPointerException("source == null");
                }
                c2819.m4912(mo1728);
                c2819.mo4866();
            }
        } catch (Exception unused) {
        }
        return c2026;
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public static void m3737(String str, String str2) {
        m3718(3, str, str2, null);
    }
}
