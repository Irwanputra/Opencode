package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class U2881608476368693523 {
    public static final U2881608476368693523 a;
    public static final U2881608476368693523 b;
    public static final /* synthetic */ U2881608476368693523[] c;

    static {
        U2881608476368693523 u2881608476368693523 = new U2881608476368693523("Min", 0);
        a = u2881608476368693523;
        U2881608476368693523 u28816084763686935232 = new U2881608476368693523("Max", 1);
        b = u28816084763686935232;
        c = new U2881608476368693523[]{u2881608476368693523, u28816084763686935232};
    }

    public static U2881608476368693523 valueOf(String str) {
        return (U2881608476368693523) Enum.valueOf(U2881608476368693523.class, str);
    }

    public static U2881608476368693523[] values() {
        return (U2881608476368693523[]) c.clone();
    }
}
