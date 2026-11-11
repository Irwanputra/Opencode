package p034.p078.p079;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;
import p034.p081.p082.p083.C1508;
import p131.p155.p156.p157.C2098;

/* renamed from: づざかべべ.ざとぅぼこ〺.げつ〴ぬぐ.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1491 extends Drawable implements Animatable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C1492 f6877;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean f6878;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public float f6879;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public Animator f6880;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public float f6881;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public Resources f6882;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static final Interpolator f6874 = new LinearInterpolator();

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public static final Interpolator f6876 = new C1508();

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public static final int[] f6875 = {-16777216};

    /* renamed from: づざかべべ.ざとぅぼこ〺.げつ〴ぬぐ.びぐびあび$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1492 {

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public float f6883;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final Paint f6884;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public float f6885;

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public int f6886;

        /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
        public float f6887;

        /* renamed from: ぉざぅち〻, reason: contains not printable characters */
        public float f6888;

        /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
        public Path f6889;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final Paint f6890;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final RectF f6891 = new RectF();

        /* renamed from: ごづごきえ, reason: contains not printable characters */
        public int f6892;

        /* renamed from: ざっざへづ, reason: contains not printable characters */
        public int f6893;

        /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
        public int f6894;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public float f6895;

        /* renamed from: てぜきぽく, reason: contains not printable characters */
        public float f6896;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public float f6897;

        /* renamed from: のぷのちつ, reason: contains not printable characters */
        public float f6898;

        /* renamed from: は〲ぱなで, reason: contains not printable characters */
        public int f6899;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final Paint f6900;

        /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
        public boolean f6901;

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public int[] f6902;

        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public float f6903;

        public C1492() {
            Paint paint = new Paint();
            this.f6884 = paint;
            Paint paint2 = new Paint();
            this.f6890 = paint2;
            Paint paint3 = new Paint();
            this.f6900 = paint3;
            this.f6895 = 0.0f;
            this.f6897 = 0.0f;
            this.f6885 = 0.0f;
            this.f6883 = 5.0f;
            this.f6887 = 1.0f;
            this.f6892 = Base64.BASELENGTH;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public void m3243(boolean z) {
            if (this.f6901 != z) {
                this.f6901 = z;
            }
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void m3244(int i) {
            this.f6886 = i;
            this.f6893 = this.f6902[i];
        }
    }

    public C1491(Context context) {
        context.getClass();
        this.f6882 = context.getResources();
        C1492 c1492 = new C1492();
        this.f6877 = c1492;
        c1492.f6902 = f6875;
        c1492.m3244(0);
        c1492.f6883 = 2.5f;
        c1492.f6884.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new C1485(this, c1492));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f6874);
        ofFloat.addListener(new C1486(this, c1492));
        this.f6880 = ofFloat;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f6879, bounds.exactCenterX(), bounds.exactCenterY());
        C1492 c1492 = this.f6877;
        RectF rectF = c1492.f6891;
        float f = c1492.f6888;
        float f2 = (c1492.f6883 / 2.0f) + f;
        if (f <= 0.0f) {
            f2 = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((c1492.f6894 * c1492.f6887) / 2.0f, c1492.f6883 / 2.0f);
        }
        rectF.set(bounds.centerX() - f2, bounds.centerY() - f2, bounds.centerX() + f2, bounds.centerY() + f2);
        float f3 = c1492.f6895;
        float f4 = c1492.f6885;
        float f5 = (f3 + f4) * 360.0f;
        float f6 = ((c1492.f6897 + f4) * 360.0f) - f5;
        c1492.f6884.setColor(c1492.f6893);
        c1492.f6884.setAlpha(c1492.f6892);
        float f7 = c1492.f6883 / 2.0f;
        rectF.inset(f7, f7);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, c1492.f6900);
        float f8 = -f7;
        rectF.inset(f8, f8);
        canvas.drawArc(rectF, f5, f6, false, c1492.f6884);
        if (c1492.f6901) {
            Path path = c1492.f6889;
            if (path == null) {
                Path path2 = new Path();
                c1492.f6889 = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f9 = (c1492.f6894 * c1492.f6887) / 2.0f;
            c1492.f6889.moveTo(0.0f, 0.0f);
            c1492.f6889.lineTo(c1492.f6894 * c1492.f6887, 0.0f);
            Path path3 = c1492.f6889;
            float f10 = c1492.f6894;
            float f11 = c1492.f6887;
            path3.lineTo((f10 * f11) / 2.0f, c1492.f6899 * f11);
            c1492.f6889.offset((rectF.centerX() + min) - f9, (c1492.f6883 / 2.0f) + rectF.centerY());
            c1492.f6889.close();
            c1492.f6890.setColor(c1492.f6893);
            c1492.f6890.setAlpha(c1492.f6892);
            canvas.save();
            canvas.rotate(f5 + f6, rectF.centerX(), rectF.centerY());
            canvas.drawPath(c1492.f6889, c1492.f6890);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f6877.f6892;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f6880.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f6877.f6892 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f6877.f6884.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Animator animator;
        long j;
        this.f6880.cancel();
        C1492 c1492 = this.f6877;
        float f = c1492.f6895;
        c1492.f6903 = f;
        float f2 = c1492.f6897;
        c1492.f6896 = f2;
        c1492.f6898 = c1492.f6885;
        if (f2 != f) {
            this.f6878 = true;
            animator = this.f6880;
            j = 666;
        } else {
            c1492.m3244(0);
            C1492 c14922 = this.f6877;
            c14922.f6903 = 0.0f;
            c14922.f6896 = 0.0f;
            c14922.f6898 = 0.0f;
            c14922.f6895 = 0.0f;
            c14922.f6897 = 0.0f;
            c14922.f6885 = 0.0f;
            animator = this.f6880;
            j = 1332;
        }
        animator.setDuration(j);
        this.f6880.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f6880.cancel();
        this.f6879 = 0.0f;
        this.f6877.m3243(false);
        this.f6877.m3244(0);
        C1492 c1492 = this.f6877;
        c1492.f6903 = 0.0f;
        c1492.f6896 = 0.0f;
        c1492.f6898 = 0.0f;
        c1492.f6895 = 0.0f;
        c1492.f6897 = 0.0f;
        c1492.f6885 = 0.0f;
        invalidateSelf();
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m3239(float f, float f2, float f3, float f4) {
        C1492 c1492 = this.f6877;
        float f5 = this.f6882.getDisplayMetrics().density;
        float f6 = f2 * f5;
        c1492.f6883 = f6;
        c1492.f6884.setStrokeWidth(f6);
        c1492.f6888 = f * f5;
        c1492.m3244(0);
        c1492.f6894 = (int) (f3 * f5);
        c1492.f6899 = (int) (f4 * f5);
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void m3240(int i) {
        float f;
        float f2;
        float f3;
        float f4;
        if (i == 0) {
            f = 11.0f;
            f2 = 3.0f;
            f3 = 12.0f;
            f4 = 6.0f;
        } else {
            f = 7.5f;
            f2 = 2.5f;
            f3 = 10.0f;
            f4 = 5.0f;
        }
        m3239(f, f2, f3, f4);
        invalidateSelf();
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m3241(float f, C1492 c1492, boolean z) {
        float interpolation;
        float f2;
        if (this.f6878) {
            m3242(f, c1492);
            float floor = (float) (Math.floor(c1492.f6898 / 0.8f) + 1.0d);
            float f3 = c1492.f6903;
            float f4 = c1492.f6896;
            c1492.f6895 = (((f4 - 0.01f) - f3) * f) + f3;
            c1492.f6897 = f4;
            float f5 = c1492.f6898;
            c1492.f6885 = C2098.m4188(floor, f5, f, f5);
            return;
        }
        if (f != 1.0f || z) {
            float f6 = c1492.f6898;
            if (f < 0.5f) {
                interpolation = c1492.f6903;
                f2 = (f6876.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f7 = c1492.f6903 + 0.79f;
                interpolation = f7 - (((1.0f - f6876.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f2 = f7;
            }
            float f8 = (0.20999998f * f) + f6;
            float f9 = (f + this.f6881) * 216.0f;
            c1492.f6895 = interpolation;
            c1492.f6897 = f2;
            c1492.f6885 = f8;
            this.f6879 = f9;
        }
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void m3242(float f, C1492 c1492) {
        int i;
        if (f > 0.75f) {
            float f2 = (f - 0.75f) / 0.25f;
            int[] iArr = c1492.f6902;
            int i2 = c1492.f6886;
            int i3 = iArr[i2];
            int i4 = iArr[(i2 + 1) % iArr.length];
            i = ((((i3 >> 24) & Base64.BASELENGTH) + ((int) ((((i4 >> 24) & Base64.BASELENGTH) - r1) * f2))) << 24) | ((((i3 >> 16) & Base64.BASELENGTH) + ((int) ((((i4 >> 16) & Base64.BASELENGTH) - r3) * f2))) << 16) | ((((i3 >> 8) & Base64.BASELENGTH) + ((int) ((((i4 >> 8) & Base64.BASELENGTH) - r4) * f2))) << 8) | ((i3 & Base64.BASELENGTH) + ((int) (f2 * ((i4 & Base64.BASELENGTH) - r2))));
        } else {
            i = c1492.f6902[c1492.f6886];
        }
        c1492.f6893 = i;
    }
}
