package dev.epro.r0;

import ads_mobile_sdk.ck;
import ads_mobile_sdk.hs;
import ads_mobile_sdk.nj3;
import ads_mobile_sdk.p31;
import ads_mobile_sdk.ww2;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class G3171588458824956926 extends R14062301455140331524 implements F4096073349764486348 {
    public final /* synthetic */ byte t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G3171588458824956926(Object obj, R4833348786910499294 r4833348786910499294, byte b) {
        super(1, r4833348786910499294);
        this.t = b;
        this.u = obj;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Object obj2 = this.u;
        switch (b) {
            case 0:
                new G3171588458824956926((U16834965109098959004) obj2, (R4833348786910499294) obj, (byte) 0).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 1:
                return new G3171588458824956926((hs) obj2, (R4833348786910499294) obj, (byte) 1).invokeSuspend(o9245300239821758723);
            case 2:
                return new G3171588458824956926((P10917817599008460069) obj2, (R4833348786910499294) obj, (byte) 2).invokeSuspend(o9245300239821758723);
            case 3:
                return new G3171588458824956926((nj3) obj2, (R4833348786910499294) obj, (byte) 3).invokeSuspend(o9245300239821758723);
            default:
                new G3171588458824956926((W1460317453757127858) obj2, (R4833348786910499294) obj, (byte) 4).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        p31 p31Var;
        switch (this.t) {
            case 0:
                E17665849472693074628.k(obj);
                ((U16834965109098959004) this.u).c();
                return O9245300239821758723.a;
            case 1:
                E17665849472693074628.k(obj);
                return hs.a((hs) this.u);
            case 2:
                E17665849472693074628.k(obj);
                W7378377772343420238 w7378377772343420238 = ((P10917817599008460069) this.u).g;
                return new ww2(w7378377772343420238 != null ? w7378377772343420238.b() : new byte[0]);
            case 3:
                E17665849472693074628.k(obj);
                nj3 nj3Var = (nj3) this.u;
                ck ckVar = nj3Var.f82o;
                Set set = nj3Var.p;
                String strE = nj3Var.f.a.a.e();
                ckVar.getClass();
                set.getClass();
                synchronized (ckVar.h) {
                    int i = ckVar.i;
                    ckVar.i = i + 1;
                    if (set.isEmpty()) {
                        p31Var = new p31(Integer.valueOf(i), null, null);
                    } else {
                        String strJ0 = R9411874267597469228.J0(R9411874267597469228.V0(set), ",", null, null, 0, null, 62);
                        Integer num = (Integer) ckVar.j.get(strJ0);
                        int iIntValue = num != null ? num.intValue() : 0;
                        ckVar.j.put(strJ0, Integer.valueOf(iIntValue + 1));
                        if (strE == null) {
                            p31Var = new p31(Integer.valueOf(i), Integer.valueOf(iIntValue), null);
                        } else {
                            String str = strE + "|" + strJ0;
                            Integer num2 = (Integer) ckVar.k.get(str);
                            int iIntValue2 = num2 != null ? num2.intValue() : 0;
                            ckVar.k.put(str, Integer.valueOf(iIntValue2 + 1));
                            p31Var = new p31(Integer.valueOf(i), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
                        }
                    }
                }
                return p31Var;
            default:
                E17665849472693074628.k(obj);
                ((W1460317453757127858) this.u).u.t.setValue(Boolean.FALSE);
                return O9245300239821758723.a;
        }
    }
}
