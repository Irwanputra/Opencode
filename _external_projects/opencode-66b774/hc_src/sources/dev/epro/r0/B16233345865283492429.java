package dev.epro.r0;

import ads_mobile_sdk.w20;
import ads_mobile_sdk.y11;
import org.chromium.net.CronetEngine;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B16233345865283492429 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t = 1;
    public boolean u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B16233345865283492429(G8001132634698687269 g8001132634698687269, J196785984016436306 j196785984016436306, boolean z, boolean z2, F4096073349764486348 f4096073349764486348, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.x = g8001132634698687269;
        this.y = j196785984016436306;
        this.v = z;
        this.w = z2;
        this.z = f4096073349764486348;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        Object obj2 = this.z;
        Object obj3 = this.y;
        Object obj4 = this.x;
        switch (b) {
            case 0:
                return new B16233345865283492429((G8001132634698687269) obj4, (J196785984016436306) obj3, this.v, this.w, (F4096073349764486348) obj2, r4833348786910499294);
            default:
                return new B16233345865283492429((w20) obj4, (y11) obj3, (CronetEngine) obj2, this.v, this.w, r4833348786910499294);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                return ((B16233345865283492429) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            default:
                return ((B16233345865283492429) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        Object obj2 = this.z;
        Object obj3 = this.y;
        Object obj4 = this.x;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (!z) {
                    E17665849472693074628.k(obj);
                    Z15853133007095729891 z15853133007095729891 = new Z15853133007095729891((J196785984016436306) obj3, this.v, this.w, (F4096073349764486348) obj2, (R4833348786910499294) null);
                    this.u = true;
                    Object d0 = R7033599853981556291.d0((G8001132634698687269) obj4, z15853133007095729891, this);
                    if (d0 == z3437138737604933638) {
                        break;
                    }
                } else if (!z) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    E17665849472693074628.k(obj);
                    break;
                }
                break;
            default:
                boolean z2 = this.u;
                if (!z2) {
                    E17665849472693074628.k(obj);
                    this.u = true;
                    Object a = ((w20) obj4).a((y11) obj3, (CronetEngine) obj2, this.v, this.w, this);
                    if (a == z3437138737604933638) {
                        break;
                    }
                } else if (!z2) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    E17665849472693074628.k(obj);
                    break;
                }
                break;
        }
        return z3437138737604933638;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B16233345865283492429(w20 w20Var, y11 y11Var, CronetEngine cronetEngine, boolean z, boolean z2, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.x = w20Var;
        this.y = y11Var;
        this.z = cronetEngine;
        this.v = z;
        this.w = z2;
    }
}
