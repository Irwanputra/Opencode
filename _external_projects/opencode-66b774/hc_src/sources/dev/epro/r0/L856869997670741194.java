package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L856869997670741194 {
    public static final L856869997670741194 a;
    public static final L856869997670741194 b;
    public static final L856869997670741194 c;
    public static final L856869997670741194 d;
    public static final /* synthetic */ L856869997670741194[] e;

    static {
        L856869997670741194 l856869997670741194 = new L856869997670741194("DEFAULT", 0);
        a = l856869997670741194;
        L856869997670741194 l8568699976707411942 = new L856869997670741194("LAZY", 1);
        b = l8568699976707411942;
        L856869997670741194 l8568699976707411943 = new L856869997670741194("ATOMIC", 2);
        c = l8568699976707411943;
        L856869997670741194 l8568699976707411944 = new L856869997670741194("UNDISPATCHED", 3);
        d = l8568699976707411944;
        e = new L856869997670741194[]{l856869997670741194, l8568699976707411942, l8568699976707411943, l8568699976707411944};
    }

    public static L856869997670741194 valueOf(String str) {
        return (L856869997670741194) Enum.valueOf(L856869997670741194.class, str);
    }

    public static L856869997670741194[] values() {
        return (L856869997670741194[]) e.clone();
    }
}
