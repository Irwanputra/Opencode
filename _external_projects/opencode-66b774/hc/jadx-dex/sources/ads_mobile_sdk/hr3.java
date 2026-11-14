package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class hr3 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public final /* synthetic */ androidx.webkit.Profile a;
    public final /* synthetic */ ads_mobile_sdk.bs3 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hr3(androidx.webkit.Profile profile, ads_mobile_sdk.bs3 bs3Var, dev.epro.r0.R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.a = profile;
        this.b = bs3Var;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        byte b = this.t;
        androidx.webkit.Profile profile = this.a;
        ads_mobile_sdk.bs3 bs3Var = this.b;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.hr3(profile, bs3Var, r4833348786910499294, (byte) 0);
            default:
                return new ads_mobile_sdk.hr3(profile, bs3Var, r4833348786910499294, (byte) 1);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        androidx.webkit.Profile profile = this.a;
        ads_mobile_sdk.bs3 bs3Var = this.b;
        switch (b) {
            case 0:
                new ads_mobile_sdk.hr3(profile, bs3Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 0).invokeSuspend(o9245300239821758723);
                break;
            default:
                new ads_mobile_sdk.hr3(profile, bs3Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
                break;
        }
        return o9245300239821758723;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        androidx.webkit.Profile profile = this.a;
        ads_mobile_sdk.bs3 bs3Var = this.b;
        switch (b) {
            case 0:
                dev.epro.r0.E17665849472693074628.k(obj);
                java.util.concurrent.atomic.AtomicBoolean atomicBoolean = ads_mobile_sdk.lp3.a;
                ads_mobile_sdk.jr0 jr0Var = bs3Var.c;
                jr0Var.getClass();
                java.util.Set<java.lang.String> setH1 = dev.epro.r0.R9411874267597469228.h1((java.util.List) jr0Var.a("gads:webview_quic_hints_domain_list", dev.epro.r0.K5751602218013079365.V(new java.lang.String[]{"https://fonts.googleapis.com", "https://googleads.g.doubleclick.net", "https://lh3.googleusercontent.com", "https://pagead2.googlesyndication.com", "https://pubads.g.doubleclick.net", "https://redirector.gvt1.com", "https://redirector.gvt1-cn.com", "https://static.doubleclick.net", "https://s0.2mdn.net", "https://s1.2mdn.net", "https://tpc.googlesyndication.com", "https://www.googletagservices.com", "https://www.gstatic.com"}), ads_mobile_sdk.ao.a$23));
                profile.getClass();
                if (ads_mobile_sdk.lp3.b.get()) {
                    try {
                        profile.addQuicHints(setH1);
                    } catch (java.lang.Throwable unused) {
                        ads_mobile_sdk.lp3.b.set(false);
                    }
                }
                break;
            default:
                dev.epro.r0.E17665849472693074628.k(obj);
                ads_mobile_sdk.jr0 jr0Var2 = bs3Var.c;
                jr0Var2.getClass();
                for (java.lang.String str : (java.util.List) jr0Var2.a("gads:webview_preconnect_domain_list", dev.epro.r0.K5751602218013079365.V(new java.lang.String[]{"https://fonts.googleapis.com", "https://googleads.g.doubleclick.net", "https://lh3.googleusercontent.com", "https://pagead2.googlesyndication.com", "https://pubads.g.doubleclick.net", "https://redirector.gvt1.com", "https://redirector.gvt1-cn.com", "https://static.doubleclick.net", "https://s0.2mdn.net", "https://s1.2mdn.net", "https://tpc.googlesyndication.com", "https://www.googletagservices.com", "https://www.gstatic.com"}), ads_mobile_sdk.ao.a$23)) {
                    java.util.concurrent.atomic.AtomicBoolean atomicBoolean2 = ads_mobile_sdk.lp3.a;
                    profile.getClass();
                    str.getClass();
                    if (ads_mobile_sdk.lp3.c.get()) {
                        try {
                            profile.preconnect(str);
                        } catch (java.lang.Throwable unused2) {
                            ads_mobile_sdk.lp3.c.set(false);
                        }
                    }
                }
                break;
        }
        return o9245300239821758723;
        return o9245300239821758723;
    }
}
