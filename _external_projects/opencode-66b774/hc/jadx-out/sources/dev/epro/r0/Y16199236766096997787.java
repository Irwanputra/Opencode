package dev.epro.r0;

import android.net.http.ConnectionMigrationOptions;
import android.net.http.DnsOptions;
import android.net.http.HttpEngine;
import android.net.http.QuicOptions;
import java.time.Duration;
import java.util.Date;
import java.util.Set;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Y16199236766096997787 extends ICronetEngineBuilder {
    public static boolean b;
    public static boolean c;
    public final HttpEngine.Builder a;

    public Y16199236766096997787(HttpEngine.Builder builder) {
        this.a = builder;
    }

    public static int a(int i) {
        int iA = L11610354117192841236.A(i);
        if (iA == 0) {
            return 0;
        }
        if (iA == 1) {
            return 1;
        }
        if (iA == 2) {
            return 2;
        }
        throw new AssertionError("Invalid OptionalBoolean value: ".concat(i != 1 ? i != 2 ? i != 3 ? "null" : "FALSE" : "TRUE" : "UNSET"));
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder addPublicKeyPins(String str, Set set, boolean z, Date date) {
        this.a.addPublicKeyPins(str, set, z, date.toInstant());
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder addQuicHint(String str, int i, int i2) {
        this.a.addQuicHint(str, i, i2);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ExperimentalCronetEngine build() {
        return new F10736675061244242991(this.a.build());
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableBrotli(boolean z) {
        this.a.setEnableBrotli(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableHttp2(boolean z) {
        this.a.setEnableHttp2(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableHttpCache(int i, long j) {
        this.a.setEnableHttpCache(i, j);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        if (!c) {
            c = true;
        }
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        this.a.setEnablePublicKeyPinningBypassForLocalTrustAnchors(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableQuic(boolean z) {
        this.a.setEnableQuic(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final String getDefaultUserAgent() {
        return this.a.getDefaultUserAgent();
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setExperimentalOptions(String str) {
        W9862291181433028285 w9862291181433028285 = new W9862291181433028285(str);
        HttpEngine.Builder builder = this.a;
        ConnectionMigrationOptions.Builder builder2 = new ConnectionMigrationOptions.Builder();
        builder2.setDefaultNetworkMigration(a(G11450220448113054352.a((Boolean) w9862291181433028285.b("QUIC", "migrate_sessions_on_network_change_v2", null, Boolean.class))));
        builder2.setPathDegradationMigration(a(G11450220448113054352.a((Boolean) w9862291181433028285.b("QUIC", "allow_port_migration", null, Boolean.class))));
        int iA = G11450220448113054352.a((Boolean) w9862291181433028285.b("QUIC", "migrate_sessions_early_v2", null, Boolean.class));
        builder2.setAllowNonDefaultNetworkUsage(a(iA));
        if (iA == 2) {
            builder2.setPathDegradationMigration(a(2));
        }
        builder.setConnectionMigrationOptions(builder2.build());
        HttpEngine.Builder builder3 = this.a;
        DnsOptions.StaleDnsOptions.Builder builder4 = new DnsOptions.StaleDnsOptions.Builder();
        int iIntValue = ((Integer) w9862291181433028285.b("StaleDNS", "delay_ms", -1, Integer.class)).intValue();
        if (iIntValue != -1) {
            builder4.setFreshLookupTimeout(Duration.ofMillis(iIntValue));
        }
        int iIntValue2 = ((Integer) w9862291181433028285.b("StaleDNS", "max_expired_time_ms", -1, Integer.class)).intValue();
        if (iIntValue2 != -1) {
            builder4.setMaxExpiredDelay(Duration.ofMillis(iIntValue2));
        }
        builder4.setAllowCrossNetworkUsage(a(G11450220448113054352.a((Boolean) w9862291181433028285.b("StaleDNS", "allow_other_network", null, Boolean.class)))).setUseStaleOnNameNotResolved(a(G11450220448113054352.a((Boolean) w9862291181433028285.b("StaleDNS", "use_stale_on_name_not_resolved", null, Boolean.class))));
        DnsOptions.Builder builder5 = new DnsOptions.Builder();
        builder5.setUseHttpStackDnsResolver(a(G11450220448113054352.a((Boolean) w9862291181433028285.b("AsyncDNS", "enable", null, Boolean.class)))).setStaleDns(a(G11450220448113054352.a((Boolean) w9862291181433028285.b("StaleDNS", "enable", null, Boolean.class)))).setStaleDnsOptions(builder4.build()).setPreestablishConnectionsToStaleDnsResults(a(G11450220448113054352.a((Boolean) w9862291181433028285.b("QUIC", "race_stale_dns_on_connection", null, Boolean.class)))).setPersistHostCache(a(G11450220448113054352.a((Boolean) w9862291181433028285.b("StaleDNS", "persist_to_disk", null, Boolean.class))));
        int iIntValue3 = ((Integer) w9862291181433028285.b("StaleDNS", "persist_delay_ms", -1, Integer.class)).intValue();
        if (iIntValue3 != -1) {
            builder5.setPersistHostCachePeriod(Duration.ofMillis(iIntValue3));
        }
        builder3.setDnsOptions(builder5.build());
        HttpEngine.Builder builder6 = this.a;
        QuicOptions.Builder builder7 = new QuicOptions.Builder();
        if (((String) w9862291181433028285.b("QUIC", "host_whitelist", null, String.class)) != null) {
            for (String str2 : ((String) w9862291181433028285.b("QUIC", "host_whitelist", null, String.class)).split(",")) {
                builder7.addAllowedQuicHost(str2);
            }
        }
        int iIntValue4 = ((Integer) w9862291181433028285.b("QUIC", "max_server_configs_stored_in_properties", -1, Integer.class)).intValue();
        if (iIntValue4 != -1) {
            builder7.setInMemoryServerConfigsCacheSize(iIntValue4);
        }
        String str3 = (String) w9862291181433028285.b("QUIC", "user_agent_id", null, String.class);
        if (str3 != null) {
            builder7.setHandshakeUserAgent(str3);
        }
        int iIntValue5 = ((Integer) w9862291181433028285.b("QUIC", "idle_connection_timeout_seconds", -1, Integer.class)).intValue();
        if (iIntValue5 != -1) {
            builder7.setIdleConnectionTimeout(Duration.ofSeconds(iIntValue5));
        }
        builder6.setQuicOptions(builder7.build());
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        if (!b) {
            b = true;
        }
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setStoragePath(String str) {
        this.a.setStoragePath(str);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setUserAgent(String str) {
        this.a.setUserAgent(str);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableSdch(boolean z) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setThreadPriority(int i) {
        return this;
    }
}
