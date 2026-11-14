package dev.epro.r0;

import android.net.ConnectivityManager;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class V8566827842724050565 implements Q14474720477641017052 {
    public final ConnectivityManager a;

    public V8566827842724050565(ConnectivityManager connectivityManager) {
        this.a = connectivityManager;
    }

    @Override // dev.epro.r0.Q14474720477641017052
    public final boolean a(L16425900549479658727 l16425900549479658727) {
        if (!b(l16425900549479658727)) {
            return false;
        }
        S10973172697741180971.m("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        return false;
    }

    @Override // dev.epro.r0.Q14474720477641017052
    public final boolean b(L16425900549479658727 l16425900549479658727) {
        l16425900549479658727.getClass();
        return (l16425900549479658727.j.a() == null && l16425900549479658727.j.a == M12733718480826052124.a) ? false : true;
    }

    @Override // dev.epro.r0.Q14474720477641017052
    public final S7905146366802497968 c(K13184022901285147448 k13184022901285147448) {
        k13184022901285147448.getClass();
        return J8045362843799184672.u(new C288342651169725874((Object) k13184022901285147448, (Object) this, (R4833348786910499294) null, (byte) 14));
    }
}
