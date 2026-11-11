package p131.p161.p211;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.へぬ〴づぞ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2670 extends AbstractC2532 implements Iterable<AbstractC2532> {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final List<AbstractC2532> f10126 = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C2670) && ((C2670) obj).f10126.equals(this.f10126));
    }

    public int hashCode() {
        return this.f10126.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<AbstractC2532> iterator() {
        return this.f10126.iterator();
    }
}
