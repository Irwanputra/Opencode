package androidx.lifecycle;

import p034.p094.AbstractC1680;
import p034.p094.C1685;
import p034.p094.InterfaceC1664;
import p034.p094.InterfaceC1669;
import p034.p094.InterfaceC1675;

/* loaded from: /tmp/opencode/hc_real.dex */
public class CompositeGeneratedAdaptersObserver implements InterfaceC1675 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final InterfaceC1669[] f1269;

    public CompositeGeneratedAdaptersObserver(InterfaceC1669[] interfaceC1669Arr) {
        this.f1269 = interfaceC1669Arr;
    }

    @Override // p034.p094.InterfaceC1675
    /* renamed from: びぐびあび */
    public void mo40(InterfaceC1664 interfaceC1664, AbstractC1680.EnumC1682 enumC1682) {
        C1685 c1685 = new C1685();
        for (InterfaceC1669 interfaceC1669 : this.f1269) {
            interfaceC1669.m3641(interfaceC1664, enumC1682, false, c1685);
        }
        for (InterfaceC1669 interfaceC16692 : this.f1269) {
            interfaceC16692.m3641(interfaceC1664, enumC1682, true, c1685);
        }
    }
}
