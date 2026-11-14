package ads_mobile_sdk;

import android.webkit.WebView;
import dev.epro.r0.B13729205492206812220;
import dev.epro.r0.P9893650590651797888;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class j52 extends P9893650590651797888 implements B13729205492206812220 {
    public final /* synthetic */ x52 a;
    public final /* synthetic */ WebView b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j52(x52 x52Var, WebView webView, boolean z) {
        super(0);
        this.a = x52Var;
        this.b = webView;
        this.c = z;
    }

    @Override // dev.epro.r0.B13729205492206812220
    public final Object invoke() {
        return new dj1(this.a.j, this.b, this.c);
    }
}
