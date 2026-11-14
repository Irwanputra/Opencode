package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D8340673431449205037 extends dev.epro.r0.P9893650590651797888 implements dev.epro.r0.F4096073349764486348 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ dev.epro.r0.H8745424616867554108 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D8340673431449205037(dev.epro.r0.H8745424616867554108 h8745424616867554108, byte b) {
        super(1);
        this.i = b;
        this.j = h8745424616867554108;
    }

    public final java.lang.Object invoke(java.lang.Object obj) {
        byte b = this.i;
        dev.epro.r0.H8745424616867554108 h8745424616867554108 = this.j;
        switch (b) {
            case 0:
                return java.lang.Double.valueOf(h8745424616867554108.n.g(dev.epro.r0.W7808703833045379622.o(((java.lang.Number) obj).doubleValue(), h8745424616867554108.e, h8745424616867554108.f)));
            default:
                return java.lang.Double.valueOf(dev.epro.r0.W7808703833045379622.o(h8745424616867554108.k.g(((java.lang.Number) obj).doubleValue()), h8745424616867554108.e, h8745424616867554108.f));
        }
    }
}
