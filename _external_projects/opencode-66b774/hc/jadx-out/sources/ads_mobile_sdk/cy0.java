package ads_mobile_sdk;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.X9852054718446117252;
import dev.epro.r0.Z3437138737604933638;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class cy0 extends R14062301455140331524 implements L12639328004344855510 {
    public boolean a;
    public final /* synthetic */ iy0 b;
    public final /* synthetic */ Uri c;
    public final /* synthetic */ WebResourceRequest d;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cy0(Uri uri, WebResourceRequest webResourceRequest, iy0 iy0Var, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.b = iy0Var;
        this.c = uri;
        this.d = webResourceRequest;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        switch (this.t) {
            case 0:
                return new cy0(this.c, this.d, this.b, r4833348786910499294, (byte) 0);
            default:
                return new cy0(this.c, this.d, this.b, r4833348786910499294, (byte) 1);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                return ((cy0) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            default:
                return ((cy0) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        switch (this.t) {
            case 0:
                Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
                boolean z = this.a;
                if (!z) {
                    E17665849472693074628.k(obj);
                    z03 z03Var = this.b.u;
                    if (z03Var != null) {
                        String string = this.c.toString();
                        string.getClass();
                        Map<String, String> requestHeaders = this.d.getRequestHeaders();
                        if (requestHeaders == null) {
                            requestHeaders = X9852054718446117252.a;
                        }
                        this.a = true;
                        if (z03.a(z03Var, string, 2, requestHeaders, this) == z3437138737604933638) {
                            return z3437138737604933638;
                        }
                    }
                } else {
                    if (!z) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return O9245300239821758723.a;
            default:
                Z3437138737604933638 z34371387376049336382 = Z3437138737604933638.a;
                boolean z2 = this.a;
                try {
                    if (!z2) {
                        E17665849472693074628.k(obj);
                        zs3 zs3Var = this.b.r;
                        if (zs3Var == null) {
                            return null;
                        }
                        WebResourceRequest webResourceRequest = this.d;
                        this.a = true;
                        obj = zs3Var.a(webResourceRequest, this);
                        if (obj == z34371387376049336382) {
                            return z34371387376049336382;
                        }
                    } else {
                        if (!z2) {
                            S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        E17665849472693074628.k(obj);
                    }
                    return (WebResourceResponse) obj;
                } catch (Exception e) {
                    xv.c("Failed to intercept request using WebViewFirebaseAnalyticsEventsHandler: " + this.c, e);
                    return null;
                }
        }
    }
}
