package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final /* synthetic */ class B9951899438396776027 implements android.os.CancellationSignal.OnCancelListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ B9951899438396776027(java.lang.Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        byte b = this.a;
        java.lang.Object obj = this.b;
        switch (b) {
            case 0:
                ((dev.epro.r0.X7175349259954592591) obj).c((java.util.concurrent.CancellationException) null);
                break;
            case 1:
                dev.epro.r0.L9852841107405549527 l9852841107405549527 = (dev.epro.r0.L9852841107405549527) obj;
                if (l9852841107405549527 != null) {
                    dev.epro.r0.I2076339260272013590 i2076339260272013590 = l9852841107405549527.d;
                    if (i2076339260272013590 != null) {
                        i2076339260272013590.e(dev.epro.r0.F12478849263529740365.b);
                    }
                    dev.epro.r0.I2076339260272013590 i20763392602720135902 = l9852841107405549527.d;
                    if (i20763392602720135902 != null) {
                        i20763392602720135902.f(dev.epro.r0.F12478849263529740365.b);
                    }
                }
                break;
            default:
                dev.epro.r0.N1420218926656397722 n1420218926656397722 = (dev.epro.r0.N1420218926656397722) obj;
                dev.epro.r0.J9879469284241532070 j9879469284241532070 = n1420218926656397722.a;
                j9879469284241532070.b.a().m();
                dev.epro.r0.F13711604687869105489 f13711604687869105489 = j9879469284241532070.b;
                f13711604687869105489.i = null;
                n1420218926656397722.l(f13711604687869105489);
                j9879469284241532070.b(true, dev.epro.r0.E1418573787900340271.a);
                j9879469284241532070.g(true);
                j9879469284241532070.f(j9879469284241532070.b.d);
                break;
        }
    }
}
