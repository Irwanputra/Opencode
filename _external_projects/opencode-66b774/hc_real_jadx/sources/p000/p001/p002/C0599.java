package p000.p001.p002;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import p000.AbstractC0592;
import p000.C0595;
import p000.C0597;
import p000.C0698;
import p000.C0706;
import p000.C0712;
import p000.p001.AbstractC0631;
import p000.p001.C0629;
import p000.p001.p003.C0611;
import p000.p001.p003.C0614;
import p000.p001.p003.C0618;
import p000.p001.p003.InterfaceC0612;
import p000.p001.p007.C0643;
import p000.p001.p007.C0645;
import p034.p095.C1687;
import p131.p155.p156.p157.C2098;
import p243.C2803;
import p243.C2810;
import p243.C2817;
import p243.C2819;
import p243.C2830;
import p243.InterfaceC2805;
import p243.InterfaceC2822;
import p243.InterfaceC2823;
import p243.InterfaceC2827;

/* renamed from: 〳ぜぞぜべっ.ぉひのべい.〳ぜぞぜべっ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0599 implements InterfaceC0612 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C0643 f4259;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final InterfaceC2805 f4260;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final C0706 f4261;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f4262 = 0;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public long f4263 = 262144;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final InterfaceC2823 f4264;

    /* renamed from: 〳ぜぞぜべっ.ぉひのべい.〳ぜぞぜべっ.げつ〴ぬぐ$〺つふすそ, reason: contains not printable characters */
    public abstract class AbstractC0600 implements InterfaceC2827 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final C2830 f4265;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public boolean f4266;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public long f4268 = 0;

        public AbstractC0600(C0603 c0603) {
            this.f4265 = new C2830(C0599.this.f4260.mo1761());
        }

        @Override // p243.InterfaceC2827
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public C2803 mo1761() {
            return this.f4265;
        }

        @Override // p243.InterfaceC2827
        /* renamed from: ざっざへづ, reason: contains not printable characters */
        public long mo1762(C2819 c2819, long j) {
            try {
                long mo1762 = C0599.this.f4260.mo1762(c2819, j);
                if (mo1762 > 0) {
                    this.f4268 += mo1762;
                }
                return mo1762;
            } catch (IOException e) {
                m1763(false, e);
                throw e;
            }
        }

        /* renamed from: じぜこほぱ, reason: contains not printable characters */
        public final void m1763(boolean z, IOException iOException) {
            C0599 c0599 = C0599.this;
            int i = c0599.f4262;
            if (i == 6) {
                return;
            }
            if (i != 5) {
                StringBuilder m4207 = C2098.m4207("state: ");
                m4207.append(C0599.this.f4262);
                throw new IllegalStateException(m4207.toString());
            }
            c0599.m1752(this.f4265);
            C0599 c05992 = C0599.this;
            c05992.f4262 = 6;
            C0643 c0643 = c05992.f4259;
            if (c0643 != null) {
                c0643.m1855(!z, c05992, this.f4268, iOException);
            }
        }
    }

    /* renamed from: 〳ぜぞぜべっ.ぉひのべい.〳ぜぞぜべっ.げつ〴ぬぐ$ぁごぐすすぃ, reason: contains not printable characters */
    public class C0601 extends AbstractC0600 {

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public boolean f4269;

        public C0601(C0599 c0599) {
            super(null);
        }

        @Override // p243.InterfaceC2827, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f4266) {
                return;
            }
            if (!this.f4269) {
                m1763(false, null);
            }
            this.f4266 = true;
        }

        @Override // p000.p001.p002.C0599.AbstractC0600, p243.InterfaceC2827
        /* renamed from: ざっざへづ */
        public long mo1762(C2819 c2819, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            if (this.f4266) {
                throw new IllegalStateException("closed");
            }
            if (this.f4269) {
                return -1L;
            }
            long mo1762 = super.mo1762(c2819, j);
            if (mo1762 != -1) {
                return mo1762;
            }
            this.f4269 = true;
            m1763(true, null);
            return -1L;
        }
    }

    /* renamed from: 〳ぜぞぜべっ.ぉひのべい.〳ぜぞぜべっ.げつ〴ぬぐ$くし〴〺ぅ, reason: contains not printable characters */
    public final class C0602 implements InterfaceC2822 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final C2830 f4270;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public boolean f4271;

        public C0602() {
            this.f4270 = new C2830(C0599.this.f4264.mo1764());
        }

        @Override // p243.InterfaceC2822, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f4271) {
                return;
            }
            this.f4271 = true;
            C0599.this.f4264.mo4885("0\r\n\r\n");
            C0599.this.m1752(this.f4270);
            C0599.this.f4262 = 3;
        }

        @Override // p243.InterfaceC2822, java.io.Flushable
        public synchronized void flush() {
            if (this.f4271) {
                return;
            }
            C0599.this.f4264.flush();
        }

        @Override // p243.InterfaceC2822
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public C2803 mo1764() {
            return this.f4270;
        }

        @Override // p243.InterfaceC2822
        /* renamed from: びぐびあび, reason: contains not printable characters */
        public void mo1765(C2819 c2819, long j) {
            if (this.f4271) {
                throw new IllegalStateException("closed");
            }
            if (j == 0) {
                return;
            }
            C0599.this.f4264.mo4891(j);
            C0599.this.f4264.mo4885("\r\n");
            C0599.this.f4264.mo1765(c2819, j);
            C0599.this.f4264.mo4885("\r\n");
        }
    }

    /* renamed from: 〳ぜぞぜべっ.ぉひのべい.〳ぜぞぜべっ.げつ〴ぬぐ$づざかべべ, reason: contains not printable characters */
    public final class C0604 implements InterfaceC2822 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final C2830 f4273;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public boolean f4274;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public long f4276;

        public C0604(long j) {
            this.f4273 = new C2830(C0599.this.f4264.mo1764());
            this.f4276 = j;
        }

        @Override // p243.InterfaceC2822, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f4274) {
                return;
            }
            this.f4274 = true;
            if (this.f4276 > 0) {
                throw new ProtocolException("unexpected end of stream");
            }
            C0599.this.m1752(this.f4273);
            C0599.this.f4262 = 3;
        }

        @Override // p243.InterfaceC2822, java.io.Flushable
        public void flush() {
            if (this.f4274) {
                return;
            }
            C0599.this.f4264.flush();
        }

        @Override // p243.InterfaceC2822
        /* renamed from: 〺つふすそ */
        public C2803 mo1764() {
            return this.f4273;
        }

        @Override // p243.InterfaceC2822
        /* renamed from: びぐびあび */
        public void mo1765(C2819 c2819, long j) {
            if (this.f4274) {
                throw new IllegalStateException("closed");
            }
            C0629.m1822(c2819.f10501, 0L, j);
            if (j <= this.f4276) {
                C0599.this.f4264.mo1765(c2819, j);
                this.f4276 -= j;
            } else {
                StringBuilder m4207 = C2098.m4207("expected ");
                m4207.append(this.f4276);
                m4207.append(" bytes but received ");
                m4207.append(j);
                throw new ProtocolException(m4207.toString());
            }
        }
    }

    /* renamed from: 〳ぜぞぜべっ.ぉひのべい.〳ぜぞぜべっ.げつ〴ぬぐ$なぎぱいぢぎ, reason: contains not printable characters */
    public class C0605 extends AbstractC0600 {

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public long f4277;

        public C0605(C0599 c0599, long j) {
            super(null);
            this.f4277 = j;
            if (j == 0) {
                m1763(true, null);
            }
        }

        @Override // p243.InterfaceC2827, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f4266) {
                return;
            }
            if (this.f4277 != 0 && !C0629.m1826(this, 100, TimeUnit.MILLISECONDS)) {
                m1763(false, null);
            }
            this.f4266 = true;
        }

        @Override // p000.p001.p002.C0599.AbstractC0600, p243.InterfaceC2827
        /* renamed from: ざっざへづ */
        public long mo1762(C2819 c2819, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            if (this.f4266) {
                throw new IllegalStateException("closed");
            }
            long j2 = this.f4277;
            if (j2 == 0) {
                return -1L;
            }
            long mo1762 = super.mo1762(c2819, Math.min(j2, j));
            if (mo1762 == -1) {
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                m1763(false, protocolException);
                throw protocolException;
            }
            long j3 = this.f4277 - mo1762;
            this.f4277 = j3;
            if (j3 == 0) {
                m1763(true, null);
            }
            return mo1762;
        }
    }

    /* renamed from: 〳ぜぞぜべっ.ぉひのべい.〳ぜぞぜべっ.げつ〴ぬぐ$びぐびあび, reason: contains not printable characters */
    public class C0606 extends AbstractC0600 {

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public boolean f4278;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public long f4279;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public final C0698 f4280;

        public C0606(C0698 c0698) {
            super(null);
            this.f4279 = -1L;
            this.f4278 = true;
            this.f4280 = c0698;
        }

        @Override // p243.InterfaceC2827, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f4266) {
                return;
            }
            if (this.f4278 && !C0629.m1826(this, 100, TimeUnit.MILLISECONDS)) {
                m1763(false, null);
            }
            this.f4266 = true;
        }

        @Override // p000.p001.p002.C0599.AbstractC0600, p243.InterfaceC2827
        /* renamed from: ざっざへづ */
        public long mo1762(C2819 c2819, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            if (this.f4266) {
                throw new IllegalStateException("closed");
            }
            if (!this.f4278) {
                return -1L;
            }
            long j2 = this.f4279;
            if (j2 == 0 || j2 == -1) {
                if (j2 != -1) {
                    C0599.this.f4260.mo4879();
                }
                try {
                    this.f4279 = C0599.this.f4260.mo4873();
                    String trim = C0599.this.f4260.mo4879().trim();
                    if (this.f4279 < 0 || !(trim.isEmpty() || trim.startsWith(";"))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f4279 + trim + "\"");
                    }
                    if (this.f4279 == 0) {
                        this.f4278 = false;
                        C0599 c0599 = C0599.this;
                        C0614.m1775(c0599.f4261.f4679, this.f4280, c0599.m1753());
                        m1763(true, null);
                    }
                    if (!this.f4278) {
                        return -1L;
                    }
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            long mo1762 = super.mo1762(c2819, Math.min(j, this.f4279));
            if (mo1762 != -1) {
                this.f4279 -= mo1762;
                return mo1762;
            }
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m1763(false, protocolException);
            throw protocolException;
        }
    }

    public C0599(C0706 c0706, C0643 c0643, InterfaceC2805 interfaceC2805, InterfaceC2823 interfaceC2823) {
        this.f4261 = c0706;
        this.f4259 = c0643;
        this.f4260 = interfaceC2805;
        this.f4264 = interfaceC2823;
    }

    @Override // p000.p001.p003.InterfaceC0612
    public void cancel() {
        C0645 m1848 = this.f4259.m1848();
        if (m1848 != null) {
            C0629.m1819(m1848.f4396);
        }
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public InterfaceC2827 m1750(long j) {
        if (this.f4262 == 4) {
            this.f4262 = 5;
            return new C0605(this, j);
        }
        StringBuilder m4207 = C2098.m4207("state: ");
        m4207.append(this.f4262);
        throw new IllegalStateException(m4207.toString());
    }

    @Override // p000.p001.p003.InterfaceC0612
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void mo1751(C0595 c0595) {
        Proxy.Type type = this.f4259.m1848().f4391.f4666.type();
        StringBuilder sb = new StringBuilder();
        sb.append(c0595.f4246);
        sb.append(' ');
        if (!c0595.f4248.f4647.equals("https") && type == Proxy.Type.HTTP) {
            sb.append(c0595.f4248);
        } else {
            sb.append(C1687.m3727(c0595.f4248));
        }
        sb.append(" HTTP/1.1");
        m1760(c0595.f4247, sb.toString());
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public void m1752(C2830 c2830) {
        C2803 c2803 = c2830.f10523;
        c2830.f10523 = C2803.f10470;
        c2803.mo4859();
        c2803.mo4856();
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public C0597 m1753() {
        C0597.C0598 c0598 = new C0597.C0598();
        while (true) {
            String m1759 = m1759();
            if (m1759.length() == 0) {
                return new C0597(c0598);
            }
            ((C0706.C0708) AbstractC0631.f4356).getClass();
            int indexOf = m1759.indexOf(":", 1);
            if (indexOf != -1) {
                c0598.m1746(m1759.substring(0, indexOf), m1759.substring(indexOf + 1));
            } else {
                if (m1759.startsWith(":")) {
                    m1759 = m1759.substring(1);
                }
                c0598.f4258.add("");
                c0598.f4258.add(m1759.trim());
            }
        }
    }

    @Override // p000.p001.p003.InterfaceC0612
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public AbstractC0592 mo1754(C0712 c0712) {
        this.f4259.f4379.getClass();
        String m1743 = c0712.f4754.m1743("Content-Type");
        if (m1743 == null) {
            m1743 = null;
        }
        if (!C0614.m1771(c0712)) {
            InterfaceC2827 m1750 = m1750(0L);
            Logger logger = C2810.f10480;
            return new C0611(m1743, 0L, new C2817(m1750));
        }
        String m17432 = c0712.f4754.m1743("Transfer-Encoding");
        if ("chunked".equalsIgnoreCase(m17432 != null ? m17432 : null)) {
            C0698 c0698 = c0712.f4753.f4248;
            if (this.f4262 != 4) {
                StringBuilder m4207 = C2098.m4207("state: ");
                m4207.append(this.f4262);
                throw new IllegalStateException(m4207.toString());
            }
            this.f4262 = 5;
            C0606 c0606 = new C0606(c0698);
            Logger logger2 = C2810.f10480;
            return new C0611(m1743, -1L, new C2817(c0606));
        }
        long m1773 = C0614.m1773(c0712);
        if (m1773 != -1) {
            InterfaceC2827 m17502 = m1750(m1773);
            Logger logger3 = C2810.f10480;
            return new C0611(m1743, m1773, new C2817(m17502));
        }
        if (this.f4262 != 4) {
            StringBuilder m42072 = C2098.m4207("state: ");
            m42072.append(this.f4262);
            throw new IllegalStateException(m42072.toString());
        }
        C0643 c0643 = this.f4259;
        if (c0643 == null) {
            throw new IllegalStateException("streamAllocation == null");
        }
        this.f4262 = 5;
        c0643.m1853();
        C0601 c0601 = new C0601(this);
        Logger logger4 = C2810.f10480;
        return new C0611(m1743, -1L, new C2817(c0601));
    }

    @Override // p000.p001.p003.InterfaceC0612
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void mo1755() {
        this.f4264.flush();
    }

    @Override // p000.p001.p003.InterfaceC0612
    /* renamed from: づざかべべ, reason: contains not printable characters */
    public InterfaceC2822 mo1756(C0595 c0595, long j) {
        if ("chunked".equalsIgnoreCase(c0595.f4247.m1743("Transfer-Encoding"))) {
            if (this.f4262 == 1) {
                this.f4262 = 2;
                return new C0602();
            }
            StringBuilder m4207 = C2098.m4207("state: ");
            m4207.append(this.f4262);
            throw new IllegalStateException(m4207.toString());
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f4262 == 1) {
            this.f4262 = 2;
            return new C0604(j);
        }
        StringBuilder m42072 = C2098.m4207("state: ");
        m42072.append(this.f4262);
        throw new IllegalStateException(m42072.toString());
    }

    @Override // p000.p001.p003.InterfaceC0612
    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public C0712.C0713 mo1757(boolean z) {
        int i = this.f4262;
        if (i != 1 && i != 3) {
            StringBuilder m4207 = C2098.m4207("state: ");
            m4207.append(this.f4262);
            throw new IllegalStateException(m4207.toString());
        }
        try {
            C0618 m1779 = C0618.m1779(m1759());
            C0712.C0713 c0713 = new C0712.C0713();
            c0713.f4766 = m1779.f4311;
            c0713.f4769 = m1779.f4309;
            c0713.f4774 = m1779.f4310;
            c0713.m1977(m1753());
            if (z && m1779.f4309 == 100) {
                return null;
            }
            if (m1779.f4309 == 100) {
                this.f4262 = 3;
                return c0713;
            }
            this.f4262 = 4;
            return c0713;
        } catch (EOFException e) {
            StringBuilder m42072 = C2098.m4207("unexpected end of stream on ");
            m42072.append(this.f4259);
            IOException iOException = new IOException(m42072.toString());
            iOException.initCause(e);
            throw iOException;
        }
    }

    @Override // p000.p001.p003.InterfaceC0612
    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void mo1758() {
        this.f4264.flush();
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final String m1759() {
        String mo4870 = this.f4260.mo4870(this.f4263);
        this.f4263 -= mo4870.length();
        return mo4870;
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public void m1760(C0597 c0597, String str) {
        if (this.f4262 != 0) {
            StringBuilder m4207 = C2098.m4207("state: ");
            m4207.append(this.f4262);
            throw new IllegalStateException(m4207.toString());
        }
        this.f4264.mo4885(str).mo4885("\r\n");
        int m1744 = c0597.m1744();
        for (int i = 0; i < m1744; i++) {
            this.f4264.mo4885(c0597.m1741(i)).mo4885(": ").mo4885(c0597.m1745(i)).mo4885("\r\n");
        }
        this.f4264.mo4885("\r\n");
        this.f4262 = 1;
    }
}
