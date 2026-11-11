package p034.p035.p045;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import defpackage.C0726;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import p034.p035.p038.C1005;
import p237.p238.p239.p241.p242.C2786;

/* renamed from: づざかべべ.〳ぜぞぜべっ.のぷのちつ.〻ぞまぎな〻, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1072 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final C1072 f5531;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final C1073 f5532;

    /* renamed from: づざかべべ.〳ぜぞぜべっ.のぷのちつ.〻ぞまぎな〻$〳ぜぞぜべっ, reason: contains not printable characters */
    public static class C1073 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final C1072 f5533;

        public C1073(C1072 c1072) {
            this.f5533 = c1072;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1073)) {
                return false;
            }
            C1073 c1073 = (C1073) obj;
            return mo2431() == c1073.mo2431() && mo2437() == c1073.mo2437() && C2786.m4781(mo2430(), c1073.mo2430()) && C2786.m4781(mo2435(), c1073.mo2435()) && C2786.m4781(mo2436(), c1073.mo2436());
        }

        public int hashCode() {
            return C2786.m4799(Boolean.valueOf(mo2431()), Boolean.valueOf(mo2437()), mo2430(), mo2435(), mo2436());
        }

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public C1072 mo2428(int i, int i2, int i3, int i4) {
            return C1072.f5531;
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public C1072 mo2429() {
            return this.f5533;
        }

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public C1005 mo2430() {
            return C1005.f5372;
        }

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public boolean mo2431() {
            return false;
        }

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public C1072 mo2432() {
            return this.f5533;
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public C1072 mo2433() {
            return this.f5533;
        }

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public C1005 mo2434() {
            return mo2430();
        }

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public C1005 mo2435() {
            return C1005.f5372;
        }

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public C1101 mo2436() {
            return null;
        }

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public boolean mo2437() {
            return false;
        }
    }

    /* renamed from: づざかべべ.〳ぜぞぜべっ.のぷのちつ.〻ぞまぎな〻$〺つふすそ, reason: contains not printable characters */
    public static class C1074 extends C1076 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final WindowInsets.Builder f5534;

        public C1074() {
            this.f5534 = new WindowInsets.Builder();
        }

        public C1074(C1072 c1072) {
            WindowInsets m2421 = c1072.m2421();
            this.f5534 = m2421 != null ? new WindowInsets.Builder(m2421) : new WindowInsets.Builder();
        }

        @Override // p034.p035.p045.C1072.C1076
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public void mo2438(C1005 c1005) {
            this.f5534.setStableInsets(Insets.of(c1005.f5375, c1005.f5373, c1005.f5374, c1005.f5376));
        }

        @Override // p034.p035.p045.C1072.C1076
        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public void mo2439(C1005 c1005) {
            this.f5534.setSystemWindowInsets(Insets.of(c1005.f5375, c1005.f5373, c1005.f5374, c1005.f5376));
        }

        @Override // p034.p035.p045.C1072.C1076
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public C1072 mo2440() {
            return C1072.m2418(this.f5534.build());
        }
    }

    /* renamed from: づざかべべ.〳ぜぞぜべっ.のぷのちつ.〻ぞまぎな〻$ぁごぐすすぃ, reason: contains not printable characters */
    public static class C1075 extends C1079 {

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public C1005 f5535;

        public C1075(C1072 c1072, WindowInsets windowInsets) {
            super(c1072, windowInsets);
            this.f5535 = null;
        }

        @Override // p034.p035.p045.C1072.C1080, p034.p035.p045.C1072.C1073
        /* renamed from: 〳ぜぞぜべっ */
        public C1072 mo2428(int i, int i2, int i3, int i4) {
            return C1072.m2418(this.f5543.inset(i, i2, i3, i4));
        }

        @Override // p034.p035.p045.C1072.C1073
        /* renamed from: づざかべべ */
        public C1005 mo2434() {
            if (this.f5535 == null) {
                Insets mandatorySystemGestureInsets = this.f5543.getMandatorySystemGestureInsets();
                this.f5535 = C1005.m2331(mandatorySystemGestureInsets.left, mandatorySystemGestureInsets.top, mandatorySystemGestureInsets.right, mandatorySystemGestureInsets.bottom);
            }
            return this.f5535;
        }
    }

    /* renamed from: づざかべべ.〳ぜぞぜべっ.のぷのちつ.〻ぞまぎな〻$くし〴〺ぅ, reason: contains not printable characters */
    public static class C1076 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final C1072 f5536;

        public C1076() {
            this.f5536 = new C1072((C1072) null);
        }

        public C1076(C1072 c1072) {
            this.f5536 = c1072;
        }

        /* renamed from: 〺つふすそ */
        public void mo2438(C1005 c1005) {
        }

        /* renamed from: くし〴〺ぅ */
        public void mo2439(C1005 c1005) {
        }

        /* renamed from: げつ〴ぬぐ */
        public C1072 mo2440() {
            return this.f5536;
        }
    }

    /* renamed from: づざかべべ.〳ぜぞぜべっ.のぷのちつ.〻ぞまぎな〻$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1077 extends C1076 {

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public static Field f5537;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public static Constructor<WindowInsets> f5538;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public static boolean f5539;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public static boolean f5540;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public WindowInsets f5541;

        public C1077() {
            this.f5541 = m2441();
        }

        public C1077(C1072 c1072) {
            this.f5541 = c1072.m2421();
        }

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public static WindowInsets m2441() {
            if (!f5540) {
                try {
                    f5537 = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                f5540 = true;
            }
            Field field = f5537;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!f5539) {
                try {
                    f5538 = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException unused3) {
                }
                f5539 = true;
            }
            Constructor<WindowInsets> constructor = f5538;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException unused4) {
                }
            }
            return null;
        }

        @Override // p034.p035.p045.C1072.C1076
        /* renamed from: くし〴〺ぅ */
        public void mo2439(C1005 c1005) {
            WindowInsets windowInsets = this.f5541;
            if (windowInsets != null) {
                this.f5541 = windowInsets.replaceSystemWindowInsets(c1005.f5375, c1005.f5373, c1005.f5374, c1005.f5376);
            }
        }

        @Override // p034.p035.p045.C1072.C1076
        /* renamed from: げつ〴ぬぐ */
        public C1072 mo2440() {
            return C1072.m2418(this.f5541);
        }
    }

    /* renamed from: づざかべべ.〳ぜぞぜべっ.のぷのちつ.〻ぞまぎな〻$づざかべべ, reason: contains not printable characters */
    public static class C1078 extends C1080 {

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public C1005 f5542;

        public C1078(C1072 c1072, WindowInsets windowInsets) {
            super(c1072, windowInsets);
            this.f5542 = null;
        }

        @Override // p034.p035.p045.C1072.C1073
        /* renamed from: 〺つふすそ */
        public C1072 mo2429() {
            return C1072.m2418(this.f5543.consumeStableInsets());
        }

        @Override // p034.p035.p045.C1072.C1073
        /* renamed from: くし〴〺ぅ */
        public C1072 mo2432() {
            return C1072.m2418(this.f5543.consumeSystemWindowInsets());
        }

        @Override // p034.p035.p045.C1072.C1073
        /* renamed from: なぎぱいぢぎ */
        public final C1005 mo2435() {
            if (this.f5542 == null) {
                this.f5542 = C1005.m2331(this.f5543.getStableInsetLeft(), this.f5543.getStableInsetTop(), this.f5543.getStableInsetRight(), this.f5543.getStableInsetBottom());
            }
            return this.f5542;
        }

        @Override // p034.p035.p045.C1072.C1073
        /* renamed from: ぺぁあねじ */
        public boolean mo2437() {
            return this.f5543.isConsumed();
        }
    }

    /* renamed from: づざかべべ.〳ぜぞぜべっ.のぷのちつ.〻ぞまぎな〻$なぎぱいぢぎ, reason: contains not printable characters */
    public static class C1079 extends C1078 {
        public C1079(C1072 c1072, WindowInsets windowInsets) {
            super(c1072, windowInsets);
        }

        @Override // p034.p035.p045.C1072.C1073
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C1079) {
                return C0726.m1986(this.f5543, ((C1079) obj).f5543);
            }
            return false;
        }

        @Override // p034.p035.p045.C1072.C1073
        public int hashCode() {
            return this.f5543.hashCode();
        }

        @Override // p034.p035.p045.C1072.C1073
        /* renamed from: げつ〴ぬぐ */
        public C1072 mo2433() {
            return C1072.m2418(this.f5543.consumeDisplayCutout());
        }

        @Override // p034.p035.p045.C1072.C1073
        /* renamed from: びぐびあび */
        public C1101 mo2436() {
            DisplayCutout displayCutout = this.f5543.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new C1101(displayCutout);
        }
    }

    /* renamed from: づざかべべ.〳ぜぞぜべっ.のぷのちつ.〻ぞまぎな〻$びぐびあび, reason: contains not printable characters */
    public static class C1080 extends C1073 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final WindowInsets f5543;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public C1005 f5544;

        public C1080(C1072 c1072, WindowInsets windowInsets) {
            super(c1072);
            this.f5544 = null;
            this.f5543 = windowInsets;
        }

        @Override // p034.p035.p045.C1072.C1073
        /* renamed from: 〳ぜぞぜべっ */
        public C1072 mo2428(int i, int i2, int i3, int i4) {
            C1072 m2418 = C1072.m2418(this.f5543);
            int i5 = Build.VERSION.SDK_INT;
            C1076 c1074 = i5 >= 29 ? new C1074(m2418) : i5 >= 20 ? new C1077(m2418) : new C1076(m2418);
            c1074.mo2439(C1072.m2417(mo2430(), i, i2, i3, i4));
            c1074.mo2438(C1072.m2417(mo2435(), i, i2, i3, i4));
            return c1074.mo2440();
        }

        @Override // p034.p035.p045.C1072.C1073
        /* renamed from: ぁごぐすすぃ */
        public final C1005 mo2430() {
            if (this.f5544 == null) {
                this.f5544 = C1005.m2331(this.f5543.getSystemWindowInsetLeft(), this.f5543.getSystemWindowInsetTop(), this.f5543.getSystemWindowInsetRight(), this.f5543.getSystemWindowInsetBottom());
            }
            return this.f5544;
        }

        @Override // p034.p035.p045.C1072.C1073
        /* renamed from: いいにぽつ */
        public boolean mo2431() {
            return this.f5543.isRound();
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f5531 = (i >= 29 ? new C1074() : i >= 20 ? new C1077() : new C1076()).mo2440().f5532.mo2433().f5532.mo2429().m2423();
    }

    public C1072(WindowInsets windowInsets) {
        C1073 c1080;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            c1080 = new C1075(this, windowInsets);
        } else if (i >= 28) {
            c1080 = new C1079(this, windowInsets);
        } else if (i >= 21) {
            c1080 = new C1078(this, windowInsets);
        } else {
            if (i < 20) {
                this.f5532 = new C1073(this);
                return;
            }
            c1080 = new C1080(this, windowInsets);
        }
        this.f5532 = c1080;
    }

    public C1072(C1072 c1072) {
        this.f5532 = new C1073(this);
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static C1005 m2417(C1005 c1005, int i, int i2, int i3, int i4) {
        int max = Math.max(0, c1005.f5375 - i);
        int max2 = Math.max(0, c1005.f5373 - i2);
        int max3 = Math.max(0, c1005.f5374 - i3);
        int max4 = Math.max(0, c1005.f5376 - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? c1005 : C1005.m2331(max, max2, max3, max4);
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public static C1072 m2418(WindowInsets windowInsets) {
        windowInsets.getClass();
        return new C1072(windowInsets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1072) {
            return C2786.m4781(this.f5532, ((C1072) obj).f5532);
        }
        return false;
    }

    public int hashCode() {
        C1073 c1073 = this.f5532;
        if (c1073 == null) {
            return 0;
        }
        return c1073.hashCode();
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public boolean m2419() {
        return this.f5532.mo2437();
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int m2420() {
        return m2425().f5376;
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public WindowInsets m2421() {
        C1073 c1073 = this.f5532;
        if (c1073 instanceof C1080) {
            return ((C1080) c1073).f5543;
        }
        return null;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int m2422() {
        return m2425().f5375;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public C1072 m2423() {
        return this.f5532.mo2432();
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int m2424() {
        return m2425().f5373;
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public C1005 m2425() {
        return this.f5532.mo2430();
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int m2426() {
        return m2425().f5374;
    }

    @Deprecated
    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public C1072 m2427(int i, int i2, int i3, int i4) {
        int i5 = Build.VERSION.SDK_INT;
        C1076 c1074 = i5 >= 29 ? new C1074(this) : i5 >= 20 ? new C1077(this) : new C1076(this);
        c1074.mo2439(C1005.m2331(i, i2, i3, i4));
        return c1074.mo2440();
    }
}
