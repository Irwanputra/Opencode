package dev.epro.r0;

import dev.epro.mobile.DestinationObserver;
import java.util.concurrent.atomic.AtomicBoolean;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes2.dex */
public final class K10943211184070847758 implements DestinationObserver {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ B13729205492206812220 b;
    public final /* synthetic */ B13729205492206812220 c;
    public final /* synthetic */ E13395689114940028192 d;
    public final /* synthetic */ D10030753892766079115 e;

    static {
        izmyclvb.dpqpjfpoanwt1(1610);
    }

    private native void pjppyvxxucus(AtomicBoolean atomicBoolean, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, E13395689114940028192 e13395689114940028192, D10030753892766079115 d10030753892766079115);

    @Override // dev.epro.mobile.DestinationObserver
    public final native boolean canReportDestination();

    @Override // dev.epro.mobile.DestinationObserver
    public final native void onDestination(String str, int i);

    public K10943211184070847758(AtomicBoolean atomicBoolean, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, E13395689114940028192 e13395689114940028192, D10030753892766079115 d10030753892766079115) {
        this.a = atomicBoolean;
        this.b = b13729205492206812220;
        this.c = b137292054922068122202;
        this.d = e13395689114940028192;
        this.e = d10030753892766079115;
        pjppyvxxucus(atomicBoolean, b13729205492206812220, b137292054922068122202, e13395689114940028192, d10030753892766079115);
    }
}
