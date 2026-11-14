package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class V2087615200957871918 implements F4096073349764486348 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ F4096073349764486348 b;

    public /* synthetic */ V2087615200957871918(F4096073349764486348 f4096073349764486348, byte b) {
        this.a = b;
        this.b = f4096073349764486348;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        long j;
        switch (this.a) {
            case 0:
                D7201182503133677242 d7201182503133677242 = (D7201182503133677242) obj;
                synchronized (D459204867321966484.c) {
                    j = D459204867321966484.e;
                    D459204867321966484.e = 1 + j;
                }
                return new V9195456372009046162(j, d7201182503133677242, this.b);
            default:
                return this.b.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
        }
    }
}
