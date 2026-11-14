package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class f01 implements dev.epro.r0.B18329032920392634747 {
    public final /* synthetic */ dev.epro.r0.H7219028874700587498 a;
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean b;

    public /* synthetic */ f01(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, dev.epro.r0.H7219028874700587498 h7219028874700587498) {
        this.a = h7219028874700587498;
        this.b = atomicBoolean;
    }

    public void a(dev.epro.r0.T7225292889360033468 t7225292889360033468) {
        if (this.b.getAndSet(true)) {
            return;
        }
        this.a.resumeWith(new ads_mobile_sdk.su0(new dev.epro.r0.S12306309242770307923(7, t7225292889360033468.a, "com.google.android.libraries.ads.mobile.sdk")));
    }

    @Override // dev.epro.r0.B18329032920392634747
    public void onDismissed(android.os.Bundle bundle) {
        dev.epro.r0.H7219028874700587498 h7219028874700587498 = this.a;
        if ((h7219028874700587498.s() instanceof dev.epro.r0.B9271643986061518267) && this.b.compareAndSet(false, true)) {
            h7219028874700587498.resumeWith(dev.epro.r0.O9245300239821758723.a);
        }
    }

    @Override // dev.epro.r0.B18329032920392634747
    public void onError(android.os.Bundle bundle) {
        dev.epro.r0.H7219028874700587498 h7219028874700587498 = this.a;
        if ((h7219028874700587498.s() instanceof dev.epro.r0.B9271643986061518267) && this.b.compareAndSet(false, true)) {
            h7219028874700587498.resumeWith(new dev.epro.r0.C10696704014433963524(new java.lang.Exception("HSDP open failed: " + bundle)));
        }
    }

    @Override // dev.epro.r0.B18329032920392634747
    public void onShown(android.os.Bundle bundle) {
        dev.epro.r0.H7219028874700587498 h7219028874700587498 = this.a;
        if ((h7219028874700587498.s() instanceof dev.epro.r0.B9271643986061518267) && this.b.compareAndSet(false, true)) {
            h7219028874700587498.resumeWith(dev.epro.r0.O9245300239821758723.a);
        }
    }
}
