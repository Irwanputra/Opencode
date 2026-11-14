package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class o3 implements dev.epro.r0.B8427392651679410143 {
    public final dev.epro.r0.V2597580950516131749 a;
    public final dev.epro.r0.V2597580950516131749 b;
    public final dev.epro.r0.V2597580950516131749 c;
    public final /* synthetic */ byte d;

    public /* synthetic */ o3(dev.epro.r0.V2597580950516131749 v2597580950516131749, dev.epro.r0.V2597580950516131749 v25975809505161317492, dev.epro.r0.V2597580950516131749 v25975809505161317493, byte b) {
        this.d = b;
        this.a = v2597580950516131749;
        this.b = v25975809505161317492;
        this.c = v25975809505161317493;
    }

    public final java.lang.Object get() {
        byte b = this.d;
        dev.epro.r0.V2597580950516131749 v2597580950516131749 = this.c;
        dev.epro.r0.V2597580950516131749 v25975809505161317492 = this.b;
        dev.epro.r0.V2597580950516131749 v25975809505161317493 = this.a;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.n3((ads_mobile_sdk.xj) v25975809505161317493.get(), (ads_mobile_sdk.qw2) v25975809505161317492.get(), (ads_mobile_sdk.hf2) v2597580950516131749.get());
            case 1:
                return new ads_mobile_sdk.zi1("WAUAhz2k/QWNP4dzFKOEkBF2UwrOirTUtp74DpjfC+Z1z8qTVjT5/vt9JmMfeN7e", "LRSvg6qV9YPz1X3n0+wpbaEZqpPsDphSAdJdHcHGltg=", (dev.epro.r0.V5431423861497278836) v25975809505161317493.get(), (ads_mobile_sdk.rp1) v25975809505161317492.get(), ((ads_mobile_sdk.vi3) v2597580950516131749.get()).a(ads_mobile_sdk.yk0.EVENT_ID_JAILBREAK_SIGNALS_TASK));
            case 2:
                return new ads_mobile_sdk.b01((dev.epro.r0.W5797197595347441198) v25975809505161317493.get(), (ads_mobile_sdk.t02) v25975809505161317492.get(), v2597580950516131749);
            case 3:
                return new ads_mobile_sdk.e23((dev.epro.r0.W5797197595347441198) v25975809505161317493.get(), ads_mobile_sdk.gj0.a(v25975809505161317492), (dev.epro.r0.O16637889491137121389) v2597580950516131749.get());
            case 4:
                return new ads_mobile_sdk.hr1((ads_mobile_sdk.jr0) v25975809505161317493.get(), (dev.epro.r0.K12714355155332733186) v25975809505161317492.get(), (dev.epro.r0.O12043144740933444288) v2597580950516131749.get());
            case 5:
                return new ads_mobile_sdk.xm2((java.io.File) v25975809505161317493.get(), (ads_mobile_sdk.uo3) v25975809505161317492.get(), (ads_mobile_sdk.vi3) v2597580950516131749.get());
            case 6:
                return new ads_mobile_sdk.js1((ads_mobile_sdk.bq1) v25975809505161317493.get(), (java.util.Optional) v25975809505161317492.get(), (dev.epro.r0.W5797197595347441198) v2597580950516131749.get());
            case 7:
                ads_mobile_sdk.kz2 kz2Var = (ads_mobile_sdk.kz2) v25975809505161317493.get();
                dev.epro.r0.O16637889491137121389 o16637889491137121389 = (dev.epro.r0.O16637889491137121389) v25975809505161317492.get();
                ads_mobile_sdk.jr0 jr0Var = (ads_mobile_sdk.jr0) v2597580950516131749.get();
                kz2Var.getClass();
                o16637889491137121389.getClass();
                jr0Var.getClass();
                ads_mobile_sdk.d62 d62Var = new ads_mobile_sdk.d62();
                int iIntValue = ((java.lang.Number) jr0Var.a("gads:maximum_query_json_cache_size", (java.lang.Object) 200, (dev.epro.r0.F4096073349764486348) ads_mobile_sdk.ao.a$18)).intValue();
                dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
                new dev.epro.r0.H15186625828076266306();
                new ads_mobile_sdk.zk0(new java.util.ArrayList(), iIntValue);
                return d62Var;
            case 8:
                return new ads_mobile_sdk.qw1((dev.epro.r0.L15364388172060466559) v25975809505161317493.get(), (ads_mobile_sdk.mw1) v25975809505161317492.get(), (ads_mobile_sdk.zy1) v2597580950516131749.get());
            case 9:
                java.io.File file = (java.io.File) v25975809505161317493.get();
                ads_mobile_sdk.gm0 gm0Var = (ads_mobile_sdk.gm0) v25975809505161317492.get();
                ads_mobile_sdk.vi3 vi3Var = (ads_mobile_sdk.vi3) v2597580950516131749.get();
                ads_mobile_sdk.rm2 rm2VarQ = ads_mobile_sdk.rm2.q();
                return new ads_mobile_sdk.fm0(file, gm0Var.a, new ads_mobile_sdk.c7((java.lang.Object) rm2VarQ, (byte) 5), new dev.epro.r0.J11152666533199988631(vi3Var, (byte) 1));
            case 10:
                java.io.File file2 = (java.io.File) v25975809505161317493.get();
                ads_mobile_sdk.gm0 gm0Var2 = (ads_mobile_sdk.gm0) v25975809505161317492.get();
                return new ads_mobile_sdk.fm0(file2, gm0Var2.a, new ads_mobile_sdk.c(new byte[0], (byte) 1), new dev.epro.r0.J11152666533199988631((ads_mobile_sdk.vi3) v2597580950516131749.get(), (byte) 2));
            case 11:
                return new ads_mobile_sdk.x43((dev.epro.r0.G8001132634698687269) v25975809505161317493.get(), (ads_mobile_sdk.jp0) v25975809505161317492.get(), (ads_mobile_sdk.x12) v2597580950516131749.get());
            case 12:
                java.io.File file3 = (java.io.File) v25975809505161317493.get();
                ads_mobile_sdk.gm0 gm0Var3 = (ads_mobile_sdk.gm0) v25975809505161317492.get();
                return new ads_mobile_sdk.fm0(file3, gm0Var3.a, new ads_mobile_sdk.c(new byte[0], (byte) 1), new dev.epro.r0.J11152666533199988631((ads_mobile_sdk.vi3) v2597580950516131749.get(), (byte) 0));
            default:
                return new ads_mobile_sdk.yz0((dev.epro.r0.W5797197595347441198) v25975809505161317493.get(), (ads_mobile_sdk.jp0) v25975809505161317492.get(), (ads_mobile_sdk.x12) v2597580950516131749.get());
        }
    }
}
