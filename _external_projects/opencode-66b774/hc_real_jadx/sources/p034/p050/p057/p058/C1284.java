package p034.p050.p057.p058;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p034.p050.C1148;
import p034.p050.C1264;
import p034.p050.C1288;
import p131.p155.p156.p157.C2098;
import p237.p238.p239.p241.p242.C2786;

/* renamed from: づざかべべ.〺つふすそ.のぷのちつ.げつ〴ぬぐ.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1284 extends Drawable {

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public static final float f6241 = (float) Math.toRadians(45.0d);

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final int f6242;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public float f6243;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final Path f6244;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public float f6245;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public float f6246;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Paint f6247;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public float f6248;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public int f6249;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public boolean f6250;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public float f6251;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public boolean f6252;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public float f6253;

    public C1284(Context context) {
        Paint paint = new Paint();
        this.f6247 = paint;
        this.f6244 = new Path();
        this.f6252 = false;
        this.f6249 = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, C1148.DrawerArrowToggle, C1264.drawerArrowStyle, C1288.Base_Widget_AppCompat_DrawerArrowToggle);
        int color = obtainStyledAttributes.getColor(C1148.DrawerArrowToggle_color, 0);
        if (color != paint.getColor()) {
            paint.setColor(color);
            invalidateSelf();
        }
        float dimension = obtainStyledAttributes.getDimension(C1148.DrawerArrowToggle_thickness, 0.0f);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            double d = dimension / 2.0f;
            double cos = Math.cos(f6241);
            Double.isNaN(d);
            Double.isNaN(d);
            this.f6253 = (float) (cos * d);
            invalidateSelf();
        }
        boolean z = obtainStyledAttributes.getBoolean(C1148.DrawerArrowToggle_spinBars, true);
        if (this.f6250 != z) {
            this.f6250 = z;
            invalidateSelf();
        }
        float round = Math.round(obtainStyledAttributes.getDimension(C1148.DrawerArrowToggle_gapBetweenBars, 0.0f));
        if (round != this.f6248) {
            this.f6248 = round;
            invalidateSelf();
        }
        this.f6242 = obtainStyledAttributes.getDimensionPixelSize(C1148.DrawerArrowToggle_drawableSize, 0);
        this.f6246 = Math.round(obtainStyledAttributes.getDimension(C1148.DrawerArrowToggle_barLength, 0.0f));
        this.f6243 = Math.round(obtainStyledAttributes.getDimension(C1148.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.f6251 = obtainStyledAttributes.getDimension(C1148.DrawerArrowToggle_arrowShaftLength, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static float m2950(float f, float f2, float f3) {
        return C2098.m4188(f2, f, f3, f);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i = this.f6249;
        boolean z = false;
        if (i != 0 && (i == 1 || (i == 3 ? C2786.m4807(this) == 0 : C2786.m4807(this) == 1))) {
            z = true;
        }
        float f = this.f6243;
        float m2950 = m2950(this.f6246, (float) Math.sqrt(f * f * 2.0f), this.f6245);
        float m29502 = m2950(this.f6246, this.f6251, this.f6245);
        float round = Math.round(m2950(0.0f, this.f6253, this.f6245));
        float m29503 = m2950(0.0f, f6241, this.f6245);
        float m29504 = m2950(z ? 0.0f : -180.0f, z ? 180.0f : 0.0f, this.f6245);
        double d = m2950;
        double d2 = m29503;
        double cos = Math.cos(d2);
        Double.isNaN(d);
        boolean z2 = z;
        float round2 = Math.round(cos * d);
        double sin = Math.sin(d2);
        Double.isNaN(d);
        float round3 = Math.round(sin * d);
        this.f6244.rewind();
        float m29505 = m2950(this.f6247.getStrokeWidth() + this.f6248, -this.f6253, this.f6245);
        float f2 = (-m29502) / 2.0f;
        this.f6244.moveTo(f2 + round, 0.0f);
        this.f6244.rLineTo(m29502 - (round * 2.0f), 0.0f);
        this.f6244.moveTo(f2, m29505);
        this.f6244.rLineTo(round2, round3);
        this.f6244.moveTo(f2, -m29505);
        this.f6244.rLineTo(round2, -round3);
        this.f6244.close();
        canvas.save();
        float strokeWidth = this.f6247.getStrokeWidth();
        float height = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), (strokeWidth * 1.5f) + this.f6248 + ((((int) (height - (2.0f * r5))) / 4) * 2));
        if (this.f6250) {
            canvas.rotate(m29504 * (this.f6252 ^ z2 ? -1 : 1));
        } else if (z2) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f6244, this.f6247);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f6242;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f6242;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f6247.getAlpha()) {
            this.f6247.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f6247.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
