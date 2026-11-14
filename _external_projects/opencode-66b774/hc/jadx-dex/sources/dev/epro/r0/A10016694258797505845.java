package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A10016694258797505845 {
    public static final dev.epro.r0.A10016694258797505845 a;
    public static final dev.epro.r0.A10016694258797505845 b;
    public static final dev.epro.r0.A10016694258797505845 c;
    public static final /* synthetic */ dev.epro.r0.A10016694258797505845[] d;

    static {
        dev.epro.r0.A10016694258797505845 a10016694258797505845 = new dev.epro.r0.A10016694258797505845("PRESENT", 0);
        a = a10016694258797505845;
        dev.epro.r0.A10016694258797505845 a100166942587975058452 = new dev.epro.r0.A10016694258797505845("ABSENT", 1);
        b = a100166942587975058452;
        dev.epro.r0.A10016694258797505845 a100166942587975058453 = new dev.epro.r0.A10016694258797505845("PRESENT_OPTIONAL", 2);
        c = a100166942587975058453;
        d = new dev.epro.r0.A10016694258797505845[]{a10016694258797505845, a100166942587975058452, a100166942587975058453, new dev.epro.r0.A10016694258797505845("ABSENT_OPTIONAL", 3)};
    }

    public static dev.epro.r0.A10016694258797505845 valueOf(java.lang.String str) {
        return (dev.epro.r0.A10016694258797505845) java.lang.Enum.valueOf(dev.epro.r0.A10016694258797505845.class, str);
    }

    public static dev.epro.r0.A10016694258797505845[] values() {
        return (dev.epro.r0.A10016694258797505845[]) d.clone();
    }
}
