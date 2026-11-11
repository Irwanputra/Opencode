package p000;

import java.util.List;
import javax.annotation.Nullable;
import p000.p001.C0629;
import p243.C2801;
import p243.C2819;
import p243.InterfaceC2823;

/* renamed from: 〳ぜぞぜべっ.ざっざへづ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0696 extends AbstractC0719 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static final byte[] f4631;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static final byte[] f4632;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static final C0695 f4633 = C0695.m1944("multipart/mixed");

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static final C0695 f4634;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public static final byte[] f4635;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C0695 f4636;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final List<C0697> f4637;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final C2801 f4638;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public long f4639 = -1;

    /* renamed from: 〳ぜぞぜべっ.ざっざへづ$げつ〴ぬぐ, reason: contains not printable characters */
    public static final class C0697 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final AbstractC0719 f4640;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        @Nullable
        public final C0597 f4641;

        public C0697(@Nullable C0597 c0597, AbstractC0719 abstractC0719) {
            this.f4641 = c0597;
            this.f4640 = abstractC0719;
        }
    }

    static {
        C0695.m1944("multipart/alternative");
        C0695.m1944("multipart/digest");
        C0695.m1944("multipart/parallel");
        f4634 = C0695.m1944("multipart/form-data");
        f4632 = new byte[]{58, 32};
        f4631 = new byte[]{13, 10};
        f4635 = new byte[]{45, 45};
    }

    public C0696(C2801 c2801, C0695 c0695, List<C0697> list) {
        this.f4638 = c2801;
        this.f4636 = C0695.m1944(c0695 + "; boundary=" + c2801.mo4847());
        this.f4637 = C0629.m1810(list);
    }

    @Override // p000.AbstractC0719
    /* renamed from: 〺つふすそ */
    public C0695 mo1729() {
        return this.f4636;
    }

    @Override // p000.AbstractC0719
    /* renamed from: げつ〴ぬぐ */
    public long mo1730() {
        long j = this.f4639;
        if (j != -1) {
            return j;
        }
        long m1945 = m1945(null, true);
        this.f4639 = m1945;
        return m1945;
    }

    @Override // p000.AbstractC0719
    /* renamed from: づざかべべ */
    public void mo1731(InterfaceC2823 interfaceC2823) {
        m1945(interfaceC2823, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final long m1945(@Nullable InterfaceC2823 interfaceC2823, boolean z) {
        C2819 c2819;
        if (z) {
            interfaceC2823 = new C2819();
            c2819 = interfaceC2823;
        } else {
            c2819 = 0;
        }
        int size = this.f4637.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C0697 c0697 = this.f4637.get(i);
            C0597 c0597 = c0697.f4641;
            AbstractC0719 abstractC0719 = c0697.f4640;
            interfaceC2823.mo4886(f4635);
            interfaceC2823.mo4890(this.f4638);
            interfaceC2823.mo4886(f4631);
            if (c0597 != null) {
                int m1744 = c0597.m1744();
                for (int i2 = 0; i2 < m1744; i2++) {
                    interfaceC2823.mo4885(c0597.m1741(i2)).mo4886(f4632).mo4885(c0597.m1745(i2)).mo4886(f4631);
                }
            }
            C0695 mo1729 = abstractC0719.mo1729();
            if (mo1729 != null) {
                interfaceC2823.mo4885("Content-Type: ").mo4885(mo1729.f4630).mo4886(f4631);
            }
            long mo1730 = abstractC0719.mo1730();
            if (mo1730 != -1) {
                interfaceC2823.mo4885("Content-Length: ").mo4884(mo1730).mo4886(f4631);
            } else if (z) {
                c2819.m4921();
                return -1L;
            }
            byte[] bArr = f4631;
            interfaceC2823.mo4886(bArr);
            if (z) {
                j += mo1730;
            } else {
                abstractC0719.mo1731(interfaceC2823);
            }
            interfaceC2823.mo4886(bArr);
        }
        byte[] bArr2 = f4635;
        interfaceC2823.mo4886(bArr2);
        interfaceC2823.mo4890(this.f4638);
        interfaceC2823.mo4886(bArr2);
        interfaceC2823.mo4886(f4631);
        if (!z) {
            return j;
        }
        long j2 = j + c2819.f10501;
        c2819.m4921();
        return j2;
    }
}
