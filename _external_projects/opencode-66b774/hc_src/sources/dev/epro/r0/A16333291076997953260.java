package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class A16333291076997953260 extends Y8405992380652585640 {
    public final W5797197595347441198 Y;
    public final U16834965109098959004 Z;
    public final W2269277550458425547 a0;

    public A16333291076997953260(W5797197595347441198 w5797197595347441198, U16834965109098959004 u16834965109098959004, W2269277550458425547 w2269277550458425547) {
        super(true);
        this.Y = w5797197595347441198;
        this.Z = u16834965109098959004;
        this.a0 = w2269277550458425547;
    }

    @Override // dev.epro.r0.Y8405992380652585640
    public final void handleOnBackCancelled() {
        R7033599853981556291.E(this.Y, null, null, new G16212247282630895364(this, null, (byte) 8), 3);
    }

    @Override // dev.epro.r0.Y8405992380652585640
    public final void handleOnBackPressed() {
        this.a0.invoke();
    }

    @Override // dev.epro.r0.Y8405992380652585640
    public final void handleOnBackProgressed(N7102107663372104177 n7102107663372104177) {
        R7033599853981556291.E(this.Y, null, null, new F9369235655626653964(this, n7102107663372104177, null, (byte) 0), 3);
    }

    @Override // dev.epro.r0.Y8405992380652585640
    public final void handleOnBackStarted(N7102107663372104177 n7102107663372104177) {
        R7033599853981556291.E(this.Y, null, null, new F9369235655626653964(this, n7102107663372104177, null, (byte) 1), 3);
    }
}
