package dev.epro.r0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class A13572972347976583540 extends F12589017238560935108 {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Matrix d;

    public A13572972347976583540(ArrayList arrayList, Matrix matrix) {
        this.c = arrayList;
        this.d = matrix;
    }

    @Override // dev.epro.r0.F12589017238560935108
    public final void a(Matrix matrix, C9031148265500358222 c9031148265500358222, int i, Canvas canvas) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((F12589017238560935108) obj).a(this.d, c9031148265500358222, i, canvas);
        }
    }
}
