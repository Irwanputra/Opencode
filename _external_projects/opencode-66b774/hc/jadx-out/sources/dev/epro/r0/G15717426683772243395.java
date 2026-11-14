package dev.epro.r0;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.channels.ReadableByteChannel;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class G15717426683772243395 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Z11821137052809198413 b;

    public /* synthetic */ G15717426683772243395(Z11821137052809198413 z11821137052809198413, byte b) {
        this.a = b;
        this.b = z11821137052809198413;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 1;
        Z11821137052809198413 z11821137052809198413 = this.b;
        switch (b) {
            case 0:
                ReadableByteChannel readableByteChannel = z11821137052809198413.n;
                if (readableByteChannel != null) {
                    try {
                        readableByteChannel.close();
                        break;
                    } catch (IOException unused) {
                    }
                    z11821137052809198413.n = null;
                }
                break;
            case 1:
                z11821137052809198413.x++;
                break;
            case 2:
                W7359389094007644644 w7359389094007644644 = z11821137052809198413.r;
                if (w7359389094007644644 != null) {
                    try {
                        if (w7359389094007644644.k != null && w7359389094007644644.j.compareAndSet(false, true)) {
                            w7359389094007644644.k.close();
                        }
                        break;
                    } catch (IOException unused2) {
                    }
                }
                HttpURLConnection httpURLConnection = z11821137052809198413.q;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    z11821137052809198413.q = null;
                }
                break;
            default:
                z11821137052809198413.e.add(z11821137052809198413.m);
                z11821137052809198413.c(new S8612901348883321174(z11821137052809198413, new U1304231070282229830(z11821137052809198413, b2), (byte) 2), "fireOpenConnection");
                break;
        }
    }
}
