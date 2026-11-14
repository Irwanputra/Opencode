package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P13847083447510769873 {
    public static final P13847083447510769873 a;
    public static final P13847083447510769873 b;
    public static final /* synthetic */ P13847083447510769873[] c;

    static {
        P13847083447510769873 p13847083447510769873 = new P13847083447510769873("VIEW_APPEAR", 0);
        a = p13847083447510769873;
        P13847083447510769873 p138470834475107698732 = new P13847083447510769873("VIEW_DISAPPEAR", 1);
        b = p138470834475107698732;
        c = new P13847083447510769873[]{p13847083447510769873, p138470834475107698732};
    }

    public static P13847083447510769873 valueOf(String str) {
        return (P13847083447510769873) Enum.valueOf(P13847083447510769873.class, str);
    }

    public static P13847083447510769873[] values() {
        return (P13847083447510769873[]) c.clone();
    }
}
