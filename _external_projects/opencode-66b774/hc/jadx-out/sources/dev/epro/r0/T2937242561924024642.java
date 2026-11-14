package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class T2937242561924024642 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ E18104834745338047524 v;
    public final /* synthetic */ L2216691091636065972 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T2937242561924024642(E18104834745338047524 e18104834745338047524, L2216691091636065972 l2216691091636065972, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = e18104834745338047524;
        this.w = l2216691091636065972;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        L2216691091636065972 l2216691091636065972 = this.w;
        E18104834745338047524 e18104834745338047524 = this.v;
        switch (b) {
            case 0:
                return new T2937242561924024642(e18104834745338047524, l2216691091636065972, r4833348786910499294, (byte) 0);
            default:
                return new T2937242561924024642(e18104834745338047524, l2216691091636065972, r4833348786910499294, (byte) 1);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        W5797197595347441198 w5797197595347441198 = (W5797197595347441198) obj;
        R4833348786910499294 r4833348786910499294 = (R4833348786910499294) obj2;
        switch (b) {
        }
        return ((T2937242561924024642) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        E18104834745338047524 e18104834745338047524 = this.v;
        L2216691091636065972 l2216691091636065972 = this.w;
        switch (b) {
            case 0:
                V697849047308847220 v697849047308847220 = e18104834745338047524.w;
                boolean z = this.u;
                if (!z) {
                    E17665849472693074628.k(obj);
                    e18104834745338047524.u = Float.intBitsToFloat((int) (l2216691091636065972.a >> 32)) + e18104834745338047524.u;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (l2216691091636065972.a & 4294967295L)) + e18104834745338047524.v;
                    e18104834745338047524.v = fIntBitsToFloat;
                    R8029976778412248429 r8029976778412248429 = e18104834745338047524.q;
                    float f = e18104834745338047524.u - ((int) (((Q2551293802323679034) v697849047308847220.getValue()).a >> 32));
                    float f2 = S16343116836002986007.a;
                    float fAtan2 = ((float) Math.atan2(fIntBitsToFloat - ((int) (4294967295L & ((Q2551293802323679034) v697849047308847220.getValue()).a)), f)) - 1.5707964f;
                    if (fAtan2 < 0.0f) {
                        fAtan2 += 6.2831855f;
                    }
                    M7102034154292440921 m7102034154292440921 = e18104834745338047524.t;
                    this.u = true;
                    r8029976778412248429.b.a = Boolean.FALSE;
                    Object objA = r8029976778412248429.g.a(D6414970586266598845.b, new C8303661022787201836(r8029976778412248429, fAtan2, false, m7102034154292440921, null), this);
                    if (objA != z3437138737604933638) {
                        objA = o9245300239821758723;
                    }
                    if (objA == z3437138737604933638) {
                        return z3437138737604933638;
                    }
                } else {
                    if (!z) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                S16343116836002986007.v(e18104834745338047524.q, e18104834745338047524.u, e18104834745338047524.v, e18104834745338047524.k1(), ((Q2551293802323679034) v697849047308847220.getValue()).a);
                return o9245300239821758723;
            default:
                boolean z2 = this.u;
                if (z2) {
                    if (z2) {
                        E17665849472693074628.k(obj);
                        return o9245300239821758723;
                    }
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                E17665849472693074628.k(obj);
                R8029976778412248429 r80299767784122484292 = e18104834745338047524.q;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (l2216691091636065972.a >> 32));
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (4294967295L & l2216691091636065972.a));
                float fK1 = e18104834745338047524.k1();
                boolean z3 = e18104834745338047524.r;
                long j = ((Q2551293802323679034) e18104834745338047524.w.getValue()).a;
                M7102034154292440921 m71020341542924409212 = e18104834745338047524.t;
                this.u = true;
                return S16343116836002986007.x(r80299767784122484292, fIntBitsToFloat2, fIntBitsToFloat3, fK1, z3, j, m71020341542924409212, this) == z3437138737604933638 ? z3437138737604933638 : o9245300239821758723;
        }
    }
}
