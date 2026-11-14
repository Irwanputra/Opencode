package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class H16627033410010803438 extends H4611829575853284164 implements F4096073349764486348 {
    public final /* synthetic */ T9348890437393808020 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H16627033410010803438(T9348890437393808020 t9348890437393808020) {
        super(1, Q13169198992966610970.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.h = t9348890437393808020;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        float[] fArr = ((N9580590882934638229) obj).a;
        B1029012102904255937 b1029012102904255937 = (B1029012102904255937) this.h.r.getValue();
        if (b1029012102904255937 != null) {
            if (!b1029012102904255937.C()) {
                b1029012102904255937 = null;
            }
            if (b1029012102904255937 != null) {
                b1029012102904255937.D(fArr);
            }
        }
        return O9245300239821758723.a;
    }
}
