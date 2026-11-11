package com.google.android.material.bottomnavigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.badge.BadgeDrawable;
import java.util.concurrent.atomic.AtomicInteger;
import p034.p035.p043.C1067;
import p034.p035.p045.C1096;
import p034.p035.p045.C1114;
import p034.p035.p045.p046.C1084;
import p034.p050.p051.p052.C1197;
import p034.p050.p051.p052.InterfaceC1195;
import p131.p161.p162.p163.C2110;
import p131.p161.p162.p163.C2144;
import p131.p161.p162.p163.C2242;
import p131.p161.p162.p163.C2248;
import p131.p161.p162.p163.C2324;
import p131.p161.p162.p163.p175.C2223;
import p237.p238.p239.p241.p242.C2786;

/* loaded from: /tmp/opencode/hc_real.dex */
public class BottomNavigationItemView extends FrameLayout implements InterfaceC1195.InterfaceC1196 {

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public static final int[] f3033 = {R.attr.state_checked};

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public ImageView f3034;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final int f3035;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean f3036;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final TextView f3037;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public BadgeDrawable f3038;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public Drawable f3039;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public float f3040;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public float f3041;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public C1197 f3042;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f3043;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public ColorStateList f3044;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public float f3045;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public Drawable f3046;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final TextView f3047;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public int f3048;

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationItemView$げつ〴ぬぐ, reason: contains not printable characters */
    public class ViewOnLayoutChangeListenerC0403 implements View.OnLayoutChangeListener {
        public ViewOnLayoutChangeListenerC0403() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (BottomNavigationItemView.this.f3034.getVisibility() == 0) {
                BottomNavigationItemView bottomNavigationItemView = BottomNavigationItemView.this;
                ImageView imageView = bottomNavigationItemView.f3034;
                if (bottomNavigationItemView.m1329()) {
                    C2223.m4321(bottomNavigationItemView.f3038, imageView, bottomNavigationItemView.m1328(imageView));
                }
            }
        }
    }

    public BottomNavigationItemView(Context context) {
        this(context, null);
    }

    public BottomNavigationItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BottomNavigationItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3048 = -1;
        Resources resources = getResources();
        LayoutInflater.from(context).inflate(C2110.design_bottom_navigation_item, (ViewGroup) this, true);
        setBackgroundResource(C2242.design_bottom_navigation_item_background);
        this.f3035 = resources.getDimensionPixelSize(C2324.design_bottom_navigation_margin);
        this.f3034 = (ImageView) findViewById(C2248.icon);
        TextView textView = (TextView) findViewById(C2248.smallLabel);
        this.f3047 = textView;
        TextView textView2 = (TextView) findViewById(C2248.largeLabel);
        this.f3037 = textView2;
        C1096.m2505(textView, 2);
        C1096.m2505(textView2, 2);
        setFocusable(true);
        m1330(textView.getTextSize(), textView2.getTextSize());
        ImageView imageView = this.f3034;
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0403());
        }
    }

    public BadgeDrawable getBadge() {
        return this.f3038;
    }

    @Override // p034.p050.p051.p052.InterfaceC1195.InterfaceC1196
    public C1197 getItemData() {
        return this.f3042;
    }

    public int getItemPosition() {
        return this.f3048;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C1197 c1197 = this.f3042;
        if (c1197 != null && c1197.isCheckable() && this.f3042.isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f3033);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable = this.f3038;
        if (badgeDrawable != null && badgeDrawable.isVisible()) {
            C1197 c1197 = this.f3042;
            CharSequence charSequence = c1197.f5926;
            if (!TextUtils.isEmpty(c1197.f5919)) {
                charSequence = this.f3042.f5919;
            }
            accessibilityNodeInfo.setContentDescription(((Object) charSequence) + ", " + ((Object) this.f3038.m1301()));
        }
        C1084.C1086 m2470 = C1084.C1086.m2470(0, 1, getItemPosition(), 1, false, isSelected());
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) m2470.f5552);
        }
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            C1084.C1087 c1087 = C1084.C1087.f5554;
            if (i >= 21) {
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) c1087.f5566);
            }
        }
        String string = getResources().getString(C2144.item_view_role_description);
        if (i >= 19) {
            accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", string);
        }
    }

    public void setBadge(BadgeDrawable badgeDrawable) {
        this.f3038 = badgeDrawable;
        ImageView imageView = this.f3034;
        if (imageView == null || !m1329() || imageView == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        BadgeDrawable badgeDrawable2 = this.f3038;
        FrameLayout m1328 = m1328(imageView);
        C2223.m4321(badgeDrawable2, imageView, m1328);
        if (C2223.f9238) {
            m1328.setForeground(badgeDrawable2);
        } else {
            imageView.getOverlay().add(badgeDrawable2);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0057, code lost:
    
        if (r10 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0059, code lost:
    
        m1331(r9.f3034, (int) (r9.f3035 + r9.f3040), 49);
        m1332(r9.f3037, 1.0f, 1.0f, 0);
        r0 = r9.f3047;
        r1 = r9.f3045;
        m1332(r0, r1, r1, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0072, code lost:
    
        m1331(r9.f3034, r9.f3035, 49);
        r0 = r9.f3037;
        r1 = r9.f3041;
        m1332(r0, r1, r1, 4);
        m1332(r9.f3047, 1.0f, 1.0f, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008a, code lost:
    
        if (r10 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008c, code lost:
    
        m1331(r0, r1, 49);
        m1332(r9.f3037, 1.0f, 1.0f, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009d, code lost:
    
        r9.f3047.setVisibility(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0095, code lost:
    
        m1331(r0, r1, 17);
        m1332(r9.f3037, 0.5f, 0.5f, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ab, code lost:
    
        if (r10 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ae, code lost:
    
        if (r10 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setChecked(boolean r10) {
        /*
            r9 = this;
            android.widget.TextView r0 = r9.f3037
            int r1 = r0.getWidth()
            r2 = 2
            int r1 = r1 / r2
            float r1 = (float) r1
            r0.setPivotX(r1)
            android.widget.TextView r0 = r9.f3037
            int r1 = r0.getBaseline()
            float r1 = (float) r1
            r0.setPivotY(r1)
            android.widget.TextView r0 = r9.f3047
            int r1 = r0.getWidth()
            int r1 = r1 / r2
            float r1 = (float) r1
            r0.setPivotX(r1)
            android.widget.TextView r0 = r9.f3047
            int r1 = r0.getBaseline()
            float r1 = (float) r1
            r0.setPivotY(r1)
            int r0 = r9.f3043
            r1 = -1
            r3 = 17
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 0
            r6 = 49
            r7 = 4
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r0 == r1) goto La3
            if (r0 == 0) goto L86
            r1 = 1
            if (r0 == r1) goto L57
            if (r0 == r2) goto L43
            goto Lb1
        L43:
            android.widget.ImageView r0 = r9.f3034
            int r1 = r9.f3035
            r9.m1331(r0, r1, r3)
            android.widget.TextView r0 = r9.f3037
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r9.f3047
            r0.setVisibility(r1)
            goto Lb1
        L57:
            if (r10 == 0) goto L72
        L59:
            android.widget.ImageView r0 = r9.f3034
            int r1 = r9.f3035
            float r1 = (float) r1
            float r2 = r9.f3040
            float r1 = r1 + r2
            int r1 = (int) r1
            r9.m1331(r0, r1, r6)
            android.widget.TextView r0 = r9.f3037
            r9.m1332(r0, r8, r8, r5)
            android.widget.TextView r0 = r9.f3047
            float r1 = r9.f3045
            r9.m1332(r0, r1, r1, r7)
            goto Lb1
        L72:
            android.widget.ImageView r0 = r9.f3034
            int r1 = r9.f3035
            r9.m1331(r0, r1, r6)
            android.widget.TextView r0 = r9.f3037
            float r1 = r9.f3041
            r9.m1332(r0, r1, r1, r7)
            android.widget.TextView r0 = r9.f3047
            r9.m1332(r0, r8, r8, r5)
            goto Lb1
        L86:
            android.widget.ImageView r0 = r9.f3034
            int r1 = r9.f3035
            if (r10 == 0) goto L95
        L8c:
            r9.m1331(r0, r1, r6)
            android.widget.TextView r0 = r9.f3037
            r9.m1332(r0, r8, r8, r5)
            goto L9d
        L95:
            r9.m1331(r0, r1, r3)
            android.widget.TextView r0 = r9.f3037
            r9.m1332(r0, r4, r4, r7)
        L9d:
            android.widget.TextView r0 = r9.f3047
            r0.setVisibility(r7)
            goto Lb1
        La3:
            boolean r0 = r9.f3036
            if (r0 == 0) goto Lae
            android.widget.ImageView r0 = r9.f3034
            int r1 = r9.f3035
            if (r10 == 0) goto L95
            goto L8c
        Lae:
            if (r10 == 0) goto L72
            goto L59
        Lb1:
            r9.refreshDrawableState()
            r9.setSelected(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomnavigation.BottomNavigationItemView.setChecked(boolean):void");
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f3047.setEnabled(z);
        this.f3037.setEnabled(z);
        this.f3034.setEnabled(z);
        C1096.m2514(this, z ? C1114.m2557(getContext(), 1002) : null);
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.f3046) {
            return;
        }
        this.f3046 = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = C2786.m4758(drawable).mutate();
            this.f3039 = drawable;
            ColorStateList colorStateList = this.f3044;
            if (colorStateList != null) {
                C2786.m4788(drawable, colorStateList);
            }
        }
        this.f3034.setImageDrawable(drawable);
    }

    public void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f3034.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.f3034.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f3044 = colorStateList;
        if (this.f3042 == null || (drawable = this.f3039) == null) {
            return;
        }
        C2786.m4788(drawable, colorStateList);
        this.f3039.invalidateSelf();
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : C1067.m2406(getContext(), i));
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        AtomicInteger atomicInteger = C1096.f5578;
        if (Build.VERSION.SDK_INT >= 16) {
            setBackground(drawable);
        } else {
            setBackgroundDrawable(drawable);
        }
    }

    public void setItemPosition(int i) {
        this.f3048 = i;
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f3043 != i) {
            this.f3043 = i;
            C1197 c1197 = this.f3042;
            if (c1197 != null) {
                setChecked(c1197.isChecked());
            }
        }
    }

    public void setShifting(boolean z) {
        if (this.f3036 != z) {
            this.f3036 = z;
            C1197 c1197 = this.f3042;
            if (c1197 != null) {
                setChecked(c1197.isChecked());
            }
        }
    }

    public void setShortcut(boolean z, char c) {
    }

    public void setTextAppearanceActive(int i) {
        C2786.m4774(this.f3037, i);
        m1330(this.f3047.getTextSize(), this.f3037.getTextSize());
    }

    public void setTextAppearanceInactive(int i) {
        C2786.m4774(this.f3047, i);
        m1330(this.f3047.getTextSize(), this.f3037.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f3047.setTextColor(colorStateList);
            this.f3037.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f3047.setText(charSequence);
        this.f3037.setText(charSequence);
        C1197 c1197 = this.f3042;
        if (c1197 == null || TextUtils.isEmpty(c1197.f5919)) {
            setContentDescription(charSequence);
        }
        C1197 c11972 = this.f3042;
        if (c11972 != null && !TextUtils.isEmpty(c11972.f5925)) {
            charSequence = this.f3042.f5925;
        }
        C2786.m4764(this, charSequence);
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final FrameLayout m1328(View view) {
        ImageView imageView = this.f3034;
        if (view == imageView && C2223.f9238) {
            return (FrameLayout) imageView.getParent();
        }
        return null;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final boolean m1329() {
        return this.f3038 != null;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m1330(float f, float f2) {
        this.f3040 = f - f2;
        this.f3045 = (f2 * 1.0f) / f;
        this.f3041 = (f * 1.0f) / f2;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final void m1331(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final void m1332(View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    @Override // p034.p050.p051.p052.InterfaceC1195.InterfaceC1196
    /* renamed from: びぐびあび */
    public void mo88(C1197 c1197, int i) {
        this.f3042 = c1197;
        setCheckable(c1197.isCheckable());
        setChecked(c1197.isChecked());
        setEnabled(c1197.isEnabled());
        setIcon(c1197.getIcon());
        setTitle(c1197.f5926);
        setId(c1197.f5922);
        if (!TextUtils.isEmpty(c1197.f5919)) {
            setContentDescription(c1197.f5919);
        }
        C2786.m4764(this, !TextUtils.isEmpty(c1197.f5925) ? c1197.f5925 : c1197.f5926);
        setVisibility(c1197.isVisible() ? 0 : 8);
    }
}
