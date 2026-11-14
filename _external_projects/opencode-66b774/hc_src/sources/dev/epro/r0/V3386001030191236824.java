package dev.epro.r0;

import android.graphics.Paint;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class V3386001030191236824 {
    public static final V3386001030191236824 a = new V3386001030191236824();

    public final long a(Paint paint) {
        long colorLong;
        int i = U10174709222559481877.i;
        colorLong = paint.getColorLong();
        long j = 63 & colorLong;
        return j < 16 ? colorLong : (colorLong & (-64)) | (j + 1);
    }

    public final void b(Paint paint, int i) {
        paint.setBlendMode(K5751602218013079365.g0(i));
    }

    public final void c(Paint paint, long j) {
        paint.setColor(R7033599853981556291.Z(j));
    }
}
