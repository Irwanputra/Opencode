package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final /* synthetic */ class E7853974395886365834 implements dev.epro.r0.F4096073349764486348 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dev.epro.r0.K1790240696900520106 b;

    public /* synthetic */ E7853974395886365834(dev.epro.r0.K1790240696900520106 k1790240696900520106, byte b) {
        this.a = b;
        this.b = k1790240696900520106;
    }

    public final java.lang.Object invoke(java.lang.Object obj) {
        byte b = this.a;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        dev.epro.r0.K1790240696900520106 k1790240696900520106 = this.b;
        dev.epro.r0.A2536033623645142779 a2536033623645142779 = (dev.epro.r0.A2536033623645142779) obj;
        switch (b) {
            case 0:
                android.view.View viewI = dev.epro.r0.O8620973563946607355.I(k1790240696900520106);
                if (!viewI.isFocused() && !viewI.hasFocus()) {
                    dev.epro.r0.Y10761909198794972532 focusOwner = dev.epro.r0.R7033599853981556291.S(k1790240696900520106).getFocusOwner();
                    android.view.View viewY = dev.epro.r0.O5354877807466160604.Y(k1790240696900520106);
                    java.lang.Integer numC = dev.epro.r0.U13290528641708548929.c(a2536033623645142779.a);
                    int[] iArr = new int[2];
                    viewY.getLocationOnScreen(iArr);
                    int[] iArr2 = new int[2];
                    viewI.getLocationOnScreen(iArr2);
                    dev.epro.r0.J9638579967056948799 j9638579967056948799S = dev.epro.r0.B11964701839924937722.s(((dev.epro.r0.D10236220797215130727) focusOwner).c);
                    android.graphics.Rect rect = null;
                    dev.epro.r0.S6349823729575121924 s6349823729575121924U = j9638579967056948799S != null ? dev.epro.r0.B11964701839924937722.u(j9638579967056948799S) : null;
                    if (s6349823729575121924U != null) {
                        int i = (int) s6349823729575121924U.a;
                        int i2 = iArr[0];
                        int i3 = iArr2[0];
                        int i4 = (int) s6349823729575121924U.b;
                        int i5 = iArr[1];
                        int i6 = iArr2[1];
                        rect = new android.graphics.Rect((i + i2) - i3, (i4 + i5) - i6, (((int) s6349823729575121924U.c) + i2) - i3, (((int) s6349823729575121924U.d) + i5) - i6);
                    }
                    if (!dev.epro.r0.U13290528641708548929.b(viewI, numC, rect)) {
                        a2536033623645142779.b = true;
                    }
                }
                break;
            default:
                dev.epro.r0.O8620973563946607355.I(k1790240696900520106);
                break;
        }
        return o9245300239821758723;
    }
}
