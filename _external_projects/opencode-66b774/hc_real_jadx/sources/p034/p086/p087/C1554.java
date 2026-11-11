package p034.p086.p087;

/* JADX WARN: Unexpected interfaces in signature: [づざかべべ.なぎぱいぢぎ.〺つふすそ.づざかべべ<T>] */
/* renamed from: づざかべべ.なぎぱいぢぎ.〺つふすそ.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1554<T> {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f7294;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Object[] f7295;

    public C1554(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f7295 = new Object[i];
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean m3472(T t) {
        int i = this.f7294;
        Object[] objArr = this.f7295;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f7294 = i + 1;
        return true;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public T m3473() {
        int i = this.f7294;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f7295;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f7294 = i - 1;
        return t;
    }
}
