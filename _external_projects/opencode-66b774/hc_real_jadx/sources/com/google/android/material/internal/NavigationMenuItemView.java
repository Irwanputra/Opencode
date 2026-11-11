package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import java.util.concurrent.atomic.AtomicInteger;
import p034.p035.p045.C1096;
import p034.p035.p045.C1102;
import p034.p035.p045.p046.C1084;
import p034.p050.C1264;
import p034.p050.p051.p052.C1197;
import p034.p050.p051.p052.InterfaceC1195;
import p131.p161.p162.p163.C2110;
import p131.p161.p162.p163.C2242;
import p131.p161.p162.p163.C2248;
import p131.p161.p162.p163.C2324;
import p237.p238.p239.p241.p242.C2786;

/* loaded from: /tmp/opencode/hc_real.dex */
public class NavigationMenuItemView extends ForegroundLinearLayout implements InterfaceC1195.InterfaceC1196 {

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public static final int[] f3330 = {R.attr.state_checked};

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public boolean f3331;

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public boolean f3332;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public final CheckedTextView f3333;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public boolean f3334;

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public Drawable f3335;

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public ColorStateList f3336;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public C1197 f3337;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public FrameLayout f3338;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public int f3339;

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public final C1102 f3340;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0450 extends C1102 {
        public C0450() {
        }

        @Override // p034.p035.p045.C1102
        /* renamed from: びぐびあび */
        public void mo431(View view, C1084 c1084) {
            this.f5594.onInitializeAccessibilityNodeInfo(view, c1084.f5550);
            c1084.f5550.setCheckable(NavigationMenuItemView.this.f3334);
        }
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0450 c0450 = new C0450();
        this.f3340 = c0450;
        setOrientation(0);
        LayoutInflater.from(context).inflate(C2110.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C2324.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C2248.design_menu_item_text);
        this.f3333 = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C1096.m2490(checkedTextView, c0450);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f3338 == null) {
                this.f3338 = (FrameLayout) ((ViewStub) findViewById(C2248.design_menu_item_action_area_stub)).inflate();
            }
            this.f3338.removeAllViews();
            this.f3338.addView(view);
        }
    }

    @Override // p034.p050.p051.p052.InterfaceC1195.InterfaceC1196
    public C1197 getItemData() {
        return this.f3337;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C1197 c1197 = this.f3337;
        if (c1197 != null && c1197.isCheckable() && this.f3337.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, f3330);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f3334 != z) {
            this.f3334 = z;
            this.f3340.mo2528(this.f3333, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f3333.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f3332) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C2786.m4758(drawable).mutate();
                C2786.m4788(drawable, this.f3336);
            }
            int i = this.f3339;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f3331) {
            if (this.f3335 == null) {
                Resources resources = getResources();
                int i2 = C2242.navigation_empty_icon;
                Drawable drawable2 = Build.VERSION.SDK_INT >= 21 ? resources.getDrawable(i2, getContext().getTheme()) : resources.getDrawable(i2);
                this.f3335 = drawable2;
                if (drawable2 != null) {
                    int i3 = this.f3339;
                    drawable2.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.f3335;
        }
        C2786.m4790(this.f3333, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f3333.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f3339 = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f3336 = colorStateList;
        this.f3332 = colorStateList != null;
        C1197 c1197 = this.f3337;
        if (c1197 != null) {
            setIcon(c1197.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f3333.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f3331 = z;
    }

    public void setShortcut(boolean z, char c) {
    }

    public void setTextAppearance(int i) {
        C2786.m4774(this.f3333, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f3333.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f3333.setText(charSequence);
    }

    @Override // p034.p050.p051.p052.InterfaceC1195.InterfaceC1196
    /* renamed from: びぐびあび */
    public void mo88(C1197 c1197, int i) {
        LinearLayoutCompat.LayoutParams layoutParams;
        int i2;
        StateListDrawable stateListDrawable;
        this.f3337 = c1197;
        int i3 = c1197.f5922;
        if (i3 > 0) {
            setId(i3);
        }
        setVisibility(c1197.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(C1264.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f3330, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            AtomicInteger atomicInteger = C1096.f5578;
            if (Build.VERSION.SDK_INT >= 16) {
                setBackground(stateListDrawable);
            } else {
                setBackgroundDrawable(stateListDrawable);
            }
        }
        setCheckable(c1197.isCheckable());
        setChecked(c1197.isChecked());
        setEnabled(c1197.isEnabled());
        setTitle(c1197.f5926);
        setIcon(c1197.getIcon());
        setActionView(c1197.getActionView());
        setContentDescription(c1197.f5919);
        C2786.m4764(this, c1197.f5925);
        C1197 c11972 = this.f3337;
        if (c11972.f5926 == null && c11972.getIcon() == null && this.f3337.getActionView() != null) {
            this.f3333.setVisibility(8);
            FrameLayout frameLayout = this.f3338;
            if (frameLayout == null) {
                return;
            }
            layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
            i2 = -1;
        } else {
            this.f3333.setVisibility(0);
            FrameLayout frameLayout2 = this.f3338;
            if (frameLayout2 == null) {
                return;
            }
            layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            i2 = -2;
        }
        ((ViewGroup.MarginLayoutParams) layoutParams).width = i2;
        this.f3338.setLayoutParams(layoutParams);
    }
}
