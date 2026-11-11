package p034.p050.p053;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import p034.p035.p045.C1096;
import p034.p035.p047.InterfaceC1124;
import p034.p050.C1148;
import p034.p050.p055.p056.C1266;

/* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1204 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C1206 f5955;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public C1206 f5956;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final ImageView f5957;

    public C1204(ImageView imageView) {
        this.f5957 = imageView;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean m2678() {
        return Build.VERSION.SDK_INT < 21 || !(this.f5957.getBackground() instanceof RippleDrawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void m2679(AttributeSet attributeSet, int i) {
        Drawable drawable;
        Drawable drawable2;
        int m2922;
        Context context = this.f5957.getContext();
        int[] iArr = C1148.AppCompatImageView;
        C1260 m2910 = C1260.m2910(context, attributeSet, iArr, i, 0);
        ImageView imageView = this.f5957;
        C1096.m2493(imageView, imageView.getContext(), iArr, attributeSet, m2910.f6162, i, 0);
        try {
            Drawable drawable3 = this.f5957.getDrawable();
            if (drawable3 == null && (m2922 = m2910.m2922(C1148.AppCompatImageView_srcCompat, -1)) != -1 && (drawable3 = C1266.m2928(this.f5957.getContext(), m2922)) != null) {
                this.f5957.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                C1210.m2694(drawable3);
            }
            int i2 = C1148.AppCompatImageView_tint;
            if (m2910.m2915(i2)) {
                ImageView imageView2 = this.f5957;
                ColorStateList m2917 = m2910.m2917(i2);
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 21) {
                    imageView2.setImageTintList(m2917);
                    if (i3 == 21 && (drawable2 = imageView2.getDrawable()) != null && imageView2.getImageTintList() != null) {
                        if (drawable2.isStateful()) {
                            drawable2.setState(imageView2.getDrawableState());
                        }
                        imageView2.setImageDrawable(drawable2);
                    }
                } else if (imageView2 instanceof InterfaceC1124) {
                    ((InterfaceC1124) imageView2).setSupportImageTintList(m2917);
                }
            }
            int i4 = C1148.AppCompatImageView_tintMode;
            if (m2910.m2915(i4)) {
                ImageView imageView3 = this.f5957;
                PorterDuff.Mode m2697 = C1210.m2697(m2910.m2914(i4, -1), null);
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 21) {
                    imageView3.setImageTintMode(m2697);
                    if (i5 == 21 && (drawable = imageView3.getDrawable()) != null && imageView3.getImageTintList() != null) {
                        if (drawable.isStateful()) {
                            drawable.setState(imageView3.getDrawableState());
                        }
                        imageView3.setImageDrawable(drawable);
                    }
                } else if (imageView3 instanceof InterfaceC1124) {
                    ((InterfaceC1124) imageView3).setSupportImageTintMode(m2697);
                }
            }
            m2910.f6162.recycle();
        } catch (Throwable th) {
            m2910.f6162.recycle();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m2680() {
        Drawable drawable = this.f5957.getDrawable();
        if (drawable != null) {
            C1210.m2694(drawable);
        }
        if (drawable != null) {
            int i = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i <= 21 && i == 21) {
                if (this.f5956 == null) {
                    this.f5956 = new C1206();
                }
                C1206 c1206 = this.f5956;
                PorterDuff.Mode mode = null;
                c1206.f5962 = null;
                c1206.f5963 = false;
                c1206.f5960 = null;
                c1206.f5961 = false;
                ImageView imageView = this.f5957;
                ColorStateList imageTintList = i >= 21 ? imageView.getImageTintList() : imageView instanceof InterfaceC1124 ? ((InterfaceC1124) imageView).getSupportImageTintList() : null;
                if (imageTintList != null) {
                    c1206.f5963 = true;
                    c1206.f5962 = imageTintList;
                }
                ImageView imageView2 = this.f5957;
                if (i >= 21) {
                    mode = imageView2.getImageTintMode();
                } else if (imageView2 instanceof InterfaceC1124) {
                    mode = ((InterfaceC1124) imageView2).getSupportImageTintMode();
                }
                if (mode != null) {
                    c1206.f5961 = true;
                    c1206.f5960 = mode;
                }
                if (c1206.f5963 || c1206.f5961) {
                    C1242.m2869(drawable, c1206, this.f5957.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            C1206 c12062 = this.f5955;
            if (c12062 != null) {
                C1242.m2869(drawable, c12062, this.f5957.getDrawableState());
            }
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public void m2681(ColorStateList colorStateList) {
        if (this.f5955 == null) {
            this.f5955 = new C1206();
        }
        C1206 c1206 = this.f5955;
        c1206.f5962 = colorStateList;
        c1206.f5963 = true;
        m2680();
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public void m2682(PorterDuff.Mode mode) {
        if (this.f5955 == null) {
            this.f5955 = new C1206();
        }
        C1206 c1206 = this.f5955;
        c1206.f5960 = mode;
        c1206.f5961 = true;
        m2680();
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void m2683(int i) {
        if (i != 0) {
            Drawable m2928 = C1266.m2928(this.f5957.getContext(), i);
            if (m2928 != null) {
                C1210.m2694(m2928);
            }
            this.f5957.setImageDrawable(m2928);
        } else {
            this.f5957.setImageDrawable(null);
        }
        m2680();
    }
}
