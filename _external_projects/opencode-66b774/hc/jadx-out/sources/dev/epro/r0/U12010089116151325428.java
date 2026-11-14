package dev.epro.r0;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class U12010089116151325428 implements Runnable {
    public V10300877997588547986 a;
    public final Socket b;
    public InputStream c;
    public OutputStream d;
    public S7384666539529547401 e;
    public boolean f;
    public final AtomicInteger g = new AtomicInteger(1);
    public final /* synthetic */ J16818366091903755451 h;

    public U12010089116151325428(J16818366091903755451 j16818366091903755451, V10300877997588547986 v10300877997588547986, Socket socket) {
        this.h = j16818366091903755451;
        this.a = v10300877997588547986;
        this.b = socket;
        j16818366091903755451.setName("DynamicAcceptRunnable");
    }

    public final void a(P16444166814204621681 p16444166814204621681) throws IOException {
        this.g.incrementAndGet();
        try {
            p16444166814204621681.setDaemon(true);
            p16444166814204621681.start();
        } catch (OutOfMemoryError e) {
            d();
            Z3383101362411723454.q("Could not start SOCKS forwarding worker", e);
        }
    }

    public final void b(C16667689525325095505 c16667689525325095505) throws IOException {
        try {
            P16444166814204621681 p16444166814204621681 = new P16444166814204621681(this, c16667689525325095505, null, null, (T8548489830177605674) c16667689525325095505.d.b, this.d, "RemoteToLocal");
            P16444166814204621681 p164441668142046216812 = new P16444166814204621681(this, c16667689525325095505, p16444166814204621681, this.b, this.c, c16667689525325095505.c, "LocalToRemote");
            a(p16444166814204621681);
            a(p164441668142046216812);
            this.f = true;
        } catch (OutOfMemoryError e) {
            Z3383101362411723454.q("Could not allocate SOCKS forwarding worker", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [dev.epro.r0.S7384666539529547401, dev.epro.r0.W93717663648739973] */
    /* JADX WARN: Type inference failed for: r2v6, types: [dev.epro.r0.S7384666539529547401] */
    /* JADX WARN: Type inference failed for: r2v8, types: [dev.epro.r0.N14053612894154340932, dev.epro.r0.S7384666539529547401] */
    public final void c() throws IOException {
        ?? w93717663648739973;
        InetAddress byName;
        boolean z;
        boolean z2;
        Socket socket = this.b;
        socket.setSoTimeout(60000);
        try {
            this.a.getClass();
            V10300877997588547986 v10300877997588547986C = V10300877997588547986.C(socket);
            this.a = v10300877997588547986C;
            if (v10300877997588547986C == null) {
                J16818366091903755451.e.getClass();
                return;
            }
            PushbackInputStream pushbackInputStream = (PushbackInputStream) v10300877997588547986C.b;
            this.c = pushbackInputStream;
            this.d = (OutputStream) v10300877997588547986C.c;
            if (pushbackInputStream == null) {
                pushbackInputStream = new PushbackInputStream(pushbackInputStream);
            }
            int i = pushbackInputStream.read();
            pushbackInputStream.unread(i);
            if (i == 5) {
                w93717663648739973 = new N14053612894154340932();
                w93717663648739973.h = null;
                w93717663648739973.a = null;
                DataInputStream dataInputStream = new DataInputStream(pushbackInputStream);
                w93717663648739973.b = dataInputStream.readUnsignedByte();
                w93717663648739973.d = dataInputStream.readUnsignedByte();
                dataInputStream.readUnsignedByte();
                int unsignedByte = dataInputStream.readUnsignedByte();
                w93717663648739973.g = unsignedByte;
                if (unsignedByte == 1) {
                    byte[] bArr = new byte[4];
                    dataInputStream.readFully(bArr);
                    w93717663648739973.e = S7384666539529547401.a(bArr);
                } else if (unsignedByte == 3) {
                    byte[] bArr2 = new byte[dataInputStream.readUnsignedByte()];
                    dataInputStream.readFully(bArr2);
                    w93717663648739973.e = new String(bArr2);
                } else {
                    if (unsignedByte != 4) {
                        throw new T18240948269476143335(393216);
                    }
                    byte[] bArr3 = new byte[16];
                    dataInputStream.readFully(bArr3);
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < 16; i2 += 2) {
                        if (i2 > 0) {
                            sb.append(':');
                        }
                        sb.append(Integer.toHexString(((bArr3[i2] & 255) << 8) | (bArr3[i2 + 1] & 255)));
                    }
                    w93717663648739973.e = sb.toString();
                }
                w93717663648739973.c = dataInputStream.readUnsignedShort();
                if (w93717663648739973.g != 3) {
                    try {
                        w93717663648739973.a = InetAddress.getByName(w93717663648739973.e);
                    } catch (UnknownHostException unused) {
                    }
                }
            } else {
                if (i != 4) {
                    throw new T18240948269476143335(1);
                }
                w93717663648739973 = new W93717663648739973();
                w93717663648739973.g = null;
                DataInputStream dataInputStream2 = new DataInputStream(pushbackInputStream);
                w93717663648739973.b = dataInputStream2.readUnsignedByte();
                w93717663648739973.d = dataInputStream2.readUnsignedByte();
                w93717663648739973.c = dataInputStream2.readUnsignedShort();
                byte[] bArr4 = new byte[4];
                dataInputStream2.readFully(bArr4);
                if (bArr4[0] == 0 && bArr4[1] == 0 && bArr4[2] == 0 && bArr4[3] != 0) {
                    z = true;
                } else {
                    try {
                        byName = InetAddress.getByName(S7384666539529547401.a(bArr4));
                    } catch (UnknownHostException unused2) {
                        byName = null;
                    }
                    w93717663648739973.a = byName;
                    w93717663648739973.e = byName.getHostName();
                    z = false;
                }
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    int i3 = pushbackInputStream.read();
                    if (i3 == 0) {
                        break;
                    } else {
                        sb2.append((char) i3);
                    }
                }
                w93717663648739973.f = sb2.toString();
                if (z) {
                    sb2.setLength(0);
                    while (true) {
                        int i4 = pushbackInputStream.read();
                        if (i4 == 0) {
                            break;
                        } else {
                            sb2.append((char) i4);
                        }
                    }
                    w93717663648739973.e = sb2.toString();
                }
            }
            this.e = w93717663648739973;
            this.a.getClass();
            if (w93717663648739973.d != 1) {
                throw new T18240948269476143335(7);
            }
            I13897573759869141187 i13897573759869141187 = this.h.a;
            String hostAddress = w93717663648739973.e;
            InetAddress inetAddress = w93717663648739973.a;
            if (inetAddress != null) {
                hostAddress = inetAddress.getHostAddress();
            }
            J16818366091903755451.e.getClass();
            try {
                C16667689525325095505 c16667689525325095505O = i13897573759869141187.o(w93717663648739973.c, hostAddress);
                try {
                    socket.setSoTimeout(0);
                    (w93717663648739973 instanceof N14053612894154340932 ? new N14053612894154340932(0, ((N14053612894154340932) w93717663648739973).g == 4 ? InetAddress.getByName("::") : null, 0) : new W93717663648739973(0, 90, null, 0, null)).b(this.d);
                    b(c16667689525325095505O);
                    if (z2) {
                        return;
                    }
                    try {
                        i13897573759869141187.d(c16667689525325095505O, "SOCKS forwarding setup failed");
                    } catch (IOException unused3) {
                    }
                } finally {
                    if (!this.f) {
                        try {
                            i13897573759869141187.d(c16667689525325095505O, "SOCKS forwarding setup failed");
                        } catch (IOException unused4) {
                        }
                    }
                }
            } catch (IOException e) {
                Z17301329922361444493 z17301329922361444493 = J16818366091903755451.e;
                e.getMessage();
                z17301329922361444493.getClass();
                try {
                    (w93717663648739973 instanceof N14053612894154340932 ? new N14053612894154340932(1) : new W93717663648739973()).b(this.d);
                } catch (IOException unused5) {
                }
                throw e;
            }
        } catch (IOException unused6) {
            J16818366091903755451.e.getClass();
            this.a = null;
        }
    }

    public final void d() {
        if (this.g.decrementAndGet() == 0) {
            Socket socket = this.b;
            J16818366091903755451 j16818366091903755451 = this.h;
            j16818366091903755451.a(socket);
            j16818366091903755451.b.release();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0009 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r4 = this;
            java.net.Socket r0 = r4.b
            r4.c()     // Catch: java.lang.Throwable -> L10 java.io.IOException -> L12
            boolean r1 = r4.f
            if (r1 != 0) goto Lc
        L9:
            r0.close()     // Catch: java.io.IOException -> Lc
        Lc:
            r4.d()
            goto L58
        L10:
            r1 = move-exception
            goto L59
        L12:
            r1 = move-exception
            boolean r2 = r1 instanceof dev.epro.r0.T18240948269476143335     // Catch: java.lang.Throwable -> L10
            r3 = 1
            if (r2 == 0) goto L1d
            dev.epro.r0.T18240948269476143335 r1 = (dev.epro.r0.T18240948269476143335) r1     // Catch: java.lang.Throwable -> L10
            int r1 = r1.b     // Catch: java.lang.Throwable -> L10
            goto L30
        L1d:
            boolean r2 = r1 instanceof java.net.NoRouteToHostException     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L23
            r1 = 4
            goto L30
        L23:
            boolean r2 = r1 instanceof java.net.ConnectException     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L29
            r1 = 5
            goto L30
        L29:
            boolean r1 = r1 instanceof java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L2f
            r1 = 6
            goto L30
        L2f:
            r1 = r3
        L30:
            r2 = 8
            if (r1 > r2) goto L38
            if (r1 >= 0) goto L37
            goto L38
        L37:
            r3 = r1
        L38:
            java.io.OutputStream r1 = r4.d     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto L3d
            goto L53
        L3d:
            dev.epro.r0.S7384666539529547401 r1 = r4.e     // Catch: java.lang.Throwable -> L10
            boolean r1 = r1 instanceof dev.epro.r0.W93717663648739973     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L49
            dev.epro.r0.W93717663648739973 r1 = new dev.epro.r0.W93717663648739973     // Catch: java.lang.Throwable -> L10
            r1.<init>()     // Catch: java.lang.Throwable -> L10
            goto L4e
        L49:
            dev.epro.r0.N14053612894154340932 r1 = new dev.epro.r0.N14053612894154340932     // Catch: java.lang.Throwable -> L10
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L10
        L4e:
            java.io.OutputStream r2 = r4.d     // Catch: java.lang.Throwable -> L10 java.io.IOException -> L53
            r1.b(r2)     // Catch: java.lang.Throwable -> L10 java.io.IOException -> L53
        L53:
            boolean r1 = r4.f
            if (r1 != 0) goto Lc
            goto L9
        L58:
            return
        L59:
            boolean r2 = r4.f
            if (r2 != 0) goto L60
            r0.close()     // Catch: java.io.IOException -> L60
        L60:
            r4.d()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.U12010089116151325428.run():void");
    }
}
