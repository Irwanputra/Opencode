package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Q67451660661543800 extends P16078978668947144669 {
    public final /* synthetic */ G5920303990939058292 h;

    public Q67451660661543800(G5920303990939058292 g5920303990939058292) {
        this.h = g5920303990939058292;
    }

    @Override // dev.epro.r0.P16078978668947144669
    public final String f() {
        X627358512999327803 x627358512999327803 = (X627358512999327803) this.h.a.get();
        if (x627358512999327803 == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + x627358512999327803.a + "]";
    }
}
