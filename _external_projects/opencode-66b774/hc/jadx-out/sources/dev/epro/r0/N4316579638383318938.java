package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class N4316579638383318938 extends R14062301455140331524 implements F4096073349764486348 {
    public boolean t;

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        N4316579638383318938 n4316579638383318938 = new N4316579638383318938(1, (R4833348786910499294) obj);
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        n4316579638383318938.invokeSuspend(o9245300239821758723);
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        boolean z = this.t;
        if (!z) {
            E17665849472693074628.k(obj);
            this.t = true;
            throw null;
        }
        if (z) {
            E17665849472693074628.k(obj);
            return O9245300239821758723.a;
        }
        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
