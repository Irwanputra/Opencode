package dev.epro.r0;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L12705398074231046507 extends R14062301455140331524 implements L12639328004344855510 {
    public A81664135048468380 t;
    public Q17276063867044657934 u;
    public boolean v;
    public final /* synthetic */ float w;
    public final /* synthetic */ F12226692988277696362 x;
    public final /* synthetic */ A7868207189447841291 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L12705398074231046507(float f, F12226692988277696362 f12226692988277696362, A7868207189447841291 a7868207189447841291, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.w = f;
        this.x = f12226692988277696362;
        this.y = a7868207189447841291;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        return new L12705398074231046507(this.w, this.x, this.y, r4833348786910499294);
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        return ((L12705398074231046507) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(O9245300239821758723.a);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        float f;
        A81664135048468380 a81664135048468380;
        Q17276063867044657934 q17276063867044657934;
        boolean z = this.v;
        if (!z) {
            E17665849472693074628.k(obj);
            f = this.w;
            if (Math.abs(f) > 1.0f) {
                A81664135048468380 a816641350484683802 = new A81664135048468380();
                a816641350484683802.a = f;
                A81664135048468380 a816641350484683803 = new A81664135048468380();
                Q17276063867044657934 a = B5998207562248239613.a(0.0f, f, 28);
                try {
                    F12226692988277696362 f12226692988277696362 = this.x;
                    X14364139104409853146 x14364139104409853146 = f12226692988277696362.a;
                    C2148711509933735908 c2148711509933735908 = new C2148711509933735908(a816641350484683803, this.y, a816641350484683802, f12226692988277696362);
                    this.t = a816641350484683802;
                    this.u = a;
                    this.v = true;
                    Object n = M17147082063200071302.n(a, x14364139104409853146, false, c2148711509933735908, this);
                    Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
                    if (n == z3437138737604933638) {
                        return z3437138737604933638;
                    }
                    a81664135048468380 = a816641350484683802;
                } catch (CancellationException unused) {
                    a81664135048468380 = a816641350484683802;
                    q17276063867044657934 = a;
                    a81664135048468380.a = ((Number) q17276063867044657934.a()).floatValue();
                    f = a81664135048468380.a;
                    return new Float(f);
                }
            }
            return new Float(f);
        }
        if (!z) {
            S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        q17276063867044657934 = this.u;
        a81664135048468380 = this.t;
        try {
            E17665849472693074628.k(obj);
        } catch (CancellationException unused2) {
            a81664135048468380.a = ((Number) q17276063867044657934.a()).floatValue();
            f = a81664135048468380.a;
            return new Float(f);
        }
        f = a81664135048468380.a;
        return new Float(f);
    }
}
