package ads_mobile_sdk;

import dev.epro.r0.I3887072968740112330;
import dev.epro.r0.N340633841638932414;
import dev.epro.r0.O2161699089510411363;
import dev.epro.r0.P2480554073835519965;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class h80 extends I3887072968740112330 {
    public final /* synthetic */ i80 a;

    public h80(i80 i80Var) {
        this.a = i80Var;
    }

    @Override // dev.epro.r0.I3887072968740112330
    public final void onNavigationEvent(int i) {
        kz2 kz2Var = this.a.c;
        wv0 wv0Var = wv0.CUI_NAME_CUSTOM_TABS_NAVIGATION_EVENT;
        mi3 mi3Var = new mi3(new ur2(), new fh1(), new tu2(), new s8());
        O2161699089510411363 o2161699089510411363 = O2161699089510411363.a;
        if (ji3.b().a == null) {
            em2 a = kz2.a(kz2Var, wv0Var, o2161699089510411363, mi3Var);
            try {
                ji3.a().e().A = Integer.valueOf(i);
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
                    if (!(th instanceof dv0)) {
                        throw new iu0(th);
                    }
                    throw th;
                } finally {
                }
            }
        } else {
            th3 a2 = ji3.a(wv0Var, o2161699089510411363, true);
            try {
                ji3.a().e().A = Integer.valueOf(i);
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
                    if (!(th2 instanceof dv0)) {
                        throw new iu0(th2);
                    }
                    throw th2;
                } finally {
                }
            }
        }
    }
}
