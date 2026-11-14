package ads_mobile_sdk;

import android.app.Application;
import android.content.Context;
import android.view.View;
import dev.epro.r0.B13729205492206812220;
import dev.epro.r0.B6030175592171028728;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.K15572083692188606544;
import dev.epro.r0.K5751602218013079365;
import dev.epro.r0.N340633841638932414;
import dev.epro.r0.O2161699089510411363;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.P16422848101170923038;
import dev.epro.r0.P2480554073835519965;
import dev.epro.r0.P9893650590651797888;
import dev.epro.r0.Q9282725956684299602;
import dev.epro.r0.U10597134596418829392;
import dev.epro.r0.V7496420559085948492;
import dev.epro.r0.X11644140690951955496;
import dev.epro.r0.Z1953481206310471956;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class eu0 extends P9893650590651797888 implements B13729205492206812220 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eu0(Object obj, Object obj2, byte b) {
        super(0);
        this.i = b;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Finally extract failed */
    @Override // dev.epro.r0.B13729205492206812220
    public final Object invoke() {
        byte b = this.i;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Object obj = this.b;
        Object obj2 = this.a;
        switch (b) {
            case 0:
                hb1 hb1Var = U10597134596418829392.a;
                Application application = (Application) obj;
                return new db0(application, application, new WeakReference((Context) obj2));
            case 1:
                dj1 dj1Var = (dj1) obj2;
                V7496420559085948492 v7496420559085948492 = (V7496420559085948492) obj;
                Iterator it = dj1Var.e.values().iterator();
                while (it.hasNext()) {
                    ((m6) it.next()).a();
                }
                Timer timer = new Timer();
                timer.schedule(new bj1(dj1Var, v7496420559085948492, timer), 1000L);
                return o9245300239821758723;
            case 2:
                ((m6) obj2).a((View) obj);
                return o9245300239821758723;
            default:
                I16631908410500040363 i16631908410500040363 = (I16631908410500040363) obj2;
                X11644140690951955496 x11644140690951955496 = (X11644140690951955496) obj;
                th3 th3VarA = ji3.a(wv0.CUI_NAME_ADREQUEST_PARSERESPONSE, O2161699089510411363.a, true);
                try {
                    P16422848101170923038 p16422848101170923038X = i16631908410500040363.x("responses");
                    int i = 0;
                    I16631908410500040363 i16631908410500040363L = !p16422848101170923038X.a.isEmpty() ? ((K15572083692188606544) p16422848101170923038X.a.get(0)).l() : null;
                    P16422848101170923038 p16422848101170923038X2 = i16631908410500040363L != null ? i16631908410500040363L.x("ad_configs") : null;
                    ArrayList arrayList = new ArrayList();
                    if (p16422848101170923038X2 != null) {
                        ArrayList arrayList2 = p16422848101170923038X2.a;
                        int size = arrayList2.size();
                        int i2 = 0;
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj3 = arrayList2.get(i3);
                            i3++;
                            int i4 = i2 + 1;
                            if (i2 < 0) {
                                K5751602218013079365.f0();
                                throw null;
                            }
                            K15572083692188606544 k15572083692188606544 = (K15572083692188606544) obj3;
                            k15572083692188606544.getClass();
                            List list = z1.D0;
                            z1 z1VarG = B6030175592171028728.g(k15572083692188606544.l(), i2, x11644140690951955496);
                            if (z1VarG != null) {
                                arrayList.add(z1VarG);
                            }
                            i2 = i4;
                        }
                    }
                    hv hvVarF = B6030175592171028728.f(i16631908410500040363L != null ? i16631908410500040363L.y("common") : null);
                    K15572083692188606544 k15572083692188606544W = i16631908410500040363.w("actions");
                    P16422848101170923038 p16422848101170923038K = k15572083692188606544W != null ? k15572083692188606544W.k() : null;
                    ArrayList arrayList3 = new ArrayList();
                    if (p16422848101170923038K != null) {
                        ArrayList arrayList4 = p16422848101170923038K.a;
                        int size2 = arrayList4.size();
                        int i5 = 0;
                        while (i5 < size2) {
                            Object obj4 = arrayList4.get(i5);
                            i5++;
                            int i6 = i + 1;
                            if (i < 0) {
                                K5751602218013079365.f0();
                                throw null;
                            }
                            K15572083692188606544 k155720836921886065442 = (K15572083692188606544) obj4;
                            k155720836921886065442.getClass();
                            x23 x23VarD = Q9282725956684299602.d(k155720836921886065442.l());
                            if (x23VarD != null) {
                                arrayList3.add(x23VarD);
                            }
                            i = i6;
                        }
                    }
                    z23 z23Var = new z23(arrayList, hvVarF, arrayList3);
                    th3VarA.close();
                    return z23Var;
                } catch (Throwable th) {
                    try {
                        th3VarA.b(th);
                        if (th instanceof N340633841638932414) {
                            throw th;
                        }
                        if (!(th instanceof P2480554073835519965) && !(th instanceof CancellationException)) {
                            th3VarA.a(th);
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
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            Z1953481206310471956.z(th3VarA, th2);
                            throw th3;
                        }
                    }
                }
        }
    }
}
