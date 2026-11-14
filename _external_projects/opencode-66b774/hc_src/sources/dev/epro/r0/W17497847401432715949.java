package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class W17497847401432715949 {
    public static final W17497847401432715949 a;
    public static final W17497847401432715949 b;
    public static final /* synthetic */ W17497847401432715949[] c;

    static {
        W17497847401432715949 w17497847401432715949 = new W17497847401432715949("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        a = w17497847401432715949;
        W17497847401432715949 w174978474014327159492 = new W17497847401432715949("DROP_WORK_REQUEST", 1);
        b = w174978474014327159492;
        c = new W17497847401432715949[]{w17497847401432715949, w174978474014327159492};
    }

    public static W17497847401432715949 valueOf(String str) {
        return (W17497847401432715949) Enum.valueOf(W17497847401432715949.class, str);
    }

    public static W17497847401432715949[] values() {
        return (W17497847401432715949[]) c.clone();
    }
}
