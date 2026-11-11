package p243;

/* renamed from: ぺぁあねじ.ぺぁあねじ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC2829 implements InterfaceC2822 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final InterfaceC2822 f10522;

    public AbstractC2829(InterfaceC2822 interfaceC2822) {
        if (interfaceC2822 == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f10522 = interfaceC2822;
    }

    @Override // p243.InterfaceC2822, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f10522.close();
    }

    @Override // p243.InterfaceC2822, java.io.Flushable
    public void flush() {
        this.f10522.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f10522.toString() + ")";
    }

    @Override // p243.InterfaceC2822
    /* renamed from: 〺つふすそ */
    public C2803 mo1764() {
        return this.f10522.mo1764();
    }
}
