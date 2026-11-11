package p131.p161.p211;

import p131.p161.p211.p214.C2637;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.ごづごきえ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2541 extends AbstractC2532 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final C2637<String, AbstractC2532> f9912 = new C2637<>();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C2541) && ((C2541) obj).f9912.equals(this.f9912));
    }

    public int hashCode() {
        return this.f9912.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m4587(String str, AbstractC2532 abstractC2532) {
        C2637<String, AbstractC2532> c2637 = this.f9912;
        V v = abstractC2532;
        if (abstractC2532 == null) {
            v = C2660.f10117;
        }
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        C2637.C2643<String, AbstractC2532> m4626 = c2637.m4626(str, true);
        AbstractC2532 abstractC25322 = m4626.f10089;
        m4626.f10089 = v;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public C2541 m4588(String str) {
        C2637.C2643<String, AbstractC2532> m4625 = this.f9912.m4625(str);
        return (C2541) (m4625 != null ? m4625.f10089 : null);
    }
}
