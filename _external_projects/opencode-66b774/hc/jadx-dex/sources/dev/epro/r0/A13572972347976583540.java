package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A13572972347976583540 extends dev.epro.r0.F12589017238560935108 {
    public final /* synthetic */ java.util.ArrayList c;
    public final /* synthetic */ android.graphics.Matrix d;

    public A13572972347976583540(java.util.ArrayList arrayList, android.graphics.Matrix matrix) {
        this.c = arrayList;
        this.d = matrix;
    }

    public final void a(android.graphics.Matrix matrix, dev.epro.r0.C9031148265500358222 c9031148265500358222, int i, android.graphics.Canvas canvas) {
        java.util.ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            java.lang.Object obj = arrayList.get(i2);
            i2++;
            ((dev.epro.r0.F12589017238560935108) obj).a(this.d, c9031148265500358222, i, canvas);
        }
    }
}
