package p034.p080;

/* renamed from: づざかべべ.づざかべべ.ぺぁあねじ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1507<E> implements Cloneable {

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static final Object f6954 = new Object();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean f6955;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int[] f6956;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f6957;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public Object[] f6958;

    public C1507() {
        this(10);
    }

    public C1507(int i) {
        this.f6955 = false;
        if (i == 0) {
            this.f6956 = C1506.f6953;
            this.f6958 = C1506.f6952;
        } else {
            int m3290 = C1506.m3290(i);
            this.f6956 = new int[m3290];
            this.f6958 = new Object[m3290];
        }
    }

    public String toString() {
        if (m3302() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f6957 * 28);
        sb.append('{');
        for (int i = 0; i < this.f6957; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m3300(i));
            sb.append('=');
            E m3296 = m3296(i);
            if (m3296 != this) {
                sb.append(m3296);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public void m3293(int i) {
        int m3289 = C1506.m3289(this.f6956, this.f6957, i);
        if (m3289 >= 0) {
            Object[] objArr = this.f6958;
            Object obj = objArr[m3289];
            Object obj2 = f6954;
            if (obj != obj2) {
                objArr[m3289] = obj2;
                this.f6955 = true;
            }
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C1507<E> clone() {
        try {
            C1507<E> c1507 = (C1507) super.clone();
            c1507.f6956 = (int[]) this.f6956.clone();
            c1507.f6958 = (Object[]) this.f6958.clone();
            return c1507;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public void m3295(int i, E e) {
        int m3289 = C1506.m3289(this.f6956, this.f6957, i);
        if (m3289 >= 0) {
            this.f6958[m3289] = e;
            return;
        }
        int i2 = m3289 ^ (-1);
        int i3 = this.f6957;
        if (i2 < i3) {
            Object[] objArr = this.f6958;
            if (objArr[i2] == f6954) {
                this.f6956[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f6955 && i3 >= this.f6956.length) {
            m3297();
            i2 = C1506.m3289(this.f6956, this.f6957, i) ^ (-1);
        }
        int i4 = this.f6957;
        if (i4 >= this.f6956.length) {
            int m3290 = C1506.m3290(i4 + 1);
            int[] iArr = new int[m3290];
            Object[] objArr2 = new Object[m3290];
            int[] iArr2 = this.f6956;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f6958;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f6956 = iArr;
            this.f6958 = objArr2;
        }
        int i5 = this.f6957;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.f6956;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.f6958;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f6957 - i2);
        }
        this.f6956[i2] = i;
        this.f6958[i2] = e;
        this.f6957++;
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public E m3296(int i) {
        if (this.f6955) {
            m3297();
        }
        return (E) this.f6958[i];
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final void m3297() {
        int i = this.f6957;
        int[] iArr = this.f6956;
        Object[] objArr = this.f6958;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f6954) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f6955 = false;
        this.f6957 = i2;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m3298(int i, E e) {
        int i2 = this.f6957;
        if (i2 != 0 && i <= this.f6956[i2 - 1]) {
            m3295(i, e);
            return;
        }
        if (this.f6955 && i2 >= this.f6956.length) {
            m3297();
        }
        int i3 = this.f6957;
        if (i3 >= this.f6956.length) {
            int m3290 = C1506.m3290(i3 + 1);
            int[] iArr = new int[m3290];
            Object[] objArr = new Object[m3290];
            int[] iArr2 = this.f6956;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f6958;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f6956 = iArr;
            this.f6958 = objArr;
        }
        this.f6956[i3] = i;
        this.f6958[i3] = e;
        this.f6957 = i3 + 1;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public E m3299(int i, E e) {
        int m3289 = C1506.m3289(this.f6956, this.f6957, i);
        if (m3289 >= 0) {
            Object[] objArr = this.f6958;
            if (objArr[m3289] != f6954) {
                return (E) objArr[m3289];
            }
        }
        return e;
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int m3300(int i) {
        if (this.f6955) {
            m3297();
        }
        return this.f6956[i];
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public E m3301(int i) {
        return m3299(i, null);
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public int m3302() {
        if (this.f6955) {
            m3297();
        }
        return this.f6957;
    }
}
