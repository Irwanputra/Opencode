package dev.epro.r0;

import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J12447903228903363333 extends J14024120050125738337 {
    public static final W16166718746717276323 h = new W16166718746717276323((byte) 1);
    public final boolean e;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean f = false;
    public boolean g = false;

    public J12447903228903363333(boolean z) {
        this.e = z;
    }

    @Override // dev.epro.r0.J14024120050125738337
    public final void d() {
        this.f = true;
    }

    public final void e(String str) {
        HashMap hashMap = this.c;
        J12447903228903363333 j12447903228903363333 = (J12447903228903363333) hashMap.get(str);
        if (j12447903228903363333 != null) {
            j12447903228903363333.f = true;
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.d;
        L3530692241870850490 l3530692241870850490 = (L3530692241870850490) hashMap2.get(str);
        if (l3530692241870850490 != null) {
            l3530692241870850490.a();
            hashMap2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || J12447903228903363333.class != obj.getClass()) {
            return false;
        }
        J12447903228903363333 j12447903228903363333 = (J12447903228903363333) obj;
        return this.b.equals(j12447903228903363333.b) && this.c.equals(j12447903228903363333.c) && this.d.equals(j12447903228903363333.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
