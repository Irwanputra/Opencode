package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class O7265813552375631487 implements P11191550465322624469 {
    public final H3726261569308128079 a;

    public O7265813552375631487(H3726261569308128079 h3726261569308128079) {
        h3726261569308128079.getClass();
        this.a = h3726261569308128079;
    }

    @Override // dev.epro.r0.P11191550465322624469
    public final P11191550465322624469 a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // dev.epro.r0.P11191550465322624469
    public final J14476340649358081657 c() {
        throw new IllegalStateException("already connected");
    }

    @Override // dev.epro.r0.P11191550465322624469
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // dev.epro.r0.P11191550465322624469
    public final H3726261569308128079 d() {
        return this.a;
    }

    @Override // dev.epro.r0.P11191550465322624469
    public final boolean e() {
        return true;
    }

    @Override // dev.epro.r0.P11191550465322624469
    public final J14476340649358081657 g() {
        throw new IllegalStateException("already connected");
    }
}
