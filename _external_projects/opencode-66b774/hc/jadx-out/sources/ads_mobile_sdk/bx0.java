package ads_mobile_sdk;

import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.G16864365537574524285;
import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.Z3437138737604933638;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class bx0 extends R14062301455140331524 implements L12639328004344855510 {
    public boolean a;
    public final /* synthetic */ tx0 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx0(tx0 tx0Var, boolean z, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.t = (byte) 6;
        this.b = tx0Var;
        this.a = z;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        tx0 tx0Var = this.b;
        switch (b) {
            case 0:
                return new bx0(tx0Var, r4833348786910499294, (byte) 0);
            case 1:
                return new bx0(tx0Var, r4833348786910499294, (byte) 1);
            case 2:
                return new bx0(tx0Var, r4833348786910499294, (byte) 2);
            case 3:
                return new bx0(tx0Var, r4833348786910499294, (byte) 3);
            case 4:
                return new bx0(tx0Var, r4833348786910499294, (byte) 4);
            case 5:
                return new bx0(tx0Var, r4833348786910499294, (byte) 5);
            case 6:
                return new bx0(tx0Var, this.a, r4833348786910499294);
            case 7:
                return new bx0(tx0Var, r4833348786910499294, (byte) 7);
            default:
                return new bx0(tx0Var, r4833348786910499294, (byte) 8);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        tx0 tx0Var = this.b;
        switch (b) {
            case 0:
                return new bx0(tx0Var, (R4833348786910499294) obj2, (byte) 0).invokeSuspend(o9245300239821758723);
            case 1:
                return new bx0(tx0Var, (R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
            case 2:
                return new bx0(tx0Var, (R4833348786910499294) obj2, (byte) 2).invokeSuspend(o9245300239821758723);
            case 3:
                return new bx0(tx0Var, (R4833348786910499294) obj2, (byte) 3).invokeSuspend(o9245300239821758723);
            case 4:
                return new bx0(tx0Var, (R4833348786910499294) obj2, (byte) 4).invokeSuspend(o9245300239821758723);
            case 5:
                return new bx0(tx0Var, (R4833348786910499294) obj2, (byte) 5).invokeSuspend(o9245300239821758723);
            case 6:
                new bx0(tx0Var, this.a, (R4833348786910499294) obj2).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 7:
                return new bx0(tx0Var, (R4833348786910499294) obj2, (byte) 7).invokeSuspend(o9245300239821758723);
            default:
                return new bx0(tx0Var, (R4833348786910499294) obj2, (byte) 8).invokeSuspend(o9245300239821758723);
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        switch (this.t) {
            case 0:
                Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
                boolean z = this.a;
                if (!z) {
                    E17665849472693074628.k(obj);
                    tx0 tx0Var = this.b;
                    this.a = true;
                    if (tx0Var.a(this) == z3437138737604933638) {
                        return z3437138737604933638;
                    }
                } else {
                    if (!z) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return O9245300239821758723.a;
            case 1:
                Z3437138737604933638 z34371387376049336382 = Z3437138737604933638.a;
                boolean z2 = this.a;
                if (!z2) {
                    E17665849472693074628.k(obj);
                    tx0 tx0Var2 = this.b;
                    this.a = true;
                    if (tx0Var2.a(this) == z34371387376049336382) {
                        return z34371387376049336382;
                    }
                } else {
                    if (!z2) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return O9245300239821758723.a;
            case 2:
                Z3437138737604933638 z34371387376049336383 = Z3437138737604933638.a;
                boolean z3 = this.a;
                if (!z3) {
                    E17665849472693074628.k(obj);
                    tx0 tx0Var3 = this.b;
                    this.a = true;
                    if (tx0Var3.a("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();", this) == z34371387376049336383) {
                        return z34371387376049336383;
                    }
                } else {
                    if (!z3) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return O9245300239821758723.a;
            case 3:
                Z3437138737604933638 z34371387376049336384 = Z3437138737604933638.a;
                boolean z4 = this.a;
                if (!z4) {
                    E17665849472693074628.k(obj);
                    tx0 tx0Var4 = this.b;
                    this.a = true;
                    if (tx0Var4.a(this) == z34371387376049336384) {
                        return z34371387376049336384;
                    }
                } else {
                    if (!z4) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return O9245300239821758723.a;
            case 4:
                Z3437138737604933638 z34371387376049336385 = Z3437138737604933638.a;
                boolean z5 = this.a;
                if (!z5) {
                    E17665849472693074628.k(obj);
                    tx0 tx0Var5 = this.b;
                    this.a = true;
                    if (tx0Var5.a(this) == z34371387376049336385) {
                        return z34371387376049336385;
                    }
                } else {
                    if (!z5) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return O9245300239821758723.a;
            case 5:
                Z3437138737604933638 z34371387376049336386 = Z3437138737604933638.a;
                boolean z6 = this.a;
                if (!z6) {
                    E17665849472693074628.k(obj);
                    G16864365537574524285 g16864365537574524285 = this.b.p;
                    if (g16864365537574524285 != null) {
                        this.a = true;
                        if (g16864365537574524285.a(this) == z34371387376049336386) {
                            return z34371387376049336386;
                        }
                    }
                } else {
                    if (!z6) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return O9245300239821758723.a;
            case 6:
                E17665849472693074628.k(obj);
                et0 et0Var = this.b.f113o;
                if (et0Var != null) {
                    if ((!this.a || et0Var.h()) && !et0Var.f()) {
                        iu iuVar = et0Var.r;
                        if (iuVar != null) {
                            iuVar.setVisibility(0);
                        }
                        et0Var.s = false;
                    } else {
                        iu iuVar2 = et0Var.r;
                        if (iuVar2 != null) {
                            iuVar2.setVisibility(8);
                        }
                        et0Var.s = true;
                    }
                }
                return O9245300239821758723.a;
            case 7:
                Z3437138737604933638 z34371387376049336387 = Z3437138737604933638.a;
                boolean z7 = this.a;
                if (!z7) {
                    E17665849472693074628.k(obj);
                    x60 x60Var = this.b.d;
                    if (x60Var == null) {
                        return null;
                    }
                    this.a = true;
                    obj = x60.a(x60Var, "native:view_create", this);
                    if (obj == z34371387376049336387) {
                        return z34371387376049336387;
                    }
                } else {
                    if (!z7) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return (kh3) obj;
            default:
                Z3437138737604933638 z34371387376049336388 = Z3437138737604933638.a;
                boolean z8 = this.a;
                if (!z8) {
                    E17665849472693074628.k(obj);
                    x60 x60Var2 = this.b.d;
                    if (x60Var2 == null) {
                        return null;
                    }
                    this.a = true;
                    if (x60Var2.a("action", "make_wv", true, (K14749510448791472029) this) == z34371387376049336388) {
                        return z34371387376049336388;
                    }
                } else {
                    if (!z8) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return O9245300239821758723.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bx0(tx0 tx0Var, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.b = tx0Var;
    }
}
