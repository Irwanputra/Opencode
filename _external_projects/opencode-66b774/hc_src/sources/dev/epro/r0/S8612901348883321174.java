package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final /* synthetic */ class S8612901348883321174 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Z11821137052809198413 b;
    public final /* synthetic */ R5909351061398077004 c;

    public /* synthetic */ S8612901348883321174(Z11821137052809198413 z11821137052809198413, R5909351061398077004 r5909351061398077004, byte b) {
        this.a = b;
        this.b = z11821137052809198413;
        this.c = r5909351061398077004;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        R5909351061398077004 r5909351061398077004 = this.c;
        Z11821137052809198413 z11821137052809198413 = this.b;
        switch (b) {
            case 0:
                try {
                    r5909351061398077004.mo18run();
                    break;
                } catch (Throwable th) {
                    z11821137052809198413.b(new P13925373060833416406("Exception received from UploadDataProvider", th));
                }
            case 1:
                try {
                    r5909351061398077004.mo18run();
                    break;
                } catch (Throwable th2) {
                    z11821137052809198413.c(new G15717426683772243395(z11821137052809198413, (byte) 1), "enterUserErrorState");
                    z11821137052809198413.b(new P13925373060833416406("Exception received from UrlRequest.Callback", th2));
                    return;
                }
            default:
                try {
                    r5909351061398077004.mo18run();
                    break;
                } catch (Throwable th3) {
                    z11821137052809198413.b(new Y11848166026895390553("System error", th3));
                    return;
                }
        }
    }
}
