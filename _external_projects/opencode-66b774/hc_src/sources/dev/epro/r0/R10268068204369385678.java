package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class R10268068204369385678 extends R14062301455140331524 implements G13792465322404021864 {
    public final /* synthetic */ M15459437176959963354 A;
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ float v;
    public /* synthetic */ Object w;
    public /* synthetic */ Object x;
    public /* synthetic */ Enum y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ R10268068204369385678(Object obj, float f, M15459437176959963354 m15459437176959963354, R4833348786910499294 r4833348786910499294, byte b) {
        super(4, r4833348786910499294);
        this.t = b;
        this.z = obj;
        this.v = f;
        this.A = m15459437176959963354;
    }

    @Override // dev.epro.r0.G13792465322404021864
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Object obj5 = this.z;
        switch (b) {
            case 0:
                M15459437176959963354 m15459437176959963354 = this.A;
                R10268068204369385678 r10268068204369385678 = new R10268068204369385678((K1246821697113442187) obj5, this.v, m15459437176959963354, (R4833348786910499294) obj4, (byte) 0);
                r10268068204369385678.w = (F18142507606280211225) obj;
                r10268068204369385678.x = (V4351601219763732262) obj2;
                r10268068204369385678.y = (S884268727609522965) obj3;
                return r10268068204369385678.invokeSuspend(o9245300239821758723);
            default:
                float f = this.v;
                R10268068204369385678 r102680682043693856782 = new R10268068204369385678((L7100317404093621994) obj5, f, (A10693687560045094360) this.A, (R4833348786910499294) obj4, (byte) 1);
                r102680682043693856782.w = (P11273374321045165714) obj;
                r102680682043693856782.x = (D17840030713596081464) obj2;
                r102680682043693856782.y = (F16729560403295819437) obj3;
                return r102680682043693856782.invokeSuspend(o9245300239821758723);
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        Object obj2 = this.z;
        byte b2 = 1;
        switch (b) {
            case 0:
                K1246821697113442187 k1246821697113442187 = (K1246821697113442187) obj2;
                boolean z = this.u;
                if (!z) {
                    E17665849472693074628.k(obj);
                    F18142507606280211225 f18142507606280211225 = (F18142507606280211225) this.w;
                    float c = ((V4351601219763732262) this.x).c((S884268727609522965) this.y);
                    if (!Float.isNaN(c)) {
                        A81664135048468380 a81664135048468380 = new A81664135048468380();
                        float g = Float.isNaN(k1246821697113442187.b.f.g()) ? 0.0f : k1246821697113442187.b.f.g();
                        a81664135048468380.a = g;
                        X5076676067399127345 x5076676067399127345 = new X5076676067399127345(f18142507606280211225, a81664135048468380, (byte) 1);
                        this.w = null;
                        this.x = null;
                        this.u = true;
                        if (M17147082063200071302.k(g, c, this.v, this.A, x5076676067399127345, this) == z3437138737604933638) {
                            break;
                        }
                    }
                } else if (!z) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    E17665849472693074628.k(obj);
                    break;
                }
                break;
            default:
                L7100317404093621994 l7100317404093621994 = (L7100317404093621994) obj2;
                boolean z2 = this.u;
                if (!z2) {
                    E17665849472693074628.k(obj);
                    P11273374321045165714 p11273374321045165714 = (P11273374321045165714) this.w;
                    float d = ((D17840030713596081464) this.x).d((F16729560403295819437) this.y);
                    if (!Float.isNaN(d)) {
                        A81664135048468380 a816641350484683802 = new A81664135048468380();
                        float g2 = Float.isNaN(l7100317404093621994.d.f.g()) ? 0.0f : l7100317404093621994.d.f.g();
                        a816641350484683802.a = g2;
                        A10693687560045094360 a10693687560045094360 = (A10693687560045094360) this.A;
                        S13826196617815471188 s13826196617815471188 = new S13826196617815471188(p11273374321045165714, a816641350484683802, b2);
                        this.w = null;
                        this.x = null;
                        this.u = true;
                        if (M17147082063200071302.k(g2, d, this.v, a10693687560045094360, s13826196617815471188, this) == z3437138737604933638) {
                            break;
                        }
                    }
                } else if (!z2) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    E17665849472693074628.k(obj);
                    break;
                }
                break;
        }
        return z3437138737604933638;
    }
}
