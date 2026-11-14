package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class O4748680816771539918 extends R14062301455140331524 implements L12639328004344855510 {
    public boolean t;
    public /* synthetic */ Object u;
    public final /* synthetic */ X16625187937554653603 v;
    public final /* synthetic */ int w;
    public final /* synthetic */ float x;
    public final /* synthetic */ M15459437176959963354 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O4748680816771539918(X16625187937554653603 x16625187937554653603, int i, float f, M15459437176959963354 m15459437176959963354, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.v = x16625187937554653603;
        this.w = i;
        this.x = f;
        this.y = m15459437176959963354;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        O4748680816771539918 o4748680816771539918 = new O4748680816771539918(this.v, this.w, this.x, this.y, r4833348786910499294);
        o4748680816771539918.u = obj;
        return o4748680816771539918;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        return ((O4748680816771539918) create((R4833348786910499294) obj2, (A7868207189447841291) obj)).invokeSuspend(O9245300239821758723.a);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        int i;
        boolean z = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        byte b = 1;
        if (z) {
            if (z) {
                E17665849472693074628.k(obj);
                return o9245300239821758723;
            }
            S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        E17665849472693074628.k(obj);
        A7868207189447841291 a7868207189447841291 = (A7868207189447841291) this.u;
        X16625187937554653603 x16625187937554653603 = this.v;
        M8081976061220108806 m8081976061220108806 = new M8081976061220108806(a7868207189447841291, x16625187937554653603, b);
        this.t = true;
        Z5398859297832919716 z5398859297832919716 = G14082206658910936320.a;
        int i2 = this.w;
        x16625187937554653603.q.h(x16625187937554653603.j(new Integer(i2).intValue()));
        boolean z2 = i2 > x16625187937554653603.e;
        int e = (m8081976061220108806.e() - x16625187937554653603.e) + 1;
        if (((z2 && i2 > m8081976061220108806.e()) || (!z2 && i2 < x16625187937554653603.e)) && Math.abs(i2 - x16625187937554653603.e) >= 3) {
            if (z2) {
                i = i2 - e;
                int i3 = x16625187937554653603.e;
                if (i < i3) {
                    i = i3;
                }
            } else {
                int i4 = e + i2;
                i = x16625187937554653603.e;
                if (i4 <= i) {
                    i = i4;
                }
            }
            m8081976061220108806.f(i);
        }
        Object m = M17147082063200071302.m(0.0f, m8081976061220108806.b(i2) + this.x, this.y, new B1246560328695757114(new A81664135048468380(), m8081976061220108806, (byte) 27), this, 4);
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        if (m != z3437138737604933638) {
            m = o9245300239821758723;
        }
        return m == z3437138737604933638 ? z3437138737604933638 : o9245300239821758723;
    }
}
