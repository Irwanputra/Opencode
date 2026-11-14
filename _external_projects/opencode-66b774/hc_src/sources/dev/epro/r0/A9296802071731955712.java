package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class A9296802071731955712 {
    public static final A9296802071731955712 a;
    public static final A9296802071731955712 b;
    public static final A9296802071731955712 c;
    public static final /* synthetic */ A9296802071731955712[] d;

    static {
        A9296802071731955712 a9296802071731955712 = new A9296802071731955712("None", 0);
        a = a9296802071731955712;
        A9296802071731955712 a92968020717319557122 = new A9296802071731955712("Touch", 1);
        b = a92968020717319557122;
        A9296802071731955712 a92968020717319557123 = new A9296802071731955712("Mouse", 2);
        c = a92968020717319557123;
        d = new A9296802071731955712[]{a9296802071731955712, a92968020717319557122, a92968020717319557123};
    }

    public static A9296802071731955712 valueOf(String str) {
        return (A9296802071731955712) Enum.valueOf(A9296802071731955712.class, str);
    }

    public static A9296802071731955712[] values() {
        return (A9296802071731955712[]) d.clone();
    }
}
