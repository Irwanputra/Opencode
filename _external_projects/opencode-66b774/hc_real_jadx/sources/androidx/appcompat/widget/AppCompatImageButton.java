package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import p034.p035.p045.InterfaceC1119;
import p034.p035.p047.InterfaceC1124;
import p034.p050.C1264;
import p034.p050.p053.C1204;
import p034.p050.p053.C1206;
import p034.p050.p053.C1241;
import p034.p050.p053.C1252;
import p034.p050.p053.C1253;

/* loaded from: /tmp/opencode/hc_real.dex */
public class AppCompatImageButton extends ImageButton implements InterfaceC1119, InterfaceC1124 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C1253 f354;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final C1204 f355;

    public AppCompatImageButton(Context context) {
        this(context, null);
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1264.imageButtonStyle);
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i) {
        super(C1241.m2865(context), attributeSet, i);
        C1252.m2892(this, getContext());
        C1253 c1253 = new C1253(this);
        this.f354 = c1253;
        c1253.m2901(attributeSet, i);
        C1204 c1204 = new C1204(this);
        this.f355 = c1204;
        c1204.m2679(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1253 c1253 = this.f354;
        if (c1253 != null) {
            c1253.m2898();
        }
        C1204 c1204 = this.f355;
        if (c1204 != null) {
            c1204.m2680();
        }
    }

    @Override // p034.p035.p045.InterfaceC1119
    public ColorStateList getSupportBackgroundTintList() {
        C1253 c1253 = this.f354;
        if (c1253 != null) {
            return c1253.m2895();
        }
        return null;
    }

    @Override // p034.p035.p045.InterfaceC1119
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1253 c1253 = this.f354;
        if (c1253 != null) {
            return c1253.m2897();
        }
        return null;
    }

    @Override // p034.p035.p047.InterfaceC1124
    public ColorStateList getSupportImageTintList() {
        C1206 c1206;
        C1204 c1204 = this.f355;
        if (c1204 == null || (c1206 = c1204.f5955) == null) {
            return null;
        }
        return c1206.f5962;
    }

    @Override // p034.p035.p047.InterfaceC1124
    public PorterDuff.Mode getSupportImageTintMode() {
        C1206 c1206;
        C1204 c1204 = this.f355;
        if (c1204 == null || (c1206 = c1204.f5955) == null) {
            return null;
        }
        return c1206.f5960;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f355.m2678() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1253 c1253 = this.f354;
        if (c1253 != null) {
            c1253.m2899();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1253 c1253 = this.f354;
        if (c1253 != null) {
            c1253.m2900(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C1204 c1204 = this.f355;
        if (c1204 != null) {
            c1204.m2680();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C1204 c1204 = this.f355;
        if (c1204 != null) {
            c1204.m2680();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f355.m2683(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C1204 c1204 = this.f355;
        if (c1204 != null) {
            c1204.m2680();
        }
    }

    @Override // p034.p035.p045.InterfaceC1119
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1253 c1253 = this.f354;
        if (c1253 != null) {
            c1253.m2894(colorStateList);
        }
    }

    @Override // p034.p035.p045.InterfaceC1119
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1253 c1253 = this.f354;
        if (c1253 != null) {
            c1253.m2902(mode);
        }
    }

    @Override // p034.p035.p047.InterfaceC1124
    public void setSupportImageTintList(ColorStateList colorStateList) {
        C1204 c1204 = this.f355;
        if (c1204 != null) {
            c1204.m2681(colorStateList);
        }
    }

    @Override // p034.p035.p047.InterfaceC1124
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C1204 c1204 = this.f355;
        if (c1204 != null) {
            c1204.m2682(mode);
        }
    }
}
