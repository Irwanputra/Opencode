package dev.epro.r0;

import ads_mobile_sdk.qw2;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spanned;
import java.io.File;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes3.dex */
public abstract class Z14316276734425062790 {
    public static Z7022156542152740569 a;
    public static Z7022156542152740569 b;

    static {
        izmyclvb.qgayjvbiagej2(268);
    }

    public Z14316276734425062790() {
        new ConcurrentHashMap();
    }

    public static final native void a(int i, B13729205492206812220 b13729205492206812220, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, Integer num);

    public static final native void b(A9686630263571354636 a9686630263571354636, M3727281027331139839 m3727281027331139839, int i);

    public static final int c(qw2 qw2Var) {
        qw2Var.getClass();
        switch (qw2Var.ordinal()) {
            case 0:
                return 1;
            case 1:
                return 6;
            case 2:
                return 2;
            case 3:
                return 8;
            case 4:
                return 3;
            case 5:
                return 7;
            case 6:
                return 4;
            case 7:
                return 5;
            case 8:
                return 9;
            default:
                Z3383101362411723454.g();
                return 0;
        }
    }

    public static void d(Object obj, Class cls) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    public static void e(Object obj) {
        if (obj != null) {
            return;
        }
        Z3383101362411723454.k("Cannot return null from a non- @Provides method");
    }

    public static final long f(int i, int i2, N1420218926656397722 n1420218926656397722) {
        Z4949026731585863708 z4949026731585863708;
        if (i == -1) {
            return (i2 << 32) | 4294967295L;
        }
        boolean z = i > i2;
        B4739506393801054036 b4739506393801054036 = n1420218926656397722.c;
        B3798966058357121240 b3798966058357121240 = (b4739506393801054036 == null || (z4949026731585863708 = (Z4949026731585863708) b4739506393801054036.getValue()) == null) ? null : z4949026731585863708.b;
        long a2 = b3798966058357121240 != null ? b3798966058357121240.a(i, false) : T1335862270807194835.d(i, i);
        long f = n1420218926656397722.f(a2);
        int ordinal = ((F12478849263529740365.d(a2) && F12478849263529740365.d(f)) ? R7405804063266277749.a : (F12478849263529740365.d(a2) || F12478849263529740365.d(f)) ? (!F12478849263529740365.d(a2) || F12478849263529740365.d(f)) ? R7405804063266277749.d : R7405804063266277749.b : R7405804063266277749.c).ordinal();
        R7332211110819204002 r7332211110819204002 = R7332211110819204002.b;
        R7332211110819204002 r73322111108192040022 = R7332211110819204002.a;
        if (ordinal == 0) {
            if (z) {
                r7332211110819204002 = r73322111108192040022;
            }
            return C775827382551829194.D(i, r7332211110819204002);
        }
        if (ordinal == 1) {
            return z ? i == ((int) (f >> 32)) ? C775827382551829194.D(i, r73322111108192040022) : C775827382551829194.D((int) (f & 4294967295L), r7332211110819204002) : i == ((int) (f & 4294967295L)) ? C775827382551829194.D(i, r7332211110819204002) : C775827382551829194.D((int) (f >> 32), r73322111108192040022);
        }
        if (ordinal == 2) {
            return z ? C775827382551829194.D((int) (f & 4294967295L), r73322111108192040022) : C775827382551829194.D((int) (f >> 32), r7332211110819204002);
        }
        if (ordinal == 3) {
            return (i << 32) | 4294967295L;
        }
        Z3383101362411723454.g();
        return 0L;
    }

    public static final native boolean g(String str, String str2);

