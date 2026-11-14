package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class V10616265840975294035 {
    public static final V10616265840975294035 a;
    public static final V10616265840975294035 b;
    public static final /* synthetic */ V10616265840975294035[] c;

    static {
        V10616265840975294035 v10616265840975294035 = new V10616265840975294035("SHOW_ORIGINAL", 0);
        a = v10616265840975294035;
        V10616265840975294035 v106162658409752940352 = new V10616265840975294035("SHOW_TRANSLATED", 1);
        b = v106162658409752940352;
        c = new V10616265840975294035[]{v10616265840975294035, v106162658409752940352};
    }

    public static V10616265840975294035 valueOf(String str) {
        return (V10616265840975294035) Enum.valueOf(V10616265840975294035.class, str);
    }

    public static V10616265840975294035[] values() {
        return (V10616265840975294035[]) c.clone();
    }
}
