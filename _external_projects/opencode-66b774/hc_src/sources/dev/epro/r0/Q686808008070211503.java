package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Q686808008070211503 extends R15896830329318850690 implements C12172695433110393112, P12234187177891585406, V6844203142031704410 {

    /* renamed from: o, reason: collision with root package name */
    public final W15170032298606046665 f457o;
    public boolean p;
    public F4096073349764486348 q;

    public Q686808008070211503(W15170032298606046665 w15170032298606046665, F4096073349764486348 f4096073349764486348) {
        this.f457o = w15170032298606046665;
        this.q = f4096073349764486348;
        w15170032298606046665.a = this;
    }

    @Override // dev.epro.r0.V6844203142031704410
    public final void E(N17396598995248644478 n17396598995248644478) {
        boolean z = this.p;
        W15170032298606046665 w15170032298606046665 = this.f457o;
        if (!z) {
            w15170032298606046665.b = null;
            I3887072968740112330.D(this, new D16945471218061474327(this, w15170032298606046665, (byte) 18));
            if (w15170032298606046665.b == null) {
                throw L11610354117192841236.j("DrawResult not defined, did you forget to call onDraw?");
            }
            this.p = true;
        }
        F6942723054099263096 f6942723054099263096 = w15170032298606046665.b;
        f6942723054099263096.getClass();
        ((F4096073349764486348) f6942723054099263096.b).invoke(n17396598995248644478);
    }

    @Override // dev.epro.r0.V6844203142031704410
    public final void H0() {
        h1();
    }

    @Override // dev.epro.r0.R16749699847173633337
    public final void O0() {
        h1();
    }

    @Override // dev.epro.r0.C12172695433110393112
    public final void Z() {
        h1();
    }

    @Override // dev.epro.r0.R16749699847173633337
    public final void a() {
        h1();
    }

    @Override // dev.epro.r0.R15896830329318850690
    public final void b1() {
        h1();
    }

    @Override // dev.epro.r0.P12234187177891585406
    public final R8540738700654750557 c() {
        return R7033599853981556291.R(this).y;
    }

    @Override // dev.epro.r0.P12234187177891585406
    public final long e() {
        return I3887072968740112330.Q(R7033599853981556291.P(this, 4).c);
    }

    @Override // dev.epro.r0.P12234187177891585406
    public final F10342546226345611902 getLayoutDirection() {
        return R7033599853981556291.R(this).z;
    }

    public final void h1() {
        this.p = false;
        this.f457o.b = null;
        V1475975160983963926.D(this);
    }

    @Override // dev.epro.r0.R15896830329318850690
    public final void a1() {
    }
}
