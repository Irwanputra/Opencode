package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class K13343232784169554427 {
    public static final K13343232784169554427 a;
    public static final K13343232784169554427 b;
    public static final K13343232784169554427 c;
    public static final K13343232784169554427 d;
    public static final /* synthetic */ K13343232784169554427[] e;

    static {
        K13343232784169554427 k13343232784169554427 = new K13343232784169554427("StartInput", 0);
        a = k13343232784169554427;
        K13343232784169554427 k133432327841695544272 = new K13343232784169554427("StopInput", 1);
        b = k133432327841695544272;
        K13343232784169554427 k133432327841695544273 = new K13343232784169554427("ShowKeyboard", 2);
        c = k133432327841695544273;
        K13343232784169554427 k133432327841695544274 = new K13343232784169554427("HideKeyboard", 3);
        d = k133432327841695544274;
        e = new K13343232784169554427[]{k13343232784169554427, k133432327841695544272, k133432327841695544273, k133432327841695544274};
    }

    public static K13343232784169554427 valueOf(String str) {
        return (K13343232784169554427) Enum.valueOf(K13343232784169554427.class, str);
    }

    public static K13343232784169554427[] values() {
        return (K13343232784169554427[]) e.clone();
    }
}
