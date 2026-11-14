package dev.epro.r0;

import dev.epro.xray.ConnectionDestinationListener;
import java.util.concurrent.atomic.AtomicBoolean;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes2.dex */
public final class K12173450025780201993 implements ConnectionDestinationListener {
    public final ConnectionDestinationListener a;
    public final AtomicBoolean b;

    static {
        izmyclvb.dpqpjfpoanwt1(2099);
    }

    private native void axlnajwvuwol(ConnectionDestinationListener connectionDestinationListener);

    @Override // dev.epro.xray.ConnectionDestinationListener
    public final native boolean canReportDestination();

    @Override // dev.epro.xray.ConnectionDestinationListener
    public final native void onConnectionDestination(String str, long j);

    public K12173450025780201993(ConnectionDestinationListener connectionDestinationListener) {
        connectionDestinationListener.getClass();
        axlnajwvuwol(connectionDestinationListener);
    }
}
