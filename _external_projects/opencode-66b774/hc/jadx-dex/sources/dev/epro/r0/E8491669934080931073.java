package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E8491669934080931073 implements dev.epro.r0.J12078565427869724451 {
    public final /* synthetic */ int a;

    public E8491669934080931073(int i) {
        this.a = i;
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        dev.epro.r0.H8673207839164499646 h8673207839164499646 = (dev.epro.r0.H8673207839164499646) obj;
        dev.epro.r0.M3727281027331139839 m3727281027331139839 = (dev.epro.r0.M3727281027331139839) obj2;
        int iIntValue = ((java.lang.Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? m3727281027331139839.f(h8673207839164499646) : m3727281027331139839.h(h8673207839164499646) ? 4 : 2;
        }
        if (m3727281027331139839.R(iIntValue & 1, (iIntValue & 19) != 18)) {
            dev.epro.r0.T13350664027331345869 t13350664027331345869 = dev.epro.r0.T13350664027331345869.E;
            h8673207839164499646.getClass();
            t13350664027331345869.j(new dev.epro.r0.V17032896535665530457(h8673207839164499646.a, this.a, h8673207839164499646.b), 0.0f, 0L, m3727281027331139839, 3072, 6);
        } else {
            m3727281027331139839.U();
        }
        return dev.epro.r0.O9245300239821758723.a;
    }
}
