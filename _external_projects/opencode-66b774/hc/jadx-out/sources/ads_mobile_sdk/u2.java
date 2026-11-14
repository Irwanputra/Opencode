package ads_mobile_sdk;

import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.I3826119971291161142;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.P7598478828797568949;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.W5797197595347441198;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class u2 extends R14062301455140331524 implements L12639328004344855510 {
    public /* synthetic */ Object a;
    public final /* synthetic */ y2 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u2(y2 y2Var, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.b = y2Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        y2 y2Var = this.b;
        switch (b) {
            case 0:
                u2 u2Var = new u2(y2Var, r4833348786910499294, (byte) 0);
                u2Var.a = obj;
                return u2Var;
            default:
                u2 u2Var2 = new u2(y2Var, r4833348786910499294, (byte) 1);
                u2Var2.a = obj;
                return u2Var2;
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                ((u2) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
                break;
            default:
                u2 u2Var = new u2(this.b, (R4833348786910499294) obj2, (byte) 1);
                u2Var.a = (tx0) obj;
                u2Var.invokeSuspend(o9245300239821758723);
                break;
        }
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        y2 y2Var = this.b;
        switch (b) {
            case 0:
                E17665849472693074628.k(obj);
                W5797197595347441198 w5797197595347441198 = (W5797197595347441198) this.a;
                for (Map.Entry entry : ((Map) y2Var.b).entrySet()) {
                    R4833348786910499294 r4833348786910499294 = null;
                    ha haVar = new ha((String) entry.getKey(), entry.getValue(), r4833348786910499294, (byte) 22);
                    w5797197595347441198.getClass();
                    R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(haVar, r4833348786910499294, (byte) 1), 2);
                }
                break;
            default:
                E17665849472693074628.k(obj);
                iy0 iy0VarB = ((tx0) this.a).b();
                iy0VarB.p.setValue(iy0VarB, iy0.w[4], y2Var);
                break;
        }
        return o9245300239821758723;
    }
}
