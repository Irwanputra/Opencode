package ads_mobile_sdk;

import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.V3805393212198381221;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class g81 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ V3805393212198381221 a;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g81(R4833348786910499294 r4833348786910499294, V3805393212198381221 v3805393212198381221, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.a = v3805393212198381221;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        V3805393212198381221 v3805393212198381221 = this.a;
        switch (b) {
            case 0:
                return new g81(r4833348786910499294, v3805393212198381221, (byte) 0);
            case 1:
                return new g81(r4833348786910499294, v3805393212198381221, (byte) 1);
            case 2:
                return new g81(r4833348786910499294, v3805393212198381221, (byte) 2);
            case 3:
                return new g81(r4833348786910499294, v3805393212198381221, (byte) 3);
            case 4:
                return new g81(r4833348786910499294, v3805393212198381221, (byte) 4);
            default:
                return new g81(r4833348786910499294, v3805393212198381221, (byte) 5);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        V3805393212198381221 v3805393212198381221 = this.a;
        switch (b) {
            case 0:
                new g81((R4833348786910499294) obj2, v3805393212198381221, (byte) 0).invokeSuspend(o9245300239821758723);
                break;
            case 1:
                new g81((R4833348786910499294) obj2, v3805393212198381221, (byte) 1).invokeSuspend(o9245300239821758723);
                break;
            case 2:
                new g81((R4833348786910499294) obj2, v3805393212198381221, (byte) 2).invokeSuspend(o9245300239821758723);
                break;
            case 3:
                new g81((R4833348786910499294) obj2, v3805393212198381221, (byte) 3).invokeSuspend(o9245300239821758723);
                break;
            case 4:
                new g81((R4833348786910499294) obj2, v3805393212198381221, (byte) 4).invokeSuspend(o9245300239821758723);
                break;
            default:
                new g81((R4833348786910499294) obj2, v3805393212198381221, (byte) 5).invokeSuspend(o9245300239821758723);
                break;
        }
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        V3805393212198381221 v3805393212198381221 = this.a;
        switch (b) {
            case 0:
                E17665849472693074628.k(obj);
                v3805393212198381221.a(w81.R);
                break;
            case 1:
                E17665849472693074628.k(obj);
                v3805393212198381221.a(w81.Q);
                break;
            case 2:
                E17665849472693074628.k(obj);
                v3805393212198381221.a(w81.P);
                break;
            case 3:
                E17665849472693074628.k(obj);
                v3805393212198381221.a(w81.N);
                break;
            case 4:
                E17665849472693074628.k(obj);
                v3805393212198381221.a(w81.P);
                break;
            default:
                E17665849472693074628.k(obj);
                v3805393212198381221.a(w81.O);
                break;
        }
        return o9245300239821758723;
    }
}
