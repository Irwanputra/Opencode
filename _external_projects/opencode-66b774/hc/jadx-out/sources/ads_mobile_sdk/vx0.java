package ads_mobile_sdk;

import android.net.Uri;
import dev.epro.r0.C9731525580007922156;
import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.Z3437138737604933638;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class vx0 extends R14062301455140331524 implements L12639328004344855510 {
    public boolean a;
    public final /* synthetic */ iy0 b;
    public final /* synthetic */ Uri c;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vx0(iy0 iy0Var, Uri uri, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.b = iy0Var;
        this.c = uri;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        Uri uri = this.c;
        iy0 iy0Var = this.b;
        switch (b) {
            case 0:
                return new vx0(iy0Var, uri, r4833348786910499294, (byte) 0);
            default:
                return new vx0(iy0Var, uri, r4833348786910499294, (byte) 1);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Uri uri = this.c;
        iy0 iy0Var = this.b;
        switch (b) {
            case 0:
                return new vx0(iy0Var, uri, (R4833348786910499294) obj2, (byte) 0).invokeSuspend(o9245300239821758723);
            default:
                return new vx0(iy0Var, uri, (R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        switch (this.t) {
            case 0:
                Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
                boolean z = this.a;
                if (!z) {
                    E17665849472693074628.k(obj);
                    z03 z03Var = this.b.u;
                    if (z03Var != null) {
                        String string = this.c.toString();
                        string.getClass();
                        this.a = true;
                        if (z03Var.b(string, this) == z3437138737604933638) {
                        }
                    }
                } else if (!z) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            default:
                Z3437138737604933638 z34371387376049336382 = Z3437138737604933638.a;
                boolean z2 = this.a;
                if (!z2) {
                    E17665849472693074628.k(obj);
                    iy0 iy0Var = this.b;
                    C9731525580007922156 c9731525580007922156 = iy0Var.a;
                    tx0 tx0Var = iy0Var.b;
                    Uri uri = this.c;
                    this.a = true;
                    if (c9731525580007922156.a(tx0Var, uri, this) == z34371387376049336382) {
                    }
                } else if (!z2) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
        }
        return O9245300239821758723.a;
    }
}
