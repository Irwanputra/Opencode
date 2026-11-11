package p131.p161.p162.p163.p173;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import p131.p161.p162.p163.p192.C2349;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.おぐぴう〸ず, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2170 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    @Deprecated
    public float f9094;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    @Deprecated
    public float f9096;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    @Deprecated
    public float f9097;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    @Deprecated
    public float f9098;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    @Deprecated
    public float f9099;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    @Deprecated
    public float f9100;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final List<AbstractC2174> f9095 = new ArrayList();

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final List<AbstractC2175> f9093 = new ArrayList();

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.おぐぴう〸ず$〺つふすそ, reason: contains not printable characters */
    public static class C2171 extends AbstractC2175 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final C2176 f9101;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final float f9102;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final float f9103;

        public C2171(C2176 c2176, float f, float f2) {
            this.f9101 = c2176;
            this.f9102 = f;
            this.f9103 = f2;
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public float m4279() {
            C2176 c2176 = this.f9101;
            return (float) Math.toDegrees(Math.atan((c2176.f9115 - this.f9103) / (c2176.f9114 - this.f9102)));
        }

        @Override // p131.p161.p162.p163.p173.C2170.AbstractC2175
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void mo4280(Matrix matrix, C2349 c2349, int i, Canvas canvas) {
            C2176 c2176 = this.f9101;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(c2176.f9115 - this.f9103, c2176.f9114 - this.f9102), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f9102, this.f9103);
            matrix2.preRotate(m4279());
            c2349.getClass();
            rectF.bottom += i;
            rectF.offset(0.0f, -i);
            int[] iArr = C2349.f9645;
            iArr[0] = c2349.f9653;
            iArr[1] = c2349.f9652;
            iArr[2] = c2349.f9654;
            Paint paint = c2349.f9650;
            float f = rectF.left;
            paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, C2349.f9643, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, c2349.f9650);
            canvas.restore();
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.おぐぴう〸ず$くし〴〺ぅ, reason: contains not printable characters */
    public static class C2172 extends AbstractC2174 {

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public static final RectF f9104 = new RectF();

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        @Deprecated
        public float f9105;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        @Deprecated
        public float f9106;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        @Deprecated
        public float f9107;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        @Deprecated
        public float f9108;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        @Deprecated
        public float f9109;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        @Deprecated
        public float f9110;

        public C2172(float f, float f2, float f3, float f4) {
            this.f9105 = f;
            this.f9107 = f2;
            this.f9110 = f3;
            this.f9108 = f4;
        }

        @Override // p131.p161.p162.p163.p173.C2170.AbstractC2174
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void mo4281(Matrix matrix, Path path) {
            Matrix matrix2 = this.f9112;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f9104;
            rectF.set(this.f9105, this.f9107, this.f9110, this.f9108);
            path.arcTo(rectF, this.f9109, this.f9106, false);
            path.transform(matrix);
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.おぐぴう〸ず$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C2173 extends AbstractC2175 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final C2172 f9111;

        public C2173(C2172 c2172) {
            this.f9111 = c2172;
        }

        @Override // p131.p161.p162.p163.p173.C2170.AbstractC2175
        /* renamed from: げつ〴ぬぐ */
        public void mo4280(Matrix matrix, C2349 c2349, int i, Canvas canvas) {
            C2172 c2172 = this.f9111;
            float f = c2172.f9109;
            float f2 = c2172.f9106;
            C2172 c21722 = this.f9111;
            RectF rectF = new RectF(c21722.f9105, c21722.f9107, c21722.f9110, c21722.f9108);
            boolean z = f2 < 0.0f;
            Path path = c2349.f9649;
            if (z) {
                int[] iArr = C2349.f9646;
                iArr[0] = 0;
                iArr[1] = c2349.f9653;
                iArr[2] = c2349.f9652;
                iArr[3] = c2349.f9654;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f, f2);
                path.close();
                float f3 = -i;
                rectF.inset(f3, f3);
                int[] iArr2 = C2349.f9646;
                iArr2[0] = 0;
                iArr2[1] = c2349.f9654;
                iArr2[2] = c2349.f9652;
                iArr2[3] = c2349.f9653;
            }
            float width = rectF.width() / 2.0f;
            if (width <= 0.0f) {
                return;
            }
            float f4 = 1.0f - (i / width);
            float[] fArr = C2349.f9644;
            fArr[1] = f4;
            fArr[2] = ((1.0f - f4) / 2.0f) + f4;
            c2349.f9648.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, C2349.f9646, fArr, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            if (!z) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, c2349.f9647);
            }
            canvas.drawArc(rectF, f, f2, true, c2349.f9648);
            canvas.restore();
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.おぐぴう〸ず$づざかべべ, reason: contains not printable characters */
    public static abstract class AbstractC2174 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final Matrix f9112 = new Matrix();

        /* renamed from: げつ〴ぬぐ */
        public abstract void mo4281(Matrix matrix, Path path);
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.おぐぴう〸ず$なぎぱいぢぎ, reason: contains not printable characters */
    public static abstract class AbstractC2175 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public static final Matrix f9113 = new Matrix();

        /* renamed from: げつ〴ぬぐ */
        public abstract void mo4280(Matrix matrix, C2349 c2349, int i, Canvas canvas);
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.おぐぴう〸ず$びぐびあび, reason: contains not printable characters */
    public static class C2176 extends AbstractC2174 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public float f9114;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public float f9115;

        @Override // p131.p161.p162.p163.p173.C2170.AbstractC2174
        /* renamed from: げつ〴ぬぐ */
        public void mo4281(Matrix matrix, Path path) {
            Matrix matrix2 = this.f9112;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f9114, this.f9115);
            path.transform(matrix);
        }
    }

    public C2170() {
        m4276(0.0f, 0.0f);
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m4273(float f) {
        float f2 = this.f9098;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.f9096;
        float f5 = this.f9100;
        C2172 c2172 = new C2172(f4, f5, f4, f5);
        c2172.f9109 = this.f9098;
        c2172.f9106 = f3;
        this.f9093.add(new C2173(c2172));
        this.f9098 = f;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void m4274(Matrix matrix, Path path) {
        int size = this.f9095.size();
        for (int i = 0; i < size; i++) {
            this.f9095.get(i).mo4281(matrix, path);
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m4275(float f, float f2, float f3, float f4, float f5, float f6) {
        C2172 c2172 = new C2172(f, f2, f3, f4);
        c2172.f9109 = f5;
        c2172.f9106 = f6;
        this.f9095.add(c2172);
        C2173 c2173 = new C2173(c2172);
        float f7 = f5 + f6;
        boolean z = f6 < 0.0f;
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        float f8 = z ? (180.0f + f7) % 360.0f : f7;
        m4273(f5);
        this.f9093.add(c2173);
        this.f9098 = f8;
        double d = f7;
        this.f9096 = (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))) + ((f + f3) * 0.5f);
        this.f9100 = (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))) + ((f2 + f4) * 0.5f);
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public void m4276(float f, float f2) {
        m4277(f, f2, 270.0f, 0.0f);
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public void m4277(float f, float f2, float f3, float f4) {
        this.f9097 = f;
        this.f9094 = f2;
        this.f9096 = f;
        this.f9100 = f2;
        this.f9098 = f3;
        this.f9099 = (f3 + f4) % 360.0f;
        this.f9095.clear();
        this.f9093.clear();
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void m4278(float f, float f2) {
        C2176 c2176 = new C2176();
        c2176.f9114 = f;
        c2176.f9115 = f2;
        this.f9095.add(c2176);
        C2171 c2171 = new C2171(c2176, this.f9096, this.f9100);
        float m4279 = c2171.m4279() + 270.0f;
        float m42792 = c2171.m4279() + 270.0f;
        m4273(m4279);
        this.f9093.add(c2171);
        this.f9098 = m42792;
        this.f9096 = f;
        this.f9100 = f2;
    }
}
