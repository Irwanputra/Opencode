package com.google.android.material.chip;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p034.p035.p045.C1096;
import p034.p035.p045.p046.C1084;
import p034.p035.p049.C1136;
import p034.p050.p055.p056.C1266;
import p034.p063.p064.AbstractC1353;
import p034.p095.C1687;
import p131.p161.p162.p163.C2111;
import p131.p161.p162.p163.C2144;
import p131.p161.p162.p163.C2248;
import p131.p161.p162.p163.C2350;
import p131.p161.p162.p163.p167.AbstractC2150;
import p131.p161.p162.p163.p167.C2145;
import p131.p161.p162.p163.p173.C2163;
import p131.p161.p162.p163.p173.C2180;
import p131.p161.p162.p163.p173.InterfaceC2169;
import p131.p161.p162.p163.p181.C2235;
import p131.p161.p162.p163.p183.C2244;
import p131.p161.p162.p163.p186.C2291;
import p237.p238.p239.p241.p242.C2786;

/* loaded from: /tmp/opencode/hc_real.dex */
public class Chip extends AppCompatCheckBox implements C2244.InterfaceC2245, InterfaceC2169 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public View.OnClickListener f3205;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public RippleDrawable f3206;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public boolean f3207;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public int f3208;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public final C0426 f3209;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public int f3210;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public final AbstractC2150 f3211;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public final Rect f3212;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public C2244 f3213;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public boolean f3214;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public InsetDrawable f3215;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public boolean f3216;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public final RectF f3217;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public boolean f3218;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public CompoundButton.OnCheckedChangeListener f3219;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public boolean f3220;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public static final int f3202 = C2350.Widget_MaterialComponents_Chip_Action;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public static final Rect f3203 = new Rect();

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public static final int[] f3204 = {R.attr.state_selected};

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public static final int[] f3201 = {R.attr.state_checkable};

    /* renamed from: com.google.android.material.chip.Chip$〺つふすそ, reason: contains not printable characters */
    public class C0426 extends AbstractC1353 {
        public C0426(Chip chip) {
            super(chip);
        }

        @Override // p034.p063.p064.AbstractC1353
        /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
        public void mo1388(int i, boolean z) {
            if (i == 1) {
                Chip chip = Chip.this;
                chip.f3216 = z;
                chip.refreshDrawableState();
            }
        }

        @Override // p034.p063.p064.AbstractC1353
        /* renamed from: ぇぬぎばつ */
        public void mo1121(List<Integer> list) {
            boolean z = false;
            list.add(0);
            Chip chip = Chip.this;
            int i = Chip.f3202;
            if (chip.m1382()) {
                Chip chip2 = Chip.this;
                C2244 c2244 = chip2.f3213;
                if (c2244 != null && c2244.f9318) {
                    z = true;
                }
                if (!z || chip2.f3205 == null) {
                    return;
                }
                list.add(1);
            }
        }

        @Override // p034.p063.p064.AbstractC1353
        /* renamed from: おぐぴう〸ず */
        public int mo1122(float f, float f2) {
            Chip chip = Chip.this;
            int i = Chip.f3202;
            return (chip.m1382() && Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? 1 : 0;
        }

        @Override // p034.p063.p064.AbstractC1353
        /* renamed from: ごづごきえ */
        public boolean mo1123(int i, int i2, Bundle bundle) {
            boolean z = false;
            if (i2 == 16) {
                if (i == 0) {
                    return Chip.this.performClick();
                }
                if (i == 1) {
                    Chip chip = Chip.this;
                    chip.playSoundEffect(0);
                    View.OnClickListener onClickListener = chip.f3205;
                    if (onClickListener != null) {
                        onClickListener.onClick(chip);
                        z = true;
                    }
                    chip.f3209.m3038(1, 1);
                }
            }
            return z;
        }

        @Override // p034.p063.p064.AbstractC1353
        /* renamed from: でどあくず, reason: contains not printable characters */
        public void mo1389(C1084 c1084) {
            c1084.f5550.setCheckable(Chip.this.m1384());
            c1084.f5550.setClickable(Chip.this.isClickable());
            if (Chip.this.m1384() || Chip.this.isClickable()) {
                c1084.f5550.setClassName(Chip.this.m1384() ? "android.widget.CompoundButton" : "android.widget.Button");
            } else {
                c1084.f5550.setClassName("android.view.View");
            }
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                c1084.f5550.setText(text);
            } else {
                c1084.f5550.setContentDescription(text);
            }
        }

        @Override // p034.p063.p064.AbstractC1353
        /* renamed from: ぶでにく〼〳 */
        public void mo1126(int i, C1084 c1084) {
            if (i != 1) {
                c1084.f5550.setContentDescription("");
                c1084.f5550.setBoundsInParent(Chip.f3203);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription == null) {
                CharSequence text = Chip.this.getText();
                Context context = Chip.this.getContext();
                int i2 = C2144.mtrl_chip_close_icon_content_description;
                Object[] objArr = new Object[1];
                objArr[0] = TextUtils.isEmpty(text) ? "" : text;
                closeIconContentDescription = context.getString(i2, objArr).trim();
            }
            c1084.f5550.setContentDescription(closeIconContentDescription);
            c1084.f5550.setBoundsInParent(Chip.this.getCloseIconTouchBoundsInt());
            c1084.m2455(C1084.C1087.f5554);
            c1084.f5550.setEnabled(Chip.this.isEnabled());
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0427 extends AbstractC2150 {
        public C0427() {
        }

        @Override // p131.p161.p162.p163.p167.AbstractC2150
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public void mo1390(Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            C2244 c2244 = chip.f3213;
            chip.setText(c2244.f9354 ? c2244.f9322 : chip.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }

        @Override // p131.p161.p162.p163.p167.AbstractC2150
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void mo1391(int i) {
        }
    }

    public Chip(Context context) {
        this(context, null);
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2111.chipStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0317  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Chip(android.content.Context r18, android.util.AttributeSet r19, int r20) {
        /*
            Method dump skipped, instructions count: 839
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f3217.setEmpty();
        if (m1382()) {
            C2244 c2244 = this.f3213;
            c2244.m4366(c2244.getBounds(), this.f3217);
        }
        return this.f3217;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f3212.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f3212;
    }

    private C2145 getTextAppearance() {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            return c2244.f9321.f9369;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f3214 != z) {
            this.f3214 = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f3220 != z) {
            this.f3220 = z;
            refreshDrawableState();
        }
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        Field declaredField;
        boolean z;
        if (motionEvent.getAction() == 10) {
            try {
                declaredField = AbstractC1353.class.getDeclaredField("のぷのちつ");
                declaredField.setAccessible(true);
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
            }
            if (((Integer) declaredField.get(this.f3209)).intValue() != Integer.MIN_VALUE) {
                Method declaredMethod = AbstractC1353.class.getDeclaredMethod("びえぁぜい", Integer.TYPE);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(this.f3209, Integer.MIN_VALUE);
                z = true;
                return !z ? true : true;
            }
        }
        z = false;
        return !z ? true : true;
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C0426 c0426 = this.f3209;
        c0426.getClass();
        boolean z = false;
        int i = 0;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i2 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i2 = 33;
                                } else if (keyCode == 21) {
                                    i2 = 17;
                                } else if (keyCode != 22) {
                                    i2 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z2 = false;
                                while (i < repeatCount && c0426.m3041(i2, null)) {
                                    i++;
                                    z2 = true;
                                }
                                z = z2;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i3 = c0426.f6468;
                    if (i3 != Integer.MIN_VALUE) {
                        c0426.mo1123(i3, 16, null);
                    }
                    z = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z = c0426.m3041(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z = c0426.m3041(1, null);
            }
        }
        if (!z || this.f3209.f6468 == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2244 c2244 = this.f3213;
        boolean z = false;
        int i = 0;
        z = false;
        if (c2244 != null && C2244.m4352(c2244.f9331)) {
            C2244 c22442 = this.f3213;
            ?? isEnabled = isEnabled();
            int i2 = isEnabled;
            if (this.f3216) {
                i2 = isEnabled + 1;
            }
            int i3 = i2;
            if (this.f3214) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.f3220) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            }
            if (this.f3216) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f3214) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f3220) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            z = c22442.m4392(iArr);
        }
        if (z) {
            invalidate();
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f3215;
        return insetDrawable == null ? this.f3213 : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            return c2244.f9333;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            return c2244.f9332;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            return c2244.f9355;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            return Math.max(0.0f, c2244.m4362());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f3213;
    }

    public float getChipEndPadding() {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            return c2244.f9304;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        C2244 c2244 = this.f3213;
        if (c2244 == null || (drawable = c2244.f9357) == null) {
            return null;
        }
        return C2786.m4759(drawable);
    }

    public float getChipIconSize() {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            return c2244.f9323;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            return c2244.f9330;
        }
        return null;
    }

    public float getChipMinHeight() {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            return c2244.f9346;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            return c2244.f9329;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            return c2244.f9315;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            return c2244.f9336;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            return c2244.m4374();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            return c2244.f9340;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            return c2244.f9351;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            return c2244.f9342;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            return c2244.f9306;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            return c2244.f9312;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            return c2244.f9308;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        C0426 c0426 = this.f3209;
        if (c0426.f6468 == 1 || c0426.f6473 == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public C2291 getHideMotionSpec() {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            return c2244.f9349;
        }
        return null;
    }

    public float getIconEndPadding() {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            return c2244.f9328;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            return c2244.f9305;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            return c2244.f9362;
        }
        return null;
    }

    public C2180 getShapeAppearanceModel() {
        return this.f3213.f9045.f9074;
    }

    public C2291 getShowMotionSpec() {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            return c2244.f9361;
        }
        return null;
    }

    public float getTextEndPadding() {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            return c2244.f9324;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            return c2244.f9337;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1687.m3669(this, this.f3213);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f3204);
        }
        if (m1384()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f3201);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        C0426 c0426 = this.f3209;
        int i2 = c0426.f6468;
        if (i2 != Integer.MIN_VALUE) {
            c0426.m3047(i2);
        }
        if (z) {
            c0426.m3041(i, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        boolean contains;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                contains = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(contains);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((m1384() || isClickable()) ? m1384() ? "android.widget.CompoundButton" : "android.widget.Button" : "android.view.View");
        accessibilityNodeInfo.setCheckable(m1384());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            if (chipGroup.f3323) {
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i2 >= chipGroup.getChildCount()) {
                        i3 = -1;
                        break;
                    }
                    if (chipGroup.getChildAt(i2) instanceof Chip) {
                        if (((Chip) chipGroup.getChildAt(i2)) == this) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    i2++;
                }
                i = i3;
            } else {
                i = -1;
            }
            Object tag = getTag(C2248.row_index_key);
            C1084.C1086 m2470 = C1084.C1086.m2470(!(tag instanceof Integer) ? -1 : ((Integer) tag).intValue(), 1, i, 1, false, isChecked());
            if (Build.VERSION.SDK_INT >= 19) {
                accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) m2470.f5552);
            }
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f3210 != i) {
            this.f3210 = i;
            m1387();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L25;
     */
    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L45
            if (r0 == r3) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L40
            goto L4c
        L21:
            boolean r0 = r5.f3220
            if (r0 == 0) goto L4c
            if (r1 != 0) goto L4a
            r5.setCloseIconPressed(r2)
            goto L4a
        L2b:
            boolean r0 = r5.f3220
            if (r0 == 0) goto L40
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.f3205
            if (r0 == 0) goto L39
            r0.onClick(r5)
        L39:
            com.google.android.material.chip.Chip$〺つふすそ r0 = r5.f3209
            r0.m3038(r3, r3)
            r0 = 1
            goto L41
        L40:
            r0 = 0
        L41:
            r5.setCloseIconPressed(r2)
            goto L4d
        L45:
            if (r1 == 0) goto L4c
            r5.setCloseIconPressed(r3)
        L4a:
            r0 = 1
            goto L4d
        L4c:
            r0 = 0
        L4d:
            if (r0 != 0) goto L55
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L56
        L55:
            r2 = 1
        L56:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f3206) {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f3206) {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4363(z);
        }
    }

    public void setCheckableResource(int i) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4363(c2244.f9327.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        C2244 c2244 = this.f3213;
        if (c2244 == null) {
            this.f3207 = z;
            return;
        }
        if (c2244.f9319) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked == z || (onCheckedChangeListener = this.f3219) == null) {
                return;
            }
            onCheckedChangeListener.onCheckedChanged(this, z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4390(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4390(C1266.m2928(c2244.f9327, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4376(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4376(C1266.m2929(c2244.f9327, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4375(c2244.f9327.getResources().getBoolean(i));
        }
    }

    public void setCheckedIconVisible(boolean z) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4375(z);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C2244 c2244 = this.f3213;
        if (c2244 == null || c2244.f9355 == colorStateList) {
            return;
        }
        c2244.f9355 = colorStateList;
        c2244.onStateChange(c2244.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4397(C1266.m2929(c2244.f9327, i));
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4387(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4387(c2244.f9327.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(C2244 c2244) {
        C2244 c22442 = this.f3213;
        if (c22442 != c2244) {
            if (c22442 != null) {
                c22442.f9313 = new WeakReference<>(null);
            }
            this.f3213 = c2244;
            c2244.f9354 = false;
            c2244.getClass();
            c2244.f9313 = new WeakReference<>(this);
            m1385(this.f3208);
        }
    }

    public void setChipEndPadding(float f) {
        C2244 c2244 = this.f3213;
        if (c2244 == null || c2244.f9304 == f) {
            return;
        }
        c2244.f9304 = f;
        c2244.invalidateSelf();
        c2244.m4384();
    }

    public void setChipEndPaddingResource(int i) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4372(c2244.f9327.getResources().getDimension(i));
        }
    }

    public void setChipIcon(Drawable drawable) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4355(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4355(C1266.m2928(c2244.f9327, i));
        }
    }

    public void setChipIconSize(float f) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4371(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4371(c2244.f9327.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4379(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4379(C1266.m2929(c2244.f9327, i));
        }
    }

    public void setChipIconVisible(int i) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4367(c2244.f9327.getResources().getBoolean(i));
        }
    }

    public void setChipIconVisible(boolean z) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4367(z);
        }
    }

    public void setChipMinHeight(float f) {
        C2244 c2244 = this.f3213;
        if (c2244 == null || c2244.f9346 == f) {
            return;
        }
        c2244.f9346 = f;
        c2244.invalidateSelf();
        c2244.m4384();
    }

    public void setChipMinHeightResource(int i) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4356(c2244.f9327.getResources().getDimension(i));
        }
    }

    public void setChipStartPadding(float f) {
        C2244 c2244 = this.f3213;
        if (c2244 == null || c2244.f9329 == f) {
            return;
        }
        c2244.f9329 = f;
        c2244.invalidateSelf();
        c2244.m4384();
    }

    public void setChipStartPaddingResource(int i) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4389(c2244.f9327.getResources().getDimension(i));
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4354(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4354(C1266.m2929(c2244.f9327, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4370(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4370(c2244.f9327.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4385(drawable);
        }
        m1378();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C2244 c2244 = this.f3213;
        if (c2244 == null || c2244.f9340 == charSequence) {
            return;
        }
        C1136 m2571 = C1136.m2571();
        c2244.f9340 = m2571.m2573(charSequence, m2571.f5667, true);
        c2244.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4369(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4369(c2244.f9327.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4385(C1266.m2928(c2244.f9327, i));
        }
        m1378();
    }

    public void setCloseIconSize(float f) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4388(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4388(c2244.f9327.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4361(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4361(c2244.f9327.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4364(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4364(C1266.m2929(c2244.f9327, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public void setCloseIconVisible(boolean z) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4386(z);
        }
        m1378();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            C2163.C2164 c2164 = c2244.f9045;
            if (c2164.f9072 != f) {
                c2164.f9072 = f;
                c2244.m4269();
            }
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f3213 == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.f9308 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f3218 = z;
        m1385(this.f3208);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            return;
        }
        super.setGravity(i);
    }

    public void setHideMotionSpec(C2291 c2291) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.f9349 = c2291;
        }
    }

    public void setHideMotionSpecResource(int i) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.f9349 = C2291.m4449(c2244.f9327, i);
        }
    }

    public void setIconEndPadding(float f) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4378(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4378(c2244.f9327.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4396(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4396(c2244.f9327.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f3213 != null && Build.VERSION.SDK_INT >= 17) {
            super.setLayoutDirection(i);
        }
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.f9348 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f3219 = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f3205 = onClickListener;
        m1378();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4359(colorStateList);
        }
        if (this.f3213.f9311) {
            return;
        }
        m1380();
    }

    public void setRippleColorResource(int i) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4359(C1266.m2929(c2244.f9327, i));
            if (this.f3213.f9311) {
                return;
            }
            m1380();
        }
    }

    @Override // p131.p161.p162.p163.p173.InterfaceC2169
    public void setShapeAppearanceModel(C2180 c2180) {
        C2244 c2244 = this.f3213;
        c2244.f9045.f9074 = c2180;
        c2244.invalidateSelf();
    }

    public void setShowMotionSpec(C2291 c2291) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.f9361 = c2291;
        }
    }

    public void setShowMotionSpecResource(int i) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.f9361 = C2291.m4449(c2244.f9327, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C2244 c2244 = this.f3213;
        if (c2244 == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(c2244.f9354 ? null : charSequence, bufferType);
        C2244 c22442 = this.f3213;
        if (c22442 != null) {
            c22442.m4395(charSequence);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.f9321.m4398(new C2145(c2244.f9327, i), c2244.f9327);
        }
        m1383();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C2244 c2244 = this.f3213;
        if (c2244 == null || c2244.f9324 == f) {
            return;
        }
        c2244.f9324 = f;
        c2244.invalidateSelf();
        c2244.m4384();
    }

    public void setTextEndPaddingResource(int i) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4380(c2244.f9327.getResources().getDimension(i));
        }
    }

    public void setTextStartPadding(float f) {
        C2244 c2244 = this.f3213;
        if (c2244 == null || c2244.f9337 == f) {
            return;
        }
        c2244.f9337 = f;
        c2244.invalidateSelf();
        c2244.m4384();
    }

    public void setTextStartPaddingResource(int i) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.m4368(c2244.f9327.getResources().getDimension(i));
        }
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final void m1378() {
        C0426 c0426;
        if (m1382()) {
            C2244 c2244 = this.f3213;
            if ((c2244 != null && c2244.f9318) && this.f3205 != null) {
                c0426 = this.f3209;
                C1096.m2490(this, c0426);
            }
        }
        c0426 = null;
        C1096.m2490(this, c0426);
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final void m1379() {
        if (this.f3215 != null) {
            this.f3215 = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            m1386();
        }
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final void m1380() {
        this.f3206 = new RippleDrawable(C2235.m4345(this.f3213.f9362), getBackgroundDrawable(), null);
        this.f3213.m4377(false);
        RippleDrawable rippleDrawable = this.f3206;
        AtomicInteger atomicInteger = C1096.f5578;
        if (Build.VERSION.SDK_INT >= 16) {
            setBackground(rippleDrawable);
        } else {
            setBackgroundDrawable(rippleDrawable);
        }
        m1387();
    }

    @Override // p131.p161.p162.p163.p183.C2244.InterfaceC2245
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void mo1381() {
        m1385(this.f3208);
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final boolean m1382() {
        C2244 c2244 = this.f3213;
        return (c2244 == null || c2244.m4374() == null) ? false : true;
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public final void m1383() {
        TextPaint paint = getPaint();
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            paint.drawableState = c2244.getState();
        }
        C2145 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m4231(getContext(), paint, this.f3211);
        }
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public boolean m1384() {
        C2244 c2244 = this.f3213;
        return c2244 != null && c2244.f9319;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x007e, code lost:
    
        if (getMinWidth() != r10) goto L44;
     */
    /* renamed from: びぐびあび, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m1385(int r10) {
        /*
            r9 = this;
            r9.f3208 = r10
            boolean r0 = r9.f3218
            r1 = 0
            if (r0 != 0) goto L13
            android.graphics.drawable.InsetDrawable r10 = r9.f3215
            if (r10 == 0) goto Lf
            r9.m1379()
            goto L12
        Lf:
            r9.m1386()
        L12:
            return r1
        L13:
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.でどあくず.〺つふすそ r0 = r9.f3213
            float r0 = r0.f9346
            int r0 = (int) r0
            int r0 = r10 - r0
            int r0 = java.lang.Math.max(r1, r0)
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.でどあくず.〺つふすそ r2 = r9.f3213
            int r2 = r2.getIntrinsicWidth()
            int r2 = r10 - r2
            int r2 = java.lang.Math.max(r1, r2)
            if (r2 > 0) goto L3a
            if (r0 > 0) goto L3a
            android.graphics.drawable.InsetDrawable r10 = r9.f3215
            if (r10 == 0) goto L36
            r9.m1379()
            goto L39
        L36:
            r9.m1386()
        L39:
            return r1
        L3a:
            if (r2 <= 0) goto L40
            int r2 = r2 / 2
            r7 = r2
            goto L41
        L40:
            r7 = 0
        L41:
            if (r0 <= 0) goto L47
            int r1 = r0 / 2
            r8 = r1
            goto L48
        L47:
            r8 = 0
        L48:
            android.graphics.drawable.InsetDrawable r0 = r9.f3215
            r1 = 1
            if (r0 == 0) goto L6b
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.drawable.InsetDrawable r2 = r9.f3215
            r2.getPadding(r0)
            int r2 = r0.top
            if (r2 != r8) goto L6b
            int r2 = r0.bottom
            if (r2 != r8) goto L6b
            int r2 = r0.left
            if (r2 != r7) goto L6b
            int r0 = r0.right
            if (r0 != r7) goto L6b
            r9.m1386()
            return r1
        L6b:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r0 < r2) goto L81
            int r0 = r9.getMinHeight()
            if (r0 == r10) goto L7a
            r9.setMinHeight(r10)
        L7a:
            int r0 = r9.getMinWidth()
            if (r0 == r10) goto L87
            goto L84
        L81:
            r9.setMinHeight(r10)
        L84:
            r9.setMinWidth(r10)
        L87:
            android.graphics.drawable.InsetDrawable r10 = new android.graphics.drawable.InsetDrawable
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.でどあくず.〺つふすそ r4 = r9.f3213
            r3 = r10
            r5 = r7
            r6 = r8
            r3.<init>(r4, r5, r6, r7, r8)
            r9.f3215 = r10
            r9.m1386()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.m1385(int):boolean");
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final void m1386() {
        if (C2235.f9290) {
            m1380();
            return;
        }
        this.f3213.m4377(true);
        Drawable backgroundDrawable = getBackgroundDrawable();
        AtomicInteger atomicInteger = C1096.f5578;
        if (Build.VERSION.SDK_INT >= 16) {
            setBackground(backgroundDrawable);
        } else {
            setBackgroundDrawable(backgroundDrawable);
        }
        m1387();
        if (getBackgroundDrawable() == this.f3215 && this.f3213.getCallback() == null) {
            this.f3213.setCallback(this.f3215);
        }
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final void m1387() {
        C2244 c2244;
        if (TextUtils.isEmpty(getText()) || (c2244 = this.f3213) == null) {
            return;
        }
        int m4358 = (int) (c2244.m4358() + c2244.f9304 + c2244.f9324);
        C2244 c22442 = this.f3213;
        int m4393 = (int) (c22442.m4393() + c22442.f9329 + c22442.f9337);
        if (this.f3215 != null) {
            Rect rect = new Rect();
            this.f3215.getPadding(rect);
            m4393 += rect.left;
            m4358 += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        AtomicInteger atomicInteger = C1096.f5578;
        if (Build.VERSION.SDK_INT >= 17) {
            setPaddingRelative(m4393, paddingTop, m4358, paddingBottom);
        } else {
            setPadding(m4393, paddingTop, m4358, paddingBottom);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.f9321.m4398(new C2145(c2244.f9327, i), c2244.f9327);
        }
        m1383();
    }

    public void setTextAppearance(C2145 c2145) {
        C2244 c2244 = this.f3213;
        if (c2244 != null) {
            c2244.f9321.m4398(c2145, c2244.f9327);
        }
        m1383();
    }
}
