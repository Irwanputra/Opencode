package dev.epro.r0;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class P15983149023236604271 extends UploadDataProvider {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ P15983149023236604271(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.a) {
            case 1:
                ((UploadDataProvider) this.b).close();
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        switch (this.a) {
            case 0:
                return ((ByteBuffer) this.b).limit();
            default:
                return ((UploadDataProvider) this.b).getLength();
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ByteBuffer byteBuffer2 = (ByteBuffer) obj;
                if (!byteBuffer.hasRemaining()) {
                    S10973172697741180971.m("Cronet passed a buffer with no bytes remaining");
                    break;
                } else {
                    if (byteBuffer.remaining() >= byteBuffer2.remaining()) {
                        byteBuffer.put(byteBuffer2);
                    } else {
                        int limit = byteBuffer2.limit();
                        byteBuffer.put(byteBuffer2);
                    }
                    uploadDataSink.onReadSucceeded(false);
                    break;
                }
            default:
                ((UploadDataProvider) obj).read(uploadDataSink, byteBuffer);
                break;
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                uploadDataSink.onRewindSucceeded();
                break;
            default:
                ((UploadDataProvider) obj).rewind(uploadDataSink);
                break;
        }
    }
}
