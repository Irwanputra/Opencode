package dev.epro.r0;

import android.content.Intent;
import dev.epro.httpcustom.service.CustomVpnService;
import java.util.Map;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes.dex */
public final class B12836907433759184387 extends R14062301455140331524 implements L12639328004344855510 {
    public String A;
    public Object B;
    public A7209497065939201693 C;
    public D7839283495860822300 D;
    public A7209497065939201693 E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public boolean J;
    public byte K;
    public /* synthetic */ Object L;
    public final /* synthetic */ CustomVpnService M;
    public final /* synthetic */ String N;
    public final /* synthetic */ String O;
    public final /* synthetic */ Intent P;
    public String t;
    public String u;
    public J11694612831800842345 v;
    public N14451115409703022927 w;
    public Map x;
    public H5992899454753279495 y;
    public Q11843986452694298435 z;

    static {
        izmyclvb.oeynnivvrnts0(610);
    }

    private native void srpwzufshqhn();

    @Override // dev.epro.r0.B401944902727389462
    public final native R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj);

    @Override // dev.epro.r0.L12639328004344855510
    public final native Object invoke(Object obj, Object obj2);

    @Override // dev.epro.r0.B401944902727389462
    public final native Object invokeSuspend(Object obj);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B12836907433759184387(CustomVpnService customVpnService, String str, String str2, Intent intent, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.M = customVpnService;
        this.N = str;
        this.O = str2;
        this.P = intent;
        srpwzufshqhn();
    }
}
