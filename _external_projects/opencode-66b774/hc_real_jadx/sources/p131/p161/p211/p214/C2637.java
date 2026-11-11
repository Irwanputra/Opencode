package p131.p161.p211.p214;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.は〲ぱなで, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2637<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public static final Comparator<Comparable> f10079 = new C2642();

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public C2637<K, V>.C2640 f10080;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public Comparator<? super K> f10081;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public C2637<K, V>.C2638 f10082;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public C2643<K, V> f10083;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f10084;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final C2643<K, V> f10085;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f10086;

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.は〲ぱなで$〺つふすそ, reason: contains not printable characters */
    public class C2638 extends AbstractSet<Map.Entry<K, V>> {

        /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.は〲ぱなで$〺つふすそ$げつ〴ぬぐ, reason: contains not printable characters */
        public class C2639 extends C2637<K, V>.AbstractC2644<Map.Entry<K, V>> {
            public C2639(C2638 c2638) {
                super();
            }

            @Override // java.util.Iterator
            public Object next() {
                return m4630();
            }
        }

        public C2638() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C2637.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && C2637.this.m4623((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C2639(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            C2643<K, V> m4623;
            if (!(obj instanceof Map.Entry) || (m4623 = C2637.this.m4623((Map.Entry) obj)) == null) {
                return false;
            }
            C2637.this.m4627(m4623, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C2637.this.f10086;
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.は〲ぱなで$くし〴〺ぅ, reason: contains not printable characters */
    public final class C2640 extends AbstractSet<K> {

        /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.は〲ぱなで$くし〴〺ぅ$げつ〴ぬぐ, reason: contains not printable characters */
        public class C2641 extends C2637<K, V>.AbstractC2644<K> {
            public C2641(C2640 c2640) {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return m4630().f10091;
            }
        }

        public C2640() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C2637.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C2637.this.m4625(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new C2641(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            C2637 c2637 = C2637.this;
            C2643<K, V> m4625 = c2637.m4625(obj);
            if (m4625 != null) {
                c2637.m4627(m4625, true);
            }
            return m4625 != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C2637.this.f10086;
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.は〲ぱなで$げつ〴ぬぐ, reason: contains not printable characters */
    public class C2642 implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.は〲ぱなで$づざかべべ, reason: contains not printable characters */
    public static final class C2643<K, V> implements Map.Entry<K, V> {

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public V f10089;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public C2643<K, V> f10090;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public final K f10091;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public C2643<K, V> f10092;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public C2643<K, V> f10093;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public C2643<K, V> f10094;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public C2643<K, V> f10095;

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public int f10096;

        public C2643() {
            this.f10091 = null;
            this.f10094 = this;
            this.f10093 = this;
        }

        public C2643(C2643<K, V> c2643, K k, C2643<K, V> c26432, C2643<K, V> c26433) {
            this.f10090 = c2643;
            this.f10091 = k;
            this.f10096 = 1;
            this.f10093 = c26432;
            this.f10094 = c26433;
            c26433.f10093 = this;
            c26432.f10094 = this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k = this.f10091;
            if (k == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k.equals(entry.getKey())) {
                return false;
            }
            V v = this.f10089;
            Object value = entry.getValue();
            if (v == null) {
                if (value != null) {
                    return false;
                }
            } else if (!v.equals(value)) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f10091;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f10089;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.f10091;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f10089;
            return hashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.f10089;
            this.f10089 = v;
            return v2;
        }

        public String toString() {
            return this.f10091 + "=" + this.f10089;
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.は〲ぱなで$びぐびあび, reason: contains not printable characters */
    public abstract class AbstractC2644<T> implements Iterator<T> {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public C2643<K, V> f10097;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public C2643<K, V> f10098 = null;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f10100;

        public AbstractC2644() {
            this.f10097 = C2637.this.f10085.f10093;
            this.f10100 = C2637.this.f10084;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f10097 != C2637.this.f10085;
        }

        @Override // java.util.Iterator
        public final void remove() {
            C2643<K, V> c2643 = this.f10098;
            if (c2643 == null) {
                throw new IllegalStateException();
            }
            C2637.this.m4627(c2643, true);
            this.f10098 = null;
            this.f10100 = C2637.this.f10084;
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final C2643<K, V> m4630() {
            C2643<K, V> c2643 = this.f10097;
            C2637 c2637 = C2637.this;
            if (c2643 == c2637.f10085) {
                throw new NoSuchElementException();
            }
            if (c2637.f10084 != this.f10100) {
                throw new ConcurrentModificationException();
            }
            this.f10097 = c2643.f10093;
            this.f10098 = c2643;
            return c2643;
        }
    }

    public C2637() {
        Comparator<Comparable> comparator = f10079;
        this.f10086 = 0;
        this.f10084 = 0;
        this.f10085 = new C2643<>();
        this.f10081 = comparator;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f10083 = null;
        this.f10086 = 0;
        this.f10084++;
        C2643<K, V> c2643 = this.f10085;
        c2643.f10094 = c2643;
        c2643.f10093 = c2643;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return m4625(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        C2637<K, V>.C2638 c2638 = this.f10082;
        if (c2638 != null) {
            return c2638;
        }
        C2637<K, V>.C2638 c26382 = new C2638();
        this.f10082 = c26382;
        return c26382;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        C2643<K, V> m4625 = m4625(obj);
        if (m4625 != null) {
            return m4625.f10089;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        C2637<K, V>.C2640 c2640 = this.f10080;
        if (c2640 != null) {
            return c2640;
        }
        C2637<K, V>.C2640 c26402 = new C2640();
        this.f10080 = c26402;
        return c26402;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        C2643<K, V> m4626 = m4626(k, true);
        V v2 = m4626.f10089;
        m4626.f10089 = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        C2643<K, V> m4625 = m4625(obj);
        if (m4625 != null) {
            m4627(m4625, true);
        }
        if (m4625 != null) {
            return m4625.f10089;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f10086;
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final void m4622(C2643<K, V> c2643) {
        C2643<K, V> c26432 = c2643.f10092;
        C2643<K, V> c26433 = c2643.f10095;
        C2643<K, V> c26434 = c26432.f10092;
        C2643<K, V> c26435 = c26432.f10095;
        c2643.f10092 = c26435;
        if (c26435 != null) {
            c26435.f10090 = c2643;
        }
        m4628(c2643, c26432);
        c26432.f10095 = c2643;
        c2643.f10090 = c26432;
        int max = Math.max(c26433 != null ? c26433.f10096 : 0, c26435 != null ? c26435.f10096 : 0) + 1;
        c2643.f10096 = max;
        c26432.f10096 = Math.max(max, c26434 != null ? c26434.f10096 : 0) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        if ((r3 == r5 || (r3 != null && r3.equals(r5))) != false) goto L15;
     */
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p131.p161.p211.p214.C2637.C2643<K, V> m4623(java.util.Map.Entry<?, ?> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.は〲ぱなで$づざかべべ r0 = r4.m4625(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L23
            V r3 = r0.f10089
            java.lang.Object r5 = r5.getValue()
            if (r3 == r5) goto L1f
            if (r3 == 0) goto L1d
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L1d
            goto L1f
        L1d:
            r5 = 0
            goto L20
        L1f:
            r5 = 1
        L20:
            if (r5 == 0) goto L23
            goto L24
        L23:
            r1 = 0
        L24:
            if (r1 == 0) goto L27
            goto L28
        L27:
            r0 = 0
        L28:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p131.p161.p211.p214.C2637.m4623(java.util.Map$Entry):なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.は〲ぱなで$づざかべべ");
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final void m4624(C2643<K, V> c2643) {
        C2643<K, V> c26432 = c2643.f10092;
        C2643<K, V> c26433 = c2643.f10095;
        C2643<K, V> c26434 = c26433.f10092;
        C2643<K, V> c26435 = c26433.f10095;
        c2643.f10095 = c26434;
        if (c26434 != null) {
            c26434.f10090 = c2643;
        }
        m4628(c2643, c26433);
        c26433.f10092 = c2643;
        c2643.f10090 = c26433;
        int max = Math.max(c26432 != null ? c26432.f10096 : 0, c26434 != null ? c26434.f10096 : 0) + 1;
        c2643.f10096 = max;
        c26433.f10096 = Math.max(max, c26435 != null ? c26435.f10096 : 0) + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public C2643<K, V> m4625(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return m4626(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public C2643<K, V> m4626(K k, boolean z) {
        int i;
        C2643<K, V> c2643;
        Comparator<? super K> comparator = this.f10081;
        C2643<K, V> c26432 = this.f10083;
        if (c26432 != null) {
            Comparable comparable = comparator == f10079 ? (Comparable) k : null;
            while (true) {
                K k2 = c26432.f10091;
                i = comparable != null ? comparable.compareTo(k2) : comparator.compare(k, k2);
                if (i == 0) {
                    return c26432;
                }
                C2643<K, V> c26433 = i < 0 ? c26432.f10092 : c26432.f10095;
                if (c26433 == null) {
                    break;
                }
                c26432 = c26433;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        C2643<K, V> c26434 = this.f10085;
        if (c26432 != null) {
            c2643 = new C2643<>(c26432, k, c26434, c26434.f10094);
            if (i < 0) {
                c26432.f10092 = c2643;
            } else {
                c26432.f10095 = c2643;
            }
            m4629(c26432, true);
        } else {
            if (comparator == f10079 && !(k instanceof Comparable)) {
                throw new ClassCastException(k.getClass().getName() + " is not Comparable");
            }
            c2643 = new C2643<>(c26432, k, c26434, c26434.f10094);
            this.f10083 = c2643;
        }
        this.f10086++;
        this.f10084++;
        return c2643;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public void m4627(C2643<K, V> c2643, boolean z) {
        C2643<K, V> c26432;
        C2643<K, V> c26433;
        int i;
        if (z) {
            C2643<K, V> c26434 = c2643.f10094;
            c26434.f10093 = c2643.f10093;
            c2643.f10093.f10094 = c26434;
        }
        C2643<K, V> c26435 = c2643.f10092;
        C2643<K, V> c26436 = c2643.f10095;
        C2643<K, V> c26437 = c2643.f10090;
        int i2 = 0;
        if (c26435 == null || c26436 == null) {
            if (c26435 != null) {
                m4628(c2643, c26435);
                c2643.f10092 = null;
            } else if (c26436 != null) {
                m4628(c2643, c26436);
                c2643.f10095 = null;
            } else {
                m4628(c2643, null);
            }
            m4629(c26437, false);
            this.f10086--;
            this.f10084++;
            return;
        }
        if (c26435.f10096 > c26436.f10096) {
            do {
                c26433 = c26435;
                c26435 = c26435.f10095;
            } while (c26435 != null);
        } else {
            do {
                c26432 = c26436;
                c26436 = c26436.f10092;
            } while (c26436 != null);
            c26433 = c26432;
        }
        m4627(c26433, false);
        C2643<K, V> c26438 = c2643.f10092;
        if (c26438 != null) {
            i = c26438.f10096;
            c26433.f10092 = c26438;
            c26438.f10090 = c26433;
            c2643.f10092 = null;
        } else {
            i = 0;
        }
        C2643<K, V> c26439 = c2643.f10095;
        if (c26439 != null) {
            i2 = c26439.f10096;
            c26433.f10095 = c26439;
            c26439.f10090 = c26433;
            c2643.f10095 = null;
        }
        c26433.f10096 = Math.max(i, i2) + 1;
        m4628(c2643, c26433);
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final void m4628(C2643<K, V> c2643, C2643<K, V> c26432) {
        C2643<K, V> c26433 = c2643.f10090;
        c2643.f10090 = null;
        if (c26432 != null) {
            c26432.f10090 = c26433;
        }
        if (c26433 == null) {
            this.f10083 = c26432;
        } else if (c26433.f10092 == c2643) {
            c26433.f10092 = c26432;
        } else {
            c26433.f10095 = c26432;
        }
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final void m4629(C2643<K, V> c2643, boolean z) {
        while (c2643 != null) {
            C2643<K, V> c26432 = c2643.f10092;
            C2643<K, V> c26433 = c2643.f10095;
            int i = c26432 != null ? c26432.f10096 : 0;
            int i2 = c26433 != null ? c26433.f10096 : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                C2643<K, V> c26434 = c26433.f10092;
                C2643<K, V> c26435 = c26433.f10095;
                int i4 = (c26434 != null ? c26434.f10096 : 0) - (c26435 != null ? c26435.f10096 : 0);
                if (i4 != -1 && (i4 != 0 || z)) {
                    m4622(c26433);
                }
                m4624(c2643);
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                C2643<K, V> c26436 = c26432.f10092;
                C2643<K, V> c26437 = c26432.f10095;
                int i5 = (c26436 != null ? c26436.f10096 : 0) - (c26437 != null ? c26437.f10096 : 0);
                if (i5 != 1 && (i5 != 0 || z)) {
                    m4624(c26432);
                }
                m4622(c2643);
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                c2643.f10096 = i + 1;
                if (z) {
                    return;
                }
            } else {
                c2643.f10096 = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            c2643 = c2643.f10090;
        }
    }
}
