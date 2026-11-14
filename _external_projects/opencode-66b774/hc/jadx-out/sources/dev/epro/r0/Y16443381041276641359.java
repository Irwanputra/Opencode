package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Y16443381041276641359 {
    public static final Y16443381041276641359 a;
    public static final Y16443381041276641359 b;
    public static final Y16443381041276641359 c;
    public static final /* synthetic */ Y16443381041276641359[] d;

    static {
        Y16443381041276641359 y16443381041276641359 = new Y16443381041276641359("On", 0);
        a = y16443381041276641359;
        Y16443381041276641359 y164433810412766413592 = new Y16443381041276641359("Off", 1);
        b = y164433810412766413592;
        Y16443381041276641359 y164433810412766413593 = new Y16443381041276641359("Indeterminate", 2);
        c = y164433810412766413593;
        d = new Y16443381041276641359[]{y16443381041276641359, y164433810412766413592, y164433810412766413593};
    }

    public static Y16443381041276641359 valueOf(String str) {
        return (Y16443381041276641359) Enum.valueOf(Y16443381041276641359.class, str);
    }

    public static Y16443381041276641359[] values() {
        return (Y16443381041276641359[]) d.clone();
    }
}
