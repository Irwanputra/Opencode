package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class X2386491360844208170 {
    public static final X2386491360844208170 a;
    public static final X2386491360844208170 b;
    public static final X2386491360844208170 c;
    public static final /* synthetic */ X2386491360844208170[] d;

    static {
        X2386491360844208170 x2386491360844208170 = new X2386491360844208170("Focused", 0);
        a = x2386491360844208170;
        X2386491360844208170 x23864913608442081702 = new X2386491360844208170("UnfocusedEmpty", 1);
        b = x23864913608442081702;
        X2386491360844208170 x23864913608442081703 = new X2386491360844208170("UnfocusedNotEmpty", 2);
        c = x23864913608442081703;
        d = new X2386491360844208170[]{x2386491360844208170, x23864913608442081702, x23864913608442081703};
    }

    public static X2386491360844208170 valueOf(String str) {
        return (X2386491360844208170) Enum.valueOf(X2386491360844208170.class, str);
    }

    public static X2386491360844208170[] values() {
        return (X2386491360844208170[]) d.clone();
    }
}
