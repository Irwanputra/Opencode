package p131.p161.p211.p214.p215;

import p131.p155.p156.p157.C2098;
import p131.p161.p211.AbstractC2658;
import p131.p161.p211.C2673;
import p131.p161.p211.InterfaceC2656;
import p131.p161.p211.p218.C2672;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.ぇ〳〲〺すっ.は〲ぱなで, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2613 implements InterfaceC2656 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ Class f10038;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ Class f10039;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2658 f10040;

    public C2613(Class cls, Class cls2, AbstractC2658 abstractC2658) {
        this.f10038 = cls;
        this.f10039 = cls2;
        this.f10040 = abstractC2658;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("Factory[type=");
        m4207.append(this.f10038.getName());
        m4207.append("+");
        m4207.append(this.f10039.getName());
        m4207.append(",adapter=");
        m4207.append(this.f10040);
        m4207.append("]");
        return m4207.toString();
    }

    @Override // p131.p161.p211.InterfaceC2656
    /* renamed from: げつ〴ぬぐ */
    public <T> AbstractC2658<T> mo4592(C2673 c2673, C2672<T> c2672) {
        Class<? super T> cls = c2672.f10130;
        if (cls == this.f10038 || cls == this.f10039) {
            return this.f10040;
        }
        return null;
    }
}
