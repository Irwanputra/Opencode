package p034.p035.p042;

/* JADX WARN: Unexpected interfaces in signature: [づざかべべ.〳ぜぞぜべっ.てぜきぽく.くし〴〺ぅ<T>] */
/* renamed from: づざかべべ.〳ぜぞぜべっ.てぜきぽく.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1053<T> {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f5500;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Object[] f5501;

    public C1053(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f5501 = new Object[i];
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean mo2385(T t) {
        int i;
        boolean z;
        int i2 = 0;
        while (true) {
            i = this.f5500;
            if (i2 >= i) {
                z = false;
                break;
            }
            if (this.f5501[i2] == t) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            throw new IllegalStateException("Already in the pool!");
        }
        Object[] objArr = this.f5501;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f5500 = i + 1;
        return true;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public T mo2386() {
        int i = this.f5500;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f5501;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f5500 = i - 1;
        return t;
    }
}
