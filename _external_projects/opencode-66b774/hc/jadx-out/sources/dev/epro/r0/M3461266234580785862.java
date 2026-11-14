package dev.epro.r0;

import ads_mobile_sdk.ci3;
import ads_mobile_sdk.dj1;
import ads_mobile_sdk.dq2;
import ads_mobile_sdk.eu0;
import ads_mobile_sdk.ii;
import ads_mobile_sdk.m72;
import ads_mobile_sdk.qd1;
import ads_mobile_sdk.x52;
import android.view.ViewGroup;
import androidx.sqlite.SQLiteStatement;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M3461266234580785862 extends R14062301455140331524 implements F4096073349764486348 {
    public final /* synthetic */ byte t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M3461266234580785862(Object obj, Object obj2, Object obj3, R4833348786910499294 r4833348786910499294, byte b) {
        super(1, r4833348786910499294);
        this.t = b;
        this.u = obj;
        this.v = obj2;
        this.w = obj3;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Object obj2 = this.w;
        Object obj3 = this.v;
        Object obj4 = this.u;
        switch (b) {
            case 0:
                return new M3461266234580785862((L5112781861520238507) obj4, (String) obj3, (F4096073349764486348) obj2, (R4833348786910499294) obj, (byte) 0).invokeSuspend(o9245300239821758723);
            case 1:
                return new M3461266234580785862((m72) obj4, (dj1) obj3, (V7496420559085948492) obj2, (R4833348786910499294) obj, (byte) 1).invokeSuspend(o9245300239821758723);
            default:
                new M3461266234580785862((X9608137461199640409) obj4, (ii) obj3, (ViewGroup) obj2, (R4833348786910499294) obj, (byte) 2).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Object obj2 = this.w;
        R4833348786910499294 r4833348786910499294 = null;
        Object obj3 = this.v;
        Object obj4 = this.u;
        switch (b) {
            case 0:
                E17665849472693074628.k(obj);
                SQLiteStatement sQLiteStatementPrepare = ((L5112781861520238507) obj4).b.prepare((String) obj3);
                try {
                    Object objInvoke = ((F4096073349764486348) obj2).invoke(sQLiteStatementPrepare);
                    T18016951143603335921.y(sQLiteStatementPrepare, null);
                    return objInvoke;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        T18016951143603335921.y(sQLiteStatementPrepare, th);
                        throw th2;
                    }
                }
            case 1:
                E17665849472693074628.k(obj);
                x52 x52Var = ((m72) obj4).c;
                dj1 dj1Var = (dj1) obj3;
                V7496420559085948492 v7496420559085948492 = (V7496420559085948492) obj2;
                x52Var.getClass();
                dj1Var.getClass();
                v7496420559085948492.getClass();
                ci3 ci3Var = x52Var.f;
                eu0 eu0Var = new eu0(dj1Var, v7496420559085948492, (byte) 1);
                ci3Var.getClass();
                try {
                    eu0Var.invoke();
                    return o9245300239821758723;
                } catch (Exception e) {
                    ci3Var.a("FinishJavaScriptSessionService", (Throwable) e);
                    return null;
                }
            default:
                E17665849472693074628.k(obj);
                X9608137461199640409 x9608137461199640409 = (X9608137461199640409) obj4;
                dq2 dq2Var = (dq2) ((V2597580950516131749) x9608137461199640409.k).get();
                qd1 qd1Var = new qd1((ii) obj3, new E13942609761711486177(x9608137461199640409, r4833348786910499294, (byte) 18));
                dq2Var.getClass();
                dq2Var.B = (ViewGroup) obj2;
                dq2Var.y = qd1Var;
                dq2Var.a(qd1Var);
                return o9245300239821758723;
        }
    }
}
