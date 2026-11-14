package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import dev.epro.r0.D11988991656201568495;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.Y2666402291564931474;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public final int e;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.e = -1;
        new SparseIntArray();
        new SparseIntArray();
        SparseIntArray sparseIntArray = new SparseIntArray();
        new SparseIntArray();
        new Rect();
        int i3 = Y2666402291564931474.l(context, attributeSet, i, i2).b;
        if (i3 == this.e) {
            return;
        }
        if (i3 < 1) {
            S10973172697741180971.j(G6547577305291411977.n(i3, "Span count should be at least 1. Provided "));
            throw null;
        }
        this.e = i3;
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void o(boolean z) {
        if (z) {
            D11988991656201568495.j("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else {
            super.o(false);
        }
    }
}
