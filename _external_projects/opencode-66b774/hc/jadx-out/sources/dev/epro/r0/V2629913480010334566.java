package dev.epro.r0;

import android.app.Application;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class V2629913480010334566 implements I3673563500665330592 {
    public final /* synthetic */ byte a;
    public final Z6787503239643758223 b;

    public /* synthetic */ V2629913480010334566(Z6787503239643758223 z6787503239643758223, byte b) {
        this.a = b;
        this.b = z6787503239643758223;
    }

    @Override // dev.epro.r0.I3673563500665330592
    public final Object h() {
        byte b = this.a;
        Z6787503239643758223 z6787503239643758223 = this.b;
        switch (b) {
            case 0:
                return new U8736299657430423968((Application) z6787503239643758223.a);
            case 1:
                return new G5446205426701161097((Application) z6787503239643758223.a);
            default:
                return new D6285004323073107982((Application) z6787503239643758223.a);
        }
    }
}
