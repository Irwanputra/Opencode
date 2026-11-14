package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class V988791003021430672 {
    public static final V988791003021430672 a;
    public static final V988791003021430672 b;
    public static final /* synthetic */ V988791003021430672[] c;

    static {
        V988791003021430672 v988791003021430672 = new V988791003021430672("Min", 0);
        a = v988791003021430672;
        V988791003021430672 v9887910030214306722 = new V988791003021430672("Max", 1);
        b = v9887910030214306722;
        c = new V988791003021430672[]{v988791003021430672, v9887910030214306722};
    }

    public static V988791003021430672 valueOf(String str) {
        return (V988791003021430672) Enum.valueOf(V988791003021430672.class, str);
    }

    public static V988791003021430672[] values() {
        return (V988791003021430672[]) c.clone();
    }
}
