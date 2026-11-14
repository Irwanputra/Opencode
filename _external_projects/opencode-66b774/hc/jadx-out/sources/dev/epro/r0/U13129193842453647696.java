package dev.epro.r0;

import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class U13129193842453647696 implements L12639328004344855510 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    static {
        izmyclvb.qgayjvbiagej2(2216);
    }

    public /* synthetic */ U13129193842453647696(boolean z, String str) {
        this.a = (byte) 0;
        zkxlnfeldclm(z ? 1 : 0, str);
    }

    private native void gfvnyaqheciv(Object obj, boolean z, int i, byte b);

    private native void kemqtcocvuzh(Object obj, boolean z, byte b);

    private native void zkxlnfeldclm(int i, String str);

    @Override // dev.epro.r0.L12639328004344855510
    public final native Object invoke(Object obj, Object obj2);

    public /* synthetic */ U13129193842453647696(Object obj, boolean z, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        gfvnyaqheciv(obj, z, i, b);
    }

    public /* synthetic */ U13129193842453647696(Object obj, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        kemqtcocvuzh(obj, z, b);
    }
}
