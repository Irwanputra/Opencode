package dev.epro.r0;

import ads_mobile_sdk.ce1;
import ads_mobile_sdk.du0;
import ads_mobile_sdk.dv0;
import ads_mobile_sdk.em2;
import ads_mobile_sdk.fh1;
import ads_mobile_sdk.iu0;
import ads_mobile_sdk.ji3;
import ads_mobile_sdk.kz2;
import ads_mobile_sdk.ln3;
import ads_mobile_sdk.lw0;
import ads_mobile_sdk.mi3;
import ads_mobile_sdk.rq2;
import ads_mobile_sdk.s8;
import ads_mobile_sdk.th3;
import ads_mobile_sdk.tu2;
import ads_mobile_sdk.ur2;
import ads_mobile_sdk.wv0;
import android.webkit.WebSettings;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class R1658400117202917865 extends R14062301455140331524 implements F4096073349764486348 {
    public final /* synthetic */ byte t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ R1658400117202917865(Object obj, Object obj2, R4833348786910499294 r4833348786910499294, byte b) {
        super(1, r4833348786910499294);
        this.t = b;
        this.u = obj;
        this.v = obj2;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Object obj2 = this.v;
        Object obj3 = this.u;
        switch (b) {
            case 0:
                new R1658400117202917865((U16834965109098959004) obj3, obj2, (R4833348786910499294) obj, (byte) 0).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 1:
                return new R1658400117202917865((ln3) obj3, (W5797197595347441198) obj2, (R4833348786910499294) obj, (byte) 1).invokeSuspend(o9245300239821758723);
            default:
                new R1658400117202917865((rq2) obj3, (D1237992311186098541) obj2, (R4833348786910499294) obj, (byte) 2).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        String defaultUserAgent;
        switch (this.t) {
            case 0:
                E17665849472693074628.k(obj);
                U16834965109098959004 u16834965109098959004 = (U16834965109098959004) this.u;
                u16834965109098959004.c();
                Object b = u16834965109098959004.b(this.v);
                u16834965109098959004.c.b.setValue(b);
                u16834965109098959004.e.setValue(b);
                return O9245300239821758723.a;
            case 1:
                E17665849472693074628.k(obj);
                try {
                    ln3 ln3Var = (ln3) this.u;
                    kz2 kz2Var = ln3Var.f;
                    R4833348786910499294 r4833348786910499294 = null;
                    if (kz2Var == null) {
                        S10823041268949770285.b0("rootTraceCreator");
                        throw null;
                    }
                    wv0 wv0Var = wv0.CUI_NAME_WEBVIEW_USER_AGENT;
                    O2161699089510411363 o2161699089510411363 = O2161699089510411363.a;
                    mi3 mi3Var = new mi3(new ur2(), new fh1(), new tu2(), new s8());
                    byte b2 = 1;
                    if (ji3.b().a == null) {
                        em2 a = kz2.a(kz2Var, wv0Var, o2161699089510411363, mi3Var);
                        try {
                            defaultUserAgent = WebSettings.getDefaultUserAgent(ln3Var.a);
                            a.close();
                        } catch (Throwable th) {
                            try {
                                a.b(th);
                                if (th instanceof N340633841638932414) {
                                    throw th;
                                }
                                if (!(th instanceof P2480554073835519965) && !(th instanceof CancellationException)) {
                                    a.a(th);
                                }
                                if (th instanceof P2480554073835519965) {
                                    throw new lw0(th);
                                }
                                if (th instanceof CancellationException) {
                                    throw new du0(th);
                                }
                                if (th instanceof dv0) {
                                    throw th;
                                }
                                throw new iu0(th);
                            } finally {
                            }
                        }
                    } else {
                        th3 a2 = ji3.a(wv0Var, o2161699089510411363, true);
                        try {
                            defaultUserAgent = WebSettings.getDefaultUserAgent(ln3Var.a);
                            a2.close();
                        } catch (Throwable th2) {
                            try {
                                a2.b(th2);
                                if (th2 instanceof N340633841638932414) {
                                    throw th2;
                                }
                                if (!(th2 instanceof P2480554073835519965) && !(th2 instanceof CancellationException)) {
                                    a2.a(th2);
                                }
                                if (th2 instanceof P2480554073835519965) {
                                    throw new lw0(th2);
                                }
                                if (th2 instanceof CancellationException) {
                                    throw new du0(th2);
                                }
                                if (th2 instanceof dv0) {
                                    throw th2;
                                }
                                throw new iu0(th2);
                            } finally {
                            }
                        }
                    }
                    ((ln3) this.u).i.f0();
                    R7033599853981556291.E((W5797197595347441198) this.v, I3826119971291161142.a, null, new P7598478828797568949(new I5566604416186847280((ln3) this.u, defaultUserAgent, r4833348786910499294, b2), r4833348786910499294, b2), 2);
                    return defaultUserAgent;
                } catch (Throwable th3) {
                    ((ln3) this.u).i.f0();
                    throw th3;
                }
            default:
                E17665849472693074628.k(obj);
                ((rq2) this.u).a(new ce1((D1237992311186098541) this.v));
                return O9245300239821758723.a;
        }
    }
}
