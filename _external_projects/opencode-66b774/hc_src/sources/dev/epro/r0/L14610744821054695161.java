package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L14610744821054695161 {
    public static final L14610744821054695161 b;
    public static final /* synthetic */ L14610744821054695161[] c;
    public static final /* synthetic */ M665231115116566295 d;
    public final byte a;

    static {
        L14610744821054695161 l14610744821054695161 = new L14610744821054695161("DEFAULT", 0, 0);
        b = l14610744821054695161;
        L14610744821054695161[] l14610744821054695161Arr = {l14610744821054695161, new L14610744821054695161("ENABLED", 1, 1), new L14610744821054695161("DISABLED", 2, 2)};
        c = l14610744821054695161Arr;
        d = new M665231115116566295(l14610744821054695161Arr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public L14610744821054695161(String str, int i, int i2) {
        this.a = i2;
    }

    public static L14610744821054695161[] values() {
        return (L14610744821054695161[]) c.clone();
    }
}
