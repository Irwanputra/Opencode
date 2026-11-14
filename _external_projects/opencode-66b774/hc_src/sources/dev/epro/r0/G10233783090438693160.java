package dev.epro.r0;

import android.os.Build;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public abstract class G10233783090438693160 implements Q14474720477641017052 {
    public final H18172316468146598624 a;

    public G10233783090438693160(H18172316468146598624 h18172316468146598624) {
        this.a = h18172316468146598624;
    }

    @Override // dev.epro.r0.Q14474720477641017052
    public final boolean a(L16425900549479658727 l16425900549479658727) {
        return b(l16425900549479658727) && e(this.a.c());
    }

    @Override // dev.epro.r0.Q14474720477641017052
    public final S7905146366802497968 c(K13184022901285147448 k13184022901285147448) {
        k13184022901285147448.getClass();
        return J8045362843799184672.u(new Y14354959068095823168((Object) this, (R4833348786910499294) null, (byte) 5));
    }

    public int d() {
        return 7;
    }

    public boolean e(Object obj) {
        U4907063343750015025 u4907063343750015025 = (U4907063343750015025) obj;
        u4907063343750015025.getClass();
        boolean z = u4907063343750015025.e;
        boolean z2 = u4907063343750015025.a;
        if (Build.VERSION.SDK_INT >= 26) {
            return (z2 && u4907063343750015025.c && !z) ? false : true;
        }
        B14824868959299866349.n().getClass();
        return !z2 || z;
    }
}
