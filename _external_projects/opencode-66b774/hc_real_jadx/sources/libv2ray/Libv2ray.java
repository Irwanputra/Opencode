package libv2ray;

import go.Seq;

/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class Libv2ray {

    public static final class proxyV2RayVPNServiceSupportsSet implements Seq.Proxy, V2RayVPNServiceSupportsSet {
        private final int refnum;

        public proxyV2RayVPNServiceSupportsSet(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }

        @Override // go.Seq.GoObject
        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        @Override // libv2ray.V2RayVPNServiceSupportsSet
        public native long onEmitStatus(long j, String str);

        @Override // libv2ray.V2RayVPNServiceSupportsSet
        public native long prepare();

        @Override // libv2ray.V2RayVPNServiceSupportsSet
        public native long protect(long j);

        @Override // libv2ray.V2RayVPNServiceSupportsSet
        public native long setup(String str);

        @Override // libv2ray.V2RayVPNServiceSupportsSet
        public native long shutdown();
    }

    static {
        Seq.touch();
        _init();
    }

    private Libv2ray() {
    }

    private static native void _init();

    public static native long checkVersion();

    public static native String checkVersionX();

    public static native void initV2Env(String str);

    public static native V2RayPoint newV2RayPoint(V2RayVPNServiceSupportsSet v2RayVPNServiceSupportsSet);

    public static native void testConfig(String str);

    public static void touch() {
    }
}
