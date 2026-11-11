package p000.p001.p008;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.List;
import p243.C2803;
import p243.C2812;
import p243.C2819;
import p243.InterfaceC2822;
import p243.InterfaceC2827;

/* renamed from: 〳ぜぞぜべっ.ぉひのべい.ぺぁあねじ.ぇぬぎばつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0663 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final C0664 f4477;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public long f4478;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean f4479;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final int f4481;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final List<C0671> f4483;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public List<C0671> f4485;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final C0654 f4486;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final C0666 f4487;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public long f4482 = 0;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final C0665 f4480 = new C0665();

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final C0665 f4488 = new C0665();

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public EnumC0653 f4484 = null;

    /* renamed from: 〳ぜぞぜべっ.ぉひのべい.ぺぁあねじ.ぇぬぎばつ$〺つふすそ, reason: contains not printable characters */
    public final class C0664 implements InterfaceC2827 {

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public boolean f4492;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public boolean f4493;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final long f4494;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final C2819 f4489 = new C2819();

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final C2819 f4491 = new C2819();

        public C0664(long j) {
            this.f4494 = j;
        }

        @Override // p243.InterfaceC2827, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (C0663.this) {
                this.f4492 = true;
                this.f4491.m4921();
                C0663.this.notifyAll();
            }
            C0663.this.m1887();
        }

        @Override // p243.InterfaceC2827
        /* renamed from: 〺つふすそ */
        public C2803 mo1761() {
            return C0663.this.f4480;
        }

        @Override // p243.InterfaceC2827
        /* renamed from: ざっざへづ */
        public long mo1762(C2819 c2819, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            synchronized (C0663.this) {
                m1892();
                if (this.f4492) {
                    throw new IOException("stream closed");
                }
                if (C0663.this.f4484 != null) {
                    throw new C0674(C0663.this.f4484);
                }
                C2819 c28192 = this.f4491;
                long j2 = c28192.f10501;
                if (j2 == 0) {
                    return -1L;
                }
                long mo1762 = c28192.mo1762(c2819, Math.min(j, j2));
                C0663 c0663 = C0663.this;
                long j3 = c0663.f4482 + mo1762;
                c0663.f4482 = j3;
                if (j3 >= c0663.f4486.f4439.m1918() / 2) {
                    C0663 c06632 = C0663.this;
                    c06632.f4486.m1878(c06632.f4481, c06632.f4482);
                    C0663.this.f4482 = 0L;
                }
                synchronized (C0663.this.f4486) {
                    C0654 c0654 = C0663.this.f4486;
                    long j4 = c0654.f4447 + mo1762;
                    c0654.f4447 = j4;
                    if (j4 >= c0654.f4439.m1918() / 2) {
                        C0654 c06542 = C0663.this.f4486;
                        c06542.m1878(0, c06542.f4447);
                        C0663.this.f4486.f4447 = 0L;
                    }
                }
                return mo1762;
            }
        }

        /* renamed from: じぜこほぱ, reason: contains not printable characters */
        public final void m1892() {
            C0663.this.f4480.m4899();
            while (this.f4491.f10501 == 0 && !this.f4493 && !this.f4492) {
                try {
                    C0663 c0663 = C0663.this;
                    if (c0663.f4484 != null) {
                        break;
                    } else {
                        c0663.m1885();
                    }
                } finally {
                    C0663.this.f4480.m1895();
                }
            }
        }
    }

    /* renamed from: 〳ぜぞぜべっ.ぉひのべい.ぺぁあねじ.ぇぬぎばつ$くし〴〺ぅ, reason: contains not printable characters */
    public class C0665 extends C2812 {
        public C0665() {
        }

        @Override // p243.C2812
        /* renamed from: てぜきぽく, reason: contains not printable characters */
        public IOException mo1893(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // p243.C2812
        /* renamed from: のぷのちつ, reason: contains not printable characters */
        public void mo1894() {
            C0663.this.m1888(EnumC0653.CANCEL);
        }

        /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
        public void m1895() {
            if (m4900()) {
                throw mo1893(null);
            }
        }
    }

    /* renamed from: 〳ぜぞぜべっ.ぉひのべい.ぺぁあねじ.ぇぬぎばつ$げつ〴ぬぐ, reason: contains not printable characters */
    public final class C0666 implements InterfaceC2822 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final C2819 f4496 = new C2819();

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public boolean f4497;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public boolean f4499;

        public C0666() {
        }

        @Override // p243.InterfaceC2822, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (C0663.this) {
                if (this.f4497) {
                    return;
                }
                C0663 c0663 = C0663.this;
                if (!c0663.f4487.f4499) {
                    if (this.f4496.f10501 > 0) {
                        while (this.f4496.f10501 > 0) {
                            m1896(true);
                        }
                    } else {
                        c0663.f4486.m1873(c0663.f4481, true, null, 0L);
                    }
                }
                synchronized (C0663.this) {
                    this.f4497 = true;
                }
                C0663.this.f4486.f4448.flush();
                C0663.this.m1887();
            }
        }

        @Override // p243.InterfaceC2822, java.io.Flushable
        public void flush() {
            synchronized (C0663.this) {
                C0663.this.m1883();
            }
            while (this.f4496.f10501 > 0) {
                m1896(false);
                C0663.this.f4486.flush();
            }
        }

        @Override // p243.InterfaceC2822
        /* renamed from: 〺つふすそ */
        public C2803 mo1764() {
            return C0663.this.f4488;
        }

        /* renamed from: じぜこほぱ, reason: contains not printable characters */
        public final void m1896(boolean z) {
            C0663 c0663;
            long min;
            C0663 c06632;
            synchronized (C0663.this) {
                C0663.this.f4488.m4899();
                while (true) {
                    try {
                        c0663 = C0663.this;
                        if (c0663.f4478 > 0 || this.f4499 || this.f4497 || c0663.f4484 != null) {
                            break;
                        } else {
                            c0663.m1885();
                        }
                    } finally {
                    }
                }
                c0663.f4488.m1895();
                C0663.this.m1883();
                min = Math.min(C0663.this.f4478, this.f4496.f10501);
                c06632 = C0663.this;
                c06632.f4478 -= min;
            }
            c06632.f4488.m4899();
            try {
                C0663 c06633 = C0663.this;
                c06633.f4486.m1873(c06633.f4481, z && min == this.f4496.f10501, this.f4496, min);
            } finally {
            }
        }

        @Override // p243.InterfaceC2822
        /* renamed from: びぐびあび */
        public void mo1765(C2819 c2819, long j) {
            this.f4496.mo1765(c2819, j);
            while (this.f4496.f10501 >= 16384) {
                m1896(false);
            }
        }
    }

    public C0663(int i, C0654 c0654, boolean z, boolean z2, List<C0671> list) {
        if (c0654 == null) {
            throw new NullPointerException("connection == null");
        }
        if (list == null) {
            throw new NullPointerException("requestHeaders == null");
        }
        this.f4481 = i;
        this.f4486 = c0654;
        this.f4478 = c0654.f4437.m1918();
        C0664 c0664 = new C0664(c0654.f4439.m1918());
        this.f4477 = c0664;
        C0666 c0666 = new C0666();
        this.f4487 = c0666;
        c0664.f4493 = z2;
        c0666.f4499 = z;
        this.f4483 = list;
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public synchronized boolean m1882() {
        if (this.f4484 != null) {
            return false;
        }
        C0664 c0664 = this.f4477;
        if (c0664.f4493 || c0664.f4492) {
            C0666 c0666 = this.f4487;
            if (c0666.f4499 || c0666.f4497) {
                if (this.f4479) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m1883() {
        C0666 c0666 = this.f4487;
        if (c0666.f4497) {
            throw new IOException("stream closed");
        }
        if (c0666.f4499) {
            throw new IOException("stream finished");
        }
        if (this.f4484 != null) {
            throw new C0674(this.f4484);
        }
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean m1884() {
        return this.f4486.f4434 == ((this.f4481 & 1) == 1);
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public void m1885() {
        try {
            wait();
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void m1886(EnumC0653 enumC0653) {
        if (m1890(enumC0653)) {
            C0654 c0654 = this.f4486;
            c0654.f4448.m1900(this.f4481, enumC0653);
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m1887() {
        boolean z;
        boolean m1882;
        synchronized (this) {
            C0664 c0664 = this.f4477;
            if (!c0664.f4493 && c0664.f4492) {
                C0666 c0666 = this.f4487;
                if (c0666.f4499 || c0666.f4497) {
                    z = true;
                    m1882 = m1882();
                }
            }
            z = false;
            m1882 = m1882();
        }
        if (z) {
            m1886(EnumC0653.CANCEL);
        } else {
            if (m1882) {
                return;
            }
            this.f4486.m1877(this.f4481);
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public void m1888(EnumC0653 enumC0653) {
        if (m1890(enumC0653)) {
            this.f4486.m1874(this.f4481, enumC0653);
        }
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public InterfaceC2822 m1889() {
        synchronized (this) {
            if (!this.f4479 && !m1884()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f4487;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final boolean m1890(EnumC0653 enumC0653) {
        synchronized (this) {
            if (this.f4484 != null) {
                return false;
            }
            if (this.f4477.f4493 && this.f4487.f4499) {
                return false;
            }
            this.f4484 = enumC0653;
            notifyAll();
            this.f4486.m1877(this.f4481);
            return true;
        }
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public void m1891() {
        boolean m1882;
        synchronized (this) {
            this.f4477.f4493 = true;
            m1882 = m1882();
            notifyAll();
        }
        if (m1882) {
            return;
        }
        this.f4486.m1877(this.f4481);
    }
}
