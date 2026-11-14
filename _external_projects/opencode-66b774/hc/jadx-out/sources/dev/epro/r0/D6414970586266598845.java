package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class D6414970586266598845 {
    public static final D6414970586266598845 a;
    public static final D6414970586266598845 b;
    public static final D6414970586266598845 c;
    public static final /* synthetic */ D6414970586266598845[] d;

    static {
        D6414970586266598845 d6414970586266598845 = new D6414970586266598845("Default", 0);
        a = d6414970586266598845;
        D6414970586266598845 d64149705862665988452 = new D6414970586266598845("UserInput", 1);
        b = d64149705862665988452;
        D6414970586266598845 d64149705862665988453 = new D6414970586266598845("PreventUserInput", 2);
        c = d64149705862665988453;
        d = new D6414970586266598845[]{d6414970586266598845, d64149705862665988452, d64149705862665988453};
    }

    public static D6414970586266598845 valueOf(String str) {
        return (D6414970586266598845) Enum.valueOf(D6414970586266598845.class, str);
    }

    public static D6414970586266598845[] values() {
        return (D6414970586266598845[]) d.clone();
    }
}
