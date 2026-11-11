package p131.p161.p162.p163.p189;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import p034.p095.C1687;
import p131.p161.p162.p163.p189.InterfaceC2327;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぶでにく〼〳.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2325 {

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public static final int f9603;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public boolean f9604;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final View f9605;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public Drawable f9606;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final Path f9607;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final InterfaceC2326 f9608;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final Paint f9609;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public InterfaceC2327.C2331 f9610;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final Paint f9611;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public boolean f9612;

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぶでにく〼〳.〺つふすそ$げつ〴ぬぐ, reason: contains not printable characters */
    public interface InterfaceC2326 {
        /* renamed from: 〺つふすそ */
        void mo1396(Canvas canvas);

        /* renamed from: びぐびあび */
        boolean mo1399();
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f9603 = i >= 21 ? 2 : i >= 18 ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2325(InterfaceC2326 interfaceC2326) {
        this.f9608 = interfaceC2326;
        View view = (View) interfaceC2326;
        this.f9605 = view;
        view.setWillNotDraw(false);
        this.f9607 = new Path();
        this.f9611 = new Paint(7);
        Paint paint = new Paint(1);
        this.f9609 = paint;
        paint.setColor(0);
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public void m4487(InterfaceC2327.C2331 c2331) {
        if (c2331 == null) {
            this.f9610 = null;
        } else {
            InterfaceC2327.C2331 c23312 = this.f9610;
            if (c23312 == null) {
                this.f9610 = new InterfaceC2327.C2331(c2331.f9618, c2331.f9616, c2331.f9617);
            } else {
                float f = c2331.f9618;
                float f2 = c2331.f9616;
                float f3 = c2331.f9617;
                c23312.f9618 = f;
                c23312.f9616 = f2;
                c23312.f9617 = f3;
            }
            if (c2331.f9617 + 1.0E-4f >= m4493(c2331)) {
                this.f9610.f9617 = Float.MAX_VALUE;
            }
        }
        if (f9603 == 1) {
            this.f9607.rewind();
            InterfaceC2327.C2331 c23313 = this.f9610;
            if (c23313 != null) {
                this.f9607.addCircle(c23313.f9618, c23313.f9616, c23313.f9617, Path.Direction.CW);
            }
        }
        this.f9605.invalidate();
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m4488() {
        if (f9603 == 0) {
            this.f9612 = false;
            this.f9605.destroyDrawingCache();
            this.f9611.setShader(null);
            this.f9605.invalidate();
        }
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean m4489() {
        return this.f9608.mo1399() && !m4496();
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final boolean m4490() {
        return (this.f9604 || Color.alpha(this.f9609.getColor()) == 0) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        r10.drawRect(0.0f, 0.0f, r9.f9605.getWidth(), r9.f9605.getHeight(), r9.f9609);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
    
        if (m4490() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (m4490() != false) goto L23;
     */
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m4491(android.graphics.Canvas r10) {
        /*
            r9 = this;
            boolean r0 = r9.m4496()
            r1 = 1
            if (r0 == 0) goto L77
            int r0 = p131.p161.p162.p163.p189.C2325.f9603
            if (r0 == 0) goto L56
            if (r0 == r1) goto L28
            r2 = 2
            if (r0 != r2) goto L1c
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぶでにく〼〳.〺つふすそ$げつ〴ぬぐ r0 = r9.f9608
            r0.mo1396(r10)
            boolean r0 = r9.m4490()
            if (r0 == 0) goto L98
            goto L82
        L1c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unsupported strategy "
            java.lang.String r0 = p131.p155.p156.p157.C2098.m4208(r1, r0)
            r10.<init>(r0)
            throw r10
        L28:
            int r0 = r10.save()
            android.graphics.Path r2 = r9.f9607
            r10.clipPath(r2)
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぶでにく〼〳.〺つふすそ$げつ〴ぬぐ r2 = r9.f9608
            r2.mo1396(r10)
            boolean r2 = r9.m4490()
            if (r2 == 0) goto L52
            r4 = 0
            r5 = 0
            android.view.View r2 = r9.f9605
            int r2 = r2.getWidth()
            float r6 = (float) r2
            android.view.View r2 = r9.f9605
            int r2 = r2.getHeight()
            float r7 = (float) r2
            android.graphics.Paint r8 = r9.f9609
            r3 = r10
            r3.drawRect(r4, r5, r6, r7, r8)
        L52:
            r10.restoreToCount(r0)
            goto L98
        L56:
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぶでにく〼〳.くし〴〺ぅ$づざかべべ r0 = r9.f9610
            float r2 = r0.f9618
            float r3 = r0.f9616
            float r0 = r0.f9617
            android.graphics.Paint r4 = r9.f9611
            r10.drawCircle(r2, r3, r0, r4)
            boolean r0 = r9.m4490()
            if (r0 == 0) goto L98
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぶでにく〼〳.くし〴〺ぅ$づざかべべ r0 = r9.f9610
            float r2 = r0.f9618
            float r3 = r0.f9616
            float r0 = r0.f9617
            android.graphics.Paint r4 = r9.f9609
            r10.drawCircle(r2, r3, r0, r4)
            goto L98
        L77:
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぶでにく〼〳.〺つふすそ$げつ〴ぬぐ r0 = r9.f9608
            r0.mo1396(r10)
            boolean r0 = r9.m4490()
            if (r0 == 0) goto L98
        L82:
            r3 = 0
            r4 = 0
            android.view.View r0 = r9.f9605
            int r0 = r0.getWidth()
            float r5 = (float) r0
            android.view.View r0 = r9.f9605
            int r0 = r0.getHeight()
            float r6 = (float) r0
            android.graphics.Paint r7 = r9.f9609
            r2 = r10
            r2.drawRect(r3, r4, r5, r6, r7)
        L98:
            boolean r0 = r9.f9604
            if (r0 != 0) goto La5
            android.graphics.drawable.Drawable r0 = r9.f9606
            if (r0 == 0) goto La5
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぶでにく〼〳.くし〴〺ぅ$づざかべべ r0 = r9.f9610
            if (r0 == 0) goto La5
            goto La6
        La5:
            r1 = 0
        La6:
            if (r1 == 0) goto Ld3
            android.graphics.drawable.Drawable r0 = r9.f9606
            android.graphics.Rect r0 = r0.getBounds()
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぶでにく〼〳.くし〴〺ぅ$づざかべべ r1 = r9.f9610
            float r1 = r1.f9618
            int r2 = r0.width()
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            float r1 = r1 - r2
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぶでにく〼〳.くし〴〺ぅ$づざかべべ r2 = r9.f9610
            float r2 = r2.f9616
            int r0 = r0.height()
            float r0 = (float) r0
            float r0 = r0 / r3
            float r2 = r2 - r0
            r10.translate(r1, r2)
            android.graphics.drawable.Drawable r0 = r9.f9606
            r0.draw(r10)
            float r0 = -r1
            float r1 = -r2
            r10.translate(r0, r1)
        Ld3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p131.p161.p162.p163.p189.C2325.m4491(android.graphics.Canvas):void");
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m4492() {
        if (f9603 == 0) {
            this.f9604 = true;
            this.f9612 = false;
            this.f9605.buildDrawingCache();
            Bitmap drawingCache = this.f9605.getDrawingCache();
            if (drawingCache == null && this.f9605.getWidth() != 0 && this.f9605.getHeight() != 0) {
                drawingCache = Bitmap.createBitmap(this.f9605.getWidth(), this.f9605.getHeight(), Bitmap.Config.ARGB_8888);
                this.f9605.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.f9611;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.f9604 = false;
            this.f9612 = true;
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final float m4493(InterfaceC2327.C2331 c2331) {
        return C1687.m3732(c2331.f9618, c2331.f9616, 0.0f, 0.0f, this.f9605.getWidth(), this.f9605.getHeight());
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public InterfaceC2327.C2331 m4494() {
        InterfaceC2327.C2331 c2331 = this.f9610;
        if (c2331 == null) {
            return null;
        }
        InterfaceC2327.C2331 c23312 = new InterfaceC2327.C2331(c2331.f9618, c2331.f9616, c2331.f9617);
        if (c23312.f9617 == Float.MAX_VALUE) {
            c23312.f9617 = m4493(c23312);
        }
        return c23312;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int m4495() {
        return this.f9609.getColor();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0024  */
    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m4496() {
        /*
            r4 = this;
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぶでにく〼〳.くし〴〺ぅ$づざかべべ r0 = r4.f9610
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L17
            float r0 = r0.f9617
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            goto L18
        L17:
            r0 = 1
        L18:
            int r3 = p131.p161.p162.p163.p189.C2325.f9603
            if (r3 != 0) goto L24
            if (r0 != 0) goto L23
            boolean r0 = r4.f9612
            if (r0 == 0) goto L23
            r1 = 1
        L23:
            return r1
        L24:
            r0 = r0 ^ r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p131.p161.p162.p163.p189.C2325.m4496():boolean");
    }
}
