package ads_mobile_sdk;

import dev.epro.r0.G16864365537574524285;
import dev.epro.r0.I3826119971291161142;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.P7598478828797568949;
import dev.epro.r0.R13857032526302973615;
import dev.epro.r0.R16580349318584449994;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.Z3437138737604933638;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ol implements R13857032526302973615 {
    public final Object a;
    public final Object b;
    public final /* synthetic */ byte c = 1;

    public ol(G16864365537574524285 g16864365537574524285) {
        g16864365537574524285.getClass();
        this.a = g16864365537574524285;
        this.b = new AtomicBoolean(false);
    }

    @Override // dev.epro.r0.R13857032526302973615
    public final Object c(R4833348786910499294 r4833348786910499294) {
        Object a;
        byte b = this.c;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Object obj = this.b;
        Object obj2 = this.a;
        switch (b) {
            case 0:
                return (((AtomicBoolean) obj).compareAndSet(false, true) && (a = ((G16864365537574524285) obj2).a(r4833348786910499294)) == Z3437138737604933638.a) ? a : o9245300239821758723;
            default:
                et0 et0Var = ((tx0) obj2).f113o;
                if (et0Var != null) {
                    W5797197595347441198 w5797197595347441198 = (W5797197595347441198) obj;
                    R16580349318584449994 r16580349318584449994 = new R16580349318584449994(et0Var, null, (byte) 15);
                    w5797197595347441198.getClass();
                    R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(r16580349318584449994, null, (byte) 1), 2);
                }
                return o9245300239821758723;
        }
    }

    public ol(tx0 tx0Var, W5797197595347441198 w5797197595347441198) {
        tx0Var.getClass();
        w5797197595347441198.getClass();
        this.a = tx0Var;
        this.b = w5797197595347441198;
    }
}
