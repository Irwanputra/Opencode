package dev.epro.r0;

import android.os.CancellationSignal;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final /* synthetic */ class B9951899438396776027 implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ B9951899438396776027(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((X7175349259954592591) obj).c(null);
                break;
            case 1:
                L9852841107405549527 l9852841107405549527 = (L9852841107405549527) obj;
                if (l9852841107405549527 != null) {
                    I2076339260272013590 i2076339260272013590 = l9852841107405549527.d;
                    if (i2076339260272013590 != null) {
                        i2076339260272013590.e(F12478849263529740365.b);
                    }
                    I2076339260272013590 i20763392602720135902 = l9852841107405549527.d;
                    if (i20763392602720135902 != null) {
                        i20763392602720135902.f(F12478849263529740365.b);
                        break;
                    }
                }
                break;
            default:
                N1420218926656397722 n1420218926656397722 = (N1420218926656397722) obj;
                J9879469284241532070 j9879469284241532070 = n1420218926656397722.a;
                j9879469284241532070.b.a().m();
                F13711604687869105489 f13711604687869105489 = j9879469284241532070.b;
                f13711604687869105489.i = null;
                n1420218926656397722.l(f13711604687869105489);
                j9879469284241532070.b(true, E1418573787900340271.a);
                j9879469284241532070.g(true);
                j9879469284241532070.f(j9879469284241532070.b.d);
                break;
        }
    }
}
