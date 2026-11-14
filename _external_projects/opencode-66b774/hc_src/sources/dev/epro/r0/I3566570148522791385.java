package dev.epro.r0;

import ads_mobile_sdk.ao;
import ads_mobile_sdk.jr0;
import ads_mobile_sdk.l0;
import ads_mobile_sdk.uo;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class I3566570148522791385 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public /* synthetic */ int v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I3566570148522791385(Object obj, int i, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.w = obj;
        this.v = i;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        Object obj2 = this.w;
        switch (b) {
            case 0:
                return new I3566570148522791385((E17523205116624666034) obj2, this.v, r4833348786910499294, (byte) 0);
            case 1:
                return new I3566570148522791385((l0) obj2, this.v, r4833348786910499294, (byte) 1);
            case 2:
                return new I3566570148522791385((uo) obj2, this.v, r4833348786910499294, (byte) 2);
            case 3:
                return new I3566570148522791385((L7222411163342326563) obj2, this.v, r4833348786910499294, (byte) 3);
            case 4:
                return new I3566570148522791385((G16768067413993841943) obj2, this.v, r4833348786910499294, (byte) 4);
            default:
                I3566570148522791385 i3566570148522791385 = new I3566570148522791385((W1460317453757127858) obj2, r4833348786910499294);
                i3566570148522791385.v = ((Number) obj).intValue();
                return i3566570148522791385;
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        Object obj3 = this.w;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                return ((I3566570148522791385) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 1:
                return new I3566570148522791385((l0) obj3, this.v, (R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
            case 2:
                return new I3566570148522791385((uo) obj3, this.v, (R4833348786910499294) obj2, (byte) 2).invokeSuspend(o9245300239821758723);
            case 3:
                return ((I3566570148522791385) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 4:
                return ((I3566570148522791385) create((R4833348786910499294) obj2, (A7868207189447841291) obj)).invokeSuspend(o9245300239821758723);
            default:
                return ((I3566570148522791385) create((R4833348786910499294) obj2, Integer.valueOf(((Number) obj).intValue()))).invokeSuspend(o9245300239821758723);
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        T3484731262671441138 t3484731262671441138;
        byte b = this.t;
        Object obj2 = this.w;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        R4833348786910499294 r4833348786910499294 = null;
        switch (b) {
            case 0:
                E17523205116624666034 e17523205116624666034 = (E17523205116624666034) obj2;
                boolean z = this.u;
                if (!z) {
                    E17665849472693074628.k(obj);
                    if (!e17523205116624666034.j.b()) {
                        int g = e17523205116624666034.e.b.g();
                        int i = this.v;
                        if (g != i) {
                            this.u = true;
                            if (E17523205116624666034.k(e17523205116624666034, i, this) == z3437138737604933638) {
                            }
                        }
                    }
                } else if (!z) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            case 1:
                l0 l0Var = (l0) obj2;
                boolean z2 = this.u;
                if (!z2) {
                    E17665849472693074628.k(obj);
                    jr0 jr0Var = l0Var.b;
                    jr0Var.getClass();
                    E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
                    long j = ((E17093345031926825464) jr0Var.a("gads:ad_activity_delegate_map_retain_duration", new E17093345031926825464(M9216324016624295870.Z(60, N13798149404328803870.SECONDS)), ao.a$2)).a;
                    this.u = true;
                    if (J8045362843799184672.J(j, this) == z3437138737604933638) {
                    }
                } else if (!z2) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    E17665849472693074628.k(obj);
                }
                l0Var.d.remove(new Integer(this.v));
                break;
            case 2:
                boolean z3 = this.u;
                if (!z3) {
                    E17665849472693074628.k(obj);
                    int i2 = this.v;
                    this.u = true;
                    if (uo.a((uo) obj2, i2, this) == z3437138737604933638) {
                    }
                } else if (!z3) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            case 3:
                boolean z4 = this.u;
                if (!z4) {
                    E17665849472693074628.k(obj);
                    C16999414938027834076 c16999414938027834076 = ((L7222411163342326563) obj2).p;
                    int i3 = this.v;
                    this.u = true;
                    if (c16999414938027834076.d(i3, this) == z3437138737604933638) {
                    }
                } else if (!z4) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            case 4:
                G16768067413993841943 g16768067413993841943 = (G16768067413993841943) obj2;
                boolean z5 = this.u;
                if (!z5) {
                    E17665849472693074628.k(obj);
                    this.u = true;
                    if (g16768067413993841943.i(this) == z3437138737604933638) {
                    }
                } else if (!z5) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    E17665849472693074628.k(obj);
                }
                g16768067413993841943.r(0.0f, g16768067413993841943.j(this.v), true);
                break;
            default:
                boolean z6 = this.u;
                if (!z6) {
                    E17665849472693074628.k(obj);
                    if (Math.abs(this.v) == 1 && (t3484731262671441138 = ((W1460317453757127858) obj2).B) != null) {
                        this.u = true;
                        Object B = O8620973563946607355.B(new E13942609761711486177(t3484731262671441138, r4833348786910499294, (byte) 0), this);
                        if (B != z3437138737604933638) {
                            B = o9245300239821758723;
                        }
                        if (B == z3437138737604933638) {
                        }
                    }
                } else if (!z6) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
        }
        return o9245300239821758723;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I3566570148522791385(W1460317453757127858 w1460317453757127858, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.t = (byte) 5;
        this.w = w1460317453757127858;
    }
}
