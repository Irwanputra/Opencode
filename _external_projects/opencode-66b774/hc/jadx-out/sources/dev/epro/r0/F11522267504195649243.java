package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class F11522267504195649243 {
    public static final F11522267504195649243 a;
    public static final F11522267504195649243 b;
    public static final F11522267504195649243 c;
    public static final /* synthetic */ F11522267504195649243[] d;

    static {
        F11522267504195649243 f11522267504195649243 = new F11522267504195649243("Vertical", 0);
        a = f11522267504195649243;
        F11522267504195649243 f115222675041956492432 = new F11522267504195649243("Horizontal", 1);
        b = f115222675041956492432;
        F11522267504195649243 f115222675041956492433 = new F11522267504195649243("Both", 2);
        c = f115222675041956492433;
        d = new F11522267504195649243[]{f11522267504195649243, f115222675041956492432, f115222675041956492433};
    }

    public static F11522267504195649243 valueOf(String str) {
        return (F11522267504195649243) Enum.valueOf(F11522267504195649243.class, str);
    }

    public static F11522267504195649243[] values() {
        return (F11522267504195649243[]) d.clone();
    }
}
