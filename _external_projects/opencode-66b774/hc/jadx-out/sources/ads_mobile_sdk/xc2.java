package ads_mobile_sdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class xc2 {
    public static final xc2 a;
    public static final xc2 b;
    public static final xc2 c;
    public static final /* synthetic */ xc2[] d;

    static {
        xc2 xc2Var = new xc2("SUCCESS", 0);
        a = xc2Var;
        xc2 xc2Var2 = new xc2("FAILED", 1);
        b = xc2Var2;
        xc2 xc2Var3 = new xc2("DISABLED", 2);
        c = xc2Var3;
        d = new xc2[]{xc2Var, xc2Var2, xc2Var3};
    }

    public static xc2[] values() {
        return (xc2[]) d.clone();
    }
}
