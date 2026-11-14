package dev.epro.r0;

import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes3.dex */
public final /* synthetic */ class V15597576632798492865 implements L12639328004344855510 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ B13729205492206812220 b;
    public final /* synthetic */ boolean c;

    static {
        izmyclvb.qgayjvbiagej2(1163);
    }

    public /* synthetic */ V15597576632798492865(B13729205492206812220 b13729205492206812220, boolean z, int i) {
        this.a = (byte) 4;
        mwtgerpdtngf(b13729205492206812220, z ? 1 : 0);
    }

    private native void jfudzuiykzvh(boolean z, B13729205492206812220 b13729205492206812220, int i, byte b);

    private native void mwtgerpdtngf(B13729205492206812220 b13729205492206812220, int i);

    private native void pwpeoyjdoqfn(byte b, B13729205492206812220 b13729205492206812220, boolean z);

    @Override // dev.epro.r0.L12639328004344855510
    public final native Object invoke(Object obj, Object obj2);

    public /* synthetic */ V15597576632798492865(byte b, B13729205492206812220 b13729205492206812220, boolean z) {
        this.a = b;
        this.b = b13729205492206812220;
        this.c = z;
        pwpeoyjdoqfn(b, b13729205492206812220, z);
    }

    public /* synthetic */ V15597576632798492865(boolean z, B13729205492206812220 b13729205492206812220, int i, byte b) {
        this.a = b;
        this.c = z;
        this.b = b13729205492206812220;
        jfudzuiykzvh(z, b13729205492206812220, i, b);
    }
}
