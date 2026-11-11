package p015.p016.p019;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p015.p016.p020.C0976;

/* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0913 extends ArrayList<C0976> {
    public C0913() {
    }

    public C0913(int i) {
        super(i);
    }

    public C0913(List<C0976> list) {
        super(list);
    }

    @Override // java.util.ArrayList
    public Object clone() {
        C0913 c0913 = new C0913(size());
        Iterator<C0976> it = iterator();
        while (it.hasNext()) {
            c0913.add(it.next().mo2267());
        }
        return c0913;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<C0976> it = iterator();
        while (it.hasNext()) {
            C0976 next = it.next();
            if (sb.length() != 0) {
                sb.append("\n");
            }
            sb.append(next.mo2268());
        }
        return sb.toString();
    }
}
