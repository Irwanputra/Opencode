package ads_mobile_sdk;

import dev.epro.r0.B8427392651679410143;
import dev.epro.r0.G8001132634698687269;
import dev.epro.r0.M18113111391818111737;
import dev.epro.r0.O12043144740933444288;
import dev.epro.r0.O14838623545224379975;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.V2597580950516131749;
import dev.epro.r0.W5797197595347441198;
import java.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class bk implements B8427392651679410143 {
    public final V2597580950516131749 a;
    public final V2597580950516131749 b;
    public final /* synthetic */ byte c;

    public /* synthetic */ bk(V2597580950516131749 v2597580950516131749, V2597580950516131749 v25975809505161317492, byte b) {
        this.c = b;
        this.a = v2597580950516131749;
        this.b = v25975809505161317492;
    }

    @Override // dev.epro.r0.V2597580950516131749
    public final Object get() {
        byte b = this.c;
        V2597580950516131749 v2597580950516131749 = this.b;
        V2597580950516131749 v25975809505161317492 = this.a;
        switch (b) {
            case 0:
                return new xj((qq0) v25975809505161317492.get(), (ql1) v2597580950516131749.get());
            case 1:
                return new a53((G8001132634698687269) v25975809505161317492.get(), (jp0) v2597580950516131749.get());
            case 2:
                kl0 kl0Var = (kl0) v25975809505161317492.get();
                jr0 jr0Var = (jr0) v2597580950516131749.get();
                kl0Var.getClass();
                jr0Var.getClass();
                return new x32(kl0Var, 1, 1, O14838623545224379975.f(jr0Var, cw0.EXPERIMENT_IDS));
            case 3:
                gn0 gn0Var = (gn0) v25975809505161317492.get();
                jr0 jr0Var2 = (jr0) v2597580950516131749.get();
                gn0Var.getClass();
                jr0Var2.getClass();
                return new x32(gn0Var, 2, 2, O14838623545224379975.f(jr0Var2, cw0.FIREBASE_ANALYTICS));
            case 4:
                Optional optional = (Optional) v25975809505161317492.get();
                Optional optional2 = (Optional) v2597580950516131749.get();
                optional.getClass();
                optional2.getClass();
                return new mi3((ur2) M18113111391818111737.G(optional, new ur2()), (fh1) M18113111391818111737.G(optional2, new fh1()), new tu2(), new s8());
            case 5:
                return new ck((jr0) v2597580950516131749.get(), (O16637889491137121389) v25975809505161317492.get());
            case 6:
                v31 v31Var = (v31) v25975809505161317492.get();
                jr0 jr0Var3 = (jr0) v2597580950516131749.get();
                v31Var.getClass();
                jr0Var3.getClass();
                return new x32(v31Var, 2, 2, O14838623545224379975.f(jr0Var3, cw0.IN_MEMORY_SDK_CORE_DATA));
            case 7:
                return new dn3((W5797197595347441198) v25975809505161317492.get(), (O12043144740933444288) v2597580950516131749.get());
            case 8:
                return new g3((d3) v25975809505161317492.get(), (jr0) v2597580950516131749.get());
            case 9:
                s82 s82Var = (s82) v25975809505161317492.get();
                jr0 jr0Var4 = (jr0) v2597580950516131749.get();
                s82Var.getClass();
                jr0Var4.getClass();
                return new x32(s82Var, 2, 1, O14838623545224379975.f(jr0Var4, cw0.OMID));
            case 10:
                di diVar = (di) v25975809505161317492.get();
                jr0 jr0Var5 = (jr0) v2597580950516131749.get();
                diVar.getClass();
                jr0Var5.getClass();
                return new x32(diVar, 1, 2, O14838623545224379975.f(jr0Var5, cw0.APP_PERMISSIONS));
            case 11:
                ja2 ja2Var = (ja2) v25975809505161317492.get();
                jr0 jr0Var6 = (jr0) v2597580950516131749.get();
                ja2Var.getClass();
                jr0Var6.getClass();
                return new x32(ja2Var, 1, 2, O14838623545224379975.f(jr0Var6, cw0.PACKAGE_INFO));
            case 12:
                ee3 ee3Var = (ee3) v25975809505161317492.get();
                jr0 jr0Var7 = (jr0) v2597580950516131749.get();
                ee3Var.getClass();
                jr0Var7.getClass();
                return new x32(ee3Var, 2, 2, O14838623545224379975.f(jr0Var7, cw0.TELEPHONY));
            case 13:
                ib2 ib2Var = (ib2) v25975809505161317492.get();
                jr0 jr0Var8 = (jr0) v2597580950516131749.get();
                ib2Var.getClass();
                jr0Var8.getClass();
                return new x32(ib2Var, 1, 2, O14838623545224379975.f(jr0Var8, cw0.PARENT_AD_CONFIG));
            case 14:
                vb2 vb2Var = (vb2) v25975809505161317492.get();
                jr0 jr0Var9 = (jr0) v2597580950516131749.get();
                vb2Var.getClass();
                jr0Var9.getClass();
                return new x32(vb2Var, 2, 2, O14838623545224379975.f(jr0Var9, cw0.PER_APP_ID_V1));
            case 15:
                d3 d3Var = (d3) v25975809505161317492.get();
                jr0 jr0Var10 = (jr0) v2597580950516131749.get();
                d3Var.getClass();
                jr0Var10.getClass();
                return new er(d3Var, O14838623545224379975.f(jr0Var10, cw0.AD_ID_INFO), null);
            case 16:
                ac2 ac2Var = (ac2) v25975809505161317492.get();
                jr0 jr0Var11 = (jr0) v2597580950516131749.get();
                ac2Var.getClass();
                jr0Var11.getClass();
                return new x32(ac2Var, 2, 2, O14838623545224379975.f(jr0Var11, cw0.PER_APP_ID_V2));
            case 17:
                return new kl1((Executor) v25975809505161317492.get(), (O16637889491137121389) v2597580950516131749.get());
            case 18:
                return new l11((jr0) v25975809505161317492.get(), (t11) v2597580950516131749.get());
            case 19:
                k3 k3Var = (k3) v25975809505161317492.get();
                jr0 jr0Var12 = (jr0) v2597580950516131749.get();
                k3Var.getClass();
                jr0Var12.getClass();
                return new x32(k3Var, 2, 2, O14838623545224379975.f(jr0Var12, cw0.AD_ID_PERMISSION));
            case 20:
                ks2 ks2Var = (ks2) v25975809505161317492.get();
                jr0 jr0Var13 = (jr0) v2597580950516131749.get();
                ks2Var.getClass();
                jr0Var13.getClass();
                return new x32(ks2Var, 1, 2, O14838623545224379975.f(jr0Var13, cw0.QUALITY));
            case 21:
                jr0 jr0Var14 = (jr0) v25975809505161317492.get();
                jr0Var14.getClass();
                if (((Boolean) jr0Var14.a("gads:native_ad_inspector_gesture:enabled", Boolean.FALSE, ao.a$11)).booleanValue()) {
                    return (wf0) v2597580950516131749.get();
                }
                return null;
            case 22:
                x5 x5Var = (x5) v25975809505161317492.get();
                jr0 jr0Var15 = (jr0) v2597580950516131749.get();
                x5Var.getClass();
                jr0Var15.getClass();
                return new x32(x5Var, 1, 1, O14838623545224379975.f(jr0Var15, cw0.AD_REQUEST));
            case 23:
                wv2 wv2Var = (wv2) v25975809505161317492.get();
                jr0 jr0Var16 = (jr0) v2597580950516131749.get();
                wv2Var.getClass();
                jr0Var16.getClass();
                return new x32(wv2Var, 1, 1, O14838623545224379975.f(jr0Var16, cw0.REQUEST_ID));
            case 24:
                return new bw2((jr0) v25975809505161317492.get(), (O16637889491137121389) v2597580950516131749.get());
            case 25:
                return new o12((jr0) v25975809505161317492.get(), v2597580950516131749);
            case 26:
                q23 q23Var = (q23) v25975809505161317492.get();
                jr0 jr0Var17 = (jr0) v2597580950516131749.get();
                q23Var.getClass();
                jr0Var17.getClass();
                return new x32(q23Var, 1, 1, O14838623545224379975.f(jr0Var17, cw0.SDK_ENV));
            case 27:
                return new p01((jr0) v25975809505161317492.get(), (String) v2597580950516131749.get());
            case 28:
                o33 o33Var = (o33) v25975809505161317492.get();
                jr0 jr0Var18 = (jr0) v2597580950516131749.get();
                o33Var.getClass();
                jr0Var18.getClass();
                return new x32(o33Var, 2, 2, O14838623545224379975.f(jr0Var18, cw0.SESSION_ID));
            default:
                ac acVar = (ac) v25975809505161317492.get();
                jr0 jr0Var19 = (jr0) v2597580950516131749.get();
                acVar.getClass();
                jr0Var19.getClass();
                return new x32(acVar, 2, 2, O14838623545224379975.f(jr0Var19, cw0.ADAPTER_VERSIONS));
        }
    }
}
