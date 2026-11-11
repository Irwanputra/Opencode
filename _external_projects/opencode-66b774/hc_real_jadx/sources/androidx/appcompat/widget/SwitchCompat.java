package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import p034.p035.p045.C1096;
import p034.p050.C1148;
import p034.p050.C1264;
import p034.p050.p053.C1209;
import p034.p050.p053.C1210;
import p034.p050.p053.C1232;
import p034.p050.p053.C1252;
import p034.p050.p053.C1260;
import p034.p050.p054.C1262;
import p034.p050.p055.p056.C1266;
import p237.p238.p239.p241.p242.C2786;

/* loaded from: /tmp/opencode/hc_real.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public ColorStateList f560;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public Drawable f561;

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public ObjectAnimator f562;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public int f563;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public Drawable f564;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public boolean f565;

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public int f566;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public int f567;

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public final C1232 f568;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public CharSequence f569;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public float f570;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public CharSequence f571;

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public final TextPaint f572;

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public TransformationMethod f573;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public boolean f574;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public ColorStateList f575;

    /* renamed from: けときぜと, reason: contains not printable characters */
    public Layout f576;

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public final Rect f577;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public int f578;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public float f579;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public boolean f580;

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public int f581;

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public ColorStateList f582;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean f583;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public int f584;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public float f585;

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public int f586;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public boolean f587;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public int f588;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public int f589;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public int f590;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public int f591;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public PorterDuff.Mode f592;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public VelocityTracker f593;

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public Layout f594;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public int f595;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public PorterDuff.Mode f596;

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public int f597;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public boolean f598;

    /* renamed from: ながふずは, reason: contains not printable characters */
    public static final Property<SwitchCompat, Float> f559 = new C0103(Float.class, "thumbPos");

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public static final int[] f558 = {R.attr.state_checked};

    /* renamed from: androidx.appcompat.widget.SwitchCompat$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0103 extends Property<SwitchCompat, Float> {
        public C0103(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f570);
        }

        @Override // android.util.Property
        public void set(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    }

    public SwitchCompat(Context context) {
        this(context, null);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1264.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f575 = null;
        this.f592 = null;
        this.f583 = false;
        this.f587 = false;
        this.f560 = null;
        this.f596 = null;
        this.f565 = false;
        this.f598 = false;
        this.f593 = VelocityTracker.obtain();
        this.f577 = new Rect();
        C1252.m2892(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f572 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = C1148.SwitchCompat;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        C1260 c1260 = new C1260(context, obtainStyledAttributes);
        C1096.m2493(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        Drawable m2913 = c1260.m2913(C1148.SwitchCompat_android_thumb);
        this.f561 = m2913;
        if (m2913 != null) {
            m2913.setCallback(this);
        }
        Drawable m29132 = c1260.m2913(C1148.SwitchCompat_track);
        this.f564 = m29132;
        if (m29132 != null) {
            m29132.setCallback(this);
        }
        this.f569 = c1260.m2916(C1148.SwitchCompat_android_textOn);
        this.f571 = c1260.m2916(C1148.SwitchCompat_android_textOff);
        this.f580 = c1260.m2918(C1148.SwitchCompat_showText, true);
        this.f584 = c1260.m2921(C1148.SwitchCompat_thumbTextPadding, 0);
        this.f589 = c1260.m2921(C1148.SwitchCompat_switchMinWidth, 0);
        this.f595 = c1260.m2921(C1148.SwitchCompat_switchPadding, 0);
        this.f574 = c1260.m2918(C1148.SwitchCompat_splitTrack, false);
        ColorStateList m2917 = c1260.m2917(C1148.SwitchCompat_thumbTint);
        if (m2917 != null) {
            this.f575 = m2917;
            this.f583 = true;
        }
        PorterDuff.Mode m2697 = C1210.m2697(c1260.m2914(C1148.SwitchCompat_thumbTintMode, -1), null);
        if (this.f592 != m2697) {
            this.f592 = m2697;
            this.f587 = true;
        }
        if (this.f583 || this.f587) {
            m220();
        }
        ColorStateList m29172 = c1260.m2917(C1148.SwitchCompat_trackTint);
        if (m29172 != null) {
            this.f560 = m29172;
            this.f565 = true;
        }
        PorterDuff.Mode m26972 = C1210.m2697(c1260.m2914(C1148.SwitchCompat_trackTintMode, -1), null);
        if (this.f596 != m26972) {
            this.f596 = m26972;
            this.f598 = true;
        }
        if (this.f565 || this.f598) {
            m218();
        }
        int m2922 = c1260.m2922(C1148.SwitchCompat_switchTextAppearance, 0);
        if (m2922 != 0) {
            setSwitchTextAppearance(context, m2922);
        }
        C1232 c1232 = new C1232(this);
        this.f568 = c1232;
        c1232.m2846(attributeSet, i);
        c1260.f6162.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f578 = viewConfiguration.getScaledTouchSlop();
        this.f563 = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    private boolean getTargetCheckedState() {
        return this.f570 > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((C1209.m2693(this) ? 1.0f - this.f570 : this.f570) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f564;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f577;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f561;
        Rect m2695 = drawable2 != null ? C1210.m2695(drawable2) : C1210.f5985;
        return ((((this.f567 - this.f588) - rect.left) - rect.right) - m2695.left) - m2695.right;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        int i2;
        Rect rect = this.f577;
        int i3 = this.f586;
        int i4 = this.f566;
        int i5 = this.f581;
        int i6 = this.f597;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f561;
        Rect m2695 = drawable != null ? C1210.m2695(drawable) : C1210.f5985;
        Drawable drawable2 = this.f564;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (m2695 != null) {
                int i8 = m2695.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = m2695.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = m2695.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = m2695.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.f564.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f564.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f561;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.f588 + rect.right;
            this.f561.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                C2786.m4777(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        Drawable drawable = this.f561;
        if (drawable != null) {
            C2786.m4821(drawable, f, f2);
        }
        Drawable drawable2 = this.f564;
        if (drawable2 != null) {
            C2786.m4821(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f561;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f564;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!C1209.m2693(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f567;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f595 : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (C1209.m2693(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f567;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f595 : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f580;
    }

    public boolean getSplitTrack() {
        return this.f574;
    }

    public int getSwitchMinWidth() {
        return this.f589;
    }

    public int getSwitchPadding() {
        return this.f595;
    }

    public CharSequence getTextOff() {
        return this.f571;
    }

    public CharSequence getTextOn() {
        return this.f569;
    }

    public Drawable getThumbDrawable() {
        return this.f561;
    }

    public int getThumbTextPadding() {
        return this.f584;
    }

    public ColorStateList getThumbTintList() {
        return this.f575;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f592;
    }

    public Drawable getTrackDrawable() {
        return this.f564;
    }

    public ColorStateList getTrackTintList() {
        return this.f560;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f596;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f561;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f564;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f562;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f562.end();
        this.f562 = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, f558);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.f577;
        Drawable drawable = this.f564;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.f566;
        int i2 = this.f597;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.f561;
        if (drawable != null) {
            if (!this.f574 || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect m2695 = C1210.m2695(drawable2);
                drawable2.copyBounds(rect);
                rect.left += m2695.left;
                rect.right -= m2695.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f594 : this.f576;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f582;
            if (colorStateList != null) {
                this.f572.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f572.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.f569 : this.f571;
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        CharSequence text = accessibilityNodeInfo.getText();
        if (TextUtils.isEmpty(text)) {
            accessibilityNodeInfo.setText(charSequence);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(text);
        sb.append(' ');
        sb.append(charSequence);
        accessibilityNodeInfo.setText(sb);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        int i7;
        int i8;
        super.onLayout(z, i, i2, i3, i4);
        int i9 = 0;
        if (this.f561 != null) {
            Rect rect = this.f577;
            Drawable drawable = this.f564;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect m2695 = C1210.m2695(this.f561);
            i5 = Math.max(0, m2695.left - rect.left);
            i9 = Math.max(0, m2695.right - rect.right);
        } else {
            i5 = 0;
        }
        if (C1209.m2693(this)) {
            i6 = getPaddingLeft() + i5;
            width = ((this.f567 + i6) - i5) - i9;
        } else {
            width = (getWidth() - getPaddingRight()) - i9;
            i6 = (width - this.f567) + i5 + i9;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i10 = this.f591;
            int i11 = height - (i10 / 2);
            i7 = i10 + i11;
            i8 = i11;
        } else if (gravity != 80) {
            i8 = getPaddingTop();
            i7 = this.f591 + i8;
        } else {
            i7 = getHeight() - getPaddingBottom();
            i8 = i7 - this.f591;
        }
        this.f586 = i6;
        this.f566 = i8;
        this.f597 = i7;
        this.f581 = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.f580) {
            if (this.f594 == null) {
                this.f594 = m219(this.f569);
            }
            if (this.f576 == null) {
                this.f576 = m219(this.f571);
            }
        }
        Rect rect = this.f577;
        Drawable drawable = this.f561;
        int i6 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.f561.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.f561.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (this.f580) {
            i5 = (this.f584 * 2) + Math.max(this.f594.getWidth(), this.f576.getWidth());
        } else {
            i5 = 0;
        }
        this.f588 = Math.max(i5, i3);
        Drawable drawable2 = this.f564;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i6 = this.f564.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i7 = rect.left;
        int i8 = rect.right;
        Drawable drawable3 = this.f561;
        if (drawable3 != null) {
            Rect m2695 = C1210.m2695(drawable3);
            i7 = Math.max(i7, m2695.left);
            i8 = Math.max(i8, m2695.right);
        }
        int max = Math.max(this.f589, (this.f588 * 2) + i7 + i8);
        int max2 = Math.max(i6, i4);
        this.f567 = max;
        this.f591 = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f569 : this.f571;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r0 != 3) goto L84;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (getWindowToken() == null || !C1096.m2517(this)) {
            ObjectAnimator objectAnimator = this.f562;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(isChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f559, isChecked ? 1.0f : 0.0f);
        this.f562 = ofFloat;
        ofFloat.setDuration(250L);
        if (Build.VERSION.SDK_INT >= 18) {
            this.f562.setAutoCancel(true);
        }
        this.f562.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C2786.m4773(this, callback));
    }

    public void setShowText(boolean z) {
        if (this.f580 != z) {
            this.f580 = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.f574 = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f589 = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f595 = i;
        requestLayout();
    }

    public void setSwitchTextAppearance(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C1148.TextAppearance);
        int i2 = C1148.TextAppearance_android_textColor;
        if (!obtainStyledAttributes.hasValue(i2) || (resourceId = obtainStyledAttributes.getResourceId(i2, 0)) == 0 || (colorStateList = C1266.m2929(context, resourceId)) == null) {
            colorStateList = obtainStyledAttributes.getColorStateList(i2);
        }
        if (colorStateList == null) {
            colorStateList = getTextColors();
        }
        this.f582 = colorStateList;
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C1148.TextAppearance_android_textSize, 0);
        if (dimensionPixelSize != 0) {
            float f = dimensionPixelSize;
            if (f != this.f572.getTextSize()) {
                this.f572.setTextSize(f);
                requestLayout();
            }
        }
        int i3 = obtainStyledAttributes.getInt(C1148.TextAppearance_android_typeface, -1);
        setSwitchTypeface(i3 != 1 ? i3 != 2 ? i3 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, obtainStyledAttributes.getInt(C1148.TextAppearance_android_textStyle, -1));
        if (obtainStyledAttributes.getBoolean(C1148.TextAppearance_textAllCaps, false)) {
            this.f573 = new C1262(getContext());
        } else {
            this.f573 = null;
        }
        obtainStyledAttributes.recycle();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f572.getTypeface() == null || this.f572.getTypeface().equals(typeface)) && (this.f572.getTypeface() != null || typeface == null)) {
            return;
        }
        this.f572.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setSwitchTypeface(Typeface typeface, int i) {
        if (i <= 0) {
            this.f572.setFakeBoldText(false);
            this.f572.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i) : Typeface.create(typeface, i);
            setSwitchTypeface(defaultFromStyle);
            int style = ((defaultFromStyle != null ? defaultFromStyle.getStyle() : 0) ^ (-1)) & i;
            this.f572.setFakeBoldText((style & 1) != 0);
            this.f572.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    public void setTextOff(CharSequence charSequence) {
        this.f571 = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f569 = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f561;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f561 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.f570 = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C1266.m2928(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f584 = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f575 = colorStateList;
        this.f583 = true;
        m220();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f592 = mode;
        this.f587 = true;
        m220();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f564;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f564 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C1266.m2928(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f560 = colorStateList;
        this.f565 = true;
        m218();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f596 = mode;
        this.f598 = true;
        m218();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f561 || drawable == this.f564;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m218() {
        Drawable drawable = this.f564;
        if (drawable != null) {
            if (this.f565 || this.f598) {
                Drawable mutate = C2786.m4758(drawable).mutate();
                this.f564 = mutate;
                if (this.f565) {
                    C2786.m4788(mutate, this.f560);
                }
                if (this.f598) {
                    C2786.m4802(this.f564, this.f596);
                }
                if (this.f564.isStateful()) {
                    this.f564.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final Layout m219(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.f573;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        return new StaticLayout(charSequence2, this.f572, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m220() {
        Drawable drawable = this.f561;
        if (drawable != null) {
            if (this.f583 || this.f587) {
                Drawable mutate = C2786.m4758(drawable).mutate();
                this.f561 = mutate;
                if (this.f583) {
                    C2786.m4788(mutate, this.f575);
                }
                if (this.f587) {
                    C2786.m4802(this.f561, this.f592);
                }
                if (this.f561.isStateful()) {
                    this.f561.setState(getDrawableState());
                }
            }
        }
    }
}
