package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J14057654040986470873 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public /* synthetic */ Object v;
    public final /* synthetic */ F4096073349764486348 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J14057654040986470873(F4096073349764486348 f4096073349764486348, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.t = (byte) 2;
        this.w = f4096073349764486348;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        switch (this.t) {
            case 0:
                J14057654040986470873 j14057654040986470873 = new J14057654040986470873(r4833348786910499294, this.w, (byte) 0);
                j14057654040986470873.v = obj;
                return j14057654040986470873;
            case 1:
                J14057654040986470873 j140576540409864708732 = new J14057654040986470873(r4833348786910499294, this.w, (byte) 1);
                j140576540409864708732.v = obj;
                return j140576540409864708732;
            default:
                J14057654040986470873 j140576540409864708733 = new J14057654040986470873(this.w, r4833348786910499294);
                j140576540409864708733.v = obj;
                return j140576540409864708733;
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                return ((J14057654040986470873) create((R4833348786910499294) obj2, (B1062434985168244363) obj)).invokeSuspend(o9245300239821758723);
            case 1:
                return ((J14057654040986470873) create((R4833348786910499294) obj2, (B1062434985168244363) obj)).invokeSuspend(o9245300239821758723);
            default:
                return ((J14057654040986470873) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        F4096073349764486348 f4096073349764486348 = this.w;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (z) {
                    if (z) {
                        E17665849472693074628.k(obj);
                        return obj;
                    }
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                E17665849472693074628.k(obj);
                this.u = true;
                Object objInvoke = f4096073349764486348.invoke(this);
                return objInvoke == z3437138737604933638 ? z3437138737604933638 : objInvoke;
            case 1:
                boolean z2 = this.u;
                if (z2) {
                    if (z2) {
                        E17665849472693074628.k(obj);
                        return obj;
                    }
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                E17665849472693074628.k(obj);
                this.u = true;
                Object objInvoke2 = f4096073349764486348.invoke(this);
                return objInvoke2 == z3437138737604933638 ? z3437138737604933638 : objInvoke2;
            default:
                boolean z3 = this.u;
                if (!z3) {
                    E17665849472693074628.k(obj);
                    if (((W5797197595347441198) this.v).h().get(B8553891759473824940.b) != null) {
                        this.u = true;
                        Object objInvoke3 = f4096073349764486348.invoke(this);
                        return objInvoke3 == z3437138737604933638 ? z3437138737604933638 : objInvoke3;
                    }
                    S10973172697741180971.m("Expected a TransactionElement in the CoroutineContext but none was found.");
                } else {
                    if (z3) {
                        E17665849472693074628.k(obj);
                        return obj;
                    }
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J14057654040986470873(R4833348786910499294 r4833348786910499294, F4096073349764486348 f4096073349764486348, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.w = f4096073349764486348;
    }
}
