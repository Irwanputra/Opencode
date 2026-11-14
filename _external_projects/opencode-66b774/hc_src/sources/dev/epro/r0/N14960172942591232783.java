package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final /* synthetic */ class N14960172942591232783 implements B13729205492206812220 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ W3656598099029166611 b;

    public /* synthetic */ N14960172942591232783(W3656598099029166611 w3656598099029166611, byte b) {
        this.a = b;
        this.b = w3656598099029166611;
    }

    @Override // dev.epro.r0.B13729205492206812220
    public final Object invoke() {
        byte b = this.a;
        W3656598099029166611 w3656598099029166611 = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf((S10823041268949770285.t(w3656598099029166611.d.getValue(), w3656598099029166611.a.g()) && w3656598099029166611.h.g() == Long.MIN_VALUE && !((Boolean) w3656598099029166611.i.getValue()).booleanValue()) ? false : true);
            default:
                return Long.valueOf(w3656598099029166611.b());
        }
    }
}
