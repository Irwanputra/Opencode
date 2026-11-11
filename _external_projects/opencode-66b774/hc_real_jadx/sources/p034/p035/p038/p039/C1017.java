package p034.p035.p038.p039;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import java.lang.reflect.Method;

/* renamed from: づざかべべ.〳ぜぞぜべっ.ぁごぐすすぃ.てぜきぽく.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1017 extends C1014 {

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public static Method f5403;

    public C1017(Drawable drawable) {
        super(drawable);
        if (f5403 == null) {
            try {
                f5403 = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.f5394.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f5394.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f5394;
        if (drawable != null && (method = f5403) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        this.f5394.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f5394.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // p034.p035.p038.p039.C1014, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // p034.p035.p038.p039.C1014, android.graphics.drawable.Drawable, p034.p035.p038.p039.InterfaceC1015
    public void setTint(int i) {
        if (mo2358()) {
            super.setTint(i);
        } else {
            this.f5394.setTint(i);
        }
    }

    @Override // p034.p035.p038.p039.C1014, android.graphics.drawable.Drawable, p034.p035.p038.p039.InterfaceC1015
    public void setTintList(ColorStateList colorStateList) {
        if (!mo2358()) {
            this.f5394.setTintList(colorStateList);
        } else {
            this.f5396.f5400 = colorStateList;
            m2359(getState());
        }
    }

    @Override // p034.p035.p038.p039.C1014, android.graphics.drawable.Drawable, p034.p035.p038.p039.InterfaceC1015
    public void setTintMode(PorterDuff.Mode mode) {
        if (!mo2358()) {
            this.f5394.setTintMode(mode);
        } else {
            this.f5396.f5402 = mode;
            m2359(getState());
        }
    }

    @Override // p034.p035.p038.p039.C1014
    /* renamed from: くし〴〺ぅ */
    public boolean mo2358() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f5394;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    public C1017(C1016 c1016, Resources resources) {
        super(c1016, resources);
        if (f5403 == null) {
            try {
                f5403 = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception unused) {
            }
        }
    }
}
