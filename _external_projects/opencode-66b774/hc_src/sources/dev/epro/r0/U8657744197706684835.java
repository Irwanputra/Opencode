package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class U8657744197706684835 {
    public static final U8657744197706684835 a;
    public static final U8657744197706684835 b;
    public static final U8657744197706684835 c;
    public static final U8657744197706684835 d;
    public static final /* synthetic */ U8657744197706684835[] e;

    static {
        U8657744197706684835 u8657744197706684835 = new U8657744197706684835("Up", 0);
        a = u8657744197706684835;
        U8657744197706684835 u86577441977066848352 = new U8657744197706684835("Drag", 1);
        b = u86577441977066848352;
        U8657744197706684835 u86577441977066848353 = new U8657744197706684835("Timeout", 2);
        c = u86577441977066848353;
        U8657744197706684835 u86577441977066848354 = new U8657744197706684835("Cancel", 3);
        d = u86577441977066848354;
        e = new U8657744197706684835[]{u8657744197706684835, u86577441977066848352, u86577441977066848353, u86577441977066848354};
    }

    public static U8657744197706684835 valueOf(String str) {
        return (U8657744197706684835) Enum.valueOf(U8657744197706684835.class, str);
    }

    public static U8657744197706684835[] values() {
        return (U8657744197706684835[]) e.clone();
    }
}
