package p131.p161.p162.p163.p189;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import p034.p095.C1687;
import p131.p161.p162.p163.p189.C2325;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぶでにく〼〳.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public interface InterfaceC2327 extends C2325.InterfaceC2326 {

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぶでにく〼〳.くし〴〺ぅ$〺つふすそ, reason: contains not printable characters */
    public static class C2328 implements TypeEvaluator<C2331> {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public static final TypeEvaluator<C2331> f9613 = new C2328();

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final C2331 f9614 = new C2331(null);

        @Override // android.animation.TypeEvaluator
        public C2331 evaluate(float f, C2331 c2331, C2331 c23312) {
            C2331 c23313 = c2331;
            C2331 c23314 = c23312;
            C2331 c23315 = this.f9614;
            float m3693 = C1687.m3693(c23313.f9618, c23314.f9618, f);
            float m36932 = C1687.m3693(c23313.f9616, c23314.f9616, f);
            float m36933 = C1687.m3693(c23313.f9617, c23314.f9617, f);
            c23315.f9618 = m3693;
            c23315.f9616 = m36932;
            c23315.f9617 = m36933;
            return this.f9614;
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぶでにく〼〳.くし〴〺ぅ$くし〴〺ぅ, reason: contains not printable characters */
    public static class C2329 extends Property<InterfaceC2327, C2331> {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public static final Property<InterfaceC2327, C2331> f9615 = new C2329("circularReveal");

        public C2329(String str) {
            super(C2331.class, str);
        }

        @Override // android.util.Property
        public C2331 get(InterfaceC2327 interfaceC2327) {
            return interfaceC2327.getRevealInfo();
        }

        @Override // android.util.Property
        public void set(InterfaceC2327 interfaceC2327, C2331 c2331) {
            interfaceC2327.setRevealInfo(c2331);
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぶでにく〼〳.くし〴〺ぅ$づざかべべ, reason: contains not printable characters */
    public static class C2331 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public float f9616;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public float f9617;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public float f9618;

        public C2331() {
        }

        public C2331(float f, float f2, float f3) {
            this.f9618 = f;
            this.f9616 = f2;
            this.f9617 = f3;
        }

        public C2331(C2330 c2330) {
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぶでにく〼〳.くし〴〺ぅ$びぐびあび, reason: contains not printable characters */
    public static class C2332 extends Property<InterfaceC2327, Integer> {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public static final Property<InterfaceC2327, Integer> f9619 = new C2332("circularRevealScrimColor");

        public C2332(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        public Integer get(InterfaceC2327 interfaceC2327) {
            return Integer.valueOf(interfaceC2327.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        public void set(InterfaceC2327 interfaceC2327, Integer num) {
            interfaceC2327.setCircularRevealScrimColor(num.intValue());
        }
    }

    int getCircularRevealScrimColor();

    C2331 getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(C2331 c2331);

    /* renamed from: くし〴〺ぅ */
    void mo1397();

    /* renamed from: げつ〴ぬぐ */
    void mo1398();
}
