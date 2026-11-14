package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P6069467826135040566 extends R14062301455140331524 implements J12078565427869724451 {
    public boolean t;
    public /* synthetic */ Object u;
    public final /* synthetic */ L18111935460025096722 v;
    public final /* synthetic */ A81664135048468380 w;
    public final /* synthetic */ float x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P6069467826135040566(L18111935460025096722 l18111935460025096722, A81664135048468380 a81664135048468380, float f, R4833348786910499294 r4833348786910499294) {
        super(3, r4833348786910499294);
        this.v = l18111935460025096722;
        this.w = a81664135048468380;
        this.x = f;
    }

    @Override // dev.epro.r0.J12078565427869724451
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        A81664135048468380 a81664135048468380 = this.w;
        float f = this.x;
        P6069467826135040566 p6069467826135040566 = new P6069467826135040566(this.v, a81664135048468380, f, (R4833348786910499294) obj3);
        p6069467826135040566.u = (F18142507606280211225) obj;
        return p6069467826135040566.invokeSuspend(O9245300239821758723.a);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        A81664135048468380 a81664135048468380;
        boolean z = this.t;
        if (!z) {
            E17665849472693074628.k(obj);
            L18111935460025096722 l18111935460025096722 = this.v;
            S3976463803455495186 s3976463803455495186 = new S3976463803455495186(l18111935460025096722, (F18142507606280211225) this.u, (byte) 0);
            J3971902247911265635 j3971902247911265635 = l18111935460025096722.L;
            if (j3971902247911265635 == null) {
                S10823041268949770285.b0("resolvedFlingBehavior");
                throw null;
            }
            A81664135048468380 a816641350484683802 = this.w;
            this.u = a816641350484683802;
            this.t = true;
            obj = j3971902247911265635.a(s3976463803455495186, this.x, this);
            Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
            if (obj == z3437138737604933638) {
                return z3437138737604933638;
            }
            a81664135048468380 = a816641350484683802;
        } else {
            if (!z) {
                S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a81664135048468380 = (A81664135048468380) this.u;
            E17665849472693074628.k(obj);
        }
        a81664135048468380.a = ((Number) obj).floatValue();
        return O9245300239821758723.a;
    }
}
