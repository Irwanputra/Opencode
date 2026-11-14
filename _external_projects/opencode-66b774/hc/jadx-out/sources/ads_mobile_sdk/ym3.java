package ads_mobile_sdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class ym3 {
    public static final ym3 a;
    public static final ym3 b;
    public static final ym3 c;
    public static final ym3 d;
    public static final ym3 e;
    public static final ym3 f;
    public static final /* synthetic */ ym3[] g;

    static {
        ym3 ym3Var = new ym3("RESULT_UNKNOWN", 0);
        a = ym3Var;
        ym3 ym3Var2 = new ym3("RESULT_NOOP_LOCAL_PROGRAM_STILL_VALID", 1);
        b = ym3Var2;
        ym3 ym3Var3 = new ym3("RESULT_UPDATED", 2);
        c = ym3Var3;
        ym3 ym3Var4 = new ym3("RESULT_NOOP_NO_NEW_PROGRAM", 3);
        d = ym3Var4;
        ym3 ym3Var5 = new ym3("RESULT_FAILURE_INVALID_RESPONSE", 4);
        e = ym3Var5;
        ym3 ym3Var6 = new ym3("RESULT_FAILURE_FETCHER_HTTP_RUNTIME_EXCEPTION", 5);
        f = ym3Var6;
        g = new ym3[]{ym3Var, ym3Var2, ym3Var3, ym3Var4, ym3Var5, ym3Var6};
    }

    public static ym3[] values() {
        return (ym3[]) g.clone();
    }
}
