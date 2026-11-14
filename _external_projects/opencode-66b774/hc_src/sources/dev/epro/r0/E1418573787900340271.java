package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class E1418573787900340271 {
    public static final E1418573787900340271 a;
    public static final E1418573787900340271 b;
    public static final /* synthetic */ E1418573787900340271[] c;

    static {
        E1418573787900340271 e1418573787900340271 = new E1418573787900340271("MergeIfPossible", 0);
        a = e1418573787900340271;
        E1418573787900340271 e14185737879003402712 = new E1418573787900340271("ClearHistory", 1);
        E1418573787900340271 e14185737879003402713 = new E1418573787900340271("NeverMerge", 2);
        b = e14185737879003402713;
        c = new E1418573787900340271[]{e1418573787900340271, e14185737879003402712, e14185737879003402713};
    }

    public static E1418573787900340271 valueOf(String str) {
        return (E1418573787900340271) Enum.valueOf(E1418573787900340271.class, str);
    }

    public static E1418573787900340271[] values() {
        return (E1418573787900340271[]) c.clone();
    }
}
