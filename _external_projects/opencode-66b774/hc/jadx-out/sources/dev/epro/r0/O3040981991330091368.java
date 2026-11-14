package dev.epro.r0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O3040981991330091368 extends F12589017238560935108 {
    public final N11020017223587803565 c;

    public O3040981991330091368(N11020017223587803565 n11020017223587803565) {
        this.c = n11020017223587803565;
    }

    @Override // dev.epro.r0.F12589017238560935108
    public final void a(Matrix matrix, C9031148265500358222 c9031148265500358222, int i, Canvas canvas) {
        RectF rectF = N11020017223587803565.h;
        N11020017223587803565 n11020017223587803565 = this.c;
        float f = n11020017223587803565.f;
        float f2 = n11020017223587803565.g;
        RectF rectF2 = new RectF(n11020017223587803565.b, n11020017223587803565.c, n11020017223587803565.d, n11020017223587803565.e);
        Paint paint = c9031148265500358222.b;
        boolean z = f2 < 0.0f;
        Path path = c9031148265500358222.g;
        int[] iArr = C9031148265500358222.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = c9031148265500358222.f;
            iArr[2] = c9031148265500358222.e;
            iArr[3] = c9031148265500358222.d;
        } else {
            path.rewind();
            path.moveTo(rectF2.centerX(), rectF2.centerY());
            path.arcTo(rectF2, f, f2);
            path.close();
            float f3 = -i;
            rectF2.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = c9031148265500358222.d;
            iArr[2] = c9031148265500358222.e;
            iArr[3] = c9031148265500358222.f;
        }
        float fWidth = rectF2.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = C9031148265500358222.l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        paint.setShader(new RadialGradient(rectF2.centerX(), rectF2.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF2.height() / rectF2.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, c9031148265500358222.h);
        }
        canvas.drawArc(rectF2, f, f2, true, paint);
        canvas.restore();
    }
}
