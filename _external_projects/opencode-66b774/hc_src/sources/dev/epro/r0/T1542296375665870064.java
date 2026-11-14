package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class T1542296375665870064 {
    public static final T1542296375665870064 a;
    public static final T1542296375665870064 b;
    public static final T1542296375665870064 c;
    public static final /* synthetic */ T1542296375665870064[] d;

    static {
        T1542296375665870064 t1542296375665870064 = new T1542296375665870064("SUSPEND", 0);
        a = t1542296375665870064;
        T1542296375665870064 t15422963756658700642 = new T1542296375665870064("DROP_OLDEST", 1);
        b = t15422963756658700642;
        T1542296375665870064 t15422963756658700643 = new T1542296375665870064("DROP_LATEST", 2);
        c = t15422963756658700643;
        d = new T1542296375665870064[]{t1542296375665870064, t15422963756658700642, t15422963756658700643};
    }

    public static T1542296375665870064 valueOf(String str) {
        return (T1542296375665870064) Enum.valueOf(T1542296375665870064.class, str);
    }

    public static T1542296375665870064[] values() {
        return (T1542296375665870064[]) d.clone();
    }
}
