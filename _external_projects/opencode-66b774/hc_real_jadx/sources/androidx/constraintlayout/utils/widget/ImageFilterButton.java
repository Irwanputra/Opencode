package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import p034.p086.p090.C1575;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ImageFilterButton extends AppCompatImageButton {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public Path f788;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public float f789;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public RectF f790;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public float f791;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public LayerDrawable f792;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public float f793;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public boolean f794;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public ImageFilterView.C0124 f795;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public ViewOutlineProvider f796;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public Drawable[] f797;

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterButton$〺つふすそ, reason: contains not printable characters */
    public class C0121 extends ViewOutlineProvider {
        public C0121() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), ImageFilterButton.this.f789);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterButton$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0122 extends ViewOutlineProvider {
        public C0122() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), (Math.min(r3, r4) * ImageFilterButton.this.f793) / 2.0f);
        }
    }

    public ImageFilterButton(Context context) {
        super(context);
        this.f795 = new ImageFilterView.C0124();
        this.f791 = 0.0f;
        this.f793 = 0.0f;
        this.f789 = Float.NaN;
        this.f794 = true;
        m292(null);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f795 = new ImageFilterView.C0124();
        this.f791 = 0.0f;
        this.f793 = 0.0f;
        this.f789 = Float.NaN;
        this.f794 = true;
        m292(attributeSet);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f795 = new ImageFilterView.C0124();
        this.f791 = 0.0f;
        this.f793 = 0.0f;
        this.f789 = Float.NaN;
        this.f794 = true;
        m292(attributeSet);
    }

    private void setOverlay(boolean z) {
        this.f794 = z;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 21 || this.f789 == 0.0f || this.f788 == null) {
            z = false;
        } else {
            z = true;
            canvas.save();
            canvas.clipPath(this.f788);
        }
        super.draw(canvas);
        if (z) {
            canvas.restore();
        }
    }

    public float getContrast() {
        return this.f795.f816;
    }

    public float getCrossfade() {
        return this.f791;
    }

    public float getRound() {
        return this.f789;
    }

    public float getRoundPercent() {
        return this.f793;
    }

    public float getSaturation() {
        return this.f795.f815;
    }

    public float getWarmth() {
        return this.f795.f812;
    }

    public void setBrightness(float f) {
        ImageFilterView.C0124 c0124 = this.f795;
        c0124.f817 = f;
        c0124.m294(this);
    }

    public void setContrast(float f) {
        ImageFilterView.C0124 c0124 = this.f795;
        c0124.f816 = f;
        c0124.m294(this);
    }

    public void setCrossfade(float f) {
        this.f791 = f;
        if (this.f797 != null) {
            if (!this.f794) {
                this.f792.getDrawable(0).setAlpha((int) ((1.0f - this.f791) * 255.0f));
            }
            this.f792.getDrawable(1).setAlpha((int) (this.f791 * 255.0f));
            super.setImageDrawable(this.f792);
        }
    }

    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.f789 = f;
            float f2 = this.f793;
            this.f793 = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.f789 != f;
        this.f789 = f;
        if (f != 0.0f) {
            if (this.f788 == null) {
                this.f788 = new Path();
            }
            if (this.f790 == null) {
                this.f790 = new RectF();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.f796 == null) {
                    C0121 c0121 = new C0121();
                    this.f796 = c0121;
                    setOutlineProvider(c0121);
                }
                setClipToOutline(true);
            }
            this.f790.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f788.reset();
            Path path = this.f788;
            RectF rectF = this.f790;
            float f3 = this.f789;
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
        boolean z = this.f793 != f;
        this.f793 = f;
        if (f != 0.0f) {
            if (this.f788 == null) {
                this.f788 = new Path();
            }
            if (this.f790 == null) {
                this.f790 = new RectF();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.f796 == null) {
                    C0122 c0122 = new C0122();
                    this.f796 = c0122;
                    setOutlineProvider(c0122);
                }
                setClipToOutline(true);
            }
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f793) / 2.0f;
            this.f790.set(0.0f, 0.0f, width, height);
            this.f788.reset();
            this.f788.addRoundRect(this.f790, min, min, Path.Direction.CW);
        } else if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(false);
        }
        if (!z || Build.VERSION.SDK_INT < 21) {
            return;
        }
        invalidateOutline();
    }

    public void setSaturation(float f) {
        ImageFilterView.C0124 c0124 = this.f795;
        c0124.f815 = f;
        c0124.m294(this);
    }

    public void setWarmth(float f) {
        ImageFilterView.C0124 c0124 = this.f795;
        c0124.f812 = f;
        c0124.m294(this);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m292(AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1575.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            Drawable drawable = obtainStyledAttributes.getDrawable(C1575.ImageFilterView_altSrc);
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C1575.ImageFilterView_crossfade) {
                    this.f791 = obtainStyledAttributes.getFloat(index, 0.0f);
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
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.f794));
                }
            }
            obtainStyledAttributes.recycle();
            if (drawable != null) {
                Drawable[] drawableArr = new Drawable[2];
                this.f797 = drawableArr;
                drawableArr[0] = getDrawable();
                this.f797[1] = drawable;
                LayerDrawable layerDrawable = new LayerDrawable(this.f797);
                this.f792 = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.f791 * 255.0f));
                super.setImageDrawable(this.f792);
            }
        }
    }
}
