package dev.epro.r0;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Y18442090079458478045 extends F12589017238560935108 {
    public final A10893230477173419393 c;
    public final float d;
    public final float e;

    public Y18442090079458478045(A10893230477173419393 a10893230477173419393, float f, float f2) {
        this.c = a10893230477173419393;
        this.d = f;
        this.e = f2;
    }

    @Override // dev.epro.r0.F12589017238560935108
    public final void a(Matrix matrix, C9031148265500358222 c9031148265500358222, int i, Canvas canvas) {
        A10893230477173419393 a10893230477173419393 = this.c;
        float f = a10893230477173419393.c;
        float f2 = this.e;
        float f3 = a10893230477173419393.b;
        float f4 = this.d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        c9031148265500358222.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = c9031148265500358222.f;
        int[] iArr = C9031148265500358222.i;
        iArr[0] = i2;
        iArr[1] = c9031148265500358222.e;
        iArr[2] = c9031148265500358222.d;
        Paint paint = c9031148265500358222.c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, C9031148265500358222.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        A10893230477173419393 a10893230477173419393 = this.c;
        return (float) Math.toDegrees(Math.atan((a10893230477173419393.c - this.e) / (a10893230477173419393.b - this.d)));
    }
}
