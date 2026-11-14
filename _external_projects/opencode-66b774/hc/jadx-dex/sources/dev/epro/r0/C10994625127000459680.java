package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C10994625127000459680 extends dev.epro.r0.C775827382551829194 implements dev.epro.r0.J5715778638296486773, dev.epro.r0.U11782692406915154495, dev.epro.r0.H5360721299395888827, dev.epro.r0.F18341548724281518495, dev.epro.r0.T10859954020941270144 {
    public final dev.epro.r0.R13227154569034155950 q;
    public final dev.epro.r0.R13227154569034155950 r;
    public final android.os.Handler s;
    public final dev.epro.r0.P14575954172000745949 t;
    public final /* synthetic */ dev.epro.r0.R13227154569034155950 u;

    public C10994625127000459680(dev.epro.r0.R13227154569034155950 r13227154569034155950) {
        this.u = r13227154569034155950;
        android.os.Handler handler = new android.os.Handler();
        this.t = new dev.epro.r0.P14575954172000745949();
        this.q = r13227154569034155950;
        this.r = r13227154569034155950;
        this.s = handler;
    }

    @Override // dev.epro.r0.C775827382551829194
    public final android.view.View S(int i) {
        return this.u.findViewById(i);
    }

    @Override // dev.epro.r0.C775827382551829194
    public final boolean T() {
        android.view.Window window = this.u.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    public final dev.epro.r0.U6333859635337865127 a() {
        return this.u.a();
    }

    public final dev.epro.r0.V10300877997588547986 b() {
        return (dev.epro.r0.V10300877997588547986) ((dev.epro.r0.T17336508261397230716) this.u).d.c;
    }

    public final dev.epro.r0.J6160233934771378283 h() {
        return ((dev.epro.r0.T17336508261397230716) this.u).h;
    }

    public final dev.epro.r0.L3530692241870850490 i() {
        return this.u.i();
    }

    public final dev.epro.r0.R3192876217964974737 j() {
        return this.u.v;
    }

    public final void c() {
    }
}
