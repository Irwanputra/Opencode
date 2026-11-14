package ads_mobile_sdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ads_mobile_sdk.if, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class Cif {
    public static final ads_mobile_sdk.Cif a;
    public static final ads_mobile_sdk.Cif b;
    public static final ads_mobile_sdk.Cif c;
    public static final /* synthetic */ ads_mobile_sdk.Cif[] d;

    static {
        ads_mobile_sdk.Cif cif = new ads_mobile_sdk.Cif("NO_ANR", 0);
        a = cif;
        ads_mobile_sdk.Cif cif2 = new ads_mobile_sdk.Cif("EARLY_ANR", 1);
        b = cif2;
        ads_mobile_sdk.Cif cif3 = new ads_mobile_sdk.Cif("FULL_ANR", 2);
        c = cif3;
        d = new ads_mobile_sdk.Cif[]{cif, cif2, cif3};
    }

    public static ads_mobile_sdk.Cif[] values() {
        return (ads_mobile_sdk.Cif[]) d.clone();
    }
}
