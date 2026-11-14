package dev.epro.r0;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.concurrent.Semaphore;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J16818366091903755451 extends Thread {
    public static final Z17301329922361444493 e = Z17301329922361444493.a(J16818366091903755451.class);
    public final I13897573759869141187 a;
    public final ServerSocket c;
    public final Semaphore b = new Semaphore(64);
    public final HashSet d = new HashSet();

    public J16818366091903755451(I13897573759869141187 i13897573759869141187, InetSocketAddress inetSocketAddress) throws IOException {
        this.a = i13897573759869141187;
        ServerSocket serverSocket = new ServerSocket();
        this.c = serverSocket;
        serverSocket.setReuseAddress(true);
        serverSocket.bind(inetSocketAddress);
    }

    public final void a(Socket socket) {
        try {
            socket.close();
        } catch (IOException unused) {
        }
        synchronized (this.d) {
            this.d.remove(socket);
        }
    }

    public final void b(Socket socket) {
        V10300877997588547986 v10300877997588547986 = new V10300877997588547986((byte) 21, false);
        v10300877997588547986.b = null;
        v10300877997588547986.c = null;
        U12010089116151325428 u12010089116151325428 = new U12010089116151325428(this, v10300877997588547986, socket);
        try {
            Thread thread = new Thread(u12010089116151325428);
            thread.setDaemon(true);
            thread.start();
        } catch (OutOfMemoryError unused) {
            u12010089116151325428.d();
        }
    }

    public final void c() {
        int i;
        Socket[] socketArr;
        try {
            this.c.close();
        } catch (IOException unused) {
        }
        interrupt();
        synchronized (this.d) {
            socketArr = (Socket[]) this.d.toArray(new Socket[0]);
        }
        for (Socket socket : socketArr) {
            try {
                socket.close();
            } catch (IOException unused2) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0056  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r3 = this;
            dev.epro.r0.I13897573759869141187 r0 = r3.a     // Catch: java.io.IOException -> L76
            java.util.Vector r1 = r0.i     // Catch: java.io.IOException -> L76
            monitor-enter(r1)     // Catch: java.io.IOException -> L76
            boolean r2 = r0.j     // Catch: java.lang.Throwable -> L6a
            if (r2 == 0) goto L6c
            java.util.Vector r0 = r0.i     // Catch: java.lang.Throwable -> L6a
            r0.addElement(r3)     // Catch: java.lang.Throwable -> L6a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6a
        Lf:
            java.util.concurrent.Semaphore r0 = r3.b     // Catch: java.lang.InterruptedException -> L5f
            r0.acquire()     // Catch: java.lang.InterruptedException -> L5f
            r0 = 0
            java.net.ServerSocket r1 = r3.c     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L46
            java.net.Socket r0 = r1.accept()     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L46
            java.util.HashSet r1 = r3.d     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L46
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L46
            java.net.ServerSocket r2 = r3.c     // Catch: java.lang.Throwable -> L2a
            boolean r2 = r2.isClosed()     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L38
            r0.close()     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            goto L2c
        L2a:
            r2 = move-exception
            goto L44
        L2c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L32
            r3.a(r0)
        L32:
            java.util.concurrent.Semaphore r3 = r3.b
            r3.release()
            return
        L38:
            java.util.HashSet r2 = r3.d     // Catch: java.lang.Throwable -> L2a
            r2.add(r0)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2a
            r3.b(r0)     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L46
            goto Lf
        L42:
            r1 = move-exception
            goto L54
        L44:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2a
            throw r2     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L46
        L46:
            r3.c()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L4e
            r3.a(r0)
        L4e:
            java.util.concurrent.Semaphore r3 = r3.b
            r3.release()
            return
        L54:
            if (r0 == 0) goto L59
            r3.a(r0)
        L59:
            java.util.concurrent.Semaphore r3 = r3.b
            r3.release()
            throw r1
        L5f:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            r3.c()
            return
        L6a:
            r0 = move-exception
            goto L74
        L6c:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L6a
            java.lang.String r2 = "Too late, this connection is closed."
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L6a
            throw r0     // Catch: java.lang.Throwable -> L6a
        L74:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6a
            throw r0     // Catch: java.io.IOException -> L76
        L76:
            r3.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J16818366091903755451.run():void");
    }
}
