package dev.epro.r0;

import java.net.InetAddress;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class R187572460925185329 {
    public final InetAddress a;
    public final String b;

    public R187572460925185329(String str, InetAddress inetAddress) {
        str.getClass();
        inetAddress.getClass();
        this.a = inetAddress;
        String b = A4349945402702183291.b(str);
        if (b != null) {
            this.b = b;
        } else {
            S10973172697741180971.j("unexpected hostname: ".concat(str));
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof R187572460925185329)) {
            return false;
        }
        R187572460925185329 r187572460925185329 = (R187572460925185329) obj;
        return r187572460925185329.b.equals(this.b) && S10823041268949770285.t(r187572460925185329.a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return this.b + '/' + this.a.getHostAddress();
    }
}
