package ads_mobile_sdk;

import androidx.webkit.Profile;
import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.K5751602218013079365;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R9411874267597469228;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class hr3 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ Profile a;
    public final /* synthetic */ bs3 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hr3(Profile profile, bs3 bs3Var, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.a = profile;
        this.b = bs3Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        Profile profile = this.a;
        bs3 bs3Var = this.b;
        switch (b) {
            case 0:
                return new hr3(profile, bs3Var, r4833348786910499294, (byte) 0);
            default:
                return new hr3(profile, bs3Var, r4833348786910499294, (byte) 1);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Profile profile = this.a;
        bs3 bs3Var = this.b;
        switch (b) {
            case 0:
                new hr3(profile, bs3Var, (R4833348786910499294) obj2, (byte) 0).invokeSuspend(o9245300239821758723);
                break;
            default:
                new hr3(profile, bs3Var, (R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
                break;
        }
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Profile profile = this.a;
        bs3 bs3Var = this.b;
        switch (b) {
            case 0:
                E17665849472693074628.k(obj);
                AtomicBoolean atomicBoolean = lp3.a;
                jr0 jr0Var = bs3Var.c;
                jr0Var.getClass();
                Set<String> setH1 = R9411874267597469228.h1((List) jr0Var.a("gads:webview_quic_hints_domain_list", K5751602218013079365.V("https://fonts.googleapis.com", "https://googleads.g.doubleclick.net", "https://lh3.googleusercontent.com", "https://pagead2.googlesyndication.com", "https://pubads.g.doubleclick.net", "https://redirector.gvt1.com", "https://redirector.gvt1-cn.com", "https://static.doubleclick.net", "https://s0.2mdn.net", "https://s1.2mdn.net", "https://tpc.googlesyndication.com", "https://www.googletagservices.com", "https://www.gstatic.com"), ao.a$23));
                profile.getClass();
                if (lp3.b.get()) {
                    try {
                        profile.addQuicHints(setH1);
                    } catch (Throwable unused) {
                        lp3.b.set(false);
                    }
                }
                break;
            default:
                E17665849472693074628.k(obj);
                jr0 jr0Var2 = bs3Var.c;
                jr0Var2.getClass();
                for (String str : (List) jr0Var2.a("gads:webview_preconnect_domain_list", K5751602218013079365.V("https://fonts.googleapis.com", "https://googleads.g.doubleclick.net", "https://lh3.googleusercontent.com", "https://pagead2.googlesyndication.com", "https://pubads.g.doubleclick.net", "https://redirector.gvt1.com", "https://redirector.gvt1-cn.com", "https://static.doubleclick.net", "https://s0.2mdn.net", "https://s1.2mdn.net", "https://tpc.googlesyndication.com", "https://www.googletagservices.com", "https://www.gstatic.com"), ao.a$23)) {
                    AtomicBoolean atomicBoolean2 = lp3.a;
                    profile.getClass();
                    str.getClass();
                    if (lp3.c.get()) {
                        try {
                            profile.preconnect(str);
                        } catch (Throwable unused2) {
                            lp3.c.set(false);
                        }
                    }
                }
                break;
        }
        return o9245300239821758723;
        return o9245300239821758723;
    }
}
