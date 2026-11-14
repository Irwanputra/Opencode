package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class I6542595490584778312 {
    public final /* synthetic */ byte a;
    public final P6024466796603310388 b;
    public final P6024466796603310388 c;
    public boolean d;
    public Object e;
    public final L16987758992765039378 f;

    public I6542595490584778312(int i, int i2, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new P6024466796603310388(i);
                this.c = new P6024466796603310388(i2);
                this.f = new L16987758992765039378(i, 30, 100);
                break;
            default:
                this.b = new P6024466796603310388(i);
                this.c = new P6024466796603310388(i2);
                this.f = new L16987758992765039378(i, 90, 200);
                break;
        }
    }

    public final void a(int i, int i2) {
        byte b = this.a;
        P6024466796603310388 p6024466796603310388 = this.c;
        L16987758992765039378 l16987758992765039378 = this.f;
        P6024466796603310388 p60244667966033103882 = this.b;
        switch (b) {
            case 0:
                if (i < 0.0f) {
                    Y16081827717826519461.a("Index should be non-negative");
                }
                p60244667966033103882.h(i);
                l16987758992765039378.a(i);
                p6024466796603310388.h(i2);
                break;
            default:
                if (i < 0.0f) {
                    Y16081827717826519461.a("Index should be non-negative (" + i + ")");
                }
                p60244667966033103882.h(i);
                l16987758992765039378.a(i);
                p6024466796603310388.h(i2);
                break;
        }
    }
}
