package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class E2129282299719668689 {
    public static final E2129282299719668689 a;
    public static final E2129282299719668689 b;
    public static final /* synthetic */ E2129282299719668689[] c;

    static {
        E2129282299719668689 e2129282299719668689 = new E2129282299719668689("Min", 0);
        a = e2129282299719668689;
        E2129282299719668689 e21292822997196686892 = new E2129282299719668689("Max", 1);
        b = e21292822997196686892;
        c = new E2129282299719668689[]{e2129282299719668689, e21292822997196686892};
    }

    public static E2129282299719668689 valueOf(String str) {
        return (E2129282299719668689) Enum.valueOf(E2129282299719668689.class, str);
    }

    public static E2129282299719668689[] values() {
        return (E2129282299719668689[]) c.clone();
    }
}
