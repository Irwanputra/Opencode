package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import p034.p086.p090.C1575;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ImageFilterView extends AppCompatImageView {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public float f800;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public float f801;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public ViewOutlineProvider f802;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean f803;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public Drawable[] f804;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public float f805;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public LayerDrawable f806;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public C0124 f807;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public Path f808;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public RectF f809;

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$〺つふすそ, reason: contains not printable characters */
    public class C0123 extends ViewOutlineProvider {
        public C0123() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), ImageFilterView.this.f800);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$くし〴〺ぅ, reason: contains not printable characters */
    public static class C0124 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public float[] f814 = new float[20];

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public ColorMatrix f811 = new ColorMatrix();

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public ColorMatrix f813 = new ColorMatrix();

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public float f817 = 1.0f;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public float f815 = 1.0f;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public float f816 = 1.0f;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public float f812 = 1.0f;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void m294(ImageView imageView) {
            float f;
            boolean z;
            float f2;
            float log;
            float f3;
            this.f811.reset();
            float f4 = this.f815;
            boolean z2 = true;
            if (f4 != 1.0f) {
                float f5 = 1.0f - f4;
                float f6 = 0.2999f * f5;
                float f7 = 0.587f * f5;
                float f8 = f5 * 0.114f;
                float[] fArr = this.f814;
                fArr[0] = f6 + f4;
                fArr[1] = f7;
                fArr[2] = f8;
                fArr[3] = 0.0f;
                fArr[4] = 0.0f;
                fArr[5] = f6;
                fArr[6] = f7 + f4;
                fArr[7] = f8;
                fArr[8] = 0.0f;
                fArr[9] = 0.0f;
                fArr[10] = f6;
                fArr[11] = f7;
                fArr[12] = f8 + f4;
                fArr[13] = 0.0f;
                fArr[14] = 0.0f;
                fArr[15] = 0.0f;
                fArr[16] = 0.0f;
                fArr[17] = 0.0f;
                f = 1.0f;
                fArr[18] = 1.0f;
                fArr[19] = 0.0f;
                this.f811.set(fArr);
                z = true;
            } else {
                f = 1.0f;
                z = false;
            }
            float f9 = this.f816;
            if (f9 != f) {
                this.f813.setScale(f9, f9, f9, f);
                this.f811.postConcat(this.f813);
                z = true;
            }
            float f10 = this.f812;
            if (f10 != f) {
                if (f10 <= 0.0f) {
                    f10 = 0.01f;
                }
                float f11 = (5000.0f / f10) / 100.0f;
                if (f11 > 66.0f) {
                    double d = f11 - 60.0f;
                    float pow = ((float) Math.pow(d, -0.13320475816726685d)) * 329.69873f;
                    log = ((float) Math.pow(d, 0.07551484555006027d)) * 288.12216f;
                    f3 = pow;
                } else {
                    log = (((float) Math.log(f11)) * 99.4708f) - 161.11957f;
                    f3 = 255.0f;
                }
                float log2 = f11 < 66.0f ? f11 > 19.0f ? (((float) Math.log(f11 - 10.0f)) * 138.51773f) - 305.0448f : 0.0f : 255.0f;
                float min = Math.min(255.0f, Math.max(f3, 0.0f));
                float min2 = Math.min(255.0f, Math.max(log, 0.0f));
                float min3 = Math.min(255.0f, Math.max(log2, 0.0f));
                float log3 = (((float) Math.log(50.0f)) * 99.4708f) - 161.11957f;
                float log4 = (((float) Math.log(40.0f)) * 138.51773f) - 305.0448f;
                float min4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
                float min5 = Math.min(255.0f, Math.max(log3, 0.0f));
                float min6 = min3 / Math.min(255.0f, Math.max(log4, 0.0f));
                float[] fArr2 = this.f814;
                fArr2[0] = min / min4;
                fArr2[1] = 0.0f;
                fArr2[2] = 0.0f;
                fArr2[3] = 0.0f;
                fArr2[4] = 0.0f;
                fArr2[5] = 0.0f;
                fArr2[6] = min2 / min5;
                fArr2[7] = 0.0f;
                fArr2[8] = 0.0f;
                fArr2[9] = 0.0f;
                fArr2[10] = 0.0f;
                fArr2[11] = 0.0f;
                fArr2[12] = min6;
                fArr2[13] = 0.0f;
                fArr2[14] = 0.0f;
                fArr2[15] = 0.0f;
                fArr2[16] = 0.0f;
                fArr2[17] = 0.0f;
                f2 = 1.0f;
                fArr2[18] = 1.0f;
                fArr2[19] = 0.0f;
                this.f813.set(fArr2);
                this.f811.postConcat(this.f813);
                z = true;
            } else {
                f2 = 1.0f;
            }
            float f12 = this.f817;
            if (f12 != f2) {
                float[] fArr3 = this.f814;
                fArr3[0] = f12;
                fArr3[1] = 0.0f;
                fArr3[2] = 0.0f;
                fArr3[3] = 0.0f;
                fArr3[4] = 0.0f;
                fArr3[5] = 0.0f;
                fArr3[6] = f12;
                fArr3[7] = 0.0f;
                fArr3[8] = 0.0f;
                fArr3[9] = 0.0f;
                fArr3[10] = 0.0f;
                fArr3[11] = 0.0f;
                fArr3[12] = f12;
                fArr3[13] = 0.0f;
                fArr3[14] = 0.0f;
                fArr3[15] = 0.0f;
                fArr3[16] = 0.0f;
                fArr3[17] = 0.0f;
                fArr3[18] = 1.0f;
                fArr3[19] = 0.0f;
                this.f813.set(fArr3);
                this.f811.postConcat(this.f813);
            } else {
                z2 = z;
            }
            if (z2) {
                imageView.setColorFilter(new ColorMatrixColorFilter(this.f811));
            } else {
                imageView.clearColorFilter();
            }
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0125 extends ViewOutlineProvider {
        public C0125() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), (Math.min(r3, r4) * ImageFilterView.this.f801) / 2.0f);
        }
    }

    public ImageFilterView(Context context) {
        super(context);
        this.f807 = new C0124();
        this.f803 = true;
        this.f805 = 0.0f;
        this.f801 = 0.0f;
        this.f800 = Float.NaN;
        m293(null);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f807 = new C0124();
        this.f803 = true;
        this.f805 = 0.0f;
        this.f801 = 0.0f;
        this.f800 = Float.NaN;
        m293(attributeSet);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f807 = new C0124();
        this.f803 = true;
        this.f805 = 0.0f;
        this.f801 = 0.0f;
        this.f800 = Float.NaN;
        m293(attributeSet);
    }

    private void setOverlay(boolean z) {
        this.f803 = z;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 21 || this.f801 == 0.0f || this.f808 == null) {
            z = false;
        } else {
            z = true;
            canvas.save();
            canvas.clipPath(this.f808);
        }
        super.draw(canvas);
        if (z) {
            canvas.restore();
        }
    }

    public float getBrightness() {
        return this.f807.f817;
    }

    public float getContrast() {
        return this.f807.f816;
    }

    public float getCrossfade() {
        return this.f805;
    }

    public float getRound() {
        return this.f800;
    }

    public float getRoundPercent() {
        return this.f801;
    }

    public float getSaturation() {
        return this.f807.f815;
    }

    public float getWarmth() {
        return this.f807.f812;
    }

    public void setBrightness(float f) {
        C0124 c0124 = this.f807;
        c0124.f817 = f;
        c0124.m294(this);
    }

    public void setContrast(float f) {
        C0124 c0124 = this.f807;
        c0124.f816 = f;
        c0124.m294(this);
    }

    public void setCrossfade(float f) {
        this.f805 = f;
        if (this.f804 != null) {
            if (!this.f803) {
                this.f806.getDrawable(0).setAlpha((int) ((1.0f - this.f805) * 255.0f));
            }
            this.f806.getDrawable(1).setAlpha((int) (this.f805 * 255.0f));
            super.setImageDrawable(this.f806);
        }
    }

    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.f800 = f;
            float f2 = this.f801;
            this.f801 = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.f800 != f;
        this.f800 = f;
        if (f != 0.0f) {
            if (this.f808 == null) {
                this.f808 = new Path();
            }
            if (this.f809 == null) {
                this.f809 = new RectF();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.f802 == null) {
                    C0123 c0123 = new C0123();
                    this.f802 = c0123;
                    setOutlineProvider(c0123);
                }
                setClipToOutline(true);
            }
            this.f809.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f808.reset();
            Path path = this.f808;
            RectF rectF = this.f809;
            float f3 = this.f800;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(false);
        }
        if (!z || Build.VERSION.SDK_INT < 21) {
            return;
        }
        invalidateOutline();
    }

    public void setRoundPercent(float f) {
        boolean z = this.f801 != f;
        this.f801 = f;
        if (f != 0.0f) {
            if (this.f808 == null) {
                this.f808 = new Path();
            }
            if (this.f809 == null) {
                this.f809 = new RectF();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.f802 == null) {
                    C0125 c0125 = new C0125();
                    this.f802 = c0125;
                    setOutlineProvider(c0125);
                }
                setClipToOutline(true);
            }
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f801) / 2.0f;
            this.f809.set(0.0f, 0.0f, width, height);
            this.f808.reset();
            this.f808.addRoundRect(this.f809, min, min, Path.Direction.CW);
        } else if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(false);
        }
        if (!z || Build.VERSION.SDK_INT < 21) {
            return;
        }
        invalidateOutline();
    }

    public void setSaturation(float f) {
        C0124 c0124 = this.f807;
        c0124.f815 = f;
        c0124.m294(this);
    }

    public void setWarmth(float f) {
        C0124 c0124 = this.f807;
        c0124.f812 = f;
        c0124.m294(this);
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final void m293(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1575.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            Drawable drawable = obtainStyledAttributes.getDrawable(C1575.ImageFilterView_altSrc);
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C1575.ImageFilterView_crossfade) {
                    this.f805 = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == C1575.ImageFilterView_warmth) {
                    setWarmth(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C1575.ImageFilterView_saturation) {
                    setSaturation(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C1575.ImageFilterView_contrast) {
                    setContrast(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C1575.ImageFilterView_round) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                    }
                } else if (index == C1575.ImageFilterView_roundPercent) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                    }
                } else if (index == C1575.ImageFilterView_overlay) {
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.f803));
                }
            }
            obtainStyledAttributes.recycle();
            if (drawable != null) {
                Drawable[] drawableArr = new Drawable[2];
                this.f804 = drawableArr;
                drawableArr[0] = getDrawable();
                this.f804[1] = drawable;
                LayerDrawable layerDrawable = new LayerDrawable(this.f804);
                this.f806 = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.f805 * 255.0f));
                super.setImageDrawable(this.f806);
            }
        }
    }
}
