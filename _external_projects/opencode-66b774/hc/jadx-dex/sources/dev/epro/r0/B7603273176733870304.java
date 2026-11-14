package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final /* synthetic */ class B7603273176733870304 implements java.lang.Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Runnable d;

    public /* synthetic */ B7603273176733870304(int i, boolean z, int i2, java.lang.Runnable runnable) {
        this.a = i;
        this.b = z;
        this.c = i2;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Runnable runnable = this.d;
        int threadStatsTag = android.net.TrafficStats.getThreadStatsTag();
        android.net.TrafficStats.setThreadStatsTag(this.a);
        boolean z = this.b;
        if (z) {
            org.chromium.net.ThreadStatsUid.set(this.c);
        }
        try {
            runnable.run();
        } finally {
            if (z) {
                org.chromium.net.ThreadStatsUid.clear();
            }
            android.net.TrafficStats.setThreadStatsTag(threadStatsTag);
        }
    }
}
