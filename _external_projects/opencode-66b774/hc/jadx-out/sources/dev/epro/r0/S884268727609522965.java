package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class S884268727609522965 {
    public static final S884268727609522965 a;
    public static final S884268727609522965 b;
    public static final /* synthetic */ S884268727609522965[] c;

    static {
        S884268727609522965 s884268727609522965 = new S884268727609522965("Closed", 0);
        a = s884268727609522965;
        S884268727609522965 s8842687276095229652 = new S884268727609522965("Open", 1);
        b = s8842687276095229652;
        c = new S884268727609522965[]{s884268727609522965, s8842687276095229652};
    }

    public static S884268727609522965 valueOf(String str) {
        return (S884268727609522965) Enum.valueOf(S884268727609522965.class, str);
    }

    public static S884268727609522965[] values() {
        return (S884268727609522965[]) c.clone();
    }
}
