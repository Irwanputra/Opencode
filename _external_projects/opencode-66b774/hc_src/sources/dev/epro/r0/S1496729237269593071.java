package dev.epro.r0;

import org.chromium.net.UrlResponseInfo;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final /* synthetic */ class S1496729237269593071 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ R9704326227384281667 b;
    public final /* synthetic */ UrlResponseInfo c;

    public /* synthetic */ S1496729237269593071(R9704326227384281667 r9704326227384281667, UrlResponseInfo urlResponseInfo, byte b) {
        this.a = b;
        this.b = r9704326227384281667;
        this.c = urlResponseInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        UrlResponseInfo urlResponseInfo = this.c;
        R9704326227384281667 r9704326227384281667 = this.b;
        switch (b) {
            case 0:
                Z11821137052809198413 z11821137052809198413 = r9704326227384281667.d;
                try {
                    r9704326227384281667.a.onCanceled(z11821137052809198413, urlResponseInfo);
                } catch (Exception unused) {
                    z11821137052809198413.y = true;
                }
                r9704326227384281667.d();
                z11821137052809198413.s.e.decrementAndGet();
                break;
            default:
                Z11821137052809198413 z118211370528091984132 = r9704326227384281667.d;
                try {
                    r9704326227384281667.a.onSucceeded(z118211370528091984132, urlResponseInfo);
                } catch (Exception unused2) {
                    z118211370528091984132.y = true;
                }
                r9704326227384281667.d();
                z118211370528091984132.s.e.decrementAndGet();
                break;
        }
    }
}
