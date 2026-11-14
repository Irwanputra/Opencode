package dev.epro.r0;

import dev.epro.xray.ConnectionDestinationListener;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes.dex */
public final class C17680375646888910079 implements ConnectionDestinationListener {
    public final /* synthetic */ Y3978536533230235023 a;
    public final /* synthetic */ long b;

    static {
        izmyclvb.oeynnivvrnts0(64);
    }

    private native void bmjfdtuygrkk(Y3978536533230235023 y3978536533230235023, long j);

    @Override // dev.epro.xray.ConnectionDestinationListener
    public final native boolean canReportDestination();

    @Override // dev.epro.xray.ConnectionDestinationListener
    public final native void onConnectionDestination(String str, long j);

    public C17680375646888910079(Y3978536533230235023 y3978536533230235023, long j) {
        this.a = y3978536533230235023;
        this.b = j;
        bmjfdtuygrkk(y3978536533230235023, j);
    }
}
