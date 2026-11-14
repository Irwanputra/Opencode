package dev.epro.r0;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P16444166814204621681 extends Thread {
    public OutputStream a;
    public InputStream b;
    public byte[] c = new byte[8192];
    public C16667689525325095505 d;
    public P16444166814204621681 e;
    public Socket f;
    public String g;
    public final /* synthetic */ U12010089116151325428 h;

    public P16444166814204621681(U12010089116151325428 u12010089116151325428, C16667689525325095505 c16667689525325095505, P16444166814204621681 p16444166814204621681, Socket socket, InputStream inputStream, OutputStream outputStream, String str) {
        this.h = u12010089116151325428;
        this.b = inputStream;
        this.a = outputStream;
        this.g = str;
        this.d = c16667689525325095505;
        this.e = p16444166814204621681;
        this.f = socket;
    }

    public final void a() {
        byte[] bArr = this.c;
        Socket socket = this.f;
        String str = this.g;
        C16667689525325095505 c16667689525325095505 = this.d;
        I13897573759869141187 i13897573759869141187 = c16667689525325095505.b;
        OutputStream outputStream = this.a;
        InputStream inputStream = this.b;
        P16444166814204621681 p16444166814204621681 = this.e;
        while (true) {
            try {
                try {
                    int i = inputStream.read(bArr);
                    if (i <= 0) {
                        try {
                            break;
                        } catch (IOException unused) {
                        }
                    } else {
                        outputStream.write(bArr, 0, i);
                        outputStream.flush();
                    }
                } catch (IOException e) {
                    try {
                        i13897573759869141187.d(c16667689525325095505, "Closed due to exception in StreamForwarder (" + str + "): " + e.getMessage());
                    } catch (IOException unused2) {
                    }
                    try {
                        outputStream.close();
                    } catch (IOException unused3) {
                    }
                    try {
                        inputStream.close();
                    } catch (IOException unused4) {
                    }
                    if (p16444166814204621681 == null) {
                        return;
                    }
                    while (p16444166814204621681.isAlive()) {
                        try {
                            p16444166814204621681.join();
                        } catch (InterruptedException unused5) {
                        }
                    }
                    try {
                        i13897573759869141187.d(c16667689525325095505, "StreamForwarder (" + str + ") is cleaning up the connection");
                    } catch (IOException unused6) {
                    }
                    if (socket == null) {
                        return;
                    }
                }
            } finally {
            }
        }
        outputStream.close();
        try {
            inputStream.close();
        } catch (IOException unused7) {
        }
        if (p16444166814204621681 != null) {
            while (p16444166814204621681.isAlive()) {
                try {
                    p16444166814204621681.join();
                } catch (InterruptedException unused8) {
                }
            }
            try {
                i13897573759869141187.d(c16667689525325095505, "StreamForwarder (" + str + ") is cleaning up the connection");
            } catch (IOException unused9) {
            }
            if (socket == null) {
                return;
            }
            try {
                socket.close();
            } catch (IOException unused10) {
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        U12010089116151325428 u12010089116151325428 = this.h;
        try {
            a();
        } finally {
            u12010089116151325428.d();
        }
    }
}
