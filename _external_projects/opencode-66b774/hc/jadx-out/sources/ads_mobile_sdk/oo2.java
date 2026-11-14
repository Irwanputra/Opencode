package ads_mobile_sdk;

import dev.epro.r0.B14824868959299866349;
import dev.epro.r0.D16573472668995260995;
import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.G8001132634698687269;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.O8620973563946607355;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.P2382941533350862833;
import dev.epro.r0.P5733283974459951585;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.U2722688686349128662;
import dev.epro.r0.V16504496955554646429;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class oo2 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ V16504496955554646429 a;
    public final /* synthetic */ D16573472668995260995 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oo2(D16573472668995260995 d16573472668995260995, V16504496955554646429 v16504496955554646429, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.a = v16504496955554646429;
        this.b = d16573472668995260995;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        D16573472668995260995 d16573472668995260995 = this.b;
        V16504496955554646429 v16504496955554646429 = this.a;
        switch (b) {
            case 0:
                return new oo2(d16573472668995260995, v16504496955554646429, r4833348786910499294, (byte) 0);
            default:
                return new oo2(d16573472668995260995, v16504496955554646429, r4833348786910499294, (byte) 1);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        D16573472668995260995 d16573472668995260995 = this.b;
        V16504496955554646429 v16504496955554646429 = this.a;
        switch (b) {
            case 0:
                new oo2(d16573472668995260995, v16504496955554646429, (R4833348786910499294) obj2, (byte) 0).invokeSuspend(o9245300239821758723);
                break;
            default:
                new oo2(d16573472668995260995, v16504496955554646429, (R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
                break;
        }
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        D16573472668995260995 d16573472668995260995 = this.b;
        V16504496955554646429 v16504496955554646429 = this.a;
        switch (b) {
            case 0:
                E17665849472693074628.k(obj);
                v16504496955554646429.a(d16573472668995260995);
                break;
            default:
                E17665849472693074628.k(obj);
                P5733283974459951585 p5733283974459951585 = rw0.f;
                U2722688686349128662 u2722688686349128662 = U2722688686349128662.b;
                G8001132634698687269 context = getContext();
                u2722688686349128662.getClass();
                R7033599853981556291.E(O8620973563946607355.a(S10823041268949770285.O(u2722688686349128662, context).minusKey(ti3.b).minusKey(B14824868959299866349.e).minusKey(P2382941533350862833.p)), null, null, new oo2(d16573472668995260995, v16504496955554646429, null, (byte) 0), 3);
                break;
        }
        return o9245300239821758723;
    }
}
