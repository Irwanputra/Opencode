package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.internal.webview.PerAdNativeJavscriptEngineJsContext;
import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.Y4798753258822141670;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class sb2 extends K14749510448791472029 {
    public PerAdNativeJavscriptEngineJsContext a;
    public String b;
    public Y4798753258822141670 c;
    public H15186625828076266306 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ PerAdNativeJavscriptEngineJsContext f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb2(PerAdNativeJavscriptEngineJsContext perAdNativeJavscriptEngineJsContext, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.f = perAdNativeJavscriptEngineJsContext;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a((String) null, (Y4798753258822141670) null, this);
    }
}
