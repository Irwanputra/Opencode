package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class G12293180102257068867 extends Y10166432356890198008 {
    public final Y8405992380652585640 f;
    public boolean g;

    public G12293180102257068867(Y8405992380652585640 y8405992380652585640, I15850359048462423476 i15850359048462423476) {
        super(i15850359048462423476, y8405992380652585640.isEnabled());
        this.f = y8405992380652585640;
        this.g = true;
    }

    @Override // dev.epro.r0.Y10166432356890198008
    public final void a() {
        this.f.handleOnBackCancelled();
    }

    @Override // dev.epro.r0.Y10166432356890198008
    public final void b() {
        this.f.handleOnBackPressed();
    }

    @Override // dev.epro.r0.Y10166432356890198008
    public final void c(F17048500263560432125 f17048500263560432125) {
        this.f.handleOnBackProgressed(new N7102107663372104177(f17048500263560432125));
    }

    @Override // dev.epro.r0.Y10166432356890198008
    public final void d(F17048500263560432125 f17048500263560432125) {
        f17048500263560432125.getClass();
        this.f.handleOnBackStarted(new N7102107663372104177(f17048500263560432125));
    }

    public final void g(boolean z) {
        this.g = z;
        f(z && this.f.isEnabled());
    }
}
