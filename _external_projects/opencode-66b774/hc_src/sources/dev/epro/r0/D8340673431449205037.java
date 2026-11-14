package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class D8340673431449205037 extends P9893650590651797888 implements F4096073349764486348 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ H8745424616867554108 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D8340673431449205037(H8745424616867554108 h8745424616867554108, byte b) {
        super(1);
        this.i = b;
        this.j = h8745424616867554108;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        byte b = this.i;
        H8745424616867554108 h8745424616867554108 = this.j;
        switch (b) {
            case 0:
                return Double.valueOf(h8745424616867554108.n.g(W7808703833045379622.o(((Number) obj).doubleValue(), h8745424616867554108.e, h8745424616867554108.f)));
            default:
                return Double.valueOf(W7808703833045379622.o(h8745424616867554108.k.g(((Number) obj).doubleValue()), h8745424616867554108.e, h8745424616867554108.f));
        }
    }
}
