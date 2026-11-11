package p243;

import androidx.core.app.NotificationCompat;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;
import p131.p155.p156.p157.C2098;

/* renamed from: ぺぁあねじ.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2819 implements InterfaceC2805, InterfaceC2823, Cloneable, ByteChannel {

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static final byte[] f10499 = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    @Nullable
    public C2825 f10500;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public long f10501;

    /* renamed from: ぺぁあねじ.づざかべべ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C2820 extends InputStream {
        public C2820() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(C2819.this.f10501, 2147483647L);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            C2819 c2819 = C2819.this;
            if (c2819.f10501 > 0) {
                return c2819.mo4865() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            return C2819.this.m4928(bArr, i, i2);
        }

        public String toString() {
            return C2819.this + ".inputStream()";
        }
    }

    public Object clone() {
        C2819 c2819 = new C2819();
        if (this.f10501 != 0) {
            C2825 m4935 = this.f10500.m4935();
            c2819.f10500 = m4935;
            m4935.f10513 = m4935;
            m4935.f10517 = m4935;
            C2825 c2825 = this.f10500;
            while (true) {
                c2825 = c2825.f10517;
                if (c2825 == this.f10500) {
                    break;
                }
                c2819.f10500.f10513.m4934(c2825.m4935());
            }
            c2819.f10501 = this.f10501;
        }
        return c2819;
    }

    @Override // p243.InterfaceC2827, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2819)) {
            return false;
        }
        C2819 c2819 = (C2819) obj;
        long j = this.f10501;
        if (j != c2819.f10501) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        C2825 c2825 = this.f10500;
        C2825 c28252 = c2819.f10500;
        int i = c2825.f10512;
        int i2 = c28252.f10512;
        while (j2 < this.f10501) {
            long min = Math.min(c2825.f10514 - i, c28252.f10514 - i2);
            int i3 = 0;
            while (i3 < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (c2825.f10515[i] != c28252.f10515[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == c2825.f10514) {
                c2825 = c2825.f10517;
                i = c2825.f10512;
            }
            if (i2 == c28252.f10514) {
                c28252 = c28252.f10517;
                i2 = c28252.f10512;
            }
            j2 += min;
        }
        return true;
    }

    @Override // p243.InterfaceC2823, p243.InterfaceC2822, java.io.Flushable
    public void flush() {
    }

    public int hashCode() {
        C2825 c2825 = this.f10500;
        if (c2825 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c2825.f10514;
            for (int i3 = c2825.f10512; i3 < i2; i3++) {
                i = (i * 31) + c2825.f10515[i3];
            }
            c2825 = c2825.f10517;
        } while (c2825 != this.f10500);
        return i;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        C2825 c2825 = this.f10500;
        if (c2825 == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), c2825.f10514 - c2825.f10512);
        byteBuffer.put(c2825.f10515, c2825.f10512, min);
        int i = c2825.f10512 + min;
        c2825.f10512 = i;
        this.f10501 -= min;
        if (i == c2825.f10514) {
            this.f10500 = c2825.m4936();
            C2815.m4902(c2825);
        }
        return min;
    }

    public String toString() {
        long j = this.f10501;
        if (j <= 2147483647L) {
            int i = (int) j;
            return (i == 0 ? C2801.f10464 : new C2816(this, i)).toString();
        }
        StringBuilder m4207 = C2098.m4207("size > Integer.MAX_VALUE: ");
        m4207.append(this.f10501);
        throw new IllegalArgumentException(m4207.toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            C2825 m4925 = m4925(1);
            int min = Math.min(i, 8192 - m4925.f10514);
            byteBuffer.get(m4925.f10515, m4925.f10514, min);
            i -= min;
            m4925.f10514 += min;
        }
        this.f10501 += remaining;
        return remaining;
    }

    /* renamed from: 〱こか〺ぃせ, reason: contains not printable characters */
    public C2819 m4908(String str, int i, int i2) {
        char charAt;
        int i3;
        if (i < 0) {
            throw new IllegalArgumentException(C2098.m4208("beginIndex < 0: ", i));
        }
        if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                C2825 m4925 = m4925(1);
                byte[] bArr = m4925.f10515;
                int i4 = m4925.f10514 - i;
                int min = Math.min(i2, 8192 - i4);
                int i5 = i + 1;
                bArr[i + i4] = (byte) charAt2;
                while (true) {
                    i = i5;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i5 = i + 1;
                    bArr[i + i4] = (byte) charAt;
                }
                int i6 = m4925.f10514;
                int i7 = (i4 + i) - i6;
                m4925.f10514 = i6 + i7;
                this.f10501 += i7;
            } else {
                if (charAt2 < 2048) {
                    i3 = (charAt2 >> 6) | 192;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    m4927((charAt2 >> '\f') | 224);
                    i3 = ((charAt2 >> 6) & 63) | NotificationCompat.FLAG_HIGH_PRIORITY;
                } else {
                    int i8 = i + 1;
                    char charAt3 = i8 < i2 ? str.charAt(i8) : (char) 0;
                    if (charAt2 > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                        m4927(63);
                        i = i8;
                    } else {
                        int i9 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + 65536;
                        m4927((i9 >> 18) | 240);
                        m4927(((i9 >> 12) & 63) | NotificationCompat.FLAG_HIGH_PRIORITY);
                        m4927(((i9 >> 6) & 63) | NotificationCompat.FLAG_HIGH_PRIORITY);
                        m4927((i9 & 63) | NotificationCompat.FLAG_HIGH_PRIORITY);
                        i += 2;
                    }
                }
                m4927(i3);
                m4927((charAt2 & '?') | NotificationCompat.FLAG_HIGH_PRIORITY);
                i++;
            }
        }
        return this;
    }

    @Override // p243.InterfaceC2823
    /* renamed from: 〳ぜぞぜべっ */
    public /* bridge */ /* synthetic */ InterfaceC2823 mo4882(int i) {
        m4926(i);
        return this;
    }

    @Override // p243.InterfaceC2827
    /* renamed from: 〺つふすそ */
    public C2803 mo1761() {
        return C2803.f10470;
    }

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public void m4909(byte[] bArr) {
        int i = 0;
        while (i < bArr.length) {
            int m4928 = m4928(bArr, i, bArr.length - i);
            if (m4928 == -1) {
                throw new EOFException();
            }
            i += m4928;
        }
    }

    @Override // p243.InterfaceC2805
    /* renamed from: 〻ぞまぎな〻 */
    public void mo4863(long j) {
        if (this.f10501 < j) {
            throw new EOFException();
        }
    }

    @Override // p243.InterfaceC2805
    /* renamed from: ぁごぐすすぃ */
    public void mo4864(long j) {
        while (j > 0) {
            if (this.f10500 == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, r0.f10514 - r0.f10512);
            long j2 = min;
            this.f10501 -= j2;
            j -= j2;
            C2825 c2825 = this.f10500;
            int i = c2825.f10512 + min;
            c2825.f10512 = i;
            if (i == c2825.f10514) {
                this.f10500 = c2825.m4936();
                C2815.m4902(c2825);
            }
        }
    }

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public C2819 m4910(C2801 c2801) {
        if (c2801 == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        c2801.mo4846(this);
        return this;
    }

    @Override // p243.InterfaceC2823
    /* renamed from: いいにぽつ */
    public /* bridge */ /* synthetic */ InterfaceC2823 mo4883(int i) {
        m4929(i);
        return this;
    }

    @Override // p243.InterfaceC2805
    /* renamed from: ぅみぱぎぎ */
    public byte mo4865() {
        long j = this.f10501;
        if (j == 0) {
            throw new IllegalStateException("size == 0");
        }
        C2825 c2825 = this.f10500;
        int i = c2825.f10512;
        int i2 = c2825.f10514;
        int i3 = i + 1;
        byte b = c2825.f10515[i];
        this.f10501 = j - 1;
        if (i3 == i2) {
            this.f10500 = c2825.m4936();
            C2815.m4902(c2825);
        } else {
            c2825.f10512 = i3;
        }
        return b;
    }

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public String m4911(long j, Charset charset) {
        C2808.m4880(this.f10501, 0L, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        }
        if (j == 0) {
            return "";
        }
        C2825 c2825 = this.f10500;
        if (c2825.f10512 + j > c2825.f10514) {
            return new String(mo4867(j), charset);
        }
        String str = new String(c2825.f10515, c2825.f10512, (int) j, charset);
        int i = (int) (c2825.f10512 + j);
        c2825.f10512 = i;
        this.f10501 -= j;
        if (i == c2825.f10514) {
            this.f10500 = c2825.m4936();
            C2815.m4902(c2825);
        }
        return str;
    }

    @Override // p243.InterfaceC2805
    /* renamed from: ぇぬぎばつ */
    public String mo4866() {
        try {
            return m4911(this.f10501, C2808.f10476);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: えがぐせほち, reason: contains not printable characters */
    public long m4912(InterfaceC2827 interfaceC2827) {
        if (interfaceC2827 == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long mo1762 = interfaceC2827.mo1762(this, 8192L);
            if (mo1762 == -1) {
                return j;
            }
            j += mo1762;
        }
    }

    @Override // p243.InterfaceC2823
    /* renamed from: ぉ〲なぱぽた */
    public /* bridge */ /* synthetic */ InterfaceC2823 mo4885(String str) {
        m4916(str);
        return this;
    }

    @Override // p243.InterfaceC2823
    /* renamed from: ぉざぅち〻 */
    public /* bridge */ /* synthetic */ InterfaceC2823 mo4886(byte[] bArr) {
        m4924(bArr);
        return this;
    }

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public byte m4913(long j) {
        int i;
        C2808.m4880(this.f10501, j, 1L);
        long j2 = this.f10501;
        if (j2 - j <= j) {
            long j3 = j - j2;
            C2825 c2825 = this.f10500;
            do {
                c2825 = c2825.f10513;
                int i2 = c2825.f10514;
                i = c2825.f10512;
                j3 += i2 - i;
            } while (j3 < 0);
            return c2825.f10515[i + ((int) j3)];
        }
        C2825 c28252 = this.f10500;
        while (true) {
            int i3 = c28252.f10514;
            int i4 = c28252.f10512;
            long j4 = i3 - i4;
            if (j < j4) {
                return c28252.f10515[i4 + ((int) j)];
            }
            j -= j4;
            c28252 = c28252.f10517;
        }
    }

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public C2801 m4914() {
        return new C2801(m4917());
    }

    @Override // p243.InterfaceC2805
    /* renamed from: おぐぴう〸ず */
    public byte[] mo4867(long j) {
        C2808.m4880(this.f10501, 0L, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[(int) j];
            m4909(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
    }

    /* renamed from: くぎぶ〼のそ, reason: contains not printable characters */
    public C2819 m4915(int i) {
        int i2;
        int i3;
        if (i >= 128) {
            if (i < 2048) {
                i3 = (i >> 6) | 192;
            } else {
                if (i < 65536) {
                    if (i >= 55296 && i <= 57343) {
                        m4927(63);
                        return this;
                    }
                    i2 = (i >> 12) | 224;
                } else {
                    if (i > 1114111) {
                        StringBuilder m4207 = C2098.m4207("Unexpected code point: ");
                        m4207.append(Integer.toHexString(i));
                        throw new IllegalArgumentException(m4207.toString());
                    }
                    m4927((i >> 18) | 240);
                    i2 = ((i >> 12) & 63) | NotificationCompat.FLAG_HIGH_PRIORITY;
                }
                m4927(i2);
                i3 = ((i >> 6) & 63) | NotificationCompat.FLAG_HIGH_PRIORITY;
            }
            m4927(i3);
            i = (i & 63) | NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        m4927(i);
        return this;
    }

    @Override // p243.InterfaceC2823
    /* renamed from: くし〴〺ぅ */
    public /* bridge */ /* synthetic */ InterfaceC2823 mo4887(byte[] bArr, int i, int i2) {
        m4923(bArr, i, i2);
        return this;
    }

    /* renamed from: くねねぱす〻, reason: contains not printable characters */
    public C2819 m4916(String str) {
        m4908(str, 0, str.length());
        return this;
    }

    /* renamed from: けときぜと, reason: contains not printable characters */
    public byte[] m4917() {
        try {
            return mo4867(this.f10501);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public String m4918(long j) {
        String m4911;
        long j2 = 1;
        if (j > 0) {
            long j3 = j - 1;
            if (m4913(j3) == 13) {
                m4911 = m4911(j3, C2808.f10476);
                j2 = 2;
                mo4864(j2);
                return m4911;
            }
        }
        m4911 = m4911(j, C2808.f10476);
        mo4864(j2);
        return m4911;
    }

    @Override // p243.InterfaceC2805
    /* renamed from: げつ〴ぬぐ */
    public C2819 mo4868() {
        return this;
    }

    @Override // p243.InterfaceC2823
    /* renamed from: こ〲しでおか, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C2819 mo4891(long j) {
        if (j == 0) {
            m4927(48);
            return this;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        C2825 m4925 = m4925(numberOfTrailingZeros);
        byte[] bArr = m4925.f10515;
        int i = m4925.f10514;
        for (int i2 = (i + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f10499[(int) (15 & j)];
            j >>>= 4;
        }
        m4925.f10514 += numberOfTrailingZeros;
        this.f10501 += numberOfTrailingZeros;
        return this;
    }

    @Override // p243.InterfaceC2823
    /* renamed from: ごづごきえ */
    public InterfaceC2823 mo4889() {
        return this;
    }

    @Override // p243.InterfaceC2823
    /* renamed from: ごまけがぢは, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C2819 mo4884(long j) {
        if (j == 0) {
            m4927(48);
            return this;
        }
        boolean z = false;
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                m4916("-9223372036854775808");
                return this;
            }
            z = true;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z) {
            i++;
        }
        C2825 m4925 = m4925(i);
        byte[] bArr = m4925.f10515;
        int i2 = m4925.f10514 + i;
        while (j != 0) {
            i2--;
            bArr[i2] = f10499[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        m4925.f10514 += i;
        this.f10501 += i;
        return this;
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
        long j2 = this.f10501;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        c2819.mo1765(this, j);
        return j;
    }

    @Override // p243.InterfaceC2823
    /* renamed from: ざとぅぼこ〺 */
    public /* bridge */ /* synthetic */ InterfaceC2823 mo4890(C2801 c2801) {
        m4910(c2801);
        return this;
    }

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public void m4921() {
        try {
            mo4864(this.f10501);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public long m4922(byte b, long j, long j2) {
        C2825 c2825;
        long j3 = 0;
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.f10501), Long.valueOf(j), Long.valueOf(j2)));
        }
        long j4 = this.f10501;
        long j5 = j2 > j4 ? j4 : j2;
        if (j == j5 || (c2825 = this.f10500) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                c2825 = c2825.f10513;
                j4 -= c2825.f10514 - c2825.f10512;
            }
        } else {
            while (true) {
                long j6 = (c2825.f10514 - c2825.f10512) + j3;
                if (j6 >= j) {
                    break;
                }
                c2825 = c2825.f10517;
                j3 = j6;
            }
            j4 = j3;
        }
        long j7 = j;
        while (j4 < j5) {
            byte[] bArr = c2825.f10515;
            int min = (int) Math.min(c2825.f10514, (c2825.f10512 + j5) - j4);
            for (int i = (int) ((c2825.f10512 + j7) - j4); i < min; i++) {
                if (bArr[i] == b) {
                    return (i - c2825.f10512) + j4;
                }
            }
            j4 += c2825.f10514 - c2825.f10512;
            c2825 = c2825.f10517;
            j7 = j4;
        }
        return -1L;
    }

    /* renamed from: ち〴みぎ〻び, reason: contains not printable characters */
    public C2819 m4923(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = i2;
        C2808.m4880(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C2825 m4925 = m4925(1);
            int min = Math.min(i3 - i, 8192 - m4925.f10514);
            System.arraycopy(bArr, i, m4925.f10515, m4925.f10514, min);
            i += min;
            m4925.f10514 += min;
        }
        this.f10501 += j;
        return this;
    }

    /* renamed from: ておぞぞはね, reason: contains not printable characters */
    public C2819 m4924(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        m4923(bArr, 0, bArr.length);
        return this;
    }

    @Override // p243.InterfaceC2805
    /* renamed from: てぜきぽく */
    public int mo4869() {
        int mo4878 = mo4878();
        Charset charset = C2808.f10476;
        return ((mo4878 & Base64.BASELENGTH) << 24) | (((-16777216) & mo4878) >>> 24) | ((16711680 & mo4878) >>> 8) | ((65280 & mo4878) << 8);
    }

    @Override // p243.InterfaceC2805
    /* renamed from: でどあくず */
    public String mo4870(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("limit < 0: " + j);
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long m4922 = m4922((byte) 10, 0L, j2);
        if (m4922 != -1) {
            return m4918(m4922);
        }
        if (j2 < this.f10501 && m4913(j2 - 1) == 13 && m4913(j2) == 10) {
            return m4918(j2);
        }
        C2819 c2819 = new C2819();
        m4930(c2819, 0L, Math.min(32L, this.f10501));
        StringBuilder m4207 = C2098.m4207("\\n not found: limit=");
        m4207.append(Math.min(this.f10501, j));
        m4207.append(" content=");
        m4207.append(c2819.m4914().mo4844());
        m4207.append((char) 8230);
        throw new EOFException(m4207.toString());
    }

    @Override // p243.InterfaceC2805
    /* renamed from: どぇぞほだ */
    public InputStream mo4871() {
        return new C2820();
    }

    /* renamed from: ながふずは, reason: contains not printable characters */
    public C2825 m4925(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        C2825 c2825 = this.f10500;
        if (c2825 == null) {
            C2825 m4901 = C2815.m4901();
            this.f10500 = m4901;
            m4901.f10513 = m4901;
            m4901.f10517 = m4901;
            return m4901;
        }
        C2825 c28252 = c2825.f10513;
        if (c28252.f10514 + i <= 8192 && c28252.f10516) {
            return c28252;
        }
        C2825 m49012 = C2815.m4901();
        c28252.m4934(m49012);
        return m49012;
    }

    @Override // p243.InterfaceC2805
    /* renamed from: なぎぱいぢぎ */
    public C2801 mo4872(long j) {
        return new C2801(mo4867(j));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009b A[EDGE_INSN: B:41:0x009b->B:38:0x009b BREAK  A[LOOP:0: B:4:0x000b->B:40:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    @Override // p243.InterfaceC2805
    /* renamed from: なぶひせが */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long mo4873() {
        /*
            r15 = this;
            long r0 = r15.f10501
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto La2
            r0 = 0
            r1 = 0
            r4 = r2
        Lb:
            ぺぁあねじ.は〲ぱなで r6 = r15.f10500
            byte[] r7 = r6.f10515
            int r8 = r6.f10512
            int r9 = r6.f10514
        L13:
            if (r8 >= r9) goto L87
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L22
            r11 = 57
            if (r10 > r11) goto L22
            int r11 = r10 + (-48)
            goto L39
        L22:
            r11 = 97
            if (r10 < r11) goto L2d
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L2d
            int r11 = r10 + (-97)
            goto L37
        L2d:
            r11 = 65
            if (r10 < r11) goto L6c
            r11 = 70
            if (r10 > r11) goto L6c
            int r11 = r10 + (-65)
        L37:
            int r11 = r11 + 10
        L39:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L49
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L13
        L49:
            ぺぁあねじ.づざかべべ r0 = new ぺぁあねじ.づざかべべ
            r0.<init>()
            ぺぁあねじ.づざかべべ r0 = r0.mo4891(r4)
            r0.m4927(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Number too large: "
            java.lang.StringBuilder r2 = p131.p155.p156.p157.C2098.m4207(r2)
            java.lang.String r0 = r0.mo4866()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L6c:
            if (r0 == 0) goto L70
            r1 = 1
            goto L87
        L70:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.StringBuilder r1 = p131.p155.p156.p157.C2098.m4207(r1)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L87:
            if (r8 != r9) goto L93
            ぺぁあねじ.は〲ぱなで r7 = r6.m4936()
            r15.f10500 = r7
            p243.C2815.m4902(r6)
            goto L95
        L93:
            r6.f10512 = r8
        L95:
            if (r1 != 0) goto L9b
            ぺぁあねじ.は〲ぱなで r6 = r15.f10500
            if (r6 != 0) goto Lb
        L9b:
            long r1 = r15.f10501
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.f10501 = r1
            return r4
        La2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            goto Lab
        Laa:
            throw r0
        Lab:
            goto Laa
        */
        throw new UnsupportedOperationException("Method not decompiled: p243.C2819.mo4873():long");
    }

    /* renamed from: のね〱ばぁぢ, reason: contains not printable characters */
    public C2819 m4926(int i) {
        C2825 m4925 = m4925(2);
        byte[] bArr = m4925.f10515;
        int i2 = m4925.f10514;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & Base64.BASELENGTH);
        bArr[i3] = (byte) (i & Base64.BASELENGTH);
        m4925.f10514 = i3 + 1;
        this.f10501 += 2;
        return this;
    }

    @Override // p243.InterfaceC2805
    /* renamed from: のぷのちつ */
    public boolean mo4874() {
        return this.f10501 == 0;
    }

    @Override // p243.InterfaceC2805
    /* renamed from: は〲ぱなで */
    public short mo4875() {
        short mo4877 = mo4877();
        Charset charset = C2808.f10476;
        int i = mo4877 & 65535;
        return (short) (((i & Base64.BASELENGTH) << 8) | ((65280 & i) >>> 8));
    }

    /* renamed from: ばおぢでぎか, reason: contains not printable characters */
    public C2819 m4927(int i) {
        C2825 m4925 = m4925(1);
        byte[] bArr = m4925.f10515;
        int i2 = m4925.f10514;
        m4925.f10514 = i2 + 1;
        bArr[i2] = (byte) i;
        this.f10501++;
        return this;
    }

    @Override // p243.InterfaceC2805
    /* renamed from: びえぁぜい */
    public long mo4876(byte b) {
        return m4922(b, 0L, Long.MAX_VALUE);
    }

    @Override // p243.InterfaceC2822
    /* renamed from: びぐびあび */
    public void mo1765(C2819 c2819, long j) {
        C2825 m4901;
        if (c2819 == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (c2819 == this) {
            throw new IllegalArgumentException("source == this");
        }
        C2808.m4880(c2819.f10501, 0L, j);
        while (j > 0) {
            C2825 c2825 = c2819.f10500;
            if (j < c2825.f10514 - c2825.f10512) {
                C2825 c28252 = this.f10500;
                C2825 c28253 = c28252 != null ? c28252.f10513 : null;
                if (c28253 != null && c28253.f10516) {
                    if ((c28253.f10514 + j) - (c28253.f10518 ? 0 : c28253.f10512) <= 8192) {
                        c2825.m4937(c28253, (int) j);
                        c2819.f10501 -= j;
                        this.f10501 += j;
                        return;
                    }
                }
                int i = (int) j;
                c2825.getClass();
                if (i <= 0 || i > c2825.f10514 - c2825.f10512) {
                    throw new IllegalArgumentException();
                }
                if (i >= 1024) {
                    m4901 = c2825.m4935();
                } else {
                    m4901 = C2815.m4901();
                    System.arraycopy(c2825.f10515, c2825.f10512, m4901.f10515, 0, i);
                }
                m4901.f10514 = m4901.f10512 + i;
                c2825.f10512 += i;
                c2825.f10513.m4934(m4901);
                c2819.f10500 = m4901;
            }
            C2825 c28254 = c2819.f10500;
            long j2 = c28254.f10514 - c28254.f10512;
            c2819.f10500 = c28254.m4936();
            C2825 c28255 = this.f10500;
            if (c28255 == null) {
                this.f10500 = c28254;
                c28254.f10513 = c28254;
                c28254.f10517 = c28254;
            } else {
                c28255.f10513.m4934(c28254);
                C2825 c28256 = c28254.f10513;
                if (c28256 == c28254) {
                    throw new IllegalStateException();
                }
                if (c28256.f10516) {
                    int i2 = c28254.f10514 - c28254.f10512;
                    if (i2 <= (8192 - c28256.f10514) + (c28256.f10518 ? 0 : c28256.f10512)) {
                        c28254.m4937(c28256, i2);
                        c28254.m4936();
                        C2815.m4902(c28254);
                    }
                }
            }
            c2819.f10501 -= j2;
            this.f10501 += j2;
            j -= j2;
        }
    }

    @Override // p243.InterfaceC2805
    /* renamed from: ぶでにく〼〳 */
    public short mo4877() {
        long j = this.f10501;
        if (j < 2) {
            StringBuilder m4207 = C2098.m4207("size < 2: ");
            m4207.append(this.f10501);
            throw new IllegalStateException(m4207.toString());
        }
        C2825 c2825 = this.f10500;
        int i = c2825.f10512;
        int i2 = c2825.f10514;
        if (i2 - i < 2) {
            return (short) (((mo4865() & 255) << 8) | (mo4865() & 255));
        }
        byte[] bArr = c2825.f10515;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
        this.f10501 = j - 2;
        if (i4 == i2) {
            this.f10500 = c2825.m4936();
            C2815.m4902(c2825);
        } else {
            c2825.f10512 = i4;
        }
        return (short) i5;
    }

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public int m4928(byte[] bArr, int i, int i2) {
        C2808.m4880(bArr.length, i, i2);
        C2825 c2825 = this.f10500;
        if (c2825 == null) {
            return -1;
        }
        int min = Math.min(i2, c2825.f10514 - c2825.f10512);
        System.arraycopy(c2825.f10515, c2825.f10512, bArr, i, min);
        int i3 = c2825.f10512 + min;
        c2825.f10512 = i3;
        this.f10501 -= min;
        if (i3 == c2825.f10514) {
            this.f10500 = c2825.m4936();
            C2815.m4902(c2825);
        }
        return min;
    }

    @Override // p243.InterfaceC2823
    /* renamed from: へぬ〴づぞ */
    public /* bridge */ /* synthetic */ InterfaceC2823 mo4892(int i) {
        m4927(i);
        return this;
    }

    @Override // p243.InterfaceC2805
    /* renamed from: ぺぁあねじ */
    public int mo4878() {
        long j = this.f10501;
        if (j < 4) {
            StringBuilder m4207 = C2098.m4207("size < 4: ");
            m4207.append(this.f10501);
            throw new IllegalStateException(m4207.toString());
        }
        C2825 c2825 = this.f10500;
        int i = c2825.f10512;
        int i2 = c2825.f10514;
        if (i2 - i < 4) {
            return ((mo4865() & 255) << 24) | ((mo4865() & 255) << 16) | ((mo4865() & 255) << 8) | (mo4865() & 255);
        }
        byte[] bArr = c2825.f10515;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
        int i6 = i4 + 1;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        int i8 = i6 + 1;
        int i9 = i7 | (bArr[i6] & 255);
        this.f10501 = j - 4;
        if (i8 == i2) {
            this.f10500 = c2825.m4936();
            C2815.m4902(c2825);
        } else {
            c2825.f10512 = i8;
        }
        return i9;
    }

    /* renamed from: ぺがぅす〹ち, reason: contains not printable characters */
    public C2819 m4929(int i) {
        C2825 m4925 = m4925(4);
        byte[] bArr = m4925.f10515;
        int i2 = m4925.f10514;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & Base64.BASELENGTH);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & Base64.BASELENGTH);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & Base64.BASELENGTH);
        bArr[i5] = (byte) (i & Base64.BASELENGTH);
        m4925.f10514 = i5 + 1;
        this.f10501 += 4;
        return this;
    }

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public C2819 m4930(C2819 c2819, long j, long j2) {
        if (c2819 == null) {
            throw new IllegalArgumentException("out == null");
        }
        C2808.m4880(this.f10501, j, j2);
        if (j2 == 0) {
            return this;
        }
        c2819.f10501 += j2;
        C2825 c2825 = this.f10500;
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
            C2825 m4935 = c2825.m4935();
            int i3 = (int) (m4935.f10512 + j);
            m4935.f10512 = i3;
            m4935.f10514 = Math.min(i3 + ((int) j2), m4935.f10514);
            C2825 c28252 = c2819.f10500;
            if (c28252 == null) {
                m4935.f10513 = m4935;
                m4935.f10517 = m4935;
                c2819.f10500 = m4935;
            } else {
                c28252.f10513.m4934(m4935);
            }
            j2 -= m4935.f10514 - m4935.f10512;
            c2825 = c2825.f10517;
            j = 0;
        }
        return this;
    }

    @Override // p243.InterfaceC2805
    /* renamed from: ぺふねづ〺 */
    public String mo4879() {
        return mo4870(Long.MAX_VALUE);
    }
}
