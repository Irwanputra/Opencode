package p000.p001.p008;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;
import p000.p001.p008.C0684;
import p243.C2819;
import p243.InterfaceC2823;

/* renamed from: 〳ぜぞぜべっ.ぉひのべい.ぺぁあねじ.ぉざぅち〻, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0667 implements Closeable {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static final Logger f4500 = Logger.getLogger(C0677.class.getName());

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final InterfaceC2823 f4501;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final C0684.C0685 f4502;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final boolean f4503;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f4504;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public boolean f4505;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final C2819 f4506;

    public C0667(InterfaceC2823 interfaceC2823, boolean z) {
        this.f4501 = interfaceC2823;
        this.f4503 = z;
        C2819 c2819 = new C2819();
        this.f4506 = c2819;
        this.f4502 = new C0684.C0685(c2819);
        this.f4504 = 16384;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f4505 = true;
        this.f4501.close();
    }

    public synchronized void flush() {
        if (this.f4505) {
            throw new IOException("closed");
        }
        this.f4501.flush();
    }

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public synchronized void m1897(int i, long j) {
        if (this.f4505) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            C0677.m1919("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
            throw null;
        }
        m1899(i, 4, (byte) 8, (byte) 0);
        this.f4501.mo4883((int) j);
        this.f4501.flush();
    }

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public final void m1898(int i, long j) {
        while (j > 0) {
            int min = (int) Math.min(this.f4504, j);
            long j2 = min;
            j -= j2;
            m1899(i, min, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
            this.f4501.mo1765(this.f4506, j2);
        }
    }

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public void m1899(int i, int i2, byte b, byte b2) {
        Logger logger = f4500;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C0677.m1921(false, i, i2, b, b2));
        }
        int i3 = this.f4504;
        if (i2 > i3) {
            C0677.m1919("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            throw null;
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            C0677.m1919("reserved bit set: %s", Integer.valueOf(i));
            throw null;
        }
        InterfaceC2823 interfaceC2823 = this.f4501;
        interfaceC2823.mo4892((i2 >>> 16) & Base64.BASELENGTH);
        interfaceC2823.mo4892((i2 >>> 8) & Base64.BASELENGTH);
        interfaceC2823.mo4892(i2 & Base64.BASELENGTH);
        this.f4501.mo4892(b & 255);
        this.f4501.mo4892(b2 & 255);
        this.f4501.mo4883(i & Integer.MAX_VALUE);
    }

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public synchronized void m1900(int i, EnumC0653 enumC0653) {
        if (this.f4505) {
            throw new IOException("closed");
        }
        if (enumC0653.f4431 == -1) {
            throw new IllegalArgumentException();
        }
        m1899(i, 4, (byte) 3, (byte) 0);
        this.f4501.mo4883(enumC0653.f4431);
        this.f4501.flush();
    }

    /* renamed from: けときぜと, reason: contains not printable characters */
    public synchronized void m1901(boolean z, int i, int i2) {
        if (this.f4505) {
            throw new IOException("closed");
        }
        m1899(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
        this.f4501.mo4883(i);
        this.f4501.mo4883(i2);
        this.f4501.flush();
    }

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public synchronized void m1902(C0673 c0673) {
        if (this.f4505) {
            throw new IOException("closed");
        }
        int i = this.f4504;
        int i2 = c0673.f4528;
        if ((i2 & 32) != 0) {
            i = c0673.f4527[5];
        }
        this.f4504 = i;
        int i3 = i2 & 2;
        if ((i3 != 0 ? c0673.f4527[1] : -1) != -1) {
            C0684.C0685 c0685 = this.f4502;
            int i4 = i3 != 0 ? c0673.f4527[1] : -1;
            c0685.getClass();
            int min = Math.min(i4, 16384);
            int i5 = c0685.f4571;
            if (i5 != min) {
                if (min < i5) {
                    c0685.f4565 = Math.min(c0685.f4565, min);
                }
                c0685.f4567 = true;
                c0685.f4571 = min;
                int i6 = c0685.f4564;
                if (min < i6) {
                    if (min == 0) {
                        c0685.m1926();
                    } else {
                        c0685.m1924(i6 - min);
                    }
                }
            }
        }
        m1899(0, 0, (byte) 4, (byte) 1);
        this.f4501.flush();
    }

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public synchronized void m1903(int i, EnumC0653 enumC0653, byte[] bArr) {
        if (this.f4505) {
            throw new IOException("closed");
        }
        if (enumC0653.f4431 == -1) {
            C0677.m1919("errorCode.httpCode == -1", new Object[0]);
            throw null;
        }
        m1899(0, bArr.length + 8, (byte) 7, (byte) 0);
        this.f4501.mo4883(i);
        this.f4501.mo4883(enumC0653.f4431);
        if (bArr.length > 0) {
            this.f4501.mo4886(bArr);
        }
        this.f4501.flush();
    }

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public void m1904(boolean z, int i, List<C0671> list) {
        if (this.f4505) {
            throw new IOException("closed");
        }
        this.f4502.m1927(list);
        long j = this.f4506.f10501;
        int min = (int) Math.min(this.f4504, j);
        long j2 = min;
        byte b = j == j2 ? (byte) 4 : (byte) 0;
        if (z) {
            b = (byte) (b | 1);
        }
        m1899(i, min, (byte) 1, b);
        this.f4501.mo1765(this.f4506, j2);
        if (j > j2) {
            m1898(i, j - j2);
        }
    }

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public synchronized void m1905(boolean z, int i, C2819 c2819, int i2) {
        if (this.f4505) {
            throw new IOException("closed");
        }
        m1899(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
        if (i2 > 0) {
            this.f4501.mo1765(c2819, i2);
        }
    }
}
