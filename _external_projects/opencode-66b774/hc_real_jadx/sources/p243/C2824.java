package p243;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: ぺぁあねじ.のぷのちつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2824 implements InterfaceC2827 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final InterfaceC2805 f10508;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final Inflater f10509;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean f10510;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f10511;

    public C2824(InterfaceC2805 interfaceC2805, Inflater inflater) {
        this.f10508 = interfaceC2805;
        this.f10509 = inflater;
    }

    @Override // p243.InterfaceC2827, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f10510) {
            return;
        }
        this.f10509.end();
        this.f10510 = true;
        this.f10508.close();
    }

    @Override // p243.InterfaceC2827
    /* renamed from: 〺つふすそ */
    public C2803 mo1761() {
        return this.f10508.mo1761();
    }

    @Override // p243.InterfaceC2827
    /* renamed from: ざっざへづ */
    public long mo1762(C2819 c2819, long j) {
        boolean z;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.f10510) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return 0L;
        }
        do {
            z = false;
            if (this.f10509.needsInput()) {
                m4933();
                if (this.f10509.getRemaining() != 0) {
                    throw new IllegalStateException("?");
                }
                if (this.f10508.mo4874()) {
                    z = true;
                } else {
                    C2825 c2825 = this.f10508.mo4868().f10500;
                    int i = c2825.f10514;
                    int i2 = c2825.f10512;
                    int i3 = i - i2;
                    this.f10511 = i3;
                    this.f10509.setInput(c2825.f10515, i2, i3);
                }
            }
            try {
                C2825 m4925 = c2819.m4925(1);
                int inflate = this.f10509.inflate(m4925.f10515, m4925.f10514, (int) Math.min(j, 8192 - m4925.f10514));
                if (inflate > 0) {
                    m4925.f10514 += inflate;
                    long j2 = inflate;
                    c2819.f10501 += j2;
                    return j2;
                }
                if (!this.f10509.finished() && !this.f10509.needsDictionary()) {
                }
                m4933();
                if (m4925.f10512 != m4925.f10514) {
                    return -1L;
                }
                c2819.f10500 = m4925.m4936();
                C2815.m4902(m4925);
                return -1L;
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        } while (!z);
        throw new EOFException("source exhausted prematurely");
    }

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public final void m4933() {
        int i = this.f10511;
        if (i == 0) {
            return;
        }
        int remaining = i - this.f10509.getRemaining();
        this.f10511 -= remaining;
        this.f10508.mo4864(remaining);
    }
}
