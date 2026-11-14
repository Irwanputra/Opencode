package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class M5980882708956876187 implements F4096073349764486348 {
    public final /* synthetic */ J9638579967056948799 a;
    public final /* synthetic */ J9638579967056948799 b;
    public final /* synthetic */ J9638579967056948799 c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ C2148711509933735908 e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ M5980882708956876187(J9638579967056948799 j9638579967056948799, J9638579967056948799 j96385799670569487992, J9638579967056948799 j96385799670569487993, int i, C2148711509933735908 c2148711509933735908) {
        this.a = j9638579967056948799;
        this.b = j96385799670569487992;
        this.c = j96385799670569487993;
        this.d = i;
        this.e = c2148711509933735908;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        C4125819955810785567 c4125819955810785567 = (C4125819955810785567) obj;
        J9638579967056948799 j9638579967056948799 = this.b;
        if (this.a != ((D10236220797215130727) ((S7974369370986781936) R7033599853981556291.S(j9638579967056948799)).getFocusOwner()).g()) {
            return Boolean.TRUE;
        }
        boolean zN = U16229988784104357932.N(j9638579967056948799, this.c, this.d, this.e);
        Boolean boolValueOf = Boolean.valueOf(zN);
        if (zN || !c4125819955810785567.a()) {
            return boolValueOf;
        }
        return null;
    }
}
