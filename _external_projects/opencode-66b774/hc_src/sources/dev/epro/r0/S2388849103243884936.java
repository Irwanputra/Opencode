package dev.epro.r0;

import ads_mobile_sdk.ou1;
import ads_mobile_sdk.su1;
import ads_mobile_sdk.um0;
import ads_mobile_sdk.zm0;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class S2388849103243884936 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S2388849103243884936(Object obj, int i, Object obj2, Object obj3, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.w = obj;
        this.v = i;
        this.x = obj2;
        this.y = obj3;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        Object obj2 = this.y;
        Object obj3 = this.x;
        switch (b) {
            case 0:
                return new S2388849103243884936((J12043550928838212009[]) this.w, this.v, (AtomicInteger) obj3, (H17686692708284905246) obj2, r4833348786910499294, (byte) 0);
            case 1:
                S2388849103243884936 s2388849103243884936 = new S2388849103243884936(this.v, (su1) obj2, (P16422848101170923038) obj3, r4833348786910499294);
                s2388849103243884936.w = obj;
                return s2388849103243884936;
            case 2:
                return new S2388849103243884936((zm0) this.w, this.v, (Bundle) obj3, (String) obj2, r4833348786910499294, (byte) 2);
            default:
                return new S2388849103243884936((E17523205116624666034) this.w, this.v, (P8646985343900033725) obj3, (G12426915514109744413) obj2, r4833348786910499294, (byte) 3);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                return ((S2388849103243884936) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 1:
                return ((S2388849103243884936) create((R4833348786910499294) obj2, (A2558500182237595544) obj)).invokeSuspend(o9245300239821758723);
            case 2:
                return ((S2388849103243884936) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            default:
                return ((S2388849103243884936) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Object obj2 = this.y;
        int i = this.v;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        Object obj3 = this.x;
        switch (b) {
            case 0:
                AtomicInteger atomicInteger = (AtomicInteger) obj3;
                H17686692708284905246 h17686692708284905246 = (H17686692708284905246) obj2;
                boolean z = this.u;
                try {
                    if (!z) {
                        E17665849472693074628.k(obj);
                        J12043550928838212009 j12043550928838212009 = ((J12043550928838212009[]) this.w)[i];
                        Y14844483566270067959 y14844483566270067959 = new Y14844483566270067959(h17686692708284905246, i);
                        this.u = true;
                        if (j12043550928838212009.collect(y14844483566270067959, this) == z3437138737604933638) {
                            return z3437138737604933638;
                        }
                    } else {
                        if (!z) {
                            S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        E17665849472693074628.k(obj);
                    }
                    if (atomicInteger.decrementAndGet() != 0) {
                        return o9245300239821758723;
                    }
                    h17686692708284905246.d(null);
                    return o9245300239821758723;
                } finally {
                    if (atomicInteger.decrementAndGet() == 0) {
                        h17686692708284905246.d(null);
                    }
                }
            case 1:
                boolean z2 = this.u;
                if (z2) {
                    if (z2) {
                        E17665849472693074628.k(obj);
                        return o9245300239821758723;
                    }
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                E17665849472693074628.k(obj);
                A2558500182237595544 a2558500182237595544 = (A2558500182237595544) this.w;
                int size = ((P16422848101170923038) obj3).a.size();
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < i; i2++) {
                    su1 su1Var = (su1) obj2;
                    arrayList.add(R7033599853981556291.E(su1Var.t, null, null, new ou1(su1Var, i2, size, (P16422848101170923038) obj3, a2558500182237595544, null), 3));
                }
                this.u = true;
                return O8620973563946607355.N(arrayList, this) == z3437138737604933638 ? z3437138737604933638 : o9245300239821758723;
            case 2:
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
                um0 um0Var = ((zm0) this.w).a;
                this.u = true;
                um0Var.getClass();
                um0.a(um0Var, i, (Bundle) obj3, (String) obj2);
                return o9245300239821758723 == z3437138737604933638 ? z3437138737604933638 : o9245300239821758723;
            default:
                boolean z4 = this.u;
                if (z4) {
                    if (z4) {
                        E17665849472693074628.k(obj);
                        return o9245300239821758723;
                    }
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                E17665849472693074628.k(obj);
                E17523205116624666034 e17523205116624666034 = (E17523205116624666034) this.w;
                int i3 = (((i - ((P8646985343900033725) obj3).a) * 12) + ((G12426915514109744413) obj2).b) - 1;
                this.u = true;
                return E17523205116624666034.k(e17523205116624666034, i3, this) == z3437138737604933638 ? z3437138737604933638 : o9245300239821758723;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S2388849103243884936(int i, su1 su1Var, P16422848101170923038 p16422848101170923038, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.t = (byte) 1;
        this.x = p16422848101170923038;
        this.v = i;
        this.y = su1Var;
    }
}
