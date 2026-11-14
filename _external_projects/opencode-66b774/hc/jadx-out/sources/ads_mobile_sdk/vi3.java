package ads_mobile_sdk;

import dev.epro.r0.I3863025946240164840;
import dev.epro.r0.L7743116545240101509;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.Z886113521968091188;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class vi3 {
    public final qm1 a;
    public final O16637889491137121389 b;

    public vi3(O16637889491137121389 o16637889491137121389, qm1 qm1Var) {
        this.a = qm1Var;
        this.b = o16637889491137121389;
    }

    public final void a(yk0 yk0Var, L7743116545240101509 l7743116545240101509) {
        sh3 sh3Var = new sh3(yk0Var, this.b, this.a);
        sh3Var.b();
        l7743116545240101509.a(new I3863025946240164840(l7743116545240101509, new c7((Object) sh3Var, (byte) 26), (byte) 0), Z886113521968091188.a);
    }

    public final void b(yk0 yk0Var) {
        this.a.a(yk0Var.a, -1L, null, null);
    }

    public final sh3 a(yk0 yk0Var) {
        return new sh3(yk0Var, this.b, this.a);
    }

    public final void a(yk0 yk0Var, Runnable runnable) {
        try {
            new sh3(yk0Var, this.b, this.a).b();
            runnable.run();
        } finally {
        }
    }
}
