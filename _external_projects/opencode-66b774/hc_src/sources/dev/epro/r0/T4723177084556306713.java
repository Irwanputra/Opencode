package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class T4723177084556306713 {
    public static final T4723177084556306713 a;
    public static final T4723177084556306713 b;
    public static final /* synthetic */ T4723177084556306713[] c;

    /* JADX INFO: Fake field, exist only in values array */
    T4723177084556306713 EF0;

    static {
        T4723177084556306713 t4723177084556306713 = new T4723177084556306713("AUTOMATIC", 0);
        T4723177084556306713 t47231770845563067132 = new T4723177084556306713("TRUNCATE", 1);
        a = t47231770845563067132;
        T4723177084556306713 t47231770845563067133 = new T4723177084556306713("WRITE_AHEAD_LOGGING", 2);
        b = t47231770845563067133;
        c = new T4723177084556306713[]{t4723177084556306713, t47231770845563067132, t47231770845563067133};
    }

    public static T4723177084556306713 valueOf(String str) {
        return (T4723177084556306713) Enum.valueOf(T4723177084556306713.class, str);
    }

    public static T4723177084556306713[] values() {
        return (T4723177084556306713[]) c.clone();
    }
}
