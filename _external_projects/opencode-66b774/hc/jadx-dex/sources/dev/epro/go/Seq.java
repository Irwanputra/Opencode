package dev.epro.go;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class Seq {
    private static final int NULL_REFNUM = 41;
    static final dev.epro.go.Seq.RefTracker tracker;
    private static java.util.logging.Logger log = java.util.logging.Logger.getLogger("GoSeq");
    public static final dev.epro.go.Seq.Ref nullRef = new dev.epro.go.Seq.Ref(41, null);
    private static final dev.epro.go.Seq.GoRefQueue goRefQueue = new dev.epro.go.Seq.GoRefQueue();

    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public interface GoObject {
        int incRefnum();
    }

    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static class GoRef extends java.lang.ref.PhantomReference<dev.epro.go.Seq.GoObject> {
        final int refnum;

        public GoRef(int i, dev.epro.go.Seq.GoObject goObject, dev.epro.go.Seq.GoRefQueue goRefQueue) {
            super(goObject, goRefQueue);
            if (i <= 0) {
                this.refnum = i;
            } else {
                dev.epro.r0.K2042933864045806308.i(dev.epro.r0.G6547577305291411977.n(i, "GoRef instantiated with a Java refnum "));
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static class GoRefQueue extends java.lang.ref.ReferenceQueue<dev.epro.go.Seq.GoObject> {
        private final java.util.Collection<dev.epro.go.Seq.GoRef> refs = java.util.Collections.synchronizedCollection(new java.util.HashSet());

        public GoRefQueue() {
            java.lang.Thread thread = new java.lang.Thread(new java.lang.Runnable() { // from class: dev.epro.go.Seq.GoRefQueue.1
                @Override // java.lang.Runnable
                public void run() {
                    while (true) {
                        try {
                            dev.epro.go.Seq.GoRef goRef = (dev.epro.go.Seq.GoRef) dev.epro.go.Seq.GoRefQueue.this.remove();
                            dev.epro.go.Seq.GoRefQueue.this.refs.remove(goRef);
                            dev.epro.go.Seq.destroyRef(goRef.refnum);
                            goRef.clear();
                        } catch (java.lang.InterruptedException unused) {
                        }
                    }
                }
            });
            thread.setDaemon(true);
            thread.setName("GoRefQueue Finalizer Thread");
            thread.start();
        }

        public void track(int i, dev.epro.go.Seq.GoObject goObject) {
            this.refs.add(new dev.epro.go.Seq.GoRef(i, goObject, this));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public interface Proxy extends dev.epro.go.Seq.GoObject {
    }

    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static final class Ref {
        public final java.lang.Object obj;
        private int refcnt;
        public final int refnum;

        public Ref(int i, java.lang.Object obj) {
            if (i < 0) {
                dev.epro.r0.K2042933864045806308.i(dev.epro.r0.G6547577305291411977.n(i, "Ref instantiated with a Go refnum "));
                throw null;
            }
            this.refnum = i;
            this.refcnt = 0;
            this.obj = obj;
        }

        public static /* synthetic */ int access$110(dev.epro.go.Seq.Ref ref) {
            int i = ref.refcnt;
            ref.refcnt = i - 1;
            return i;
        }

        public void inc() {
            int i = this.refcnt;
            if (i != Integer.MAX_VALUE) {
                this.refcnt = i + 1;
            } else {
                dev.epro.r0.K2042933864045806308.i(dev.epro.r0.E12098517352909843120.n(new java.lang.StringBuilder("refnum "), this.refnum, " overflow"));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static final class RefMap {
        private int next = 0;
        private int live = 0;
        private int[] keys = new int[16];
        private dev.epro.go.Seq.Ref[] objs = new dev.epro.go.Seq.Ref[16];

        private void grow() {
            dev.epro.go.Seq.Ref[] refArr;
            int iRoundPow2 = roundPow2(this.live) * 2;
            int[] iArr = this.keys;
            if (iRoundPow2 > iArr.length) {
                iArr = new int[iArr.length * 2];
                refArr = new dev.epro.go.Seq.Ref[this.objs.length * 2];
            } else {
                refArr = this.objs;
            }
            int i = 0;
            int i2 = 0;
            while (true) {
                int[] iArr2 = this.keys;
                if (i >= iArr2.length) {
                    break;
                }
                dev.epro.go.Seq.Ref ref = this.objs[i];
                if (ref != null) {
                    iArr[i2] = iArr2[i];
                    refArr[i2] = ref;
                    i2++;
                }
                i++;
            }
            for (int i3 = i2; i3 < iArr.length; i3++) {
                iArr[i3] = 0;
                refArr[i3] = null;
            }
            this.keys = iArr;
            this.objs = refArr;
            this.next = i2;
            if (this.live == i2) {
                return;
            }
            throw new java.lang.RuntimeException("bad state: live=" + this.live + ", next=" + this.next);
        }

        private static int roundPow2(int i) {
            int i2 = 1;
            while (i2 < i) {
                i2 *= 2;
            }
            return i2;
        }

        public dev.epro.go.Seq.Ref get(int i) {
            int iBinarySearch = java.util.Arrays.binarySearch(this.keys, 0, this.next, i);
            if (iBinarySearch >= 0) {
                return this.objs[iBinarySearch];
            }
            return null;
        }

        public void put(int i, dev.epro.go.Seq.Ref ref) {
            if (ref == null) {
                dev.epro.r0.K2042933864045806308.i(dev.epro.r0.G6547577305291411977.o(i, "put a null ref (with key ", ")"));
                return;
            }
            int iBinarySearch = java.util.Arrays.binarySearch(this.keys, 0, this.next, i);
            if (iBinarySearch >= 0) {
                dev.epro.go.Seq.Ref[] refArr = this.objs;
                if (refArr[iBinarySearch] == null) {
                    refArr[iBinarySearch] = ref;
                    this.live++;
                }
                if (refArr[iBinarySearch] == ref) {
                    return;
                }
                dev.epro.r0.K2042933864045806308.i(dev.epro.r0.G6547577305291411977.o(i, "replacing an existing ref (with key ", ")"));
                return;
            }
            if (this.next >= this.keys.length) {
                grow();
                iBinarySearch = java.util.Arrays.binarySearch(this.keys, 0, this.next, i);
            }
            int i2 = ~iBinarySearch;
            int i3 = this.next;
            if (i2 < i3) {
                int[] iArr = this.keys;
                int i4 = i2 + 1;
                java.lang.System.arraycopy(iArr, i2, iArr, i4, i3 - i2);
                dev.epro.go.Seq.Ref[] refArr2 = this.objs;
                java.lang.System.arraycopy(refArr2, i2, refArr2, i4, this.next - i2);
            }
            this.keys[i2] = i;
            this.objs[i2] = ref;
            this.live++;
            this.next++;
        }

        public void remove(int i) {
            int iBinarySearch = java.util.Arrays.binarySearch(this.keys, 0, this.next, i);
            if (iBinarySearch >= 0) {
                dev.epro.go.Seq.Ref[] refArr = this.objs;
                if (refArr[iBinarySearch] != null) {
                    refArr[iBinarySearch] = null;
                    this.live--;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static final class RefTracker {
        private static final int REF_OFFSET = 42;
        private int next = 42;
        private final dev.epro.go.Seq.RefMap javaObjs = new dev.epro.go.Seq.RefMap();
        private final java.util.IdentityHashMap<java.lang.Object, java.lang.Integer> javaRefs = new java.util.IdentityHashMap<>();

        public synchronized void dec(int i) {
            if (i <= 0) {
                dev.epro.go.Seq.log.getClass();
                return;
            }
            if (i == dev.epro.go.Seq.nullRef.refnum) {
                return;
            }
            dev.epro.go.Seq.Ref ref = this.javaObjs.get(i);
            if (ref == null) {
                throw new java.lang.RuntimeException("referenced Java object is not found: refnum=" + i);
            }
            dev.epro.go.Seq.Ref.access$110(ref);
            if (ref.refcnt <= 0) {
                this.javaObjs.remove(i);
                this.javaRefs.remove(ref.obj);
            }
        }

        public synchronized dev.epro.go.Seq.Ref get(int i) {
            if (i < 0) {
                throw new java.lang.RuntimeException("ref called with Go refnum " + i);
            }
            if (i == 41) {
                return dev.epro.go.Seq.nullRef;
            }
            dev.epro.go.Seq.Ref ref = this.javaObjs.get(i);
            if (ref != null) {
                return ref;
            }
            throw new java.lang.RuntimeException("unknown java Ref: " + i);
        }

        public synchronized int inc(java.lang.Object obj) {
            if (obj == null) {
                return 41;
            }
            if (obj instanceof dev.epro.go.Seq.Proxy) {
                return ((dev.epro.go.Seq.Proxy) obj).incRefnum();
            }
            java.lang.Integer numValueOf = this.javaRefs.get(obj);
            if (numValueOf == null) {
                int i = this.next;
                if (i == Integer.MAX_VALUE) {
                    throw new java.lang.RuntimeException("createRef overflow for " + obj);
                }
                this.next = i + 1;
                numValueOf = java.lang.Integer.valueOf(i);
                this.javaRefs.put(obj, numValueOf);
            }
            int iIntValue = numValueOf.intValue();
            dev.epro.go.Seq.Ref ref = this.javaObjs.get(iIntValue);
            if (ref == null) {
                ref = new dev.epro.go.Seq.Ref(iIntValue, obj);
                this.javaObjs.put(iIntValue, ref);
            }
            ref.inc();
            return iIntValue;
        }

        public synchronized void incRefnum(int i) {
            dev.epro.go.Seq.Ref ref = this.javaObjs.get(i);
            if (ref == null) {
                throw new java.lang.RuntimeException("referenced Java object is not found: refnum=" + i);
            }
            ref.inc();
        }
    }

    static {
        java.lang.System.loadLibrary("aio");
        init();
        dev.epro.go.Universe.touch();
        tracker = new dev.epro.go.Seq.RefTracker();
    }

    private Seq() {
    }

    public static void decRef(int i) {
        tracker.dec(i);
    }

    public static native void destroyRef(int i);

    public static dev.epro.go.Seq.Ref getRef(int i) {
        return tracker.get(i);
    }

    public static int incGoObjectRef(dev.epro.go.Seq.GoObject goObject) {
        return goObject.incRefnum();
    }

    public static native void incGoRef(int i, dev.epro.go.Seq.GoObject goObject);

    public static int incRef(java.lang.Object obj) {
        return tracker.inc(obj);
    }

    public static void incRefnum(int i) {
        tracker.incRefnum(i);
    }

    private static native void init();

    public static void setContext(android.content.Context context) {
        setContext((java.lang.Object) context);
    }

    public static native void setContext(java.lang.Object obj);

    public static void trackGoRef(int i, dev.epro.go.Seq.GoObject goObject) {
        if (i <= 0) {
            goRefQueue.track(i, goObject);
        } else {
            dev.epro.r0.K2042933864045806308.i(dev.epro.r0.G6547577305291411977.n(i, "trackGoRef called with Java refnum "));
        }
    }

    public static void touch() {
    }
}
