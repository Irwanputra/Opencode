package p034.p095;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import p034.p035.p045.C1096;

/* renamed from: づざかべべ.は〲ぱなで.せづっ〸ちね, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1714 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final Property<View, Float> f7879;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static final Property<View, Rect> f7880;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final C1708 f7881;

    /* renamed from: づざかべべ.は〲ぱなで.せづっ〸ちね$〺つふすそ, reason: contains not printable characters */
    public static class C1715 extends Property<View, Rect> {
        public C1715(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Rect get(View view) {
            return C1096.m2481(view);
        }

        @Override // android.util.Property
        public void set(View view, Rect rect) {
            C1096.m2494(view, rect);
        }
    }

    /* renamed from: づざかべべ.は〲ぱなで.せづっ〸ちね$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1716 extends Property<View, Float> {
        public C1716(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(View view) {
            return Float.valueOf(C1714.m3762(view));
        }

        @Override // android.util.Property
        public void set(View view, Float f) {
            float floatValue = f.floatValue();
            C1714.f7881.mo3750(view, floatValue);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f7881 = i >= 29 ? new C1697() : i >= 23 ? new C1688() : i >= 22 ? new C1704() : i >= 21 ? new C1707() : i >= 19 ? new C1739() : new C1708();
        f7879 = new C1716(Float.class, "translationAlpha");
        f7880 = new C1715(Rect.class, "clipBounds");
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static InterfaceC1699 m3760(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new C1717(view) : new C1719(view.getWindowToken());
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static void m3761(View view, int i, int i2, int i3, int i4) {
        f7881.mo3749(view, i, i2, i3, i4);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static float m3762(View view) {
        return f7881.mo3748(view);
    }
}
