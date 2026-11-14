package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class E2931101495752331306 {
    public static final E2931101495752331306 a;
    public static final E2931101495752331306 b;
    public static final E2931101495752331306 c;
    public static final /* synthetic */ E2931101495752331306[] d;

    static {
        E2931101495752331306 e2931101495752331306 = new E2931101495752331306("PreEnter", 0);
        a = e2931101495752331306;
        E2931101495752331306 e29311014957523313062 = new E2931101495752331306("Visible", 1);
        b = e29311014957523313062;
        E2931101495752331306 e29311014957523313063 = new E2931101495752331306("PostExit", 2);
        c = e29311014957523313063;
        d = new E2931101495752331306[]{e2931101495752331306, e29311014957523313062, e29311014957523313063};
    }

    public static E2931101495752331306 valueOf(String str) {
        return (E2931101495752331306) Enum.valueOf(E2931101495752331306.class, str);
    }

    public static E2931101495752331306[] values() {
        return (E2931101495752331306[]) d.clone();
    }
}
