package androidx.media;

import p034.p068.InterfaceC1429;
import p034.p077.AbstractC1484;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC1484 abstractC1484) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        Object obj = audioAttributesCompat.f1291;
        if (abstractC1484.mo3230(1)) {
            obj = abstractC1484.m3231();
        }
        audioAttributesCompat.f1291 = (InterfaceC1429) obj;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC1484 abstractC1484) {
        abstractC1484.getClass();
        InterfaceC1429 interfaceC1429 = audioAttributesCompat.f1291;
        abstractC1484.mo3219(1);
        abstractC1484.m3236(interfaceC1429);
    }
}
