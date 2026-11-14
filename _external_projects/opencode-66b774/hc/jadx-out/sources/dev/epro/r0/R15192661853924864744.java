package dev.epro.r0;

import ads_mobile_sdk.cq0;
import ads_mobile_sdk.iy0;
import ads_mobile_sdk.tx0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R15192661853924864744 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ R15192661853924864744(int i, R4833348786910499294 r4833348786910499294, byte b) {
        super(i, r4833348786910499294);
        this.t = b;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = 2;
        switch (this.t) {
            case 0:
                R15192661853924864744 r15192661853924864744 = new R15192661853924864744(b, r4833348786910499294, (byte) 0);
                r15192661853924864744.u = obj;
                return r15192661853924864744;
            case 1:
                R15192661853924864744 r151926618539248647442 = new R15192661853924864744(b, r4833348786910499294, (byte) 1);
                r151926618539248647442.u = obj;
                return r151926618539248647442;
            case 2:
                R15192661853924864744 r151926618539248647443 = new R15192661853924864744(b, r4833348786910499294, b);
                r151926618539248647443.u = obj;
                return r151926618539248647443;
            case 3:
                R15192661853924864744 r151926618539248647444 = new R15192661853924864744(b, r4833348786910499294, (byte) 3);
                r151926618539248647444.u = obj;
                return r151926618539248647444;
            case 4:
                R15192661853924864744 r151926618539248647445 = new R15192661853924864744(b, r4833348786910499294, (byte) 4);
                r151926618539248647445.u = obj;
                return r151926618539248647445;
            case 5:
                R15192661853924864744 r151926618539248647446 = new R15192661853924864744(b, r4833348786910499294, (byte) 5);
                r151926618539248647446.u = obj;
                return r151926618539248647446;
            default:
                R15192661853924864744 r151926618539248647447 = new R15192661853924864744(b, r4833348786910499294, (byte) 6);
                r151926618539248647447.u = obj;
                return r151926618539248647447;
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        byte b2 = 2;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                return ((R15192661853924864744) create((R4833348786910499294) obj2, (T7367429961324727973) obj)).invokeSuspend(o9245300239821758723);
            case 1:
                R15192661853924864744 r15192661853924864744 = new R15192661853924864744(b2, (R4833348786910499294) obj2, (byte) 1);
                r15192661853924864744.u = (tx0) obj;
                r15192661853924864744.invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 2:
                R15192661853924864744 r151926618539248647442 = new R15192661853924864744(b2, (R4833348786910499294) obj2, b2);
                r151926618539248647442.u = (cq0) obj;
                return r151926618539248647442.invokeSuspend(o9245300239821758723);
            case 3:
                R15192661853924864744 r151926618539248647443 = new R15192661853924864744(b2, (R4833348786910499294) obj2, (byte) 3);
                r151926618539248647443.u = (tx0) obj;
                r151926618539248647443.invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 4:
                R15192661853924864744 r151926618539248647444 = new R15192661853924864744(b2, (R4833348786910499294) obj2, (byte) 4);
                r151926618539248647444.u = (tx0) obj;
                r151926618539248647444.invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 5:
                return ((R15192661853924864744) create((R4833348786910499294) obj2, (D1635665159522810927) obj)).invokeSuspend(o9245300239821758723);
            default:
                return ((R15192661853924864744) create((R4833348786910499294) obj2, (C4426096483489462691) obj)).invokeSuspend(o9245300239821758723);
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                E17665849472693074628.k(obj);
                return Boolean.valueOf(!(((T7367429961324727973) this.u) instanceof U8053077249905923784));
            case 1:
                E17665849472693074628.k(obj);
                iy0 iy0VarB = ((tx0) this.u).b();
                iy0VarB.n.setValue(iy0VarB, iy0.w[2], Boolean.TRUE);
                return o9245300239821758723;
            case 2:
                E17665849472693074628.k(obj);
                Y5584543079932758380 y5584543079932758380 = (Y5584543079932758380) ((cq0) this.u).n();
                int i = ((cq0) y5584543079932758380.b).sessionsSinceUpdate_ + 1;
                y5584543079932758380.b();
                cq0 cq0Var = (cq0) y5584543079932758380.b;
                cq0Var.bitField0_ |= 2;
                cq0Var.sessionsSinceUpdate_ = i;
                return (cq0) y5584543079932758380.a();
            case 3:
                E17665849472693074628.k(obj);
                iy0 iy0VarB2 = ((tx0) this.u).b();
                iy0VarB2.n.setValue(iy0VarB2, iy0.w[2], Boolean.TRUE);
                return o9245300239821758723;
            case 4:
                E17665849472693074628.k(obj);
                ((tx0) this.u).n.set(true);
                return o9245300239821758723;
            case 5:
                E17665849472693074628.k(obj);
                return Boolean.valueOf(((D1635665159522810927) this.u) == D1635665159522810927.a);
            default:
                E17665849472693074628.k(obj);
                return Boolean.valueOf(((C4426096483489462691) this.u) != C4426096483489462691.a);
        }
    }
}
