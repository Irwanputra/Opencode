package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L4099941323637989549 {
    public static final L4099941323637989549 a;
    public static final L4099941323637989549 b;
    public static final L4099941323637989549 c;
    public static final /* synthetic */ L4099941323637989549[] d;

    static {
        L4099941323637989549 l4099941323637989549 = new L4099941323637989549("Yes", 0);
        a = l4099941323637989549;
        L4099941323637989549 l40999413236379895492 = new L4099941323637989549("No", 1);
        b = l40999413236379895492;
        L4099941323637989549 l40999413236379895493 = new L4099941323637989549("NotInitialized", 2);
        c = l40999413236379895493;
        d = new L4099941323637989549[]{l4099941323637989549, l40999413236379895492, l40999413236379895493};
    }

    public static L4099941323637989549 valueOf(String str) {
        return (L4099941323637989549) Enum.valueOf(L4099941323637989549.class, str);
    }

    public static L4099941323637989549[] values() {
        return (L4099941323637989549[]) d.clone();
    }
}
