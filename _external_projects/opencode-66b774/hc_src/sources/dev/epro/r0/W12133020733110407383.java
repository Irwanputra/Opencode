package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class W12133020733110407383 {
    public static final W12133020733110407383 a;
    public static final W12133020733110407383 b;
    public static final /* synthetic */ W12133020733110407383[] c;

    static {
        W12133020733110407383 w12133020733110407383 = new W12133020733110407383("DEFERRED", 0);
        a = w12133020733110407383;
        W12133020733110407383 w121330207331104073832 = new W12133020733110407383("IMMEDIATE", 1);
        b = w121330207331104073832;
        c = new W12133020733110407383[]{w12133020733110407383, w121330207331104073832, new W12133020733110407383("EXCLUSIVE", 2)};
    }

    public static W12133020733110407383 valueOf(String str) {
        return (W12133020733110407383) Enum.valueOf(W12133020733110407383.class, str);
    }

    public static W12133020733110407383[] values() {
        return (W12133020733110407383[]) c.clone();
    }
}
