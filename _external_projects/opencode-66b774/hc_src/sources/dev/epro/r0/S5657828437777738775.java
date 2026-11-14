package dev.epro.r0;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class S5657828437777738775 extends UploadDataProvider {
    public volatile FileChannel a;
    public final M9197813449740923653 b;
    public final Object c = new Object();

    public S5657828437777738775(M9197813449740923653 m9197813449740923653) {
        this.b = m9197813449740923653;
    }

    public final FileChannel b() {
        if (this.a == null) {
            synchronized (this.c) {
                try {
                    if (this.a == null) {
                        this.a = this.b.e();
                    }
                } finally {
                }
            }
        }
        return this.a;
    }

    @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        FileChannel fileChannel = this.a;
        if (fileChannel != null) {
            fileChannel.close();
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return b().size();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            S10973172697741180971.m("Cronet passed a buffer with no bytes remaining");
            return;
        }
        FileChannel b = b();
        int i = 0;
        while (i == 0) {
            int read = b.read(byteBuffer);
            if (read == -1) {
                break;
            } else {
                i += read;
            }
        }
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        b().position(0L);
        uploadDataSink.onRewindSucceeded();
    }
}
