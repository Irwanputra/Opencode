package dev.epro.r0;

import com.trilead.ssh2.crypto.CryptoWishList;
import com.trilead.ssh2.crypto.cipher.BlockCipher;
import com.trilead.ssh2.crypto.cipher.CipherInputStream;
import com.trilead.ssh2.crypto.digest.MessageMac;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.SecureRandom;
import java.util.Vector;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes3.dex */
public final class T1177712003054613961 {

    /* renamed from: o, reason: collision with root package name */
    public static final long f491o;
    public static volatile L4980660535418402690 p;
    public static long q;
    public static final int r;
    public final String b;
    public final int c;
    public O3808217931002834139 h;
    public M18133917112013001009 i;
    public Thread k;
    public D14731132657808549702 n;
    public final J15730374346044043770 a = new J15730374346044043770(this, new Y9819334540737372388(this));
    public final Socket d = new Socket();
    public final Object e = new Object();
    public boolean f = false;
    public Throwable g = null;
    public final Vector j = new Vector();
    public Vector l = new Vector();
    public boolean m = false;

    public T1177712003054613961(String str, int i) {
        this.b = str;
        this.c = i;
    }

    public static native InetAddress c(String str);

    public static void d(InputStream inputStream, byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read <= 0) {
                Q11088980322693754445.h("Proxy Exception SOCKS5: stream is closed");
                return;
            }
            i2 += read;
        }
    }

    public static native boolean h(Socket socket);

    public final void a(BlockCipher blockCipher, MessageMac messageMac, String str) {
        O3808217931002834139 o3808217931002834139 = this.h;
        o3808217931002834139.c.changeCipher(blockCipher);
        o3808217931002834139.i = messageMac;
        o3808217931002834139.j = new byte[messageMac.size()];
        o3808217931002834139.k = new byte[messageMac.size()];
        blockCipher.getBlockSize();
        J15730374346044043770 j15730374346044043770 = o3808217931002834139.m;
        if (j15730374346044043770 != null) {
            Deflater deflater = (Deflater) j15730374346044043770.c;
            if (deflater != null) {
                deflater.end();
            }
            Inflater inflater = (Inflater) j15730374346044043770.d;
            if (inflater != null) {
                inflater.end();
            }
        }
        o3808217931002834139.m = null;
        o3808217931002834139.f406o = false;
        if ("zlib".equals(str) || "zlib@openssh.com".equals(str)) {
            if (!"zlib@openssh.com".equals(str) || o3808217931002834139.p) {
                o3808217931002834139.m = new J15730374346044043770(false);
            } else {
                o3808217931002834139.f406o = true;
            }
        }
    }

    public final void b(Throwable th, boolean z) {
        Vector vector;
        if (!z) {
            try {
                this.d.close();
            } catch (IOException unused) {
            }
        }
        synchronized (this.e) {
            if (this.g == null) {
                if (z) {
                    try {
                        String message = th.getMessage();
                        T17032536773975598836 t17032536773975598836 = new T17032536773975598836();
                        t17032536773975598836.o(1);
                        t17032536773975598836.u(11);
                        t17032536773975598836.t(message);
                        t17032536773975598836.t("");
                        byte[] f = t17032536773975598836.f();
                        O3808217931002834139 o3808217931002834139 = this.h;
                        if (o3808217931002834139 != null) {
                            o3808217931002834139.c(f);
                        }
                    } catch (IOException unused2) {
                    }
                    try {
                        this.d.close();
                    } catch (IOException unused3) {
                    }
                }
                if (th == null) {
                    th = new Exception("Unknown cause");
                }
                this.g = th;
            }
            this.e.notifyAll();
        }
        synchronized (this) {
            try {
                if (this.m) {
                    vector = null;
                } else {
                    this.m = true;
                    vector = (Vector) this.l.clone();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (vector != null) {
            for (int i = 0; i < vector.size(); i++) {
                try {
                    ((K8951043088627572268) ((L11657701423026125920) vector.elementAt(i))).p(this.g);
                } catch (Exception unused4) {
                }
            }
        }
    }

    public final P10351157897044641494 e() {
        P10351157897044641494 p10351157897044641494;
        Throwable th;
        M18133917112013001009 m18133917112013001009 = this.i;
        synchronized (m18133917112013001009.f) {
            while (true) {
                try {
                    p10351157897044641494 = m18133917112013001009.g;
                } catch (Throwable th2) {
                    throw th2;
                }
                if (p10351157897044641494 == null || p10351157897044641494.d < 1) {
                    if (m18133917112013001009.h) {
                        T1177712003054613961 t1177712003054613961 = m18133917112013001009.j;
                        synchronized (t1177712003054613961.e) {
                            th = t1177712003054613961.g;
                        }
                        throw new IOException("Key exchange was not finished, connection is closed.", th);
                    }
                    try {
                        m18133917112013001009.f.wait(M18133917112013001009.p);
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                    throw th2;
                }
            }
        }
        return p10351157897044641494;
    }

    public final native void f(CryptoWishList cryptoWishList, M11115334227134251595 m11115334227134251595, A4620944990041811311 a4620944990041811311, int i, SecureRandom secureRandom, S5658423376814904854 s5658423376814904854);

    public final synchronized String g(String str) {
        String str2;
        int i;
        long j;
        str2 = this.b;
        i = this.c;
        j = q;
        q = 1 + j;
        return "Trilead_TransportManager_" + str + "_" + str2 + ":" + i + "_" + j;
    }

    public final void i() {
        int b;
        int i;
        Z1784283759719197609 z1784283759719197609;
        int i2 = r;
        byte[] bArr = new byte[i2];
        while (true) {
            O3808217931002834139 o3808217931002834139 = this.h;
            byte[] bArr2 = o3808217931002834139.s;
            CipherInputStream cipherInputStream = o3808217931002834139.c;
            byte[] bArr3 = o3808217931002834139.t;
            MessageMac messageMac = o3808217931002834139.i;
            int i3 = 0;
            if (messageMac == null || !messageMac.isEncryptThenMac()) {
                cipherInputStream.read(bArr3, 0, 5);
                b = O3808217931002834139.b(bArr3, false);
            } else {
                cipherInputStream.readPlain(bArr3, 0, 4);
                b = O3808217931002834139.b(bArr3, true);
                o3808217931002834139.i.initMac(o3808217931002834139.b);
                o3808217931002834139.i.update(bArr3, 0, 4);
                cipherInputStream.peekPlain(bArr, 0, o3808217931002834139.j.length + b);
                byte[] bArr4 = o3808217931002834139.j;
                System.arraycopy(bArr, b, bArr4, 0, bArr4.length);
                o3808217931002834139.i.update(bArr, 0, b);
                o3808217931002834139.i.getMac(o3808217931002834139.k, 0);
                O3808217931002834139.a(o3808217931002834139.j, o3808217931002834139.k);
                cipherInputStream.read(bArr3, 4, 1);
            }
            int i4 = bArr3[4] & 255;
            int i5 = (b - i4) - 1;
            if (i5 < 0) {
                throw new IOException(G6547577305291411977.o(i4, "Illegal padding_length in packet from remote (", ")"));
            }
            if (i5 >= i2) {
                throw new IOException(G11450220448113054352.h(i2, i5, "Receive buffer too small (", ", need ", ")"));
            }
            cipherInputStream.read(bArr, 0, i5);
            cipherInputStream.read(bArr2, 0, i4);
            if (o3808217931002834139.i != null) {
                byte[] bArr5 = o3808217931002834139.j;
                i = 1;
                cipherInputStream.readPlain(bArr5, 0, bArr5.length);
                if (!o3808217931002834139.i.isEncryptThenMac()) {
                    o3808217931002834139.i.initMac(o3808217931002834139.b);
                    o3808217931002834139.i.update(bArr3, 0, 5);
                    o3808217931002834139.i.update(bArr, 0, i5);
                    o3808217931002834139.i.update(bArr2, 0, i4);
                    o3808217931002834139.i.getMac(o3808217931002834139.k, 0);
                    O3808217931002834139.a(o3808217931002834139.j, o3808217931002834139.k);
                }
            } else {
                i = 1;
            }
            o3808217931002834139.b++;
            J15730374346044043770 j15730374346044043770 = o3808217931002834139.m;
            if (j15730374346044043770 != null) {
                byte[] bArr6 = (byte[]) j15730374346044043770.e;
                Inflater inflater = (Inflater) j15730374346044043770.d;
                inflater.setInput(bArr, 0, i5);
                ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) j15730374346044043770.b;
                byteArrayOutputStream.reset();
                while (true) {
                    try {
                        int inflate = inflater.inflate(bArr6);
                        if (inflate <= 0) {
                            if (!inflater.needsInput()) {
                                if (inflater.needsDictionary()) {
                                    throw new IOException("SSH compression dictionary is not supported.");
                                }
                                if (!inflater.finished()) {
                                    throw new IOException("SSH decompression stalled.");
                                }
                            }
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            System.arraycopy(byteArray, 0, bArr, 0, byteArray.length);
                            i5 = byteArray.length;
                        } else {
                            if (byteArrayOutputStream.size() + inflate > i2) {
                                throw new IOException("Decompressed SSH packet is too large.");
                            }
                            byteArrayOutputStream.write(bArr6, 0, inflate);
                        }
                    } catch (DataFormatException e) {
                        throw new IOException("SSH decompression failed.", e);
                    }
                }
            }
            int i6 = bArr[0] & 255;
            if (i6 != 2 && i6 != 4) {
                if (i6 == 3) {
                    throw new IOException("Peer sent UNIMPLEMENTED message, that should not happen.");
                }
                if (i6 == i) {
                    C9142879380583651391 c9142879380583651391 = new C9142879380583651391(bArr, i5);
                    c9142879380583651391.b();
                    int i7 = c9142879380583651391.i();
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(c9142879380583651391.h("UTF-8"));
                    if (stringBuffer.length() > 255) {
                        stringBuffer.setLength(255);
                        stringBuffer.setCharAt(254, '.');
                        stringBuffer.setCharAt(253, '.');
                        stringBuffer.setCharAt(252, '.');
                    }
                    while (i3 < stringBuffer.length()) {
                        char charAt = stringBuffer.charAt(i3);
                        if (charAt < ' ' || charAt > '~') {
                            stringBuffer.setCharAt(i3, (char) 65533);
                        }
                        i3++;
                    }
                    throw new IOException("Peer sent DISCONNECT message (reason code " + i7 + "): " + stringBuffer.toString());
                }
                if (i6 == 20 || i6 == 21 || (i6 >= 30 && i6 <= 49)) {
                    this.i.a(i5, bArr);
                } else {
                    while (true) {
                        Vector vector = this.j;
                        if (i3 >= vector.size()) {
                            z1784283759719197609 = null;
                            break;
                        }
                        M11333858610097094041 m11333858610097094041 = (M11333858610097094041) vector.elementAt(i3);
                        if (m11333858610097094041.b <= i6 && i6 <= m11333858610097094041.c) {
                            z1784283759719197609 = m11333858610097094041.a;
                            break;
                        }
                        i3++;
                    }
                    if (z1784283759719197609 == null) {
                        throw new IOException(G6547577305291411977.o(i6, "Unexpected SSH message (type ", ")"));
                    }
                    z1784283759719197609.a(i5, bArr);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(Z1784283759719197609 z1784283759719197609, int i, int i2) {
        M11333858610097094041 m11333858610097094041 = new M11333858610097094041();
        m11333858610097094041.a = z1784283759719197609;
        m11333858610097094041.b = i;
        m11333858610097094041.c = i2;
        synchronized (this.j) {
            this.j.addElement(m11333858610097094041);
        }
    }

    public final void k(byte[] bArr) {
        J15730374346044043770 j15730374346044043770 = this.a;
        synchronized (((Vector) j15730374346044043770.c)) {
            try {
                ((Vector) j15730374346044043770.c).addElement(bArr);
                if (((Vector) j15730374346044043770.c).size() > 100) {
                    throw new IOException("Error: the peer is not consuming our asynchronous replies.");
                }
                if (((U3506079075055770632) j15730374346044043770.d) == null) {
                    j15730374346044043770.X();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(byte[] bArr) {
        synchronized (this.e) {
            try {
                if (this.g != null) {
                    throw ((IOException) new IOException("Sorry, this connection is closed.").initCause(this.g));
                }
                this.f = true;
                try {
                    this.h.c(bArr);
                } catch (IOException e) {
                    b(e, false);
                    throw e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(byte[] bArr) {
        if (Thread.currentThread() == this.k) {
            Q11088980322693754445.h("Assertion error: sendMessage may never be invoked by the receiver thread!");
            return;
        }
        synchronized (this.e) {
            while (this.g == null) {
                try {
                    if (this.f) {
                        try {
                            this.e.wait(f491o);
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    } else {
                        try {
                            this.h.c(bArr);
                        } catch (IOException e) {
                            b(e, false);
                            throw e;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
                throw th;
            }
            throw ((IOException) new IOException("Sorry, this connection is closed.").initCause(this.g));
        }
    }

    static {
        izmyclvb.qgayjvbiagej2(44);
        f491o = Long.parseLong(System.getProperty(T1177712003054613961.class.getName().concat(".timeout"), "1200000"));
        r = Integer.getInteger(T1177712003054613961.class.getName().concat(".maxPacketSize"), 65536).intValue();
    }
}
