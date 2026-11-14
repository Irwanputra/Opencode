package dev.epro.r0;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.atomic.AtomicBoolean;
import net.zetetic.database.CursorWindow;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R7728994933712354398 implements ReadableByteChannel {
    public final InputStream a;
    public final AtomicBoolean b = new AtomicBoolean(true);

    public R7728994933712354398(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.b.compareAndSet(true, false)) {
            this.a.close();
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.b.get();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) throws IOException {
        boolean zHasArray = byteBuffer.hasArray();
        InputStream inputStream = this.a;
        if (!zHasArray) {
            byte[] bArr = new byte[Math.min(CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE, Math.min(Math.max(inputStream.available(), 4096), byteBuffer.remaining()))];
            int i = inputStream.read(bArr);
            if (i > 0) {
                byteBuffer.put(bArr, 0, i);
            }
            return i;
        }
        int i2 = inputStream.read(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
        if (i2 > 0) {
        }
        return i2;
    }
}
