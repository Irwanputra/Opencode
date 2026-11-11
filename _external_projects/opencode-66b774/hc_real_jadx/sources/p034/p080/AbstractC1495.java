package p034.p080;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: づざかべべ.づざかべべ.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC1495<K, V> {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public AbstractC1495<K, V>.C1497 f6912;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public AbstractC1495<K, V>.C1499 f6913;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public AbstractC1495<K, V>.C1496 f6914;

    /* renamed from: づざかべべ.づざかべべ.ぁごぐすすぃ$〺つふすそ, reason: contains not printable characters */
    public final class C1496 implements Set<Map.Entry<K, V>> {
        public C1496() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int mo3263 = AbstractC1495.this.mo3263();
            for (Map.Entry<K, V> entry : collection) {
                AbstractC1495.this.mo3258(entry.getKey(), entry.getValue());
            }
            return mo3263 != AbstractC1495.this.mo3263();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC1495.this.mo3260();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int mo3261 = AbstractC1495.this.mo3261(entry.getKey());
            if (mo3261 < 0) {
                return false;
            }
            return C1506.m3288(AbstractC1495.this.mo3257(mo3261, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC1495.m3265(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i = 0;
            for (int mo3263 = AbstractC1495.this.mo3263() - 1; mo3263 >= 0; mo3263--) {
                Object mo3257 = AbstractC1495.this.mo3257(mo3263, 0);
                Object mo32572 = AbstractC1495.this.mo3257(mo3263, 1);
                i += (mo3257 == null ? 0 : mo3257.hashCode()) ^ (mo32572 == null ? 0 : mo32572.hashCode());
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC1495.this.mo3263() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C1500();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC1495.this.mo3263();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: づざかべべ.づざかべべ.ぁごぐすすぃ$くし〴〺ぅ, reason: contains not printable characters */
    public final class C1497 implements Set<K> {
        public C1497() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC1495.this.mo3260();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC1495.this.mo3261(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Map<K, V> mo3259 = AbstractC1495.this.mo3259();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!mo3259.containsKey(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC1495.m3265(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i = 0;
            for (int mo3263 = AbstractC1495.this.mo3263() - 1; mo3263 >= 0; mo3263--) {
                Object mo3257 = AbstractC1495.this.mo3257(mo3263, 0);
                i += mo3257 == null ? 0 : mo3257.hashCode();
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC1495.this.mo3263() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new C1498(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int mo3261 = AbstractC1495.this.mo3261(obj);
            if (mo3261 < 0) {
                return false;
            }
            AbstractC1495.this.mo3256(mo3261);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Map<K, V> mo3259 = AbstractC1495.this.mo3259();
            int size = mo3259.size();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                mo3259.remove(it.next());
            }
            return size != mo3259.size();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return AbstractC1495.m3266(AbstractC1495.this.mo3259(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC1495.this.mo3263();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return AbstractC1495.this.m3267(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC1495.this.m3268(tArr, 0);
        }
    }

    /* renamed from: づざかべべ.づざかべべ.ぁごぐすすぃ$げつ〴ぬぐ, reason: contains not printable characters */
    public final class C1498<T> implements Iterator<T> {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final int f6917;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int f6918;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public boolean f6919 = false;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f6921;

        public C1498(int i) {
            this.f6917 = i;
            this.f6918 = AbstractC1495.this.mo3263();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f6921 < this.f6918;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t = (T) AbstractC1495.this.mo3257(this.f6921, this.f6917);
            this.f6921++;
            this.f6919 = true;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f6919) {
                throw new IllegalStateException();
            }
            int i = this.f6921 - 1;
            this.f6921 = i;
            this.f6918--;
            this.f6919 = false;
            AbstractC1495.this.mo3256(i);
        }
    }

    /* renamed from: づざかべべ.づざかべべ.ぁごぐすすぃ$づざかべべ, reason: contains not printable characters */
    public final class C1499 implements Collection<V> {
        public C1499() {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            AbstractC1495.this.mo3260();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC1495.this.mo3262(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return AbstractC1495.this.mo3263() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new C1498(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int mo3262 = AbstractC1495.this.mo3262(obj);
            if (mo3262 < 0) {
                return false;
            }
            AbstractC1495.this.mo3256(mo3262);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int mo3263 = AbstractC1495.this.mo3263();
            int i = 0;
            boolean z = false;
            while (i < mo3263) {
                if (collection.contains(AbstractC1495.this.mo3257(i, 1))) {
                    AbstractC1495.this.mo3256(i);
                    i--;
                    mo3263--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int mo3263 = AbstractC1495.this.mo3263();
            int i = 0;
            boolean z = false;
            while (i < mo3263) {
                if (!collection.contains(AbstractC1495.this.mo3257(i, 1))) {
                    AbstractC1495.this.mo3256(i);
                    i--;
                    mo3263--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return AbstractC1495.this.mo3263();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return AbstractC1495.this.m3267(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC1495.this.m3268(tArr, 1);
        }
    }

    /* renamed from: づざかべべ.づざかべべ.ぁごぐすすぃ$びぐびあび, reason: contains not printable characters */
    public final class C1500 implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f6923;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public boolean f6926 = false;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int f6924 = -1;

        public C1500() {
            this.f6923 = AbstractC1495.this.mo3263() - 1;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f6926) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return C1506.m3288(entry.getKey(), AbstractC1495.this.mo3257(this.f6924, 0)) && C1506.m3288(entry.getValue(), AbstractC1495.this.mo3257(this.f6924, 1));
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f6926) {
                return (K) AbstractC1495.this.mo3257(this.f6924, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f6926) {
                return (V) AbstractC1495.this.mo3257(this.f6924, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f6924 < this.f6923;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f6926) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object mo3257 = AbstractC1495.this.mo3257(this.f6924, 0);
            Object mo32572 = AbstractC1495.this.mo3257(this.f6924, 1);
            return (mo3257 == null ? 0 : mo3257.hashCode()) ^ (mo32572 != null ? mo32572.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f6924++;
            this.f6926 = true;
            return this;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f6926) {
                throw new IllegalStateException();
            }
            AbstractC1495.this.mo3256(this.f6924);
            this.f6924--;
            this.f6923--;
            this.f6926 = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (this.f6926) {
                return (V) AbstractC1495.this.mo3264(this.f6924, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public static <T> boolean m3265(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public static <K, V> boolean m3266(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* renamed from: 〳ぜぞぜべっ */
    public abstract void mo3256(int i);

    /* renamed from: 〺つふすそ */
    public abstract Object mo3257(int i, int i2);

    /* renamed from: ぁごぐすすぃ */
    public abstract void mo3258(K k, V v);

    /* renamed from: くし〴〺ぅ */
    public abstract Map<K, V> mo3259();

    /* renamed from: げつ〴ぬぐ */
    public abstract void mo3260();

    /* renamed from: づざかべべ */
    public abstract int mo3261(Object obj);

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public Object[] m3267(int i) {
        int mo3263 = mo3263();
        Object[] objArr = new Object[mo3263];
        for (int i2 = 0; i2 < mo3263; i2++) {
            objArr[i2] = mo3257(i2, i);
        }
        return objArr;
    }

    /* renamed from: なぎぱいぢぎ */
    public abstract int mo3262(Object obj);

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public <T> T[] m3268(T[] tArr, int i) {
        int mo3263 = mo3263();
        if (tArr.length < mo3263) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), mo3263));
        }
        for (int i2 = 0; i2 < mo3263; i2++) {
            tArr[i2] = mo3257(i2, i);
        }
        if (tArr.length > mo3263) {
            tArr[mo3263] = null;
        }
        return tArr;
    }

    /* renamed from: びぐびあび */
    public abstract int mo3263();

    /* renamed from: ぺぁあねじ */
    public abstract V mo3264(int i, V v);
}
