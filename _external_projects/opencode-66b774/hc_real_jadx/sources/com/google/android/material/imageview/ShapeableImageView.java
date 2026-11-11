package com.google.android.material.imageview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import p034.p050.p055.p056.C1266;
import p131.p161.p162.p163.C2350;
import p131.p161.p162.p163.p173.C2163;
import p131.p161.p162.p163.p173.C2180;
import p131.p161.p162.p163.p173.C2184;
import p131.p161.p162.p163.p173.InterfaceC2169;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ShapeableImageView extends AppCompatImageView implements InterfaceC2169 {

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public static final int f3299 = C2350.Widget_MaterialComponents_ShapeableImageView;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final Paint f3300;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final Paint f3301;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public ColorStateList f3302;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final RectF f3303;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public float f3304;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final RectF f3305;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public Path f3306;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final C2184 f3307;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public final C2163 f3308;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final Path f3309;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public C2180 f3310;

    @TargetApi(21)
    /* renamed from: com.google.android.material.imageview.ShapeableImageView$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0447 extends ViewOutlineProvider {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final Rect f3312 = new Rect();

        public C0447() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            ShapeableImageView shapeableImageView = ShapeableImageView.this;
            if (shapeableImageView.f3310 == null) {
                return;
            }
            shapeableImageView.f3303.round(this.f3312);
            ShapeableImageView.this.f3308.setBounds(this.f3312);
            ShapeableImageView.this.f3308.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ShapeableImageView(android.content.Context r6, android.util.AttributeSet r7, int r8) {
        /*
            r5 = this;
            int r0 = com.google.android.material.imageview.ShapeableImageView.f3299
            android.content.Context r6 = p131.p161.p162.p163.p164.p165.C2112.m4210(r6, r7, r8, r0)
            r5.<init>(r6, r7, r8)
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.のぷのちつ r6 = new なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.のぷのちつ
            r6.<init>()
            r5.f3307 = r6
            android.graphics.Path r6 = new android.graphics.Path
            r6.<init>()
            r5.f3309 = r6
            android.content.Context r6 = r5.getContext()
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r5.f3300 = r1
            r2 = 1
            r1.setAntiAlias(r2)
            r3 = -1
            r1.setColor(r3)
            android.graphics.PorterDuffXfermode r3 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.DST_OUT
            r3.<init>(r4)
            r1.setXfermode(r3)
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r5.f3303 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r5.f3305 = r1
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r5.f3306 = r1
            int[] r1 = p131.p161.p162.p163.C2243.ShapeableImageView
            android.content.res.TypedArray r1 = r6.obtainStyledAttributes(r7, r1, r8, r0)
            int r3 = p131.p161.p162.p163.C2243.ShapeableImageView_strokeColor
            android.content.res.ColorStateList r3 = p034.p095.C1687.m3662(r6, r1, r3)
            r5.f3302 = r3
            int r3 = p131.p161.p162.p163.C2243.ShapeableImageView_strokeWidth
            r4 = 0
            int r1 = r1.getDimensionPixelSize(r3, r4)
            float r1 = (float) r1
            r5.f3304 = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r5.f3301 = r1
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r3)
            r1.setAntiAlias(r2)
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.げつ〴ぬぐ r1 = new なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.げつ〴ぬぐ
            float r2 = (float) r4
            r1.<init>(r2)
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.てぜきぽく$〺つふすそ r6 = p131.p161.p162.p163.p173.C2180.m4283(r6, r7, r8, r0, r1)
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.てぜきぽく r6 = r6.m4291()
            r5.f3310 = r6
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.〳ぜぞぜべっ r6 = new なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.〳ぜぞぜべっ
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.てぜきぽく r7 = r5.f3310
            r6.<init>(r7)
            r5.f3308 = r6
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 21
            if (r6 < r7) goto L97
            com.google.android.material.imageview.ShapeableImageView$げつ〴ぬぐ r6 = new com.google.android.material.imageview.ShapeableImageView$げつ〴ぬぐ
            r6.<init>()
            r5.setOutlineProvider(r6)
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.imageview.ShapeableImageView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public C2180 getShapeAppearanceModel() {
        return this.f3310;
    }

    public ColorStateList getStrokeColor() {
        return this.f3302;
    }

    public float getStrokeWidth() {
        return this.f3304;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setLayerType(2, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        setLayerType(0, null);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f3306, this.f3300);
        if (this.f3302 == null) {
            return;
        }
        this.f3301.setStrokeWidth(this.f3304);
        int colorForState = this.f3302.getColorForState(getDrawableState(), this.f3302.getDefaultColor());
        if (this.f3304 <= 0.0f || colorForState == 0) {
            return;
        }
        this.f3301.setColor(colorForState);
        canvas.drawPath(this.f3309, this.f3301);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m1443(i, i2);
    }

    @Override // p131.p161.p162.p163.p173.InterfaceC2169
    public void setShapeAppearanceModel(C2180 c2180) {
        this.f3310 = c2180;
        C2163 c2163 = this.f3308;
        c2163.f9045.f9074 = c2180;
        c2163.invalidateSelf();
        m1443(getWidth(), getHeight());
        invalidate();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f3302 = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i) {
        setStrokeColor(C1266.m2929(getContext(), i));
    }

    public void setStrokeWidth(float f) {
        if (this.f3304 != f) {
            this.f3304 = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i) {
        setStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final void m1443(int i, int i2) {
        this.f3303.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
        this.f3307.m4297(this.f3310, 1.0f, this.f3303, this.f3309);
        this.f3306.rewind();
        this.f3306.addPath(this.f3309);
        this.f3305.set(0.0f, 0.0f, i, i2);
        this.f3306.addRect(this.f3305, Path.Direction.CCW);
    }
}
