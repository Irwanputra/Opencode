package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class n13 implements Comparable {
    public final Runnable a;
    public final long b;

    public n13(Runnable runnable, long j) {
        this.a = runnable;
        this.b = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.b, ((n13) obj).b);
    }
}
