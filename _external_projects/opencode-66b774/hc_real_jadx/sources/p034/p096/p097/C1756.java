package p034.p096.p097;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: づざかべべ.びぐびあび.なぎぱいぢぎ.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1756 extends Drawable {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public ColorStateList f7957;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public ColorStateList f7960;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final RectF f7961;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public float f7962;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public float f7963;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final Rect f7965;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public PorterDuffColorFilter f7966;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public boolean f7964 = false;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean f7959 = true;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public PorterDuff.Mode f7967 = PorterDuff.Mode.SRC_IN;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Paint f7958 = new Paint(5);

    public C1756(ColorStateList colorStateList, float f) {
        this.f7962 = f;
        m3805(colorStateList);
        this.f7961 = new RectF();
        this.f7965 = new Rect();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f7958;
        if (this.f7966 == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f7966);
            z = true;
        }
        RectF rectF = this.f7961;
        float f = this.f7962;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f7965, this.f7962);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f7960;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f7957) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m3806(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f7957;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f7958.getColor();
        if (z) {
            this.f7958.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f7960;
        if (colorStateList2 == null || (mode = this.f7967) == null) {
            return z;
        }
        this.f7966 = m3807(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f7958.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f7958.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f7960 = colorStateList;
        this.f7966 = m3807(colorStateList, this.f7967);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f7967 = mode;
        this.f7966 = m3807(this.f7960, mode);
        invalidateSelf();
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m3805(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f7957 = colorStateList;
        this.f7958.setColor(colorStateList.getColorForState(getState(), this.f7957.getDefaultColor()));
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final void m3806(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f7961.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f7965.set(rect);
        if (this.f7964) {
            this.f7965.inset((int) Math.ceil(C1749.m3800(this.f7963, this.f7962, this.f7959)), (int) Math.ceil(C1749.m3799(this.f7963, this.f7962, this.f7959)));
            this.f7961.set(this.f7965);
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final PorterDuffColorFilter m3807(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }
}
