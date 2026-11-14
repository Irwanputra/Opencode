package dev.epro.r0;

import android.app.Application;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class V5098515201292188072 implements I3673563500665330592 {
    public final /* synthetic */ byte a;
    public final Z6787503239643758223 b;
    public final D9201356603168736774 c;

    public /* synthetic */ V5098515201292188072(Z6787503239643758223 z6787503239643758223, D9201356603168736774 d9201356603168736774, byte b) {
        this.a = b;
        this.b = z6787503239643758223;
        this.c = d9201356603168736774;
    }

    public F6353700998356592239 a() {
        return new F6353700998356592239((Application) this.b.a, (G5446205426701161097) this.c.h(), (byte) 10);
    }

    @Override // dev.epro.r0.I3673563500665330592
    public final Object h() {
        switch (this.a) {
            case 0:
                return new G2935865369088609399((Application) this.b.a, (U8736299657430423968) this.c.h());
            default:
                return a();
        }
    }
}
