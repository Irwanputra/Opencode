package dev.epro.r0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class E10160310379137155518 implements P14548408347618629366 {
    public final int a;
    public final /* synthetic */ P14575954172000745949 b;

    public E10160310379137155518(P14575954172000745949 p14575954172000745949, int i) {
        this.b = p14575954172000745949;
        this.a = i;
    }

    @Override // dev.epro.r0.P14548408347618629366
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        P14575954172000745949 p14575954172000745949 = this.b;
        C13374971588771233833 c13374971588771233833 = p14575954172000745949.w;
        int i = this.a;
        if (c13374971588771233833 == null || i >= 0 || !c13374971588771233833.e().J()) {
            return p14575954172000745949.K(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
