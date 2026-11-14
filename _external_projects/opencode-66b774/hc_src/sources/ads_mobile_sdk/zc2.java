package ads_mobile_sdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class zc2 {
    public static final zc2 a;
    public static final zc2 b;
    public static final zc2 c;
    public static final zc2 d;
    public static final /* synthetic */ zc2[] e;

    static {
        zc2 zc2Var = new zc2("SUCCESS", 0);
        a = zc2Var;
        zc2 zc2Var2 = new zc2("FAILURE", 1);
        b = zc2Var2;
        zc2 zc2Var3 = new zc2("RETRY", 2);
        c = zc2Var3;
        zc2 zc2Var4 = new zc2("CACHE_DISABLED", 3);
        d = zc2Var4;
        e = new zc2[]{zc2Var, zc2Var2, zc2Var3, zc2Var4};
    }

    public static zc2[] values() {
        return (zc2[]) e.clone();
    }
}
