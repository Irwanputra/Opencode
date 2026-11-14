package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class S1345250588663079529 implements B8838962141159673445 {
    public final E10304945778167701561 a;
    public final B4833153077418241720 b;
    public final U12348740181602283822 c;

    public S1345250588663079529(B4833153077418241720 b4833153077418241720, U12348740181602283822 u12348740181602283822, E10304945778167701561 e10304945778167701561) {
        this.b = b4833153077418241720;
        u12348740181602283822.getClass();
        this.c = u12348740181602283822;
        this.a = e10304945778167701561;
    }

    @Override // dev.epro.r0.B8838962141159673445
    public final void a(Object obj, Object obj2) {
        K2393395423856546155.k(this.b, obj, obj2);
    }

    @Override // dev.epro.r0.B8838962141159673445
    public final void b(Object obj) {
        this.b.getClass();
        Q11287569198401486162 q11287569198401486162 = ((T3817383632789307090) obj).unknownFields;
        if (q11287569198401486162.e) {
            q11287569198401486162.e = false;
        }
        this.c.getClass();
        L11610354117192841236.y(obj);
        throw null;
    }

    @Override // dev.epro.r0.B8838962141159673445
    public final boolean c(Object obj) {
        this.c.getClass();
        L11610354117192841236.y(obj);
        throw null;
    }

    @Override // dev.epro.r0.B8838962141159673445
    public final T3817383632789307090 d() {
        E10304945778167701561 e10304945778167701561 = this.a;
        return e10304945778167701561 instanceof T3817383632789307090 ? ((T3817383632789307090) e10304945778167701561).i() : ((Y11622804996820966392) ((T3817383632789307090) e10304945778167701561).c(5)).b();
    }

    @Override // dev.epro.r0.B8838962141159673445
    public final void e(Object obj, E17564419012940707302 e17564419012940707302, R12171924199823312678 r12171924199823312678) {
        this.b.getClass();
        B4833153077418241720.a(obj);
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // dev.epro.r0.B8838962141159673445
    public final boolean f(T3817383632789307090 t3817383632789307090, T3817383632789307090 t38173836327893070902) {
        this.b.getClass();
        return t3817383632789307090.unknownFields.equals(t38173836327893070902.unknownFields);
    }

    @Override // dev.epro.r0.B8838962141159673445
    public final int g(T3817383632789307090 t3817383632789307090) {
        this.b.getClass();
        Q11287569198401486162 q11287569198401486162 = t3817383632789307090.unknownFields;
        int i = q11287569198401486162.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < q11287569198401486162.a; i3++) {
            int i4 = q11287569198401486162.b[i3] >>> 3;
            i2 += W12822723367527402820.f(3, (D8243293650800641817) q11287569198401486162.c[i3]) + W12822723367527402820.i(i4) + W12822723367527402820.h(2) + (W12822723367527402820.h(1) * 2);
        }
        q11287569198401486162.d = i2;
        return i2;
    }

    @Override // dev.epro.r0.B8838962141159673445
    public final void h(Object obj, H12843822278061842084 h12843822278061842084) {
        this.c.getClass();
        L11610354117192841236.y(obj);
        throw null;
    }

    @Override // dev.epro.r0.B8838962141159673445
    public final int i(T3817383632789307090 t3817383632789307090) {
        this.b.getClass();
        return t3817383632789307090.unknownFields.hashCode();
    }
}
