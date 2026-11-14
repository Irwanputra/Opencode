package dev.epro.r0;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J673319485797928402 extends R14062301455140331524 implements F4096073349764486348 {
    public final /* synthetic */ F4096073349764486348 A;
    public Q17276063867044657934 t;
    public M4043793213707479819 u;
    public boolean v;
    public final /* synthetic */ U16834965109098959004 w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ W543543915243615877 y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J673319485797928402(U16834965109098959004 u16834965109098959004, Object obj, W543543915243615877 w543543915243615877, long j, F4096073349764486348 f4096073349764486348, R4833348786910499294 r4833348786910499294) {
        super(1, r4833348786910499294);
        this.w = u16834965109098959004;
        this.x = obj;
        this.y = w543543915243615877;
        this.z = j;
        this.A = f4096073349764486348;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        long j = this.z;
        F4096073349764486348 f4096073349764486348 = this.A;
        return new J673319485797928402(this.w, this.x, this.y, j, f4096073349764486348, (R4833348786910499294) obj).invokeSuspend(O9245300239821758723.a);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        U16834965109098959004 u16834965109098959004;
        Q17276063867044657934 q17276063867044657934;
        M4043793213707479819 m4043793213707479819;
        CancellationException cancellationException;
        W543543915243615877 w543543915243615877 = this.y;
        boolean z = this.v;
        U16834965109098959004 u168349651090989590042 = this.w;
        if (!z) {
            E17665849472693074628.k(obj);
            try {
                u168349651090989590042.c.c = (Z13251062865217617579) ((O3410298526443296213) u168349651090989590042.a).a.invoke(this.x);
                u168349651090989590042.e.setValue(w543543915243615877.c);
                u168349651090989590042.d.setValue(Boolean.TRUE);
                Q17276063867044657934 q172760638670446579342 = u168349651090989590042.c;
                Q17276063867044657934 q172760638670446579343 = new Q17276063867044657934(q172760638670446579342.a, q172760638670446579342.b.getValue(), E3422549137300678133.N(q172760638670446579342.c), q172760638670446579342.d, Long.MIN_VALUE, q172760638670446579342.f);
                M4043793213707479819 m40437932137074798192 = new M4043793213707479819();
                long j = this.z;
                G11323133580509801397 g11323133580509801397 = new G11323133580509801397((Object) u168349651090989590042, (Object) q172760638670446579343, (Object) this.A, (Object) m40437932137074798192, (byte) 0);
                u16834965109098959004 = u168349651090989590042;
                try {
                    this.t = q172760638670446579343;
                    this.u = m40437932137074798192;
                    this.v = true;
                    Object l = M17147082063200071302.l(q172760638670446579343, w543543915243615877, j, g11323133580509801397, this);
                    Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
                    if (l == z3437138737604933638) {
                        return z3437138737604933638;
                    }
                    q17276063867044657934 = q172760638670446579343;
                    m4043793213707479819 = m40437932137074798192;
                } catch (CancellationException e) {
                    e = e;
                    cancellationException = e;
                    u16834965109098959004.c();
                    throw cancellationException;
                }
            } catch (CancellationException e2) {
                e = e2;
                u16834965109098959004 = u168349651090989590042;
                cancellationException = e;
                u16834965109098959004.c();
                throw cancellationException;
            }
        } else {
            if (!z) {
                S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m4043793213707479819 = this.u;
            q17276063867044657934 = this.t;
            try {
                E17665849472693074628.k(obj);
                u16834965109098959004 = u168349651090989590042;
            } catch (CancellationException e3) {
                cancellationException = e3;
                u16834965109098959004 = u168349651090989590042;
                u16834965109098959004.c();
                throw cancellationException;
            }
        }
        G502295589610334456 g502295589610334456 = m4043793213707479819.a ? G502295589610334456.a : G502295589610334456.b;
        u16834965109098959004.c();
        return new N16276953959110768012(q17276063867044657934, g502295589610334456);
    }
}
