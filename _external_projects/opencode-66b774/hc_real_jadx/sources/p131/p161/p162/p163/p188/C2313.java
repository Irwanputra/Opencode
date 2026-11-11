package p131.p161.p162.p163.p188;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import p034.p035.p038.C1011;
import p131.p161.p162.p163.p173.C2180;
import p131.p161.p162.p163.p173.C2184;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.びえぁぜい.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2313 extends Drawable {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public float f9576;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Paint f9577;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public int f9579;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public ColorStateList f9580;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public C2180 f9581;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public int f9585;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public int f9587;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public int f9590;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public int f9591;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final C2184 f9583 = new C2184();

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final Path f9582 = new Path();

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final Rect f9588 = new Rect();

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final RectF f9584 = new RectF();

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final RectF f9586 = new RectF();

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final C2314 f9578 = new C2314(null);

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public boolean f9589 = true;

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.びえぁぜい.くし〴〺ぅ$〺つふすそ, reason: contains not printable characters */
    public class C2314 extends Drawable.ConstantState {
        public C2314(C2315 c2315) {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return C2313.this;
        }
    }

    public C2313(C2180 c2180) {
        this.f9581 = c2180;
        Paint paint = new Paint(1);
        this.f9577 = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f9589) {
            Paint paint = this.f9577;
            copyBounds(this.f9588);
            float height = this.f9576 / r1.height();
            paint.setShader(new LinearGradient(0.0f, r1.top, 0.0f, r1.bottom, new int[]{C1011.m2352(this.f9590, this.f9587), C1011.m2352(this.f9579, this.f9587), C1011.m2352(C1011.m2351(this.f9579, 0), this.f9587), C1011.m2352(C1011.m2351(this.f9585, 0), this.f9587), C1011.m2352(this.f9585, this.f9587), C1011.m2352(this.f9591, this.f9587)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.f9589 = false;
        }
        float strokeWidth = this.f9577.getStrokeWidth() / 2.0f;
        copyBounds(this.f9588);
        this.f9584.set(this.f9588);
        float min = Math.min(this.f9581.f9124.mo4271(m4485()), this.f9584.width() / 2.0f);
        if (this.f9581.m4287(m4485())) {
            this.f9584.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f9584, min, min, this.f9577);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f9578;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f9576 > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f9581.m4287(m4485())) {
            outline.setRoundRect(getBounds(), this.f9581.f9124.mo4271(m4485()));
            return;
        }
        copyBounds(this.f9588);
        this.f9584.set(this.f9588);
        this.f9583.m4297(this.f9581, 1.0f, this.f9584, this.f9582);
        if (this.f9582.isConvex()) {
            outline.setConvexPath(this.f9582);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        if (!this.f9581.m4287(m4485())) {
            return true;
        }
        int round = Math.round(this.f9576);
        rect.set(round, round, round, round);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f9580;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f9589 = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f9580;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f9587)) != this.f9587) {
            this.f9589 = true;
            this.f9587 = colorForState;
        }
        if (this.f9589) {
            invalidateSelf();
        }
        return this.f9589;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f9577.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f9577.setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m4484(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f9587 = colorStateList.getColorForState(getState(), this.f9587);
        }
        this.f9580 = colorStateList;
        this.f9589 = true;
        invalidateSelf();
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public RectF m4485() {
        this.f9586.set(getBounds());
        return this.f9586;
    }
}
