package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class A12270298036511864110 implements P11191550465322624469 {
    public final J14476340649358081657 a;

    public A12270298036511864110(Throwable th) {
        this.a = new J14476340649358081657(this, th, 2);
    }

    @Override // dev.epro.r0.P11191550465322624469
    public final P11191550465322624469 a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // dev.epro.r0.P11191550465322624469
    public final J14476340649358081657 c() {
        return this.a;
    }

    @Override // dev.epro.r0.P11191550465322624469
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // dev.epro.r0.P11191550465322624469
    public final H3726261569308128079 d() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // dev.epro.r0.P11191550465322624469
    public final boolean e() {
        return false;
    }

    @Override // dev.epro.r0.P11191550465322624469
    public final J14476340649358081657 g() {
        return this.a;
    }
}
