package androidx.lifecycle;

import p034.p094.AbstractC1680;
import p034.p094.C1670;
import p034.p094.InterfaceC1664;
import p034.p094.InterfaceC1675;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ReflectiveGenericLifecycleObserver implements InterfaceC1675 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C1670.C1672 f1287;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Object f1288;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f1288 = obj;
        this.f1287 = C1670.f7788.m3642(obj.getClass());
    }

    @Override // p034.p094.InterfaceC1675
    /* renamed from: びぐびあび */
    public void mo40(InterfaceC1664 interfaceC1664, AbstractC1680.EnumC1682 enumC1682) {
        C1670.C1672 c1672 = this.f1287;
        Object obj = this.f1288;
        C1670.C1672.m3645(c1672.f7794.get(enumC1682), interfaceC1664, enumC1682, obj);
        C1670.C1672.m3645(c1672.f7794.get(AbstractC1680.EnumC1682.ON_ANY), interfaceC1664, enumC1682, obj);
    }
}
