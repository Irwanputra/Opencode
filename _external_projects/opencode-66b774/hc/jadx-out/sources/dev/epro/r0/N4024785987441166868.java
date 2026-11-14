package dev.epro.r0;

import ads_mobile_sdk.ao;
import ads_mobile_sdk.c61;
import ads_mobile_sdk.d33;
import ads_mobile_sdk.dn3;
import ads_mobile_sdk.e2;
import ads_mobile_sdk.e23;
import ads_mobile_sdk.e80;
import ads_mobile_sdk.eh0;
import ads_mobile_sdk.fb2;
import ads_mobile_sdk.fl2;
import ads_mobile_sdk.g0;
import ads_mobile_sdk.g83;
import ads_mobile_sdk.hf2;
import ads_mobile_sdk.ih0;
import ads_mobile_sdk.ix1;
import ads_mobile_sdk.j23;
import ads_mobile_sdk.jr0;
import ads_mobile_sdk.lu2;
import ads_mobile_sdk.n23;
import ads_mobile_sdk.ni2;
import ads_mobile_sdk.nu0;
import ads_mobile_sdk.p32;
import ads_mobile_sdk.pu0;
import ads_mobile_sdk.rw0;
import ads_mobile_sdk.sb;
import ads_mobile_sdk.ti3;
import ads_mobile_sdk.tu0;
import ads_mobile_sdk.tx0;
import ads_mobile_sdk.v;
import ads_mobile_sdk.w20;
import ads_mobile_sdk.w62;
import ads_mobile_sdk.wc1;
import ads_mobile_sdk.wf0;
import ads_mobile_sdk.wv0;
import ads_mobile_sdk.x60;
import ads_mobile_sdk.xu0;
import ads_mobile_sdk.y13;
import ads_mobile_sdk.yq;
import ads_mobile_sdk.z23;
import ads_mobile_sdk.zg2;
import ads_mobile_sdk.zj1;
import android.os.SystemClock;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class N4024785987441166868 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ N4024785987441166868(Object obj, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = obj;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        Object obj2 = this.v;
        switch (b) {
            case 0:
                return new N4024785987441166868((E18104834745338047524) obj2, r4833348786910499294, (byte) 0);
            case 1:
                return new N4024785987441166868((fb2) obj2, r4833348786910499294, (byte) 1);
            case 2:
                return new N4024785987441166868((e23) obj2, r4833348786910499294, (byte) 2);
            case 3:
                return new N4024785987441166868((e80) obj2, r4833348786910499294, (byte) 3);
            case 4:
                return new N4024785987441166868((C1776986987521524339) obj2, r4833348786910499294, (byte) 4);
            case 5:
                return new N4024785987441166868((dn3) obj2, r4833348786910499294, (byte) 5);
            case 6:
                return new N4024785987441166868((lu2) obj2, r4833348786910499294, (byte) 6);
            case 7:
                return new N4024785987441166868((e2) obj2, r4833348786910499294, (byte) 7);
            case 8:
                return new N4024785987441166868((nu0) obj2, r4833348786910499294, (byte) 8);
            case 9:
                return new N4024785987441166868((fl2) obj2, r4833348786910499294, (byte) 9);
            case 10:
                return new N4024785987441166868((w20) obj2, r4833348786910499294, (byte) 10);
            case 11:
                return new N4024785987441166868((ih0) obj2, r4833348786910499294, (byte) 11);
            case 12:
                return new N4024785987441166868((hf2) obj2, r4833348786910499294, (byte) 12);
            case 13:
                return new N4024785987441166868((j23) obj2, r4833348786910499294, (byte) 13);
            case 14:
                return new N4024785987441166868((F6376701238281935735) obj2, r4833348786910499294, (byte) 14);
            case 15:
                return new N4024785987441166868((ni2) obj2, r4833348786910499294, (byte) 15);
            case 16:
                return new N4024785987441166868((n23) obj2, r4833348786910499294, (byte) 16);
            case 17:
                return new N4024785987441166868((w62) obj2, r4833348786910499294, (byte) 17);
            case 18:
                return new N4024785987441166868((g83) obj2, r4833348786910499294, (byte) 18);
            case 19:
                return new N4024785987441166868((sb) obj2, r4833348786910499294, (byte) 19);
            case 20:
                return new N4024785987441166868((H5998176783492007232) obj2, r4833348786910499294, (byte) 20);
            case 21:
                return new N4024785987441166868((x60) obj2, r4833348786910499294, (byte) 21);
            case 22:
                return new N4024785987441166868((yq) obj2, r4833348786910499294, (byte) 22);
            case 23:
                return new N4024785987441166868((E5386183571211952538) obj2, r4833348786910499294, (byte) 23);
            case 24:
                return new N4024785987441166868((wf0) obj2, r4833348786910499294, (byte) 24);
            case 25:
                return new N4024785987441166868((wc1) obj2, r4833348786910499294, (byte) 25);
            case 26:
                return new N4024785987441166868((ix1) obj2, r4833348786910499294, (byte) 26);
            case 27:
                return new N4024785987441166868((g0) obj2, r4833348786910499294, (byte) 27);
            case 28:
                return new N4024785987441166868((zg2) obj2, r4833348786910499294, (byte) 28);
            default:
                return new N4024785987441166868((ConstraintTrackingWorker) obj2, r4833348786910499294, (byte) 29);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        Object obj3 = this.v;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                return ((N4024785987441166868) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 1:
                return new N4024785987441166868((fb2) obj3, (R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
            case 2:
                return new N4024785987441166868((e23) obj3, (R4833348786910499294) obj2, (byte) 2).invokeSuspend(o9245300239821758723);
            case 3:
                return new N4024785987441166868((e80) obj3, (R4833348786910499294) obj2, (byte) 3).invokeSuspend(o9245300239821758723);
            case 4:
                return new N4024785987441166868((C1776986987521524339) obj3, (R4833348786910499294) obj2, (byte) 4).invokeSuspend(o9245300239821758723);
            case 5:
                return new N4024785987441166868((dn3) obj3, (R4833348786910499294) obj2, (byte) 5).invokeSuspend(o9245300239821758723);
            case 6:
                return new N4024785987441166868((lu2) obj3, (R4833348786910499294) obj2, (byte) 6).invokeSuspend(o9245300239821758723);
            case 7:
                return new N4024785987441166868((e2) obj3, (R4833348786910499294) obj2, (byte) 7).invokeSuspend(o9245300239821758723);
            case 8:
                return new N4024785987441166868((nu0) obj3, (R4833348786910499294) obj2, (byte) 8).invokeSuspend(o9245300239821758723);
            case 9:
                return new N4024785987441166868((fl2) obj3, (R4833348786910499294) obj2, (byte) 9).invokeSuspend(o9245300239821758723);
            case 10:
                return new N4024785987441166868((w20) obj3, (R4833348786910499294) obj2, (byte) 10).invokeSuspend(o9245300239821758723);
            case 11:
                return new N4024785987441166868((ih0) obj3, (R4833348786910499294) obj2, (byte) 11).invokeSuspend(o9245300239821758723);
            case 12:
                return new N4024785987441166868((hf2) obj3, (R4833348786910499294) obj2, (byte) 12).invokeSuspend(o9245300239821758723);
            case 13:
                return new N4024785987441166868((j23) obj3, (R4833348786910499294) obj2, (byte) 13).invokeSuspend(o9245300239821758723);
            case 14:
                return new N4024785987441166868((F6376701238281935735) obj3, (R4833348786910499294) obj2, (byte) 14).invokeSuspend(o9245300239821758723);
            case 15:
                return new N4024785987441166868((ni2) obj3, (R4833348786910499294) obj2, (byte) 15).invokeSuspend(o9245300239821758723);
            case 16:
                return new N4024785987441166868((n23) obj3, (R4833348786910499294) obj2, (byte) 16).invokeSuspend(o9245300239821758723);
            case 17:
                return new N4024785987441166868((w62) obj3, (R4833348786910499294) obj2, (byte) 17).invokeSuspend(o9245300239821758723);
            case 18:
                return new N4024785987441166868((g83) obj3, (R4833348786910499294) obj2, (byte) 18).invokeSuspend(o9245300239821758723);
            case 19:
                return new N4024785987441166868((sb) obj3, (R4833348786910499294) obj2, (byte) 19).invokeSuspend(o9245300239821758723);
            case 20:
                return new N4024785987441166868((H5998176783492007232) obj3, (R4833348786910499294) obj2, (byte) 20).invokeSuspend(o9245300239821758723);
            case 21:
                return new N4024785987441166868((x60) obj3, (R4833348786910499294) obj2, (byte) 21).invokeSuspend(o9245300239821758723);
            case 22:
                return new N4024785987441166868((yq) obj3, (R4833348786910499294) obj2, (byte) 22).invokeSuspend(o9245300239821758723);
            case 23:
                return new N4024785987441166868((E5386183571211952538) obj3, (R4833348786910499294) obj2, (byte) 23).invokeSuspend(o9245300239821758723);
            case 24:
                return new N4024785987441166868((wf0) obj3, (R4833348786910499294) obj2, (byte) 24).invokeSuspend(o9245300239821758723);
            case 25:
                return new N4024785987441166868((wc1) obj3, (R4833348786910499294) obj2, (byte) 25).invokeSuspend(o9245300239821758723);
            case 26:
                return new N4024785987441166868((ix1) obj3, (R4833348786910499294) obj2, (byte) 26).invokeSuspend(o9245300239821758723);
            case 27:
                return new N4024785987441166868((g0) obj3, (R4833348786910499294) obj2, (byte) 27).invokeSuspend(o9245300239821758723);
            case 28:
                return new N4024785987441166868((zg2) obj3, (R4833348786910499294) obj2, (byte) 28).invokeSuspend(o9245300239821758723);
            default:
                return ((N4024785987441166868) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        List<H9390398899829886498> listD1;
        O9245300239821758723 o9245300239821758723;
        byte b = 1;
        switch (this.t) {
            case 0:
                O9245300239821758723 o92453002398217587232 = O9245300239821758723.a;
                E18104834745338047524 e18104834745338047524 = (E18104834745338047524) this.v;
                Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
                boolean z = this.u;
                if (!z) {
                    E17665849472693074628.k(obj);
                    if (e18104834745338047524.r) {
                        e18104834745338047524.q.g(1);
                    }
                    R8029976778412248429 r8029976778412248429 = e18104834745338047524.q;
                    M7102034154292440921 m7102034154292440921 = e18104834745338047524.t;
                    this.u = true;
                    Object objA = r8029976778412248429.g.a(D6414970586266598845.c, new D1985062787913792270(r8029976778412248429, r8029976778412248429.h(r8029976778412248429.a.b() == 0 ? r8029976778412248429.d : r8029976778412248429.e), m7102034154292440921, null, (byte) 1), this);
                    if (objA != z3437138737604933638) {
                        objA = o92453002398217587232;
                    }
                    if (objA == z3437138737604933638) {
                        return z3437138737604933638;
                    }
                } else {
                    if (!z) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return o92453002398217587232;
            case 1:
                Z3437138737604933638 z34371387376049336382 = Z3437138737604933638.a;
                boolean z2 = this.u;
                if (!z2) {
                    E17665849472693074628.k(obj);
                    fb2 fb2Var = (fb2) this.v;
                    this.u = true;
                    if (fb2.a(fb2Var, this) == z34371387376049336382) {
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
                boolean z3 = this.u;
                if (!z3) {
                    E17665849472693074628.k(obj);
                    J12043550928838212009 data = ((A5401921815192175371) ((e23) this.v).b.get()).getData();
                    this.u = true;
                    obj = Y582199805280922215.v(data, this);
                    if (obj == z34371387376049336383) {
                        return z34371387376049336383;
                    }
                } else {
                    if (!z3) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                y13 y13Var = (y13) obj;
                return y13Var == null ? y13.p() : y13Var;
            case 3:
                O9245300239821758723 o92453002398217587233 = O9245300239821758723.a;
                Z3437138737604933638 z34371387376049336384 = Z3437138737604933638.a;
                boolean z4 = this.u;
                if (!z4) {
                    E17665849472693074628.k(obj);
                    e80 e80Var = (e80) this.v;
                    this.u = true;
                    e80.a(e80Var, this);
                    if (o92453002398217587233 == z34371387376049336384) {
                        return z34371387376049336384;
                    }
                } else {
                    if (!z4) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return o92453002398217587233;
            case 4:
                Z3437138737604933638 z34371387376049336385 = Z3437138737604933638.a;
                boolean z5 = this.u;
                if (!z5) {
                    E17665849472693074628.k(obj);
                    C1776986987521524339 c1776986987521524339 = (C1776986987521524339) this.v;
                    this.u = true;
                    obj = ((c61) c1776986987521524339.a.get()).f(this);
                    if (obj == z34371387376049336385) {
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
                boolean z6 = this.u;
                if (z6) {
                    if (z6) {
                        E17665849472693074628.k(obj);
                        return O9245300239821758723.a;
                    }
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                E17665849472693074628.k(obj);
                dn3 dn3Var = (dn3) this.v;
                this.u = true;
                dn3Var.k(this);
                return z34371387376049336386;
            case 6:
                Z3437138737604933638 z34371387376049336387 = Z3437138737604933638.a;
                boolean z7 = this.u;
                if (!z7) {
                    E17665849472693074628.k(obj);
                    lu2 lu2Var = (lu2) this.v;
                    this.u = true;
                    if (lu2.a(lu2Var, this) == z34371387376049336387) {
                        return z34371387376049336387;
                    }
                } else {
                    if (!z7) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return O9245300239821758723.a;
            case 7:
                Z3437138737604933638 z34371387376049336388 = Z3437138737604933638.a;
                boolean z8 = this.u;
                if (z8) {
                    if (z8) {
                        E17665849472693074628.k(obj);
                        return obj;
                    }
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                E17665849472693074628.k(obj);
                e2 e2Var = (e2) this.v;
                this.u = true;
                Object objA2 = e2Var.a(false, (R4833348786910499294) this);
                return objA2 == z34371387376049336388 ? z34371387376049336388 : objA2;
            case 8:
                O9245300239821758723 o92453002398217587234 = O9245300239821758723.a;
                Z3437138737604933638 z34371387376049336389 = Z3437138737604933638.a;
                boolean z9 = this.u;
                if (!z9) {
                    E17665849472693074628.k(obj);
                    nu0 nu0Var = (nu0) this.v;
                    this.u = true;
                    Object objB = nu0Var.a.b(this);
                    if (objB != z34371387376049336389) {
                        objB = o92453002398217587234;
                    }
                    if (objB == z34371387376049336389) {
                        return z34371387376049336389;
                    }
                } else {
                    if (!z9) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return o92453002398217587234;
            case 9:
                Z3437138737604933638 z343713873760493363810 = Z3437138737604933638.a;
                boolean z10 = this.u;
                if (!z10) {
                    E17665849472693074628.k(obj);
                    fl2 fl2Var = (fl2) this.v;
                    this.u = true;
                    if (fl2.a(fl2Var, this) == z343713873760493363810) {
                        return z343713873760493363810;
                    }
                } else {
                    if (!z10) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return O9245300239821758723.a;
            case 10:
                Z3437138737604933638 z343713873760493363811 = Z3437138737604933638.a;
                boolean z11 = this.u;
                if (!z11) {
                    E17665849472693074628.k(obj);
                    w20 w20Var = (w20) this.v;
                    AtomicReference atomicReference = w20Var.l;
                    R5692663580087387669 r5692663580087387669 = w20Var.n;
                    this.u = true;
                    if (w20Var.a(atomicReference, r5692663580087387669, (Long) null, this) == z343713873760493363811) {
                        return z343713873760493363811;
                    }
                } else {
                    if (!z11) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return O9245300239821758723.a;
            case 11:
                Z3437138737604933638 z343713873760493363812 = Z3437138737604933638.a;
                boolean z12 = this.u;
                if (!z12) {
                    E17665849472693074628.k(obj);
                    ih0 ih0Var = (ih0) this.v;
                    this.u = true;
                    synchronized (ih0Var) {
                        listD1 = R9411874267597469228.d1(ih0Var.r);
                        ih0Var.r.clear();
                        ih0Var.s.set(false);
                    }
                    for (H9390398899829886498 h9390398899829886498 : listD1) {
                        String str = (String) h9390398899829886498.a;
                        String str2 = (String) h9390398899829886498.b;
                        P5733283974459951585 p5733283974459951585 = rw0.f;
                        U2722688686349128662 u2722688686349128662 = U2722688686349128662.b;
                        G8001132634698687269 context = getContext();
                        u2722688686349128662.getClass();
                        R7033599853981556291.E(O8620973563946607355.a(S10823041268949770285.O(u2722688686349128662, context).minusKey(ti3.b).minusKey(B14824868959299866349.e).minusKey(P2382941533350862833.p)), null, null, new eh0(null, ih0Var, str, str2, (byte) 1), 3);
                    }
                    if (O9245300239821758723.a == z343713873760493363812) {
                        return z343713873760493363812;
                    }
                } else {
                    if (!z12) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return O9245300239821758723.a;
            case 12:
                Z3437138737604933638 z343713873760493363813 = Z3437138737604933638.a;
                boolean z13 = this.u;
                if (z13) {
                    if (z13) {
                        E17665849472693074628.k(obj);
                        return O9245300239821758723.a;
                    }
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                E17665849472693074628.k(obj);
                hf2 hf2Var = (hf2) this.v;
                this.u = true;
                hf2.a(hf2Var, this);
                return z343713873760493363813;
            case 13:
                Z3437138737604933638 z343713873760493363814 = Z3437138737604933638.a;
                boolean z14 = this.u;
                if (!z14) {
                    E17665849472693074628.k(obj);
                    zj1 zj1Var = ((j23) this.v).e;
                    this.u = true;
                    if (zj1Var.d(this) == z343713873760493363814) {
                        return z343713873760493363814;
                    }
                } else {
                    if (!z14) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return O9245300239821758723.a;
            case 14:
                Z3437138737604933638 z343713873760493363815 = Z3437138737604933638.a;
                boolean z15 = this.u;
                if (z15) {
                    if (z15) {
                        E17665849472693074628.k(obj);
                        return obj;
                    }
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                E17665849472693074628.k(obj);
                F6376701238281935735 f6376701238281935735 = (F6376701238281935735) this.v;
                this.u = true;
                Object objB2 = F6376701238281935735.b(f6376701238281935735, this);
                return objB2 == z343713873760493363815 ? z343713873760493363815 : objB2;
            case 15:
                O9245300239821758723 o92453002398217587235 = O9245300239821758723.a;
                Z3437138737604933638 z343713873760493363816 = Z3437138737604933638.a;
                boolean z16 = this.u;
                if (!z16) {
                    E17665849472693074628.k(obj);
                    fl2 fl2Var2 = ((ni2) this.v).a;
                    this.u = true;
                    Object objA3 = fl2Var2.a(wv0.CUI_NAME_CENTRALIZED_MANAGER_RESUME_FOR_AD_CLOSE, this);
                    if (objA3 != z343713873760493363816) {
                        objA3 = o92453002398217587235;
                    }
                    if (objA3 == z343713873760493363816) {
                        return z343713873760493363816;
                    }
                } else {
                    if (!z16) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return o92453002398217587235;
            case 16:
                Z3437138737604933638 z343713873760493363817 = Z3437138737604933638.a;
                boolean z17 = this.u;
                if (!z17) {
                    E17665849472693074628.k(obj);
                    zj1 zj1Var2 = ((n23) this.v).e;
                    this.u = true;
                    if (zj1Var2.d(this) == z343713873760493363817) {
                        return z343713873760493363817;
                    }
                } else {
                    if (!z17) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return O9245300239821758723.a;
            case 17:
                Z3437138737604933638 z343713873760493363818 = Z3437138737604933638.a;
                boolean z18 = this.u;
                if (!z18) {
                    E17665849472693074628.k(obj);
                    tx0 tx0Var = ((w62) this.v).f.a;
                    this.u = true;
                    if (tx0Var.a(this) == z343713873760493363818) {
                        return z343713873760493363818;
                    }
                } else {
                    if (!z18) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return O9245300239821758723.a;
            case 18:
                Z3437138737604933638 z343713873760493363819 = Z3437138737604933638.a;
                boolean z19 = this.u;
                if (z19) {
                    if (z19) {
                        E17665849472693074628.k(obj);
                        return obj;
                    }
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                E17665849472693074628.k(obj);
                K4548097313143615345 k4548097313143615345B = ((g83) this.v).b();
                this.u = true;
                Object objC = k4548097313143615345B.c(this);
                return objC == z343713873760493363819 ? z343713873760493363819 : objC;
            case 19:
                Z3437138737604933638 z343713873760493363820 = Z3437138737604933638.a;
                boolean z20 = this.u;
                if (!z20) {
                    E17665849472693074628.k(obj);
                    sb sbVar = (sb) this.v;
                    this.u = true;
                    if (sb.a(sbVar, this) == z343713873760493363820) {
                        return z343713873760493363820;
                    }
                } else {
                    if (!z20) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return O9245300239821758723.a;
            case 20:
                Z3437138737604933638 z343713873760493363821 = Z3437138737604933638.a;
                boolean z21 = this.u;
                if (!z21) {
                    E17665849472693074628.k(obj);
                    H5998176783492007232 h5998176783492007232 = (H5998176783492007232) this.v;
                    this.u = true;
                    if (((A18119328133183277592) h5998176783492007232).y(this) == z343713873760493363821) {
                        return z343713873760493363821;
                    }
                } else {
                    if (!z21) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return O9245300239821758723.a;
            case 21:
                Z3437138737604933638 z343713873760493363822 = Z3437138737604933638.a;
                boolean z22 = this.u;
                if (!z22) {
                    E17665849472693074628.k(obj);
                    x60 x60Var = (x60) this.v;
                    this.u = true;
                    if (x60Var.a(this) == z343713873760493363822) {
                        return z343713873760493363822;
                    }
                } else {
                    if (!z22) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return O9245300239821758723.a;
            case 22:
                Z3437138737604933638 z343713873760493363823 = Z3437138737604933638.a;
                boolean z23 = this.u;
                if (!z23) {
                    E17665849472693074628.k(obj);
                    yq yqVar = (yq) this.v;
                    this.u = true;
                    if (yqVar.invoke(this) == z343713873760493363823) {
                        return z343713873760493363823;
                    }
                } else {
                    if (!z23) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return O9245300239821758723.a;
            case 23:
                O9245300239821758723 o92453002398217587236 = O9245300239821758723.a;
                Z3437138737604933638 z343713873760493363824 = Z3437138737604933638.a;
                boolean z24 = this.u;
                if (!z24) {
                    E17665849472693074628.k(obj);
                    E5386183571211952538 e5386183571211952538 = (E5386183571211952538) this.v;
                    this.u = true;
                    if (e5386183571211952538.r(this, o92453002398217587236) == z343713873760493363824) {
                        return z343713873760493363824;
                    }
                } else {
                    if (!z24) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return o92453002398217587236;
            case 24:
                Z3437138737604933638 z343713873760493363825 = Z3437138737604933638.a;
                boolean z25 = this.u;
                if (!z25) {
                    E17665849472693074628.k(obj);
                    wf0 wf0Var = (wf0) this.v;
                    this.u = true;
                    if (wf0.a(wf0Var, this) == z343713873760493363825) {
                        return z343713873760493363825;
                    }
                } else {
                    if (!z25) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return O9245300239821758723.a;
            case 25:
                Z3437138737604933638 z343713873760493363826 = Z3437138737604933638.a;
                boolean z26 = this.u;
                if (!z26) {
                    E17665849472693074628.k(obj);
                    p32 p32Var = ((wc1) this.v).f;
                    this.u = true;
                    p32Var.getClass();
                    obj = p32.b(p32Var, this);
                    if (obj == z343713873760493363826) {
                        return z343713873760493363826;
                    }
                } else {
                    if (!z26) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                M16184408391440927034 m16184408391440927034 = (M16184408391440927034) obj;
                if (m16184408391440927034 instanceof pu0) {
                    return (pu0) m16184408391440927034;
                }
                m16184408391440927034.getClass();
                z23 z23Var = ((d33) ((xu0) m16184408391440927034).b).b;
                return z23Var.d == null ? new tu0("Raw JSON for cache is missing", 1) : new xu0(z23Var);
            case 26:
                Z3437138737604933638 z343713873760493363827 = Z3437138737604933638.a;
                boolean z27 = this.u;
                if (!z27) {
                    E17665849472693074628.k(obj);
                    ix1 ix1Var = (ix1) this.v;
                    this.u = true;
                    if (ix1Var.invoke(this) == z343713873760493363827) {
                        return z343713873760493363827;
                    }
                } else {
                    if (!z27) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return O9245300239821758723.a;
            case 27:
                Z3437138737604933638 z343713873760493363828 = Z3437138737604933638.a;
                boolean z28 = this.u;
                if (!z28) {
                    E17665849472693074628.k(obj);
                    jr0 jr0Var = ((g0) this.v).f;
                    jr0Var.getClass();
                    E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
                    long j = ((E17093345031926825464) jr0Var.a("gads:app_activity_tracker:notify_background_listeners_delay_ms", new E17093345031926825464(M9216324016624295870.Z(500, N13798149404328803870.MILLISECONDS)), ao.a)).a;
                    this.u = true;
                    if (J8045362843799184672.J(j, this) == z343713873760493363828) {
                        return z343713873760493363828;
                    }
                } else {
                    if (!z28) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                g0 g0Var = (g0) this.v;
                synchronized (g0Var) {
                    try {
                        if (g0Var.l) {
                            synchronized (g0Var) {
                                boolean z29 = g0Var.f39o;
                                if (!z29) {
                                    g0Var.f39o = true;
                                    E17149812035295265804 e171498120352952658042 = E17093345031926825464.b;
                                    g0Var.g.getClass();
                                    long jA0 = M9216324016624295870.a0(SystemClock.elapsedRealtime(), N13798149404328803870.MILLISECONDS);
                                    for (B8669154544800329371 b8669154544800329371 : g0Var.h) {
                                        W5797197595347441198 w5797197595347441198 = g0Var.e;
                                        R4833348786910499294 r4833348786910499294 = null;
                                        v vVar = new v(b8669154544800329371, jA0, r4833348786910499294, (byte) 1);
                                        I3826119971291161142 i3826119971291161142 = I3826119971291161142.a;
                                        w5797197595347441198.getClass();
                                        R7033599853981556291.E(w5797197595347441198, i3826119971291161142, null, new P7598478828797568949(vVar, r4833348786910499294, b), 2);
                                    }
                                }
                            }
                        }
                        o9245300239821758723 = O9245300239821758723.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return o9245300239821758723;
            case 28:
                zg2 zg2Var = (zg2) this.v;
                Z3437138737604933638 z343713873760493363829 = Z3437138737604933638.a;
                boolean z30 = this.u;
                if (!z30) {
                    E17665849472693074628.k(obj);
                    long j2 = zg2Var.a.B0;
                    this.u = true;
                    if (J8045362843799184672.J(j2, this) == z343713873760493363829) {
                        return z343713873760493363829;
                    }
                } else {
                    if (!z30) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                zg2.a(zg2Var);
                return O9245300239821758723.a;
            default:
                Z3437138737604933638 z343713873760493363830 = Z3437138737604933638.a;
                boolean z31 = this.u;
                if (z31) {
                    if (z31) {
                        E17665849472693074628.k(obj);
                        return obj;
                    }
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                E17665849472693074628.k(obj);
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.v;
                this.u = true;
                Object objE = constraintTrackingWorker.e(this);
                return objE == z343713873760493363830 ? z343713873760493363830 : objE;
        }
    }
}
