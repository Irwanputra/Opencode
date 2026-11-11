package p243;

/* renamed from: ぺぁあねじ.いいにぽつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC2806 implements InterfaceC2827 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final InterfaceC2827 f10474;

    public AbstractC2806(InterfaceC2827 interfaceC2827) {
        if (interfaceC2827 == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f10474 = interfaceC2827;
    }

    @Override // p243.InterfaceC2827, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f10474.close();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f10474.toString() + ")";
    }

    @Override // p243.InterfaceC2827
    /* renamed from: 〺つふすそ */
    public C2803 mo1761() {
        return this.f10474.mo1761();
    }
}
