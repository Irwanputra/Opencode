package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;
import p034.p035.p045.C1096;
import p034.p095.C1687;
import p131.p155.p156.p157.C2098;
import p131.p161.p162.p163.C2248;
import p131.p161.p162.p163.p177.C2226;
import p131.p161.p162.p163.p177.C2227;
import p131.p161.p162.p163.p177.C2228;
import p131.p161.p162.p163.p186.C2289;
import p131.p161.p162.p163.p186.C2290;
import p131.p161.p162.p163.p186.C2291;
import p131.p161.p162.p163.p186.C2293;
import p131.p161.p162.p163.p186.C2294;
import p131.p161.p162.p163.p186.C2297;
import p131.p161.p162.p163.p186.C2298;
import p131.p161.p162.p163.p189.C2325;
import p131.p161.p162.p163.p189.C2333;
import p131.p161.p162.p163.p189.InterfaceC2327;

@Deprecated
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public float f3635;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public float f3636;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final Rect f3637;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final RectF f3638;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final int[] f3639;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final RectF f3640;

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$〺つふすそ, reason: contains not printable characters */
    public static class C0485 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public C2298 f3641;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public C2291 f3642;
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0486 extends AnimatorListenerAdapter {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final /* synthetic */ View f3643;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final /* synthetic */ View f3644;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final /* synthetic */ boolean f3645;

        public C0486(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
            this.f3645 = z;
            this.f3643 = view;
            this.f3644 = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f3645) {
                return;
            }
            this.f3643.setVisibility(4);
            this.f3644.setAlpha(1.0f);
            this.f3644.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f3645) {
                this.f3643.setVisibility(0);
                this.f3644.setAlpha(0.0f);
                this.f3644.setVisibility(4);
            }
        }
    }

    public FabTransformationBehavior() {
        this.f3637 = new Rect();
        this.f3640 = new RectF();
        this.f3638 = new RectF();
        this.f3639 = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3637 = new Rect();
        this.f3640 = new RectF();
        this.f3638 = new RectF();
        this.f3639 = new int[2];
    }

    @TargetApi(21)
    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public final void m1555(View view, View view2, boolean z, boolean z2, C0485 c0485, List list) {
        ObjectAnimator ofFloat;
        float m2522 = C1096.m2522(view2) - C1096.m2522(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-m2522);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -m2522);
        }
        c0485.f3642.m4454("elevation").m4448(ofFloat);
        list.add(ofFloat);
    }

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public final ViewGroup m1556(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: ぅみぱぎぎ */
    public AnimatorSet mo1554(View view, View view2, boolean z, boolean z2) {
        InterfaceC2327 interfaceC2327;
        ArrayList arrayList;
        Animator animator;
        C2289 c2289;
        ArrayList arrayList2;
        ObjectAnimator ofInt;
        C0485 mo1564 = mo1564(view2.getContext(), z);
        if (z) {
            this.f3636 = view.getTranslationX();
            this.f3635 = view.getTranslationY();
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            m1555(view, view2, z, z2, mo1564, arrayList3);
        }
        RectF rectF = this.f3640;
        m1561(view, view2, z, z2, mo1564, arrayList3, rectF);
        float width = rectF.width();
        float height = rectF.height();
        float m1566 = m1566(view, view2, mo1564.f3641);
        float m1558 = m1558(view, view2, mo1564.f3641);
        Pair<C2289, C2289> m1562 = m1562(m1566, m1558, z, mo1564);
        C2289 c22892 = (C2289) m1562.first;
        C2289 c22893 = (C2289) m1562.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            m1566 = this.f3636;
        }
        fArr[0] = m1566;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            m1558 = this.f3635;
        }
        fArr2[0] = m1558;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        c22892.m4448(ofFloat);
        c22893.m4448(ofFloat2);
        arrayList3.add(ofFloat);
        arrayList3.add(ofFloat2);
        boolean z3 = view2 instanceof InterfaceC2327;
        if (z3 && (view instanceof ImageView)) {
            InterfaceC2327 interfaceC23272 = (InterfaceC2327) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(Base64.BASELENGTH);
                    }
                    ofInt = ObjectAnimator.ofInt(drawable, C2297.f9516, 0);
                } else {
                    ofInt = ObjectAnimator.ofInt(drawable, C2297.f9516, Base64.BASELENGTH);
                }
                ofInt.addUpdateListener(new C2228(this, view2));
                mo1564.f3642.m4454("iconFade").m4448(ofInt);
                arrayList3.add(ofInt);
                arrayList4.add(new C2226(this, interfaceC23272, drawable));
            }
        }
        if (z3) {
            InterfaceC2327 interfaceC23273 = (InterfaceC2327) view2;
            C2298 c2298 = mo1564.f3641;
            RectF rectF2 = this.f3640;
            RectF rectF3 = this.f3638;
            m1565(view, rectF2);
            rectF2.offset(this.f3636, this.f3635);
            m1565(view2, rectF3);
            rectF3.offset(-m1566(view, view2, c2298), 0.0f);
            float centerX = rectF2.centerX() - rectF3.left;
            C2298 c22982 = mo1564.f3641;
            RectF rectF4 = this.f3640;
            RectF rectF5 = this.f3638;
            m1565(view, rectF4);
            rectF4.offset(this.f3636, this.f3635);
            m1565(view2, rectF5);
            rectF5.offset(0.0f, -m1558(view, view2, c22982));
            float centerY = rectF4.centerY() - rectF5.top;
            ((FloatingActionButton) view).m1424(this.f3637);
            float width2 = this.f3637.width() / 2.0f;
            C2289 m4454 = mo1564.f3642.m4454("expansion");
            if (z) {
                if (!z2) {
                    interfaceC23273.setRevealInfo(new InterfaceC2327.C2331(centerX, centerY, width2));
                }
                if (z2) {
                    width2 = interfaceC23273.getRevealInfo().f9617;
                }
                Animator m3655 = C1687.m3655(interfaceC23273, centerX, centerY, C1687.m3732(centerX, centerY, 0.0f, 0.0f, width, height));
                m3655.addListener(new C2227(this, interfaceC23273));
                m1557(view2, m4454.f9500, (int) centerX, (int) centerY, width2, arrayList3);
                arrayList = arrayList4;
                c2289 = m4454;
                interfaceC2327 = interfaceC23273;
                animator = m3655;
            } else {
                C2289 c22894 = m4454;
                float f = interfaceC23273.getRevealInfo().f9617;
                Animator m36552 = C1687.m3655(interfaceC23273, centerX, centerY, width2);
                int i = (int) centerX;
                int i2 = (int) centerY;
                interfaceC2327 = interfaceC23273;
                m1557(view2, c22894.f9500, i, i2, f, arrayList3);
                long j = c22894.f9500;
                long j2 = c22894.f9498;
                C2291 c2291 = mo1564.f3642;
                int i3 = c2291.f9505.f6910;
                long j3 = 0;
                int i4 = 0;
                while (i4 < i3) {
                    int i5 = i3;
                    C2289 m3255 = c2291.f9505.m3255(i4);
                    j3 = Math.max(j3, m3255.f9500 + m3255.f9498);
                    i4++;
                    i3 = i5;
                    arrayList4 = arrayList4;
                    c22894 = c22894;
                    c2291 = c2291;
                }
                arrayList = arrayList4;
                C2289 c22895 = c22894;
                if (Build.VERSION.SDK_INT >= 21) {
                    long j4 = j + j2;
                    if (j4 < j3) {
                        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view2, i, i2, width2, width2);
                        createCircularReveal.setStartDelay(j4);
                        createCircularReveal.setDuration(j3 - j4);
                        arrayList3.add(createCircularReveal);
                    }
                }
                animator = m36552;
                c2289 = c22895;
            }
            c2289.m4448(animator);
            arrayList3.add(animator);
            arrayList2 = arrayList;
            arrayList2.add(new C2333(interfaceC2327));
        } else {
            arrayList2 = arrayList4;
        }
        m1559(view, view2, z, z2, mo1564, arrayList3);
        m1560(view2, z, z2, mo1564, arrayList3);
        AnimatorSet animatorSet = new AnimatorSet();
        C1687.m3685(animatorSet, arrayList3);
        animatorSet.addListener(new C0486(this, z, view2, view));
        int size = arrayList2.size();
        for (int i6 = 0; i6 < size; i6++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i6));
        }
        return animatorSet;
    }

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public final void m1557(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (Build.VERSION.SDK_INT < 21 || j <= 0) {
            return;
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
        createCircularReveal.setStartDelay(0L);
        createCircularReveal.setDuration(j);
        list.add(createCircularReveal);
    }

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public final float m1558(View view, View view2, C2298 c2298) {
        RectF rectF = this.f3640;
        RectF rectF2 = this.f3638;
        m1565(view, rectF);
        rectF.offset(this.f3636, this.f3635);
        m1565(view2, rectF2);
        c2298.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public final void m1559(View view, View view2, boolean z, boolean z2, C0485 c0485, List list) {
        ObjectAnimator ofInt;
        if (view2 instanceof InterfaceC2327) {
            InterfaceC2327 interfaceC2327 = (InterfaceC2327) view2;
            ColorStateList m2520 = C1096.m2520(view);
            int colorForState = m2520 != null ? m2520.getColorForState(view.getDrawableState(), m2520.getDefaultColor()) : 0;
            int i = 16777215 & colorForState;
            if (z) {
                if (!z2) {
                    interfaceC2327.setCircularRevealScrimColor(colorForState);
                }
                ofInt = ObjectAnimator.ofInt(interfaceC2327, InterfaceC2327.C2332.f9619, i);
            } else {
                ofInt = ObjectAnimator.ofInt(interfaceC2327, InterfaceC2327.C2332.f9619, colorForState);
            }
            ofInt.setEvaluator(C2290.f9503);
            c0485.f3642.m4454("color").m4448(ofInt);
            list.add(ofInt);
        }
    }

    /* renamed from: けときぜと, reason: contains not printable characters */
    public final void m1560(View view, boolean z, boolean z2, C0485 c0485, List list) {
        ViewGroup m1556;
        ObjectAnimator ofFloat;
        if (view instanceof ViewGroup) {
            if ((view instanceof InterfaceC2327) && C2325.f9603 == 0) {
                return;
            }
            View findViewById = view.findViewById(C2248.mtrl_child_content_container);
            if (findViewById != null) {
                m1556 = m1556(findViewById);
            } else {
                if ((view instanceof TransformationChildLayout) || (view instanceof TransformationChildCard)) {
                    view = ((ViewGroup) view).getChildAt(0);
                }
                m1556 = m1556(view);
            }
            if (m1556 == null) {
                return;
            }
            if (z) {
                if (!z2) {
                    C2293.f9506.set(m1556, Float.valueOf(0.0f));
                }
                ofFloat = ObjectAnimator.ofFloat(m1556, C2293.f9506, 1.0f);
            } else {
                ofFloat = ObjectAnimator.ofFloat(m1556, C2293.f9506, 0.0f);
            }
            c0485.f3642.m4454("contentFade").m4448(ofFloat);
            list.add(ofFloat);
        }
    }

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public final void m1561(View view, View view2, boolean z, boolean z2, C0485 c0485, List list, RectF rectF) {
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        float m1566 = m1566(view, view2, c0485.f3641);
        float m1558 = m1558(view, view2, c0485.f3641);
        Pair<C2289, C2289> m1562 = m1562(m1566, m1558, z, c0485);
        C2289 c2289 = (C2289) m1562.first;
        C2289 c22892 = (C2289) m1562.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-m1566);
                view2.setTranslationY(-m1558);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            float m1563 = m1563(c0485, c2289, -m1566, 0.0f);
            float m15632 = m1563(c0485, c22892, -m1558, 0.0f);
            Rect rect = this.f3637;
            view2.getWindowVisibleDisplayFrame(rect);
            RectF rectF2 = this.f3640;
            rectF2.set(rect);
            RectF rectF3 = this.f3638;
            m1565(view2, rectF3);
            rectF3.offset(m1563, m15632);
            rectF3.intersect(rectF2);
            rectF.set(rectF3);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -m1566);
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -m1558);
        }
        c2289.m4448(ofFloat);
        c22892.m4448(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public final Pair<C2289, C2289> m1562(float f, float f2, boolean z, C0485 c0485) {
        C2289 m4454;
        C2291 c2291;
        String str;
        if (f == 0.0f || f2 == 0.0f) {
            m4454 = c0485.f3642.m4454("translationXLinear");
            c2291 = c0485.f3642;
            str = "translationYLinear";
        } else if ((!z || f2 >= 0.0f) && (z || f2 <= 0.0f)) {
            m4454 = c0485.f3642.m4454("translationXCurveDownwards");
            c2291 = c0485.f3642;
            str = "translationYCurveDownwards";
        } else {
            m4454 = c0485.f3642.m4454("translationXCurveUpwards");
            c2291 = c0485.f3642;
            str = "translationYCurveUpwards";
        }
        return new Pair<>(m4454, c2291.m4454(str));
    }

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public final float m1563(C0485 c0485, C2289 c2289, float f, float f2) {
        long j = c2289.f9500;
        long j2 = c2289.f9498;
        C2289 m4454 = c0485.f3642.m4454("expansion");
        float interpolation = c2289.m4447().getInterpolation((((m4454.f9500 + m4454.f9498) + 17) - j) / j2);
        TimeInterpolator timeInterpolator = C2294.f9509;
        return C2098.m4188(f2, f, interpolation, f);
    }

    /* renamed from: ながふずは, reason: contains not printable characters */
    public abstract C0485 mo1564(Context context, boolean z);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: なぎぱいぢぎ */
    public void mo361(CoordinatorLayout.C0133 c0133) {
        if (c0133.f986 == 0) {
            c0133.f986 = 80;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: びぐびあび */
    public boolean mo365(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public final void m1565(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f3639);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public final float m1566(View view, View view2, C2298 c2298) {
        RectF rectF = this.f3640;
        RectF rectF2 = this.f3638;
        m1565(view, rectF);
        rectF.offset(this.f3636, this.f3635);
        m1565(view2, rectF2);
        c2298.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }
}
