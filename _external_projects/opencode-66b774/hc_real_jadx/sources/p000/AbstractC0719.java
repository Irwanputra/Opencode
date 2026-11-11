package p000;

import java.nio.charset.Charset;
import javax.annotation.Nullable;
import p000.p001.C0629;
import p243.InterfaceC2823;

/* renamed from: 〳ぜぞぜべっ.びえぁぜい, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC0719 {
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static AbstractC0719 m1978(@Nullable C0695 c0695, String str) {
        Charset charset = C0629.f4354;
        throw null;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static AbstractC0719 m1979(@Nullable C0695 c0695, byte[] bArr) {
        int length = bArr.length;
        C0629.m1822(bArr.length, 0, length);
        return new C0593(c0695, length, bArr, 0);
    }

    @Nullable
    /* renamed from: 〺つふすそ */
    public abstract C0695 mo1729();

    /* renamed from: げつ〴ぬぐ */
    public abstract long mo1730();

    /* renamed from: づざかべべ */
    public abstract void mo1731(InterfaceC2823 interfaceC2823);
}
