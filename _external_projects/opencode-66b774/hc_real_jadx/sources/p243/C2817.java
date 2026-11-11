package p243;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p131.p155.p156.p157.C2098;

/* renamed from: ぺぁあねじ.ざとぅぼこ〺, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2817 implements InterfaceC2805 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C2819 f10495 = new C2819();

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final InterfaceC2827 f10496;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public boolean f10497;

    /* renamed from: ぺぁあねじ.ざとぅぼこ〺$げつ〴ぬぐ, reason: contains not printable characters */
    public class C2818 extends InputStream {
        public C2818() {
        }

        @Override // java.io.InputStream
        public int available() {
            C2817 c2817 = C2817.this;
            if (c2817.f10497) {
                throw new IOException("closed");
            }
            return (int) Math.min(c2817.f10495.f10501, 2147483647L);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C2817.this.close();
        }

        @Override // java.io.InputStream
        public int read() {
            C2817 c2817 = C2817.this;
            if (c2817.f10497) {
                throw new IOException("closed");
            }
            C2819 c2819 = c2817.f10495;
            if (c2819.f10501 == 0 && c2817.f10496.mo1762(c2819, 8192L) == -1) {
                return -1;
            }
            return C2817.this.f10495.mo4865() & 255;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            if (C2817.this.f10497) {
                throw new IOException("closed");
            }
            C2808.m4880(bArr.length, i, i2);
            C2817 c2817 = C2817.this;
            C2819 c2819 = c2817.f10495;
            if (c2819.f10501 == 0 && c2817.f10496.mo1762(c2819, 8192L) == -1) {
                return -1;
            }
            return C2817.this.f10495.m4928(bArr, i, i2);
        }

        public String toString() {
            return C2817.this + ".inputStream()";
        }
    }

    public C2817(InterfaceC2827 interfaceC2827) {
        if (interfaceC2827 == null) {
            throw new NullPointerException("source == null");
        }
        this.f10496 = interfaceC2827;
    }

    @Override // p243.InterfaceC2827, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f10497) {
            return;
        }
        this.f10497 = true;
        this.f10496.close();
        this.f10495.m4921();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f10497;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        C2819 c2819 = this.f10495;
        if (c2819.f10501 == 0 && this.f10496.mo1762(c2819, 8192L) == -1) {
            return -1;
        }
        return this.f10495.read(byteBuffer);
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("buffer(");
        m4207.append(this.f10496);
        m4207.append(")");
        return m4207.toString();
    }

    @Override // p243.InterfaceC2827
    /* renamed from: 〺つふすそ */
    public C2803 mo1761() {
        return this.f10496.mo1761();
    }

    @Override // p243.InterfaceC2805
    /* renamed from: 〻ぞまぎな〻 */
    public void mo4863(long j) {
        if (!m4905(j)) {
            throw new EOFException();
        }
    }

    @Override // p243.InterfaceC2805
    /* renamed from: ぁごぐすすぃ */
    public void mo4864(long j) {
        if (this.f10497) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            C2819 c2819 = this.f10495;
            if (c2819.f10501 == 0 && this.f10496.mo1762(c2819, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, this.f10495.f10501);
            this.f10495.mo4864(min);
            j -= min;
        }
    }

    @Override // p243.InterfaceC2805
    /* renamed from: ぅみぱぎぎ */
    public byte mo4865() {
        mo4863(1L);
        return this.f10495.mo4865();
    }

    @Override // p243.InterfaceC2805
    /* renamed from: ぇぬぎばつ */
    public String mo4866() {
        this.f10495.m4912(this.f10496);
        return this.f10495.mo4866();
    }

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public boolean m4905(long j) {
        C2819 c2819;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.f10497) {
            throw new IllegalStateException("closed");
        }
        do {
            c2819 = this.f10495;
            if (c2819.f10501 >= j) {
                return true;
            }
        } while (this.f10496.mo1762(c2819, 8192L) != -1);
        return false;
    }

    @Override // p243.InterfaceC2805
    /* renamed from: おぐぴう〸ず */
    public byte[] mo4867(long j) {
        if (m4905(j)) {
            return this.f10495.mo4867(j);
        }
        throw new EOFException();
    }

    @Override // p243.InterfaceC2805
    /* renamed from: げつ〴ぬぐ */
    public C2819 mo4868() {
        return this.f10495;
    }

    @Override // p243.InterfaceC2827
    /* renamed from: ざっざへづ */
    public long mo1762(C2819 c2819, long j) {
        if (c2819 == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.f10497) {
            throw new IllegalStateException("closed");
        }
        C2819 c28192 = this.f10495;
        if (c28192.f10501 == 0 && this.f10496.mo1762(c28192, 8192L) == -1) {
            return -1L;
        }
        return this.f10495.mo1762(c2819, Math.min(j, this.f10495.f10501));
    }

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public long m4906(byte b, long j, long j2) {
        if (this.f10497) {
            throw new IllegalStateException("closed");
        }
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", Long.valueOf(j), Long.valueOf(j2)));
        }
        while (j < j2) {
            long m4922 = this.f10495.m4922(b, j, j2);
            if (m4922 == -1) {
                C2819 c2819 = this.f10495;
                long j3 = c2819.f10501;
                if (j3 >= j2 || this.f10496.mo1762(c2819, 8192L) == -1) {
                    break;
                }
                j = Math.max(j, j3);
            } else {
                return m4922;
            }
        }
        return -1L;
    }

    @Override // p243.InterfaceC2805
    /* renamed from: てぜきぽく */
    public int mo4869() {
        mo4863(4L);
        return this.f10495.mo4869();
    }

    @Override // p243.InterfaceC2805
    /* renamed from: でどあくず */
    public String mo4870(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("limit < 0: " + j);
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long m4906 = m4906((byte) 10, 0L, j2);
        if (m4906 != -1) {
            return this.f10495.m4918(m4906);
        }
        if (j2 < Long.MAX_VALUE && m4905(j2) && this.f10495.m4913(j2 - 1) == 13 && m4905(1 + j2) && this.f10495.m4913(j2) == 10) {
            return this.f10495.m4918(j2);
        }
        C2819 c2819 = new C2819();
        C2819 c28192 = this.f10495;
        c28192.m4930(c2819, 0L, Math.min(32L, c28192.f10501));
        StringBuilder m4207 = C2098.m4207("\\n not found: limit=");
        m4207.append(Math.min(this.f10495.f10501, j));
        m4207.append(" content=");
        m4207.append(c2819.m4914().mo4844());
        m4207.append((char) 8230);
        throw new EOFException(m4207.toString());
    }

    @Override // p243.InterfaceC2805
    /* renamed from: どぇぞほだ */
    public InputStream mo4871() {
        return new C2818();
    }

    @Override // p243.InterfaceC2805
    /* renamed from: なぎぱいぢぎ */
    public C2801 mo4872(long j) {
        if (m4905(j)) {
            return this.f10495.mo4872(j);
        }
        throw new EOFException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if (r1 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        throw new java.lang.NumberFormatException(java.lang.String.format("Expected leading [0-9a-fA-F] character but was %#x", java.lang.Byte.valueOf(r3)));
     */
    @Override // p243.InterfaceC2805
    /* renamed from: なぶひせが */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long mo4873() {
        /*
            r6 = this;
            r0 = 1
            r6.mo4863(r0)
            r0 = 0
            r1 = 0
        L7:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.m4905(r3)
            if (r3 == 0) goto L4a
            ぺぁあねじ.づざかべべ r3 = r6.f10495
            long r4 = (long) r1
            byte r3 = r3.m4913(r4)
            r4 = 48
            if (r3 < r4) goto L1f
            r4 = 57
            if (r3 <= r4) goto L30
        L1f:
            r4 = 97
            if (r3 < r4) goto L27
            r4 = 102(0x66, float:1.43E-43)
            if (r3 <= r4) goto L30
        L27:
            r4 = 65
            if (r3 < r4) goto L32
            r4 = 70
            if (r3 <= r4) goto L30
            goto L32
        L30:
            r1 = r2
            goto L7
        L32:
            if (r1 == 0) goto L35
            goto L4a
        L35:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "Expected leading [0-9a-fA-F] character but was %#x"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L4a:
            ぺぁあねじ.づざかべべ r0 = r6.f10495
            long r0 = r0.mo4873()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p243.C2817.mo4873():long");
    }

    @Override // p243.InterfaceC2805
    /* renamed from: のぷのちつ */
    public boolean mo4874() {
        if (this.f10497) {
            throw new IllegalStateException("closed");
        }
        return this.f10495.mo4874() && this.f10496.mo1762(this.f10495, 8192L) == -1;
    }

    @Override // p243.InterfaceC2805
    /* renamed from: は〲ぱなで */
    public short mo4875() {
        mo4863(2L);
        return this.f10495.mo4875();
    }

    @Override // p243.InterfaceC2805
    /* renamed from: びえぁぜい */
    public long mo4876(byte b) {
        return m4906(b, 0L, Long.MAX_VALUE);
    }

    @Override // p243.InterfaceC2805
    /* renamed from: ぶでにく〼〳 */
    public short mo4877() {
        mo4863(2L);
        return this.f10495.mo4877();
    }

    @Override // p243.InterfaceC2805
    /* renamed from: ぺぁあねじ */
    public int mo4878() {
        mo4863(4L);
        return this.f10495.mo4878();
    }

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public void m4907(byte[] bArr) {
        try {
            mo4863(bArr.length);
            this.f10495.m4909(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                C2819 c2819 = this.f10495;
                long j = c2819.f10501;
                if (j <= 0) {
                    throw e;
                }
                int m4928 = c2819.m4928(bArr, i, (int) j);
                if (m4928 == -1) {
                    throw new AssertionError();
                }
                i += m4928;
            }
        }
    }

    @Override // p243.InterfaceC2805
    /* renamed from: ぺふねづ〺 */
    public String mo4879() {
        return mo4870(Long.MAX_VALUE);
    }
}
