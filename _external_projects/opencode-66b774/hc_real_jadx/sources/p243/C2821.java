package p243;

import java.io.EOFException;
import java.io.IOException;
import java.util.logging.Logger;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* renamed from: ぺぁあねじ.てぜきぽく, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2821 implements InterfaceC2827 {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final InterfaceC2805 f10504;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final C2824 f10505;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final Inflater f10507;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f10503 = 0;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final CRC32 f10506 = new CRC32();

    public C2821(InterfaceC2827 interfaceC2827) {
        if (interfaceC2827 == null) {
            throw new IllegalArgumentException("source == null");
        }
        Inflater inflater = new Inflater(true);
        this.f10507 = inflater;
        Logger logger = C2810.f10480;
        C2817 c2817 = new C2817(interfaceC2827);
        this.f10504 = c2817;
        this.f10505 = new C2824(c2817, inflater);
    }

    @Override // p243.InterfaceC2827, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f10505.close();
    }

    @Override // p243.InterfaceC2827
    /* renamed from: 〺つふすそ */
    public C2803 mo1761() {
        return this.f10504.mo1761();
    }

    @Override // p243.InterfaceC2827
    /* renamed from: ざっざへづ */
    public long mo1762(C2819 c2819, long j) {
        long j2;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (j == 0) {
            return 0L;
        }
        if (this.f10503 == 0) {
            this.f10504.mo4863(10L);
            byte m4913 = this.f10504.mo4868().m4913(3L);
            boolean z = ((m4913 >> 1) & 1) == 1;
            if (z) {
                m4932(this.f10504.mo4868(), 0L, 10L);
            }
            m4931("ID1ID2", 8075, this.f10504.mo4877());
            this.f10504.mo4864(8L);
            if (((m4913 >> 2) & 1) == 1) {
                this.f10504.mo4863(2L);
                if (z) {
                    m4932(this.f10504.mo4868(), 0L, 2L);
                }
                long mo4875 = this.f10504.mo4868().mo4875();
                this.f10504.mo4863(mo4875);
                if (z) {
                    j2 = mo4875;
                    m4932(this.f10504.mo4868(), 0L, mo4875);
                } else {
                    j2 = mo4875;
                }
                this.f10504.mo4864(j2);
            }
            if (((m4913 >> 3) & 1) == 1) {
                long mo4876 = this.f10504.mo4876((byte) 0);
                if (mo4876 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    m4932(this.f10504.mo4868(), 0L, mo4876 + 1);
                }
                this.f10504.mo4864(mo4876 + 1);
            }
            if (((m4913 >> 4) & 1) == 1) {
                long mo48762 = this.f10504.mo4876((byte) 0);
                if (mo48762 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    m4932(this.f10504.mo4868(), 0L, mo48762 + 1);
                }
                this.f10504.mo4864(mo48762 + 1);
            }
            if (z) {
                m4931("FHCRC", this.f10504.mo4875(), (short) this.f10506.getValue());
                this.f10506.reset();
            }
            this.f10503 = 1;
        }
        if (this.f10503 == 1) {
            long j3 = c2819.f10501;
            long mo1762 = this.f10505.mo1762(c2819, j);
            if (mo1762 != -1) {
                m4932(c2819, j3, mo1762);
                return mo1762;
            }
            this.f10503 = 2;
        }
        if (this.f10503 == 2) {
            m4931("CRC", this.f10504.mo4869(), (int) this.f10506.getValue());
            m4931("ISIZE", this.f10504.mo4869(), (int) this.f10507.getBytesWritten());
            this.f10503 = 3;
            if (!this.f10504.mo4874()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public final void m4931(String str, int i, int i2) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public final void m4932(C2819 c2819, long j, long j2) {
        C2825 c2825 = c2819.f10500;
        while (true) {
            int i = c2825.f10514;
            int i2 = c2825.f10512;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            c2825 = c2825.f10517;
        }
        while (j2 > 0) {
            int min = (int) Math.min(c2825.f10514 - r7, j2);
            this.f10506.update(c2825.f10515, (int) (c2825.f10512 + j), min);
            j2 -= min;
            c2825 = c2825.f10517;
            j = 0;
        }
    }
}
