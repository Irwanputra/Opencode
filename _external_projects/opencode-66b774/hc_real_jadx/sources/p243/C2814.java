package p243;

import java.io.IOException;
import p131.p155.p156.p157.C2098;

/* renamed from: ぺぁあねじ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2814 implements InterfaceC2822 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2822 f10489;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ C2812 f10490;

    public C2814(C2812 c2812, InterfaceC2822 interfaceC2822) {
        this.f10490 = c2812;
        this.f10489 = interfaceC2822;
    }

    @Override // p243.InterfaceC2822, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f10490.m4899();
        try {
            try {
                this.f10489.close();
                this.f10490.m4898(true);
            } catch (IOException e) {
                C2812 c2812 = this.f10490;
                if (!c2812.m4900()) {
                    throw e;
                }
                throw c2812.mo1893(e);
            }
        } catch (Throwable th) {
            this.f10490.m4898(false);
            throw th;
        }
    }

    @Override // p243.InterfaceC2822, java.io.Flushable
    public void flush() {
        this.f10490.m4899();
        try {
            try {
                this.f10489.flush();
                this.f10490.m4898(true);
            } catch (IOException e) {
                C2812 c2812 = this.f10490;
                if (!c2812.m4900()) {
                    throw e;
                }
                throw c2812.mo1893(e);
            }
        } catch (Throwable th) {
            this.f10490.m4898(false);
            throw th;
        }
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("AsyncTimeout.sink(");
        m4207.append(this.f10489);
        m4207.append(")");
        return m4207.toString();
    }

    @Override // p243.InterfaceC2822
    /* renamed from: 〺つふすそ */
    public C2803 mo1764() {
        return this.f10490;
    }

    @Override // p243.InterfaceC2822
    /* renamed from: びぐびあび */
    public void mo1765(C2819 c2819, long j) {
        C2808.m4880(c2819.f10501, 0L, j);
        while (true) {
            long j2 = 0;
            if (j <= 0) {
                return;
            }
            C2825 c2825 = c2819.f10500;
            while (true) {
                if (j2 >= 65536) {
                    break;
                }
                j2 += c2825.f10514 - c2825.f10512;
                if (j2 >= j) {
                    j2 = j;
                    break;
                }
                c2825 = c2825.f10517;
            }
            this.f10490.m4899();
            try {
                try {
                    this.f10489.mo1765(c2819, j2);
                    j -= j2;
                    this.f10490.m4898(true);
                } catch (IOException e) {
                    C2812 c2812 = this.f10490;
                    if (!c2812.m4900()) {
                        throw e;
                    }
                    throw c2812.mo1893(e);
                }
            } catch (Throwable th) {
                this.f10490.m4898(false);
                throw th;
            }
        }
    }
}
