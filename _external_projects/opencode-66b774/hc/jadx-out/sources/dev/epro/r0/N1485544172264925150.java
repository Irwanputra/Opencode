package dev.epro.r0;

import ads_mobile_sdk.a70;
import ads_mobile_sdk.cq0;
import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class N1485544172264925150 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ N1485544172264925150(int i, R4833348786910499294 r4833348786910499294, byte b) {
        super(i, r4833348786910499294);
        this.t = b;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = 2;
        switch (this.t) {
            case 0:
                return new N1485544172264925150(b, r4833348786910499294, (byte) 0);
            case 1:
                return new N1485544172264925150(b, r4833348786910499294, (byte) 1);
            case 2:
                return new N1485544172264925150(b, r4833348786910499294, b);
            case 3:
                return new N1485544172264925150(b, r4833348786910499294, (byte) 3);
            case 4:
                return new N1485544172264925150(b, r4833348786910499294, (byte) 4);
            case 5:
                return new N1485544172264925150(b, r4833348786910499294, (byte) 5);
            case 6:
                return new N1485544172264925150(b, r4833348786910499294, (byte) 6);
            default:
                return new N1485544172264925150(b, r4833348786910499294, (byte) 7);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        int i = 2;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                return ((N1485544172264925150) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 1:
                ((N1485544172264925150) create((R4833348786910499294) obj2, (A7868207189447841291) obj)).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 2:
                ((N1485544172264925150) create((R4833348786910499294) obj2, (A7868207189447841291) obj)).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 3:
                ((N1485544172264925150) create((R4833348786910499294) obj2, (S7864201625552763331) obj)).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 4:
                return new N1485544172264925150(i, (R4833348786910499294) obj2, (byte) 4).invokeSuspend(o9245300239821758723);
            case 5:
                new N1485544172264925150(i, (R4833348786910499294) obj2, (byte) 5);
                E17665849472693074628.k(o9245300239821758723);
                return o9245300239821758723;
            case 6:
                return new N1485544172264925150(i, (R4833348786910499294) obj2, (byte) 6).invokeSuspend(o9245300239821758723);
            default:
                new N1485544172264925150(i, (R4833348786910499294) obj2, (byte) 7);
                E17665849472693074628.k(o9245300239821758723);
                return o9245300239821758723;
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                E17665849472693074628.k(obj);
                return Choreographer.getInstance();
            case 1:
                E17665849472693074628.k(obj);
                return o9245300239821758723;
            case 2:
                E17665849472693074628.k(obj);
                return o9245300239821758723;
            case 3:
                E17665849472693074628.k(obj);
                return o9245300239821758723;
            case 4:
                E17665849472693074628.k(obj);
                a70 a70VarP = a70.p();
                a70VarP.getClass();
                return a70VarP;
            case 5:
                E17665849472693074628.k(obj);
                return o9245300239821758723;
            case 6:
                E17665849472693074628.k(obj);
                Y5584543079932758380 y5584543079932758380V = cq0.v();
                y5584543079932758380V.getClass();
                y5584543079932758380V.b();
                cq0 cq0Var = (cq0) y5584543079932758380V.b;
                cq0Var.bitField0_ |= 4;
                cq0Var.hasSdkInitializedPreviously_ = true;
                return (cq0) y5584543079932758380V.a();
            default:
                E17665849472693074628.k(obj);
                return o9245300239821758723;
        }
    }
}
