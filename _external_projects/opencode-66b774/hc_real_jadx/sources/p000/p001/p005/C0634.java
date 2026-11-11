package p000.p001.p005;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import p000.p001.C0629;
import p243.C2803;
import p243.C2819;
import p243.InterfaceC2805;
import p243.InterfaceC2823;
import p243.InterfaceC2827;

/* renamed from: 〳ぜぞぜべっ.ぉひのべい.づざかべべ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0634 implements InterfaceC2827 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean f4358;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2805 f4359;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2823 f4360;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0633 f4361;

    public C0634(C0632 c0632, InterfaceC2805 interfaceC2805, InterfaceC0633 interfaceC0633, InterfaceC2823 interfaceC2823) {
        this.f4359 = interfaceC2805;
        this.f4361 = interfaceC0633;
        this.f4360 = interfaceC2823;
    }

    @Override // p243.InterfaceC2827, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f4358 && !C0629.m1826(this, 100, TimeUnit.MILLISECONDS)) {
            this.f4358 = true;
            this.f4361.m1833();
        }
        this.f4359.close();
    }

    @Override // p243.InterfaceC2827
    /* renamed from: 〺つふすそ */
    public C2803 mo1761() {
        return this.f4359.mo1761();
    }

    @Override // p243.InterfaceC2827
    /* renamed from: ざっざへづ */
    public long mo1762(C2819 c2819, long j) {
        try {
            long mo1762 = this.f4359.mo1762(c2819, j);
            if (mo1762 != -1) {
                c2819.m4930(this.f4360.mo4888(), c2819.f10501 - mo1762, mo1762);
                this.f4360.mo4889();
                return mo1762;
            }
            if (!this.f4358) {
                this.f4358 = true;
                this.f4360.close();
            }
            return -1L;
        } catch (IOException e) {
            if (!this.f4358) {
                this.f4358 = true;
                this.f4361.m1833();
            }
            throw e;
        }
    }
}
