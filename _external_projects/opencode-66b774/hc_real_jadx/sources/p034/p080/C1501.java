package p034.p080;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p034.p080.AbstractC1495;

/* renamed from: づざかべべ.づざかべべ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C1501<E> implements Collection<E>, Set<E> {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static Object[] f6927;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public static Object[] f6929;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public static int f6931;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public static int f6932;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int[] f6933;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public Object[] f6934;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public AbstractC1495<E, E> f6935;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f6936;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static final int[] f6930 = new int[0];

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static final Object[] f6928 = new Object[0];

    public C1501() {
        this(0);
    }

    public C1501(int i) {
        if (i == 0) {
            this.f6933 = f6930;
            this.f6934 = f6928;
        } else {
            m3271(i);
        }
        this.f6936 = 0;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static void m3269(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C1501.class) {
                if (f6932 < 10) {
                    objArr[0] = f6929;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f6929 = objArr;
                    f6932++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C1501.class) {
                if (f6931 < 10) {
                    objArr[0] = f6927;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f6927 = objArr;
                    f6931++;
                }
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e) {
        int i;
        int m3270;
        if (e == null) {
            m3270 = m3273();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            m3270 = m3270(e, hashCode);
        }
        if (m3270 >= 0) {
            return false;
        }
        int i2 = m3270 ^ (-1);
        int i3 = this.f6936;
        int[] iArr = this.f6933;
        if (i3 >= iArr.length) {
            int i4 = 4;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i4 = 8;
            }
            Object[] objArr = this.f6934;
            m3271(i4);
            int[] iArr2 = this.f6933;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f6934, 0, objArr.length);
            }
            m3269(iArr, objArr, this.f6936);
        }
        int i5 = this.f6936;
        if (i2 < i5) {
            int[] iArr3 = this.f6933;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.f6934;
            System.arraycopy(objArr2, i2, objArr2, i6, this.f6936 - i2);
        }
        this.f6933[i2] = i;
        this.f6934[i2] = e;
        this.f6936++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.f6936;
        int[] iArr = this.f6933;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.f6934;
            m3271(size);
            int i = this.f6936;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f6933, 0, i);
                System.arraycopy(objArr, 0, this.f6934, 0, this.f6936);
            }
            m3269(iArr, objArr, this.f6936);
        }
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.f6936;
        if (i != 0) {
            m3269(this.f6933, this.f6934, i);
            this.f6933 = f6930;
            this.f6934 = f6928;
            this.f6936 = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f6936 != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f6936; i++) {
                try {
                    if (!set.contains(this.f6934[i])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f6933;
        int i = this.f6936;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public int indexOf(Object obj) {
        return obj == null ? m3273() : m3270(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f6936 <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        if (this.f6935 == null) {
            this.f6935 = new C1494(this);
        }
        AbstractC1495<E, E> abstractC1495 = this.f6935;
        if (abstractC1495.f6912 == null) {
            abstractC1495.f6912 = new AbstractC1495.C1497();
        }
        return abstractC1495.f6912.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        m3272(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f6936 - 1; i >= 0; i--) {
            if (!collection.contains(this.f6934[i])) {
                m3272(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f6936;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i = this.f6936;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f6934, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f6936) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f6936));
        }
        System.arraycopy(this.f6934, 0, tArr, 0, this.f6936);
        int length = tArr.length;
        int i = this.f6936;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f6936 * 14);
        sb.append('{');
        for (int i = 0; i < this.f6936; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.f6934[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final int m3270(Object obj, int i) {
        int i2 = this.f6936;
        if (i2 == 0) {
            return -1;
        }
        int m3289 = C1506.m3289(this.f6933, i2, i);
        if (m3289 < 0 || obj.equals(this.f6934[m3289])) {
            return m3289;
        }
        int i3 = m3289 + 1;
        while (i3 < i2 && this.f6933[i3] == i) {
            if (obj.equals(this.f6934[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = m3289 - 1; i4 >= 0 && this.f6933[i4] == i; i4--) {
            if (obj.equals(this.f6934[i4])) {
                return i4;
            }
        }
        return i3 ^ (-1);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m3271(int i) {
        if (i == 8) {
            synchronized (C1501.class) {
                Object[] objArr = f6929;
                if (objArr != null) {
                    this.f6934 = objArr;
                    f6929 = (Object[]) objArr[0];
                    this.f6933 = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f6932--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C1501.class) {
                Object[] objArr2 = f6927;
                if (objArr2 != null) {
                    this.f6934 = objArr2;
                    f6927 = (Object[]) objArr2[0];
                    this.f6933 = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f6931--;
                    return;
                }
            }
        }
        this.f6933 = new int[i];
        this.f6934 = new Object[i];
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public E m3272(int i) {
        Object[] objArr = this.f6934;
        E e = (E) objArr[i];
        int i2 = this.f6936;
        if (i2 <= 1) {
            m3269(this.f6933, objArr, i2);
            this.f6933 = f6930;
            this.f6934 = f6928;
            this.f6936 = 0;
        } else {
            int[] iArr = this.f6933;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i3 = i2 - 1;
                this.f6936 = i3;
                if (i < i3) {
                    int i4 = i + 1;
                    System.arraycopy(iArr, i4, iArr, i, i3 - i);
                    Object[] objArr2 = this.f6934;
                    System.arraycopy(objArr2, i4, objArr2, i, this.f6936 - i);
                }
                this.f6934[this.f6936] = null;
            } else {
                m3271(i2 > 8 ? i2 + (i2 >> 1) : 8);
                this.f6936--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f6933, 0, i);
                    System.arraycopy(objArr, 0, this.f6934, 0, i);
                }
                int i5 = this.f6936;
                if (i < i5) {
                    int i6 = i + 1;
                    System.arraycopy(iArr, i6, this.f6933, i, i5 - i);
                    System.arraycopy(objArr, i6, this.f6934, i, this.f6936 - i);
                }
            }
        }
        return e;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final int m3273() {
        int i = this.f6936;
        if (i == 0) {
            return -1;
        }
        int m3289 = C1506.m3289(this.f6933, i, 0);
        if (m3289 < 0 || this.f6934[m3289] == null) {
            return m3289;
        }
        int i2 = m3289 + 1;
        while (i2 < i && this.f6933[i2] == 0) {
            if (this.f6934[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = m3289 - 1; i3 >= 0 && this.f6933[i3] == 0; i3--) {
            if (this.f6934[i3] == null) {
                return i3;
            }
        }
        return i2 ^ (-1);
    }
}
