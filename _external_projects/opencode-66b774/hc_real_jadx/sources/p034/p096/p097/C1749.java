package p034.p096.p097;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import p034.p096.C1744;
import p034.p096.C1745;

/* renamed from: づざかべべ.びぐびあび.なぎぱいぢぎ.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1749 extends Drawable {

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public static final double f7937 = Math.cos(Math.toRadians(45.0d));

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public static InterfaceC1750 f7938;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public float f7939;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public Path f7941;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public float f7942;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public Paint f7945;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final int f7946;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final RectF f7947;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public float f7949;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public final int f7950;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public Paint f7951;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public final int f7952;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public float f7953;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public ColorStateList f7954;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public boolean f7948 = true;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public boolean f7944 = true;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public boolean f7943 = false;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public Paint f7940 = new Paint(5);

    /* renamed from: づざかべべ.びぐびあび.なぎぱいぢぎ.ぁごぐすすぃ$げつ〴ぬぐ, reason: contains not printable characters */
    public interface InterfaceC1750 {
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        void mo3803(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    public C1749(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.f7950 = resources.getColor(C1744.cardview_shadow_start_color);
        this.f7952 = resources.getColor(C1744.cardview_shadow_end_color);
        this.f7946 = resources.getDimensionPixelSize(C1745.cardview_compat_inset_shadow);
        m3801(colorStateList);
        Paint paint = new Paint(5);
        this.f7945 = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f7949 = (int) (f + 0.5f);
        this.f7947 = new RectF();
        Paint paint2 = new Paint(this.f7945);
        this.f7951 = paint2;
        paint2.setAntiAlias(false);
        m3802(f2, f3);
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static float m3799(float f, float f2, boolean z) {
        float f3 = f * 1.5f;
        if (!z) {
            return f3;
        }
        double d = f3;
        double d2 = 1.0d - f7937;
        double d3 = f2;
        Double.isNaN(d3);
        Double.isNaN(d);
        return (float) ((d2 * d3) + d);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static float m3800(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        double d = f;
        double d2 = 1.0d - f7937;
        double d3 = f2;
        Double.isNaN(d3);
        Double.isNaN(d);
        return (float) ((d2 * d3) + d);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i;
        if (this.f7948) {
            Rect bounds = getBounds();
            float f = this.f7939;
            float f2 = 1.5f * f;
            this.f7947.set(bounds.left + f, bounds.top + f2, bounds.right - f, bounds.bottom - f2);
            float f3 = this.f7949;
            float f4 = -f3;
            RectF rectF = new RectF(f4, f4, f3, f3);
            RectF rectF2 = new RectF(rectF);
            float f5 = -this.f7953;
            rectF2.inset(f5, f5);
            Path path = this.f7941;
            if (path == null) {
                this.f7941 = new Path();
            } else {
                path.reset();
            }
            this.f7941.setFillType(Path.FillType.EVEN_ODD);
            this.f7941.moveTo(-this.f7949, 0.0f);
            this.f7941.rLineTo(-this.f7953, 0.0f);
            this.f7941.arcTo(rectF2, 180.0f, 90.0f, false);
            this.f7941.arcTo(rectF, 270.0f, -90.0f, false);
            this.f7941.close();
            float f6 = this.f7949;
            float f7 = f6 / (this.f7953 + f6);
            Paint paint = this.f7945;
            float f8 = this.f7949 + this.f7953;
            int i2 = this.f7950;
            paint.setShader(new RadialGradient(0.0f, 0.0f, f8, new int[]{i2, i2, this.f7952}, new float[]{0.0f, f7, 1.0f}, Shader.TileMode.CLAMP));
            Paint paint2 = this.f7951;
            float f9 = -this.f7949;
            float f10 = this.f7953;
            float f11 = f9 + f10;
            float f12 = f9 - f10;
            int i3 = this.f7950;
            paint2.setShader(new LinearGradient(0.0f, f11, 0.0f, f12, new int[]{i3, i3, this.f7952}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
            this.f7951.setAntiAlias(false);
            this.f7948 = false;
        }
        canvas.translate(0.0f, this.f7942 / 2.0f);
        float f13 = this.f7949;
        float f14 = (-f13) - this.f7953;
        float f15 = (this.f7942 / 2.0f) + f13 + this.f7946;
        float f16 = f15 * 2.0f;
        boolean z = this.f7947.width() - f16 > 0.0f;
        boolean z2 = this.f7947.height() - f16 > 0.0f;
        int save = canvas.save();
        RectF rectF3 = this.f7947;
        canvas.translate(rectF3.left + f15, rectF3.top + f15);
        canvas.drawPath(this.f7941, this.f7945);
        if (z) {
            i = save;
            canvas.drawRect(0.0f, f14, this.f7947.width() - f16, -this.f7949, this.f7951);
        } else {
            i = save;
        }
        canvas.restoreToCount(i);
        int save2 = canvas.save();
        RectF rectF4 = this.f7947;
        canvas.translate(rectF4.right - f15, rectF4.bottom - f15);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f7941, this.f7945);
        if (z) {
            canvas.drawRect(0.0f, f14, this.f7947.width() - f16, (-this.f7949) + this.f7953, this.f7951);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF5 = this.f7947;
        canvas.translate(rectF5.left + f15, rectF5.bottom - f15);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f7941, this.f7945);
        if (z2) {
            canvas.drawRect(0.0f, f14, this.f7947.height() - f16, -this.f7949, this.f7951);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF6 = this.f7947;
        canvas.translate(rectF6.right - f15, rectF6.top + f15);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f7941, this.f7945);
        if (z2) {
            canvas.drawRect(0.0f, f14, this.f7947.height() - f16, -this.f7949, this.f7951);
        }
        canvas.restoreToCount(save4);
        canvas.translate(0.0f, (-this.f7942) / 2.0f);
        f7938.mo3803(canvas, this.f7947, this.f7949, this.f7940);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil(m3799(this.f7939, this.f7949, this.f7944));
        int ceil2 = (int) Math.ceil(m3800(this.f7939, this.f7949, this.f7944));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f7954;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f7948 = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f7954;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f7940.getColor() == colorForState) {
            return false;
        }
        this.f7940.setColor(colorForState);
        this.f7948 = true;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f7940.setAlpha(i);
        this.f7945.setAlpha(i);
        this.f7951.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f7940.setColorFilter(colorFilter);
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final void m3801(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f7954 = colorStateList;
        this.f7940.setColor(colorStateList.getColorForState(getState(), this.f7954.getDefaultColor()));
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final void m3802(float f, float f2) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
        }
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f2 + ". Must be >= 0");
        }
        int i = (int) (f + 0.5f);
        if (i % 2 == 1) {
            i--;
        }
        float f3 = i;
        int i2 = (int) (f2 + 0.5f);
        if (i2 % 2 == 1) {
            i2--;
        }
        float f4 = i2;
        if (f3 > f4) {
            if (!this.f7943) {
                this.f7943 = true;
            }
            f3 = f4;
        }
        if (this.f7942 == f3 && this.f7939 == f4) {
            return;
        }
        this.f7942 = f3;
        this.f7939 = f4;
        this.f7953 = (int) ((f3 * 1.5f) + this.f7946 + 0.5f);
        this.f7948 = true;
        invalidateSelf();
    }
}
