package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class bx0 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public boolean a;
    public final /* synthetic */ ads_mobile_sdk.tx0 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx0(ads_mobile_sdk.tx0 tx0Var, boolean z, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.t = (byte) 6;
        this.b = tx0Var;
        this.a = z;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        byte b = this.t;
        ads_mobile_sdk.tx0 tx0Var = this.b;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.bx0(tx0Var, r4833348786910499294, (byte) 0);
            case 1:
                return new ads_mobile_sdk.bx0(tx0Var, r4833348786910499294, (byte) 1);
            case 2:
                return new ads_mobile_sdk.bx0(tx0Var, r4833348786910499294, (byte) 2);
            case 3:
                return new ads_mobile_sdk.bx0(tx0Var, r4833348786910499294, (byte) 3);
            case 4:
                return new ads_mobile_sdk.bx0(tx0Var, r4833348786910499294, (byte) 4);
            case 5:
                return new ads_mobile_sdk.bx0(tx0Var, r4833348786910499294, (byte) 5);
            case 6:
                return new ads_mobile_sdk.bx0(tx0Var, this.a, r4833348786910499294);
            case 7:
                return new ads_mobile_sdk.bx0(tx0Var, r4833348786910499294, (byte) 7);
            default:
                return new ads_mobile_sdk.bx0(tx0Var, r4833348786910499294, (byte) 8);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        ads_mobile_sdk.tx0 tx0Var = this.b;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.bx0(tx0Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 0).invokeSuspend(o9245300239821758723);
            case 1:
                return new ads_mobile_sdk.bx0(tx0Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
            case 2:
                return new ads_mobile_sdk.bx0(tx0Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 2).invokeSuspend(o9245300239821758723);
            case 3:
                return new ads_mobile_sdk.bx0(tx0Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 3).invokeSuspend(o9245300239821758723);
            case 4:
                return new ads_mobile_sdk.bx0(tx0Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 4).invokeSuspend(o9245300239821758723);
            case 5:
                return new ads_mobile_sdk.bx0(tx0Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 5).invokeSuspend(o9245300239821758723);
            case 6:
                new ads_mobile_sdk.bx0(tx0Var, this.a, (dev.epro.r0.R4833348786910499294) obj2).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 7:
                return new ads_mobile_sdk.bx0(tx0Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 7).invokeSuspend(o9245300239821758723);
            default:
                return new ads_mobile_sdk.bx0(tx0Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 8).invokeSuspend(o9245300239821758723);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        switch (this.t) {
            case 0:
                dev.epro.r0.Z3437138737604933638 z3437138737604933638 = dev.epro.r0.Z3437138737604933638.a;
                boolean z = this.a;
                if (!z) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    ads_mobile_sdk.tx0 tx0Var = this.b;
                    this.a = true;
                    if (tx0Var.a((dev.epro.r0.R4833348786910499294) this) == z3437138737604933638) {
                        return z3437138737604933638;
                    }
                } else {
                    if (!z) {
                        dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                return dev.epro.r0.O9245300239821758723.a;
            case 1:
                dev.epro.r0.Z3437138737604933638 z34371387376049336382 = dev.epro.r0.Z3437138737604933638.a;
                boolean z2 = this.a;
                if (!z2) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    ads_mobile_sdk.tx0 tx0Var2 = this.b;
                    this.a = true;
                    if (tx0Var2.a((dev.epro.r0.R4833348786910499294) this) == z34371387376049336382) {
                        return z34371387376049336382;
                    }
                } else {
                    if (!z2) {
                        dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                return dev.epro.r0.O9245300239821758723.a;
            case 2:
                dev.epro.r0.Z3437138737604933638 z34371387376049336383 = dev.epro.r0.Z3437138737604933638.a;
                boolean z3 = this.a;
                if (!z3) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    ads_mobile_sdk.tx0 tx0Var3 = this.b;
                    this.a = true;
                    if (tx0Var3.a("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();", this) == z34371387376049336383) {
                        return z34371387376049336383;
                    }
                } else {
                    if (!z3) {
                        dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                return dev.epro.r0.O9245300239821758723.a;
            case 3:
                dev.epro.r0.Z3437138737604933638 z34371387376049336384 = dev.epro.r0.Z3437138737604933638.a;
                boolean z4 = this.a;
                if (!z4) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    ads_mobile_sdk.tx0 tx0Var4 = this.b;
                    this.a = true;
                    if (tx0Var4.a((dev.epro.r0.R4833348786910499294) this) == z34371387376049336384) {
                        return z34371387376049336384;
                    }
                } else {
                    if (!z4) {
                        dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                return dev.epro.r0.O9245300239821758723.a;
            case 4:
                dev.epro.r0.Z3437138737604933638 z34371387376049336385 = dev.epro.r0.Z3437138737604933638.a;
                boolean z5 = this.a;
                if (!z5) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    ads_mobile_sdk.tx0 tx0Var5 = this.b;
                    this.a = true;
                    if (tx0Var5.a((dev.epro.r0.R4833348786910499294) this) == z34371387376049336385) {
                        return z34371387376049336385;
                    }
                } else {
                    if (!z5) {
                        dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                return dev.epro.r0.O9245300239821758723.a;
            case 5:
                dev.epro.r0.Z3437138737604933638 z34371387376049336386 = dev.epro.r0.Z3437138737604933638.a;
                boolean z6 = this.a;
                if (!z6) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    dev.epro.r0.G16864365537574524285 g16864365537574524285 = this.b.p;
                    if (g16864365537574524285 != null) {
                        this.a = true;
                        if (g16864365537574524285.a(this) == z34371387376049336386) {
                            return z34371387376049336386;
                        }
                    }
                } else {
                    if (!z6) {
                        dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                return dev.epro.r0.O9245300239821758723.a;
            case 6:
                dev.epro.r0.E17665849472693074628.k(obj);
                ads_mobile_sdk.et0 et0Var = this.b.f113o;
                if (et0Var != null) {
                    if ((!this.a || et0Var.h()) && !et0Var.f()) {
                        ads_mobile_sdk.iu iuVar = et0Var.r;
                        if (iuVar != null) {
                            iuVar.setVisibility(0);
                        }
                        et0Var.s = false;
                    } else {
                        ads_mobile_sdk.iu iuVar2 = et0Var.r;
                        if (iuVar2 != null) {
                            iuVar2.setVisibility(8);
                        }
                        et0Var.s = true;
                    }
                }
                return dev.epro.r0.O9245300239821758723.a;
            case 7:
                dev.epro.r0.Z3437138737604933638 z34371387376049336387 = dev.epro.r0.Z3437138737604933638.a;
                boolean z7 = this.a;
                if (!z7) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    ads_mobile_sdk.x60 x60Var = this.b.d;
                    if (x60Var == null) {
                        return null;
                    }
                    this.a = true;
                    obj = ads_mobile_sdk.x60.a(x60Var, "native:view_create", this);
                    if (obj == z34371387376049336387) {
                        return z34371387376049336387;
                    }
                } else {
                    if (!z7) {
                        dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                return (ads_mobile_sdk.kh3) obj;
            default:
                dev.epro.r0.Z3437138737604933638 z34371387376049336388 = dev.epro.r0.Z3437138737604933638.a;
                boolean z8 = this.a;
                if (!z8) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    ads_mobile_sdk.x60 x60Var2 = this.b.d;
                    if (x60Var2 == null) {
                        return null;
                    }
                    this.a = true;
                    if (x60Var2.a("action", "make_wv", true, (dev.epro.r0.K14749510448791472029) this) == z34371387376049336388) {
                        return z34371387376049336388;
                    }
                } else {
                    if (!z8) {
                        dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                return dev.epro.r0.O9245300239821758723.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bx0(ads_mobile_sdk.tx0 tx0Var, dev.epro.r0.R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.b = tx0Var;
    }
}
