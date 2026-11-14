package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class L8604775722691123943 {
    public static final L8604775722691123943 a;
    public static final L8604775722691123943 b;
    public static final L8604775722691123943 c;
    public static final /* synthetic */ L8604775722691123943[] d;

    static {
        L8604775722691123943 l8604775722691123943 = new L8604775722691123943("Insert", 0);
        a = l8604775722691123943;
        L8604775722691123943 l86047757226911239432 = new L8604775722691123943("Delete", 1);
        b = l86047757226911239432;
        L8604775722691123943 l86047757226911239433 = new L8604775722691123943("Replace", 2);
        c = l86047757226911239433;
        d = new L8604775722691123943[]{l8604775722691123943, l86047757226911239432, l86047757226911239433};
    }

    public static L8604775722691123943 valueOf(String str) {
        return (L8604775722691123943) Enum.valueOf(L8604775722691123943.class, str);
    }

    public static L8604775722691123943[] values() {
        return (L8604775722691123943[]) d.clone();
    }
}
