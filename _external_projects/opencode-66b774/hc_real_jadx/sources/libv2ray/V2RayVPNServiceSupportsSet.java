package libv2ray;

/* loaded from: /tmp/opencode/hc_real.dex */
public interface V2RayVPNServiceSupportsSet {
    long onEmitStatus(long j, String str);

    long prepare();

    long protect(long j);

    long setup(String str);

    long shutdown();
}
