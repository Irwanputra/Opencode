package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class W1833652179881853702 extends R14062301455140331524 implements L12639328004344855510 {
    public boolean t;
    public final /* synthetic */ U830809347177809305 u;
    public final /* synthetic */ float v;
    public final /* synthetic */ float w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W1833652179881853702(U830809347177809305 u830809347177809305, float f, float f2, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.u = u830809347177809305;
        this.v = f;
        this.w = f2;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        return new W1833652179881853702(this.u, this.v, this.w, r4833348786910499294);
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        return ((W1833652179881853702) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(O9245300239821758723.a);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        boolean z = this.t;
        if (!z) {
            E17665849472693074628.k(obj);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.v)) << 32) | (((long) Float.floatToRawIntBits(this.w)) & 4294967295L);
            this.t = true;
            Object objB = F7156479658963581662.b(this.u.R, jFloatToRawIntBits, this);
            Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
            if (objB == z3437138737604933638) {
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
