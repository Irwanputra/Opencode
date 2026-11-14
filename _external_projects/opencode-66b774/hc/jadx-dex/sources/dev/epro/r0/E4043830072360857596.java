package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final /* synthetic */ class E4043830072360857596 implements java.lang.Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dev.epro.r0.H3351639798230113779 b;
    public final /* synthetic */ java.lang.String c;

    public /* synthetic */ E4043830072360857596(dev.epro.r0.H3351639798230113779 h3351639798230113779, java.lang.String str, byte b) {
        this.a = b;
        this.b = h3351639798230113779;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        java.lang.String str = this.c;
        dev.epro.r0.H3351639798230113779 h3351639798230113779 = this.b;
        switch (b) {
            case 0:
                ((dev.epro.r0.R2847330884077978889) h3351639798230113779.l).c.remove(str);
                break;
            default:
                ((dev.epro.r0.R2847330884077978889) h3351639798230113779.l).c.remove(str);
                break;
        }
    }
}
