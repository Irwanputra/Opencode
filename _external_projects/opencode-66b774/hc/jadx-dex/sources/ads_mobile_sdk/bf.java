package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class bf extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bf(java.lang.String str, java.lang.Object obj, dev.epro.r0.R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.b = str;
        this.a = obj;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        byte b = this.t;
        java.lang.String str = this.b;
        switch (b) {
            case 0:
                ads_mobile_sdk.bf bfVar = new ads_mobile_sdk.bf(str, r4833348786910499294, (byte) 0);
                bfVar.a = obj;
                return bfVar;
            case 1:
                ads_mobile_sdk.bf bfVar2 = new ads_mobile_sdk.bf(str, r4833348786910499294, (byte) 1);
                bfVar2.a = obj;
                return bfVar2;
            case 2:
                return new ads_mobile_sdk.bf(str, this.a, r4833348786910499294, (byte) 2);
            case 3:
                return new ads_mobile_sdk.bf(str, this.a, r4833348786910499294, (byte) 3);
            case 4:
                return new ads_mobile_sdk.bf(str, this.a, r4833348786910499294, (byte) 4);
            case 5:
                return new ads_mobile_sdk.bf(str, this.a, r4833348786910499294, (byte) 5);
            case 6:
                return new ads_mobile_sdk.bf(str, this.a, r4833348786910499294, (byte) 6);
            case 7:
                return new ads_mobile_sdk.bf(str, this.a, r4833348786910499294, (byte) 7);
            case 8:
                return new ads_mobile_sdk.bf(str, this.a, r4833348786910499294, (byte) 8);
            default:
                return new ads_mobile_sdk.bf(str, this.a, r4833348786910499294, (byte) 9);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        byte b = this.t;
        java.lang.String str = this.b;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        switch (b) {
            case 0:
                ads_mobile_sdk.bf bfVar = new ads_mobile_sdk.bf(str, (dev.epro.r0.R4833348786910499294) obj2, (byte) 0);
                bfVar.a = (ads_mobile_sdk.ze) obj;
                break;
            case 1:
                ads_mobile_sdk.bf bfVar2 = new ads_mobile_sdk.bf(str, (dev.epro.r0.R4833348786910499294) obj2, (byte) 1);
                bfVar2.a = (ads_mobile_sdk.cq0) obj;
                break;
            case 2:
                create((dev.epro.r0.R4833348786910499294) obj2, (dev.epro.r0.W5797197595347441198) obj).invokeSuspend(o9245300239821758723);
                break;
            case 3:
                create((dev.epro.r0.R4833348786910499294) obj2, (dev.epro.r0.W5797197595347441198) obj).invokeSuspend(o9245300239821758723);
                break;
            case 4:
                create((dev.epro.r0.R4833348786910499294) obj2, (dev.epro.r0.W5797197595347441198) obj).invokeSuspend(o9245300239821758723);
                break;
            case 5:
                create((dev.epro.r0.R4833348786910499294) obj2, (dev.epro.r0.W5797197595347441198) obj).invokeSuspend(o9245300239821758723);
                break;
            case 6:
                create((dev.epro.r0.R4833348786910499294) obj2, (dev.epro.r0.W5797197595347441198) obj).invokeSuspend(o9245300239821758723);
                break;
            case 7:
                create((dev.epro.r0.R4833348786910499294) obj2, (dev.epro.r0.W5797197595347441198) obj).invokeSuspend(o9245300239821758723);
                break;
            case 8:
                create((dev.epro.r0.R4833348786910499294) obj2, (dev.epro.r0.W5797197595347441198) obj).invokeSuspend(o9245300239821758723);
                break;
            default:
                create((dev.epro.r0.R4833348786910499294) obj2, (dev.epro.r0.W5797197595347441198) obj).invokeSuspend(o9245300239821758723);
                break;
        }
        return o9245300239821758723;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        byte b = this.t;
        java.lang.String str = this.b;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        switch (b) {
            case 0:
                dev.epro.r0.E17665849472693074628.k(obj);
                dev.epro.r0.W12857842498428870907 w12857842498428870907N = ((ads_mobile_sdk.ze) this.a).n();
                java.util.Collections.unmodifiableMap(java.util.Collections.unmodifiableMap(((ads_mobile_sdk.ze) w12857842498428870907N.b).logs_)).getClass();
                str.getClass();
                w12857842498428870907N.b();
                ads_mobile_sdk.ze zeVar = (ads_mobile_sdk.ze) w12857842498428870907N.b;
                ads_mobile_sdk.gn1 gn1Var = zeVar.logs_;
                if (!gn1Var.a) {
                    zeVar.logs_ = gn1Var.b();
                }
                zeVar.logs_.remove(str);
                break;
            case 1:
                dev.epro.r0.E17665849472693074628.k(obj);
                dev.epro.r0.Y5584543079932758380 y5584543079932758380N = ((ads_mobile_sdk.cq0) this.a).n();
                str.getClass();
                y5584543079932758380N.b();
                ((ads_mobile_sdk.cq0) y5584543079932758380N.b).b(str);
                break;
            case 2:
                dev.epro.r0.E17665849472693074628.k(obj);
                ((dev.epro.r0.B699768225374366618) this.a).d();
                break;
            case 3:
                dev.epro.r0.E17665849472693074628.k(obj);
                ((dev.epro.r0.B699768225374366618) this.a).onDestroy();
                break;
            case 4:
                dev.epro.r0.E17665849472693074628.k(obj);
                ((dev.epro.r0.B699768225374366618) this.a).onPause();
                break;
            case 5:
                dev.epro.r0.E17665849472693074628.k(obj);
                ((dev.epro.r0.B699768225374366618) this.a).c();
                break;
            case 6:
                dev.epro.r0.E17665849472693074628.k(obj);
                ((dev.epro.r0.B699768225374366618) this.a).onResume();
                break;
            case 7:
                dev.epro.r0.E17665849472693074628.k(obj);
                ((dev.epro.r0.B699768225374366618) this.a).a$1();
                break;
            case 8:
                dev.epro.r0.E17665849472693074628.k(obj);
                ((dev.epro.r0.B699768225374366618) this.a).onStop();
                break;
            default:
                dev.epro.r0.E17665849472693074628.k(obj);
                ((dev.epro.r0.B699768225374366618) this.a).b$1();
                break;
        }
        return o9245300239821758723;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bf(java.lang.String str, dev.epro.r0.R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.b = str;
    }
}
