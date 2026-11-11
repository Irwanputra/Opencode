package p034.p035.p045;

import p131.p155.p156.p157.C2098;

/* renamed from: づざかべべ.〳ぜぞぜべっ.のぷのちつ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C1101 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Object f5591;

    public C1101(Object obj) {
        this.f5591 = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1101.class != obj.getClass()) {
            return false;
        }
        Object obj2 = this.f5591;
        Object obj3 = ((C1101) obj).f5591;
        return obj2 == null ? obj3 == null : obj2.equals(obj3);
    }

    public int hashCode() {
        Object obj = this.f5591;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("DisplayCutoutCompat{");
        m4207.append(this.f5591);
        m4207.append("}");
        return m4207.toString();
    }
}
