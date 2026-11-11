package p034.p035.p038.p039;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: づざかべべ.〳ぜぞぜべっ.ぁごぐすすぃ.てぜきぽく.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1014 extends Drawable implements Drawable.Callback, InterfaceC1013, InterfaceC1015 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static final PorterDuff.Mode f5392 = PorterDuff.Mode.SRC_IN;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f5393;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public Drawable f5394;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public PorterDuff.Mode f5395;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public C1016 f5396;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public boolean f5397;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public boolean f5398;

    public C1014(Drawable drawable) {
        this.f5396 = new C1016(this.f5396);
        mo2357(drawable);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f5394.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C1016 c1016 = this.f5396;
        return changingConfigurations | (c1016 != null ? c1016.getChangingConfigurations() : 0) | this.f5394.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        C1016 c1016 = this.f5396;
        if (c1016 == null) {
            return null;
        }
        if (!(c1016.f5399 != null)) {
            return null;
        }
        c1016.f5401 = getChangingConfigurations();
        return this.f5396;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f5394.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f5394.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f5394.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f5394.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f5394.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f5394.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f5394.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f5394.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f5394.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f5394.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        C1016 c1016;
        ColorStateList colorStateList = (!mo2358() || (c1016 = this.f5396) == null) ? null : c1016.f5400;
        return (colorStateList != null && colorStateList.isStateful()) || this.f5394.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f5394.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f5397 && super.mutate() == this) {
            this.f5396 = new C1016(this.f5396);
            Drawable drawable = this.f5394;
            if (drawable != null) {
                drawable.mutate();
            }
            C1016 c1016 = this.f5396;
            if (c1016 != null) {
                Drawable drawable2 = this.f5394;
                c1016.f5399 = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f5397 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f5394;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        return this.f5394.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f5394.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        this.f5394.setAutoMirrored(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.f5394.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5394.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f5394.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f5394.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return m2359(iArr) || this.f5394.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, p034.p035.p038.p039.InterfaceC1015
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, p034.p035.p038.p039.InterfaceC1015
    public void setTintList(ColorStateList colorStateList) {
        this.f5396.f5400 = colorStateList;
        m2359(getState());
    }

    @Override // android.graphics.drawable.Drawable, p034.p035.p038.p039.InterfaceC1015
    public void setTintMode(PorterDuff.Mode mode) {
        this.f5396.f5402 = mode;
        m2359(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f5394.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @Override // p034.p035.p038.p039.InterfaceC1013
    /* renamed from: 〺つふすそ */
    public final Drawable mo2356() {
        return this.f5394;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public boolean mo2358() {
        return true;
    }

    @Override // p034.p035.p038.p039.InterfaceC1013
    /* renamed from: げつ〴ぬぐ */
    public final void mo2357(Drawable drawable) {
        Drawable drawable2 = this.f5394;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f5394 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C1016 c1016 = this.f5396;
            if (c1016 != null) {
                c1016.f5399 = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final boolean m2359(int[] iArr) {
        if (!mo2358()) {
            return false;
        }
        C1016 c1016 = this.f5396;
        ColorStateList colorStateList = c1016.f5400;
        PorterDuff.Mode mode = c1016.f5402;
        if (colorStateList == null || mode == null) {
            this.f5398 = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f5398 || colorForState != this.f5393 || mode != this.f5395) {
                setColorFilter(colorForState, mode);
                this.f5393 = colorForState;
                this.f5395 = mode;
                this.f5398 = true;
                return true;
            }
        }
        return false;
    }

    public C1014(C1016 c1016, Resources resources) {
        Drawable.ConstantState constantState;
        this.f5396 = c1016;
        if (c1016 == null || (constantState = c1016.f5399) == null) {
            return;
        }
        mo2357(constantState.newDrawable(resources));
    }
}
