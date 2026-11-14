package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class K17167296697167754928 {
    public static final K17167296697167754928 a;
    public static final /* synthetic */ K17167296697167754928[] b;

    static {
        K17167296697167754928 k17167296697167754928 = new K17167296697167754928("Default", 0);
        a = k17167296697167754928;
        b = new K17167296697167754928[]{k17167296697167754928, new K17167296697167754928("UserInput", 1), new K17167296697167754928("PreventUserInput", 2)};
    }

    public static K17167296697167754928 valueOf(String str) {
        return (K17167296697167754928) Enum.valueOf(K17167296697167754928.class, str);
    }

    public static K17167296697167754928[] values() {
        return (K17167296697167754928[]) b.clone();
    }
}
