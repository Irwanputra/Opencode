package dev.epro.r0;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public class Y5360590127176187529 extends R2997011295864497150 implements Checkable, G1431963772438413962 {
    public static final int[] J = {R.attr.state_checkable};
    public static final int[] K = {R.attr.state_checked};
    public int A;
    public int B;
    public boolean C;
    public int D;
    public int E;
    public int F;
    public Q7752057199655583902 G;
    public float H;
    public float I;
    public final J14401793345785926215 e;
    public final LinkedHashSet f;
    public PorterDuff.Mode g;
    public ColorStateList h;
    public Drawable i;
    public PorterDuff.Mode j;
    public ColorStateList k;
    public Drawable l;
    public boolean m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f592o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public boolean v;
    public int w;
    public int x;
    public int y;
    public float z;

    /* JADX WARN: Removed duplicated region for block: B:28:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Y5360590127176187529(android.content.Context r17, android.util.AttributeSet r18) {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Y5360590127176187529.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private float getDisplayedWidthIncrease() {
        return this.H;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    private void setCheckedInternal(boolean z) {
        J14401793345785926215 j14401793345785926215 = this.e;
        if (j14401793345785926215 == null || !j14401793345785926215.s || this.u == z) {
            return;
        }
        this.u = z;
        refreshDrawableState();
        getParent();
        if (this.v) {
            return;
        }
        this.v = true;
        Iterator it = this.f.iterator();
        if (!it.hasNext()) {
            this.v = false;
        } else {
            it.next().getClass();
            Z3383101362411723454.s();
        }
    }

    private void setDisplayedWidthIncrease(float f) {
        if (this.H != f) {
            this.H = f;
            s();
            invalidate();
            getParent();
        }
    }

    public final boolean b() {
        if (j() && m()) {
            return true;
        }
        if (i() && l()) {
            return true;
        }
        return k() && n();
    }

    public final boolean c(int i) {
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        return i == 1 || i == 3 || (i == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE);
    }

    public final Y16108220161693303283 d() {
        Context context = getContext();
        TypedValue typedValueV = S10823041268949770285.V(context.getTheme(), net.zetetic.database.R.attr.motionSpringFastSpatial);
        int[] iArr = Q9005017131391967988.k;
        TypedArray typedArrayObtainStyledAttributes = typedValueV == null ? context.obtainStyledAttributes(null, iArr, 0, net.zetetic.database.R.style.Motion_Material3_Spring_Standard_Fast_Spatial) : context.obtainStyledAttributes(typedValueV.resourceId, iArr);
        Y16108220161693303283 y16108220161693303283 = new Y16108220161693303283();
        try {
            float f = typedArrayObtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f2 = typedArrayObtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f2 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            if (f <= 0.0f) {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
            y16108220161693303283.a = Math.sqrt(f);
            y16108220161693303283.c = false;
            if (f2 < 0.0f) {
                throw new IllegalArgumentException("Damping ratio must be non-negative");
            }
            y16108220161693303283.b = f2;
            y16108220161693303283.c = false;
            typedArrayObtainStyledAttributes.recycle();
            return y16108220161693303283;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final int e(int i, int i2) {
        int intrinsicWidth;
        int intrinsicWidth2;
        Drawable drawable = this.i;
        if (drawable != null) {
            intrinsicWidth = this.f592o;
            if (intrinsicWidth == 0) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
        } else {
            intrinsicWidth = 0;
        }
        Drawable drawable2 = this.l;
        if (drawable2 != null) {
            intrinsicWidth2 = this.f592o;
            if (intrinsicWidth2 == 0) {
                intrinsicWidth2 = drawable2.getIntrinsicWidth();
            }
        } else {
            intrinsicWidth2 = 0;
        }
        int textLayoutWidth = (((((i - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - intrinsicWidth2) - this.r) - getPaddingStart();
        if (getActualTextAlignment() == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        return (getLayoutDirection() == 1) != (i2 == 4) ? -textLayoutWidth : textLayoutWidth;
    }

    public final int f(int i, int i2) {
        return Math.max(0, (((((i - getTextHeight()) - getPaddingTop()) - i2) - this.r) - getPaddingBottom()) / 2);
    }

    public final Drawable g(int i) {
        if (i == 0) {
            if (this.l == null || !m()) {
                return null;
            }
            return this.l;
        }
        if (i == 1) {
            if (this.l == null || !n()) {
                return null;
            }
            return this.l;
        }
        if (i == 2 && this.l != null && l()) {
            return this.l;
        }
        return null;
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.n)) {
            return this.n;
        }
        J14401793345785926215 j14401793345785926215 = this.e;
        return ((j14401793345785926215 == null || !j14401793345785926215.s) ? Button.class : CompoundButton.class).getName();
    }

    public int getAllowedWidthDecrease() {
        return this.E;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (o()) {
            return this.e.i;
        }
        return 0;
    }

    public Y16108220161693303283 getCornerSpringForce() {
        return this.e.c;
    }

    public Drawable getIcon() {
        return this.i;
    }

    public int getIconGravity() {
        return this.w;
    }

    public int getIconPadding() {
        return this.r;
    }

    public int getIconSize() {
        return this.f592o;
    }

    public ColorStateList getIconTint() {
        return this.h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.g;
    }

    public int getInsetBottom() {
        return this.e.h;
    }

    public int getInsetLeft() {
        return this.e.e;
    }

    public int getInsetRight() {
        return this.e.f;
    }

    public int getInsetTop() {
        return this.e.g;
    }

    public ColorStateList getRippleColor() {
        if (o()) {
            return this.e.n;
        }
        return null;
    }

    public Drawable getSecondaryIcon() {
        return this.l;
    }

    public int getSecondaryIconGravity() {
        return this.x;
    }

    public ColorStateList getSecondaryIconTint() {
        return this.k;
    }

    public PorterDuff.Mode getSecondaryIconTintMode() {
        return this.j;
    }

    public I9906786506247477813 getShapeAppearance() {
        if (o()) {
            return this.e.b;
        }
        S10973172697741180971.m("Attempted to get ShapeAppearance from a MaterialButton which has an overwritten background.");
        return null;
    }

    public A11042752882447342413 getShapeAppearanceModel() {
        if (o()) {
            return this.e.b.c();
        }
        S10973172697741180971.m("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (o()) {
            return this.e.m;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (o()) {
            return this.e.j;
        }
        return 0;
    }

    @Override // dev.epro.r0.R2997011295864497150
    public ColorStateList getSupportBackgroundTintList() {
        return o() ? this.e.l : super.getSupportBackgroundTintList();
    }

    @Override // dev.epro.r0.R2997011295864497150
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return o() ? this.e.k : super.getSupportBackgroundTintMode();
    }

    public final Drawable h(int i) {
        if (i == 0) {
            if (this.i == null || !j()) {
                return null;
            }
            return this.i;
        }
        if (i == 1) {
            if (this.i == null || !i()) {
                return null;
            }
            return this.i;
        }
        if (i == 2 && this.i != null && i()) {
            return this.i;
        }
        return null;
    }

    public final boolean i() {
        int i = this.w;
        return i == 3 || i == 4;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.u;
    }

    public final boolean j() {
        int i = this.w;
        return i == 1 || i == 2;
    }

    public final boolean k() {
        int i = this.w;
        return i == 16 || i == 32;
    }

    public final boolean l() {
        int i = this.x;
        return i == 3 || i == 4;
    }

    public final boolean m() {
        int i = this.x;
        return i == 1 || i == 2;
    }

    public final boolean n() {
        int i = this.x;
        return i == 16 || i == 32;
    }

    public final boolean o() {
        J14401793345785926215 j14401793345785926215 = this.e;
        return (j14401793345785926215 == null || j14401793345785926215.q) ? false : true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (o()) {
            I11571046933844109529 i11571046933844109529A = this.e.a(false);
            K1968397570448307835 k1968397570448307835 = i11571046933844109529A.b.b;
            if (k1968397570448307835 == null || !k1968397570448307835.a) {
                return;
            }
            float elevation = 0.0f;
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                elevation += ((View) parent).getElevation();
            }
            G8524789311406442313 g8524789311406442313 = i11571046933844109529A.b;
            if (g8524789311406442313.l != elevation) {
                g8524789311406442313.l = elevation;
                i11571046933844109529A.o();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        J14401793345785926215 j14401793345785926215 = this.e;
        if (j14401793345785926215 != null && j14401793345785926215.s) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, J);
        }
        if (this.u) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, K);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // dev.epro.r0.R2997011295864497150, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.u);
    }

    @Override // dev.epro.r0.R2997011295864497150, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        J14401793345785926215 j14401793345785926215 = this.e;
        accessibilityNodeInfo.setCheckable(j14401793345785926215 != null && j14401793345785926215.s);
        accessibilityNodeInfo.setChecked(this.u);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // dev.epro.r0.R2997011295864497150, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        r(getMeasuredWidth(), getMeasuredHeight());
        u(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.y != i6) {
            this.y = i6;
            this.z = -2.14748365E9f;
        }
        if (this.z == -2.14748365E9f) {
            this.z = getMeasuredWidth();
            getParent();
        }
        if (this.E == Integer.MIN_VALUE) {
            if (this.i == null) {
                i5 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.f592o;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.i.getIntrinsicWidth();
                }
                i5 = iconPadding + intrinsicWidth;
            }
            this.E = (getMeasuredWidth() - getTextLayoutWidth()) - i5;
        }
        if (this.A == Integer.MIN_VALUE) {
            this.A = getPaddingStart();
        }
        if (this.B == Integer.MIN_VALUE) {
            this.B = getPaddingEnd();
        }
        getParent();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof I4895091436342539248)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        I4895091436342539248 i4895091436342539248 = (I4895091436342539248) parcelable;
        super.onRestoreInstanceState(i4895091436342539248.a);
        setChecked(i4895091436342539248.c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        I4895091436342539248 i4895091436342539248 = new I4895091436342539248(super.onSaveInstanceState());
        i4895091436342539248.c = this.u;
        return i4895091436342539248;
    }

    @Override // dev.epro.r0.R2997011295864497150, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        r(getMeasuredWidth(), getMeasuredHeight());
        u(getMeasuredWidth(), getMeasuredHeight());
    }

    public final /* synthetic */ void p() {
        this.D = getOpticalCenterShift();
        s();
        invalidate();
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean z;
        if (isEnabled() && this.e.t) {
            toggle();
            z = true;
        } else {
            z = false;
        }
        boolean zPerformClick = super.performClick();
        if (z && !zPerformClick) {
            playSoundEffect(0);
        }
        return zPerformClick;
    }

    public final void q(boolean z) {
        Drawable drawable = this.i;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.i = drawableMutate;
            drawableMutate.setTintList(this.h);
            PorterDuff.Mode mode = this.g;
            if (mode != null) {
                this.i.setTintMode(mode);
            }
            int intrinsicWidth = this.f592o;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.i.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f592o;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.i;
            int i = this.p;
            int i2 = this.q;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.i.setVisible(true, z);
        }
        if (this.i != null && this.l != null && b()) {
            S10973172697741180971.j("iconGravity cannot have the same alignment as secondaryIconGravity");
            return;
        }
        if (this.i == null && this.l != null && b()) {
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = (j() && compoundDrawablesRelative[0] != this.i) || (i() && compoundDrawablesRelative[2] != this.i) || (k() && compoundDrawablesRelative[1] != this.i);
        if (z || z2) {
            if (j()) {
                setCompoundDrawablesRelative(this.i, g(1), g(2), null);
            } else if (i()) {
                setCompoundDrawablesRelative(g(0), g(1), this.i, null);
            } else if (k()) {
                setCompoundDrawablesRelative(g(0), this.i, g(2), null);
            }
        }
    }

    public final void r(int i, int i2) {
        if (this.i == null || getLayout() == null) {
            return;
        }
        if (j() || i()) {
            this.q = 0;
            if (c(this.w)) {
                this.p = 0;
                q(false);
                return;
            }
            int iE = e(i, this.w);
            if (this.p != iE) {
                this.p = iE;
                q(false);
                return;
            }
            return;
        }
        if (k()) {
            this.p = 0;
            if (this.w == 16) {
                this.q = 0;
                q(false);
                return;
            }
            int intrinsicHeight = this.f592o;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.i.getIntrinsicHeight();
            }
            int iF = f(i2, intrinsicHeight);
            if (this.q != iF) {
                this.q = iF;
                q(false);
            }
        }
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.i != null) {
            if (this.i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public final void s() {
        int i = (int) (this.H - this.I);
        boolean z = getLayoutDirection() == 1;
        int i2 = this.D;
        if (z) {
            i2 = -i2;
        }
        int i3 = (i / 2) + i2;
        if (getLayoutParams() != null) {
            getLayoutParams().width = (int) (this.z + i);
        }
        setPaddingRelative(this.A + i3, getPaddingTop(), (this.B + i) - i3, getPaddingBottom());
    }

    public void setA11yClassName(String str) {
        this.n = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!o()) {
            super.setBackgroundColor(i);
            return;
        }
        J14401793345785926215 j14401793345785926215 = this.e;
        if (j14401793345785926215.a(false) != null) {
            j14401793345785926215.a(false).setTint(i);
        }
    }

    @Override // dev.epro.r0.R2997011295864497150, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!o()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        J14401793345785926215 j14401793345785926215 = this.e;
        j14401793345785926215.q = true;
        Y5360590127176187529 y5360590127176187529 = j14401793345785926215.a;
        y5360590127176187529.setSupportBackgroundTintList(j14401793345785926215.l);
        y5360590127176187529.setSupportBackgroundTintMode(j14401793345785926215.k);
        super.setBackgroundDrawable(drawable);
    }

    @Override // dev.epro.r0.R2997011295864497150, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? M9216324016624295870.G(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (o()) {
            this.e.s = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedInternal(z);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablePadding(int i) {
        if (getCompoundDrawablePadding() != i) {
            this.z = -2.14748365E9f;
        }
        super.setCompoundDrawablePadding(i);
    }

    public void setCornerRadius(int i) {
        if (o()) {
            J14401793345785926215 j14401793345785926215 = this.e;
            if (j14401793345785926215.r && j14401793345785926215.i == i) {
                return;
            }
            j14401793345785926215.i = i;
            j14401793345785926215.r = true;
            j14401793345785926215.b = j14401793345785926215.b.a(i);
            j14401793345785926215.d();
        }
    }

    public void setCornerRadiusResource(int i) {
        if (o()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCornerSpringForce(Y16108220161693303283 y16108220161693303283) {
        J14401793345785926215 j14401793345785926215 = this.e;
        j14401793345785926215.c = y16108220161693303283;
        if (j14401793345785926215.b instanceof R3555377658195931925) {
            j14401793345785926215.d();
        }
    }

    public void setDisplayedWidthDecrease(int i) {
        this.I = Math.min(i, this.E);
        s();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (o()) {
            I11571046933844109529 i11571046933844109529A = this.e.a(false);
            G8524789311406442313 g8524789311406442313 = i11571046933844109529A.b;
            if (g8524789311406442313.m != f) {
                g8524789311406442313.m = f;
                i11571046933844109529A.o();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.i != drawable) {
            this.z = -2.14748365E9f;
            this.i = drawable;
            q(true);
            r(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.w != i) {
            if (this.i != null && this.l != null && b()) {
                S10973172697741180971.j("iconGravity cannot have the same alignment as secondaryIconGravity");
            } else {
                this.w = i;
                r(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void setIconPadding(int i) {
        if (this.r != i) {
            this.r = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? M9216324016624295870.G(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            S10973172697741180971.j("iconSize cannot be less than 0");
        } else if (this.f592o != i) {
            this.z = -2.14748365E9f;
            this.f592o = i;
            q(true);
            t(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.h != colorStateList) {
            this.h = colorStateList;
            q(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.g != mode) {
            this.g = mode;
            q(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(B5998207562248239613.r(getContext(), i));
    }

    public void setInsetBottom(int i) {
        J14401793345785926215 j14401793345785926215 = this.e;
        j14401793345785926215.b(j14401793345785926215.e, j14401793345785926215.g, j14401793345785926215.f, i);
    }

    public void setInsetLeft(int i) {
        J14401793345785926215 j14401793345785926215 = this.e;
        j14401793345785926215.b(i, j14401793345785926215.g, j14401793345785926215.f, j14401793345785926215.h);
    }

    public void setInsetRight(int i) {
        J14401793345785926215 j14401793345785926215 = this.e;
        j14401793345785926215.b(j14401793345785926215.e, j14401793345785926215.g, i, j14401793345785926215.h);
    }

    public void setInsetTop(int i) {
        J14401793345785926215 j14401793345785926215 = this.e;
        j14401793345785926215.b(j14401793345785926215.e, i, j14401793345785926215.f, j14401793345785926215.h);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOpticalCenterEnabled(boolean z) {
        if (this.C != z) {
            this.C = z;
            J14401793345785926215 j14401793345785926215 = this.e;
            if (z) {
                L4980660535418402690 l4980660535418402690 = new L4980660535418402690(this, (byte) 6);
                j14401793345785926215.d = l4980660535418402690;
                I11571046933844109529 i11571046933844109529A = j14401793345785926215.a(false);
                if (i11571046933844109529A != null) {
                    i11571046933844109529A.D = l4980660535418402690;
                }
            } else {
                j14401793345785926215.d = null;
                I11571046933844109529 i11571046933844109529A2 = j14401793345785926215.a(false);
                if (i11571046933844109529A2 != null) {
                    i11571046933844109529A2.D = null;
                }
            }
            post(new W13948953340889349604(this, (byte) 19));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (o()) {
            J14401793345785926215 j14401793345785926215 = this.e;
            Y5360590127176187529 y5360590127176187529 = j14401793345785926215.a;
            if (j14401793345785926215.n != colorStateList) {
                j14401793345785926215.n = colorStateList;
                if (y5360590127176187529.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) y5360590127176187529.getBackground()).setColor(D1286559660607336098.D(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (o()) {
            setRippleColor(B5998207562248239613.r(getContext(), i));
        }
    }

    public void setSecondaryIcon(Drawable drawable) {
        if (this.l != drawable) {
            this.z = -2.14748365E9f;
            this.l = drawable;
            this.m = false;
            t(true);
            u(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setSecondaryIconGravity(int i) {
        if (this.x != i) {
            if (this.l != null && this.i != null && b()) {
                S10973172697741180971.j("secondaryIconGravity cannot have the same alignment as iconGravity");
            } else {
                this.x = i;
                u(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void setSecondaryIconResource(int i) {
        setSecondaryIcon(i != 0 ? M9216324016624295870.G(getContext(), i) : null);
    }

    public void setSecondaryIconTint(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            t(false);
        }
    }

    public void setSecondaryIconTintMode(PorterDuff.Mode mode) {
        if (this.j != mode) {
            this.j = mode;
            t(false);
        }
    }

    public void setSecondaryIconTintResource(int i) {
        setSecondaryIconTint(B5998207562248239613.r(getContext(), i));
    }

    public void setShapeAppearance(I9906786506247477813 i9906786506247477813) {
        if (!o()) {
            S10973172697741180971.m("Attempted to set ShapeAppearance on a MaterialButton which has an overwritten background.");
            return;
        }
        J14401793345785926215 j14401793345785926215 = this.e;
        if (j14401793345785926215.c == null && i9906786506247477813.d()) {
            j14401793345785926215.c = d();
            if (j14401793345785926215.b instanceof R3555377658195931925) {
                j14401793345785926215.d();
            }
        }
        j14401793345785926215.b = i9906786506247477813;
        j14401793345785926215.d();
    }

    @Override // dev.epro.r0.G1431963772438413962
    public void setShapeAppearanceModel(A11042752882447342413 a11042752882447342413) {
        if (!o()) {
            S10973172697741180971.m("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
            return;
        }
        J14401793345785926215 j14401793345785926215 = this.e;
        j14401793345785926215.b = a11042752882447342413;
        j14401793345785926215.d();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (o()) {
            J14401793345785926215 j14401793345785926215 = this.e;
            j14401793345785926215.p = z;
            j14401793345785926215.e();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (o()) {
            J14401793345785926215 j14401793345785926215 = this.e;
            if (j14401793345785926215.m != colorStateList) {
                j14401793345785926215.m = colorStateList;
                j14401793345785926215.e();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (o()) {
            setStrokeColor(B5998207562248239613.r(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (o()) {
            J14401793345785926215 j14401793345785926215 = this.e;
            if (j14401793345785926215.j != i) {
                j14401793345785926215.j = i;
                j14401793345785926215.e();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (o()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // dev.epro.r0.R2997011295864497150
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!o()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        J14401793345785926215 j14401793345785926215 = this.e;
        if (j14401793345785926215.l != colorStateList) {
            j14401793345785926215.l = colorStateList;
            if (j14401793345785926215.a(false) != null) {
                j14401793345785926215.a(false).setTintList(j14401793345785926215.l);
            }
        }
    }

    @Override // dev.epro.r0.R2997011295864497150
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!o()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        J14401793345785926215 j14401793345785926215 = this.e;
        if (j14401793345785926215.k != mode) {
            j14401793345785926215.k = mode;
            if (j14401793345785926215.a(false) == null || j14401793345785926215.k == null) {
                return;
            }
            j14401793345785926215.a(false).setTintMode(j14401793345785926215.k);
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.z = -2.14748365E9f;
        super.setText(charSequence, bufferType);
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        r(getMeasuredWidth(), getMeasuredHeight());
        u(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // dev.epro.r0.R2997011295864497150, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        this.z = -2.14748365E9f;
        super.setTextAppearance(context, i);
    }

    @Override // dev.epro.r0.R2997011295864497150, android.widget.TextView
    public final void setTextSize(int i, float f) {
        this.z = -2.14748365E9f;
        super.setTextSize(i, f);
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.e.t = z;
    }

    @Override // android.widget.TextView
    public void setWidth(int i) {
        this.z = -2.14748365E9f;
        super.setWidth(i);
    }

    public void setWidthChangeDirection(Q7752057199655583902 q7752057199655583902) {
        if (this.G != q7752057199655583902) {
            this.G = q7752057199655583902;
        }
    }

    public void setWidthChangeMax(int i) {
        if (this.F != i) {
            this.F = i;
        }
    }

    public final void t(boolean z) {
        Drawable drawable = this.l;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.l = drawableMutate;
            drawableMutate.setTintList(this.k);
            PorterDuff.Mode mode = this.j;
            if (mode != null) {
                this.l.setTintMode(mode);
            }
            int intrinsicWidth = this.f592o;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.l.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f592o;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.l.getIntrinsicHeight();
            }
            Drawable drawable2 = this.l;
            int i = this.s;
            int i2 = this.t;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.l.setVisible(true, z);
        }
        if (this.l != null && this.i != null && b()) {
            S10973172697741180971.j("secondaryIconGravity cannot have the same alignment as iconGravity");
            return;
        }
        if (this.l == null) {
            if (this.m) {
                return;
            }
            if (this.i != null && b()) {
                return;
            }
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = (m() && compoundDrawablesRelative[0] != this.l) || (l() && compoundDrawablesRelative[2] != this.l) || (n() && compoundDrawablesRelative[1] != this.l);
        if (z || z2) {
            if (m()) {
                setCompoundDrawablesRelative(this.l, h(1), h(2), null);
            } else if (l()) {
                setCompoundDrawablesRelative(h(0), h(1), this.l, null);
            } else if (n()) {
                setCompoundDrawablesRelative(h(0), this.l, h(2), null);
            }
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.u);
    }

    public final void u(int i, int i2) {
        if (this.l == null || getLayout() == null) {
            return;
        }
        if (m() || l()) {
            this.t = 0;
            if (c(this.x)) {
                this.s = 0;
                t(false);
                return;
            }
            int iE = e(i, this.x);
            if (this.s != iE) {
                this.s = iE;
                t(false);
                return;
            }
            return;
        }
        if (n()) {
            this.s = 0;
            if (this.x == 16) {
                this.t = 0;
                t(false);
                return;
            }
            int intrinsicHeight = this.f592o;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.l.getIntrinsicHeight();
            }
            int iF = f(i2, intrinsicHeight);
            if (this.t != iF) {
                this.t = iF;
                t(false);
            }
        }
    }

    public void setOnPressedChangeListenerInternal(G1736856836069470309 g1736856836069470309) {
    }

    public void setSizeChange(P15922244168156081257 p15922244168156081257) {
    }
}
