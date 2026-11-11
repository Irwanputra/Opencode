package p034.p035.p042;

import p131.p155.p156.p157.C2098;
import p237.p238.p239.p241.p242.C2786;

/* renamed from: づざかべべ.〳ぜぞぜべっ.てぜきぽく.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1052<F, S> {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final S f5498;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final F f5499;

    public C1052(F f, S s) {
        this.f5499 = f;
        this.f5498 = s;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1052)) {
            return false;
        }
        C1052 c1052 = (C1052) obj;
        return C2786.m4781(c1052.f5499, this.f5499) && C2786.m4781(c1052.f5498, this.f5498);
    }

    public int hashCode() {
        F f = this.f5499;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.f5498;
        return hashCode ^ (s != null ? s.hashCode() : 0);
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("Pair{");
        m4207.append(String.valueOf(this.f5499));
        m4207.append(" ");
        m4207.append(String.valueOf(this.f5498));
        m4207.append("}");
        return m4207.toString();
    }
}
