package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A10016694258797505845 {
    public static final A10016694258797505845 a;
    public static final A10016694258797505845 b;
    public static final A10016694258797505845 c;
    public static final /* synthetic */ A10016694258797505845[] d;

    static {
        A10016694258797505845 a10016694258797505845 = new A10016694258797505845("PRESENT", 0);
        a = a10016694258797505845;
        A10016694258797505845 a100166942587975058452 = new A10016694258797505845("ABSENT", 1);
        b = a100166942587975058452;
        A10016694258797505845 a100166942587975058453 = new A10016694258797505845("PRESENT_OPTIONAL", 2);
        c = a100166942587975058453;
        d = new A10016694258797505845[]{a10016694258797505845, a100166942587975058452, a100166942587975058453, new A10016694258797505845("ABSENT_OPTIONAL", 3)};
    }

    public static A10016694258797505845 valueOf(String str) {
        return (A10016694258797505845) Enum.valueOf(A10016694258797505845.class, str);
    }

    public static A10016694258797505845[] values() {
        return (A10016694258797505845[]) d.clone();
    }
}
