package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B14405503716495929962 extends R15896830329318850690 implements T975006071468260715 {

    /* renamed from: o, reason: collision with root package name */
    public F4096073349764486348 f168o;
    public long p;

    @Override // dev.epro.r0.R15896830329318850690
    public final boolean W0() {
        return true;
    }

    @Override // dev.epro.r0.T975006071468260715
    public final void d(long j) {
        if (Q13254524308163418711.a(this.p, j)) {
            return;
        }
        this.f168o.invoke(new Q13254524308163418711(j));
        this.p = j;
    }
}
