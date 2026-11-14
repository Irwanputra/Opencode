package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class O430429848373533625 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ A12581365276667340144 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ O430429848373533625(A12581365276667340144 a12581365276667340144, Object obj, byte b) {
        this.a = b;
        this.b = a12581365276667340144;
        this.c = obj;
    }

    public C10361380324006518393 b() {
        A12581365276667340144 a12581365276667340144 = this.b;
        H11725168162114556860 h11725168162114556860 = (H11725168162114556860) a12581365276667340144.j.g(this.c);
        if (h11725168162114556860 != null) {
            return (C10361380324006518393) a12581365276667340144.f.g(h11725168162114556860);
        }
        return null;
    }

    public final boolean c() {
        Y979168416190219423 y979168416190219423;
        switch (this.a) {
            case 0:
                return true;
            default:
                C10361380324006518393 b = b();
                if (b == null || (y979168416190219423 = b.f) == null) {
                    return true;
                }
                return y979168416190219423.c();
        }
    }

    private final void a() {
    }
}
