package androidx.recyclerview.widget;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class GridLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {
    public final int e;

    public GridLayoutManager(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.e = -1;
        new android.util.SparseIntArray();
        new android.util.SparseIntArray();
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        new android.util.SparseIntArray();
        new android.graphics.Rect();
        int i3 = dev.epro.r0.Y2666402291564931474.l(context, attributeSet, i, i2).b;
        if (i3 == this.e) {
            return;
        }
        if (i3 < 1) {
            dev.epro.r0.S10973172697741180971.j(dev.epro.r0.G6547577305291411977.n(i3, "Span count should be at least 1. Provided "));
            throw null;
        }
        this.e = i3;
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void o(boolean z) {
        if (z) {
            dev.epro.r0.D11988991656201568495.j("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else {
            super.o(false);
        }
    }
}
