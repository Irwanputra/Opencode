package dev.epro.r0;

import android.net.http.BidirectionalStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalBidirectionalStream;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J3014650008080165576 extends ExperimentalBidirectionalStream {
    public final BidirectionalStream a;
    public final F10736675061244242991 b;
    public final String c;
    public final Collection d;

    public J3014650008080165576(BidirectionalStream bidirectionalStream, F10736675061244242991 f10736675061244242991, String str, Collection collection) {
        this.a = bidirectionalStream;
        this.b = f10736675061244242991;
        this.c = str;
        this.d = collection;
    }

    public final void a(int i, V14822036933104273045 v14822036933104273045, CronetException cronetException) {
        W13904991817818359627.a(this.b, this.c, this.d, null, i, v14822036933104273045, cronetException);
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void cancel() {
        this.a.cancel();
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void flush() {
        this.a.flush();
    }

    @Override // org.chromium.net.BidirectionalStream
    public final boolean isDone() {
        boolean isDone;
        isDone = this.a.isDone();
        return isDone;
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void read(ByteBuffer byteBuffer) {
        this.a.read(byteBuffer);
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void start() {
        this.a.start();
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void write(ByteBuffer byteBuffer, boolean z) {
        this.a.write(byteBuffer, z);
    }
}
