package ads_mobile_sdk;

import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.G14522929311705694578;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.W5797197595347441198;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class eh0 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ ih0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eh0(R4833348786910499294 r4833348786910499294, ih0 ih0Var, String str, String str2, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.a = ih0Var;
        this.b = str;
        this.c = str2;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        switch (this.t) {
            case 0:
                return new eh0(r4833348786910499294, this.a, this.b, this.c, (byte) 0);
            default:
                return new eh0(r4833348786910499294, this.a, this.b, this.c, (byte) 1);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                ((eh0) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
                break;
            default:
                ((eh0) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
                break;
        }
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        G14522929311705694578 g14522929311705694578;
        G14522929311705694578 g145229293117056945782;
        switch (this.t) {
            case 0:
                E17665849472693074628.k(obj);
                ih0 ih0Var = this.a;
                synchronized (ih0Var) {
                    g14522929311705694578 = ih0Var.e;
                }
                if (g14522929311705694578 != null) {
                    g14522929311705694578.a(this.b);
                }
                return O9245300239821758723.a;
            default:
                E17665849472693074628.k(obj);
                ih0 ih0Var2 = this.a;
                synchronized (ih0Var2) {
                    g145229293117056945782 = ih0Var2.e;
                }
                if (g145229293117056945782 != null) {
                    g145229293117056945782.a(this.b);
                }
                return O9245300239821758723.a;
        }
    }
}
