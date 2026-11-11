package p131.p161.p211.p214.p215;

import p131.p155.p156.p157.C2098;
import p131.p161.p211.AbstractC2658;
import p131.p161.p211.C2531;
import p131.p161.p211.C2673;
import p131.p161.p211.InterfaceC2656;
import p131.p161.p211.p213.C2534;
import p131.p161.p211.p213.C2535;
import p131.p161.p211.p218.C2672;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.ぇ〳〲〺すっ.ごづごきえ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2599 implements InterfaceC2656 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ Class f10006;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2658 f10007;

    /* JADX INFO: Add missing generic type declarations: [T1] */
    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.ぇ〳〲〺すっ.ごづごきえ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C2600<T1> extends AbstractC2658<T1> {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final /* synthetic */ Class f10009;

        public C2600(Class cls) {
            this.f10009 = cls;
        }

        @Override // p131.p161.p211.AbstractC2658
        /* renamed from: 〺つふすそ */
        public void mo4533(C2534 c2534, T1 t1) {
            C2599.this.f10007.mo4533(c2534, t1);
        }

        @Override // p131.p161.p211.AbstractC2658
        /* renamed from: げつ〴ぬぐ */
        public T1 mo4534(C2535 c2535) {
            T1 t1 = (T1) C2599.this.f10007.mo4534(c2535);
            if (t1 == null || this.f10009.isInstance(t1)) {
                return t1;
            }
            StringBuilder m4207 = C2098.m4207("Expected a ");
            m4207.append(this.f10009.getName());
            m4207.append(" but was ");
            m4207.append(t1.getClass().getName());
            throw new C2531(m4207.toString());
        }
    }

    public C2599(Class cls, AbstractC2658 abstractC2658) {
        this.f10006 = cls;
        this.f10007 = abstractC2658;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("Factory[typeHierarchy=");
        m4207.append(this.f10006.getName());
        m4207.append(",adapter=");
        m4207.append(this.f10007);
        m4207.append("]");
        return m4207.toString();
    }

    @Override // p131.p161.p211.InterfaceC2656
    /* renamed from: げつ〴ぬぐ */
    public <T2> AbstractC2658<T2> mo4592(C2673 c2673, C2672<T2> c2672) {
        Class<? super T2> cls = c2672.f10130;
        if (this.f10006.isAssignableFrom(cls)) {
            return new C2600(cls);
        }
        return null;
    }
}
