package ads_mobile_sdk;

import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.Z3437138737604933638;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class ry extends R14062301455140331524 implements L12639328004344855510 {
    public boolean a;
    public final /* synthetic */ fz b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry(fz fzVar, boolean z, boolean z2, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.b = fzVar;
        this.c = z;
        this.d = z2;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        return new ry(this.b, this.c, this.d, r4833348786910499294);
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        return ((ry) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(O9245300239821758723.a);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) throws IOException {
        boolean z = this.a;
        if (!z) {
            E17665849472693074628.k(obj);
            this.a = true;
            Object objA = fz.a(this.b, this.c, this.d, this);
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
        }
        return O9245300239821758723.a;
    }
}
