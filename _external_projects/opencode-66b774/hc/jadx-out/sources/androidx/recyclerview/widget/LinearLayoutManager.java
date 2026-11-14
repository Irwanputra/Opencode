package androidx.recyclerview.widget;

import android.content.Context;
import android.util.AttributeSet;
import dev.epro.r0.C12265524002282074474;
import dev.epro.r0.C15849213702011250340;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.Y2666402291564931474;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends Y2666402291564931474 {
    public final int a;
    public final C12265524002282074474 b;
    public final boolean c;
    public boolean d = false;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.a = 1;
        this.c = false;
        C15849213702011250340 c15849213702011250340L = Y2666402291564931474.l(context, attributeSet, i, i2);
        int i3 = c15849213702011250340L.a;
        if (i3 != 0 && i3 != 1) {
            S10973172697741180971.j(G6547577305291411977.n(i3, "invalid orientation:"));
            throw null;
        }
        if (i3 != this.a || this.b == null) {
            this.b = C12265524002282074474.P(this, i3);
            this.a = i3;
        }
        boolean z = c15849213702011250340L.c;
        if (z != this.c) {
            this.c = z;
        }
        o(c15849213702011250340L.d);
    }

    public void o(boolean z) {
        if (this.d == z) {
            return;
        }
        this.d = z;
    }
}
