package dev.epro.r0;

import dev.epro.httpcustom.service.CustomVpnService;
import java.util.Map;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes2.dex */
public final class N8334954924328179640 extends K14749510448791472029 {
    public /* synthetic */ Object A;
    public final /* synthetic */ CustomVpnService B;
    public int C;
    public Map t;
    public String u;
    public boolean v;
    public int w;
    public int x;
    public int y;
    public int z;

    static {
        izmyclvb.dpqpjfpoanwt1(616);
    }

    private native void pgrbesbjgnem(CustomVpnService customVpnService, R4833348786910499294 r4833348786910499294);

    @Override // dev.epro.r0.B401944902727389462
    public final native Object invokeSuspend(Object obj);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N8334954924328179640(CustomVpnService customVpnService, R4833348786910499294 r4833348786910499294) {
        super(r4833348786910499294);
        this.B = customVpnService;
        pgrbesbjgnem(customVpnService, r4833348786910499294);
    }
}
