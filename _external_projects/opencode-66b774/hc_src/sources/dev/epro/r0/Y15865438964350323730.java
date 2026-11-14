package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Y15865438964350323730 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ P5204863746366580363 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y15865438964350323730(P5204863746366580363 p5204863746366580363, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = p5204863746366580363;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        P5204863746366580363 p5204863746366580363 = this.v;
        switch (b) {
            case 0:
                return new Y15865438964350323730(p5204863746366580363, r4833348786910499294, (byte) 0);
            case 1:
                Y15865438964350323730 y15865438964350323730 = new Y15865438964350323730(p5204863746366580363, r4833348786910499294, (byte) 1);
                y15865438964350323730.u = ((Boolean) obj).booleanValue();
                return y15865438964350323730;
            default:
                return new Y15865438964350323730(p5204863746366580363, r4833348786910499294, (byte) 2);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                return ((Y15865438964350323730) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((Y15865438964350323730) create((R4833348786910499294) obj2, bool)).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            default:
                return ((Y15865438964350323730) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        P5204863746366580363 p5204863746366580363 = this.v;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (!z) {
                    E17665849472693074628.k(obj);
                    this.u = true;
                    if (p5204863746366580363.c(D6414970586266598845.a, this) == z3437138737604933638) {
                        break;
                    }
                } else if (!z) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            case 1:
                E17665849472693074628.k(obj);
                if (!this.u) {
                    p5204863746366580363.a();
                    break;
                }
                break;
            default:
                boolean z2 = this.u;
                if (!z2) {
                    E17665849472693074628.k(obj);
                    this.u = true;
                    if (p5204863746366580363.c(D6414970586266598845.b, this) == z3437138737604933638) {
                        break;
                    }
                } else if (!z2) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
        }
        return o9245300239821758723;
    }
}
