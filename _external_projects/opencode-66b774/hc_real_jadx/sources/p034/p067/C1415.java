package p034.p067;

import android.os.Bundle;
import androidx.savedstate.Recreator;
import java.util.Map;
import p034.p067.C1417;
import p034.p069.p070.p071.C1447;
import p034.p094.AbstractC1680;
import p034.p094.C1661;
import p034.p094.InterfaceC1664;
import p034.p094.InterfaceC1675;

/* renamed from: づざかべべ.ぉざぅち〻.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C1415 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C1417 f6671 = new C1417();

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final InterfaceC1416 f6672;

    public C1415(InterfaceC1416 interfaceC1416) {
        this.f6672 = interfaceC1416;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m3183(Bundle bundle) {
        C1417 c1417 = this.f6671;
        c1417.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = c1417.f6673;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C1447<String, C1417.InterfaceC1418>.C1453 m3188 = c1417.f6675.m3188();
        while (m3188.hasNext()) {
            Map.Entry entry = (Map.Entry) m3188.next();
            bundle2.putBundle((String) entry.getKey(), ((C1417.InterfaceC1418) entry.getValue()).m3185());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m3184(Bundle bundle) {
        AbstractC1680 mo36 = this.f6672.mo36();
        if (((C1661) mo36).f7776 != AbstractC1680.EnumC1681.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        mo36.mo3625(new Recreator(this.f6672));
        final C1417 c1417 = this.f6671;
        if (c1417.f6674) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        if (bundle != null) {
            c1417.f6673 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        mo36.mo3625(new InterfaceC1675() { // from class: androidx.savedstate.SavedStateRegistry$1
            @Override // p034.p094.InterfaceC1675
            /* renamed from: びぐびあび */
            public void mo40(InterfaceC1664 interfaceC1664, AbstractC1680.EnumC1682 enumC1682) {
                if (enumC1682 == AbstractC1680.EnumC1682.ON_START || enumC1682 == AbstractC1680.EnumC1682.ON_STOP) {
                    C1417.this.getClass();
                }
            }
        });
        c1417.f6674 = true;
    }
}
