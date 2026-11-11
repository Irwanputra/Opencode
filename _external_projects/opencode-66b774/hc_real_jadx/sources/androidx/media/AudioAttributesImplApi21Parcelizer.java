package androidx.media;

import android.media.AudioAttributes;
import p034.p068.C1421;
import p034.p077.AbstractC1484;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static C1421 read(AbstractC1484 abstractC1484) {
        C1421 c1421 = new C1421();
        c1421.f6683 = (AudioAttributes) abstractC1484.m3234(c1421.f6683, 1);
        c1421.f6682 = abstractC1484.m3237(c1421.f6682, 2);
        return c1421;
    }

    public static void write(C1421 c1421, AbstractC1484 abstractC1484) {
        abstractC1484.getClass();
        AudioAttributes audioAttributes = c1421.f6683;
        abstractC1484.mo3219(1);
        abstractC1484.mo3223(audioAttributes);
        int i = c1421.f6682;
        abstractC1484.mo3219(2);
        abstractC1484.mo3222(i);
    }
}
