package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Y12114556896949435890 extends R14062301455140331524 implements L12639328004344855510 {
    public A81664135048468380 t;
    public byte u;
    public final /* synthetic */ Q12103736865181728683 v;
    public final /* synthetic */ float w;
    public final /* synthetic */ F4096073349764486348 x;
    public final /* synthetic */ A7868207189447841291 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y12114556896949435890(Q12103736865181728683 q12103736865181728683, float f, F4096073349764486348 f4096073349764486348, A7868207189447841291 a7868207189447841291, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.v = q12103736865181728683;
        this.w = f;
        this.x = f4096073349764486348;
        this.y = a7868207189447841291;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        return new Y12114556896949435890(this.v, this.w, this.x, this.y, r4833348786910499294);
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        return ((Y12114556896949435890) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(O9245300239821758723.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [dev.epro.r0.K17903142602918939099] */
    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        final A81664135048468380 a81664135048468380;
        Object objD;
        Q12103736865181728683 q12103736865181728683 = this.v;
        U2582504393267961583 u2582504393267961583 = q12103736865181728683.a;
        byte b = this.u;
        final byte b2 = 1;
        final F4096073349764486348 f4096073349764486348 = this.x;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        if (b == 0) {
            E17665849472693074628.k(obj);
            X14364139104409853146 x14364139104409853146 = q12103736865181728683.b;
            float f = this.w;
            float fJ = u2582504393267961583.j(f, U15853425786981391261.u(x14364139104409853146, 0.0f, f));
            if (Float.isNaN(fJ)) {
                Y16081827717826519461.c("calculateApproachOffset returned NaN. Please use a valid value.");
            }
            a81664135048468380 = new A81664135048468380();
            float fSignum = Math.signum(f) * Math.abs(fJ);
            a81664135048468380.a = fSignum;
            f4096073349764486348.invoke(new Float(fSignum));
            float f2 = a81664135048468380.a;
            final byte b3 = 0;
            ?? r4 = new F4096073349764486348() { // from class: dev.epro.r0.K17903142602918939099
                @Override // dev.epro.r0.F4096073349764486348
                public final Object invoke(Object obj2) {
                    byte b4 = b3;
                    O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
                    F4096073349764486348 f40960733497644863482 = f4096073349764486348;
                    A81664135048468380 a816641350484683802 = a81664135048468380;
                    float fFloatValue = ((Float) obj2).floatValue();
                    switch (b4) {
                        case 0:
                            float f3 = a816641350484683802.a - fFloatValue;
                            a816641350484683802.a = f3;
                            f40960733497644863482.invoke(Float.valueOf(f3));
                            break;
                        default:
                            float f4 = a816641350484683802.a - fFloatValue;
                            a816641350484683802.a = f4;
                            f40960733497644863482.invoke(Float.valueOf(f4));
                            break;
                    }
                    return o9245300239821758723;
                }
            };
            this.t = a81664135048468380;
            this.u = (byte) 1;
            objD = q12103736865181728683.d(this.y, f2, this.w, r4, this);
            if (objD != z3437138737604933638) {
            }
        }
        if (b != 1) {
            if (b == 2) {
                E17665849472693074628.k(obj);
                return obj;
            }
            S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        A81664135048468380 a816641350484683802 = this.t;
        E17665849472693074628.k(obj);
        a81664135048468380 = a816641350484683802;
        objD = obj;
        Q17276063867044657934 q17276063867044657934 = (Q17276063867044657934) objD;
        float fT = u2582504393267961583.t(((Number) q17276063867044657934.a()).floatValue());
        if (Float.isNaN(fT)) {
            Y16081827717826519461.c("calculateSnapOffset returned NaN. Please use a valid value.");
        }
        a81664135048468380.a = fT;
        Q17276063867044657934 q17276063867044657934N = B5998207562248239613.n(q17276063867044657934, 0.0f, 0.0f, 30);
        M15459437176959963354 m15459437176959963354 = q12103736865181728683.c;
        F4096073349764486348 f40960733497644863482 = new F4096073349764486348() { // from class: dev.epro.r0.K17903142602918939099
            @Override // dev.epro.r0.F4096073349764486348
            public final Object invoke(Object obj2) {
                byte b4 = b2;
                O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
                F4096073349764486348 f409607334976448634822 = f4096073349764486348;
                A81664135048468380 a8166413504846838022 = a81664135048468380;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (b4) {
                    case 0:
                        float f3 = a8166413504846838022.a - fFloatValue;
                        a8166413504846838022.a = f3;
                        f409607334976448634822.invoke(Float.valueOf(f3));
                        break;
                    default:
                        float f4 = a8166413504846838022.a - fFloatValue;
                        a8166413504846838022.a = f4;
                        f409607334976448634822.invoke(Float.valueOf(f4));
                        break;
                }
                return o9245300239821758723;
            }
        };
        this.t = null;
        this.u = (byte) 2;
        Object objM = U1554499319261669842.m(this.y, fT, fT, q17276063867044657934N, m15459437176959963354, f40960733497644863482, this);
        return objM == z3437138737604933638 ? z3437138737604933638 : objM;
    }
}
