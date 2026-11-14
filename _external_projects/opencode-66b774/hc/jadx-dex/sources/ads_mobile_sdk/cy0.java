package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class cy0 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public boolean a;
    public final /* synthetic */ ads_mobile_sdk.iy0 b;
    public final /* synthetic */ android.net.Uri c;
    public final /* synthetic */ android.webkit.WebResourceRequest d;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cy0(android.net.Uri uri, android.webkit.WebResourceRequest webResourceRequest, ads_mobile_sdk.iy0 iy0Var, dev.epro.r0.R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.b = iy0Var;
        this.c = uri;
        this.d = webResourceRequest;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        switch (this.t) {
            case 0:
                return new ads_mobile_sdk.cy0(this.c, this.d, this.b, r4833348786910499294, (byte) 0);
            default:
                return new ads_mobile_sdk.cy0(this.c, this.d, this.b, r4833348786910499294, (byte) 1);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        switch (b) {
            case 0:
                return create((dev.epro.r0.R4833348786910499294) obj2, (dev.epro.r0.W5797197595347441198) obj).invokeSuspend(o9245300239821758723);
            default:
                return create((dev.epro.r0.R4833348786910499294) obj2, (dev.epro.r0.W5797197595347441198) obj).invokeSuspend(o9245300239821758723);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        switch (this.t) {
            case 0:
                dev.epro.r0.Z3437138737604933638 z3437138737604933638 = dev.epro.r0.Z3437138737604933638.a;
                boolean z = this.a;
                if (!z) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    ads_mobile_sdk.z03 z03Var = this.b.u;
                    if (z03Var != null) {
                        java.lang.String string = this.c.toString();
                        string.getClass();
                        dev.epro.r0.X9852054718446117252 requestHeaders = this.d.getRequestHeaders();
                        if (requestHeaders == null) {
                            requestHeaders = dev.epro.r0.X9852054718446117252.a;
                        }
                        this.a = true;
                        if (ads_mobile_sdk.z03.a(z03Var, string, 2, requestHeaders, this) == z3437138737604933638) {
                            return z3437138737604933638;
                        }
                    }
                } else {
                    if (!z) {
                        dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                return dev.epro.r0.O9245300239821758723.a;
            default:
                dev.epro.r0.Z3437138737604933638 z34371387376049336382 = dev.epro.r0.Z3437138737604933638.a;
                boolean z2 = this.a;
                try {
                    if (!z2) {
                        dev.epro.r0.E17665849472693074628.k(obj);
                        ads_mobile_sdk.zs3 zs3Var = this.b.r;
                        if (zs3Var == null) {
                            return null;
                        }
                        android.webkit.WebResourceRequest webResourceRequest = this.d;
                        this.a = true;
                        obj = zs3Var.a(webResourceRequest, this);
                        if (obj == z34371387376049336382) {
                            return z34371387376049336382;
                        }
                    } else {
                        if (!z2) {
                            dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        dev.epro.r0.E17665849472693074628.k(obj);
                    }
                    return (android.webkit.WebResourceResponse) obj;
                } catch (java.lang.Exception e) {
                    ads_mobile_sdk.xv.c("Failed to intercept request using WebViewFirebaseAnalyticsEventsHandler: " + this.c, e);
                    return null;
                }
        }
    }
}
