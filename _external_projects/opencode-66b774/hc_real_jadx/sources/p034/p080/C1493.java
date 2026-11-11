package p034.p080;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: づざかべべ.づざかべべ.〳ぜぞぜべっ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1493<K, V> {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static int f6904;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static Object[] f6905;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static Object[] f6906;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static int f6907;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int[] f6908;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public Object[] f6909;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f6910;

    public C1493() {
        this.f6908 = C1506.f6953;
        this.f6909 = C1506.f6952;
        this.f6910 = 0;
    }

    public C1493(int i) {
        if (i == 0) {
            this.f6908 = C1506.f6953;
            this.f6909 = C1506.f6952;
        } else {
            m3250(i);
        }
        this.f6910 = 0;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static void m3245(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C1493.class) {
                if (f6904 < 10) {
                    objArr[0] = f6905;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f6905 = objArr;
                    f6904++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C1493.class) {
                if (f6907 < 10) {
                    objArr[0] = f6906;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f6906 = objArr;
                    f6907++;
                }
            }
        }
    }

    public void clear() {
        int i = this.f6910;
        if (i > 0) {
            int[] iArr = this.f6908;
            Object[] objArr = this.f6909;
            this.f6908 = C1506.f6953;
            this.f6909 = C1506.f6952;
            this.f6910 = 0;
            m3245(iArr, objArr, i);
        }
        if (this.f6910 > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m3251(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m3248(obj) >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1493) {
            C1493 c1493 = (C1493) obj;
            if (this.f6910 != c1493.f6910) {
                return false;
            }
            for (int i = 0; i < this.f6910; i++) {
                try {
                    K m3246 = m3246(i);
                    V m3255 = m3255(i);
                    Object obj2 = c1493.get(m3246);
                    if (m3255 == null) {
                        if (obj2 != null || !c1493.containsKey(m3246)) {
                            return false;
                        }
                    } else if (!m3255.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f6910 != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f6910; i2++) {
                try {
                    K m32462 = m3246(i2);
                    V m32552 = m3255(i2);
                    Object obj3 = map.get(m32462);
                    if (m32552 == null) {
                        if (obj3 != null || !map.containsKey(m32462)) {
                            return false;
                        }
                    } else if (!m32552.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int m3251 = m3251(obj);
        return m3251 >= 0 ? (V) this.f6909[(m3251 << 1) + 1] : v;
    }

    public int hashCode() {
        int[] iArr = this.f6908;
        Object[] objArr = this.f6909;
        int i = this.f6910;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public boolean isEmpty() {
        return this.f6910 <= 0;
    }

    public V put(K k, V v) {
        int i;
        int m3253;
        int i2 = this.f6910;
        if (k == null) {
            m3253 = m3252();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            m3253 = m3253(k, hashCode);
        }
        if (m3253 >= 0) {
            int i3 = (m3253 << 1) + 1;
            Object[] objArr = this.f6909;
            V v2 = (V) objArr[i3];
            objArr[i3] = v;
            return v2;
        }
        int i4 = m3253 ^ (-1);
        int[] iArr = this.f6908;
        if (i2 >= iArr.length) {
            int i5 = 4;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i5 = 8;
            }
            Object[] objArr2 = this.f6909;
            m3250(i5);
            if (i2 != this.f6910) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f6908;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f6909, 0, objArr2.length);
            }
            m3245(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.f6908;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.f6909;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.f6910 - i4) << 1);
        }
        int i7 = this.f6910;
        if (i2 == i7) {
            int[] iArr4 = this.f6908;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.f6909;
                int i8 = i4 << 1;
                objArr4[i8] = k;
                objArr4[i8 + 1] = v;
                this.f6910 = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V orDefault = getOrDefault(k, null);
        return orDefault == null ? put(k, v) : orDefault;
    }

    public V remove(Object obj) {
        int m3251 = m3251(obj);
        if (m3251 >= 0) {
            return m3254(m3251);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int m3251 = m3251(obj);
        if (m3251 < 0) {
            return false;
        }
        V m3255 = m3255(m3251);
        if (obj2 != m3255 && (obj2 == null || !obj2.equals(m3255))) {
            return false;
        }
        m3254(m3251);
        return true;
    }

    public V replace(K k, V v) {
        int m3251 = m3251(k);
        if (m3251 >= 0) {
            return m3249(m3251, v);
        }
        return null;
    }

    public boolean replace(K k, V v, V v2) {
        int m3251 = m3251(k);
        if (m3251 < 0) {
            return false;
        }
        V m3255 = m3255(m3251);
        if (m3255 != v && (v == null || !v.equals(m3255))) {
            return false;
        }
        m3249(m3251, v2);
        return true;
    }

    public int size() {
        return this.f6910;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f6910 * 28);
        sb.append('{');
        for (int i = 0; i < this.f6910; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K m3246 = m3246(i);
            if (m3246 != this) {
                sb.append(m3246);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V m3255 = m3255(i);
            if (m3255 != this) {
                sb.append(m3255);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public K m3246(int i) {
        return (K) this.f6909[i << 1];
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m3247(int i) {
        int i2 = this.f6910;
        int[] iArr = this.f6908;
        if (iArr.length < i) {
            Object[] objArr = this.f6909;
            m3250(i);
            if (this.f6910 > 0) {
                System.arraycopy(iArr, 0, this.f6908, 0, i2);
                System.arraycopy(objArr, 0, this.f6909, 0, i2 << 1);
            }
            m3245(iArr, objArr, i2);
        }
        if (this.f6910 != i2) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int m3248(Object obj) {
        int i = this.f6910 * 2;
        Object[] objArr = this.f6909;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public V m3249(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f6909;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m3250(int i) {
        if (i == 8) {
            synchronized (C1493.class) {
                Object[] objArr = f6905;
                if (objArr != null) {
                    this.f6909 = objArr;
                    f6905 = (Object[]) objArr[0];
                    this.f6908 = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f6904--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C1493.class) {
                Object[] objArr2 = f6906;
                if (objArr2 != null) {
                    this.f6909 = objArr2;
                    f6906 = (Object[]) objArr2[0];
                    this.f6908 = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f6907--;
                    return;
                }
            }
        }
        this.f6908 = new int[i];
        this.f6909 = new Object[i << 1];
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int m3251(Object obj) {
        return obj == null ? m3252() : m3253(obj, obj.hashCode());
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int m3252() {
        int i = this.f6910;
        if (i == 0) {
            return -1;
        }
        try {
            int m3289 = C1506.m3289(this.f6908, i, 0);
            if (m3289 < 0 || this.f6909[m3289 << 1] == null) {
                return m3289;
            }
            int i2 = m3289 + 1;
            while (i2 < i && this.f6908[i2] == 0) {
                if (this.f6909[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = m3289 - 1; i3 >= 0 && this.f6908[i3] == 0; i3--) {
                if (this.f6909[i3 << 1] == null) {
                    return i3;
                }
            }
            return i2 ^ (-1);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int m3253(Object obj, int i) {
        int i2 = this.f6910;
        if (i2 == 0) {
            return -1;
        }
        try {
            int m3289 = C1506.m3289(this.f6908, i2, i);
            if (m3289 < 0 || obj.equals(this.f6909[m3289 << 1])) {
                return m3289;
            }
            int i3 = m3289 + 1;
            while (i3 < i2 && this.f6908[i3] == i) {
                if (obj.equals(this.f6909[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = m3289 - 1; i4 >= 0 && this.f6908[i4] == i; i4--) {
                if (obj.equals(this.f6909[i4 << 1])) {
                    return i4;
                }
            }
            return i3 ^ (-1);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public V m3254(int i) {
        Object[] objArr = this.f6909;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.f6910;
        int i4 = 0;
        if (i3 <= 1) {
            m3245(this.f6908, objArr, i3);
            this.f6908 = C1506.f6953;
            this.f6909 = C1506.f6952;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f6908;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(iArr, i6, iArr, i, i7);
                    Object[] objArr2 = this.f6909;
                    System.arraycopy(objArr2, i6 << 1, objArr2, i2, i7 << 1);
                }
                Object[] objArr3 = this.f6909;
                int i8 = i5 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                m3250(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.f6910) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f6908, 0, i);
                    System.arraycopy(objArr, 0, this.f6909, 0, i2);
                }
                if (i < i5) {
                    int i9 = i + 1;
                    int i10 = i5 - i;
                    System.arraycopy(iArr, i9, this.f6908, i, i10);
                    System.arraycopy(objArr, i9 << 1, this.f6909, i2, i10 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 != this.f6910) {
            throw new ConcurrentModificationException();
        }
        this.f6910 = i4;
        return v;
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public V m3255(int i) {
        return (V) this.f6909[(i << 1) + 1];
    }
}
