package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class O3222469587018325292 implements S7864201625552763331 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ D2717688760023469083 b;

    public /* synthetic */ O3222469587018325292(D2717688760023469083 d2717688760023469083, byte b) {
        this.a = b;
        this.b = d2717688760023469083;
    }

    @Override // dev.epro.r0.S7864201625552763331
    public final Object emit(Object obj, R4833348786910499294 r4833348786910499294) {
        X7175349259954592591 x7175349259954592591;
        byte b = this.a;
        D2717688760023469083 d2717688760023469083 = this.b;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                d2717688760023469083.w(false);
                d2717688760023469083.x(S5779100572589057142.a);
                break;
            default:
                if (((S6349823729575121924) obj) == null) {
                    J8749144669333390587 j8749144669333390587 = d2717688760023469083.d.a;
                    if (j8749144669333390587 != null && (x7175349259954592591 = j8749144669333390587.u) != null) {
                        x7175349259954592591.c(null);
                        j8749144669333390587.u = null;
                        break;
                    }
                } else {
                    d2717688760023469083.d.a();
                    break;
                }
                break;
        }
        return o9245300239821758723;
    }
}
