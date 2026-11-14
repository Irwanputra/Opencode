package ads_mobile_sdk;

import ads_mobile_sdk.fb;
import ads_mobile_sdk.rf0;
import android.app.Activity;
import android.net.Uri;
import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.V3805393212198381221;
import dev.epro.r0.Z3437138737604933638;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class df0 extends R14062301455140331524 implements L12639328004344855510 {
    public boolean a;
    public final /* synthetic */ rf0 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ df0(rf0 rf0Var, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.b = rf0Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        rf0 rf0Var = this.b;
        switch (b) {
            case 0:
                return new df0(rf0Var, r4833348786910499294, (byte) 0);
            case 1:
                return new df0(rf0Var, r4833348786910499294, (byte) 1);
            case 2:
                return new df0(rf0Var, r4833348786910499294, (byte) 2);
            case 3:
                return new df0(rf0Var, r4833348786910499294, (byte) 3);
            case 4:
                return new df0(rf0Var, r4833348786910499294, (byte) 4);
            case 5:
                return new df0(rf0Var, r4833348786910499294, (byte) 5);
            case 6:
                return new df0(rf0Var, r4833348786910499294, (byte) 6);
            case 7:
                return new df0(rf0Var, r4833348786910499294, (byte) 7);
            default:
                return new df0(rf0Var, r4833348786910499294, (byte) 8);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        rf0 rf0Var = this.b;
        switch (b) {
            case 0:
                return new df0(rf0Var, (R4833348786910499294) obj2, (byte) 0).invokeSuspend(o9245300239821758723);
            case 1:
                return new df0(rf0Var, (R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
            case 2:
                return new df0(rf0Var, (R4833348786910499294) obj2, (byte) 2).invokeSuspend(o9245300239821758723);
            case 3:
                return new df0(rf0Var, (R4833348786910499294) obj2, (byte) 3).invokeSuspend(o9245300239821758723);
            case 4:
                return new df0(rf0Var, (R4833348786910499294) obj2, (byte) 4).invokeSuspend(o9245300239821758723);
            case 5:
                return new df0(rf0Var, (R4833348786910499294) obj2, (byte) 5).invokeSuspend(o9245300239821758723);
            case 6:
                return new df0(rf0Var, (R4833348786910499294) obj2, (byte) 6).invokeSuspend(o9245300239821758723);
            case 7:
                return new df0(rf0Var, (R4833348786910499294) obj2, (byte) 7).invokeSuspend(o9245300239821758723);
            default:
                return new df0(rf0Var, (R4833348786910499294) obj2, (byte) 8).invokeSuspend(o9245300239821758723);
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) throws IOException {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        final rf0 rf0Var = this.b;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.a;
                if (!z) {
                    E17665849472693074628.k(obj);
                    this.a = true;
                    Uri uri = rf0.q;
                    if (rf0Var.a((Activity) null, this) == z3437138737604933638) {
                    }
                } else if (!z) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            case 1:
                boolean z2 = this.a;
                if (!z2) {
                    E17665849472693074628.k(obj);
                    this.a = true;
                    Uri uri2 = rf0.q;
                    if (rf0Var.a((Activity) null, this) == z3437138737604933638) {
                    }
                } else if (!z2) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            case 2:
                boolean z3 = this.a;
                if (!z3) {
                    E17665849472693074628.k(obj);
                    this.a = true;
                    Uri uri3 = rf0.q;
                    if (rf0Var.d(this) == z3437138737604933638) {
                    }
                } else if (!z3) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            case 3:
                boolean z4 = this.a;
                if (!z4) {
                    E17665849472693074628.k(obj);
                    this.a = true;
                    Uri uri4 = rf0.q;
                    if (rf0Var.e(this) == z3437138737604933638) {
                    }
                } else if (!z4) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            case 4:
                boolean z5 = this.a;
                if (!z5) {
                    E17665849472693074628.k(obj);
                    this.a = true;
                    Uri uri5 = rf0.q;
                    w81 w81Var = rf0Var.j;
                    V3805393212198381221 v3805393212198381221 = new V3805393212198381221() { // from class: dev.epro.r0.S15377854226413623883
                        @Override // dev.epro.r0.V3805393212198381221
                        public final void a(C13799120990122180696 c13799120990122180696) {
                            rf0 rf0Var2 = rf0Var;
                            rf0Var2.getClass();
                            if (c13799120990122180696 != null) {
                                W5797197595347441198 w5797197595347441198 = rf0Var2.b;
                                fb fbVar = new fb(rf0Var2, c13799120990122180696, (R4833348786910499294) null, (byte) 28);
                                w5797197595347441198.getClass();
                                R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(fbVar, null, (byte) 1), 2);
                            }
                        }
                    };
                    w81Var.getClass();
                    Object objA = w81.a(w81Var, p71.d, v3805393212198381221, this);
                    if (objA != z3437138737604933638) {
                        objA = o9245300239821758723;
                    }
                    if (objA == z3437138737604933638) {
                    }
                } else if (!z5) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            case 5:
                boolean z6 = this.a;
                if (!z6) {
                    E17665849472693074628.k(obj);
                    this.a = true;
                    if (rf0.b(rf0Var, this) == z3437138737604933638) {
                    }
                } else if (!z6) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            case 6:
                boolean z7 = this.a;
                if (!z7) {
                    E17665849472693074628.k(obj);
                    this.a = true;
                    if (rf0.a(rf0Var, this) == z3437138737604933638) {
                    }
                } else if (!z7) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            case 7:
                boolean z8 = this.a;
                if (!z8) {
                    E17665849472693074628.k(obj);
                    this.a = true;
                    Uri uri6 = rf0.q;
                    if (rf0Var.a((Activity) null, this) == z3437138737604933638) {
                    }
                } else if (!z8) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            default:
                boolean z9 = this.a;
                if (!z9) {
                    E17665849472693074628.k(obj);
                    this.a = true;
                    Uri uri7 = rf0.q;
                    if (rf0Var.a((Activity) null, this) == z3437138737604933638) {
                    }
                } else if (!z9) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
        }
        return z3437138737604933638;
    }
}
