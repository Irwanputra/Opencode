package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A10893230477173419393 extends dev.epro.r0.Y5826249320482397604 {
    public float b;
    public float c;

    public final void a(android.graphics.Matrix matrix, android.graphics.Path path) {
        android.graphics.Matrix matrix2 = ((dev.epro.r0.Y5826249320482397604) this).a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.b, this.c);
        path.transform(matrix);
    }
}
