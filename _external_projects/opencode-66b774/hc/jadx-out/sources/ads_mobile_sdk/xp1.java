package ads_mobile_sdk;

import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.J10256772239794345968;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.N13798149404328803870;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class xp1 extends th3 {
    public final cc2 g;

    /* JADX WARN: Illegal instructions before constructor call */
    public xp1(wv0 wv0Var, List list, UUID uuid, mi3 mi3Var, int i, int i2, xp1 xp1Var, boolean z) {
        wv0Var.getClass();
        mi3Var.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        super(wv0Var, mi3Var, uuid, xp1Var, jCurrentTimeMillis);
        int i3 = xp1Var != null ? xp1Var.g.a : -1;
        long j = jCurrentTimeMillis - J10256772239794345968.c;
        long j2 = J10256772239794345968.d;
        this.g = new cc2(i2, mi3Var, wv0Var, list, uuid, i3, i, jCurrentTimeMillis, j, j2 < 0 ? -1L : jCurrentTimeMillis - j2, z, null, null, null, -2048);
    }

    @Override // ads_mobile_sdk.th3
    public final th3 a(wv0 wv0Var, List list, boolean z) {
        wv0Var.getClass();
        cc2 cc2Var = this.g;
        return new xp1(wv0Var, list, cc2Var.e, this.a, cc2Var.g + 1, cc2Var.a + 1, this, z);
    }

    @Override // ads_mobile_sdk.th3
    public final cc2 e() {
        return this.g;
    }

    @Override // ads_mobile_sdk.th3
    public final void h() {
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        long jCurrentTimeMillis = System.currentTimeMillis();
        N13798149404328803870 n13798149404328803870 = N13798149404328803870.MILLISECONDS;
        this.g.p = E17093345031926825464.g(M9216324016624295870.a0(jCurrentTimeMillis, n13798149404328803870), M9216324016624295870.a0(this.c, n13798149404328803870));
    }
}
