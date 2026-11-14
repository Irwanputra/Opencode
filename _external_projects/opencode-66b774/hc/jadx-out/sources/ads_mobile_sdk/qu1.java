package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.internal.webview.PerAdNativeJavscriptEngineJsContext;
import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.X16599180054040010357;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class qu1 extends K14749510448791472029 {
    public su1 a;
    public X16599180054040010357 b;
    public PerAdNativeJavscriptEngineJsContext c;
    public /* synthetic */ Object d;
    public final /* synthetic */ su1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu1(su1 su1Var, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.e = su1Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return su1.a(this.e, this);
    }
}
