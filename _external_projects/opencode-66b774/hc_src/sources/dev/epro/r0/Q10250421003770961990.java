package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Q10250421003770961990 {
    public static final Q10250421003770961990 a;
    public static final Q10250421003770961990 b;
    public static final Q10250421003770961990 c;
    public static final /* synthetic */ Q10250421003770961990[] d;

    static {
        Q10250421003770961990 q10250421003770961990 = new Q10250421003770961990("ContinueTraversal", 0);
        a = q10250421003770961990;
        Q10250421003770961990 q102504210037709619902 = new Q10250421003770961990("SkipSubtreeAndContinueTraversal", 1);
        b = q102504210037709619902;
        Q10250421003770961990 q102504210037709619903 = new Q10250421003770961990("CancelTraversal", 2);
        c = q102504210037709619903;
        d = new Q10250421003770961990[]{q10250421003770961990, q102504210037709619902, q102504210037709619903};
    }

    public static Q10250421003770961990 valueOf(String str) {
        return (Q10250421003770961990) Enum.valueOf(Q10250421003770961990.class, str);
    }

    public static Q10250421003770961990[] values() {
        return (Q10250421003770961990[]) d.clone();
    }
}
