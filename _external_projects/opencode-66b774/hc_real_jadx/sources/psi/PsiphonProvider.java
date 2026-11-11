package psi;

/* loaded from: /tmp/opencode/hc_real.dex */
public interface PsiphonProvider extends PsiphonProviderNetwork, PsiphonProviderNoticeHandler {
    String bindToDevice(long j);

    @Override // psi.PsiphonProviderNetwork
    String getNetworkID();

    String getPrimaryDnsServer();

    String getSecondaryDnsServer();

    @Override // psi.PsiphonProviderNetwork
    long hasNetworkConnectivity();

    @Override // psi.PsiphonProviderNetwork
    String iPv6Synthesize(String str);

    void notice(String str);
}