    public static J18236984568855953541 l(J18236984568855953541[] j18236984568855953541Arr, int i) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        J18236984568855953541 j18236984568855953541 = null;
        int i3 = Integer.MAX_VALUE;
        for (J18236984568855953541 j182369845688559535412 : j18236984568855953541Arr) {
            int abs = (Math.abs(j182369845688559535412.c - i2) * 2) + (j182369845688559535412.d == z ? 0 : 1);
            if (j18236984568855953541 == null || i3 > abs) {
                j18236984568855953541 = j182369845688559535412;
                i3 = abs;
            }
        }
        return j18236984568855953541;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int m(int i, String str) {
        String str2;
        int i2;
        D3638978315442423989 o2 = o();
        Integer num = null;
        if (o2 != null) {
            if (!(o2.c() == 1)) {
                S10973172697741180971.m("Not initialized yet");
                return 0;
            }
            K5751602218013079365.x("charSequence cannot be null", str);
            Q7316561721656982910 q7316561721656982910 = o2.e.b;
            q7316561721656982910.getClass();
            if (i < 0 || i >= str.length()) {
                str2 = str;
                i2 = -1;
            } else {
                if (str instanceof Spanned) {
                    Spanned spanned = (Spanned) str;
                    A7769137806217985202[] a7769137806217985202Arr = (A7769137806217985202[]) spanned.getSpans(i, i + 1, A7769137806217985202.class);
                    if (a7769137806217985202Arr.length > 0) {
                        i2 = spanned.getSpanEnd(a7769137806217985202Arr[0]);
                        str2 = str;
                    }
                }
                str2 = str;
                i2 = ((U17123917892906321416) q7316561721656982910.J(str2, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new U17123917892906321416(i))).c;
            }
            Integer valueOf = Integer.valueOf(i2);
            if (i2 != -1) {
                num = valueOf;
            }
        } else {
            str2 = str;
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str2);
        return characterInstance.following(i);
    }

    public static final int n(int i, String str) {
        D3638978315442423989 o2 = o();
        Integer num = null;
        if (o2 != null) {
            Integer valueOf = Integer.valueOf(o2.b(str, Math.max(0, i - 1)));
            if (valueOf.intValue() != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public static final D3638978315442423989 o() {
        if (!D3638978315442423989.d()) {
            return null;
        }
        D3638978315442423989 a2 = D3638978315442423989.a();
        if (a2.c() == 1) {
            return a2;
        }
        return null;
    }

    public static final Z7022156542152740569 p() {
        Z7022156542152740569 z7022156542152740569 = a;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        Q17593287602150918564 q17593287602150918564 = new Q17593287602150918564("Outlined.RestartAlt", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = A5540824790408504619.a;
        H10765568533039107979 h10765568533039107979 = new H10765568533039107979(U10174709222559481877.b);
        V14323974914327418545 d = G11450220448113054352.d(6.0f, 13.0f);
        d.e(0.0f, -1.65f, 0.67f, -3.15f, 1.76f, -4.24f);
        d.h(6.34f, 7.34f);
        d.d(4.9f, 8.79f, 4.0f, 10.79f, 4.0f, 13.0f);
        d.e(0.0f, 4.08f, 3.05f, 7.44f, 7.0f, 7.93f);
        d.s(-2.02f);
        d.d(8.17f, 18.43f, 6.0f, 15.97f, 6.0f, 13.0f);
        d.c();
        d.j(20.0f, 13.0f);
        d.e(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f);
        d.e(-0.06f, 0.0f, -0.12f, 0.01f, -0.18f, 0.01f);
        d.i(1.09f, -1.09f);
        d.h(11.5f, 2.5f);
        d.h(8.0f, 6.0f);
        d.i(3.5f, 3.5f);
        d.i(1.41f, -1.41f);
        d.i(-1.08f, -1.08f);
        d.d(11.89f, 7.01f, 11.95f, 7.0f, 12.0f, 7.0f);
        d.e(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        d.e(0.0f, 2.97f, -2.17f, 5.43f, -5.0f, 5.91f);
        d.s(2.02f);
        d.d(16.95f, 20.44f, 20.0f, 17.08f, 20.0f, 13.0f);
        d.c();
        Q17593287602150918564.a(q17593287602150918564, d.a, h10765568533039107979, null, 1.0f, 14336);
        Z7022156542152740569 b2 = q17593287602150918564.b();
        a = b2;
        return b2;
    }

    public static final native List q(A12041196496600152831 a12041196496600152831);

    public static final native String r(String str);

    public static final native G16047348585543571419 s(String str);

    public static final void t(Bundle bundle, String str, List list) {
        bundle.putStringArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
    }

    public static final native A12041196496600152831 u(F4096073349764486348 f4096073349764486348);

    public static final native void v(A12041196496600152831 a12041196496600152831, L12639328004344855510 l12639328004344855510);

    public abstract Typeface h(Context context, L933758655888641216 l933758655888641216, Resources resources, int i);

    public abstract Typeface i(Context context, J18236984568855953541[] j18236984568855953541Arr, int i);

    public Typeface j(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface k(Context context, Resources resources, int i, String str, int i2) {
        File l = T1335862270807194835.l(context);
        if (l == null) {
            return null;
        }
        try {
            if (T1335862270807194835.j(l, resources, i)) {
                return Typeface.createFromFile(l.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            l.delete();
        }
    }
}
