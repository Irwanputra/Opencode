package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class df0 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public boolean a;
    public final /* synthetic */ ads_mobile_sdk.rf0 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ df0(ads_mobile_sdk.rf0 rf0Var, dev.epro.r0.R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.b = rf0Var;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        byte b = this.t;
        ads_mobile_sdk.rf0 rf0Var = this.b;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.df0(rf0Var, r4833348786910499294, (byte) 0);
            case 1:
                return new ads_mobile_sdk.df0(rf0Var, r4833348786910499294, (byte) 1);
            case 2:
                return new ads_mobile_sdk.df0(rf0Var, r4833348786910499294, (byte) 2);
            case 3:
                return new ads_mobile_sdk.df0(rf0Var, r4833348786910499294, (byte) 3);
            case 4:
                return new ads_mobile_sdk.df0(rf0Var, r4833348786910499294, (byte) 4);
            case 5:
                return new ads_mobile_sdk.df0(rf0Var, r4833348786910499294, (byte) 5);
            case 6:
                return new ads_mobile_sdk.df0(rf0Var, r4833348786910499294, (byte) 6);
            case 7:
                return new ads_mobile_sdk.df0(rf0Var, r4833348786910499294, (byte) 7);
            default:
                return new ads_mobile_sdk.df0(rf0Var, r4833348786910499294, (byte) 8);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        ads_mobile_sdk.rf0 rf0Var = this.b;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.df0(rf0Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 0).invokeSuspend(o9245300239821758723);
            case 1:
                return new ads_mobile_sdk.df0(rf0Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
            case 2:
                return new ads_mobile_sdk.df0(rf0Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 2).invokeSuspend(o9245300239821758723);
            case 3:
                return new ads_mobile_sdk.df0(rf0Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 3).invokeSuspend(o9245300239821758723);
            case 4:
                return new ads_mobile_sdk.df0(rf0Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 4).invokeSuspend(o9245300239821758723);
            case 5:
                return new ads_mobile_sdk.df0(rf0Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 5).invokeSuspend(o9245300239821758723);
            case 6:
                return new ads_mobile_sdk.df0(rf0Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 6).invokeSuspend(o9245300239821758723);
            case 7:
                return new ads_mobile_sdk.df0(rf0Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 7).invokeSuspend(o9245300239821758723);
            default:
                return new ads_mobile_sdk.df0(rf0Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 8).invokeSuspend(o9245300239821758723);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        ads_mobile_sdk.rf0 rf0Var = this.b;
        dev.epro.r0.Z3437138737604933638 z3437138737604933638 = dev.epro.r0.Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.a;
                if (!z) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    this.a = true;
                    android.net.Uri uri = ads_mobile_sdk.rf0.q;
                    if (rf0Var.a((android.app.Activity) null, (dev.epro.r0.K14749510448791472029) this) == z3437138737604933638) {
                    }
                } else if (!z) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                break;
            case 1:
                boolean z2 = this.a;
                if (!z2) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    this.a = true;
                    android.net.Uri uri2 = ads_mobile_sdk.rf0.q;
                    if (rf0Var.a((android.app.Activity) null, (dev.epro.r0.K14749510448791472029) this) == z3437138737604933638) {
                    }
                } else if (!z2) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                break;
            case 2:
                boolean z3 = this.a;
                if (!z3) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    this.a = true;
                    android.net.Uri uri3 = ads_mobile_sdk.rf0.q;
                    if (rf0Var.d(this) == z3437138737604933638) {
                    }
                } else if (!z3) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                break;
            case 3:
                boolean z4 = this.a;
                if (!z4) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    this.a = true;
                    android.net.Uri uri4 = ads_mobile_sdk.rf0.q;
                    if (rf0Var.e(this) == z3437138737604933638) {
                    }
                } else if (!z4) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                break;
            case 4:
                boolean z5 = this.a;
                if (!z5) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    this.a = true;
                    android.net.Uri uri5 = ads_mobile_sdk.rf0.q;
                    ads_mobile_sdk.w81 w81Var = rf0Var.j;
                    dev.epro.r0.S15377854226413623883 s15377854226413623883 = new dev.epro.r0.S15377854226413623883(rf0Var);
                    w81Var.getClass();
                    java.lang.Object objA = ads_mobile_sdk.w81.a(w81Var, ads_mobile_sdk.p71.d, (dev.epro.r0.V3805393212198381221) s15377854226413623883, (dev.epro.r0.K14749510448791472029) this);
                    if (objA != z3437138737604933638) {
                        objA = o9245300239821758723;
                    }
                    if (objA == z3437138737604933638) {
                    }
                } else if (!z5) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                break;
            case 5:
                boolean z6 = this.a;
                if (!z6) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    this.a = true;
                    if (ads_mobile_sdk.rf0.b(rf0Var, (dev.epro.r0.K14749510448791472029) this) == z3437138737604933638) {
                    }
                } else if (!z6) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                break;
            case 6:
                boolean z7 = this.a;
                if (!z7) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    this.a = true;
                    if (ads_mobile_sdk.rf0.a(rf0Var, (dev.epro.r0.K14749510448791472029) this) == z3437138737604933638) {
                    }
                } else if (!z7) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                break;
            case 7:
                boolean z8 = this.a;
                if (!z8) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    this.a = true;
                    android.net.Uri uri6 = ads_mobile_sdk.rf0.q;
                    if (rf0Var.a((android.app.Activity) null, (dev.epro.r0.K14749510448791472029) this) == z3437138737604933638) {
                    }
                } else if (!z8) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                break;
            default:
                boolean z9 = this.a;
                if (!z9) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    this.a = true;
                    android.net.Uri uri7 = ads_mobile_sdk.rf0.q;
                    if (rf0Var.a((android.app.Activity) null, (dev.epro.r0.K14749510448791472029) this) == z3437138737604933638) {
                    }
                } else if (!z9) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                break;
        }
        return z3437138737604933638;
    }
}
