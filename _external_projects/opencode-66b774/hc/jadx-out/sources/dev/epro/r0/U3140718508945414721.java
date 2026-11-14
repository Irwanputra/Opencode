package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class U3140718508945414721 {
    public static final U3140718508945414721 a;
    public static final U3140718508945414721 b;
    public static final /* synthetic */ U3140718508945414721[] c;

    static {
        U3140718508945414721 u3140718508945414721 = new U3140718508945414721("Min", 0);
        a = u3140718508945414721;
        U3140718508945414721 u31407185089454147212 = new U3140718508945414721("Max", 1);
        b = u31407185089454147212;
        c = new U3140718508945414721[]{u3140718508945414721, u31407185089454147212};
    }

    public static U3140718508945414721 valueOf(String str) {
        return (U3140718508945414721) Enum.valueOf(U3140718508945414721.class, str);
    }

    public static U3140718508945414721[] values() {
        return (U3140718508945414721[]) c.clone();
    }
}
