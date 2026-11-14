package ads_mobile_sdk;

import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.F4096073349764486348;
import dev.epro.r0.K12714355155332733186;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.N13798149404328803870;
import dev.epro.r0.O12043144740933444288;
import dev.epro.r0.O8620973563946607355;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.X9852054718446117252;
import dev.epro.r0.Z3437138737604933638;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class oi3 extends iv2 {
    public final b41 k;
    public double l;
    public Map m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi3(rg0 rg0Var, O12043144740933444288 o12043144740933444288, jr0 jr0Var, K12714355155332733186 k12714355155332733186, b41 b41Var) {
        super(rg0Var, o12043144740933444288, jr0Var, k12714355155332733186);
        rg0Var.getClass();
        o12043144740933444288.getClass();
        jr0Var.getClass();
        k12714355155332733186.getClass();
        b41Var.getClass();
        this.k = b41Var;
        this.m = X9852054718446117252.a;
    }

    @Override // ads_mobile_sdk.iv2
    public final boolean a() {
        boolean z;
        synchronized (this) {
            try {
                Iterator it = this.j.iterator();
                int i = 0;
                while (it.hasNext()) {
                    i += ((qi3) it.next()).b.length;
                }
                jr0 jr0Var = this.c;
                jr0Var.getClass();
                z = i >= ((Number) jr0Var.a("gads:cui_buffer_size", (Object) 1000, (F4096073349764486348) ao.a$18)).intValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // ads_mobile_sdk.iv2
    public final long b() {
        jr0 jr0Var = this.c;
        jr0Var.getClass();
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        return ((E17093345031926825464) jr0Var.a("gads:cui_monitoring_interval_ms", new E17093345031926825464(M9216324016624295870.Z(5, N13798149404328803870.MINUTES)), ao.a)).a;
    }

    @Override // ads_mobile_sdk.iv2
    public final Object a(R14062301455140331524 r14062301455140331524) {
        Object B = O8620973563946607355.B(new ni3(this, null), r14062301455140331524);
        return B == Z3437138737604933638.a ? B : O9245300239821758723.a;
    }
}
