package ads_mobile_sdk;

import dev.epro.r0.B14824868959299866349;
import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.G8001132634698687269;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.O8620973563946607355;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.P14306640982153864715;
import dev.epro.r0.P2382941533350862833;
import dev.epro.r0.P5733283974459951585;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.U2722688686349128662;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class bh0 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ ih0 a;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bh0(ih0 ih0Var, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.a = ih0Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        ih0 ih0Var = this.a;
        switch (b) {
            case 0:
                return new bh0(ih0Var, r4833348786910499294, (byte) 0);
            case 1:
                return new bh0(ih0Var, r4833348786910499294, (byte) 1);
            case 2:
                return new bh0(ih0Var, r4833348786910499294, (byte) 2);
            case 3:
                return new bh0(ih0Var, r4833348786910499294, (byte) 3);
            case 4:
                return new bh0(ih0Var, r4833348786910499294, (byte) 4);
            case 5:
                return new bh0(ih0Var, r4833348786910499294, (byte) 5);
            default:
                return new bh0(ih0Var, r4833348786910499294, (byte) 6);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        ih0 ih0Var = this.a;
        switch (b) {
            case 0:
                new bh0(ih0Var, (R4833348786910499294) obj2, (byte) 0).invokeSuspend(o9245300239821758723);
                break;
            case 1:
                new bh0(ih0Var, (R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
                break;
            case 2:
                new bh0(ih0Var, (R4833348786910499294) obj2, (byte) 2).invokeSuspend(o9245300239821758723);
                break;
            case 3:
                new bh0(ih0Var, (R4833348786910499294) obj2, (byte) 3).invokeSuspend(o9245300239821758723);
                break;
            case 4:
                new bh0(ih0Var, (R4833348786910499294) obj2, (byte) 4).invokeSuspend(o9245300239821758723);
                break;
            case 5:
                new bh0(ih0Var, (R4833348786910499294) obj2, (byte) 5).invokeSuspend(o9245300239821758723);
                break;
            default:
                new bh0(ih0Var, (R4833348786910499294) obj2, (byte) 6).invokeSuspend(o9245300239821758723);
                break;
        }
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        switch (this.t) {
            case 0:
                E17665849472693074628.k(obj);
                P14306640982153864715 a = this.a.a();
                if (a != null) {
                    a.c();
                }
                break;
            case 1:
                E17665849472693074628.k(obj);
                synchronized (this.a) {
                }
                break;
            case 2:
                E17665849472693074628.k(obj);
                this.a.a();
                break;
            case 3:
                E17665849472693074628.k(obj);
                P14306640982153864715 a2 = this.a.a();
                if (a2 != null) {
                    a2.d();
                }
                break;
            case 4:
                E17665849472693074628.k(obj);
                this.a.a();
                break;
            case 5:
                E17665849472693074628.k(obj);
                synchronized (this.a) {
                }
                break;
            default:
                E17665849472693074628.k(obj);
                P5733283974459951585 p5733283974459951585 = rw0.f;
                ih0 ih0Var = this.a;
                U2722688686349128662 u2722688686349128662 = U2722688686349128662.b;
                G8001132634698687269 context = getContext();
                u2722688686349128662.getClass();
                R7033599853981556291.E(O8620973563946607355.a(S10823041268949770285.O(u2722688686349128662, context).minusKey(ti3.b).minusKey(B14824868959299866349.e).minusKey(P2382941533350862833.p)), null, null, new bh0(ih0Var, null, (byte) 5), 3);
                break;
        }
        return O9245300239821758723.a;
    }
}
