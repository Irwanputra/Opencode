package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class H3913161109771689215 {
    public static final H3913161109771689215 a;
    public static final H3913161109771689215 b;
    public static final /* synthetic */ H3913161109771689215[] c;

    static {
        H3913161109771689215 h3913161109771689215 = new H3913161109771689215("Short", 0);
        a = h3913161109771689215;
        H3913161109771689215 h39131611097716892152 = new H3913161109771689215("Long", 1);
        b = h39131611097716892152;
        c = new H3913161109771689215[]{h3913161109771689215, h39131611097716892152, new H3913161109771689215("Indefinite", 2)};
    }

    public static H3913161109771689215 valueOf(String str) {
        return (H3913161109771689215) Enum.valueOf(H3913161109771689215.class, str);
    }

    public static H3913161109771689215[] values() {
        return (H3913161109771689215[]) c.clone();
    }
}
