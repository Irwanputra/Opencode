package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public enum D12150776842870782007 implements J10744057881386199887 {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);

    public final int a;

    D12150776842870782007(int i) {
        this.a = i;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        S10973172697741180971.j("Can't get the number of an unknown enum value.");
        return 0;
    }
}
