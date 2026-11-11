package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import p034.p067.C1417;
import p034.p067.InterfaceC1416;
import p034.p094.AbstractC1680;
import p034.p094.C1661;
import p034.p094.InterfaceC1664;
import p034.p094.InterfaceC1675;
import p131.p155.p156.p157.C2098;

@SuppressLint({"RestrictedApi"})
/* loaded from: /tmp/opencode/hc_real.dex */
public final class Recreator implements InterfaceC1675 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final InterfaceC1416 f1619;

    public Recreator(InterfaceC1416 interfaceC1416) {
        this.f1619 = interfaceC1416;
    }

    @Override // p034.p094.InterfaceC1675
    /* renamed from: びぐびあび */
    public void mo40(InterfaceC1664 interfaceC1664, AbstractC1680.EnumC1682 enumC1682) {
        if (enumC1682 != AbstractC1680.EnumC1682.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        ((C1661) interfaceC1664.mo36()).f7779.mo3191(this);
        C1417 mo38 = this.f1619.mo38();
        if (!mo38.f6674) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = mo38.f6673;
        Bundle bundle2 = null;
        if (bundle != null) {
            Bundle bundle3 = bundle.getBundle("androidx.savedstate.Restarter");
            mo38.f6673.remove("androidx.savedstate.Restarter");
            if (mo38.f6673.isEmpty()) {
                mo38.f6673 = null;
            }
            bundle2 = bundle3;
        }
        if (bundle2 == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundle2.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            try {
                Class<? extends U> asSubclass = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(C1417.InterfaceC1419.class);
                try {
                    Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    try {
                        ((C1417.InterfaceC1419) declaredConstructor.newInstance(new Object[0])).m3186(this.f1619);
                    } catch (Exception e) {
                        throw new RuntimeException(C2098.m4205("Failed to instantiate ", next), e);
                    }
                } catch (NoSuchMethodException e2) {
                    StringBuilder m4207 = C2098.m4207("Class");
                    m4207.append(asSubclass.getSimpleName());
                    m4207.append(" must have default constructor in order to be automatically recreated");
                    throw new IllegalStateException(m4207.toString(), e2);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException(C2098.m4187("Class ", next, " wasn't found"), e3);
            }
        }
    }
}
