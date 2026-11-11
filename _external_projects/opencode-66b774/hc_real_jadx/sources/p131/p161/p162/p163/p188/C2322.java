package p131.p161.p162.p163.p188;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import p034.p035.p043.C1067;
import p131.p161.p162.p163.C2224;
import p131.p161.p162.p163.p173.C2163;
import p131.p161.p162.p163.p173.C2180;
import p131.p161.p162.p163.p181.C2235;
import p131.p161.p162.p163.p192.InterfaceC2348;
import p237.p238.p239.p241.p242.C2786;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.びえぁぜい.ぺふねづ〺, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2322 extends C2301 {

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.びえぁぜい.ぺふねづ〺$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C2323 extends C2163 {
        public C2323(C2180 c2180) {
            super(c2180);
        }

        @Override // p131.p161.p162.p163.p173.C2163, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    public C2322(FloatingActionButton floatingActionButton, InterfaceC2348 interfaceC2348) {
        super(floatingActionButton, interfaceC2348);
    }

    @Override // p131.p161.p162.p163.p188.C2301
    /* renamed from: ぁごぐすすぃ */
    public void mo4459(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        C2180 c2180 = this.f9539;
        c2180.getClass();
        C2323 c2323 = new C2323(c2180);
        this.f9528 = c2323;
        c2323.setTintList(colorStateList);
        if (mode != null) {
            this.f9528.setTintMode(mode);
        }
        this.f9528.m4249(this.f9535.getContext());
        if (i > 0) {
            Context context = this.f9535.getContext();
            C2180 c21802 = this.f9539;
            c21802.getClass();
            C2313 c2313 = new C2313(c21802);
            int m2405 = C1067.m2405(context, C2224.design_fab_stroke_top_outer_color);
            int m24052 = C1067.m2405(context, C2224.design_fab_stroke_top_inner_color);
            int m24053 = C1067.m2405(context, C2224.design_fab_stroke_end_inner_color);
            int m24054 = C1067.m2405(context, C2224.design_fab_stroke_end_outer_color);
            c2313.f9590 = m2405;
            c2313.f9579 = m24052;
            c2313.f9591 = m24053;
            c2313.f9585 = m24054;
            float f = i;
            if (c2313.f9576 != f) {
                c2313.f9576 = f;
                c2313.f9577.setStrokeWidth(f * 1.3333f);
                c2313.f9589 = true;
                c2313.invalidateSelf();
            }
            c2313.m4484(colorStateList);
            this.f9553 = c2313;
            C2313 c23132 = this.f9553;
            c23132.getClass();
            C2163 c2163 = this.f9528;
            c2163.getClass();
            drawable = new LayerDrawable(new Drawable[]{c23132, c2163});
        } else {
            this.f9553 = null;
            drawable = this.f9528;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(C2235.m4345(colorStateList2), drawable, null);
        this.f9538 = rippleDrawable;
        this.f9544 = rippleDrawable;
    }

    @Override // p131.p161.p162.p163.p188.C2301
    /* renamed from: いいにぽつ */
    public void mo4460() {
    }

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public final Animator m4486(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f9535, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f9535, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(C2301.f9526);
        return animatorSet;
    }

    @Override // p131.p161.p162.p163.p188.C2301
    /* renamed from: ぇぬぎばつ */
    public boolean mo4461() {
        return false;
    }

    @Override // p131.p161.p162.p163.p188.C2301
    /* renamed from: ごづごきえ */
    public boolean mo4467() {
        return FloatingActionButton.this.f3289 || !m4472();
    }

    @Override // p131.p161.p162.p163.p188.C2301
    /* renamed from: ざとぅぼこ〺 */
    public void mo4469(ColorStateList colorStateList) {
        Drawable drawable = this.f9538;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(C2235.m4345(colorStateList));
        } else if (drawable != null) {
            C2786.m4788(drawable, C2235.m4345(colorStateList));
        }
    }

    @Override // p131.p161.p162.p163.p188.C2301
    /* renamed from: づざかべべ */
    public float mo4470() {
        return this.f9535.getElevation();
    }

    @Override // p131.p161.p162.p163.p188.C2301
    /* renamed from: てぜきぽく */
    public void mo4471(int[] iArr) {
        FloatingActionButton floatingActionButton;
        if (Build.VERSION.SDK_INT == 21) {
            float f = 0.0f;
            if (this.f9535.isEnabled()) {
                this.f9535.setElevation(this.f9527);
                if (this.f9535.isPressed()) {
                    floatingActionButton = this.f9535;
                    f = this.f9531;
                } else if (this.f9535.isFocused() || this.f9535.isHovered()) {
                    floatingActionButton = this.f9535;
                    f = this.f9556;
                }
                floatingActionButton.setTranslationZ(f);
            }
            this.f9535.setElevation(0.0f);
            floatingActionButton = this.f9535;
            floatingActionButton.setTranslationZ(f);
        }
    }

    @Override // p131.p161.p162.p163.p188.C2301
    /* renamed from: なぎぱいぢぎ */
    public void mo4473(Rect rect) {
        if (FloatingActionButton.this.f3289) {
            super.mo4473(rect);
        } else {
            int sizeDimension = !m4472() ? (this.f9557 - this.f9535.getSizeDimension()) / 2 : 0;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    @Override // p131.p161.p162.p163.p188.C2301
    /* renamed from: のぷのちつ */
    public void mo4474(float f, float f2, float f3) {
        int i = Build.VERSION.SDK_INT;
        if (i == 21) {
            this.f9535.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(C2301.f9521, m4486(f, f3));
            stateListAnimator.addState(C2301.f9524, m4486(f, f2));
            stateListAnimator.addState(C2301.f9525, m4486(f, f2));
            stateListAnimator.addState(C2301.f9523, m4486(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f9535, "elevation", f).setDuration(0L));
            if (i >= 22 && i <= 24) {
                FloatingActionButton floatingActionButton = this.f9535;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f9535, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(C2301.f9526);
            stateListAnimator.addState(C2301.f9522, animatorSet);
            stateListAnimator.addState(C2301.f9520, m4486(0.0f, 0.0f));
            this.f9535.setStateListAnimator(stateListAnimator);
        }
        if (mo4467()) {
            m4458();
        }
    }

    @Override // p131.p161.p162.p163.p188.C2301
    /* renamed from: びぐびあび */
    public C2163 mo4476() {
        C2180 c2180 = this.f9539;
        c2180.getClass();
        return new C2323(c2180);
    }

    @Override // p131.p161.p162.p163.p188.C2301
    /* renamed from: ぶでにく〼〳 */
    public void mo4477() {
    }

    @Override // p131.p161.p162.p163.p188.C2301
    /* renamed from: ぺふねづ〺 */
    public void mo4480() {
        m4458();
    }
}
