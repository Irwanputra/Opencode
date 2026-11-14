package dev.epro.r0;

import dev.epro.xray.RuntimeCallback;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public final class M8128317349740850300 implements RuntimeCallback {
    public final B13729205492206812220 a;
    public final B13729205492206812220 b;
    public final F4096073349764486348 c;

    static {
        izmyclvb.dpqpjfpoanwt1(1040);
    }

    private native void pjqapsuylfqh(B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, F4096073349764486348 f4096073349764486348);

    @Override // dev.epro.xray.RuntimeCallback
    public final native long onStarted();

    @Override // dev.epro.xray.RuntimeCallback
    public final native long onStatus(long j, String str);

    @Override // dev.epro.xray.RuntimeCallback
    public final native long onStopped();

    public M8128317349740850300(B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, F4096073349764486348 f4096073349764486348) {
        b13729205492206812220.getClass();
        b137292054922068122202.getClass();
        f4096073349764486348.getClass();
        pjqapsuylfqh(b13729205492206812220, b137292054922068122202, f4096073349764486348);
    }
}
