package p131.p161.p211.p214.p215;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import p131.p161.p211.AbstractC2658;
import p131.p161.p211.C2673;
import p131.p161.p211.p213.C2534;
import p131.p161.p211.p213.C2535;
import p131.p161.p211.p214.p215.C2557;
import p131.p161.p211.p218.C2672;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.ぇ〳〲〺すっ.へぬ〴づぞ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2615<T> extends AbstractC2658<T> {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final AbstractC2658<T> f10042;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final Type f10043;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final C2673 f10044;

    public C2615(C2673 c2673, AbstractC2658<T> abstractC2658, Type type) {
        this.f10044 = c2673;
        this.f10042 = abstractC2658;
        this.f10043 = type;
    }

    @Override // p131.p161.p211.AbstractC2658
    /* renamed from: 〺つふすそ */
    public void mo4533(C2534 c2534, T t) {
        AbstractC2658<T> abstractC2658 = this.f10042;
        Type type = this.f10043;
        if (t != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t.getClass();
        }
        if (type != this.f10043) {
            abstractC2658 = this.f10044.m4646(new C2672<>(type));
            if (abstractC2658 instanceof C2557.C2559) {
                AbstractC2658<T> abstractC26582 = this.f10042;
                if (!(abstractC26582 instanceof C2557.C2559)) {
                    abstractC2658 = abstractC26582;
                }
            }
        }
        abstractC2658.mo4533(c2534, t);
    }

    @Override // p131.p161.p211.AbstractC2658
    /* renamed from: げつ〴ぬぐ */
    public T mo4534(C2535 c2535) {
        return this.f10042.mo4534(c2535);
    }
}
