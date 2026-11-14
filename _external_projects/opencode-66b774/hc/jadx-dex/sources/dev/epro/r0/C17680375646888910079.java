package dev.epro.r0;

/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C17680375646888910079 implements dev.epro.xray.ConnectionDestinationListener {
    public final /* synthetic */ dev.epro.r0.Y3978536533230235023 a;
    public final /* synthetic */ long b;

    static {
        o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(64);
    }

    private native void bmjfdtuygrkk(dev.epro.r0.Y3978536533230235023 y3978536533230235023, long j);

    public final native boolean canReportDestination();

    public final native void onConnectionDestination(java.lang.String str, long j);

    public C17680375646888910079(dev.epro.r0.Y3978536533230235023 y3978536533230235023, long j) {
        this.a = y3978536533230235023;
        this.b = j;
        bmjfdtuygrkk(y3978536533230235023, j);
    }
}
