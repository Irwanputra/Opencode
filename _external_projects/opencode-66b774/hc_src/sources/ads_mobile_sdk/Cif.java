package ads_mobile_sdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* renamed from: ads_mobile_sdk.if, reason: invalid class name */
/* loaded from: classes.dex */
public final class Cif {
    public static final Cif a;
    public static final Cif b;
    public static final Cif c;
    public static final /* synthetic */ Cif[] d;

    static {
        Cif cif = new Cif("NO_ANR", 0);
        a = cif;
        Cif cif2 = new Cif("EARLY_ANR", 1);
        b = cif2;
        Cif cif3 = new Cif("FULL_ANR", 2);
        c = cif3;
        d = new Cif[]{cif, cif2, cif3};
    }

    public static Cif[] values() {
        return (Cif[]) d.clone();
    }
}
