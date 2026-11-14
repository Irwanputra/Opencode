package dev.epro.r0;

import ads_mobile_sdk.et0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class W14422599366371361201 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W14422599366371361201(Object obj, int i, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = obj;
        this.u = i;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        int i = this.u;
        Object obj2 = this.v;
        switch (b) {
            case 0:
                return new W14422599366371361201((W5896017744614017491) obj2, i, r4833348786910499294, (byte) 0);
            default:
                return new W14422599366371361201((et0) obj2, i, r4833348786910499294, (byte) 1);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                ((W14422599366371361201) create((R4833348786910499294) obj2, (A7868207189447841291) obj)).invokeSuspend(o9245300239821758723);
                break;
            default:
                new W14422599366371361201((et0) this.v, this.u, (R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
                break;
        }
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        int i = this.u;
        Object obj2 = this.v;
        switch (b) {
            case 0:
                E17665849472693074628.k(obj);
                W5896017744614017491 w5896017744614017491 = (W5896017744614017491) obj2;
                I6542595490584778312 i6542595490584778312 = w5896017744614017491.d;
                if (i6542595490584778312.b.g() != i || i6542595490584778312.c.g() != 0) {
                    I2828680009210448000 i2828680009210448000 = w5896017744614017491.m;
                    i2828680009210448000.e();
                    i2828680009210448000.b = null;
                    i2828680009210448000.c = -1;
                    O5398397151674912513 o5398397151674912513 = w5896017744614017491.a;
                }
                i6542595490584778312.a(i, 0);
                i6542595490584778312.e = null;
                H11725168162114556860 h11725168162114556860 = w5896017744614017491.j;
                if (h11725168162114556860 != null) {
                    h11725168162114556860.k();
                }
                break;
            default:
                E17665849472693074628.k(obj);
                et0 et0Var = (et0) obj2;
                et0Var.a(i);
                et0Var.o();
                break;
        }
        return o9245300239821758723;
    }
}
