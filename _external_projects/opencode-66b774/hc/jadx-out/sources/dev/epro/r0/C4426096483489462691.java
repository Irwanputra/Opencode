package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class C4426096483489462691 {
    public static final C4426096483489462691 a;
    public static final C4426096483489462691 b;
    public static final C4426096483489462691 c;
    public static final /* synthetic */ C4426096483489462691[] d;

    static {
        C4426096483489462691 c4426096483489462691 = new C4426096483489462691("START", 0);
        a = c4426096483489462691;
        C4426096483489462691 c44260964834894626912 = new C4426096483489462691("STOP", 1);
        b = c44260964834894626912;
        C4426096483489462691 c44260964834894626913 = new C4426096483489462691("STOP_AND_RESET_REPLAY_CACHE", 2);
        c = c44260964834894626913;
        d = new C4426096483489462691[]{c4426096483489462691, c44260964834894626912, c44260964834894626913};
    }

    public static C4426096483489462691 valueOf(String str) {
        return (C4426096483489462691) Enum.valueOf(C4426096483489462691.class, str);
    }

    public static C4426096483489462691[] values() {
        return (C4426096483489462691[]) d.clone();
    }
}
