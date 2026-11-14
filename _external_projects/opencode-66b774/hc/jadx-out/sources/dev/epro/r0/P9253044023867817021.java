package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P9253044023867817021 {
    public static final P9253044023867817021 a;
    public static final P9253044023867817021 b;
    public static final P9253044023867817021 c;
    public static final /* synthetic */ P9253044023867817021[] d;

    static {
        P9253044023867817021 p9253044023867817021 = new P9253044023867817021("Uninitialized", 0);
        a = p9253044023867817021;
        P9253044023867817021 p92530440238678170212 = new P9253044023867817021("Detached", 1);
        b = p92530440238678170212;
        P9253044023867817021 p92530440238678170213 = new P9253044023867817021("Attached", 2);
        c = p92530440238678170213;
        d = new P9253044023867817021[]{p9253044023867817021, p92530440238678170212, p92530440238678170213};
    }

    public static P9253044023867817021 valueOf(String str) {
        return (P9253044023867817021) Enum.valueOf(P9253044023867817021.class, str);
    }

    public static P9253044023867817021[] values() {
        return (P9253044023867817021[]) d.clone();
    }
}
