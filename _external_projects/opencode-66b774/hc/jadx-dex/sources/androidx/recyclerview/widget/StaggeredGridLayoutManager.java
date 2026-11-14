package androidx.recyclerview.widget;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class StaggeredGridLayoutManager extends dev.epro.r0.Y2666402291564931474 {
    public final int a;
    public final dev.epro.r0.E17149812035295265804[] b;
    public final dev.epro.r0.C12265524002282074474 c;
    public final dev.epro.r0.C12265524002282074474 d;
    public final int e;

    public StaggeredGridLayoutManager(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        this.a = -1;
        new android.graphics.Rect();
        dev.epro.r0.C15849213702011250340 c15849213702011250340L = dev.epro.r0.Y2666402291564931474.l(context, attributeSet, i, i2);
        int i3 = c15849213702011250340L.a;
        if (i3 != 0 && i3 != 1) {
            dev.epro.r0.S10973172697741180971.j("invalid orientation.");
            throw null;
        }
        if (i3 != this.e) {
            this.e = i3;
            dev.epro.r0.C12265524002282074474 c12265524002282074474 = this.c;
            this.c = this.d;
            this.d = c12265524002282074474;
        }
        int i4 = c15849213702011250340L.b;
        if (i4 != this.a) {
            this.a = i4;
            new java.util.BitSet(this.a);
            this.b = new dev.epro.r0.E17149812035295265804[this.a];
            for (int i5 = 0; i5 < this.a; i5++) {
                dev.epro.r0.E17149812035295265804[] e17149812035295265804Arr = this.b;
                dev.epro.r0.E17149812035295265804 e17149812035295265804 = new dev.epro.r0.E17149812035295265804((byte) 29);
                new java.util.ArrayList();
                e17149812035295265804Arr[i5] = e17149812035295265804;
            }
        }
        this.c = dev.epro.r0.C12265524002282074474.P(this, this.e);
        this.d = dev.epro.r0.C12265524002282074474.P(this, 1 - this.e);
    }
}
