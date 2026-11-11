package p131.p161.p211.p214;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p131.p161.p211.AbstractC2658;
import p131.p161.p211.C2673;
import p131.p161.p211.InterfaceC2521;
import p131.p161.p211.InterfaceC2656;
import p131.p161.p211.p213.C2534;
import p131.p161.p211.p213.C2535;
import p131.p161.p211.p218.C2672;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.おぐぴう〸ず, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2622 implements InterfaceC2656, Cloneable {

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static final C2622 f10055 = new C2622();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public List<InterfaceC2521> f10056 = Collections.emptyList();

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public List<InterfaceC2521> f10057 = Collections.emptyList();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.おぐぴう〸ず$げつ〴ぬぐ, reason: contains not printable characters */
    public class C2623<T> extends AbstractC2658<T> {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final /* synthetic */ boolean f10058;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final /* synthetic */ boolean f10059;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public AbstractC2658<T> f10060;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public final /* synthetic */ C2672 f10061;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final /* synthetic */ C2673 f10063;

        public C2623(boolean z, boolean z2, C2673 c2673, C2672 c2672) {
            this.f10058 = z;
            this.f10059 = z2;
            this.f10063 = c2673;
            this.f10061 = c2672;
        }

        @Override // p131.p161.p211.AbstractC2658
        /* renamed from: 〺つふすそ */
        public void mo4533(C2534 c2534, T t) {
            if (this.f10059) {
                c2534.mo4541();
                return;
            }
            AbstractC2658<T> abstractC2658 = this.f10060;
            if (abstractC2658 == null) {
                abstractC2658 = this.f10063.m4649(C2622.this, this.f10061);
                this.f10060 = abstractC2658;
            }
            abstractC2658.mo4533(c2534, t);
        }

        @Override // p131.p161.p211.AbstractC2658
        /* renamed from: げつ〴ぬぐ */
        public T mo4534(C2535 c2535) {
            if (this.f10058) {
                c2535.mo4581();
                return null;
            }
            AbstractC2658<T> abstractC2658 = this.f10060;
            if (abstractC2658 == null) {
                abstractC2658 = this.f10063.m4649(C2622.this, this.f10061);
                this.f10060 = abstractC2658;
            }
            return abstractC2658.mo4534(c2535);
        }
    }

    public Object clone() {
        try {
            return (C2622) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final boolean m4611(Class<?> cls, boolean z) {
        Iterator<InterfaceC2521> it = (z ? this.f10056 : this.f10057).iterator();
        while (it.hasNext()) {
            if (it.next().m4536(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final boolean m4612(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    @Override // p131.p161.p211.InterfaceC2656
    /* renamed from: げつ〴ぬぐ */
    public <T> AbstractC2658<T> mo4592(C2673 c2673, C2672<T> c2672) {
        Class<? super T> cls = c2672.f10130;
        boolean m4612 = m4612(cls);
        boolean z = m4612 || m4611(cls, true);
        boolean z2 = m4612 || m4611(cls, false);
        if (z || z2) {
            return new C2623(z2, z, c2673, c2672);
        }
        return null;
    }
}
