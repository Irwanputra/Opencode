package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E10160310379137155518 implements dev.epro.r0.P14548408347618629366 {
    public final int a;
    public final /* synthetic */ dev.epro.r0.P14575954172000745949 b;

    public E10160310379137155518(dev.epro.r0.P14575954172000745949 p14575954172000745949, int i) {
        this.b = p14575954172000745949;
        this.a = i;
    }

    public final boolean a(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        dev.epro.r0.P14575954172000745949 p14575954172000745949 = this.b;
        dev.epro.r0.C13374971588771233833 c13374971588771233833 = p14575954172000745949.w;
        int i = this.a;
        if (c13374971588771233833 == null || i >= 0 || !c13374971588771233833.e().J()) {
            return p14575954172000745949.K(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
