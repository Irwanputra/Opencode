package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class gq1 implements dev.epro.r0.B8427392651679410143 {
    public final dev.epro.r0.V2597580950516131749 a;
    public final dev.epro.r0.V2597580950516131749 b;
    public final dev.epro.r0.V2597580950516131749 c;
    public final dev.epro.r0.V2597580950516131749 d;
    public final dev.epro.r0.V2597580950516131749 e;
    public final /* synthetic */ byte f;

    public /* synthetic */ gq1(dev.epro.r0.V2597580950516131749 v2597580950516131749, dev.epro.r0.V2597580950516131749 v25975809505161317492, dev.epro.r0.V2597580950516131749 v25975809505161317493, dev.epro.r0.V2597580950516131749 v25975809505161317494, dev.epro.r0.V2597580950516131749 v25975809505161317495, byte b) {
        this.f = b;
        this.a = v2597580950516131749;
        this.b = v25975809505161317492;
        this.c = v25975809505161317493;
        this.d = v25975809505161317494;
        this.e = v25975809505161317495;
    }

    public final java.lang.Object get() {
        byte b = this.f;
        dev.epro.r0.V2597580950516131749 v2597580950516131749 = this.e;
        dev.epro.r0.V2597580950516131749 v25975809505161317492 = this.d;
        dev.epro.r0.V2597580950516131749 v25975809505161317493 = this.c;
        dev.epro.r0.V2597580950516131749 v25975809505161317494 = this.b;
        dev.epro.r0.V2597580950516131749 v25975809505161317495 = this.a;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.fq1((ads_mobile_sdk.di0) v25975809505161317495.get(), (ads_mobile_sdk.bq1) v25975809505161317494.get(), (ads_mobile_sdk.rw0) v25975809505161317493.get(), (dev.epro.r0.W5797197595347441198) v25975809505161317492.get(), (ads_mobile_sdk.g0) v2597580950516131749.get());
            case 1:
                return new ads_mobile_sdk.ga3((ads_mobile_sdk.j7) v25975809505161317495.get(), (ads_mobile_sdk.da3) v25975809505161317494.get(), (ads_mobile_sdk.qm1) v25975809505161317493.get(), (java.util.concurrent.ExecutorService) v25975809505161317492.get(), (ads_mobile_sdk.vi3) v2597580950516131749.get());
            default:
                return new ads_mobile_sdk.qh3((dev.epro.r0.V5431423861497278836) v25975809505161317495.get(), (ads_mobile_sdk.rp1) v25975809505161317494.get(), (java.util.Map) v25975809505161317493.get(), (android.util.DisplayMetrics) v25975809505161317492.get(), (ads_mobile_sdk.vi3) v2597580950516131749.get());
        }
    }
}
