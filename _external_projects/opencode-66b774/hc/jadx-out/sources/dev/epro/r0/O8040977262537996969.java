package dev.epro.r0;

import ads_mobile_sdk.eg2;
import ads_mobile_sdk.it1;
import ads_mobile_sdk.lt1;
import ads_mobile_sdk.tx0;
import ads_mobile_sdk.wt1;
import java.io.Serializable;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O8040977262537996969 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O8040977262537996969(tx0 tx0Var, R4833348786910499294 r4833348786910499294, String str, String str2, String str3, String str4) {
        super(2, r4833348786910499294);
        this.t = (byte) 2;
        this.u = tx0Var;
        this.v = str;
        this.w = str2;
        this.x = str3;
        this.y = str4;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        Object obj2 = this.y;
        Object obj3 = this.x;
        Object obj4 = this.w;
        Object obj5 = this.v;
        switch (b) {
            case 0:
                O8040977262537996969 o8040977262537996969 = new O8040977262537996969((U7711451789516216314) obj5, (Y4989033692226475498) obj4, (D16945471218061474327) obj3, (A7716877927750495196) obj2, r4833348786910499294);
                o8040977262537996969.u = obj;
                return o8040977262537996969;
            case 1:
                return new O8040977262537996969((tx0) this.u, (String) obj5, (UUID) obj4, (String) obj3, (String) obj2, r4833348786910499294, (byte) 1);
            case 2:
                return new O8040977262537996969((tx0) this.u, r4833348786910499294, (String) obj5, (String) obj4, (String) obj3, (String) obj2);
            case 3:
                eg2 eg2Var = (eg2) obj2;
                O8040977262537996969 o80409772625379969692 = new O8040977262537996969(eg2Var, (it1) obj4, (wt1) obj5, (I16631908410500040363) obj3, r4833348786910499294);
                o80409772625379969692.u = obj;
                return o80409772625379969692;
            default:
                return new O8040977262537996969((Long) this.u, (C10288805116980491173) obj5, (P9699383776227634085) obj4, (Locale) obj3, (W1972671267364756056) obj2, r4833348786910499294, (byte) 4);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                return ((O8040977262537996969) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 1:
                ((O8040977262537996969) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 2:
                ((O8040977262537996969) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 3:
                return ((O8040977262537996969) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            default:
                ((O8040977262537996969) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Object obj2 = this.y;
        Object obj3 = this.w;
        Object obj4 = this.v;
        Object obj5 = this.x;
        switch (b) {
            case 0:
                E17665849472693074628.k(obj);
                W5797197595347441198 w5797197595347441198 = (W5797197595347441198) this.u;
                U7711451789516216314 u7711451789516216314 = (U7711451789516216314) obj4;
                R4833348786910499294 r4833348786910499294 = null;
                R7033599853981556291.E(w5797197595347441198, null, null, new C288342651169725874(u7711451789516216314, (Y4989033692226475498) obj3, (D16945471218061474327) obj5, r4833348786910499294, (byte) 2), 3);
                return R7033599853981556291.E(w5797197595347441198, null, null, new Y14354959068095823168(u7711451789516216314, (A7716877927750495196) obj2, r4833348786910499294, (byte) 8), 3);
            case 1:
                E17665849472693074628.k(obj);
                tx0 tx0Var = (tx0) this.u;
                StringBuilder sb = new StringBuilder();
                sb.append((String) obj4);
                sb.append("({\"id\": \"");
                sb.append((UUID) obj3);
                sb.append("\", \"args\": ");
                sb.append((String) obj5);
                tx0Var.evaluateJavascript(G6547577305291411977.v(sb, ", \"use_javascript_interface\": \"", (String) obj2, "\"});"), null);
                return o9245300239821758723;
            case 2:
                E17665849472693074628.k(obj);
                ((tx0) this.u).loadDataWithBaseURL((String) obj4, (String) obj3, (String) obj5, (String) obj2, null);
                return o9245300239821758723;
            case 3:
                E17665849472693074628.k(obj);
                W5797197595347441198 w57971975953474411982 = (W5797197595347441198) this.u;
                wt1 wt1Var = (wt1) obj4;
                G8001132634698687269 g8001132634698687269 = wt1Var.b;
                it1 it1Var = (it1) obj3;
                I16631908410500040363 i16631908410500040363 = (I16631908410500040363) obj5;
                R4833348786910499294 r48333487869104992942 = null;
                R7033599853981556291.E(w57971975953474411982, g8001132634698687269, null, new lt1(it1Var, wt1Var, i16631908410500040363, r48333487869104992942, (byte) 0), 2);
                R7033599853981556291.E(w57971975953474411982, g8001132634698687269, null, new lt1(it1Var, wt1Var, i16631908410500040363, r48333487869104992942, (byte) 1), 2);
                R7033599853981556291.E(w57971975953474411982, g8001132634698687269, null, new lt1(it1Var, wt1Var, i16631908410500040363, r48333487869104992942, (byte) 2), 2);
                R7033599853981556291.E(w57971975953474411982, g8001132634698687269, null, new lt1(it1Var, wt1Var, i16631908410500040363, r48333487869104992942, (byte) 3), 2);
                R7033599853981556291.E(w57971975953474411982, g8001132634698687269, null, new J13979756969328643311((eg2) obj2, it1Var, wt1Var, (I16631908410500040363) obj5, (R4833348786910499294) null), 2);
                R7033599853981556291.E(w57971975953474411982, g8001132634698687269, null, new H4546125934900659656(it1Var, wt1Var, i16631908410500040363, (R4833348786910499294) null), 2);
                R7033599853981556291.E(w57971975953474411982, g8001132634698687269, null, new B5703672629416386538(it1Var, wt1Var, i16631908410500040363, (R4833348786910499294) null), 2);
                return R7033599853981556291.E(w57971975953474411982, g8001132634698687269, null, new E13942609761711486177((Object) i16631908410500040363, (Object) it1Var, r48333487869104992942, (byte) 14), 2);
            default:
                E17665849472693074628.k(obj);
                Long l = (Long) this.u;
                if (l != null) {
                    W1972671267364756056 w1972671267364756056 = (W1972671267364756056) obj2;
                    String strA = ((C10288805116980491173) obj4).a(l.longValue(), ((P9699383776227634085) obj3).c, (Locale) obj5);
                    F13241018602672925865 f13241018602672925865 = new F13241018602672925865(strA, 4, strA.length() == 0 ? F12478849263529740365.b : T1335862270807194835.d(strA.length(), strA.length()));
                    D6962450040782876658 d6962450040782876658 = M15899608248326723537.a;
                    w1972671267364756056.setValue(f13241018602672925865);
                }
                return o9245300239821758723;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O8040977262537996969(Object obj, Object obj2, Object obj3, Serializable serializable, Object obj4, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.u = obj;
        this.v = obj2;
        this.w = obj3;
        this.x = serializable;
        this.y = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O8040977262537996969(U7711451789516216314 u7711451789516216314, Y4989033692226475498 y4989033692226475498, D16945471218061474327 d16945471218061474327, A7716877927750495196 a7716877927750495196, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.t = (byte) 0;
        this.v = u7711451789516216314;
        this.w = y4989033692226475498;
        this.x = d16945471218061474327;
        this.y = a7716877927750495196;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O8040977262537996969(eg2 eg2Var, it1 it1Var, wt1 wt1Var, I16631908410500040363 i16631908410500040363, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.t = (byte) 3;
        this.v = wt1Var;
        this.w = it1Var;
        this.x = i16631908410500040363;
        this.y = eg2Var;
    }
}
