package p034.p094;

import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.FullLifecycleObserverAdapter;
import androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import androidx.lifecycle.SingleGeneratedAdapterObserver;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p034.p069.p070.p071.C1447;
import p034.p069.p070.p071.C1454;
import p034.p094.AbstractC1680;

/* renamed from: づざかべべ.のぷのちつ.〳ぜぞぜべっ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1661 extends AbstractC1680 {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final WeakReference<InterfaceC1664> f7778;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public C1454<InterfaceC1677, C1662> f7779 = new C1454<>();

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f7782 = 0;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean f7780 = false;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public boolean f7781 = false;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public ArrayList<AbstractC1680.EnumC1681> f7777 = new ArrayList<>();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public AbstractC1680.EnumC1681 f7776 = AbstractC1680.EnumC1681.INITIALIZED;

    /* renamed from: づざかべべ.のぷのちつ.〳ぜぞぜべっ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1662 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public InterfaceC1675 f7783;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public AbstractC1680.EnumC1681 f7784;

        public C1662(InterfaceC1677 interfaceC1677, AbstractC1680.EnumC1681 enumC1681) {
            InterfaceC1675 reflectiveGenericLifecycleObserver;
            Map<Class, Integer> map = C1665.f7786;
            boolean z = interfaceC1677 instanceof InterfaceC1675;
            boolean z2 = interfaceC1677 instanceof InterfaceC1663;
            if (z && z2) {
                reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((InterfaceC1663) interfaceC1677, (InterfaceC1675) interfaceC1677);
            } else if (z2) {
                reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((InterfaceC1663) interfaceC1677, null);
            } else if (z) {
                reflectiveGenericLifecycleObserver = (InterfaceC1675) interfaceC1677;
            } else {
                Class<?> cls = interfaceC1677.getClass();
                if (C1665.m3636(cls) == 2) {
                    List<Constructor<? extends InterfaceC1669>> list = C1665.f7785.get(cls);
                    if (list.size() == 1) {
                        reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver(C1665.m3637(list.get(0), interfaceC1677));
                    } else {
                        InterfaceC1669[] interfaceC1669Arr = new InterfaceC1669[list.size()];
                        for (int i = 0; i < list.size(); i++) {
                            interfaceC1669Arr[i] = C1665.m3637(list.get(i), interfaceC1677);
                        }
                        reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(interfaceC1669Arr);
                    }
                } else {
                    reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(interfaceC1677);
                }
            }
            this.f7783 = reflectiveGenericLifecycleObserver;
            this.f7784 = enumC1681;
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void m3628(InterfaceC1664 interfaceC1664, AbstractC1680.EnumC1682 enumC1682) {
            AbstractC1680.EnumC1681 m3619 = C1661.m3619(enumC1682);
            this.f7784 = C1661.m3620(this.f7784, m3619);
            this.f7783.mo40(interfaceC1664, enumC1682);
            this.f7784 = m3619;
        }
    }

    public C1661(InterfaceC1664 interfaceC1664) {
        this.f7778 = new WeakReference<>(interfaceC1664);
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static AbstractC1680.EnumC1681 m3619(AbstractC1680.EnumC1682 enumC1682) {
        int ordinal = enumC1682.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return AbstractC1680.EnumC1681.RESUMED;
                }
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return AbstractC1680.EnumC1681.DESTROYED;
                        }
                        throw new IllegalArgumentException("Unexpected event value " + enumC1682);
                    }
                }
            }
            return AbstractC1680.EnumC1681.STARTED;
        }
        return AbstractC1680.EnumC1681.CREATED;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static AbstractC1680.EnumC1681 m3620(AbstractC1680.EnumC1681 enumC1681, AbstractC1680.EnumC1681 enumC16812) {
        return (enumC16812 == null || enumC16812.compareTo(enumC1681) >= 0) ? enumC1681 : enumC16812;
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public static AbstractC1680.EnumC1682 m3621(AbstractC1680.EnumC1681 enumC1681) {
        int ordinal = enumC1681.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return AbstractC1680.EnumC1682.ON_CREATE;
        }
        if (ordinal == 2) {
            return AbstractC1680.EnumC1682.ON_START;
        }
        if (ordinal == 3) {
            return AbstractC1680.EnumC1682.ON_RESUME;
        }
        if (ordinal == 4) {
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException("Unexpected state value " + enumC1681);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0132 A[SYNTHETIC] */
    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3622() {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p094.C1661.m3622():void");
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final AbstractC1680.EnumC1681 m3623(InterfaceC1677 interfaceC1677) {
        C1454<InterfaceC1677, C1662> c1454 = this.f7779;
        AbstractC1680.EnumC1681 enumC1681 = null;
        C1447.C1449<InterfaceC1677, C1662> c1449 = c1454.f6747.containsKey(interfaceC1677) ? c1454.f6747.get(interfaceC1677).f6740 : null;
        AbstractC1680.EnumC1681 enumC16812 = c1449 != null ? c1449.f6739.f7784 : null;
        if (!this.f7777.isEmpty()) {
            enumC1681 = this.f7777.get(r0.size() - 1);
        }
        return m3620(m3620(this.f7776, enumC16812), enumC1681);
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final void m3624() {
        this.f7777.remove(r0.size() - 1);
    }

    @Override // p034.p094.AbstractC1680
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void mo3625(InterfaceC1677 interfaceC1677) {
        InterfaceC1664 interfaceC1664;
        AbstractC1680.EnumC1681 enumC1681 = this.f7776;
        AbstractC1680.EnumC1681 enumC16812 = AbstractC1680.EnumC1681.DESTROYED;
        if (enumC1681 != enumC16812) {
            enumC16812 = AbstractC1680.EnumC1681.INITIALIZED;
        }
        C1662 c1662 = new C1662(interfaceC1677, enumC16812);
        if (this.f7779.m3195(interfaceC1677, c1662) == null && (interfaceC1664 = this.f7778.get()) != null) {
            boolean z = this.f7782 != 0 || this.f7780;
            AbstractC1680.EnumC1681 m3623 = m3623(interfaceC1677);
            this.f7782++;
            while (c1662.f7784.compareTo(m3623) < 0 && this.f7779.f6747.containsKey(interfaceC1677)) {
                this.f7777.add(c1662.f7784);
                c1662.m3628(interfaceC1664, m3621(c1662.f7784));
                m3624();
                m3623 = m3623(interfaceC1677);
            }
            if (!z) {
                m3622();
            }
            this.f7782--;
        }
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final void m3626(AbstractC1680.EnumC1681 enumC1681) {
        if (this.f7776 == enumC1681) {
            return;
        }
        this.f7776 = enumC1681;
        if (this.f7780 || this.f7782 != 0) {
            this.f7781 = true;
            return;
        }
        this.f7780 = true;
        m3622();
        this.f7780 = false;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void m3627(AbstractC1680.EnumC1682 enumC1682) {
        m3626(m3619(enumC1682));
    }
}
