package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import org.xmlpull.v1.XmlPullParser;
import p034.p035.p043.p044.C1056;
import p034.p035.p045.C1096;
import p034.p095.C1700;
import p034.p095.C1701;
import p034.p095.C1712;
import p034.p095.C1735;

/* loaded from: /tmp/opencode/hc_real.dex */
public class Slide extends Visibility {

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public InterfaceC0277 f1781;

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public static final TimeInterpolator f1778 = new DecelerateInterpolator();

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public static final TimeInterpolator f1773 = new AccelerateInterpolator();

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public static final InterfaceC0277 f1776 = new C0279();

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public static final InterfaceC0277 f1780 = new C0276();

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public static final InterfaceC0277 f1774 = new C0278();

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public static final InterfaceC0277 f1777 = new C0282();

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public static final InterfaceC0277 f1779 = new C0280();

    /* renamed from: けときぜと, reason: contains not printable characters */
    public static final InterfaceC0277 f1775 = new C0281();

    /* renamed from: androidx.transition.Slide$〳ぜぞぜべっ, reason: contains not printable characters */
    public static abstract class AbstractC0275 implements InterfaceC0277 {
        public AbstractC0275(C0279 c0279) {
        }

        @Override // androidx.transition.Slide.InterfaceC0277
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public float mo1010(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    /* renamed from: androidx.transition.Slide$〺つふすそ, reason: contains not printable characters */
    public static class C0276 extends AbstractC0275 {
        public C0276() {
            super(null);
        }

        @Override // androidx.transition.Slide.InterfaceC0277
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public float mo1011(ViewGroup viewGroup, View view) {
            boolean z = C1096.m2491(viewGroup) == 1;
            float translationX = view.getTranslationX();
            float width = viewGroup.getWidth();
            return z ? translationX + width : translationX - width;
        }
    }

    /* renamed from: androidx.transition.Slide$ぁごぐすすぃ, reason: contains not printable characters */
    public interface InterfaceC0277 {
        /* renamed from: 〺つふすそ */
        float mo1011(ViewGroup viewGroup, View view);

        /* renamed from: げつ〴ぬぐ */
        float mo1010(ViewGroup viewGroup, View view);
    }

    /* renamed from: androidx.transition.Slide$くし〴〺ぅ, reason: contains not printable characters */
    public static class C0278 extends AbstractC0283 {
        public C0278() {
            super(null);
        }

        @Override // androidx.transition.Slide.InterfaceC0277
        /* renamed from: げつ〴ぬぐ */
        public float mo1010(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    /* renamed from: androidx.transition.Slide$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C0279 extends AbstractC0275 {
        public C0279() {
            super(null);
        }

        @Override // androidx.transition.Slide.InterfaceC0277
        /* renamed from: 〺つふすそ */
        public float mo1011(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* renamed from: androidx.transition.Slide$づざかべべ, reason: contains not printable characters */
    public static class C0280 extends AbstractC0275 {
        public C0280() {
            super(null);
        }

        @Override // androidx.transition.Slide.InterfaceC0277
        /* renamed from: 〺つふすそ */
        public float mo1011(ViewGroup viewGroup, View view) {
            boolean z = C1096.m2491(viewGroup) == 1;
            float translationX = view.getTranslationX();
            float width = viewGroup.getWidth();
            return z ? translationX - width : translationX + width;
        }
    }

    /* renamed from: androidx.transition.Slide$なぎぱいぢぎ, reason: contains not printable characters */
    public static class C0281 extends AbstractC0283 {
        public C0281() {
            super(null);
        }

        @Override // androidx.transition.Slide.InterfaceC0277
        /* renamed from: げつ〴ぬぐ */
        public float mo1010(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    /* renamed from: androidx.transition.Slide$びぐびあび, reason: contains not printable characters */
    public static class C0282 extends AbstractC0275 {
        public C0282() {
            super(null);
        }

        @Override // androidx.transition.Slide.InterfaceC0277
        /* renamed from: 〺つふすそ */
        public float mo1011(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* renamed from: androidx.transition.Slide$ぺぁあねじ, reason: contains not printable characters */
    public static abstract class AbstractC0283 implements InterfaceC0277 {
        public AbstractC0283(C0279 c0279) {
        }

        @Override // androidx.transition.Slide.InterfaceC0277
        /* renamed from: 〺つふすそ */
        public float mo1011(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    public Slide() {
        this.f1781 = f1775;
        m1009(80);
    }

    @SuppressLint({"RestrictedApi"})
    public Slide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1781 = f1775;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1712.f7873);
        int m2395 = C1056.m2395(obtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        obtainStyledAttributes.recycle();
        m1009(m2395);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    /* renamed from: ぁごぐすすぃ */
    public void mo986(C1700 c1700) {
        m1053(c1700);
        int[] iArr = new int[2];
        c1700.f7838.getLocationOnScreen(iArr);
        c1700.f7840.put("android:slide:screenPosition", iArr);
    }

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public void m1009(int i) {
        InterfaceC0277 interfaceC0277;
        if (i == 3) {
            interfaceC0277 = f1776;
        } else if (i == 5) {
            interfaceC0277 = f1777;
        } else if (i == 48) {
            interfaceC0277 = f1774;
        } else if (i == 80) {
            interfaceC0277 = f1775;
        } else if (i == 8388611) {
            interfaceC0277 = f1780;
        } else {
            if (i != 8388613) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            interfaceC0277 = f1779;
        }
        this.f1781 = interfaceC0277;
        C1701 c1701 = new C1701();
        c1701.f7841 = i;
        this.f1793 = c1701;
    }

    @Override // androidx.transition.Visibility
    /* renamed from: ぇとしたべど */
    public Animator mo1005(ViewGroup viewGroup, View view, C1700 c1700, C1700 c17002) {
        int[] iArr = (int[]) c1700.f7840.get("android:slide:screenPosition");
        return C1735.m3782(view, c1700, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f1781.mo1011(viewGroup, view), this.f1781.mo1010(viewGroup, view), f1773, this);
    }

    @Override // androidx.transition.Visibility
    /* renamed from: おかぷせ〱 */
    public Animator mo1006(ViewGroup viewGroup, View view, C1700 c1700, C1700 c17002) {
        int[] iArr = (int[]) c17002.f7840.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return C1735.m3782(view, c17002, iArr[0], iArr[1], this.f1781.mo1011(viewGroup, view), this.f1781.mo1010(viewGroup, view), translationX, translationY, f1778, this);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    /* renamed from: びぐびあび */
    public void mo988(C1700 c1700) {
        m1053(c1700);
        int[] iArr = new int[2];
        c1700.f7838.getLocationOnScreen(iArr);
        c1700.f7840.put("android:slide:screenPosition", iArr);
    }
}
