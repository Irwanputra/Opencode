package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final /* synthetic */ class Y14697639387223402373 implements B13729205492206812220 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ U830809347177809305 b;

    public /* synthetic */ Y14697639387223402373(U830809347177809305 u830809347177809305, byte b) {
        this.a = b;
        this.b = u830809347177809305;
    }

    @Override // dev.epro.r0.B13729205492206812220
    public final Object invoke() {
        byte b = this.a;
        U830809347177809305 u830809347177809305 = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(u830809347177809305.n);
            default:
                J9638579967056948799 j9638579967056948799 = u830809347177809305.T;
                if (!j9638579967056948799.a.n) {
                    return null;
                }
                H12838525957287096428 m1 = j9638579967056948799.m1();
                if (!m1.a()) {
                    return null;
                }
                if (m1.b()) {
                    return j9638579967056948799.k1(null);
                }
                J9638579967056948799 g = ((D10236220797215130727) ((S7974369370986781936) R7033599853981556291.S(j9638579967056948799)).getFocusOwner()).g();
                if (g != null) {
                    return g.k1(R7033599853981556291.Q(j9638579967056948799));
                }
                return null;
        }
    }
}
