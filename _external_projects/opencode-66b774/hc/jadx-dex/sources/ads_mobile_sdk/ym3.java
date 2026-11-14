package ads_mobile_sdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ym3 {
    public static final ads_mobile_sdk.ym3 a;
    public static final ads_mobile_sdk.ym3 b;
    public static final ads_mobile_sdk.ym3 c;
    public static final ads_mobile_sdk.ym3 d;
    public static final ads_mobile_sdk.ym3 e;
    public static final ads_mobile_sdk.ym3 f;
    public static final /* synthetic */ ads_mobile_sdk.ym3[] g;

    static {
        ads_mobile_sdk.ym3 ym3Var = new ads_mobile_sdk.ym3("RESULT_UNKNOWN", 0);
        a = ym3Var;
        ads_mobile_sdk.ym3 ym3Var2 = new ads_mobile_sdk.ym3("RESULT_NOOP_LOCAL_PROGRAM_STILL_VALID", 1);
        b = ym3Var2;
        ads_mobile_sdk.ym3 ym3Var3 = new ads_mobile_sdk.ym3("RESULT_UPDATED", 2);
        c = ym3Var3;
        ads_mobile_sdk.ym3 ym3Var4 = new ads_mobile_sdk.ym3("RESULT_NOOP_NO_NEW_PROGRAM", 3);
        d = ym3Var4;
        ads_mobile_sdk.ym3 ym3Var5 = new ads_mobile_sdk.ym3("RESULT_FAILURE_INVALID_RESPONSE", 4);
        e = ym3Var5;
        ads_mobile_sdk.ym3 ym3Var6 = new ads_mobile_sdk.ym3("RESULT_FAILURE_FETCHER_HTTP_RUNTIME_EXCEPTION", 5);
        f = ym3Var6;
        g = new ads_mobile_sdk.ym3[]{ym3Var, ym3Var2, ym3Var3, ym3Var4, ym3Var5, ym3Var6};
    }

    public static ads_mobile_sdk.ym3[] values() {
        return (ads_mobile_sdk.ym3[]) g.clone();
    }
}
