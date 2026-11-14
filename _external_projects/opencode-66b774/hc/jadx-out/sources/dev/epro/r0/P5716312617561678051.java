package dev.epro.r0;

import android.content.Context;
import dev.epro.httpcustom.service.VpnWatchdogJobService;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public final class P5716312617561678051 extends K14749510448791472029 {
    public Context t;
    public L12602321637077960189 u;
    public S705323397128503595 v;
    public J11694612831800842345 w;
    public /* synthetic */ Object x;
    public final /* synthetic */ VpnWatchdogJobService y;
    public int z;

    static {
        izmyclvb.qgayjvbiagej2(1827);
    }

    private native void gnvekeezqfsd(VpnWatchdogJobService vpnWatchdogJobService, R4833348786910499294 r4833348786910499294);

    @Override // dev.epro.r0.B401944902727389462
    public final native Object invokeSuspend(Object obj);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P5716312617561678051(VpnWatchdogJobService vpnWatchdogJobService, R4833348786910499294 r4833348786910499294) {
        super(r4833348786910499294);
        this.y = vpnWatchdogJobService;
        gnvekeezqfsd(vpnWatchdogJobService, r4833348786910499294);
    }
}
