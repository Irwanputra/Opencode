package p034.p035.p042;

/* renamed from: づざかべべ.〳ぜぞぜべっ.てぜきぽく.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1055<T> extends C1053<T> {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final Object f5504;

    public C1055(int i) {
        super(i);
        this.f5504 = new Object();
    }

    @Override // p034.p035.p042.C1053
    /* renamed from: 〺つふすそ */
    public boolean mo2385(T t) {
        boolean mo2385;
        synchronized (this.f5504) {
            mo2385 = super.mo2385(t);
        }
        return mo2385;
    }

    @Override // p034.p035.p042.C1053
    /* renamed from: げつ〴ぬぐ */
    public T mo2386() {
        T t;
        synchronized (this.f5504) {
            t = (T) super.mo2386();
        }
        return t;
    }
}
