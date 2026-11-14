package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Y17711880887972520074 {
    public static final Y17711880887972520074 a;
    public static final Y17711880887972520074 b;
    public static final /* synthetic */ Y17711880887972520074[] c;

    static {
        Y17711880887972520074 y17711880887972520074 = new Y17711880887972520074("Inherit", 0);
        a = y17711880887972520074;
        Y17711880887972520074 y177118808879725200742 = new Y17711880887972520074("SecureOn", 1);
        b = y177118808879725200742;
        c = new Y17711880887972520074[]{y17711880887972520074, y177118808879725200742, new Y17711880887972520074("SecureOff", 2)};
    }

    public static Y17711880887972520074 valueOf(String str) {
        return (Y17711880887972520074) Enum.valueOf(Y17711880887972520074.class, str);
    }

    public static Y17711880887972520074[] values() {
        return (Y17711880887972520074[]) c.clone();
    }
}
