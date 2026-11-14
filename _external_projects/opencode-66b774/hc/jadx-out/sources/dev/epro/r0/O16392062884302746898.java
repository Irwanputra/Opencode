package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O16392062884302746898 {
    public static final O16392062884302746898 a;
    public static final O16392062884302746898 b;
    public static final /* synthetic */ O16392062884302746898[] c;

    static {
        O16392062884302746898 o16392062884302746898 = new O16392062884302746898("Ltr", 0);
        a = o16392062884302746898;
        O16392062884302746898 o163920628843027468982 = new O16392062884302746898("Rtl", 1);
        b = o163920628843027468982;
        c = new O16392062884302746898[]{o16392062884302746898, o163920628843027468982};
    }

    public static O16392062884302746898 valueOf(String str) {
        return (O16392062884302746898) Enum.valueOf(O16392062884302746898.class, str);
    }

    public static O16392062884302746898[] values() {
        return (O16392062884302746898[]) c.clone();
    }
}
