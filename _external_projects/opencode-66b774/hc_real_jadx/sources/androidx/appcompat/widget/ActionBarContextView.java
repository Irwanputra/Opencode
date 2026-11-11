package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicInteger;
import p034.p035.p045.C1096;
import p034.p050.C1147;
import p034.p050.C1148;
import p034.p050.C1264;
import p034.p050.C1268;
import p034.p050.p051.AbstractC1154;
import p034.p050.p053.AbstractC1222;
import p034.p050.p053.C1209;
import p034.p050.p055.p056.C1266;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ActionBarContextView extends AbstractC1222 {

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public CharSequence f222;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public TextView f223;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public int f224;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public TextView f225;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public int f226;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public int f227;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public View f228;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public View f229;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public boolean f230;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public LinearLayout f231;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public CharSequence f232;

    /* renamed from: androidx.appcompat.widget.ActionBarContextView$げつ〴ぬぐ, reason: contains not printable characters */
    public class ViewOnClickListenerC0044 implements View.OnClickListener {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final /* synthetic */ AbstractC1154 f233;

        public ViewOnClickListenerC0044(ActionBarContextView actionBarContextView, AbstractC1154 abstractC1154) {
            this.f233 = abstractC1154;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f233.mo2588();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1264.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1148.ActionMode, i, 0);
        int i2 = C1148.ActionMode_background;
        Drawable drawable = (!obtainStyledAttributes.hasValue(i2) || (resourceId = obtainStyledAttributes.getResourceId(i2, 0)) == 0) ? obtainStyledAttributes.getDrawable(i2) : C1266.m2928(context, resourceId);
        AtomicInteger atomicInteger = C1096.f5578;
        if (Build.VERSION.SDK_INT >= 16) {
            setBackground(drawable);
        } else {
            setBackgroundDrawable(drawable);
        }
        this.f224 = obtainStyledAttributes.getResourceId(C1148.ActionMode_titleTextStyle, 0);
        this.f227 = obtainStyledAttributes.getResourceId(C1148.ActionMode_subtitleTextStyle, 0);
        this.f6032 = obtainStyledAttributes.getLayoutDimension(C1148.ActionMode_height, 0);
        this.f226 = obtainStyledAttributes.getResourceId(C1148.ActionMode_closeItemLayout, C1147.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // p034.p050.p053.AbstractC1222
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // p034.p050.p053.AbstractC1222
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f232;
    }

    public CharSequence getTitle() {
        return this.f222;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f6031;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m126();
            this.f6031.m128();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(getClass().getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f222);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean m2693 = C1209.m2693(this);
        int paddingRight = m2693 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f228;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f228.getLayoutParams();
            int i5 = m2693 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = m2693 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = m2693 ? paddingRight - i5 : paddingRight + i5;
            int m2833 = i7 + m2833(this.f228, i7, paddingTop, paddingTop2, m2693);
            paddingRight = m2693 ? m2833 - i6 : m2833 + i6;
        }
        int i8 = paddingRight;
        LinearLayout linearLayout = this.f231;
        if (linearLayout != null && this.f229 == null && linearLayout.getVisibility() != 8) {
            i8 += m2833(this.f231, i8, paddingTop, paddingTop2, m2693);
        }
        int i9 = i8;
        View view2 = this.f229;
        if (view2 != null) {
            m2833(view2, i9, paddingTop, paddingTop2, m2693);
        }
        int paddingLeft = m2693 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f6033;
        if (actionMenuView != null) {
            m2833(actionMenuView, paddingLeft, paddingTop, paddingTop2, !m2693);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.f6032;
        if (i3 <= 0) {
            i3 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i4 = i3 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        View view = this.f228;
        if (view != null) {
            int m2831 = m2831(view, paddingLeft, makeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f228.getLayoutParams();
            paddingLeft = m2831 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f6033;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m2831(this.f6033, paddingLeft, makeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f231;
        if (linearLayout != null && this.f229 == null) {
            if (this.f230) {
                this.f231.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f231.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f231.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = m2831(linearLayout, paddingLeft, makeMeasureSpec, 0);
            }
        }
        View view2 = this.f229;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i5 = layoutParams.width;
            int i6 = i5 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i5 >= 0) {
                paddingLeft = Math.min(i5, paddingLeft);
            }
            int i7 = layoutParams.height;
            int i8 = i7 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i7 >= 0) {
                i4 = Math.min(i7, i4);
            }
            this.f229.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i4, i8));
        }
        if (this.f6032 <= 0) {
            int childCount = getChildCount();
            i3 = 0;
            for (int i9 = 0; i9 < childCount; i9++) {
                int measuredHeight = getChildAt(i9).getMeasuredHeight() + paddingBottom;
                if (measuredHeight > i3) {
                    i3 = measuredHeight;
                }
            }
        }
        setMeasuredDimension(size, i3);
    }

    @Override // p034.p050.p053.AbstractC1222
    public void setContentHeight(int i) {
        this.f6032 = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f229;
        if (view2 != null) {
            removeView(view2);
        }
        this.f229 = view;
        if (view != null && (linearLayout = this.f231) != null) {
            removeView(linearLayout);
            this.f231 = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f232 = charSequence;
        m98();
    }

    public void setTitle(CharSequence charSequence) {
        this.f222 = charSequence;
        m98();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f230) {
            requestLayout();
        }
        this.f230 = z;
    }

    @Override // p034.p050.p053.AbstractC1222, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public void m97() {
        removeAllViews();
        this.f229 = null;
        this.f6033 = null;
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final void m98() {
        if (this.f231 == null) {
            LayoutInflater.from(getContext()).inflate(C1147.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f231 = linearLayout;
            this.f225 = (TextView) linearLayout.findViewById(C1268.action_bar_title);
            this.f223 = (TextView) this.f231.findViewById(C1268.action_bar_subtitle);
            if (this.f224 != 0) {
                this.f225.setTextAppearance(getContext(), this.f224);
            }
            if (this.f227 != 0) {
                this.f223.setTextAppearance(getContext(), this.f227);
            }
        }
        this.f225.setText(this.f222);
        this.f223.setText(this.f232);
        boolean z = !TextUtils.isEmpty(this.f222);
        boolean z2 = !TextUtils.isEmpty(this.f232);
        int i = 0;
        this.f223.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f231;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.f231.getParent() == null) {
            addView(this.f231);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003b  */
    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m99(p034.p050.p051.AbstractC1154 r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.f228
            r1 = 0
            if (r0 != 0) goto L16
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r2 = r6.f226
            android.view.View r0 = r0.inflate(r2, r6, r1)
            r6.f228 = r0
            goto L1e
        L16:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L21
            android.view.View r0 = r6.f228
        L1e:
            r6.addView(r0)
        L21:
            android.view.View r0 = r6.f228
            int r2 = p034.p050.C1268.action_mode_close_button
            android.view.View r0 = r0.findViewById(r2)
            androidx.appcompat.widget.ActionBarContextView$げつ〴ぬぐ r2 = new androidx.appcompat.widget.ActionBarContextView$げつ〴ぬぐ
            r2.<init>(r6, r7)
            r0.setOnClickListener(r2)
            android.view.Menu r7 = r7.mo2589()
            づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.ぁごぐすすぃ r7 = (p034.p050.p051.p052.C1164) r7
            androidx.appcompat.widget.ActionMenuPresenter r0 = r6.f6031
            if (r0 == 0) goto L3e
            r0.m118()
        L3e:
            androidx.appcompat.widget.ActionMenuPresenter r0 = new androidx.appcompat.widget.ActionMenuPresenter
            android.content.Context r2 = r6.getContext()
            r0.<init>(r2)
            r6.f6031 = r0
            r2 = 1
            r0.f284 = r2
            r0.f274 = r2
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r3 = -2
            r4 = -1
            r0.<init>(r3, r4)
            androidx.appcompat.widget.ActionMenuPresenter r3 = r6.f6031
            android.content.Context r4 = r6.f6030
            r7.m2610(r3, r4)
            androidx.appcompat.widget.ActionMenuPresenter r7 = r6.f6031
            づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.へぬ〴づぞ r3 = r7.f5763
            if (r3 != 0) goto L76
            android.view.LayoutInflater r4 = r7.f5760
            int r5 = r7.f5757
            android.view.View r1 = r4.inflate(r5, r6, r1)
            づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.へぬ〴づぞ r1 = (p034.p050.p051.p052.InterfaceC1195) r1
            r7.f5763 = r1
            づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.ぁごぐすすぃ r4 = r7.f5762
            r1.mo91(r4)
            r7.mo119(r2)
        L76:
            づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.へぬ〴づぞ r1 = r7.f5763
            if (r3 == r1) goto L80
            r2 = r1
            androidx.appcompat.widget.ActionMenuView r2 = (androidx.appcompat.widget.ActionMenuView) r2
            r2.setPresenter(r7)
        L80:
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            r6.f6033 = r1
            r7 = 0
            p034.p035.p045.C1096.m2484(r1, r7)
            androidx.appcompat.widget.ActionMenuView r7 = r6.f6033
            r6.addView(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.m99(づざかべべ.〺つふすそ.ぇぬぎばつ.げつ〴ぬぐ):void");
    }
}
