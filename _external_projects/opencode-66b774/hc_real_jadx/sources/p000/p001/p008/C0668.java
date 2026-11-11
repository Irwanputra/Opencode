package p000.p001.p008;

import androidx.core.app.NotificationCompat;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000.p001.C0629;
import p000.p001.p008.C0654;
import p000.p001.p008.C0654.C0658;
import p000.p001.p008.C0663;
import p000.p001.p008.C0684;
import p131.p155.p156.p157.C2098;
import p243.C2801;
import p243.C2803;
import p243.C2819;
import p243.InterfaceC2805;
import p243.InterfaceC2827;

/* renamed from: 〳ぜぞぜべっ.ぉひのべい.ぺぁあねじ.おぐぴう〸ず, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0668 implements Closeable {

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static final Logger f4507 = Logger.getLogger(C0677.class.getName());

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final InterfaceC2805 f4508;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final C0670 f4509;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final C0684.C0686 f4510;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final boolean f4511;

    /* renamed from: 〳ぜぞぜべっ.ぉひのべい.ぺぁあねじ.おぐぴう〸ず$〺つふすそ, reason: contains not printable characters */
    public interface InterfaceC0669 {
    }

    /* renamed from: 〳ぜぞぜべっ.ぉひのべい.ぺぁあねじ.おぐぴう〸ず$げつ〴ぬぐ, reason: contains not printable characters */
    public static final class C0670 implements InterfaceC2827 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final InterfaceC2805 f4512;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public short f4513;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int f4514;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public int f4515;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public int f4516;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public byte f4517;

        public C0670(InterfaceC2805 interfaceC2805) {
            this.f4512 = interfaceC2805;
        }

        @Override // p243.InterfaceC2827, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // p243.InterfaceC2827
        /* renamed from: 〺つふすそ */
        public C2803 mo1761() {
            return this.f4512.mo1761();
        }

        @Override // p243.InterfaceC2827
        /* renamed from: ざっざへづ */
        public long mo1762(C2819 c2819, long j) {
            int i;
            int mo4878;
            do {
                int i2 = this.f4516;
                if (i2 != 0) {
                    long mo1762 = this.f4512.mo1762(c2819, Math.min(j, i2));
                    if (mo1762 == -1) {
                        return -1L;
                    }
                    this.f4516 = (int) (this.f4516 - mo1762);
                    return mo1762;
                }
                this.f4512.mo4864(this.f4513);
                this.f4513 = (short) 0;
                if ((this.f4517 & 4) != 0) {
                    return -1L;
                }
                i = this.f4515;
                int m1906 = C0668.m1906(this.f4512);
                this.f4516 = m1906;
                this.f4514 = m1906;
                byte mo4865 = (byte) (this.f4512.mo4865() & 255);
                this.f4517 = (byte) (this.f4512.mo4865() & 255);
                Logger logger = C0668.f4507;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(C0677.m1921(true, this.f4515, this.f4514, mo4865, this.f4517));
                }
                mo4878 = this.f4512.mo4878() & Integer.MAX_VALUE;
                this.f4515 = mo4878;
                if (mo4865 != 9) {
                    C0677.m1920("%s != TYPE_CONTINUATION", Byte.valueOf(mo4865));
                    throw null;
                }
            } while (mo4878 == i);
            C0677.m1920("TYPE_CONTINUATION streamId changed", new Object[0]);
            throw null;
        }
    }

    public C0668(InterfaceC2805 interfaceC2805, boolean z) {
        this.f4508 = interfaceC2805;
        this.f4511 = z;
        C0670 c0670 = new C0670(interfaceC2805);
        this.f4509 = c0670;
        this.f4510 = new C0684.C0686(NotificationCompat.FLAG_BUBBLE, c0670);
    }

    /* renamed from: けときぜと, reason: contains not printable characters */
    public static int m1906(InterfaceC2805 interfaceC2805) {
        return (interfaceC2805.mo4865() & 255) | ((interfaceC2805.mo4865() & 255) << 16) | ((interfaceC2805.mo4865() & 255) << 8);
    }

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public static int m1907(int i, byte b, short s) {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        C0677.m1920("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f4508.close();
    }

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public final void m1908(InterfaceC0669 interfaceC0669, int i, byte b, int i2) {
        if (i2 == 0) {
            C0677.m1920("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            throw null;
        }
        short mo4865 = (b & 8) != 0 ? (short) (this.f4508.mo4865() & 255) : (short) 0;
        int mo4878 = this.f4508.mo4878() & Integer.MAX_VALUE;
        List<C0671> m1915 = m1915(m1907(i - 4, b, mo4865), mo4865, b, i2);
        C0654 c0654 = C0654.this;
        synchronized (c0654) {
            if (c0654.f4442.contains(Integer.valueOf(mo4878))) {
                c0654.m1874(mo4878, EnumC0653.PROTOCOL_ERROR);
                return;
            }
            c0654.f4442.add(Integer.valueOf(mo4878));
            try {
                c0654.f4436.execute(new C0652(c0654, "OkHttp %s Push Request[%s]", new Object[]{c0654.f4444, Integer.valueOf(mo4878)}, mo4878, m1915));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public final void m1909(InterfaceC0669 interfaceC0669, int i, int i2) {
        if (i != 4) {
            C0677.m1920("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
            throw null;
        }
        if (i2 == 0) {
            C0677.m1920("TYPE_RST_STREAM streamId == 0", new Object[0]);
            throw null;
        }
        int mo4878 = this.f4508.mo4878();
        EnumC0653 m1871 = EnumC0653.m1871(mo4878);
        if (m1871 == null) {
            C0677.m1920("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(mo4878));
            throw null;
        }
        C0654.C0659 c0659 = (C0654.C0659) interfaceC0669;
        if (C0654.this.m1880(i2)) {
            C0654 c0654 = C0654.this;
            c0654.f4436.execute(new C0689(c0654, "OkHttp %s Push Reset[%s]", new Object[]{c0654.f4444, Integer.valueOf(i2)}, i2, m1871));
            return;
        }
        C0663 m1877 = C0654.this.m1877(i2);
        if (m1877 != null) {
            synchronized (m1877) {
                if (m1877.f4484 == null) {
                    m1877.f4484 = m1871;
                    m1877.notifyAll();
                }
            }
        }
    }

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public void m1910(InterfaceC0669 interfaceC0669) {
        if (this.f4511) {
            if (m1916(true, interfaceC0669)) {
                return;
            }
            C0677.m1920("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
        InterfaceC2805 interfaceC2805 = this.f4508;
        C2801 c2801 = C0677.f4539;
        C2801 mo4872 = interfaceC2805.mo4872(c2801.mo4855());
        Logger logger = f4507;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C0629.m1820("<< CONNECTION %s", mo4872.mo4844()));
        }
        if (c2801.equals(mo4872)) {
            return;
        }
        C0677.m1920("Expected a connection header but was %s", mo4872.mo4847());
        throw null;
    }

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public final void m1911(InterfaceC0669 interfaceC0669, int i, byte b, int i2) {
        if (i != 8) {
            C0677.m1920("TYPE_PING length != 8: %s", Integer.valueOf(i));
            throw null;
        }
        if (i2 != 0) {
            C0677.m1920("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
        int mo4878 = this.f4508.mo4878();
        int mo48782 = this.f4508.mo4878();
        boolean z = (b & 1) != 0;
        C0654.C0659 c0659 = (C0654.C0659) interfaceC0669;
        c0659.getClass();
        if (!z) {
            try {
                C0654 c0654 = C0654.this;
                c0654.f4451.execute(c0654.new C0658(true, mo4878, mo48782));
            } catch (RejectedExecutionException unused) {
            }
        } else {
            synchronized (C0654.this) {
                C0654 c06542 = C0654.this;
                c06542.f4445 = false;
                c06542.notifyAll();
            }
        }
    }

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public final void m1912(InterfaceC0669 interfaceC0669, int i, byte b, int i2) {
        long j;
        C0663[] c0663Arr = null;
        if (i2 != 0) {
            C0677.m1920("TYPE_SETTINGS streamId != 0", new Object[0]);
            throw null;
        }
        if ((b & 1) != 0) {
            if (i == 0) {
                ((C0654.C0659) interfaceC0669).getClass();
                return;
            } else {
                C0677.m1920("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                throw null;
            }
        }
        if (i % 6 != 0) {
            C0677.m1920("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
            throw null;
        }
        C0673 c0673 = new C0673();
        for (int i3 = 0; i3 < i; i3 += 6) {
            int mo4877 = this.f4508.mo4877() & 65535;
            int mo4878 = this.f4508.mo4878();
            if (mo4877 != 2) {
                if (mo4877 == 3) {
                    mo4877 = 4;
                } else if (mo4877 == 4) {
                    mo4877 = 7;
                    if (mo4878 < 0) {
                        C0677.m1920("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        throw null;
                    }
                } else if (mo4877 == 5 && (mo4878 < 16384 || mo4878 > 16777215)) {
                    C0677.m1920("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(mo4878));
                    throw null;
                }
            } else if (mo4878 != 0 && mo4878 != 1) {
                C0677.m1920("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                throw null;
            }
            c0673.m1917(mo4877, mo4878);
        }
        C0654.C0659 c0659 = (C0654.C0659) interfaceC0669;
        synchronized (C0654.this) {
            int m1918 = C0654.this.f4437.m1918();
            C0673 c06732 = C0654.this.f4437;
            c06732.getClass();
            for (int i4 = 0; i4 < 10; i4++) {
                if (((1 << i4) & c0673.f4528) != 0) {
                    c06732.m1917(i4, c0673.f4527[i4]);
                }
            }
            try {
                C0654 c0654 = C0654.this;
                c0654.f4451.execute(new C0687(c0659, "OkHttp %s ACK Settings", new Object[]{c0654.f4444}, c0673));
            } catch (RejectedExecutionException unused) {
            }
            int m19182 = C0654.this.f4437.m1918();
            if (m19182 == -1 || m19182 == m1918) {
                j = 0;
            } else {
                j = m19182 - m1918;
                C0654 c06542 = C0654.this;
                if (!c06542.f4438) {
                    c06542.f4450 += j;
                    if (j > 0) {
                        c06542.notifyAll();
                    }
                    C0654.this.f4438 = true;
                }
                if (!C0654.this.f4449.isEmpty()) {
                    c0663Arr = (C0663[]) C0654.this.f4449.values().toArray(new C0663[C0654.this.f4449.size()]);
                }
            }
            C0654.f4432.execute(new C0681(c0659, "OkHttp %s settings", C0654.this.f4444));
        }
        if (c0663Arr == null || j == 0) {
            return;
        }
        for (C0663 c0663 : c0663Arr) {
            synchronized (c0663) {
                c0663.f4478 += j;
                if (j > 0) {
                    c0663.notifyAll();
                }
            }
        }
    }

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public final void m1913(InterfaceC0669 interfaceC0669, int i, int i2) {
        C0663[] c0663Arr;
        if (i < 8) {
            C0677.m1920("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
            throw null;
        }
        if (i2 != 0) {
            C0677.m1920("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
        int mo4878 = this.f4508.mo4878();
        int mo48782 = this.f4508.mo4878();
        int i3 = i - 8;
        if (EnumC0653.m1871(mo48782) == null) {
            C0677.m1920("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(mo48782));
            throw null;
        }
        C2801 c2801 = C2801.f10464;
        if (i3 > 0) {
            c2801 = this.f4508.mo4872(i3);
        }
        C0654.C0659 c0659 = (C0654.C0659) interfaceC0669;
        c0659.getClass();
        c2801.mo4855();
        synchronized (C0654.this) {
            c0663Arr = (C0663[]) C0654.this.f4449.values().toArray(new C0663[C0654.this.f4449.size()]);
            C0654.this.f4433 = true;
        }
        for (C0663 c0663 : c0663Arr) {
            if (c0663.f4481 > mo4878 && c0663.m1884()) {
                EnumC0653 enumC0653 = EnumC0653.REFUSED_STREAM;
                synchronized (c0663) {
                    if (c0663.f4484 == null) {
                        c0663.f4484 = enumC0653;
                        c0663.notifyAll();
                    }
                }
                C0654.this.m1877(c0663.f4481);
            }
        }
    }

    /* renamed from: ながふずは, reason: contains not printable characters */
    public final void m1914(InterfaceC0669 interfaceC0669, int i, int i2) {
        if (i != 4) {
            C0677.m1920("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
            throw null;
        }
        long mo4878 = this.f4508.mo4878() & 2147483647L;
        if (mo4878 == 0) {
            C0677.m1920("windowSizeIncrement was 0", Long.valueOf(mo4878));
            throw null;
        }
        C0654.C0659 c0659 = (C0654.C0659) interfaceC0669;
        C0654 c0654 = C0654.this;
        if (i2 == 0) {
            synchronized (c0654) {
                C0654 c06542 = C0654.this;
                c06542.f4450 += mo4878;
                c06542.notifyAll();
            }
            return;
        }
        C0663 m1875 = c0654.m1875(i2);
        if (m1875 != null) {
            synchronized (m1875) {
                m1875.f4478 += mo4878;
                if (mo4878 > 0) {
                    m1875.notifyAll();
                }
            }
        }
    }

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public final List<C0671> m1915(int i, short s, byte b, int i2) {
        C0670 c0670 = this.f4509;
        c0670.f4516 = i;
        c0670.f4514 = i;
        c0670.f4513 = s;
        c0670.f4517 = b;
        c0670.f4515 = i2;
        C0684.C0686 c0686 = this.f4510;
        while (!c0686.f4573.mo4874()) {
            int mo4865 = c0686.f4573.mo4865() & 255;
            if (mo4865 == 128) {
                throw new IOException("index == 0");
            }
            if ((mo4865 & NotificationCompat.FLAG_HIGH_PRIORITY) == 128) {
                int m1931 = c0686.m1931(mo4865, 127) - 1;
                if (!(m1931 >= 0 && m1931 <= C0684.f4563.length + (-1))) {
                    int m1930 = c0686.m1930(m1931 - C0684.f4563.length);
                    if (m1930 >= 0) {
                        C0671[] c0671Arr = c0686.f4577;
                        if (m1930 < c0671Arr.length) {
                            c0686.f4576.add(c0671Arr[m1930]);
                        }
                    }
                    StringBuilder m4207 = C2098.m4207("Header index too large ");
                    m4207.append(m1931 + 1);
                    throw new IOException(m4207.toString());
                }
                c0686.f4576.add(C0684.f4563[m1931]);
            } else if (mo4865 == 64) {
                C2801 m1935 = c0686.m1935();
                C0684.m1923(m1935);
                c0686.m1934(-1, new C0671(m1935, c0686.m1935()));
            } else if ((mo4865 & 64) == 64) {
                c0686.m1934(-1, new C0671(c0686.m1936(c0686.m1931(mo4865, 63) - 1), c0686.m1935()));
            } else if ((mo4865 & 32) == 32) {
                int m19312 = c0686.m1931(mo4865, 31);
                c0686.f4579 = m19312;
                if (m19312 < 0 || m19312 > c0686.f4575) {
                    StringBuilder m42072 = C2098.m4207("Invalid dynamic table size update ");
                    m42072.append(c0686.f4579);
                    throw new IOException(m42072.toString());
                }
                int i3 = c0686.f4572;
                if (m19312 < i3) {
                    if (m19312 == 0) {
                        c0686.m1933();
                    } else {
                        c0686.m1932(i3 - m19312);
                    }
                }
            } else if (mo4865 == 16 || mo4865 == 0) {
                C2801 m19352 = c0686.m1935();
                C0684.m1923(m19352);
                c0686.f4576.add(new C0671(m19352, c0686.m1935()));
            } else {
                c0686.f4576.add(new C0671(c0686.m1936(c0686.m1931(mo4865, 15) - 1), c0686.m1935()));
            }
        }
        C0684.C0686 c06862 = this.f4510;
        c06862.getClass();
        ArrayList arrayList = new ArrayList(c06862.f4576);
        c06862.f4576.clear();
        return arrayList;
    }

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public boolean m1916(boolean z, InterfaceC0669 interfaceC0669) {
        boolean z2;
        boolean z3;
        boolean z4;
        try {
            this.f4508.mo4863(9L);
            int m1906 = m1906(this.f4508);
            if (m1906 < 0 || m1906 > 16384) {
                C0677.m1920("FRAME_SIZE_ERROR: %s", Integer.valueOf(m1906));
                throw null;
            }
            byte mo4865 = (byte) (this.f4508.mo4865() & 255);
            if (z && mo4865 != 4) {
                C0677.m1920("Expected a SETTINGS frame but was %s", Byte.valueOf(mo4865));
                throw null;
            }
            byte mo48652 = (byte) (this.f4508.mo4865() & 255);
            int mo4878 = this.f4508.mo4878() & Integer.MAX_VALUE;
            Logger logger = f4507;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C0677.m1921(true, mo4878, m1906, mo4865, mo48652));
            }
            switch (mo4865) {
                case 0:
                    if (mo4878 == 0) {
                        C0677.m1920("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
                        throw null;
                    }
                    boolean z5 = (mo48652 & 1) != 0;
                    if ((mo48652 & 32) != 0) {
                        C0677.m1920("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                        throw null;
                    }
                    short mo48653 = (mo48652 & 8) != 0 ? (short) (this.f4508.mo4865() & 255) : (short) 0;
                    int m1907 = m1907(m1906, mo48652, mo48653);
                    InterfaceC2805 interfaceC2805 = this.f4508;
                    C0654.C0659 c0659 = (C0654.C0659) interfaceC0669;
                    if (C0654.this.m1880(mo4878)) {
                        C0654 c0654 = C0654.this;
                        c0654.getClass();
                        C2819 c2819 = new C2819();
                        long j = m1907;
                        interfaceC2805.mo4863(j);
                        interfaceC2805.mo1762(c2819, j);
                        if (c2819.f10501 != j) {
                            throw new IOException(c2819.f10501 + " != " + m1907);
                        }
                        c0654.f4436.execute(new C0662(c0654, "OkHttp %s Push Data[%s]", new Object[]{c0654.f4444, Integer.valueOf(mo4878)}, mo4878, c2819, m1907, z5));
                    } else {
                        C0663 m1875 = C0654.this.m1875(mo4878);
                        if (m1875 == null) {
                            C0654.this.m1874(mo4878, EnumC0653.PROTOCOL_ERROR);
                            interfaceC2805.mo4864(m1907);
                        } else {
                            C0663.C0664 c0664 = m1875.f4477;
                            long j2 = m1907;
                            c0664.getClass();
                            while (true) {
                                if (j2 > 0) {
                                    synchronized (C0663.this) {
                                        z2 = c0664.f4493;
                                        z3 = c0664.f4491.f10501 + j2 > c0664.f4494;
                                    }
                                    if (z3) {
                                        interfaceC2805.mo4864(j2);
                                        C0663.this.m1888(EnumC0653.FLOW_CONTROL_ERROR);
                                    } else if (z2) {
                                        interfaceC2805.mo4864(j2);
                                    } else {
                                        long mo1762 = interfaceC2805.mo1762(c0664.f4489, j2);
                                        if (mo1762 == -1) {
                                            throw new EOFException();
                                        }
                                        j2 -= mo1762;
                                        synchronized (C0663.this) {
                                            C2819 c28192 = c0664.f4491;
                                            boolean z6 = c28192.f10501 == 0;
                                            c28192.m4912(c0664.f4489);
                                            if (z6) {
                                                C0663.this.notifyAll();
                                            }
                                        }
                                    }
                                }
                            }
                            if (z5) {
                                m1875.m1891();
                            }
                        }
                    }
                    this.f4508.mo4864(mo48653);
                    return true;
                case 1:
                    if (mo4878 == 0) {
                        C0677.m1920("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                        throw null;
                    }
                    boolean z7 = (mo48652 & 1) != 0;
                    short mo48654 = (mo48652 & 8) != 0 ? (short) (this.f4508.mo4865() & 255) : (short) 0;
                    if ((mo48652 & 32) != 0) {
                        this.f4508.mo4878();
                        this.f4508.mo4865();
                        ((C0654.C0659) interfaceC0669).getClass();
                        m1906 -= 5;
                    }
                    List<C0671> m1915 = m1915(m1907(m1906, mo48652, mo48654), mo48654, mo48652, mo4878);
                    C0654.C0659 c06592 = (C0654.C0659) interfaceC0669;
                    if (C0654.this.m1880(mo4878)) {
                        C0654 c06542 = C0654.this;
                        c06542.getClass();
                        try {
                            c06542.f4436.execute(new C0688(c06542, "OkHttp %s Push Headers[%s]", new Object[]{c06542.f4444, Integer.valueOf(mo4878)}, mo4878, m1915, z7));
                        } catch (RejectedExecutionException unused) {
                        }
                    } else {
                        synchronized (C0654.this) {
                            C0663 m18752 = C0654.this.m1875(mo4878);
                            if (m18752 == null) {
                                C0654 c06543 = C0654.this;
                                if (!c06543.f4433 && mo4878 > c06543.f4446 && mo4878 % 2 != c06543.f4435 % 2) {
                                    C0663 c0663 = new C0663(mo4878, c06543, false, z7, m1915);
                                    C0654 c06544 = C0654.this;
                                    c06544.f4446 = mo4878;
                                    c06544.f4449.put(Integer.valueOf(mo4878), c0663);
                                    C0654.f4432.execute(new C0678(c06592, "OkHttp %s stream %d", new Object[]{C0654.this.f4444, Integer.valueOf(mo4878)}, c0663));
                                }
                            } else {
                                synchronized (m18752) {
                                    m18752.f4479 = true;
                                    if (m18752.f4485 == null) {
                                        m18752.f4485 = m1915;
                                        z4 = m18752.m1882();
                                        m18752.notifyAll();
                                    } else {
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.addAll(m18752.f4485);
                                        arrayList.add(null);
                                        arrayList.addAll(m1915);
                                        m18752.f4485 = arrayList;
                                        z4 = true;
                                    }
                                }
                                if (!z4) {
                                    m18752.f4486.m1877(m18752.f4481);
                                }
                                if (z7) {
                                    m18752.m1891();
                                }
                            }
                        }
                    }
                    return true;
                case 2:
                    if (m1906 != 5) {
                        C0677.m1920("TYPE_PRIORITY length: %d != 5", Integer.valueOf(m1906));
                        throw null;
                    }
                    if (mo4878 == 0) {
                        C0677.m1920("TYPE_PRIORITY streamId == 0", new Object[0]);
                        throw null;
                    }
                    this.f4508.mo4878();
                    this.f4508.mo4865();
                    ((C0654.C0659) interfaceC0669).getClass();
                    return true;
                case 3:
                    m1909(interfaceC0669, m1906, mo4878);
                    return true;
                case 4:
                    m1912(interfaceC0669, m1906, mo48652, mo4878);
                    return true;
                case 5:
                    m1908(interfaceC0669, m1906, mo48652, mo4878);
                    return true;
                case 6:
                    m1911(interfaceC0669, m1906, mo48652, mo4878);
                    return true;
                case 7:
                    m1913(interfaceC0669, m1906, mo4878);
                    return true;
                case 8:
                    m1914(interfaceC0669, m1906, mo4878);
                    return true;
                default:
                    this.f4508.mo4864(m1906);
                    return true;
            }
        } catch (IOException unused2) {
            return false;
        }
    }
}
