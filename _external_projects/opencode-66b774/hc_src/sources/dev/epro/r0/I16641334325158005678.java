package dev.epro.r0;

import dev.epro.relay.DestinationObserver;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes2.dex */
public final class I16641334325158005678 implements DestinationObserver {
    public final /* synthetic */ B13729205492206812220 a;
    public final /* synthetic */ B13729205492206812220 b;
    public final /* synthetic */ E13395689114940028192 c;

    static {
        izmyclvb.dpqpjfpoanwt1(1772);
    }

    private native void qmwvpsqnguso(B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, E13395689114940028192 e13395689114940028192);

    @Override // dev.epro.relay.DestinationObserver
    public final native boolean canReportDestination();

    @Override // dev.epro.relay.DestinationObserver
    public final native void onDestination(String str, int i);

    public I16641334325158005678(B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, E13395689114940028192 e13395689114940028192) {
        this.a = b13729205492206812220;
        this.b = b137292054922068122202;
        this.c = e13395689114940028192;
        qmwvpsqnguso(b13729205492206812220, b137292054922068122202, e13395689114940028192);
    }
}
