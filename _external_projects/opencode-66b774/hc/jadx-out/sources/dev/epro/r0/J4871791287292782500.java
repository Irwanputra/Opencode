package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J4871791287292782500 {
    public static final J4871791287292782500 a;
    public static final J4871791287292782500 b;
    public static final J4871791287292782500 c;
    public static final /* synthetic */ J4871791287292782500[] d;

    static {
        J4871791287292782500 j4871791287292782500 = new J4871791287292782500("IsPlacedInLookahead", 0);
        a = j4871791287292782500;
        J4871791287292782500 j48717912872927825002 = new J4871791287292782500("IsPlacedInApproach", 1);
        b = j48717912872927825002;
        J4871791287292782500 j48717912872927825003 = new J4871791287292782500("IsNotPlaced", 2);
        c = j48717912872927825003;
        d = new J4871791287292782500[]{j4871791287292782500, j48717912872927825002, j48717912872927825003};
    }

    public static J4871791287292782500 valueOf(String str) {
        return (J4871791287292782500) Enum.valueOf(J4871791287292782500.class, str);
    }

    public static J4871791287292782500[] values() {
        return (J4871791287292782500[]) d.clone();
    }
}
