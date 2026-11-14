package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public abstract class Z4431149477876260063 extends R15896830329318850690 implements S16154245747709621665 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public B9345618057833789735 f602o;
    public B9345618057833789735 p;

    public Z4431149477876260063() {
        D5719685721490174593 d5719685721490174593 = E18444280280170001567.I;
        this.f602o = d5719685721490174593;
        this.p = d5719685721490174593;
    }

    @Override // dev.epro.r0.R15896830329318850690
    public void Z0() {
        U1554499319261669842.u(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new H3126903116597819080(this, (byte) 1));
        i1();
    }

    @Override // dev.epro.r0.R15896830329318850690
    public void a1() {
        this.p = this.f602o;
        U1554499319261669842.w(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new H3126903116597819080(this, (byte) 0));
    }

    @Override // dev.epro.r0.R15896830329318850690
    public final void b1() {
        this.f602o = E18444280280170001567.I;
    }

    public abstract B9345618057833789735 h1(B9345618057833789735 b9345618057833789735);

    public void i1() {
        this.p = h1(this.f602o);
        U1554499319261669842.w(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new H3126903116597819080(this, (byte) 0));
    }

    @Override // dev.epro.r0.S16154245747709621665
    public final Object u() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }
}
