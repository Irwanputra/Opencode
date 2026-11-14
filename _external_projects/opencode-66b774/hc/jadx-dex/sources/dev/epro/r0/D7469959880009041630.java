package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D7469959880009041630 extends dev.epro.r0.S3817735695007400440 {
    public dev.epro.r0.F4096073349764486348 r;
    public dev.epro.r0.L11283005264715124852 s;

    public final void Z0() {
        android.view.View viewY = dev.epro.r0.O5354877807466160604.Y(this);
        java.util.WeakHashMap weakHashMap = dev.epro.r0.L11283005264715124852.w;
        dev.epro.r0.L11283005264715124852 l11283005264715124852J = dev.epro.r0.E7125458317232359087.j(viewY);
        l11283005264715124852J.a(viewY);
        dev.epro.r0.B9345618057833789735 b9345618057833789735 = (dev.epro.r0.B9345618057833789735) this.r.invoke(l11283005264715124852J);
        if (!dev.epro.r0.S10823041268949770285.t(b9345618057833789735, ((dev.epro.r0.S3817735695007400440) this).q)) {
            ((dev.epro.r0.S3817735695007400440) this).q = b9345618057833789735;
            i1();
        }
        this.s = l11283005264715124852J;
        super/*dev.epro.r0.Z4431149477876260063*/.Z0();
    }

    public final void a1() {
        android.view.View viewY = dev.epro.r0.O5354877807466160604.Y(this);
        dev.epro.r0.L11283005264715124852 l11283005264715124852 = this.s;
        if (l11283005264715124852 != null) {
            int i = l11283005264715124852.u - 1;
            l11283005264715124852.u = i;
            if (i == 0) {
                java.util.WeakHashMap weakHashMap = dev.epro.r0.W10240872260424387225.a;
                dev.epro.r0.Q5747078841744593420.c(viewY, (dev.epro.r0.S15634377979812012213) null);
                dev.epro.r0.Q12598757537405990809.a(viewY, (dev.epro.r0.F3160751278268780235) null);
                viewY.removeOnAttachStateChangeListener(l11283005264715124852.v);
            }
        }
        super/*dev.epro.r0.Z4431149477876260063*/.a1();
    }
}
