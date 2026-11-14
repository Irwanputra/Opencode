package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class V2489643616263664505 implements B13729205492206812220 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ W3656598099029166611 b;

    public /* synthetic */ V2489643616263664505(W3656598099029166611 w3656598099029166611, byte b) {
        this.a = b;
        this.b = w3656598099029166611;
    }

    @Override // dev.epro.r0.B13729205492206812220
    public final Object invoke() {
        byte b = this.a;
        W3656598099029166611 w3656598099029166611 = this.b;
        switch (b) {
            case 0:
                return w3656598099029166611.d.getValue();
            default:
                return w3656598099029166611.f();
        }
    }
}
