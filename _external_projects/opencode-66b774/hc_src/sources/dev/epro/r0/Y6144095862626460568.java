package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Y6144095862626460568 {
    public static final Y6144095862626460568 a;
    public static final Y6144095862626460568 b;
    public static final /* synthetic */ Y6144095862626460568[] c;

    static {
        Y6144095862626460568 y6144095862626460568 = new Y6144095862626460568("EXPONENTIAL", 0);
        a = y6144095862626460568;
        Y6144095862626460568 y61440958626264605682 = new Y6144095862626460568("LINEAR", 1);
        b = y61440958626264605682;
        c = new Y6144095862626460568[]{y6144095862626460568, y61440958626264605682};
    }

    public static Y6144095862626460568 valueOf(String str) {
        return (Y6144095862626460568) Enum.valueOf(Y6144095862626460568.class, str);
    }

    public static Y6144095862626460568[] values() {
        return (Y6144095862626460568[]) c.clone();
    }
}
