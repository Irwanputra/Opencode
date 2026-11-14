package ads_mobile_sdk;

import dev.epro.r0.I3887072968740112330;
import dev.epro.r0.N340633841638932414;
import dev.epro.r0.O2161699089510411363;
import dev.epro.r0.P2480554073835519965;
import java.io.IOException;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class h80 extends I3887072968740112330 {
    public final /* synthetic */ i80 a;

    public h80(i80 i80Var) {
        this.a = i80Var;
    }

    @Override // dev.epro.r0.I3887072968740112330
    public final void onNavigationEvent(int i) throws IOException {
        kz2 kz2Var = this.a.c;
        wv0 wv0Var = wv0.CUI_NAME_CUSTOM_TABS_NAVIGATION_EVENT;
        mi3 mi3Var = new mi3(new ur2(), new fh1(), new tu2(), new s8());
        O2161699089510411363 o2161699089510411363 = O2161699089510411363.a;
        if (ji3.b().a == null) {
            em2 em2VarA = kz2.a(kz2Var, wv0Var, o2161699089510411363, mi3Var);
            try {
                ji3.a().e().A = Integer.valueOf(i);
                em2VarA.close();
            } catch (Throwable th) {
                try {
                    em2VarA.b(th);
                    if (th instanceof N340633841638932414) {
                        throw th;
                    }
                    if (!(th instanceof P2480554073835519965) && !(th instanceof CancellationException)) {
                        em2VarA.a(th);
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
            th3 th3VarA = ji3.a(wv0Var, o2161699089510411363, true);
            try {
                ji3.a().e().A = Integer.valueOf(i);
                th3VarA.close();
            } catch (Throwable th2) {
                try {
                    th3VarA.b(th2);
                    if (th2 instanceof N340633841638932414) {
                        throw th2;
                    }
                    if (!(th2 instanceof P2480554073835519965) && !(th2 instanceof CancellationException)) {
                        th3VarA.a(th2);
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
