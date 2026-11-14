package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class B17056179607353680029 extends R14062301455140331524 implements G13792465322404021864 {
    public boolean t;
    public /* synthetic */ P11273374321045165714 u;
    public /* synthetic */ D17840030713596081464 v;
    public /* synthetic */ Object w;
    public final /* synthetic */ F9886074403848142923 x;
    public final /* synthetic */ float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B17056179607353680029(F9886074403848142923 f9886074403848142923, float f, R4833348786910499294 r4833348786910499294) {
        super(4, r4833348786910499294);
        this.x = f9886074403848142923;
        this.y = f;
    }

    @Override // dev.epro.r0.G13792465322404021864
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        B17056179607353680029 b17056179607353680029 = new B17056179607353680029(this.x, this.y, (R4833348786910499294) obj4);
        b17056179607353680029.u = (P11273374321045165714) obj;
        b17056179607353680029.v = (D17840030713596081464) obj2;
        b17056179607353680029.w = obj3;
        return b17056179607353680029.invokeSuspend(O9245300239821758723.a);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        boolean z = this.t;
        if (!z) {
            E17665849472693074628.k(obj);
            P11273374321045165714 p11273374321045165714 = this.u;
            float fD = this.v.d(this.w);
            if (!Float.isNaN(fD)) {
                A81664135048468380 a81664135048468380 = new A81664135048468380();
                F9886074403848142923 f9886074403848142923 = this.x;
                float fG = Float.isNaN(f9886074403848142923.f.g()) ? 0.0f : f9886074403848142923.f.g();
                a81664135048468380.a = fG;
                A10693687560045094360 a10693687560045094360 = ((L7100317404093621994) ((N8306548196372912291) f9886074403848142923.k).b).c;
                S13826196617815471188 s13826196617815471188 = new S13826196617815471188(p11273374321045165714, a81664135048468380, (byte) 0);
                this.u = null;
                this.v = null;
                this.t = true;
                Object objK = M17147082063200071302.k(fG, fD, this.y, a10693687560045094360, s13826196617815471188, this);
                Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
                if (objK == z3437138737604933638) {
                    return z3437138737604933638;
                }
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
