package dev.epro.r0;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.util.Locale;
import org.chromium.net.UploadDataProvider;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class T15299836306962536625 implements R5909351061398077004 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ V15243060514859040546 c;

    public /* synthetic */ T15299836306962536625(V15243060514859040546 v15243060514859040546, boolean z, byte b) {
        this.a = b;
        this.c = v15243060514859040546;
        this.b = z;
    }

    @Override // dev.epro.r0.R5909351061398077004
    /* JADX INFO: renamed from: run */
    public final void mo18run() throws IOException {
        byte b = 1;
        byte b2 = 0;
        switch (this.a) {
            case 0:
                W7359389094007644644 w7359389094007644644 = (W7359389094007644644) this.c;
                boolean z = this.b;
                P15983149023236604271 p15983149023236604271 = w7359389094007644644.d;
                long length = ((UploadDataProvider) p15983149023236604271.b).getLength();
                w7359389094007644644.f = length;
                if (length != 0) {
                    if (length <= 0 || length >= 8192) {
                        w7359389094007644644.e = ByteBuffer.allocateDirect(8192);
                    } else {
                        w7359389094007644644.e = ByteBuffer.allocateDirect(((int) length) + 1);
                    }
                    long j = w7359389094007644644.f;
                    HttpURLConnection httpURLConnection = w7359389094007644644.i;
                    if (j > 0) {
                        httpURLConnection.setFixedLengthStreamingMode(j);
                    } else {
                        httpURLConnection.setChunkedStreamingMode(8192);
                    }
                    if (!z) {
                        w7359389094007644644.a.set(1);
                        p15983149023236604271.rewind(w7359389094007644644);
                    } else {
                        w7359389094007644644.a(new S8612901348883321174(w7359389094007644644.m, new Q9808704968580942152(w7359389094007644644, b2), (byte) 2), "startRead");
                    }
                } else {
                    if (w7359389094007644644.k != null && w7359389094007644644.j.compareAndSet(false, true)) {
                        w7359389094007644644.k.close();
                    }
                    Z11821137052809198413 z11821137052809198413 = w7359389094007644644.m;
                    z11821137052809198413.l = 13;
                    z11821137052809198413.c(new S8612901348883321174(z11821137052809198413, new U1304231070282229830(z11821137052809198413, b2), (byte) 2), "fireGetHeaders");
                }
                break;
            default:
                V15243060514859040546 v15243060514859040546 = this.c;
                boolean z2 = this.b;
                long j2 = v15243060514859040546.f;
                if (j2 != -1 && j2 - v15243060514859040546.g < v15243060514859040546.e.remaining()) {
                    v15243060514859040546.c(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", Long.valueOf(v15243060514859040546.g + ((long) v15243060514859040546.e.remaining())), Long.valueOf(v15243060514859040546.f))));
                } else if (v15243060514859040546.e.remaining() == 0 && !z2) {
                    v15243060514859040546.c(new IllegalStateException("Bytes read can't be zero except for last chunk!"));
                } else {
                    long j3 = v15243060514859040546.g;
                    ByteBuffer byteBuffer = v15243060514859040546.e;
                    W7359389094007644644 w73593890940076446442 = (W7359389094007644644) v15243060514859040546;
                    int iWrite = 0;
                    while (byteBuffer.hasRemaining()) {
                        iWrite += w73593890940076446442.k.write(byteBuffer);
                    }
                    w73593890940076446442.l.flush();
                    long j4 = j3 + ((long) iWrite);
                    v15243060514859040546.g = j4;
                    long j5 = v15243060514859040546.f;
                    if (j4 < j5 || (j5 == -1 && !z2)) {
                        v15243060514859040546.a.set(0);
                        v15243060514859040546.b(new Q9808704968580942152(v15243060514859040546, b), "readFromProvider");
                    } else if (j5 == -1) {
                        if (w73593890940076446442.k != null && w73593890940076446442.j.compareAndSet(false, true)) {
                            w73593890940076446442.k.close();
                        }
                        Z11821137052809198413 z118211370528091984132 = w73593890940076446442.m;
                        z118211370528091984132.l = 13;
                        z118211370528091984132.c(new S8612901348883321174(z118211370528091984132, new U1304231070282229830(z118211370528091984132, b2), (byte) 2), "fireGetHeaders");
                    } else if (j5 != j4) {
                        v15243060514859040546.c(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", Long.valueOf(v15243060514859040546.g), Long.valueOf(v15243060514859040546.f))));
                    } else {
                        if (w73593890940076446442.k != null && w73593890940076446442.j.compareAndSet(false, true)) {
                            w73593890940076446442.k.close();
                        }
                        Z11821137052809198413 z118211370528091984133 = w73593890940076446442.m;
                        z118211370528091984133.l = 13;
                        z118211370528091984133.c(new S8612901348883321174(z118211370528091984133, new U1304231070282229830(z118211370528091984133, b2), (byte) 2), "fireGetHeaders");
                    }
                }
                break;
        }
    }
}
