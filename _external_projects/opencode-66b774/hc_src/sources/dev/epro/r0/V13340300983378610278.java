package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class V13340300983378610278 {
    public static final V13340300983378610278 a;
    public static final /* synthetic */ V13340300983378610278[] b;

    /* JADX INFO: Fake field, exist only in values array */
    V13340300983378610278 EF0;

    static {
        V13340300983378610278 v13340300983378610278 = new V13340300983378610278("Visible", 0);
        V13340300983378610278 v133403009833786102782 = new V13340300983378610278("Clip", 1);
        a = v133403009833786102782;
        b = new V13340300983378610278[]{v13340300983378610278, v133403009833786102782, new V13340300983378610278("ExpandIndicator", 2), new V13340300983378610278("ExpandOrCollapseIndicator", 3)};
    }

    public static V13340300983378610278 valueOf(String str) {
        return (V13340300983378610278) Enum.valueOf(V13340300983378610278.class, str);
    }

    public static V13340300983378610278[] values() {
        return (V13340300983378610278[]) b.clone();
    }
}
