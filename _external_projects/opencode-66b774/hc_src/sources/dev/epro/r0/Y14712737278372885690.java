package dev.epro.r0;

import ads_mobile_sdk.ci3;
import ads_mobile_sdk.dj1;
import ads_mobile_sdk.f52;
import ads_mobile_sdk.jy0;
import ads_mobile_sdk.m6;
import ads_mobile_sdk.m72;
import ads_mobile_sdk.oa;
import ads_mobile_sdk.sb;
import ads_mobile_sdk.tx0;
import ads_mobile_sdk.w62;
import ads_mobile_sdk.x52;
import ads_mobile_sdk.xr0;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Y14712737278372885690 extends R14062301455140331524 implements F4096073349764486348 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y14712737278372885690(Object obj, Object obj2, Object obj3, R4833348786910499294 r4833348786910499294, byte b) {
        super(1, r4833348786910499294);
        this.t = b;
        this.v = obj;
        this.w = obj2;
        this.x = obj3;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        byte b = this.t;
        Object obj2 = this.w;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Object obj3 = this.x;
        Object obj4 = this.v;
        switch (b) {
            case 0:
                G13792465322404021864 g13792465322404021864 = (G13792465322404021864) obj3;
                return new Y14712737278372885690((F9886074403848142923) obj4, this.w, g13792465322404021864, (R4833348786910499294) obj, (byte) 0).invokeSuspend(o9245300239821758723);
            case 1:
                return new Y14712737278372885690((sb) obj4, (String) obj2, (oa) obj3, (R4833348786910499294) obj, (byte) 1).invokeSuspend(o9245300239821758723);
            case 2:
                return new Y14712737278372885690((jy0) obj4, (m72) obj2, (dj1) obj3, (R4833348786910499294) obj, (byte) 2).invokeSuspend(o9245300239821758723);
            case 3:
                return new Y14712737278372885690((w62) obj4, (View) obj2, (xr0) obj3, (R4833348786910499294) obj, (byte) 3).invokeSuspend(o9245300239821758723);
            case 4:
                return new Y14712737278372885690((J12078565427869724451) obj4, (tx0) obj2, (m6) obj3, (R4833348786910499294) obj, (byte) 4).invokeSuspend(o9245300239821758723);
            case 5:
                G13792465322404021864 g137924653224040218642 = (G13792465322404021864) obj3;
                return new Y14712737278372885690((F9886074403848142923) obj4, this.w, g137924653224040218642, (R4833348786910499294) obj, (byte) 5).invokeSuspend(o9245300239821758723);
            default:
                return new Y14712737278372885690((L5112781861520238507) obj4, (W12133020733110407383) obj2, (L12639328004344855510) obj3, (R4833348786910499294) obj, (byte) 6).invokeSuspend(o9245300239821758723);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        int i = 0;
        Object[] objArr = 0;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Object obj2 = this.x;
        Object obj3 = this.w;
        Object obj4 = this.v;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        byte b2 = 1;
        R4833348786910499294 r4833348786910499294 = null;
        switch (b) {
            case 0:
                F9886074403848142923 f9886074403848142923 = (F9886074403848142923) obj4;
                boolean z = this.u;
                if (z) {
                    if (z) {
                        E17665849472693074628.k(obj);
                        return o9245300239821758723;
                    }
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                E17665849472693074628.k(obj);
                f9886074403848142923.k(obj3);
                C8204629009676477017 c8204629009676477017 = new C8204629009676477017(f9886074403848142923, (byte) 4);
                H4546125934900659656 h4546125934900659656 = new H4546125934900659656(obj2, (Object) f9886074403848142923, r4833348786910499294, (byte) 29);
                this.u = true;
                return Q3181834110876746778.N(c8204629009676477017, h4546125934900659656, this) == z3437138737604933638 ? z3437138737604933638 : o9245300239821758723;
            case 1:
                boolean z2 = this.u;
                if (!z2) {
                    E17665849472693074628.k(obj);
                    this.u = true;
                    Object a = sb.a((sb) obj4, (String) obj3, (oa) obj2, this);
                    return a == z3437138737604933638 ? z3437138737604933638 : a;
                }
                if (z2) {
                    E17665849472693074628.k(obj);
                    return obj;
                }
                S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                jy0 jy0Var = (jy0) obj4;
                boolean z3 = this.u;
                if (z3) {
                    if (z3) {
                        E17665849472693074628.k(obj);
                        return o9245300239821758723;
                    }
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                E17665849472693074628.k(obj);
                jy0Var.getClass();
                tx0 tx0Var = jy0Var.a;
                ArrayList arrayList = new ArrayList();
                int childCount = jy0Var.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = jy0Var.getChildAt(i2);
                    if (!S10823041268949770285.t(childAt, tx0Var)) {
                        childAt.getClass();
                        arrayList.add(childAt);
                    }
                }
                m72 m72Var = (m72) obj3;
                dj1 dj1Var = (dj1) obj2;
                int size = arrayList.size();
                while (i < size) {
                    Object obj5 = arrayList.get(i);
                    i++;
                    View view = (View) obj5;
                    x52 x52Var = m72Var.c;
                    x52Var.getClass();
                    dj1Var.getClass();
                    view.getClass();
                    ci3 ci3Var = x52Var.f;
                    f52 f52Var = new f52(dj1Var, view, xr0.c, b2);
                    ci3Var.getClass();
                    try {
                        f52Var.invoke();
                    } catch (Exception e) {
                        ci3Var.a("AddFriendlyObstructionToJavaScriptSessionService", (Throwable) e);
                    }
                }
                I16631908410500040363 i16631908410500040363 = new I16631908410500040363();
                this.u = true;
                return tx0Var.a(i16631908410500040363, "onSdkLoaded", this) == z3437138737604933638 ? z3437138737604933638 : o9245300239821758723;
            case 3:
                boolean z4 = this.u;
                if (z4) {
                    if (z4) {
                        E17665849472693074628.k(obj);
                        return obj;
                    }
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                E17665849472693074628.k(obj);
                m72 m72Var2 = ((w62) obj4).g;
                this.u = true;
                m72Var2.getClass();
                Object a2 = m72.a(m72Var2, (View) obj3, (xr0) obj2, this);
                return a2 == z3437138737604933638 ? z3437138737604933638 : a2;
            case 4:
                boolean z5 = this.u;
                if (!z5) {
                    E17665849472693074628.k(obj);
                    this.u = true;
                    return ((J12078565427869724451) obj4).invoke((tx0) obj3, (m6) obj2, this) == z3437138737604933638 ? z3437138737604933638 : o9245300239821758723;
                }
                if (z5) {
                    E17665849472693074628.k(obj);
                    return o9245300239821758723;
                }
                S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                F9886074403848142923 f98860744038481429232 = (F9886074403848142923) obj4;
                boolean z6 = this.u;
                if (!z6) {
                    E17665849472693074628.k(obj);
                    f98860744038481429232.h.setValue(obj3);
                    F4327950643552689 f4327950643552689 = new F4327950643552689(f98860744038481429232, (byte) 3);
                    C288342651169725874 c288342651169725874 = new C288342651169725874(obj2, (Object) f98860744038481429232, r4833348786910499294, (byte) (objArr == true ? 1 : 0));
                    this.u = true;
                    if (D15445857918358799638.W(f4327950643552689, c288342651169725874, this) == z3437138737604933638) {
                        return z3437138737604933638;
                    }
                } else {
                    if (!z6) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                if (!((Boolean) f98860744038481429232.b.invoke(obj3)).booleanValue()) {
                    return o9245300239821758723;
                }
                ((F18142507606280211225) f98860744038481429232.f241o).a(f98860744038481429232.d().c(obj3), f98860744038481429232.g.g());
                f98860744038481429232.d.setValue(obj3);
                f98860744038481429232.c.setValue(obj3);
                return o9245300239821758723;
            default:
                boolean z7 = this.u;
                if (!z7) {
                    E17665849472693074628.k(obj);
                    this.u = true;
                    Object e2 = ((L5112781861520238507) obj4).e((W12133020733110407383) obj3, (L12639328004344855510) obj2, this);
                    return e2 == z3437138737604933638 ? z3437138737604933638 : e2;
                }
                if (z7) {
                    E17665849472693074628.k(obj);
                    return obj;
                }
                S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
