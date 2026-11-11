package p131.p161.p162.p163.p174;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import p131.p161.p162.p163.p173.C2163;
import p131.p161.p162.p163.p173.C2180;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.おかぷせ〱.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2199 extends C2163 {

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public final Paint f9179;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public int f9180;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public final RectF f9181;

    public C2199() {
        this(null);
    }

    public C2199(C2180 c2180) {
        super(c2180 == null ? new C2180() : c2180);
        Paint paint = new Paint(1);
        this.f9179 = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f9181 = new RectF();
    }

    @Override // p131.p161.p162.p163.p173.C2163, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
            }
        } else {
            this.f9180 = Build.VERSION.SDK_INT >= 21 ? canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null) : canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
        }
        super.draw(canvas);
        canvas.drawRect(this.f9181, this.f9179);
        if (getCallback() instanceof View) {
            return;
        }
        canvas.restoreToCount(this.f9180);
    }

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public void m4306(float f, float f2, float f3, float f4) {
        RectF rectF = this.f9181;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }
}
