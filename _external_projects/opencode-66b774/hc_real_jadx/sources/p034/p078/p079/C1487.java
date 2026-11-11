package p034.p078.p079;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.animation.Animation;
import android.widget.ImageView;
import java.util.concurrent.atomic.AtomicInteger;
import p034.p035.p045.C1096;

/* renamed from: づざかべべ.ざとぅぼこ〺.げつ〴ぬぐ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1487 extends ImageView {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public Animation.AnimationListener f6867;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f6868;

    /* renamed from: づざかべべ.ざとぅぼこ〺.げつ〴ぬぐ.げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C1488 extends OvalShape {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public RadialGradient f6869;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public Paint f6870 = new Paint();

        public C1488(int i) {
            C1487.this.f6868 = i;
            m3238((int) rect().width());
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            float width = C1487.this.getWidth() / 2;
            float height = C1487.this.getHeight() / 2;
            canvas.drawCircle(width, height, width, this.f6870);
            canvas.drawCircle(width, height, r0 - C1487.this.f6868, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void onResize(float f, float f2) {
            super.onResize(f, f2);
            m3238((int) f);
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final void m3238(int i) {
            float f = i / 2;
            RadialGradient radialGradient = new RadialGradient(f, f, C1487.this.f6868, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f6869 = radialGradient;
            this.f6870.setShader(radialGradient);
        }
    }

    public C1487(Context context, int i) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (1.75f * f);
        int i3 = (int) (0.0f * f);
        this.f6868 = (int) (3.5f * f);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 21) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C1096.m2509(this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C1488(this.f6868));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f6868, i3, i2, 503316480);
            int i5 = this.f6868;
            setPadding(i5, i5, i5, i5);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i);
        AtomicInteger atomicInteger = C1096.f5578;
        if (i4 >= 16) {
            setBackground(shapeDrawable);
        } else {
            setBackgroundDrawable(shapeDrawable);
        }
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f6867;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f6867;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (Build.VERSION.SDK_INT >= 21) {
            return;
        }
        setMeasuredDimension((this.f6868 * 2) + getMeasuredWidth(), (this.f6868 * 2) + getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }
}
