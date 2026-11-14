package dev.epro.go;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class Universe {

    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static final class proxyerror extends java.lang.Exception implements dev.epro.go.Seq.Proxy, dev.epro.go.error {
        private final int refnum;

        public proxyerror(int i) {
            this.refnum = i;
            dev.epro.go.Seq.trackGoRef(i, this);
        }

        @Override // dev.epro.go.error
        public native java.lang.String error();

        @Override // java.lang.Throwable
        public java.lang.String getMessage() {
            return error();
        }

        @Override // dev.epro.go.Seq.GoObject
        public final int incRefnum() {
            dev.epro.go.Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }
    }

    static {
        dev.epro.go.Seq.touch();
        _init();
    }

    private Universe() {
    }

    private static native void _init();

    public static void touch() {
    }
}
