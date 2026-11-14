package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M16210313685714734865 {
    public static final M16210313685714734865 a;
    public static final M16210313685714734865 b;
    public static final M16210313685714734865 c;
    public static final /* synthetic */ M16210313685714734865[] d;

    static {
        M16210313685714734865 m16210313685714734865 = new M16210313685714734865("CROSSED", 0);
        a = m16210313685714734865;
        M16210313685714734865 m162103136857147348652 = new M16210313685714734865("NOT_CROSSED", 1);
        b = m162103136857147348652;
        M16210313685714734865 m162103136857147348653 = new M16210313685714734865("COLLAPSED", 2);
        c = m162103136857147348653;
        d = new M16210313685714734865[]{m16210313685714734865, m162103136857147348652, m162103136857147348653};
    }

    public static M16210313685714734865 valueOf(String str) {
        return (M16210313685714734865) Enum.valueOf(M16210313685714734865.class, str);
    }

    public static M16210313685714734865[] values() {
        return (M16210313685714734865[]) d.clone();
    }
}
