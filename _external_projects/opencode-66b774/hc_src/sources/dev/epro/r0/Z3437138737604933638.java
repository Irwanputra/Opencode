package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes4.dex */
public final class Z3437138737604933638 {
    public static final Z3437138737604933638 a;
    public static final Z3437138737604933638 b;
    public static final Z3437138737604933638 c;
    public static final /* synthetic */ Z3437138737604933638[] d;

    static {
        Z3437138737604933638 z3437138737604933638 = new Z3437138737604933638("COROUTINE_SUSPENDED", 0);
        a = z3437138737604933638;
        Z3437138737604933638 z34371387376049336382 = new Z3437138737604933638("UNDECIDED", 1);
        b = z34371387376049336382;
        Z3437138737604933638 z34371387376049336383 = new Z3437138737604933638("RESUMED", 2);
        c = z34371387376049336383;
        d = new Z3437138737604933638[]{z3437138737604933638, z34371387376049336382, z34371387376049336383};
    }

    public static Z3437138737604933638 valueOf(String str) {
        return (Z3437138737604933638) Enum.valueOf(Z3437138737604933638.class, str);
    }

    public static Z3437138737604933638[] values() {
        return (Z3437138737604933638[]) d.clone();
    }
}
