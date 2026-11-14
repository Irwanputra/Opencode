package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class F13667294285619437008 {
    public static final F13667294285619437008 a;
    public static final F13667294285619437008 b;
    public static final F13667294285619437008 c;
    public static final /* synthetic */ F13667294285619437008[] d;

    static {
        F13667294285619437008 f13667294285619437008 = new F13667294285619437008("Left", 0);
        a = f13667294285619437008;
        F13667294285619437008 f136672942856194370082 = new F13667294285619437008("Middle", 1);
        b = f136672942856194370082;
        F13667294285619437008 f136672942856194370083 = new F13667294285619437008("Right", 2);
        c = f136672942856194370083;
        d = new F13667294285619437008[]{f13667294285619437008, f136672942856194370082, f136672942856194370083};
    }

    public static F13667294285619437008 valueOf(String str) {
        return (F13667294285619437008) Enum.valueOf(F13667294285619437008.class, str);
    }

    public static F13667294285619437008[] values() {
        return (F13667294285619437008[]) d.clone();
    }
}
