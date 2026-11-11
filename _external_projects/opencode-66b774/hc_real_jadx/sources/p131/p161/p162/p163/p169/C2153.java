package p131.p161.p162.p163.p169;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import p131.p161.p162.p163.p173.C2163;
import p131.p161.p162.p163.p173.C2167;
import p131.p161.p162.p163.p173.C2180;
import p131.p161.p162.p163.p173.C2183;
import p131.p161.p162.p163.p173.C2188;
import p131.p161.p162.p163.p185.C2249;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぇとしたべど.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2153 extends C2163 implements C2249.InterfaceC2250 {

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public final View.OnLayoutChangeListener f9009;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public CharSequence f9010;

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public int f9011;

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public int f9012;

    /* renamed from: けときぜと, reason: contains not printable characters */
    public int f9013;

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public final Rect f9014;

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public int f9015;

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public final C2249 f9016;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public final Paint.FontMetrics f9017;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public final Context f9018;

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public int f9019;

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public int f9020;

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぇとしたべど.げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
    public class ViewOnLayoutChangeListenerC2154 implements View.OnLayoutChangeListener {
        public ViewOnLayoutChangeListenerC2154() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C2153 c2153 = C2153.this;
            c2153.getClass();
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            c2153.f9012 = iArr[0];
            view.getWindowVisibleDisplayFrame(c2153.f9014);
        }
    }

    public C2153(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f9017 = new Paint.FontMetrics();
        C2249 c2249 = new C2249(this);
        this.f9016 = c2249;
        this.f9009 = new ViewOnLayoutChangeListenerC2154();
        this.f9014 = new Rect();
        this.f9018 = context;
        c2249.f9367.density = context.getResources().getDisplayMetrics().density;
        c2249.f9367.setTextAlign(Paint.Align.CENTER);
    }

    @Override // p131.p161.p162.p163.p173.C2163, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.save();
        float m4235 = m4235();
        double d = this.f9013;
        double sqrt = Math.sqrt(2.0d);
        Double.isNaN(d);
        double d2 = sqrt * d;
        double d3 = this.f9013;
        Double.isNaN(d3);
        canvas.translate(m4235, (float) (-(d2 - d3)));
        super.draw(canvas);
        if (this.f9010 != null) {
            float centerY = getBounds().centerY();
            this.f9016.f9367.getFontMetrics(this.f9017);
            Paint.FontMetrics fontMetrics = this.f9017;
            int i = (int) (centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            C2249 c2249 = this.f9016;
            if (c2249.f9369 != null) {
                c2249.f9367.drawableState = getState();
                C2249 c22492 = this.f9016;
                c22492.f9369.m4231(this.f9018, c22492.f9367, c22492.f9365);
            }
            CharSequence charSequence = this.f9010;
            canvas.drawText(charSequence, 0, charSequence.length(), r0.centerX(), i, this.f9016.f9367);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) Math.max(this.f9016.f9367.getTextSize(), this.f9015);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        float f = this.f9020 * 2;
        CharSequence charSequence = this.f9010;
        return (int) Math.max(f + (charSequence == null ? 0.0f : this.f9016.m4399(charSequence.toString())), this.f9011);
    }

    @Override // p131.p161.p162.p163.p173.C2163, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        C2180 c2180 = this.f9045.f9074;
        c2180.getClass();
        C2180.C2181 c2181 = new C2180.C2181(c2180);
        c2181.f9141 = m4236();
        this.f9045.f9074 = c2181.m4291();
        invalidateSelf();
    }

    @Override // p131.p161.p162.p163.p173.C2163, android.graphics.drawable.Drawable, p131.p161.p162.p163.p185.C2249.InterfaceC2250
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public final float m4235() {
        int i;
        if (((this.f9014.right - getBounds().right) - this.f9012) - this.f9019 < 0) {
            i = ((this.f9014.right - getBounds().right) - this.f9012) - this.f9019;
        } else {
            if (((this.f9014.left - getBounds().left) - this.f9012) + this.f9019 <= 0) {
                return 0.0f;
            }
            i = ((this.f9014.left - getBounds().left) - this.f9012) + this.f9019;
        }
        return i;
    }

    @Override // p131.p161.p162.p163.p185.C2249.InterfaceC2250
    /* renamed from: げつ〴ぬぐ */
    public void mo1302() {
        invalidateSelf();
    }

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public final C2183 m4236() {
        float f = -m4235();
        double width = getBounds().width();
        double d = this.f9013;
        double sqrt = Math.sqrt(2.0d);
        Double.isNaN(d);
        Double.isNaN(width);
        float f2 = ((float) (width - (sqrt * d))) / 2.0f;
        return new C2188(new C2167(this.f9013), Math.min(Math.max(f, -f2), f2));
    }
}
