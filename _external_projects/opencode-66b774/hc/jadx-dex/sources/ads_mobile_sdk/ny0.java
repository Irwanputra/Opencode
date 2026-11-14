package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ny0 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public final /* synthetic */ ads_mobile_sdk.sy0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny0(ads_mobile_sdk.sy0 sy0Var, int i, int i2, boolean z, boolean z2, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.a = sy0Var;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        return new ads_mobile_sdk.ny0(this.a, this.b, this.c, this.d, this.e, r4833348786910499294);
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ads_mobile_sdk.ny0 ny0VarCreate = create((dev.epro.r0.R4833348786910499294) obj2, (dev.epro.r0.W5797197595347441198) obj);
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        ny0VarCreate.invokeSuspend(o9245300239821758723);
        return o9245300239821758723;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        dev.epro.r0.O9245300239821758723 o9245300239821758723;
        dev.epro.r0.E17665849472693074628.k(obj);
        ads_mobile_sdk.sy0 sy0Var = this.a;
        java.lang.Object obj2 = sy0Var.f;
        int i = this.b;
        int i2 = this.c;
        boolean z = this.d;
        boolean z2 = this.e;
        synchronized (obj2) {
            boolean z3 = i != i2;
            try {
                boolean z4 = sy0Var.k;
                boolean z5 = !z4 && i2 == 2;
                boolean z6 = z3 && i2 == 2;
                boolean z7 = z3 && i2 == 3;
                boolean z8 = z3 && i2 == 4;
                boolean z9 = z != z2;
                sy0Var.k = z4 || z5;
                if (z5) {
                    synchronized (sy0Var.f) {
                    }
                }
                if (z6) {
                    synchronized (sy0Var.f) {
                    }
                }
                if (z7) {
                    synchronized (sy0Var.f) {
                    }
                }
                if (z8) {
                    sy0Var.getVideoLifecycleCallbacks();
                }
                if (z9) {
                    sy0Var.getVideoLifecycleCallbacks();
                }
                o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return o9245300239821758723;
    }
}
