package androidx.lifecycle;

import p034.p094.AbstractC1680;
import p034.p094.InterfaceC1663;
import p034.p094.InterfaceC1664;
import p034.p094.InterfaceC1675;

/* loaded from: /tmp/opencode/hc_real.dex */
public class FullLifecycleObserverAdapter implements InterfaceC1675 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final InterfaceC1675 f1270;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final InterfaceC1663 f1271;

    public FullLifecycleObserverAdapter(InterfaceC1663 interfaceC1663, InterfaceC1675 interfaceC1675) {
        this.f1271 = interfaceC1663;
        this.f1270 = interfaceC1675;
    }

    @Override // p034.p094.InterfaceC1675
    /* renamed from: びぐびあび */
    public void mo40(InterfaceC1664 interfaceC1664, AbstractC1680.EnumC1682 enumC1682) {
        switch (enumC1682) {
            case ON_CREATE:
                this.f1271.m3631(interfaceC1664);
                break;
            case ON_START:
                this.f1271.m3634(interfaceC1664);
                break;
            case ON_RESUME:
                this.f1271.m3632(interfaceC1664);
                break;
            case ON_PAUSE:
                this.f1271.m3633(interfaceC1664);
                break;
            case ON_STOP:
                this.f1271.m3630(interfaceC1664);
                break;
            case ON_DESTROY:
                this.f1271.m3629(interfaceC1664);
                break;
            case ON_ANY:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC1675 interfaceC1675 = this.f1270;
        if (interfaceC1675 != null) {
            interfaceC1675.mo40(interfaceC1664, enumC1682);
        }
    }
}
