package p000.p001.p007;

import java.io.IOException;
import p000.C0595;
import p000.C0706;
import p000.C0712;
import p000.InterfaceC0717;
import p000.p001.p003.C0615;
import p000.p001.p003.InterfaceC0612;

/* renamed from: 〳ぜぞぜべっ.ぉひのべい.なぎぱいぢぎ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0646 implements InterfaceC0717 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final C0706 f4400;

    public C0646(C0706 c0706) {
        this.f4400 = c0706;
    }

    @Override // p000.InterfaceC0717
    /* renamed from: げつ〴ぬぐ */
    public C0712 mo1768(InterfaceC0717.InterfaceC0718 interfaceC0718) {
        C0615 c0615 = (C0615) interfaceC0718;
        C0595 c0595 = c0615.f4302;
        C0643 c0643 = c0615.f4295;
        boolean z = !c0595.f4246.equals("GET");
        C0706 c0706 = this.f4400;
        c0643.getClass();
        try {
            InterfaceC0612 m1865 = c0643.m1852(c0615.f4304, c0615.f4297, c0615.f4305, c0706.f4695, c0706.f4697, z).m1865(c0706, interfaceC0718, c0643);
            synchronized (c0643.f4381) {
                c0643.f4382 = m1865;
            }
            return c0615.m1776(c0595, c0643, m1865, c0643.m1848());
        } catch (IOException e) {
            throw new C0647(e);
        }
    }
}
