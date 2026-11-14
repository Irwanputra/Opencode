package ads_mobile_sdk;

import dev.epro.r0.B8427392651679410143;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class yx1 implements B8427392651679410143 {
    public final rg0 a;
    public final /* synthetic */ byte b;

    public /* synthetic */ yx1(rg0 rg0Var, byte b) {
        this.b = b;
        this.a = rg0Var;
    }

    @Override // dev.epro.r0.V2597580950516131749
    public final Object get() {
        switch (this.b) {
            case 0:
                return new xx1((y2) this.a.get());
            default:
                return new ie3((w81) this.a.get(), (byte) 2);
        }
    }
}
