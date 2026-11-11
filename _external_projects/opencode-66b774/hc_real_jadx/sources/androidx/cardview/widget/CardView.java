package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p034.p096.C1744;
import p034.p096.C1746;
import p034.p096.C1747;
import p034.p096.C1758;
import p034.p096.p097.C1748;
import p034.p096.p097.C1751;
import p034.p096.p097.C1753;
import p034.p096.p097.InterfaceC1755;
import p034.p096.p097.InterfaceC1757;

/* loaded from: /tmp/opencode/hc_real.dex */
public class CardView extends FrameLayout {

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public static final InterfaceC1755 f654;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public static final int[] f655 = {R.attr.colorBackground};

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final InterfaceC1757 f656;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean f657;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final Rect f658;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public boolean f659;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f660;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final Rect f661;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f662;

    /* renamed from: androidx.cardview.widget.CardView$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0111 implements InterfaceC1757 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public Drawable f664;

        public C0111() {
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public void m249(int i, int i2, int i3, int i4) {
            CardView.this.f658.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.f661;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public boolean m250() {
            return CardView.this.getPreventCornerOverlap();
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        InterfaceC1755 c1748 = i >= 21 ? new C1748() : i >= 17 ? new C1753() : new C1751();
        f654 = c1748;
        c1748.mo3785();
    }

    public CardView(Context context) {
        this(context, null);
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1746.cardViewStyle);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources;
        int i2;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f661 = rect;
        this.f658 = new Rect();
        C0111 c0111 = new C0111();
        this.f656 = c0111;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1747.CardView, i, C1758.CardView);
        int i3 = C1747.CardView_cardBackgroundColor;
        if (obtainStyledAttributes.hasValue(i3)) {
            valueOf = obtainStyledAttributes.getColorStateList(i3);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f655);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                i2 = C1744.cardview_light_background;
            } else {
                resources = getResources();
                i2 = C1744.cardview_dark_background;
            }
            valueOf = ColorStateList.valueOf(resources.getColor(i2));
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(C1747.CardView_cardCornerRadius, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(C1747.CardView_cardElevation, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(C1747.CardView_cardMaxElevation, 0.0f);
        this.f657 = obtainStyledAttributes.getBoolean(C1747.CardView_cardUseCompatPadding, false);
        this.f659 = obtainStyledAttributes.getBoolean(C1747.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C1747.CardView_contentPadding, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(C1747.CardView_contentPaddingLeft, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(C1747.CardView_contentPaddingTop, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(C1747.CardView_contentPaddingRight, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(C1747.CardView_contentPaddingBottom, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f662 = obtainStyledAttributes.getDimensionPixelSize(C1747.CardView_android_minWidth, 0);
        this.f660 = obtainStyledAttributes.getDimensionPixelSize(C1747.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        f654.mo3789(c0111, context, colorStateList, dimension, dimension2, f);
    }

    public ColorStateList getCardBackgroundColor() {
        return f654.mo3784(this.f656);
    }

    public float getCardElevation() {
        return f654.mo3791(this.f656);
    }

    public int getContentPaddingBottom() {
        return this.f661.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f661.left;
    }

    public int getContentPaddingRight() {
        return this.f661.right;
    }

    public int getContentPaddingTop() {
        return this.f661.top;
    }

    public float getMaxCardElevation() {
        return f654.mo3790(this.f656);
    }

    public boolean getPreventCornerOverlap() {
        return this.f659;
    }

    public float getRadius() {
        return f654.mo3783(this.f656);
    }

    public boolean getUseCompatPadding() {
        return this.f657;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (!(f654 instanceof C1748)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.mo3786(this.f656)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.mo3797(this.f656)), View.MeasureSpec.getSize(i2)), mode2);
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        f654.mo3796(this.f656, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f654.mo3796(this.f656, colorStateList);
    }

    public void setCardElevation(float f) {
        f654.mo3792(this.f656, f);
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.f661.set(i, i2, i3, i4);
        f654.mo3793(this.f656);
    }

    public void setMaxCardElevation(float f) {
        f654.mo3788(this.f656, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.f660 = i;
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.f662 = i;
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f659) {
            this.f659 = z;
            f654.mo3794(this.f656);
        }
    }

    public void setRadius(float f) {
        f654.mo3795(this.f656, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f657 != z) {
            this.f657 = z;
            f654.mo3798(this.f656);
        }
    }
}
