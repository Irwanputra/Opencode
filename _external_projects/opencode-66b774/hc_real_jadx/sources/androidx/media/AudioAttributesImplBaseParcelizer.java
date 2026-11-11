package androidx.media;

import p034.p068.C1428;
import p034.p077.AbstractC1484;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static C1428 read(AbstractC1484 abstractC1484) {
        C1428 c1428 = new C1428();
        c1428.f6703 = abstractC1484.m3237(c1428.f6703, 1);
        c1428.f6701 = abstractC1484.m3237(c1428.f6701, 2);
        c1428.f6702 = abstractC1484.m3237(c1428.f6702, 3);
        c1428.f6704 = abstractC1484.m3237(c1428.f6704, 4);
        return c1428;
    }

    public static void write(C1428 c1428, AbstractC1484 abstractC1484) {
        abstractC1484.getClass();
        int i = c1428.f6703;
        abstractC1484.mo3219(1);
        abstractC1484.mo3222(i);
        int i2 = c1428.f6701;
        abstractC1484.mo3219(2);
        abstractC1484.mo3222(i2);
        int i3 = c1428.f6702;
        abstractC1484.mo3219(3);
        abstractC1484.mo3222(i3);
        int i4 = c1428.f6704;
        abstractC1484.mo3219(4);
        abstractC1484.mo3222(i4);
    }
}
