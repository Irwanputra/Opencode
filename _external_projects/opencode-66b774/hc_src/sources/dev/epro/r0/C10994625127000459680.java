package dev.epro.r0;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class C10994625127000459680 extends C775827382551829194 implements J5715778638296486773, U11782692406915154495, H5360721299395888827, F18341548724281518495, T10859954020941270144 {
    public final R13227154569034155950 q;
    public final R13227154569034155950 r;
    public final Handler s;
    public final P14575954172000745949 t;
    public final /* synthetic */ R13227154569034155950 u;

    public C10994625127000459680(R13227154569034155950 r13227154569034155950) {
        this.u = r13227154569034155950;
        Handler handler = new Handler();
        this.t = new P14575954172000745949();
        this.q = r13227154569034155950;
        this.r = r13227154569034155950;
        this.s = handler;
    }

    @Override // dev.epro.r0.C775827382551829194
    public final View S(int i) {
        return this.u.findViewById(i);
    }

    @Override // dev.epro.r0.C775827382551829194
    public final boolean T() {
        Window window = this.u.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // dev.epro.r0.U11782692406915154495
    public final U6333859635337865127 a() {
        return this.u.a();
    }

    @Override // dev.epro.r0.F18341548724281518495
    public final V10300877997588547986 b() {
        return (V10300877997588547986) this.u.d.c;
    }

    @Override // dev.epro.r0.H5360721299395888827
    public final J6160233934771378283 h() {
        return this.u.h;
    }

    @Override // dev.epro.r0.J5715778638296486773
    public final L3530692241870850490 i() {
        return this.u.i();
    }

    @Override // dev.epro.r0.I4293432593871965076
    public final R3192876217964974737 j() {
        return this.u.v;
    }

    @Override // dev.epro.r0.T10859954020941270144
    public final void c() {
    }
}
