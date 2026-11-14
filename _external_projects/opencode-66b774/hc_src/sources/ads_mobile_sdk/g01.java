package ads_mobile_sdk;

import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.E18444280280170001567;
import dev.epro.r0.H7219028874700587498;
import dev.epro.r0.J6457333644812339360;
import dev.epro.r0.K8888766238980911980;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.Z3437138737604933638;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class g01 extends R14062301455140331524 implements L12639328004344855510 {
    public boolean a;
    public final /* synthetic */ j01 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Map e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g01(j01 j01Var, String str, String str2, Map map, boolean z, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.b = j01Var;
        this.c = str;
        this.d = str2;
        this.e = map;
        this.f = z;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        return new g01(this.b, this.c, this.d, this.e, this.f, r4833348786910499294);
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        return ((g01) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(O9245300239821758723.a);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        boolean z = this.a;
        if (!z) {
            E17665849472693074628.k(obj);
            j01 j01Var = this.b;
            String str = this.c;
            String str2 = this.d;
            Map map = this.e;
            boolean z2 = this.f;
            this.a = true;
            H7219028874700587498 h7219028874700587498 = new H7219028874700587498(1, E18444280280170001567.H(this));
            h7219028874700587498.t();
            f01 f01Var = new f01(new AtomicBoolean(false), h7219028874700587498);
            synchronized (((K8888766238980911980) j01Var.c.getValue())) {
                ((J6457333644812339360) ((K8888766238980911980) j01Var.c.getValue())).b(str, str2, f01Var, map, z2);
            }
            if (h7219028874700587498.r() == z3437138737604933638) {
                return z3437138737604933638;
            }
        } else {
            if (!z) {
                S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            E17665849472693074628.k(obj);
        }
        return O9245300239821758723.a;
    }
}
