package dev.epro.r0;

import dev.epro.httpcustom.service.CustomVpnService;
import java.util.Map;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class L12561189341391923157 extends K14749510448791472029 {
    public JSONObject A;
    public String B;
    public boolean C;
    public int D;
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ CustomVpnService G;
    public int H;
    public Map t;
    public String u;
    public R11548601961566607882 v;
    public String w;
    public String x;
    public String y;
    public String z;

    static {
        izmyclvb.dpqpjfpoanwt1(1182);
    }

    private native void naabzdqpomun(CustomVpnService customVpnService, R4833348786910499294 r4833348786910499294);

    @Override // dev.epro.r0.B401944902727389462
    public final native Object invokeSuspend(Object obj);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L12561189341391923157(CustomVpnService customVpnService, R4833348786910499294 r4833348786910499294) {
        super(r4833348786910499294);
        this.G = customVpnService;
        naabzdqpomun(customVpnService, r4833348786910499294);
    }
}
