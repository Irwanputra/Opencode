package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Y5330024065592724852 {
    public final long a;
    public final long b;
    public final boolean c;

    public Y5330024065592724852(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final Y5330024065592724852 a(Y5330024065592724852 y5330024065592724852) {
        return new Y5330024065592724852(L2216691091636065972.f(this.a, y5330024065592724852.a), Math.max(this.b, y5330024065592724852.b), this.c || y5330024065592724852.c);
    }
}
