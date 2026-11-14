package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class g83 {
    public final int a;
    public final int b;
    public final long d;
    public final dev.epro.r0.B13729205492206812220 e;

    public g83(dev.epro.r0.K4548097313143615345 k4548097313143615345, int i, int i2, long j, dev.epro.r0.B13729205492206812220 b13729205492206812220) {
        if (i == 0 || i2 == 0) {
            throw null;
        }
        this.a = i;
        this.b = i2;
        this.d = j;
        this.e = b13729205492206812220;
    }

    public abstract dev.epro.r0.K4548097313143615345 b();
}
