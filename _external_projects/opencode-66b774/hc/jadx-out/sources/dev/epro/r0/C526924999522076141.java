package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class C526924999522076141 {
    public static final T15504973625601650233 b;
    public static final C526924999522076141 c;
    public static final C526924999522076141 d;
    public static final C526924999522076141 e;
    public static final C526924999522076141 f;
    public static final /* synthetic */ C526924999522076141[] g;
    public static final /* synthetic */ M665231115116566295 h;
    public final byte a;

    static {
        C526924999522076141 c526924999522076141 = new C526924999522076141("Created", 0, 0);
        c = c526924999522076141;
        C526924999522076141 c5269249995220761412 = new C526924999522076141("Starting", 1, 1);
        C526924999522076141 c5269249995220761413 = new C526924999522076141("Connecting", 2, 2);
        C526924999522076141 c5269249995220761414 = new C526924999522076141("Connected", 3, 3);
        d = c5269249995220761414;
        C526924999522076141 c5269249995220761415 = new C526924999522076141("Reconnecting", 4, 4);
        C526924999522076141 c5269249995220761416 = new C526924999522076141("Stopping", 5, 5);
        C526924999522076141 c5269249995220761417 = new C526924999522076141("Stopped", 6, 6);
        e = c5269249995220761417;
        C526924999522076141 c5269249995220761418 = new C526924999522076141("Failed", 7, 7);
        f = c5269249995220761418;
        C526924999522076141[] c526924999522076141Arr = {c526924999522076141, c5269249995220761412, c5269249995220761413, c5269249995220761414, c5269249995220761415, c5269249995220761416, c5269249995220761417, c5269249995220761418};
        g = c526924999522076141Arr;
        h = new M665231115116566295(c526924999522076141Arr);
        b = new T15504973625601650233((byte) 16);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C526924999522076141(String str, int i, int i2) {
        this.a = i2;
    }

    public static C526924999522076141 valueOf(String str) {
        return (C526924999522076141) Enum.valueOf(C526924999522076141.class, str);
    }

    public static C526924999522076141[] values() {
        return (C526924999522076141[]) g.clone();
    }
}
