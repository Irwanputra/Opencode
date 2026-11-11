package p131.p161.p162.p193.p205;

import java.lang.ref.WeakReference;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.びぐびあび.のぷのちつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractBinderC2515 extends AbstractBinderC2519 {

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static final WeakReference<byte[]> f9856 = new WeakReference<>(null);

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public WeakReference<byte[]> f9857;

    public AbstractBinderC2515(byte[] bArr) {
        super(bArr);
        this.f9857 = f9856;
    }

    @Override // p131.p161.p162.p193.p205.AbstractBinderC2519
    /* renamed from: 〺つふすそ */
    public final byte[] mo4526() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f9857.get();
            if (bArr == null) {
                bArr = mo4507();
                this.f9857 = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    /* renamed from: ぇ〳〲〺すっ */
    public abstract byte[] mo4507();
}
