package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class qo implements dev.epro.r0.B8669154544800329371 {
    public final java.lang.ref.WeakReference a;
    public final ads_mobile_sdk.g0 b;

    public qo(java.lang.ref.WeakReference weakReference, ads_mobile_sdk.g0 g0Var) {
        this.a = weakReference;
        this.b = g0Var;
    }

    @Override // dev.epro.r0.B8669154544800329371
    public final java.lang.Object b(long j, dev.epro.r0.R14062301455140331524 r14062301455140331524) {
        ads_mobile_sdk.uo uoVar = (ads_mobile_sdk.uo) this.a.get();
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        if (uoVar != null) {
            uoVar.b(j, r14062301455140331524);
            return o9245300239821758723;
        }
        this.b.a(this);
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.B8669154544800329371
    public final java.lang.Object d(long j, dev.epro.r0.R14062301455140331524 r14062301455140331524) {
        ads_mobile_sdk.uo uoVar = (ads_mobile_sdk.uo) this.a.get();
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        if (uoVar != null) {
            uoVar.d(j, r14062301455140331524);
            return o9245300239821758723;
        }
        this.b.a(this);
        return o9245300239821758723;
    }
}
