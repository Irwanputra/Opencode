package dev.epro.r0;

import android.graphics.Paint;
import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class C9031148265500358222 {
    public static final int[] i = new int[3];
    public static final float[] j = {0.0f, 0.5f, 1.0f};
    public static final int[] k = new int[4];
    public static final float[] l = {0.0f, 0.0f, 0.5f, 1.0f};
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final int d;
    public final int e;
    public final int f;
    public final Path g = new Path();
    public final Paint h;

    public C9031148265500358222() {
        Paint paint = new Paint();
        this.h = paint;
        Paint paint2 = new Paint();
        this.a = paint2;
        this.d = E7030189496516270437.d(-16777216, 68);
        this.e = E7030189496516270437.d(-16777216, 20);
        this.f = E7030189496516270437.d(-16777216, 0);
        paint2.setColor(this.d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.c = new Paint(paint3);
    }
}
