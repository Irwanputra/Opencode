package p034.p050.p053;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p034.p035.p045.C1096;
import p034.p050.C1148;
import p237.p238.p239.p241.p242.C2786;

/* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.ぺぁあねじ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1259 extends C1200 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public boolean f6156;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public PorterDuff.Mode f6157;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public Drawable f6158;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public ColorStateList f6159;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final SeekBar f6160;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public boolean f6161;

    public C1259(SeekBar seekBar) {
        super(seekBar);
        this.f6159 = null;
        this.f6157 = null;
        this.f6156 = false;
        this.f6161 = false;
        this.f6160 = seekBar;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final void m2907() {
        Drawable drawable = this.f6158;
        if (drawable != null) {
            if (this.f6156 || this.f6161) {
                Drawable m4758 = C2786.m4758(drawable.mutate());
                this.f6158 = m4758;
                if (this.f6156) {
                    C2786.m4788(m4758, this.f6159);
                }
                if (this.f6161) {
                    C2786.m4802(this.f6158, this.f6157);
                }
                if (this.f6158.isStateful()) {
                    this.f6158.setState(this.f6160.getDrawableState());
                }
            }
        }
    }

    @Override // p034.p050.p053.C1200
    /* renamed from: げつ〴ぬぐ */
    public void mo2676(AttributeSet attributeSet, int i) {
        super.mo2676(attributeSet, i);
        Context context = this.f6160.getContext();
        int[] iArr = C1148.AppCompatSeekBar;
        C1260 m2910 = C1260.m2910(context, attributeSet, iArr, i, 0);
        SeekBar seekBar = this.f6160;
        C1096.m2493(seekBar, seekBar.getContext(), iArr, attributeSet, m2910.f6162, i, 0);
        Drawable m2911 = m2910.m2911(C1148.AppCompatSeekBar_android_thumb);
        if (m2911 != null) {
            this.f6160.setThumb(m2911);
        }
        Drawable m2913 = m2910.m2913(C1148.AppCompatSeekBar_tickMark);
        Drawable drawable = this.f6158;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f6158 = m2913;
        if (m2913 != null) {
            m2913.setCallback(this.f6160);
            C2786.m4783(m2913, C1096.m2491(this.f6160));
            if (m2913.isStateful()) {
                m2913.setState(this.f6160.getDrawableState());
            }
            m2907();
        }
        this.f6160.invalidate();
        int i2 = C1148.AppCompatSeekBar_tickMarkTintMode;
        if (m2910.m2915(i2)) {
            this.f6157 = C1210.m2697(m2910.m2914(i2, -1), this.f6157);
            this.f6161 = true;
        }
        int i3 = C1148.AppCompatSeekBar_tickMarkTint;
        if (m2910.m2915(i3)) {
            this.f6159 = m2910.m2917(i3);
            this.f6156 = true;
        }
        m2910.f6162.recycle();
        m2907();
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void m2908(Canvas canvas) {
        if (this.f6158 != null) {
            int max = this.f6160.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f6158.getIntrinsicWidth();
                int intrinsicHeight = this.f6158.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f6158.setBounds(-i, -i2, i, i2);
                float width = ((this.f6160.getWidth() - this.f6160.getPaddingLeft()) - this.f6160.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f6160.getPaddingLeft(), this.f6160.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f6158.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
