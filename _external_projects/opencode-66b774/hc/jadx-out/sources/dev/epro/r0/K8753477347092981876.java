package dev.epro.r0;

import android.content.Context;
import dev.epro.httpcustom.service.VpnWatchdogJobService;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public final class K8753477347092981876 extends K14749510448791472029 {
    public Context t;
    public J11694612831800842345 u;
    public D5497766694042515542 v;
    public /* synthetic */ Object w;
    public final /* synthetic */ VpnWatchdogJobService x;
    public int y;

    static {
        izmyclvb.dpqpjfpoanwt1(1489);
    }

    private native void fflwgqwtjpvo(VpnWatchdogJobService vpnWatchdogJobService, R4833348786910499294 r4833348786910499294);

    @Override // dev.epro.r0.B401944902727389462
    public final native Object invokeSuspend(Object obj);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K8753477347092981876(VpnWatchdogJobService vpnWatchdogJobService, R4833348786910499294 r4833348786910499294) {
        super(r4833348786910499294);
        this.x = vpnWatchdogJobService;
        fflwgqwtjpvo(vpnWatchdogJobService, r4833348786910499294);
    }
}
