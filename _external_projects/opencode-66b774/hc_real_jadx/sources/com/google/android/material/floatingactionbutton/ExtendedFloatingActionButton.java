package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.Iterator;
import java.util.List;
import p034.p035.p045.C1096;
import p131.p161.p162.p163.C2111;
import p131.p161.p162.p163.C2229;
import p131.p161.p162.p163.C2243;
import p131.p161.p162.p163.C2350;
import p131.p161.p162.p163.p185.C2252;
import p131.p161.p162.p163.p186.C2291;
import p131.p161.p162.p163.p188.AbstractC2310;
import p131.p161.p162.p163.p188.C2316;
import p131.p161.p162.p163.p188.C2320;
import p131.p161.p162.p163.p188.InterfaceC2318;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.InterfaceC0129 {

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public final InterfaceC2318 f3258;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public boolean f3259;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public final CoordinatorLayout.Behavior<ExtendedFloatingActionButton> f3260;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public final C2316 f3261;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public final InterfaceC2318 f3262;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public final InterfaceC2318 f3263;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public int f3264;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public final InterfaceC2318 f3265;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public static final int f3257 = C2350.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public static final Property<View, Float> f3256 = new C0438(Float.class, "width");

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public static final Property<View, Float> f3255 = new C0442(Float.class, "height");

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public boolean f3266;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public boolean f3267;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public Rect f3268;

        public ExtendedFloatingActionButtonBehavior() {
            this.f3266 = false;
            this.f3267 = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2243.ExtendedFloatingActionButton_Behavior_Layout);
            this.f3266 = obtainStyledAttributes.getBoolean(C2243.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.f3267 = obtainStyledAttributes.getBoolean(C2243.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: ぁごぐすすぃ */
        public boolean mo346(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                m1412(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.C0133 ? ((CoordinatorLayout.C0133) layoutParams).f994 instanceof BottomSheetBehavior : false) {
                    m1411(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
        public final boolean m1411(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m1413(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0133) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                ExtendedFloatingActionButton.m1410(extendedFloatingActionButton, this.f3267 ? extendedFloatingActionButton.f3262 : extendedFloatingActionButton.f3258);
                return true;
            }
            ExtendedFloatingActionButton.m1410(extendedFloatingActionButton, this.f3267 ? extendedFloatingActionButton.f3263 : extendedFloatingActionButton.f3265);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: げつ〴ぬぐ */
        public /* bridge */ /* synthetic */ boolean mo354(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        /* renamed from: どぇぞほだ, reason: contains not printable characters */
        public final boolean m1412(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m1413(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f3268 == null) {
                this.f3268 = new Rect();
            }
            Rect rect = this.f3268;
            C2252.m4402(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                ExtendedFloatingActionButton.m1410(extendedFloatingActionButton, this.f3267 ? extendedFloatingActionButton.f3262 : extendedFloatingActionButton.f3258);
                return true;
            }
            ExtendedFloatingActionButton.m1410(extendedFloatingActionButton, this.f3267 ? extendedFloatingActionButton.f3263 : extendedFloatingActionButton.f3265);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: なぎぱいぢぎ */
        public void mo361(CoordinatorLayout.C0133 c0133) {
            if (c0133.f986 == 0) {
                c0133.f986 = 80;
            }
        }

        /* renamed from: なぶひせが, reason: contains not printable characters */
        public final boolean m1413(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f3266 || this.f3267) && ((CoordinatorLayout.C0133) extendedFloatingActionButton.getLayoutParams()).f997 == view.getId();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: ぺふねづ〺 */
        public boolean mo369(CoordinatorLayout coordinatorLayout, View view, int i) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            List<View> m331 = coordinatorLayout.m331(extendedFloatingActionButton);
            int size = m331.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = m331.get(i2);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.C0133 ? ((CoordinatorLayout.C0133) layoutParams).f994 instanceof BottomSheetBehavior : false) && m1411(view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (m1412(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m340(extendedFloatingActionButton, i);
            return true;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$〳ぜぞぜべっ, reason: contains not printable characters */
    public class C0435 extends AbstractC2310 {
        public C0435(C2316 c2316) {
            super(ExtendedFloatingActionButton.this, c2316);
        }

        @Override // p131.p161.p162.p163.p188.AbstractC2310, p131.p161.p162.p163.p188.InterfaceC2318
        public void onAnimationStart(Animator animator) {
            C2316 c2316 = this.f9571;
            Animator animator2 = c2316.f9593;
            if (animator2 != null) {
                animator2.cancel();
            }
            c2316.f9593 = animator;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.f3264 = 2;
        }

        @Override // p131.p161.p162.p163.p188.InterfaceC2318
        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public boolean mo1414() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            int i = ExtendedFloatingActionButton.f3257;
            int visibility = extendedFloatingActionButton.getVisibility();
            int i2 = extendedFloatingActionButton.f3264;
            if (visibility != 0) {
                if (i2 != 2) {
                    return false;
                }
            } else if (i2 == 1) {
                return false;
            }
            return true;
        }

        @Override // p131.p161.p162.p163.p188.InterfaceC2318
        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int mo1415() {
            return C2229.mtrl_extended_fab_show_motion_spec;
        }

        @Override // p131.p161.p162.p163.p188.AbstractC2310, p131.p161.p162.p163.p188.InterfaceC2318
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void mo1416() {
            super.mo1416();
            ExtendedFloatingActionButton.this.f3264 = 0;
        }

        @Override // p131.p161.p162.p163.p188.InterfaceC2318
        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public void mo1417(AbstractC0437 abstractC0437) {
            if (abstractC0437 != null) {
                throw null;
            }
        }

        @Override // p131.p161.p162.p163.p188.InterfaceC2318
        /* renamed from: びぐびあび, reason: contains not printable characters */
        public void mo1418() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$〺つふすそ, reason: contains not printable characters */
    public class C0436 implements InterfaceC0443 {
        public C0436() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC0443
        public int getHeight() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC0443
        public ViewGroup.LayoutParams getLayoutParams() {
            return new ViewGroup.LayoutParams(ExtendedFloatingActionButton.this.getCollapsedSize(), ExtendedFloatingActionButton.this.getCollapsedSize());
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC0443
        public int getWidth() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ぁごぐすすぃ, reason: contains not printable characters */
    public static abstract class AbstractC0437 {
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$くし〴〺ぅ, reason: contains not printable characters */
    public static class C0438 extends Property<View, Float> {
        public C0438(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        public void set(View view, Float f) {
            View view2 = view;
            view2.getLayoutParams().width = f.intValue();
            view2.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0439 implements InterfaceC0443 {
        public C0439() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC0443
        public int getHeight() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC0443
        public ViewGroup.LayoutParams getLayoutParams() {
            return new ViewGroup.LayoutParams(-2, -2);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC0443
        public int getWidth() {
            return ExtendedFloatingActionButton.this.getMeasuredWidth();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$づざかべべ, reason: contains not printable characters */
    public class C0440 extends AbstractC2310 {

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public final boolean f3272;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public final InterfaceC0443 f3273;

        public C0440(C2316 c2316, InterfaceC0443 interfaceC0443, boolean z) {
            super(ExtendedFloatingActionButton.this, c2316);
            this.f3273 = interfaceC0443;
            this.f3272 = z;
        }

        @Override // p131.p161.p162.p163.p188.AbstractC2310, p131.p161.p162.p163.p188.InterfaceC2318
        public void onAnimationStart(Animator animator) {
            C2316 c2316 = this.f9571;
            Animator animator2 = c2316.f9593;
            if (animator2 != null) {
                animator2.cancel();
            }
            c2316.f9593 = animator;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.f3259 = this.f3272;
            extendedFloatingActionButton.setHorizontallyScrolling(true);
        }

        @Override // p131.p161.p162.p163.p188.InterfaceC2318
        /* renamed from: ぁごぐすすぃ */
        public boolean mo1414() {
            boolean z = this.f3272;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            return z == extendedFloatingActionButton.f3259 || extendedFloatingActionButton.getIcon() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }

        @Override // p131.p161.p162.p163.p188.InterfaceC2318
        /* renamed from: くし〴〺ぅ */
        public int mo1415() {
            return C2229.mtrl_extended_fab_change_size_motion_spec;
        }

        @Override // p131.p161.p162.p163.p188.AbstractC2310, p131.p161.p162.p163.p188.InterfaceC2318
        /* renamed from: げつ〴ぬぐ */
        public void mo1416() {
            super.mo1416();
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.f3273.getLayoutParams().width;
            layoutParams.height = this.f3273.getLayoutParams().height;
        }

        @Override // p131.p161.p162.p163.p188.AbstractC2310, p131.p161.p162.p163.p188.InterfaceC2318
        /* renamed from: づざかべべ, reason: contains not printable characters */
        public AnimatorSet mo1419() {
            C2291 m4483 = m4483();
            if (m4483.m4452("width")) {
                PropertyValuesHolder[] m4453 = m4483.m4453("width");
                m4453[0].setFloatValues(ExtendedFloatingActionButton.this.getWidth(), this.f3273.getWidth());
                m4483.f9504.put("width", m4453);
            }
            if (m4483.m4452("height")) {
                PropertyValuesHolder[] m44532 = m4483.m4453("height");
                m44532[0].setFloatValues(ExtendedFloatingActionButton.this.getHeight(), this.f3273.getHeight());
                m4483.f9504.put("height", m44532);
            }
            return m4482(m4483);
        }

        @Override // p131.p161.p162.p163.p188.InterfaceC2318
        /* renamed from: なぎぱいぢぎ */
        public void mo1417(AbstractC0437 abstractC0437) {
            if (abstractC0437 == null) {
                return;
            }
            boolean z = this.f3272;
            throw null;
        }

        @Override // p131.p161.p162.p163.p188.InterfaceC2318
        /* renamed from: びぐびあび */
        public void mo1418() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.f3259 = this.f3272;
            ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.f3273.getLayoutParams().width;
            layoutParams.height = this.f3273.getLayoutParams().height;
            ExtendedFloatingActionButton.this.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$なぎぱいぢぎ, reason: contains not printable characters */
    public class C0441 extends AbstractC2310 {

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public boolean f3276;

        public C0441(C2316 c2316) {
            super(ExtendedFloatingActionButton.this, c2316);
        }

        @Override // p131.p161.p162.p163.p188.AbstractC2310, p131.p161.p162.p163.p188.InterfaceC2318
        public void onAnimationStart(Animator animator) {
            C2316 c2316 = this.f9571;
            Animator animator2 = c2316.f9593;
            if (animator2 != null) {
                animator2.cancel();
            }
            c2316.f9593 = animator;
            this.f3276 = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.f3264 = 1;
        }

        @Override // p131.p161.p162.p163.p188.AbstractC2310, p131.p161.p162.p163.p188.InterfaceC2318
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public void mo1420() {
            this.f9571.f9593 = null;
            this.f3276 = true;
        }

        @Override // p131.p161.p162.p163.p188.InterfaceC2318
        /* renamed from: ぁごぐすすぃ */
        public boolean mo1414() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            int i = ExtendedFloatingActionButton.f3257;
            int visibility = extendedFloatingActionButton.getVisibility();
            int i2 = extendedFloatingActionButton.f3264;
            if (visibility == 0) {
                if (i2 != 1) {
                    return false;
                }
            } else if (i2 == 2) {
                return false;
            }
            return true;
        }

        @Override // p131.p161.p162.p163.p188.InterfaceC2318
        /* renamed from: くし〴〺ぅ */
        public int mo1415() {
            return C2229.mtrl_extended_fab_hide_motion_spec;
        }

        @Override // p131.p161.p162.p163.p188.AbstractC2310, p131.p161.p162.p163.p188.InterfaceC2318
        /* renamed from: げつ〴ぬぐ */
        public void mo1416() {
            super.mo1416();
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.f3264 = 0;
            if (this.f3276) {
                return;
            }
            extendedFloatingActionButton.setVisibility(8);
        }

        @Override // p131.p161.p162.p163.p188.InterfaceC2318
        /* renamed from: なぎぱいぢぎ */
        public void mo1417(AbstractC0437 abstractC0437) {
            if (abstractC0437 != null) {
                throw null;
            }
        }

        @Override // p131.p161.p162.p163.p188.InterfaceC2318
        /* renamed from: びぐびあび */
        public void mo1418() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$びぐびあび, reason: contains not printable characters */
    public static class C0442 extends Property<View, Float> {
        public C0442(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        public void set(View view, Float f) {
            View view2 = view;
            view2.getLayoutParams().height = f.intValue();
            view2.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ぺぁあねじ, reason: contains not printable characters */
    public interface InterfaceC0443 {
        int getHeight();

        ViewGroup.LayoutParams getLayoutParams();

        int getWidth();
    }

    public ExtendedFloatingActionButton(Context context) {
        this(context, null);
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2111.extendedFloatingActionButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ExtendedFloatingActionButton(android.content.Context r17, android.util.AttributeSet r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = r19
            int r9 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.f3257
            r1 = r17
            android.content.Context r1 = p131.p161.p162.p163.p164.p165.C2112.m4210(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = 0
            r0.f3264 = r10
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.びえぁぜい.げつ〴ぬぐ r1 = new なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.びえぁぜい.げつ〴ぬぐ
            r1.<init>()
            r0.f3261 = r1
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$〳ぜぞぜべっ r11 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$〳ぜぞぜべっ
            r11.<init>(r1)
            r0.f3265 = r11
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$なぎぱいぢぎ r12 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$なぎぱいぢぎ
            r12.<init>(r1)
            r0.f3258 = r12
            r13 = 1
            r0.f3259 = r13
            android.content.Context r14 = r16.getContext()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior r1 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior
            r1.<init>(r14, r7)
            r0.f3260 = r1
            int[] r3 = p131.p161.p162.p163.C2243.ExtendedFloatingActionButton
            int[] r6 = new int[r10]
            r1 = r14
            r2 = r18
            r4 = r19
            r5 = r9
            android.content.res.TypedArray r1 = p131.p161.p162.p163.p185.C2255.m4408(r1, r2, r3, r4, r5, r6)
            int r2 = p131.p161.p162.p163.C2243.ExtendedFloatingActionButton_showMotionSpec
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.のぷのちつ.ぁごぐすすぃ r2 = p131.p161.p162.p163.p186.C2291.m4451(r14, r1, r2)
            int r3 = p131.p161.p162.p163.C2243.ExtendedFloatingActionButton_hideMotionSpec
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.のぷのちつ.ぁごぐすすぃ r3 = p131.p161.p162.p163.p186.C2291.m4451(r14, r1, r3)
            int r4 = p131.p161.p162.p163.C2243.ExtendedFloatingActionButton_extendMotionSpec
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.のぷのちつ.ぁごぐすすぃ r4 = p131.p161.p162.p163.p186.C2291.m4451(r14, r1, r4)
            int r5 = p131.p161.p162.p163.C2243.ExtendedFloatingActionButton_shrinkMotionSpec
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.のぷのちつ.ぁごぐすすぃ r5 = p131.p161.p162.p163.p186.C2291.m4451(r14, r1, r5)
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.びえぁぜい.げつ〴ぬぐ r6 = new なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.びえぁぜい.げつ〴ぬぐ
            r6.<init>()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$づざかべべ r15 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$づざかべべ
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$げつ〴ぬぐ r10 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$げつ〴ぬぐ
            r10.<init>()
            r15.<init>(r6, r10, r13)
            r0.f3263 = r15
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$づざかべべ r10 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$づざかべべ
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$〺つふすそ r13 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$〺つふすそ
            r13.<init>()
            r7 = 0
            r10.<init>(r6, r13, r7)
            r0.f3262 = r10
            r11.f9570 = r2
            r12.f9570 = r3
            r15.f9570 = r4
            r10.f9570 = r5
            r1.recycle()
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.くし〴〺ぅ r1 = p131.p161.p162.p163.p173.C2180.f9117
            r2 = r18
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.てぜきぽく$〺つふすそ r1 = p131.p161.p162.p163.p173.C2180.m4283(r14, r2, r8, r9, r1)
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.てぜきぽく r1 = r1.m4291()
            r0.setShapeAppearanceModel(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static void m1410(ExtendedFloatingActionButton extendedFloatingActionButton, InterfaceC2318 interfaceC2318) {
        extendedFloatingActionButton.getClass();
        if (interfaceC2318.mo1414()) {
            return;
        }
        if (!(C1096.m2517(extendedFloatingActionButton) && !extendedFloatingActionButton.isInEditMode())) {
            interfaceC2318.mo1418();
            interfaceC2318.mo1417(null);
            return;
        }
        extendedFloatingActionButton.measure(0, 0);
        AnimatorSet mo1419 = interfaceC2318.mo1419();
        mo1419.addListener(new C2320(extendedFloatingActionButton, interfaceC2318));
        Iterator<Animator.AnimatorListener> it = ((AbstractC2310) interfaceC2318).f9567.iterator();
        while (it.hasNext()) {
            mo1419.addListener(it.next());
        }
        mo1419.start();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0129
    public CoordinatorLayout.Behavior<ExtendedFloatingActionButton> getBehavior() {
        return this.f3260;
    }

    public int getCollapsedSize() {
        return getIconSize() + (Math.min(C1096.m2513(this), C1096.m2500(this)) * 2);
    }

    public C2291 getExtendMotionSpec() {
        return ((AbstractC2310) this.f3263).f9570;
    }

    public C2291 getHideMotionSpec() {
        return ((AbstractC2310) this.f3258).f9570;
    }

    public C2291 getShowMotionSpec() {
        return ((AbstractC2310) this.f3265).f9570;
    }

    public C2291 getShrinkMotionSpec() {
        return ((AbstractC2310) this.f3262).f9570;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3259 && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f3259 = false;
            this.f3262.mo1418();
        }
    }

    public void setExtendMotionSpec(C2291 c2291) {
        ((AbstractC2310) this.f3263).f9570 = c2291;
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(C2291.m4449(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (this.f3259 == z) {
            return;
        }
        InterfaceC2318 interfaceC2318 = z ? this.f3263 : this.f3262;
        if (interfaceC2318.mo1414()) {
            return;
        }
        interfaceC2318.mo1418();
    }

    public void setHideMotionSpec(C2291 c2291) {
        ((AbstractC2310) this.f3258).f9570 = c2291;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C2291.m4449(getContext(), i));
    }

    public void setShowMotionSpec(C2291 c2291) {
        ((AbstractC2310) this.f3265).f9570 = c2291;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C2291.m4449(getContext(), i));
    }

    public void setShrinkMotionSpec(C2291 c2291) {
        ((AbstractC2310) this.f3262).f9570 = c2291;
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(C2291.m4449(getContext(), i));
    }
}
