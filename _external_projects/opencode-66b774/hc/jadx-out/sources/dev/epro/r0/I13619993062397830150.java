package dev.epro.r0;

import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class I13619993062397830150 implements J12078565427869724451 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;

    static {
        izmyclvb.dpqpjfpoanwt1(423);
    }

    private native void arqdbxecokvj(boolean z, String str, byte b);

    private native void fbzjqaeshdfi(String str, boolean z, byte b);

    @Override // dev.epro.r0.J12078565427869724451
    public final native Object invoke(Object obj, Object obj2, Object obj3);

    public /* synthetic */ I13619993062397830150(String str, boolean z, byte b) {
        this.a = b;
        this.b = str;
        this.c = z;
        fbzjqaeshdfi(str, z, b);
    }

    public /* synthetic */ I13619993062397830150(boolean z, String str, byte b) {
        this.a = b;
        this.c = z;
        this.b = str;
        arqdbxecokvj(z, str, b);
    }
}
