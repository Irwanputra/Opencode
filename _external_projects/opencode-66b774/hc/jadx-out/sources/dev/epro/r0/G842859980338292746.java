package dev.epro.r0;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class G842859980338292746 {
    public final P10208541982779414550 a;
    public final String b;
    public final F12902864952249894497 c;
    public final I11613337141824465265 d;
    public final P2382941533350862833 e;
    public L3064878953493027662 f;

    public G842859980338292746(I1581330382723795749 i1581330382723795749) {
        P10208541982779414550 p10208541982779414550 = (P10208541982779414550) i1581330382723795749.a;
        if (p10208541982779414550 == null) {
            S10973172697741180971.m("url == null");
            throw null;
        }
        this.a = p10208541982779414550;
        this.b = (String) i1581330382723795749.b;
        V14323974914327418545 v14323974914327418545 = (V14323974914327418545) i1581330382723795749.c;
        v14323974914327418545.getClass();
        this.c = X7410747940286448830.d(v14323974914327418545);
        this.d = (I11613337141824465265) i1581330382723795749.d;
        this.e = (P2382941533350862833) i1581330382723795749.e;
    }

    public final I1581330382723795749 a() {
        I1581330382723795749 i1581330382723795749 = new I1581330382723795749();
        i1581330382723795749.a = this.a;
        i1581330382723795749.b = this.b;
        i1581330382723795749.d = this.d;
        i1581330382723795749.e = this.e;
        i1581330382723795749.c = X7410747940286448830.f(this.c);
        return i1581330382723795749;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        F12902864952249894497 f12902864952249894497 = this.c;
        if (f12902864952249894497.size() != 0) {
            sb.append(", headers=[");
            Iterator it = f12902864952249894497.iterator();
            int i = 0;
            while (true) {
                Z1085125311131623997 z1085125311131623997 = (Z1085125311131623997) it;
                if (!z1085125311131623997.hasNext()) {
                    sb.append(']');
                    break;
                }
                Object next = z1085125311131623997.next();
                int i2 = i + 1;
                if (i < 0) {
                    K5751602218013079365.f0();
                    throw null;
                }
                H9390398899829886498 h9390398899829886498 = (H9390398899829886498) next;
                String str = (String) h9390398899829886498.a;
                String str2 = (String) h9390398899829886498.b;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                if (L14928198200995638215.j(str)) {
                    str2 = "██";
                }
                sb.append(str2);
                i = i2;
            }
        }
        P2382941533350862833 p2382941533350862833 = P2382941533350862833.n;
        P2382941533350862833 p23829415333508628332 = this.e;
        if (!S10823041268949770285.t(p23829415333508628332, p2382941533350862833)) {
            sb.append(", tags=");
            sb.append(p23829415333508628332);
        }
        sb.append('}');
        return sb.toString();
    }
}
