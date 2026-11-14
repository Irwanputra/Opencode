package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class T2980169321753815924 {
    public static final T2980169321753815924 a;
    public static final /* synthetic */ T2980169321753815924[] b;

    static {
        T2980169321753815924 t2980169321753815924 = new T2980169321753815924("Horizontal", 0);
        a = t2980169321753815924;
        b = new T2980169321753815924[]{t2980169321753815924, new T2980169321753815924("Vertical", 1)};
    }

    public static T2980169321753815924 valueOf(String str) {
        return (T2980169321753815924) Enum.valueOf(T2980169321753815924.class, str);
    }

    public static T2980169321753815924[] values() {
        return (T2980169321753815924[]) b.clone();
    }
}
