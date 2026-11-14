package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class U14177313425639231181 extends Y8405992380652585640 {
    public final /* synthetic */ byte Y;
    public final /* synthetic */ Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U14177313425639231181(L18340033906139995425 l18340033906139995425) {
        super(true);
        this.Y = (byte) 3;
        this.Z = l18340033906139995425;
    }

    @Override // dev.epro.r0.Y8405992380652585640
    public void handleOnBackCancelled() {
        byte b = this.Y;
    }

    @Override // dev.epro.r0.Y8405992380652585640
    public final void handleOnBackPressed() {
        byte b = this.Y;
        Object obj = this.Z;
        switch (b) {
            case 0:
                ((Q295190250517022391) obj).c.invoke();
                break;
            case 1:
                P14575954172000745949 p14575954172000745949 = (P14575954172000745949) obj;
                p14575954172000745949.x(true);
                if (!p14575954172000745949.h.isEnabled()) {
                    p14575954172000745949.g.c();
                    break;
                } else {
                    p14575954172000745949.J();
                    break;
                }
            case 2:
                ((S2557420383749238385) obj).c();
                break;
            default:
                ((L18340033906139995425) obj).invoke(this);
                break;
        }
    }

    @Override // dev.epro.r0.Y8405992380652585640
    public void handleOnBackProgressed(N7102107663372104177 n7102107663372104177) {
        byte b = this.Y;
    }

    @Override // dev.epro.r0.Y8405992380652585640
    public void handleOnBackStarted(N7102107663372104177 n7102107663372104177) {
        byte b = this.Y;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U14177313425639231181(Object obj, byte b) {
        super(false);
        this.Y = b;
        this.Z = obj;
    }

    private final void a() {
    }

    private final void b(N7102107663372104177 n7102107663372104177) {
    }

    private final void c(N7102107663372104177 n7102107663372104177) {
    }
}
