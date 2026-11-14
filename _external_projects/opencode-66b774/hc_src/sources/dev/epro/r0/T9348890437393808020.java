package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class T9348890437393808020 extends R15896830329318850690 implements E1787814229672241378, F16971278462881137815, O10709431398915260868 {

    /* renamed from: o, reason: collision with root package name */
    public F1048562484897106753 f514o;
    public I2076339260272013590 p;
    public L9852841107405549527 q;
    public final V697849047308847220 r = V4416135141588678913.t(null);

    public T9348890437393808020(F1048562484897106753 f1048562484897106753, I2076339260272013590 i2076339260272013590, L9852841107405549527 l9852841107405549527) {
        this.f514o = f1048562484897106753;
        this.p = i2076339260272013590;
        this.q = l9852841107405549527;
    }

    @Override // dev.epro.r0.R15896830329318850690
    public final void Z0() {
        F1048562484897106753 f1048562484897106753 = this.f514o;
        if (f1048562484897106753.a != null) {
            Y16081827717826519461.c("Expected textInputModifierNode to be null");
        }
        f1048562484897106753.a = this;
    }

    @Override // dev.epro.r0.R15896830329318850690
    public final void a1() {
        this.f514o.k(this);
    }

    @Override // dev.epro.r0.O10709431398915260868
    public final void s0(Y4989033692226475498 y4989033692226475498) {
        this.r.setValue(y4989033692226475498);
    }
}
