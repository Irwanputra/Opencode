package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O13658656158066560517 extends R15896830329318850690 implements T11401768751197276141 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f397o;
    public final boolean p;
    public F4096073349764486348 q;

    public O13658656158066560517(boolean z, boolean z2, F4096073349764486348 f4096073349764486348) {
        this.f397o = z;
        this.p = z2;
        this.q = f4096073349764486348;
    }

    @Override // dev.epro.r0.T11401768751197276141
    public final boolean B0() {
        return this.f397o;
    }

    @Override // dev.epro.r0.T11401768751197276141
    public final void V(S2460821117650695638 s2460821117650695638) {
        this.q.invoke(s2460821117650695638);
    }

    @Override // dev.epro.r0.T11401768751197276141
    public final boolean z0() {
        return this.p;
    }
}
