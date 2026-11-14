package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B17056179607353680029 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.G13792465322404021864 {
    public boolean t;
    public /* synthetic */ dev.epro.r0.P11273374321045165714 u;
    public /* synthetic */ dev.epro.r0.D17840030713596081464 v;
    public /* synthetic */ java.lang.Object w;
    public final /* synthetic */ dev.epro.r0.F9886074403848142923 x;
    public final /* synthetic */ float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B17056179607353680029(dev.epro.r0.F9886074403848142923 f9886074403848142923, float f, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        super(4, r4833348786910499294);
        this.x = f9886074403848142923;
        this.y = f;
    }

    public final java.lang.Object i(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        dev.epro.r0.B17056179607353680029 b17056179607353680029 = new dev.epro.r0.B17056179607353680029(this.x, this.y, (dev.epro.r0.R4833348786910499294) obj4);
        b17056179607353680029.u = (dev.epro.r0.P11273374321045165714) obj;
        b17056179607353680029.v = (dev.epro.r0.D17840030713596081464) obj2;
        b17056179607353680029.w = obj3;
        return b17056179607353680029.invokeSuspend(dev.epro.r0.O9245300239821758723.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z = this.t;
        if (!z) {
            dev.epro.r0.E17665849472693074628.k(obj);
            dev.epro.r0.P11273374321045165714 p11273374321045165714 = this.u;
            float fD = this.v.d(this.w);
            if (!java.lang.Float.isNaN(fD)) {
                dev.epro.r0.A81664135048468380 a81664135048468380 = new dev.epro.r0.A81664135048468380();
                dev.epro.r0.F9886074403848142923 f9886074403848142923 = this.x;
                float fG = java.lang.Float.isNaN(f9886074403848142923.f.g()) ? 0.0f : f9886074403848142923.f.g();
                a81664135048468380.a = fG;
                dev.epro.r0.A10693687560045094360 a10693687560045094360 = ((dev.epro.r0.L7100317404093621994) ((dev.epro.r0.N8306548196372912291) f9886074403848142923.k).b).c;
                dev.epro.r0.S13826196617815471188 s13826196617815471188 = new dev.epro.r0.S13826196617815471188(p11273374321045165714, a81664135048468380, (byte) 0);
                this.u = null;
                this.v = null;
                this.t = true;
                java.lang.Object objK = dev.epro.r0.M17147082063200071302.k(fG, fD, this.y, a10693687560045094360, s13826196617815471188, this);
                dev.epro.r0.Z3437138737604933638 z3437138737604933638 = dev.epro.r0.Z3437138737604933638.a;
                if (objK == z3437138737604933638) {
                    return z3437138737604933638;
                }
            }
        } else {
            if (!z) {
                dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dev.epro.r0.E17665849472693074628.k(obj);
        }
        return dev.epro.r0.O9245300239821758723.a;
    }
}
