package androidx.activity;

import java.util.ArrayDeque;
import java.util.Iterator;
import p034.p073.AbstractC1459;
import p034.p073.InterfaceC1461;
import p034.p094.AbstractC1680;
import p034.p094.C1661;
import p034.p094.InterfaceC1664;
import p034.p094.InterfaceC1675;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final ArrayDeque<AbstractC1459> f105 = new ArrayDeque<>();

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Runnable f106;

    public class LifecycleOnBackPressedCancellable implements InterfaceC1675, InterfaceC1461 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final AbstractC1459 f107;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public InterfaceC1461 f108;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final AbstractC1680 f109;

        public LifecycleOnBackPressedCancellable(AbstractC1680 abstractC1680, AbstractC1459 abstractC1459) {
            this.f109 = abstractC1680;
            this.f107 = abstractC1459;
            abstractC1680.mo3625(this);
        }

        @Override // p034.p073.InterfaceC1461
        public void cancel() {
            ((C1661) this.f109).f7779.mo3191(this);
            this.f107.f6754.remove(this);
            InterfaceC1461 interfaceC1461 = this.f108;
            if (interfaceC1461 != null) {
                interfaceC1461.cancel();
                this.f108 = null;
            }
        }

        @Override // p034.p094.InterfaceC1675
        /* renamed from: びぐびあび */
        public void mo40(InterfaceC1664 interfaceC1664, AbstractC1680.EnumC1682 enumC1682) {
            if (enumC1682 == AbstractC1680.EnumC1682.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                AbstractC1459 abstractC1459 = this.f107;
                onBackPressedDispatcher.f105.add(abstractC1459);
                C0035 c0035 = onBackPressedDispatcher.new C0035(abstractC1459);
                abstractC1459.f6754.add(c0035);
                this.f108 = c0035;
                return;
            }
            if (enumC1682 != AbstractC1680.EnumC1682.ON_STOP) {
                if (enumC1682 == AbstractC1680.EnumC1682.ON_DESTROY) {
                    cancel();
                }
            } else {
                InterfaceC1461 interfaceC1461 = this.f108;
                if (interfaceC1461 != null) {
                    interfaceC1461.cancel();
                }
            }
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0035 implements InterfaceC1461 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final AbstractC1459 f112;

        public C0035(AbstractC1459 abstractC1459) {
            this.f112 = abstractC1459;
        }

        @Override // p034.p073.InterfaceC1461
        public void cancel() {
            OnBackPressedDispatcher.this.f105.remove(this.f112);
            this.f112.f6754.remove(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f106 = runnable;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m41() {
        Iterator<AbstractC1459> descendingIterator = this.f105.descendingIterator();
        while (descendingIterator.hasNext()) {
            AbstractC1459 next = descendingIterator.next();
            if (next.f6755) {
                next.mo3198();
                return;
            }
        }
        Runnable runnable = this.f106;
        if (runnable != null) {
            runnable.run();
        }
    }
}
