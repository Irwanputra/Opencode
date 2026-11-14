package androidx.graphics.path;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class PathIteratorPreApi34Impl {
    static {
        java.lang.System.loadLibrary("androidx.graphics.path");
    }

    private final native long createInternalPathIterator(android.graphics.Path path, int i, float f);

    private final native void destroyInternalPathIterator(long j);

    @dalvik.annotation.optimization.FastNative
    private final native boolean internalPathIteratorHasNext(long j);

    @dalvik.annotation.optimization.FastNative
    private final native int internalPathIteratorNext(long j, float[] fArr, int i);

    @dalvik.annotation.optimization.FastNative
    private final native int internalPathIteratorPeek(long j);

    @dalvik.annotation.optimization.FastNative
    private final native int internalPathIteratorRawSize(long j);

    @dalvik.annotation.optimization.FastNative
    private final native int internalPathIteratorSize(long j);

    public final void finalize() {
        destroyInternalPathIterator(0L);
    }
}
