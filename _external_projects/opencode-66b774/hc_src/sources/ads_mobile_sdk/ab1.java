package ads_mobile_sdk;

import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.N340633841638932414;
import dev.epro.r0.O2161699089510411363;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.P2480554073835519965;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ab1 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ fb1 a;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ab1(fb1 fb1Var, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.a = fb1Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        fb1 fb1Var = this.a;
        switch (b) {
            case 0:
                return new ab1(fb1Var, r4833348786910499294, (byte) 0);
            default:
                return new ab1(fb1Var, r4833348786910499294, (byte) 1);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        fb1 fb1Var = this.a;
        switch (b) {
            case 0:
                new ab1(fb1Var, (R4833348786910499294) obj2, (byte) 0).invokeSuspend(o9245300239821758723);
                break;
            default:
                new ab1(fb1Var, (R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
                break;
        }
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = 3;
        switch (this.t) {
            case 0:
                E17665849472693074628.k(obj);
                qa1 qa1Var = this.a.h.b;
                if (qa1Var != null) {
                    qa1Var.a = (byte) 3;
                    pa1 pa1Var = qa1Var.e;
                    if (pa1Var != null) {
                        qa1Var.b.unbindService(pa1Var);
                        qa1Var.e = null;
                    }
                    qa1Var.d = null;
                }
                return O9245300239821758723.a;
            default:
                O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
                E17665849472693074628.k(obj);
                fb1 fb1Var = this.a;
                kz2 kz2Var = fb1Var.g;
                wv0 wv0Var = wv0.CUI_NAME_INSTALL_REFERRER_TASK;
                O2161699089510411363 o2161699089510411363 = O2161699089510411363.a;
                mi3 mi3Var = new mi3(new ur2(), new fh1(), new tu2(), new s8());
                if (ji3.b().a == null) {
                    em2 a = kz2.a(kz2Var, wv0Var, o2161699089510411363, mi3Var);
                    try {
                        fb1Var.h.a(new c7(fb1Var, b));
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
                        fb1Var.h.a(new c7(fb1Var, b));
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
                return o9245300239821758723;
        }
    }
}
