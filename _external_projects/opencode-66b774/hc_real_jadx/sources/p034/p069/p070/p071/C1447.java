package p034.p069.p070.p071;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p131.p155.p156.p157.C2098;

/* renamed from: づざかべべ.くし〴〺ぅ.げつ〴ぬぐ.〺つふすそ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1447<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C1449<K, V> f6734;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public C1449<K, V> f6735;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public WeakHashMap<InterfaceC1452<K, V>, Boolean> f6737 = new WeakHashMap<>();

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f6736 = 0;

    /* renamed from: づざかべべ.くし〴〺ぅ.げつ〴ぬぐ.〺つふすそ.〺つふすそ$〺つふすそ, reason: contains not printable characters */
    public static class C1448<K, V> extends AbstractC1451<K, V> {
        public C1448(C1449<K, V> c1449, C1449<K, V> c14492) {
            super(c1449, c14492);
        }

        @Override // p034.p069.p070.p071.C1447.AbstractC1451
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public C1449<K, V> mo3192(C1449<K, V> c1449) {
            return c1449.f6741;
        }

        @Override // p034.p069.p070.p071.C1447.AbstractC1451
        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public C1449<K, V> mo3193(C1449<K, V> c1449) {
            return c1449.f6740;
        }
    }

    /* renamed from: づざかべべ.くし〴〺ぅ.げつ〴ぬぐ.〺つふすそ.〺つふすそ$くし〴〺ぅ, reason: contains not printable characters */
    public static class C1449<K, V> implements Map.Entry<K, V> {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final K f6738;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final V f6739;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public C1449<K, V> f6740;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public C1449<K, V> f6741;

        public C1449(K k, V v) {
            this.f6738 = k;
            this.f6739 = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C1449)) {
                return false;
            }
            C1449 c1449 = (C1449) obj;
            return this.f6738.equals(c1449.f6738) && this.f6739.equals(c1449.f6739);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f6738;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f6739;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f6738.hashCode() ^ this.f6739.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f6738 + "=" + this.f6739;
        }
    }

    /* renamed from: づざかべべ.くし〴〺ぅ.げつ〴ぬぐ.〺つふすそ.〺つふすそ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1450<K, V> extends AbstractC1451<K, V> {
        public C1450(C1449<K, V> c1449, C1449<K, V> c14492) {
            super(c1449, c14492);
        }

        @Override // p034.p069.p070.p071.C1447.AbstractC1451
        /* renamed from: 〺つふすそ */
        public C1449<K, V> mo3192(C1449<K, V> c1449) {
            return c1449.f6740;
        }

        @Override // p034.p069.p070.p071.C1447.AbstractC1451
        /* renamed from: くし〴〺ぅ */
        public C1449<K, V> mo3193(C1449<K, V> c1449) {
            return c1449.f6741;
        }
    }

    /* renamed from: づざかべべ.くし〴〺ぅ.げつ〴ぬぐ.〺つふすそ.〺つふすそ$づざかべべ, reason: contains not printable characters */
    public static abstract class AbstractC1451<K, V> implements Iterator<Map.Entry<K, V>>, InterfaceC1452<K, V> {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public C1449<K, V> f6742;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public C1449<K, V> f6743;

        public AbstractC1451(C1449<K, V> c1449, C1449<K, V> c14492) {
            this.f6742 = c14492;
            this.f6743 = c1449;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f6743 != null;
        }

        @Override // java.util.Iterator
        public Object next() {
            C1449<K, V> c1449 = this.f6743;
            C1449<K, V> c14492 = this.f6742;
            this.f6743 = (c1449 == c14492 || c14492 == null) ? null : mo3193(c1449);
            return c1449;
        }

        /* renamed from: 〺つふすそ */
        public abstract C1449<K, V> mo3192(C1449<K, V> c1449);

        /* renamed from: くし〴〺ぅ */
        public abstract C1449<K, V> mo3193(C1449<K, V> c1449);

        @Override // p034.p069.p070.p071.C1447.InterfaceC1452
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void mo3194(C1449<K, V> c1449) {
            C1449<K, V> c14492 = null;
            if (this.f6742 == c1449 && c1449 == this.f6743) {
                this.f6743 = null;
                this.f6742 = null;
            }
            C1449<K, V> c14493 = this.f6742;
            if (c14493 == c1449) {
                this.f6742 = mo3192(c14493);
            }
            C1449<K, V> c14494 = this.f6743;
            if (c14494 == c1449) {
                C1449<K, V> c14495 = this.f6742;
                if (c14494 != c14495 && c14495 != null) {
                    c14492 = mo3193(c14494);
                }
                this.f6743 = c14492;
            }
        }
    }

    /* renamed from: づざかべべ.くし〴〺ぅ.げつ〴ぬぐ.〺つふすそ.〺つふすそ$なぎぱいぢぎ, reason: contains not printable characters */
    public interface InterfaceC1452<K, V> {
        /* renamed from: げつ〴ぬぐ */
        void mo3194(C1449<K, V> c1449);
    }

    /* renamed from: づざかべべ.くし〴〺ぅ.げつ〴ぬぐ.〺つふすそ.〺つふすそ$びぐびあび, reason: contains not printable characters */
    public class C1453 implements Iterator<Map.Entry<K, V>>, InterfaceC1452<K, V> {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public C1449<K, V> f6744;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public boolean f6745 = true;

        public C1453() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f6745) {
                return C1447.this.f6734 != null;
            }
            C1449<K, V> c1449 = this.f6744;
            return (c1449 == null || c1449.f6741 == null) ? false : true;
        }

        @Override // java.util.Iterator
        public Object next() {
            C1449<K, V> c1449;
            if (this.f6745) {
                this.f6745 = false;
                c1449 = C1447.this.f6734;
            } else {
                C1449<K, V> c14492 = this.f6744;
                c1449 = c14492 != null ? c14492.f6741 : null;
            }
            this.f6744 = c1449;
            return c1449;
        }

        @Override // p034.p069.p070.p071.C1447.InterfaceC1452
        /* renamed from: げつ〴ぬぐ */
        public void mo3194(C1449<K, V> c1449) {
            C1449<K, V> c14492 = this.f6744;
            if (c1449 == c14492) {
                C1449<K, V> c14493 = c14492.f6740;
                this.f6744 = c14493;
                this.f6745 = c14493 == null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((p034.p069.p070.p071.C1447.AbstractC1451) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof p034.p069.p070.p071.C1447
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            づざかべべ.くし〴〺ぅ.げつ〴ぬぐ.〺つふすそ.〺つふすそ r7 = (p034.p069.p070.p071.C1447) r7
            int r1 = r6.f6736
            int r3 = r7.f6736
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            づざかべべ.くし〴〺ぅ.げつ〴ぬぐ.〺つふすそ.〺つふすそ$づざかべべ r3 = (p034.p069.p070.p071.C1447.AbstractC1451) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            づざかべべ.くし〴〺ぅ.げつ〴ぬぐ.〺つふすそ.〺つふすそ$づざかべべ r4 = (p034.p069.p070.p071.C1447.AbstractC1451) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            づざかべべ.くし〴〺ぅ.げつ〴ぬぐ.〺つふすそ.〺つふすそ$づざかべべ r7 = (p034.p069.p070.p071.C1447.AbstractC1451) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = 0
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p069.p070.p071.C1447.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (true) {
            AbstractC1451 abstractC1451 = (AbstractC1451) it;
            if (!abstractC1451.hasNext()) {
                return i;
            }
            i += ((Map.Entry) abstractC1451.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        C1450 c1450 = new C1450(this.f6734, this.f6735);
        this.f6737.put(c1450, Boolean.FALSE);
        return c1450;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            AbstractC1451 abstractC1451 = (AbstractC1451) it;
            if (!abstractC1451.hasNext()) {
                m4207.append("]");
                return m4207.toString();
            }
            m4207.append(((Map.Entry) abstractC1451.next()).toString());
            if (abstractC1451.hasNext()) {
                m4207.append(", ");
            }
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C1447<K, V>.C1453 m3188() {
        C1447<K, V>.C1453 c1453 = new C1453();
        this.f6737.put(c1453, Boolean.FALSE);
        return c1453;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public C1449<K, V> m3189(K k, V v) {
        C1449<K, V> c1449 = new C1449<>(k, v);
        this.f6736++;
        C1449<K, V> c14492 = this.f6735;
        if (c14492 == null) {
            this.f6734 = c1449;
        } else {
            c14492.f6741 = c1449;
            c1449.f6740 = c14492;
        }
        this.f6735 = c1449;
        return c1449;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public C1449<K, V> mo3190(K k) {
        C1449<K, V> c1449 = this.f6734;
        while (c1449 != null && !c1449.f6738.equals(k)) {
            c1449 = c1449.f6741;
        }
        return c1449;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public V mo3191(K k) {
        C1449<K, V> mo3190 = mo3190(k);
        if (mo3190 == null) {
            return null;
        }
        this.f6736--;
        if (!this.f6737.isEmpty()) {
            Iterator<InterfaceC1452<K, V>> it = this.f6737.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo3194(mo3190);
            }
        }
        C1449<K, V> c1449 = mo3190.f6740;
        C1449<K, V> c14492 = mo3190.f6741;
        if (c1449 != null) {
            c1449.f6741 = c14492;
        } else {
            this.f6734 = c14492;
        }
        C1449<K, V> c14493 = mo3190.f6741;
        if (c14493 != null) {
            c14493.f6740 = c1449;
        } else {
            this.f6735 = c1449;
        }
        mo3190.f6741 = null;
        mo3190.f6740 = null;
        return mo3190.f6739;
    }
}
