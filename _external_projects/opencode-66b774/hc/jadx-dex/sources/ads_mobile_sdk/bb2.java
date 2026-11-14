package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class bb2 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public /* synthetic */ java.lang.Object a;
    public final /* synthetic */ ads_mobile_sdk.fb2 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb2(ads_mobile_sdk.fb2 fb2Var, int i, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.b = fb2Var;
        this.c = i;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        ads_mobile_sdk.bb2 bb2Var = new ads_mobile_sdk.bb2(this.b, this.c, r4833348786910499294);
        bb2Var.a = obj;
        return bb2Var;
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ads_mobile_sdk.bb2 bb2VarCreate = create((dev.epro.r0.R4833348786910499294) obj2, (dev.epro.r0.W5797197595347441198) obj);
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        bb2VarCreate.invokeSuspend(o9245300239821758723);
        return o9245300239821758723;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        dev.epro.r0.E17665849472693074628.k(obj);
        dev.epro.r0.W5797197595347441198 w5797197595347441198 = (dev.epro.r0.W5797197595347441198) this.a;
        dev.epro.r0.P8646985343900033725 p8646985343900033725N = dev.epro.r0.W7808703833045379622.N(0, this.c);
        java.util.ArrayList arrayList = new java.util.ArrayList(dev.epro.r0.Z115818233709597990.k0(p8646985343900033725N, 10));
        dev.epro.r0.M18282718993909554674 it = p8646985343900033725N.iterator();
        while (true) {
            boolean z = it.c;
            ads_mobile_sdk.fb2 fb2Var = this.b;
            if (!z) {
                fb2Var.g = arrayList;
                return dev.epro.r0.O9245300239821758723.a;
            }
            ((dev.epro.r0.B16024634506412482045) it).nextInt();
            arrayList.add(dev.epro.r0.R7033599853981556291.E(w5797197595347441198, fb2Var.b, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.N4024785987441166868(fb2Var, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2));
        }
    }
}
