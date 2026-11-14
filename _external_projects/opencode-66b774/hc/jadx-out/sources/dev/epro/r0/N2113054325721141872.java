package dev.epro.r0;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public interface N2113054325721141872 {
    Set a();

    void connect(G10797274810599614742 g10797274810599614742);

    void disconnect(String str);

    J18325703078859211263[] getAvailableFeatures();

    void getEndpointPackageName();

    String getLastDisconnectMessage();

    int getMinApkVersion();

    void getRemoteService(W15728808418604800610 w15728808418604800610, Set set);

    boolean isConnected();

    boolean isConnecting();

    void onUserSignOut(M204440408817344908 m204440408817344908);

    boolean requiresSignIn();
}
