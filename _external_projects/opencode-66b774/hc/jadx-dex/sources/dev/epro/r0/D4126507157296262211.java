package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final /* synthetic */ class D4126507157296262211 implements dev.epro.r0.B13729205492206812220 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dev.epro.r0.A957273981459855795 b;

    public /* synthetic */ D4126507157296262211(dev.epro.r0.A957273981459855795 a957273981459855795, byte b) {
        this.a = b;
        this.b = a957273981459855795;
    }

    @Override // dev.epro.r0.B13729205492206812220
    public final java.lang.Object invoke() {
        byte b = this.a;
        dev.epro.r0.A957273981459855795 a957273981459855795 = this.b;
        switch (b) {
            case 0:
                java.util.concurrent.atomic.AtomicLong atomicLong = a957273981459855795.d;
                long andIncrement = atomicLong.getAndIncrement();
                while (andIncrement == 0) {
                    andIncrement = atomicLong.getAndIncrement();
                }
                return java.lang.Long.valueOf(andIncrement);
            default:
                java.util.concurrent.atomic.AtomicLong atomicLong2 = a957273981459855795.d;
                long andIncrement2 = atomicLong2.getAndIncrement();
                while (andIncrement2 == 0) {
                    andIncrement2 = atomicLong2.getAndIncrement();
                }
                return java.lang.Long.valueOf(andIncrement2);
        }
    }
}
