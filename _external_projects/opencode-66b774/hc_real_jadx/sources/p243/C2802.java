package p243;

import java.io.IOException;
import p131.p155.p156.p157.C2098;

/* renamed from: ぺぁあねじ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2802 implements InterfaceC2827 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2827 f10468;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ C2812 f10469;

    public C2802(C2812 c2812, InterfaceC2827 interfaceC2827) {
        this.f10469 = c2812;
        this.f10468 = interfaceC2827;
    }

    @Override // p243.InterfaceC2827, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            try {
                this.f10468.close();
                this.f10469.m4898(true);
            } catch (IOException e) {
                C2812 c2812 = this.f10469;
                if (!c2812.m4900()) {
                    throw e;
                }
                throw c2812.mo1893(e);
            }
        } catch (Throwable th) {
            this.f10469.m4898(false);
            throw th;
        }
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("AsyncTimeout.source(");
        m4207.append(this.f10468);
        m4207.append(")");
        return m4207.toString();
    }

    @Override // p243.InterfaceC2827
    /* renamed from: 〺つふすそ */
    public C2803 mo1761() {
        return this.f10469;
    }

    @Override // p243.InterfaceC2827
    /* renamed from: ざっざへづ */
    public long mo1762(C2819 c2819, long j) {
        this.f10469.m4899();
        try {
            try {
                long mo1762 = this.f10468.mo1762(c2819, j);
                this.f10469.m4898(true);
                return mo1762;
            } catch (IOException e) {
                C2812 c2812 = this.f10469;
                if (c2812.m4900()) {
                    throw c2812.mo1893(e);
                }
                throw e;
            }
        } catch (Throwable th) {
            this.f10469.m4898(false);
            throw th;
        }
    }
}
