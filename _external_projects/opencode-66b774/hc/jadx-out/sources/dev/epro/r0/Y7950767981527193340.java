package dev.epro.r0;

import ads_mobile_sdk.a63;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Y7950767981527193340 implements W6764693637816104089 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a63 b;

    public /* synthetic */ Y7950767981527193340(a63 a63Var, byte b) {
        this.a = b;
        this.b = a63Var;
    }

    @Override // dev.epro.r0.W6764693637816104089
    public final Object apply(Object obj) {
        byte b = this.a;
        a63 a63Var = this.b;
        byte[] bArr = (byte[]) obj;
        switch (b) {
            case 0:
                a63Var.a(new Q6203700555324584864((byte) 1), bArr, false);
                break;
            default:
                a63Var.a(new Q6203700555324584864((byte) 1), bArr, true);
                break;
        }
        return null;
    }
}
