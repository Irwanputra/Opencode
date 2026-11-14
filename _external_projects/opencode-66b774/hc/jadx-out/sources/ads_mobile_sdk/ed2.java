package ads_mobile_sdk;

import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.Z3437138737604933638;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class ed2 extends R14062301455140331524 implements L12639328004344855510 {
    public boolean a;
    public final /* synthetic */ hd2 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ d33 d;
    public final /* synthetic */ z1 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed2(hd2 hd2Var, ArrayList arrayList, d33 d33Var, z1 z1Var, int i, String str, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.b = hd2Var;
        this.c = arrayList;
        this.d = d33Var;
        this.e = z1Var;
        this.f = i;
        this.g = str;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        return new ed2(this.b, this.c, this.d, this.e, this.f, this.g, r4833348786910499294);
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        return ((ed2) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(O9245300239821758723.a);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        Object objA;
        boolean z = this.a;
        d33 d33Var = this.d;
        hd2 hd2Var = this.b;
        if (!z) {
            E17665849472693074628.k(obj);
            zm1 zm1Var = hd2Var.h;
            Integer num = new Integer(this.f);
            E17093345031926825464 e17093345031926825464 = new E17093345031926825464(0L);
            this.a = true;
            objA = zm1.a(zm1Var, this.c, d33Var, this.e, num, this.g, e17093345031926825464, null, null, null, null, this, 960);
            Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
            if (objA == z3437138737604933638) {
                return z3437138737604933638;
            }
        } else {
            if (!z) {
                S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            E17665849472693074628.k(obj);
            objA = obj;
        }
        List list = (List) objA;
        jx2 jx2Var = hd2Var.i;
        z1 z1Var = this.e;
        if (z1Var != null) {
            jx2.a(jx2Var, list, z1Var, d33Var.b.b, null, null, 56);
        } else {
            jx2Var.a(list);
        }
        return O9245300239821758723.a;
    }
}
