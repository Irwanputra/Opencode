package p034.p080;

/* renamed from: づざかべべ.づざかべべ.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1504<E> implements Cloneable {

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static final Object f6939 = new Object();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean f6940 = false;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public long[] f6941;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f6942;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public Object[] f6943;

    public C1504() {
        int m3291 = C1506.m3291(10);
        this.f6941 = new long[m3291];
        this.f6943 = new Object[m3291];
    }

    public String toString() {
        if (m3275() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f6942 * 28);
        sb.append('{');
        for (int i = 0; i < this.f6942; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (this.f6940) {
                m3282();
            }
            sb.append(this.f6941[i]);
            sb.append('=');
            E m3283 = m3283(i);
            if (m3283 != this) {
                sb.append(m3283);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public int m3275() {
        if (this.f6940) {
            m3282();
        }
        return this.f6942;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m3276() {
        int i = this.f6942;
        Object[] objArr = this.f6943;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f6942 = 0;
        this.f6940 = false;
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public void m3277(long j, E e) {
        int m3287 = C1506.m3287(this.f6941, this.f6942, j);
        if (m3287 >= 0) {
            this.f6943[m3287] = e;
            return;
        }
        int i = m3287 ^ (-1);
        int i2 = this.f6942;
        if (i < i2) {
            Object[] objArr = this.f6943;
            if (objArr[i] == f6939) {
                this.f6941[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f6940 && i2 >= this.f6941.length) {
            m3282();
            i = C1506.m3287(this.f6941, this.f6942, j) ^ (-1);
        }
        int i3 = this.f6942;
        if (i3 >= this.f6941.length) {
            int m3291 = C1506.m3291(i3 + 1);
            long[] jArr = new long[m3291];
            Object[] objArr2 = new Object[m3291];
            long[] jArr2 = this.f6941;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f6943;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f6941 = jArr;
            this.f6943 = objArr2;
        }
        int i4 = this.f6942;
        if (i4 - i != 0) {
            long[] jArr3 = this.f6941;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.f6943;
            System.arraycopy(objArr4, i, objArr4, i5, this.f6942 - i);
        }
        this.f6941[i] = j;
        this.f6943[i] = e;
        this.f6942++;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C1504<E> clone() {
        try {
            C1504<E> c1504 = (C1504) super.clone();
            c1504.f6941 = (long[]) this.f6941.clone();
            c1504.f6943 = (Object[]) this.f6943.clone();
            return c1504;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m3279(long j, E e) {
        int i = this.f6942;
        if (i != 0 && j <= this.f6941[i - 1]) {
            m3277(j, e);
            return;
        }
        if (this.f6940 && i >= this.f6941.length) {
            m3282();
        }
        int i2 = this.f6942;
        if (i2 >= this.f6941.length) {
            int m3291 = C1506.m3291(i2 + 1);
            long[] jArr = new long[m3291];
            Object[] objArr = new Object[m3291];
            long[] jArr2 = this.f6941;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f6943;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f6941 = jArr;
            this.f6943 = objArr;
        }
        this.f6941[i2] = j;
        this.f6943[i2] = e;
        this.f6942 = i2 + 1;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public E m3280(long j) {
        return m3281(j, null);
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public E m3281(long j, E e) {
        int m3287 = C1506.m3287(this.f6941, this.f6942, j);
        if (m3287 >= 0) {
            Object[] objArr = this.f6943;
            if (objArr[m3287] != f6939) {
                return (E) objArr[m3287];
            }
        }
        return e;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final void m3282() {
        int i = this.f6942;
        long[] jArr = this.f6941;
        Object[] objArr = this.f6943;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f6939) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f6940 = false;
        this.f6942 = i2;
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public E m3283(int i) {
        if (this.f6940) {
            m3282();
        }
        return (E) this.f6943[i];
    }
}
