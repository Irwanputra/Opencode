package p131.p161.p162.p163.p181;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p034.p035.p038.p039.InterfaceC1015;
import p131.p161.p162.p163.p173.C2163;
import p131.p161.p162.p163.p173.C2180;
import p131.p161.p162.p163.p173.InterfaceC2169;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.じぜこほぱ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2236 extends Drawable implements InterfaceC2169, InterfaceC1015 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C2237 f9297;

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.じぜこほぱ.げつ〴ぬぐ$〺つふすそ, reason: contains not printable characters */
    public static final class C2237 extends Drawable.ConstantState {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public boolean f9298;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public C2163 f9299;

        public C2237(C2163 c2163) {
            this.f9299 = c2163;
            this.f9298 = false;
        }

        public C2237(C2237 c2237) {
            this.f9299 = (C2163) c2237.f9299.f9045.newDrawable();
            this.f9298 = c2237.f9298;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C2236(new C2237(this), null);
        }
    }

    public C2236(C2237 c2237, C2238 c2238) {
        this.f9297 = c2237;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        C2237 c2237 = this.f9297;
        if (c2237.f9298) {
            c2237.f9299.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f9297;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f9297.f9299.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f9297 = new C2237(this.f9297);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f9297.f9299.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f9297.f9299.setState(iArr)) {
            onStateChange = true;
        }
        boolean m4347 = C2235.m4347(iArr);
        C2237 c2237 = this.f9297;
        if (c2237.f9298 == m4347) {
            return onStateChange;
        }
        c2237.f9298 = m4347;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f9297.f9299.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f9297.f9299.setColorFilter(colorFilter);
    }

    @Override // p131.p161.p162.p163.p173.InterfaceC2169
    public void setShapeAppearanceModel(C2180 c2180) {
        C2163 c2163 = this.f9297.f9299;
        c2163.f9045.f9074 = c2180;
        c2163.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, p034.p035.p038.p039.InterfaceC1015
    public void setTint(int i) {
        this.f9297.f9299.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable, p034.p035.p038.p039.InterfaceC1015
    public void setTintList(ColorStateList colorStateList) {
        this.f9297.f9299.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, p034.p035.p038.p039.InterfaceC1015
    public void setTintMode(PorterDuff.Mode mode) {
        this.f9297.f9299.setTintMode(mode);
    }

    public C2236(C2180 c2180) {
        this.f9297 = new C2237(new C2163(c2180));
    }
}
