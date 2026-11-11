.class public Lca/psiphon/PsiphonTunnel;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lca/psiphon/PsiphonTunnel$〺つふすそ;,
        Lca/psiphon/PsiphonTunnel$びぐびあび;,
        Lca/psiphon/PsiphonTunnel$づざかべべ;,
        Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;
    }
.end annotation


# static fields
.field private static final DEFAULT_PRIMARY_DNS_SERVER:Ljava/lang/String; = "8.8.4.4"

.field private static final DEFAULT_SECONDARY_DNS_SERVER:Ljava/lang/String; = "8.8.8.8"

.field private static final UDPGW_SERVER_PORT:I = 0x1c84

.field private static final VPN_INTERFACE_MTU:I = 0x5dc

.field private static final VPN_INTERFACE_NETMASK:Ljava/lang/String; = "255.255.255.0"

.field private static mPsiphonTunnel:Lca/psiphon/PsiphonTunnel;


# instance fields
.field private mClientPlatformPrefix:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mClientPlatformSuffix:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

.field private mIsWaitingForNetworkConnectivity:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private mLocalSocksProxyPort:Ljava/util/concurrent/atomic/AtomicInteger;

.field private mPrivateAddress:Lca/psiphon/PsiphonTunnel$びぐびあび;

.field private mRoutingThroughTunnel:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final mShouldRouteThroughTunnelAutomatically:Z

.field private mTun2SocksThread:Ljava/lang/Thread;

.field private mTunFd:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Landroid/os/ParcelFileDescriptor;",
            ">;"
        }
    .end annotation
.end field

.field private mVpnMode:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method private constructor <init>(Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;Z)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lca/psiphon/PsiphonTunnel;->mVpnMode:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lca/psiphon/PsiphonTunnel;->mTunFd:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p1, p0, Lca/psiphon/PsiphonTunnel;->mLocalSocksProxyPort:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lca/psiphon/PsiphonTunnel;->mRoutingThroughTunnel:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lca/psiphon/PsiphonTunnel;->mIsWaitingForNetworkConnectivity:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    const-string v0, ""

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lca/psiphon/PsiphonTunnel;->mClientPlatformPrefix:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lca/psiphon/PsiphonTunnel;->mClientPlatformSuffix:Ljava/util/concurrent/atomic/AtomicReference;

    iput-boolean p2, p0, Lca/psiphon/PsiphonTunnel;->mShouldRouteThroughTunnelAutomatically:Z

    return-void
.end method

.method public static synthetic access$000(Lca/psiphon/PsiphonTunnel;Ljava/lang/String;)V
    .registers 2

    invoke-direct {p0, p1}, Lca/psiphon/PsiphonTunnel;->notice(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic access$100(Lca/psiphon/PsiphonTunnel;J)Ljava/lang/String;
    .registers 3

    invoke-direct {p0, p1, p2}, Lca/psiphon/PsiphonTunnel;->bindToDevice(J)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$200(Lca/psiphon/PsiphonTunnel;)J
    .registers 3

    invoke-direct {p0}, Lca/psiphon/PsiphonTunnel;->hasNetworkConnectivity()J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic access$300(Lca/psiphon/PsiphonTunnel;)Ljava/lang/String;
    .registers 1

    invoke-direct {p0}, Lca/psiphon/PsiphonTunnel;->getPrimaryDnsServer()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$400(Lca/psiphon/PsiphonTunnel;)Ljava/lang/String;
    .registers 1

    invoke-direct {p0}, Lca/psiphon/PsiphonTunnel;->getSecondaryDnsServer()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$500(Lca/psiphon/PsiphonTunnel;Ljava/lang/String;)Ljava/lang/String;
    .registers 2

    invoke-direct {p0, p1}, Lca/psiphon/PsiphonTunnel;->iPv6Synthesize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$600(Lca/psiphon/PsiphonTunnel;)Ljava/lang/String;
    .registers 1

    invoke-direct {p0}, Lca/psiphon/PsiphonTunnel;->getNetworkID()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$700(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)I
    .registers 7

    invoke-static/range {p0 .. p6}, Lca/psiphon/PsiphonTunnel;->runTun2Socks(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)I

    move-result p0

    return p0
.end method

.method private bindToDevice(J)Ljava/lang/String;
    .registers 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    iget-object v0, p0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    check-cast v0, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    long-to-int p2, p1

    .line 2
    invoke-virtual {v0, p2}, Landroid/net/VpnService;->protect(I)Z

    move-result p1

    if-eqz p1, :cond_11

    const-string p1, ""

    return-object p1

    :cond_11
    new-instance p1, Lca/psiphon/PsiphonTunnel$〺つふすそ;

    const-string p2, "protect socket failed"

    invoke-direct {p1, p2}, Lca/psiphon/PsiphonTunnel$〺つふすそ;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static defaultDataRootDirectory(Landroid/content/Context;)Ljava/io/File;
    .registers 2

    const-string v0, "ca.psiphon.PsiphonTunnel.tunnel-core"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method private static native disableUdpGwKeepalive()I
.end method

.method private static native enableUdpGwKeepalive()I
.end method

.method private static getActiveNetworkDnsResolvers(Landroid/content/Context;)Ljava/util/Collection;
    .registers 8
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/Collection<",
            "Ljava/net/InetAddress;",
            ">;"
        }
    .end annotation

    const-string v0, "getActiveNetworkDnsResolvers failed"

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :try_start_7
    const-string v2, "connectivity"

    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/net/ConnectivityManager;

    const-string v2, "android.net.LinkProperties"

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const-class v3, Landroid/net/ConnectivityManager;

    const-string v4, "getActiveLinkProperties"

    const/4 v5, 0x0

    new-array v6, v5, [Ljava/lang/Class;

    invoke-virtual {v3, v4, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    new-array v4, v5, [Ljava/lang/Object;

    invoke-virtual {v3, p0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_6c

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x15

    if-ge v3, v4, :cond_52

    const-string v3, "getDnses"

    new-array v4, v5, [Ljava/lang/Class;

    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    new-array v3, v5, [Ljava/lang/Object;

    invoke-virtual {v2, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_42
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6c

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/net/InetAddress;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_42

    :cond_52
    check-cast p0, Landroid/net/LinkProperties;

    invoke-virtual {p0}, Landroid/net/LinkProperties;->getDnsServers()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_5c
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6c

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/net/InetAddress;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_6b
    .catch Ljava/lang/ClassNotFoundException; {:try_start_7 .. :try_end_6b} :catch_90
    .catch Ljava/lang/NoSuchMethodException; {:try_start_7 .. :try_end_6b} :catch_89
    .catch Ljava/lang/IllegalArgumentException; {:try_start_7 .. :try_end_6b} :catch_82
    .catch Ljava/lang/IllegalAccessException; {:try_start_7 .. :try_end_6b} :catch_7b
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_7 .. :try_end_6b} :catch_74
    .catch Ljava/lang/NullPointerException; {:try_start_7 .. :try_end_6b} :catch_6d

    goto :goto_5c

    :cond_6c
    return-object v1

    :catch_6d
    move-exception p0

    new-instance v1, Lca/psiphon/PsiphonTunnel$〺つふすそ;

    invoke-direct {v1, v0, p0}, Lca/psiphon/PsiphonTunnel$〺つふすそ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_74
    move-exception p0

    new-instance v1, Lca/psiphon/PsiphonTunnel$〺つふすそ;

    invoke-direct {v1, v0, p0}, Lca/psiphon/PsiphonTunnel$〺つふすそ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_7b
    move-exception p0

    new-instance v1, Lca/psiphon/PsiphonTunnel$〺つふすそ;

    invoke-direct {v1, v0, p0}, Lca/psiphon/PsiphonTunnel$〺つふすそ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_82
    move-exception p0

    new-instance v1, Lca/psiphon/PsiphonTunnel$〺つふすそ;

    invoke-direct {v1, v0, p0}, Lca/psiphon/PsiphonTunnel$〺つふすそ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_89
    move-exception p0

    new-instance v1, Lca/psiphon/PsiphonTunnel$〺つふすそ;

    invoke-direct {v1, v0, p0}, Lca/psiphon/PsiphonTunnel$〺つふすそ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_90
    move-exception p0

    new-instance v1, Lca/psiphon/PsiphonTunnel$〺つふすそ;

    invoke-direct {v1, v0, p0}, Lca/psiphon/PsiphonTunnel$〺つふすそ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_98

    :goto_97
    throw v1

    :goto_98
    goto :goto_97
.end method

.method public static getDefaultUpgradeDownloadFilePath(Landroid/content/Context;)Ljava/lang/String;
    .registers 1

    invoke-static {p0}, Lca/psiphon/PsiphonTunnel;->defaultDataRootDirectory(Landroid/content/Context;)Ljava/io/File;

    move-result-object p0

    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lpsi/Psi;->upgradeDownloadFilePath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getDeviceRegion(Landroid/content/Context;)Ljava/lang/String;
    .registers 5

    const-string v0, "phone"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/telephony/TelephonyManager;

    const-string v0, ""

    if-eqz p0, :cond_2a

    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getSimCountryIso()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_13

    move-object v1, v0

    :cond_13
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_29

    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getPhoneType()I

    move-result v2

    const/4 v3, 0x2

    if-eq v2, v3, :cond_29

    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getNetworkCountryIso()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_27

    goto :goto_2a

    :cond_27
    move-object v0, p0

    goto :goto_2a

    :cond_29
    move-object v0, v1

    :cond_2a
    :goto_2a
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p0

    if-nez p0, :cond_3a

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p0

    if-eqz p0, :cond_3a

    invoke-virtual {p0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    :cond_3a
    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, p0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getFirstActiveNetworkDnsResolver(Landroid/content/Context;)Ljava/lang/String;
    .registers 2

    invoke-static {p0}, Lca/psiphon/PsiphonTunnel;->getActiveNetworkDnsResolvers(Landroid/content/Context;)Ljava/util/Collection;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_26

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/net/InetAddress;

    invoke-virtual {p0}, Ljava/net/InetAddress;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "/"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_25

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    :cond_25
    return-object p0

    :cond_26
    new-instance p0, Lca/psiphon/PsiphonTunnel$〺つふすそ;

    const-string v0, "no active network DNS resolver"

    invoke-direct {p0, v0}, Lca/psiphon/PsiphonTunnel$〺つふすそ;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private getNetworkID()Ljava/lang/String;
    .registers 6

    iget-object v0, p0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    check-cast v0, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    sget-object v0, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/App;

    const-string v1, "connectivity"

    .line 3
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/ConnectivityManager;

    const/4 v2, 0x0

    :try_start_12
    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v2
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_16} :catch_17

    goto :goto_18

    :catch_17
    nop

    :goto_18
    const-string v1, "-"

    if-eqz v2, :cond_5b

    invoke-virtual {v2}, Landroid/net/NetworkInfo;->getType()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_5b

    const-string v2, "WIFI"

    :try_start_25
    const-string v3, "wifi"

    invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/WifiManager;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v0

    if-eqz v0, :cond_88

    invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getBSSID()Ljava/lang/String;

    move-result-object v3

    const-string v4, "02:00:00:00:00:00"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_47

    invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getIpAddress()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    :cond_47
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_59
    .catch Ljava/lang/Exception; {:try_start_25 .. :try_end_59} :catch_88

    :goto_59
    move-object v2, v0

    goto :goto_88

    :cond_5b
    if-eqz v2, :cond_86

    invoke-virtual {v2}, Landroid/net/NetworkInfo;->getType()I

    move-result v2

    if-nez v2, :cond_86

    const-string v2, "MOBILE"

    :try_start_65
    const-string v3, "phone"

    invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    if-eqz v0, :cond_88

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkOperator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_85
    .catch Ljava/lang/Exception; {:try_start_65 .. :try_end_85} :catch_88

    goto :goto_59

    :cond_86
    const-string v2, "UNKNOWN"

    :catch_88
    :cond_88
    :goto_88
    return-object v2
.end method

.method private getPrimaryDnsServer()Ljava/lang/String;
    .registers 4

    :try_start_0
    iget-object v0, p0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    check-cast v0, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    sget-object v0, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/App;

    .line 3
    invoke-static {v0}, Lca/psiphon/PsiphonTunnel;->getFirstActiveNetworkDnsResolver(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0
    :try_end_d
    .catch Lca/psiphon/PsiphonTunnel$〺つふすそ; {:try_start_0 .. :try_end_d} :catch_e

    goto :goto_29

    :catch_e
    move-exception v0

    iget-object v1, p0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    const-string v2, "failed to get active network DNS resolver: "

    invoke-static {v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    check-cast v1, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    invoke-virtual {v1, v0}, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;->いいにぽつ(Ljava/lang/String;)V

    const-string v0, "8.8.4.4"

    :goto_29
    return-object v0
.end method

.method private getSecondaryDnsServer()Ljava/lang/String;
    .registers 2

    const-string v0, "8.8.8.8"

    return-object v0
.end method

.method public static getUpgradeDownloadFilePath(Ljava/lang/String;)Ljava/lang/String;
    .registers 1

    invoke-static {p0}, Lpsi/Psi;->upgradeDownloadFilePath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private handlePsiphonNotice(Ljava/lang/String;)V
    .registers 11

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "noticeType"

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "Tunnels"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1
    :try_end_11
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_11} :catch_2b4

    const/4 v2, 0x0

    const v3, 0x7f110052

    const-string v4, "data"

    if-eqz v1, :cond_44

    :try_start_19
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "count"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    if-lez v1, :cond_3b

    invoke-direct {p0}, Lca/psiphon/PsiphonTunnel;->isVpnMode()Z

    move-result v1

    if-eqz v1, :cond_32

    iget-boolean v1, p0, Lca/psiphon/PsiphonTunnel;->mShouldRouteThroughTunnelAutomatically:Z

    if-eqz v1, :cond_32

    invoke-virtual {p0}, Lca/psiphon/PsiphonTunnel;->routeThroughTunnel()V

    :cond_32
    iget-object v1, p0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    check-cast v1, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    invoke-virtual {v1}, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;->ぺぁあねじ()V

    goto/16 :goto_28e

    :cond_3b
    iget-object v1, p0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    check-cast v1, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    .line 1
    invoke-virtual {v1, v3}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    goto/16 :goto_28e

    :cond_44
    const-string v1, "AvailableEgressRegions"

    .line 2
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_74

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v3, "regions"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    :goto_5b
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v5

    if-ge v2, v5, :cond_6b

    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_5b

    :cond_6b
    iget-object v1, p0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    check-cast v1, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    invoke-virtual {v1, v3}, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;->ぁごぐすすぃ(Ljava/util/List;)V

    goto/16 :goto_28e

    :cond_74
    const-string v1, "SocksProxyPortInUse"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1
    :try_end_7a
    .catch Lorg/json/JSONException; {:try_start_19 .. :try_end_7a} :catch_2b4

    const-string v5, "port"

    if-eqz v1, :cond_92

    :try_start_7e
    iget-object v1, p0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    check-cast v1, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    .line 3
    invoke-virtual {v1, v3}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    goto/16 :goto_28e

    :cond_92
    const-string v1, "HttpProxyPortInUse"

    .line 4
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_ae

    iget-object v1, p0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    check-cast v1, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    .line 5
    invoke-virtual {v1, v3}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    goto/16 :goto_28e

    :cond_ae
    const-string v1, "ListeningSocksProxyPort"

    .line 6
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_cd

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-direct {p0, v1}, Lca/psiphon/PsiphonTunnel;->setLocalSocksProxyPort(I)V

    iget-object v2, p0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    check-cast v2, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    .line 7
    invoke-virtual {v2, v3}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    goto/16 :goto_28e

    :cond_cd
    const-string v1, "ListeningHttpProxyPort"

    .line 8
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e9

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    iget-object v2, p0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    check-cast v2, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    .line 9
    invoke-virtual {v2, v3}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    goto/16 :goto_28e

    :cond_e9
    const-string v1, "UpstreamProxyError"

    .line 10
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_104

    iget-object v1, p0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "message"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    check-cast v1, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    invoke-virtual {v1, v2}, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;->てぜきぽく(Ljava/lang/String;)V

    goto/16 :goto_28e

    :cond_104
    const-string v1, "ClientUpgradeDownloaded"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11e

    iget-object v1, p0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    const-string v5, "filename"

    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    check-cast v1, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    .line 11
    invoke-virtual {v1, v3}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    goto/16 :goto_28e

    :cond_11e
    const-string v1, "ClientIsLatestVersion"

    .line 12
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12f

    iget-object v1, p0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    check-cast v1, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto/16 :goto_28e

    :cond_12f
    const-string v1, "Homepage"

    .line 14
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_149

    iget-object v1, p0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    const-string v5, "url"

    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    check-cast v1, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    .line 15
    invoke-virtual {v1, v3}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    goto/16 :goto_28e

    :cond_149
    const-string v1, "ClientRegion"

    .line 16
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1
    :try_end_14f
    .catch Lorg/json/JSONException; {:try_start_7e .. :try_end_14f} :catch_2b4

    const-string v5, "region"

    if-eqz v1, :cond_163

    :try_start_153
    iget-object v1, p0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    check-cast v1, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    .line 17
    invoke-virtual {v1, v3}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    goto/16 :goto_28e

    :cond_163
    const-string v1, "SplitTunnelRegion"

    .line 18
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_17b

    iget-object v1, p0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    check-cast v1, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    .line 19
    invoke-virtual {v1, v3}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    goto/16 :goto_28e

    :cond_17b
    const-string v1, "Untunneled"

    .line 20
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_195

    iget-object v1, p0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    const-string v5, "address"

    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    check-cast v1, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    .line 21
    invoke-virtual {v1, v3}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    goto/16 :goto_28e

    :cond_195
    const-string v1, "BytesTransferred"

    .line 22
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1b6

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    iget-object v3, p0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    const-string v5, "sent"

    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v5

    const-string v7, "received"

    invoke-virtual {v1, v7}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v7

    check-cast v3, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    invoke-virtual {v3, v5, v6, v7, v8}, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;->〳ぜぞぜべっ(JJ)V

    goto/16 :goto_28f

    :cond_1b6
    const-string v1, "ActiveAuthorizationIDs"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1f8

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v5, "IDs"

    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    :goto_1cd
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v6

    if-ge v2, v6, :cond_1dd

    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1cd

    :cond_1dd
    iget-object v1, p0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    check-cast v1, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1e8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_28e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v1, v3}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    goto :goto_1e8

    :cond_1f8
    const-string v1, "TrafficRateLimits"

    .line 24
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_219

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    iget-object v2, p0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    const-string v3, "upstreamBytesPerSecond"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v5

    const-string v3, "downstreamBytesPerSecond"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v7

    check-cast v2, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    invoke-virtual {v2, v5, v6, v7, v8}, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;->ぺふねづ〺(JJ)V

    goto/16 :goto_28e

    :cond_219
    const-string v1, "Exiting"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_229

    iget-object v1, p0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    check-cast v1, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_28e

    :cond_229
    const-string v1, "ActiveTunnel"

    .line 26
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_24b

    invoke-direct {p0}, Lca/psiphon/PsiphonTunnel;->isVpnMode()Z

    move-result v1

    if-eqz v1, :cond_28e

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "isTCS"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_247

    invoke-static {}, Lca/psiphon/PsiphonTunnel;->disableUdpGwKeepalive()I

    goto :goto_28e

    :cond_247
    invoke-static {}, Lca/psiphon/PsiphonTunnel;->enableUdpGwKeepalive()I

    goto :goto_28e

    :cond_24b
    const-string v1, "ApplicationParameter"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_26d

    iget-object v1, p0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "key"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "value"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    check-cast v1, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_28e

    :cond_26d
    const-string v1, "ServerAlert"

    .line 28
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_28e

    iget-object v1, p0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "reason"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "subject"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    check-cast v1, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_28e
    :goto_28e
    const/4 v2, 0x1

    :goto_28f
    if-eqz v2, :cond_2b4

    .line 30
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    check-cast v0, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    invoke-virtual {v0, p1}, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;->いいにぽつ(Ljava/lang/String;)V
    :try_end_2b4
    .catch Lorg/json/JSONException; {:try_start_153 .. :try_end_2b4} :catch_2b4

    :catch_2b4
    :cond_2b4
    return-void
.end method

.method private hasNetworkConnectivity()J
    .registers 4

    iget-object v0, p0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    check-cast v0, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    sget-object v0, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/App;

    .line 3
    invoke-static {v0}, Lca/psiphon/PsiphonTunnel;->hasNetworkConnectivity(Landroid/content/Context;)Z

    move-result v0

    iget-object v1, p0, Lca/psiphon/PsiphonTunnel;->mIsWaitingForNetworkConnectivity:Ljava/util/concurrent/atomic/AtomicBoolean;

    xor-int/lit8 v2, v0, 0x1

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v1

    const v2, 0x7f110052

    if-nez v0, :cond_24

    if-nez v1, :cond_24

    iget-object v1, p0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    check-cast v1, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    .line 4
    invoke-virtual {v1, v2}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    goto :goto_2f

    :cond_24
    if-eqz v0, :cond_2f

    if-eqz v1, :cond_2f

    .line 5
    iget-object v1, p0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    check-cast v1, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    .line 6
    invoke-virtual {v1, v2}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    :cond_2f
    :goto_2f
    if-eqz v0, :cond_34

    const-wide/16 v0, 0x1

    goto :goto_36

    :cond_34
    const-wide/16 v0, 0x0

    :goto_36
    return-wide v0
.end method

.method private static hasNetworkConnectivity(Landroid/content/Context;)Z
    .registers 2

    const-string v0, "connectivity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/net/ConnectivityManager;

    const/4 v0, 0x0

    if-nez p0, :cond_c

    return v0

    :cond_c
    invoke-virtual {p0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object p0

    if-eqz p0, :cond_19

    invoke-virtual {p0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result p0

    if-eqz p0, :cond_19

    const/4 v0, 0x1

    :cond_19
    return v0
.end method

.method private iPv6Synthesize(Ljava/lang/String;)Ljava/lang/String;
    .registers 2

    return-object p1
.end method

.method private isVpnMode()Z
    .registers 2

    iget-object v0, p0, Lca/psiphon/PsiphonTunnel;->mVpnMode:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method private loadPsiphonConfig(Landroid/content/Context;)Ljava/lang/String;
    .registers 18

    move-object/from16 v0, p0

    const-string v1, "DataRootDirectory"

    const-string v2, "TunnelWholeDevice"

    new-instance v3, Lorg/json/JSONObject;

    iget-object v4, v0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    check-cast v4, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    .line 1
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    const-string v5, "[\""

    invoke-static {v5}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->〺つふすそ()Landroid/content/SharedPreferences;

    move-result-object v7

    const-string v8, "protocol"

    const-string v9, ""

    invoke-interface {v7, v8, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "\"]"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v10, 0x0

    const/4 v11, 0x1

    :try_start_34
    const-string v12, "ClientVersion"

    const-string v13, "311"

    invoke-virtual {v4, v12, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v12, "PropagationChannelId"

    const-string v13, "EE0B7486ACAE75AA"

    invoke-virtual {v4, v12, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v12, "SponsorId"

    const-string v13, "67DDC3614847FCEA"

    invoke-virtual {v4, v12, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v12, "RemoteServerListURLs"

    new-instance v13, Lorg/json/JSONArray;

    const-string v14, "[{\"URL\": \"aHR0cHM6Ly9zMy5hbWF6b25hd3MuY29tL3BzaXBob24vd2ViL213NHotYTJreC0wd2J6L3NlcnZlcl9saXN0X2NvbXByZXNzZWQ=\", \"OnlyAfterAttempts\": 0, \"SkipVerify\": false}, {\"URL\": \"aHR0cHM6Ly93d3cudWx0aW1hdGVzdHNhdGFwZXguY29tL3dlYi9tdzR6LWEya3gtMHdiei9zZXJ2ZXJfbGlzdF9jb21wcmVzc2Vk\", \"OnlyAfterAttempts\": 2, \"SkipVerify\": true}, {\"URL\": \"aHR0cHM6Ly93d3cuZXhwZXJ0Zm1naG9zdGl2eS5jb20vd2ViL213NHotYTJreC0wd2J6L3NlcnZlcl9saXN0X2NvbXByZXNzZWQ=\", \"OnlyAfterAttempts\": 2, \"SkipVerify\": true}, {\"URL\": \"aHR0cHM6Ly93d3cuZmFzdGJpbGxidWlsZGVyaXRhbHkuY29tL3dlYi9tdzR6LWEya3gtMHdiei9zZXJ2ZXJfbGlzdF9jb21wcmVzc2Vk\", \"OnlyAfterAttempts\": 2, \"SkipVerify\": true}]"

    invoke-direct {v13, v14}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v12, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v12, "ObfuscatedServerListRootURLs"

    new-instance v13, Lorg/json/JSONArray;

    const-string v14, "[{\"URL\": \"aHR0cHM6Ly9zMy5hbWF6b25hd3MuY29tL3BzaXBob24vd2ViL213NHotYTJreC0wd2J6L29zbA==\", \"OnlyAfterAttempts\": 0, \"SkipVerify\": false}, {\"URL\": \"aHR0cHM6Ly93d3cudWx0aW1hdGVzdHNhdGFwZXguY29tL3dlYi9tdzR6LWEya3gtMHdiei9vc2w=\", \"OnlyAfterAttempts\": 2, \"SkipVerify\": true}, {\"URL\": \"aHR0cHM6Ly93d3cuZXhwZXJ0Zm1naG9zdGl2eS5jb20vd2ViL213NHotYTJreC0wd2J6L29zbA==\", \"OnlyAfterAttempts\": 2, \"SkipVerify\": true}, {\"URL\": \"aHR0cHM6Ly93d3cuZmFzdGJpbGxidWlsZGVyaXRhbHkuY29tL3dlYi9tdzR6LWEya3gtMHdiei9vc2w=\", \"OnlyAfterAttempts\": 2, \"SkipVerify\": true}]"

    invoke-direct {v13, v14}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v12, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v12, "RemoteServerListSignaturePublicKey"

    const-string v13, "MIICIDANBgkqhkiG9w0BAQEFAAOCAg0AMIICCAKCAgEAt7Ls+/39r+T6zNW7GiVpJfzq/xvL9SBH5rIFnk0RXYEYavax3WS6HOD35eTAqn8AniOwiH+DOkvgSKF2caqk/y1dfq47Pdymtwzp9ikpB1C5OfAysXzBiwVJlCdajBKvBZDerV1cMvRzCKvKwRmvDmHgphQQ7WfXIGbRbmmk6opMBh3roE42KcotLFtqp0RRwLtcBRNtCdsrVsjiI1Lqz/lH+T61sGjSjQ3CHMuZYSQJZo/KrvzgQXpkaCTdbObxHqb6/+i1qaVOfEsvjoiyzTxJADvSytVtcTjijhPEV6XskJVHE1Zgl+7rATr/pDQkw6DPCNBS1+Y6fy7GstZALQXwEDN/qhQI9kWkHijT8ns+i1vGg00Mk/6J75arLhqcodWsdeG/M/moWgqQAnlZAGVtJI1OgeF5fsPpXu4kctOfuZlGjVZXQNW34aOzm8r8S0eVZitPlbhcPiR4gT/aSMz/wd8lZlzZYsje/Jr8u/YtlwjjreZrGRmG8KMOzukV3lLmMppXFMvl4bxv6YFEmIuTsOhbLTwFgh7KYNjodLj/LsqRVfwz31PgWQFTEPICV7GCvgVlPRxnofqKSjgTWI4mxDhBpVcATvaoBl1L/6WLbFvBsoAUBItWwctO2xalKxF5szhGm8lccoc5MZr8kfE0uxMgsxz4er68iCID+rsCAQM="

    invoke-virtual {v4, v12, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v12, "ServerEntrySignaturePublicKey"

    const-string v13, "sHuUVTWaRyh5pZwy4UguSgkwmBe0EHtJJkoF5WrxmvA="

    invoke-virtual {v4, v12, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v12, "ExchangeObfuscationKey"

    const-string v13, "DpXzloJk1Hw6aSzmKKky0xcahsEHubch81Mi6K0XMlU="

    invoke-virtual {v4, v12, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v12, "UpstreamProxyUrl"

    invoke-static {}, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;->びぐびあび()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v4, v12, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v12, "EmitDiagnosticNotices"

    invoke-virtual {v4, v12, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v12, "EmitDiagnosticNetworkParameters"

    invoke-virtual {v4, v12, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v12, "ConnectionWorkerPoolSize"

    invoke-virtual {v4, v12, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->〺つふすそ()Landroid/content/SharedPreferences;

    move-result-object v12

    invoke-interface {v12, v8, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/String;->isEmpty()Z

    move-result v12
    :try_end_9a
    .catch Lorg/json/JSONException; {:try_start_34 .. :try_end_9a} :catch_37f
    .catch Ljava/lang/Exception; {:try_start_34 .. :try_end_9a} :catch_37f

    const-string v13, "InitialLimitTunnelProtocolsCandidateCount"

    const-string v14, "InitialLimitTunnelProtocols"

    if-nez v12, :cond_b6

    :try_start_a0
    new-instance v12, Lorg/json/JSONArray;

    invoke-direct {v12, v6}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v14, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance v12, Lorg/json/JSONArray;

    invoke-direct {v12, v6}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12}, Lorg/json/JSONArray;->length()I

    move-result v6

    invoke-virtual {v4, v13, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    sput-boolean v11, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;->ぇぬぎばつ:Z

    :cond_b6
    invoke-static {}, Lteam/dev/epro/apkcustom/App;->〺つふすそ()Landroid/content/SharedPreferences;

    move-result-object v6

    invoke-interface {v6, v8, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_c6

    sput-boolean v10, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;->ぇぬぎばつ:Z
    :try_end_c6
    .catch Lorg/json/JSONException; {:try_start_a0 .. :try_end_c6} :catch_37f
    .catch Ljava/lang/Exception; {:try_start_a0 .. :try_end_c6} :catch_37f

    :cond_c6
    :try_start_c6
    invoke-static {}, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ()Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-result-object v6

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ()Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-result-object v12

    check-cast v12, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v12

    check-cast v6, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v6, v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->く〱なおぎ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    const/16 v12, 0x18

    aget-object v6, v6, v12

    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_361

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ()Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-result-object v6

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ()Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-result-object v15

    check-cast v15, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v15}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v15

    check-cast v6, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v6, v15}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->く〱なおぎ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    aget-object v6, v6, v12

    const-string v12, "\\[splitPsiphon\\]"

    invoke-virtual {v6, v12}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    array-length v12, v6

    const/4 v15, 0x2

    if-le v12, v11, :cond_1cd

    aget-object v10, v6, v10

    aget-object v12, v6, v11

    array-length v11, v6

    if-le v11, v15, :cond_1d1

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v5, v6, v15

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5
    :try_end_11f
    .catch Ljava/lang/Exception; {:try_start_c6 .. :try_end_11f} :catch_365

    :try_start_11f
    invoke-static {}, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ()Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-result-object v6

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ()Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-result-object v7

    check-cast v7, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v7}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v7

    check-cast v6, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v6, v7}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->く〱なおぎ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    aget-object v6, v6, v15

    invoke-static {v6}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_159

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ()Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-result-object v6

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ()Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-result-object v7

    check-cast v7, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v7}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v7

    check-cast v6, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v6, v7}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->く〱なおぎ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0xf

    aget-object v6, v6, v7

    invoke-static {v6}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1d1

    :cond_159
    invoke-static {}, Lteam/dev/epro/apkcustom/App;->〺つふすそ()Landroid/content/SharedPreferences;

    move-result-object v6

    invoke-interface {v6, v8, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_16d

    invoke-virtual {v4, v14}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual {v4, v13}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    :cond_16d
    new-instance v6, Lorg/json/JSONArray;

    invoke-direct {v6, v5}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v14, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance v6, Lorg/json/JSONArray;

    invoke-direct {v6, v5}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v6

    invoke-virtual {v4, v13, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const/4 v6, 0x1

    sput-boolean v6, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;->ぇぬぎばつ:Z
    :try_end_184
    .catch Ljava/lang/Exception; {:try_start_11f .. :try_end_184} :catch_185

    goto :goto_1d1

    :catch_185
    :try_start_185
    invoke-static {}, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ()Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-result-object v6

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ()Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-result-object v7

    check-cast v7, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v7}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v7

    check-cast v6, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v6, v7}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->く〱なおぎ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    aget-object v6, v6, v15

    invoke-static {v6}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1d1

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->〺つふすそ()Landroid/content/SharedPreferences;

    move-result-object v6

    invoke-interface {v6, v8, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_1b5

    invoke-virtual {v4, v14}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual {v4, v13}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    :cond_1b5
    new-instance v6, Lorg/json/JSONArray;

    invoke-direct {v6, v5}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v14, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance v6, Lorg/json/JSONArray;

    invoke-direct {v6, v5}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v5

    invoke-virtual {v4, v13, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const/4 v5, 0x1

    sput-boolean v5, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;->ぇぬぎばつ:Z

    goto :goto_1d1

    :cond_1cd
    const/4 v5, 0x0

    aget-object v10, v6, v5

    move-object v12, v9

    :cond_1d1
    :goto_1d1
    invoke-virtual {v10}, Ljava/lang/String;->isEmpty()Z

    move-result v5
    :try_end_1d5
    .catch Ljava/lang/Exception; {:try_start_185 .. :try_end_1d5} :catch_365

    const-string v6, "Authorizations"

    if-nez v5, :cond_283

    :try_start_1d9
    invoke-static {}, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ()Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-result-object v5

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ()Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-result-object v7

    check-cast v7, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v7}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v7

    check-cast v5, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v5, v7}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->く〱なおぎ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    aget-object v5, v5, v15

    invoke-static {v5}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_236

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ()Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-result-object v5

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ()Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-result-object v7

    check-cast v7, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v7}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v7

    check-cast v5, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v5, v7}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->く〱なおぎ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    const/16 v7, 0xf

    aget-object v5, v5, v7

    invoke-static {v5}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_214

    goto :goto_236

    :cond_214
    invoke-static {}, Lteam/dev/epro/apkcustom/App;->〺つふすそ()Landroid/content/SharedPreferences;

    move-result-object v5

    invoke-interface {v5, v6, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_230

    new-instance v5, Lorg/json/JSONArray;

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->〺つふすそ()Landroid/content/SharedPreferences;

    move-result-object v7

    invoke-interface {v7, v6, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v5, v7}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    goto :goto_23b

    :cond_230
    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5, v10}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    goto :goto_23b

    :cond_236
    :goto_236
    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5, v10}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    :goto_23b
    invoke-virtual {v4, v6, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_23e
    .catch Ljava/lang/Exception; {:try_start_1d9 .. :try_end_23e} :catch_23f

    goto :goto_2a1

    :catch_23f
    :try_start_23f
    invoke-static {}, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ()Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-result-object v5

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ()Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-result-object v7

    check-cast v7, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v7}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v7

    check-cast v5, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v5, v7}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->く〱なおぎ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    aget-object v5, v5, v15

    invoke-static {v5}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_261

    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5, v10}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    goto :goto_29e

    :cond_261
    invoke-static {}, Lteam/dev/epro/apkcustom/App;->〺つふすそ()Landroid/content/SharedPreferences;

    move-result-object v5

    invoke-interface {v5, v6, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_27d

    new-instance v5, Lorg/json/JSONArray;

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->〺つふすそ()Landroid/content/SharedPreferences;

    move-result-object v7

    invoke-interface {v7, v6, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v5, v7}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    goto :goto_29e

    :cond_27d
    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5, v10}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    goto :goto_29e

    :cond_283
    invoke-static {}, Lteam/dev/epro/apkcustom/App;->〺つふすそ()Landroid/content/SharedPreferences;

    move-result-object v5

    invoke-interface {v5, v6, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_2a1

    new-instance v5, Lorg/json/JSONArray;

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->〺つふすそ()Landroid/content/SharedPreferences;

    move-result-object v7

    invoke-interface {v7, v6, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v5, v7}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    :goto_29e
    invoke-virtual {v4, v6, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_2a1
    :goto_2a1
    invoke-virtual {v12}, Ljava/lang/String;->isEmpty()Z

    move-result v5
    :try_end_2a5
    .catch Ljava/lang/Exception; {:try_start_23f .. :try_end_2a5} :catch_365

    const-string v6, "TargetServerEntry"

    if-nez v5, :cond_331

    :try_start_2a9
    invoke-static {}, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ()Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-result-object v5

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ()Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-result-object v7

    check-cast v7, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v7}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v7

    check-cast v5, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v5, v7}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->く〱なおぎ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    aget-object v5, v5, v15

    invoke-static {v5}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_2fe

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ()Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-result-object v5

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ()Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-result-object v7

    check-cast v7, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v7}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v7

    check-cast v5, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v5, v7}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->く〱なおぎ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    const/16 v7, 0x13

    aget-object v5, v5, v7

    invoke-static {v5}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2e4

    goto :goto_2fe

    :cond_2e4
    invoke-static {}, Lteam/dev/epro/apkcustom/App;->〺つふすそ()Landroid/content/SharedPreferences;

    move-result-object v5

    invoke-interface {v5, v6, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_2fe

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->〺つふすそ()Landroid/content/SharedPreferences;

    move-result-object v5

    invoke-interface {v5, v6, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v6, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_301

    :cond_2fe
    :goto_2fe
    invoke-virtual {v4, v6, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :goto_301
    const/4 v5, 0x0

    sput-boolean v5, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;->おぐぴう〸ず:Z
    :try_end_304
    .catch Ljava/lang/Exception; {:try_start_2a9 .. :try_end_304} :catch_305

    goto :goto_368

    :catch_305
    :try_start_305
    invoke-static {}, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ()Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-result-object v5

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ()Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-result-object v7

    check-cast v7, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v7}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v7

    check-cast v5, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v5, v7}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->く〱なおぎ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    aget-object v5, v5, v15

    invoke-static {v5}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_322

    goto :goto_347

    :cond_322
    invoke-static {}, Lteam/dev/epro/apkcustom/App;->〺つふすそ()Landroid/content/SharedPreferences;

    move-result-object v5

    invoke-interface {v5, v6, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_347

    goto :goto_33f

    :cond_331
    invoke-static {}, Lteam/dev/epro/apkcustom/App;->〺つふすそ()Landroid/content/SharedPreferences;

    move-result-object v5

    invoke-interface {v5, v6, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_34e

    :goto_33f
    invoke-static {}, Lteam/dev/epro/apkcustom/App;->〺つふすそ()Landroid/content/SharedPreferences;

    move-result-object v5

    invoke-interface {v5, v6, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    :cond_347
    :goto_347
    invoke-virtual {v4, v6, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const/4 v5, 0x0

    sput-boolean v5, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;->おぐぴう〸ず:Z

    goto :goto_368

    :cond_34e
    const-string v5, "EgressRegion"

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->〺つふすそ()Landroid/content/SharedPreferences;

    move-result-object v6

    const-string v7, "region"

    invoke-interface {v6, v7, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const/4 v5, 0x1

    sput-boolean v5, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;->おぐぴう〸ず:Z

    goto :goto_368

    :cond_361
    invoke-static {v4}, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;->げつ〴ぬぐ(Lorg/json/JSONObject;)V
    :try_end_364
    .catch Ljava/lang/Exception; {:try_start_305 .. :try_end_364} :catch_365

    goto :goto_368

    :catch_365
    :try_start_365
    invoke-static {v4}, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;->げつ〴ぬぐ(Lorg/json/JSONObject;)V

    :goto_368
    const/4 v5, 0x1

    invoke-virtual {v4, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v6, "DisableLocalHTTPProxy"

    invoke-virtual {v4, v6, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    sget-object v5, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;->へぬ〴づぞ:Ljava/io/File;

    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v1, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4
    :try_end_37e
    .catch Lorg/json/JSONException; {:try_start_365 .. :try_end_37e} :catch_37f
    .catch Ljava/lang/Exception; {:try_start_365 .. :try_end_37e} :catch_37f

    goto :goto_380

    :catch_37f
    const/4 v4, 0x0

    :goto_380
    if-nez v4, :cond_383

    goto :goto_384

    :cond_383
    move-object v9, v4

    .line 3
    :goto_384
    invoke-direct {v3, v9}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_3bc

    invoke-static/range {p1 .. p1}, Lca/psiphon/PsiphonTunnel;->defaultDataRootDirectory(Landroid/content/Context;)Ljava/io/File;

    move-result-object v4

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v5

    if-nez v5, :cond_3b5

    invoke-virtual {v4}, Ljava/io/File;->mkdir()Z

    move-result v5

    if-eqz v5, :cond_39e

    goto :goto_3b5

    :cond_39e
    new-instance v1, Lca/psiphon/PsiphonTunnel$〺つふすそ;

    const-string v2, "failed to create data root directory: "

    invoke-static {v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lca/psiphon/PsiphonTunnel$〺つふすそ;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3b5
    :goto_3b5
    invoke-static/range {p1 .. p1}, Lca/psiphon/PsiphonTunnel;->defaultDataRootDirectory(Landroid/content/Context;)Ljava/io/File;

    move-result-object v4

    invoke-virtual {v3, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_3bc
    const-string v1, "DataStoreDirectory"

    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3cd

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    const-string v4, "MigrateDataStoreDirectory"

    invoke-virtual {v3, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_3cd
    const-string v1, "RemoteServerListDownloadFilename"

    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3e9

    new-instance v1, Ljava/io/File;

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v4

    const-string v5, "remote_server_list"

    invoke-direct {v1, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    const-string v4, "MigrateRemoteServerListDownloadFilename"

    invoke-virtual {v3, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_3e9
    new-instance v1, Ljava/io/File;

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v4

    const-string v5, "osl"

    invoke-direct {v1, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    const-string v4, "MigrateObfuscatedServerListDownloadDirectory"

    invoke-virtual {v3, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "TunnelPoolSize"

    const/4 v4, 0x1

    invoke-virtual {v3, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "EstablishTunnelTimeoutSeconds"

    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_40f

    const/4 v4, 0x0

    invoke-virtual {v3, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    :cond_40f
    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_41c

    invoke-direct/range {p0 .. p0}, Lca/psiphon/PsiphonTunnel;->isVpnMode()Z

    move-result v1

    invoke-virtual {v3, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    :cond_41c
    const-string v1, "EmitBytesTransferred"

    const/4 v2, 0x1

    invoke-virtual {v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget-object v1, v0, Lca/psiphon/PsiphonTunnel;->mLocalSocksProxyPort:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    if-eqz v1, :cond_43d

    const-string v1, "LocalSocksProxyPort"

    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_438

    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    if-nez v2, :cond_43d

    :cond_438
    iget-object v2, v0, Lca/psiphon/PsiphonTunnel;->mLocalSocksProxyPort:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_43d
    iget-object v1, v0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    check-cast v1, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    .line 4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    sget-object v1, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/App;

    .line 6
    invoke-static {v1}, Lca/psiphon/PsiphonTunnel;->getDeviceRegion(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "DeviceRegion"

    invoke-virtual {v3, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v0, Lca/psiphon/PsiphonTunnel;->mClientPlatformPrefix:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_465

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_465
    const-string v2, "Android_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "com.psiphon3.subscription_playstore"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lca/psiphon/PsiphonTunnel;->mClientPlatformSuffix:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_48a

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_48a
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v4, "[^\\w\\-\\.]"

    invoke-virtual {v1, v4, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "ClientPlatform"

    invoke-virtual {v3, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method public static logTun2Socks(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .registers 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "tun2socks: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "("

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "): "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    sget-object p1, Lca/psiphon/PsiphonTunnel;->mPsiphonTunnel:Lca/psiphon/PsiphonTunnel;

    iget-object p1, p1, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    check-cast p1, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    invoke-virtual {p1, p0}, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;->いいにぽつ(Ljava/lang/String;)V

    return-void
.end method

.method public static declared-synchronized newPsiphonTunnel(Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;)Lca/psiphon/PsiphonTunnel;
    .registers 3

    const-class v0, Lca/psiphon/PsiphonTunnel;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_4
    invoke-static {p0, v1}, Lca/psiphon/PsiphonTunnel;->newPsiphonTunnelImpl(Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;Z)Lca/psiphon/PsiphonTunnel;

    move-result-object p0
    :try_end_8
    .catchall {:try_start_4 .. :try_end_8} :catchall_a

    monitor-exit v0

    return-object p0

    :catchall_a
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized newPsiphonTunnel(Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;Z)Lca/psiphon/PsiphonTunnel;
    .registers 3

    const-class v0, Lca/psiphon/PsiphonTunnel;

    monitor-enter v0

    :try_start_3
    invoke-static {p0, p1}, Lca/psiphon/PsiphonTunnel;->newPsiphonTunnelImpl(Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;Z)Lca/psiphon/PsiphonTunnel;

    move-result-object p0
    :try_end_7
    .catchall {:try_start_3 .. :try_end_7} :catchall_9

    monitor-exit v0

    return-object p0

    :catchall_9
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method private static newPsiphonTunnelImpl(Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;Z)Lca/psiphon/PsiphonTunnel;
    .registers 3

    sget-object v0, Lca/psiphon/PsiphonTunnel;->mPsiphonTunnel:Lca/psiphon/PsiphonTunnel;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lca/psiphon/PsiphonTunnel;->stop()V

    :cond_7
    const-string v0, "psiphon"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    new-instance v0, Lca/psiphon/PsiphonTunnel;

    invoke-direct {v0, p0, p1}, Lca/psiphon/PsiphonTunnel;-><init>(Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;Z)V

    sput-object v0, Lca/psiphon/PsiphonTunnel;->mPsiphonTunnel:Lca/psiphon/PsiphonTunnel;

    return-object v0
.end method

.method private notice(Ljava/lang/String;)V
    .registers 2

    invoke-direct {p0, p1}, Lca/psiphon/PsiphonTunnel;->handlePsiphonNotice(Ljava/lang/String;)V

    return-void
.end method

.method private static native runTun2Socks(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)I
.end method

.method private static selectPrivateAddress()Lca/psiphon/PsiphonTunnel$びぐびあび;
    .registers 11

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Lca/psiphon/PsiphonTunnel$びぐびあび;

    const-string v2, "10.0.0.1"

    const-string v3, "10.0.0.0"

    const/16 v4, 0x8

    const-string v5, "10.0.0.2"

    invoke-direct {v1, v2, v3, v4, v5}, Lca/psiphon/PsiphonTunnel$びぐびあび;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    const-string v2, "10"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lca/psiphon/PsiphonTunnel$びぐびあび;

    const-string v3, "172.16.0.1"

    const-string v4, "172.16.0.0"

    const/16 v5, 0xc

    const-string v6, "172.16.0.2"

    invoke-direct {v1, v3, v4, v5, v6}, Lca/psiphon/PsiphonTunnel$びぐびあび;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    const-string v3, "172"

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lca/psiphon/PsiphonTunnel$びぐびあび;

    const-string v4, "192.168.0.1"

    const-string v5, "192.168.0.0"

    const/16 v6, 0x10

    const-string v7, "192.168.0.2"

    invoke-direct {v1, v4, v5, v6, v7}, Lca/psiphon/PsiphonTunnel$びぐびあび;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    const-string v4, "192"

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lca/psiphon/PsiphonTunnel$びぐびあび;

    const-string v5, "169.254.1.1"

    const-string v6, "169.254.1.0"

    const/16 v7, 0x18

    const-string v8, "169.254.1.2"

    invoke-direct {v1, v5, v6, v7, v8}, Lca/psiphon/PsiphonTunnel$びぐびあび;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    const-string v5, "169"

    invoke-virtual {v0, v5, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_4d
    invoke-static {}, Ljava/net/NetworkInterface;->getNetworkInterfaces()Ljava/util/Enumeration;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    move-result-object v1
    :try_end_55
    .catch Ljava/net/SocketException; {:try_start_4d .. :try_end_55} :catch_de

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_59
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_c1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/net/NetworkInterface;

    invoke-virtual {v5}, Ljava/net/NetworkInterface;->getInetAddresses()Ljava/util/Enumeration;

    move-result-object v5

    invoke-static {v5}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_71
    :goto_71
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_59

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/net/InetAddress;

    instance-of v7, v6, Ljava/net/Inet4Address;

    if-eqz v7, :cond_71

    invoke-virtual {v6}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v6

    const-string v7, "10."

    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_91

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_71

    :cond_91
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    const/4 v8, 0x6

    if-lt v7, v8, :cond_b5

    const/4 v7, 0x0

    invoke-virtual {v6, v7, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    const-string v10, "172.16"

    invoke-virtual {v9, v10}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v9

    if-ltz v9, :cond_b5

    invoke-virtual {v6, v7, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    const-string v8, "172.31"

    invoke-virtual {v7, v8}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v7

    if-gtz v7, :cond_b5

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_71

    :cond_b5
    const-string v7, "192.168"

    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_71

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_71

    :cond_c1
    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v1

    if-lez v1, :cond_d6

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lca/psiphon/PsiphonTunnel$びぐびあび;

    return-object v0

    :cond_d6
    new-instance v0, Lca/psiphon/PsiphonTunnel$〺つふすそ;

    const-string v1, "no private address available"

    invoke-direct {v0, v1}, Lca/psiphon/PsiphonTunnel$〺つふすそ;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_de
    move-exception v0

    new-instance v1, Lca/psiphon/PsiphonTunnel$〺つふすそ;

    const-string v2, "selectPrivateAddress failed"

    invoke-direct {v1, v2, v0}, Lca/psiphon/PsiphonTunnel$〺つふすそ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_e8

    :goto_e7
    throw v1

    :goto_e8
    goto :goto_e7
.end method

.method private setLocalSocksProxyPort(I)V
    .registers 3

    iget-object v0, p0, Lca/psiphon/PsiphonTunnel;->mLocalSocksProxyPort:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    return-void
.end method

.method private setupTrustedCertificates(Landroid/content/Context;)Ljava/lang/String;
    .registers 11

    const-string v0, "copy AndroidCAStore failed"

    const-string v1, "PsiphonCAStore"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object p1

    :try_start_9
    new-instance v1, Ljava/io/File;

    const-string v3, "certs.dat"

    invoke-direct {v1, p1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->delete()Z
    :try_end_13
    .catch Ljava/security/KeyStoreException; {:try_start_9 .. :try_end_13} :catch_94
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_9 .. :try_end_13} :catch_8d
    .catch Ljava/security/cert/CertificateException; {:try_start_9 .. :try_end_13} :catch_86
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_13} :catch_7f

    const/4 p1, 0x0

    :try_start_14
    new-instance v3, Ljava/io/PrintStream;

    new-instance v4, Ljava/io/FileOutputStream;

    invoke-direct {v4, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v3, v4}, Ljava/io/PrintStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_1e
    .catchall {:try_start_14 .. :try_end_1e} :catchall_76

    :try_start_1e
    const-string v4, "AndroidCAStore"

    invoke-static {v4}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    move-result-object v4

    invoke-virtual {v4, p1, p1}, Ljava/security/KeyStore;->load(Ljava/io/InputStream;[C)V

    invoke-virtual {v4}, Ljava/security/KeyStore;->aliases()Ljava/util/Enumeration;

    move-result-object p1

    :cond_2b
    invoke-interface {p1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v5

    if-eqz v5, :cond_63

    invoke-interface {p1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/security/KeyStore;->getCertificate(Ljava/lang/String;)Ljava/security/cert/Certificate;

    move-result-object v5

    check-cast v5, Ljava/security/cert/X509Certificate;

    new-instance v6, Ljava/lang/String;

    invoke-virtual {v5}, Ljava/security/cert/X509Certificate;->getEncoded()[B

    move-result-object v5

    const/4 v7, 0x2

    invoke-static {v5, v7}, Landroid/util/Base64;->encode([BI)[B

    move-result-object v5

    const-string v7, "UTF-8"

    invoke-direct {v6, v5, v7}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    const/4 v5, 0x0

    :goto_4e
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    if-ge v5, v7, :cond_2b

    add-int/lit8 v7, v5, 0x40

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v8

    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    move-result v8

    invoke-virtual {v6, v5, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move v5, v7

    goto :goto_4e

    :cond_63
    iget-object p1, p0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    const-string v2, "prepared PsiphonCAStore"

    check-cast p1, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    invoke-virtual {p1, v2}, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;->いいにぽつ(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1
    :try_end_70
    .catchall {:try_start_1e .. :try_end_70} :catchall_74

    :try_start_70
    invoke-virtual {v3}, Ljava/io/PrintStream;->close()V

    return-object p1

    :catchall_74
    move-exception p1

    goto :goto_79

    :catchall_76
    move-exception v1

    move-object v3, p1

    move-object p1, v1

    :goto_79
    if-eqz v3, :cond_7e

    invoke-virtual {v3}, Ljava/io/PrintStream;->close()V

    :cond_7e
    throw p1
    :try_end_7f
    .catch Ljava/security/KeyStoreException; {:try_start_70 .. :try_end_7f} :catch_94
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_70 .. :try_end_7f} :catch_8d
    .catch Ljava/security/cert/CertificateException; {:try_start_70 .. :try_end_7f} :catch_86
    .catch Ljava/io/IOException; {:try_start_70 .. :try_end_7f} :catch_7f

    :catch_7f
    move-exception p1

    new-instance v1, Lca/psiphon/PsiphonTunnel$〺つふすそ;

    invoke-direct {v1, v0, p1}, Lca/psiphon/PsiphonTunnel$〺つふすそ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_86
    move-exception p1

    new-instance v1, Lca/psiphon/PsiphonTunnel$〺つふすそ;

    invoke-direct {v1, v0, p1}, Lca/psiphon/PsiphonTunnel$〺つふすそ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_8d
    move-exception p1

    new-instance v1, Lca/psiphon/PsiphonTunnel$〺つふすそ;

    invoke-direct {v1, v0, p1}, Lca/psiphon/PsiphonTunnel$〺つふすそ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_94
    move-exception p1

    new-instance v1, Lca/psiphon/PsiphonTunnel$〺つふすそ;

    invoke-direct {v1, v0, p1}, Lca/psiphon/PsiphonTunnel$〺つふすそ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_9c

    :goto_9b
    throw v1

    :goto_9c
    goto :goto_9b
.end method

.method private startDummyVpn(Landroid/net/VpnService$Builder;)Landroid/os/ParcelFileDescriptor;
    .registers 9
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    const-string v0, "startDummyVpn failed"

    invoke-static {}, Lca/psiphon/PsiphonTunnel;->selectPrivateAddress()Lca/psiphon/PsiphonTunnel$びぐびあび;

    move-result-object v1

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    :try_start_a
    new-instance v3, Ljava/util/Locale;

    const-string v4, "en"

    invoke-direct {v3, v4}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    invoke-static {v3}, Ljava/util/Locale;->setDefault(Ljava/util/Locale;)V

    const/16 v3, 0x5dc

    iget-object v4, v1, Lca/psiphon/PsiphonTunnel$びぐびあび;->びぐびあび:Ljava/lang/String;

    iget-object v5, p0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    check-cast v5, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    const v6, 0x7f110053

    .line 1
    invoke-virtual {v5, v6}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 2
    invoke-virtual {p1, v5}, Landroid/net/VpnService$Builder;->setSession(Ljava/lang/String;)Landroid/net/VpnService$Builder;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/net/VpnService$Builder;->setMtu(I)Landroid/net/VpnService$Builder;

    move-result-object p1

    iget-object v3, v1, Lca/psiphon/PsiphonTunnel$びぐびあび;->げつ〴ぬぐ:Ljava/lang/String;

    iget v5, v1, Lca/psiphon/PsiphonTunnel$びぐびあび;->くし〴〺ぅ:I

    invoke-virtual {p1, v3, v5}, Landroid/net/VpnService$Builder;->addAddress(Ljava/lang/String;I)Landroid/net/VpnService$Builder;

    move-result-object p1

    iget-object v3, v1, Lca/psiphon/PsiphonTunnel$びぐびあび;->〺つふすそ:Ljava/lang/String;

    iget v1, v1, Lca/psiphon/PsiphonTunnel$びぐびあび;->くし〴〺ぅ:I

    invoke-virtual {p1, v3, v1}, Landroid/net/VpnService$Builder;->addRoute(Ljava/lang/String;I)Landroid/net/VpnService$Builder;

    move-result-object p1

    invoke-virtual {p1, v4}, Landroid/net/VpnService$Builder;->addDnsServer(Ljava/lang/String;)Landroid/net/VpnService$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/VpnService$Builder;->establish()Landroid/os/ParcelFileDescriptor;

    move-result-object p1
    :try_end_43
    .catch Ljava/lang/IllegalArgumentException; {:try_start_a .. :try_end_43} :catch_57
    .catch Ljava/lang/IllegalStateException; {:try_start_a .. :try_end_43} :catch_50
    .catch Ljava/lang/SecurityException; {:try_start_a .. :try_end_43} :catch_49
    .catchall {:try_start_a .. :try_end_43} :catchall_47

    invoke-static {v2}, Ljava/util/Locale;->setDefault(Ljava/util/Locale;)V

    return-object p1

    :catchall_47
    move-exception p1

    goto :goto_5e

    :catch_49
    move-exception p1

    :try_start_4a
    new-instance v1, Lca/psiphon/PsiphonTunnel$〺つふすそ;

    invoke-direct {v1, v0, p1}, Lca/psiphon/PsiphonTunnel$〺つふすそ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_50
    move-exception p1

    new-instance v1, Lca/psiphon/PsiphonTunnel$〺つふすそ;

    invoke-direct {v1, v0, p1}, Lca/psiphon/PsiphonTunnel$〺つふすそ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_57
    move-exception p1

    new-instance v1, Lca/psiphon/PsiphonTunnel$〺つふすそ;

    invoke-direct {v1, v0, p1}, Lca/psiphon/PsiphonTunnel$〺つふすそ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
    :try_end_5e
    .catchall {:try_start_4a .. :try_end_5e} :catchall_47

    :goto_5e
    invoke-static {v2}, Ljava/util/Locale;->setDefault(Ljava/util/Locale;)V

    throw p1
.end method

.method private startPsiphon(Ljava/lang/String;)V
    .registers 9

    invoke-direct {p0}, Lca/psiphon/PsiphonTunnel;->stopPsiphon()V

    iget-object v0, p0, Lca/psiphon/PsiphonTunnel;->mIsWaitingForNetworkConnectivity:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, p0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    check-cast v0, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    const-string v1, "starting Psiphon library"

    invoke-virtual {v0, v1}, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;->いいにぽつ(Ljava/lang/String;)V

    :try_start_12
    iget-object v0, p0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    check-cast v0, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    sget-object v0, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/App;

    .line 3
    invoke-direct {p0, v0}, Lca/psiphon/PsiphonTunnel;->loadPsiphonConfig(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const-string v3, ""

    new-instance v4, Lca/psiphon/PsiphonTunnel$づざかべべ;

    invoke-direct {v4, p0, p0}, Lca/psiphon/PsiphonTunnel$づざかべべ;-><init>(Lca/psiphon/PsiphonTunnel;Lca/psiphon/PsiphonTunnel;)V

    invoke-direct {p0}, Lca/psiphon/PsiphonTunnel;->isVpnMode()Z

    move-result v5

    const/4 v6, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lpsi/Psi;->start(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpsi/PsiphonProvider;ZZ)V
    :try_end_2f
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_2f} :catch_39

    iget-object p1, p0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    check-cast p1, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    const-string v0, "Psiphon library started"

    invoke-virtual {p1, v0}, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;->いいにぽつ(Ljava/lang/String;)V

    return-void

    :catch_39
    move-exception p1

    new-instance v0, Lca/psiphon/PsiphonTunnel$〺つふすそ;

    const-string v1, "failed to start Psiphon library"

    invoke-direct {v0, v1, p1}, Lca/psiphon/PsiphonTunnel$〺つふすそ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method private startTun2Socks(Landroid/os/ParcelFileDescriptor;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .registers 20
    .annotation build Landroid/annotation/TargetApi;
        value = 0xc
    .end annotation

    move-object v9, p0

    iget-object v0, v9, Lca/psiphon/PsiphonTunnel;->mTun2SocksThread:Ljava/lang/Thread;

    if-eqz v0, :cond_6

    return-void

    :cond_6
    new-instance v10, Ljava/lang/Thread;

    new-instance v11, Lca/psiphon/PsiphonTunnel$げつ〴ぬぐ;

    move-object v0, v11

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lca/psiphon/PsiphonTunnel$げつ〴ぬぐ;-><init>(Lca/psiphon/PsiphonTunnel;Landroid/os/ParcelFileDescriptor;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-direct {v10, v11}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    iput-object v10, v9, Lca/psiphon/PsiphonTunnel;->mTun2SocksThread:Ljava/lang/Thread;

    invoke-virtual {v10}, Ljava/lang/Thread;->start()V

    iget-object v0, v9, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    check-cast v0, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    const-string v1, "tun2socks started"

    invoke-virtual {v0, v1}, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;->いいにぽつ(Ljava/lang/String;)V

    return-void
.end method

.method private startVpn()Z
    .registers 9
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    const-string v0, "startVpn failed"

    iget-object v1, p0, Lca/psiphon/PsiphonTunnel;->mVpnMode:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-static {}, Lca/psiphon/PsiphonTunnel;->selectPrivateAddress()Lca/psiphon/PsiphonTunnel$びぐびあび;

    move-result-object v1

    iput-object v1, p0, Lca/psiphon/PsiphonTunnel;->mPrivateAddress:Lca/psiphon/PsiphonTunnel$びぐびあび;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    :try_start_12
    new-instance v3, Ljava/util/Locale;

    const-string v4, "en"

    invoke-direct {v3, v4}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    invoke-static {v3}, Ljava/util/Locale;->setDefault(Ljava/util/Locale;)V

    const/16 v3, 0x5dc

    iget-object v4, p0, Lca/psiphon/PsiphonTunnel;->mPrivateAddress:Lca/psiphon/PsiphonTunnel$びぐびあび;

    iget-object v4, v4, Lca/psiphon/PsiphonTunnel$びぐびあび;->びぐびあび:Ljava/lang/String;

    iget-object v5, p0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    check-cast v5, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    invoke-virtual {v5}, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;->づざかべべ()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/net/VpnService$Builder;

    iget-object v6, p0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    check-cast v6, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    const v7, 0x7f110053

    .line 1
    invoke-virtual {v6, v7}, Landroid/net/VpnService;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 2
    invoke-virtual {v5, v6}, Landroid/net/VpnService$Builder;->setSession(Ljava/lang/String;)Landroid/net/VpnService$Builder;

    move-result-object v5

    invoke-virtual {v5, v3}, Landroid/net/VpnService$Builder;->setMtu(I)Landroid/net/VpnService$Builder;

    move-result-object v3

    iget-object v5, p0, Lca/psiphon/PsiphonTunnel;->mPrivateAddress:Lca/psiphon/PsiphonTunnel$びぐびあび;

    iget-object v6, v5, Lca/psiphon/PsiphonTunnel$びぐびあび;->げつ〴ぬぐ:Ljava/lang/String;

    iget v5, v5, Lca/psiphon/PsiphonTunnel$びぐびあび;->くし〴〺ぅ:I

    invoke-virtual {v3, v6, v5}, Landroid/net/VpnService$Builder;->addAddress(Ljava/lang/String;I)Landroid/net/VpnService$Builder;

    move-result-object v3

    iget-object v5, p0, Lca/psiphon/PsiphonTunnel;->mPrivateAddress:Lca/psiphon/PsiphonTunnel$びぐびあび;

    iget-object v6, v5, Lca/psiphon/PsiphonTunnel$びぐびあび;->〺つふすそ:Ljava/lang/String;

    iget v5, v5, Lca/psiphon/PsiphonTunnel$びぐびあび;->くし〴〺ぅ:I

    invoke-virtual {v3, v6, v5}, Landroid/net/VpnService$Builder;->addRoute(Ljava/lang/String;I)Landroid/net/VpnService$Builder;

    move-result-object v3

    invoke-virtual {v3, v4}, Landroid/net/VpnService$Builder;->addDnsServer(Ljava/lang/String;)Landroid/net/VpnService$Builder;

    move-result-object v3

    invoke-virtual {v3}, Landroid/net/VpnService$Builder;->establish()Landroid/os/ParcelFileDescriptor;

    move-result-object v3
    :try_end_5b
    .catch Ljava/lang/IllegalArgumentException; {:try_start_12 .. :try_end_5b} :catch_89
    .catch Ljava/lang/IllegalStateException; {:try_start_12 .. :try_end_5b} :catch_82
    .catch Ljava/lang/SecurityException; {:try_start_12 .. :try_end_5b} :catch_7b
    .catchall {:try_start_12 .. :try_end_5b} :catchall_79

    const/4 v4, 0x0

    if-nez v3, :cond_62

    invoke-static {v1}, Ljava/util/Locale;->setDefault(Ljava/util/Locale;)V

    return v4

    :cond_62
    :try_start_62
    iget-object v5, p0, Lca/psiphon/PsiphonTunnel;->mTunFd:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v5, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-object v3, p0, Lca/psiphon/PsiphonTunnel;->mRoutingThroughTunnel:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v3, p0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    const-string v4, "VPN established"

    check-cast v3, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    invoke-virtual {v3, v4}, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;->いいにぽつ(Ljava/lang/String;)V
    :try_end_75
    .catch Ljava/lang/IllegalArgumentException; {:try_start_62 .. :try_end_75} :catch_89
    .catch Ljava/lang/IllegalStateException; {:try_start_62 .. :try_end_75} :catch_82
    .catch Ljava/lang/SecurityException; {:try_start_62 .. :try_end_75} :catch_7b
    .catchall {:try_start_62 .. :try_end_75} :catchall_79

    invoke-static {v1}, Ljava/util/Locale;->setDefault(Ljava/util/Locale;)V

    return v2

    :catchall_79
    move-exception v0

    goto :goto_90

    :catch_7b
    move-exception v2

    :try_start_7c
    new-instance v3, Lca/psiphon/PsiphonTunnel$〺つふすそ;

    invoke-direct {v3, v0, v2}, Lca/psiphon/PsiphonTunnel$〺つふすそ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3

    :catch_82
    move-exception v2

    new-instance v3, Lca/psiphon/PsiphonTunnel$〺つふすそ;

    invoke-direct {v3, v0, v2}, Lca/psiphon/PsiphonTunnel$〺つふすそ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3

    :catch_89
    move-exception v2

    new-instance v3, Lca/psiphon/PsiphonTunnel$〺つふすそ;

    invoke-direct {v3, v0, v2}, Lca/psiphon/PsiphonTunnel$〺つふすそ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3
    :try_end_90
    .catchall {:try_start_7c .. :try_end_90} :catchall_79

    :goto_90
    invoke-static {v1}, Ljava/util/Locale;->setDefault(Ljava/util/Locale;)V

    throw v0
.end method

.method private stopPsiphon()V
    .registers 3

    iget-object v0, p0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    check-cast v0, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    const-string v1, "stopping Psiphon library"

    invoke-virtual {v0, v1}, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;->いいにぽつ(Ljava/lang/String;)V

    invoke-static {}, Lpsi/Psi;->stop()V

    iget-object v0, p0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    check-cast v0, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    const-string v1, "Psiphon library stopped"

    invoke-virtual {v0, v1}, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;->いいにぽつ(Ljava/lang/String;)V

    return-void
.end method

.method private stopTun2Socks()V
    .registers 3

    iget-object v0, p0, Lca/psiphon/PsiphonTunnel;->mTun2SocksThread:Ljava/lang/Thread;

    if-eqz v0, :cond_20

    :try_start_4
    invoke-static {}, Lca/psiphon/PsiphonTunnel;->terminateTun2Socks()I

    iget-object v0, p0, Lca/psiphon/PsiphonTunnel;->mTun2SocksThread:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->join()V
    :try_end_c
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_c} :catch_d

    goto :goto_14

    :catch_d
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :goto_14
    const/4 v0, 0x0

    iput-object v0, p0, Lca/psiphon/PsiphonTunnel;->mTun2SocksThread:Ljava/lang/Thread;

    iget-object v0, p0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    check-cast v0, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    const-string v1, "tun2socks stopped"

    invoke-virtual {v0, v1}, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;->いいにぽつ(Ljava/lang/String;)V

    :cond_20
    return-void
.end method

.method private stopVpn()V
    .registers 3

    invoke-direct {p0}, Lca/psiphon/PsiphonTunnel;->stopTun2Socks()V

    iget-object v0, p0, Lca/psiphon/PsiphonTunnel;->mTunFd:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/ParcelFileDescriptor;

    if-eqz v0, :cond_11

    :try_start_e
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_11} :catch_11

    :catch_11
    :cond_11
    iget-object v0, p0, Lca/psiphon/PsiphonTunnel;->mRoutingThroughTunnel:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method private static native terminateTun2Socks()I
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .registers 2

    new-instance v0, Ljava/lang/CloneNotSupportedException;

    invoke-direct {v0}, Ljava/lang/CloneNotSupportedException;-><init>()V

    throw v0
.end method

.method public exportExchangePayload()Ljava/lang/String;
    .registers 2

    invoke-static {}, Lpsi/Psi;->exportExchangePayload()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public importExchangePayload(Ljava/lang/String;)Z
    .registers 2

    invoke-static {p1}, Lpsi/Psi;->importExchangePayload(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public declared-synchronized restartPsiphon()V
    .registers 2

    monitor-enter p0

    :try_start_1
    invoke-direct {p0}, Lca/psiphon/PsiphonTunnel;->stopPsiphon()V

    const-string v0, ""

    invoke-direct {p0, v0}, Lca/psiphon/PsiphonTunnel;->startPsiphon(Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_1 .. :try_end_9} :catchall_b

    monitor-exit p0

    return-void

    :catchall_b
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public routeThroughTunnel()V
    .registers 10

    iget-object v0, p0, Lca/psiphon/PsiphonTunnel;->mRoutingThroughTunnel:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_b

    return-void

    :cond_b
    iget-object v0, p0, Lca/psiphon/PsiphonTunnel;->mTunFd:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/os/ParcelFileDescriptor;

    if-nez v2, :cond_18

    return-void

    :cond_18
    const-string v0, "127.0.0.1:"

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v3, p0, Lca/psiphon/PsiphonTunnel;->mLocalSocksProxyPort:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x1c84

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/16 v3, 0x5dc

    iget-object v0, p0, Lca/psiphon/PsiphonTunnel;->mPrivateAddress:Lca/psiphon/PsiphonTunnel$びぐびあび;

    iget-object v4, v0, Lca/psiphon/PsiphonTunnel$びぐびあび;->びぐびあび:Ljava/lang/String;

    const/4 v8, 0x1

    const-string v5, "255.255.255.0"

    move-object v1, p0

    invoke-direct/range {v1 .. v8}, Lca/psiphon/PsiphonTunnel;->startTun2Socks(Landroid/os/ParcelFileDescriptor;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    iget-object v0, p0, Lca/psiphon/PsiphonTunnel;->mHostService:Lca/psiphon/PsiphonTunnel$くし〴〺ぅ;

    check-cast v0, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;

    const-string v1, "routing through tunnel"

    invoke-virtual {v0, v1}, Lteam/dev/epro/apkcustom/sockets/psiphon/PsiphonVPNService;->いいにぽつ(Ljava/lang/String;)V

    return-void
.end method

.method public declared-synchronized seamlessVpnRestart(Landroid/net/VpnService$Builder;)V
    .registers 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    monitor-enter p0

    :try_start_1
    invoke-direct {p0, p1}, Lca/psiphon/PsiphonTunnel;->startDummyVpn(Landroid/net/VpnService$Builder;)Landroid/os/ParcelFileDescriptor;

    move-result-object p1
    :try_end_5
    .catchall {:try_start_1 .. :try_end_5} :catchall_1c

    :try_start_5
    invoke-direct {p0}, Lca/psiphon/PsiphonTunnel;->stopVpn()V

    invoke-direct {p0}, Lca/psiphon/PsiphonTunnel;->startVpn()Z
    :try_end_b
    .catchall {:try_start_5 .. :try_end_b} :catchall_15

    if-eqz p1, :cond_10

    :try_start_d
    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_10} :catch_10
    .catchall {:try_start_d .. :try_end_10} :catchall_1c

    :catch_10
    :cond_10
    :try_start_10
    invoke-virtual {p0}, Lca/psiphon/PsiphonTunnel;->restartPsiphon()V
    :try_end_13
    .catchall {:try_start_10 .. :try_end_13} :catchall_1c

    monitor-exit p0

    return-void

    :catchall_15
    move-exception v0

    if-eqz p1, :cond_1b

    :try_start_18
    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_1b
    .catch Ljava/io/IOException; {:try_start_18 .. :try_end_1b} :catch_1b
    .catchall {:try_start_18 .. :try_end_1b} :catchall_1c

    :catch_1b
    :cond_1b
    :try_start_1b
    throw v0
    :try_end_1c
    .catchall {:try_start_1b .. :try_end_1c} :catchall_1c

    :catchall_1c
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public setClientPlatformAffixes(Ljava/lang/String;Ljava/lang/String;)V
    .registers 4

    iget-object v0, p0, Lca/psiphon/PsiphonTunnel;->mClientPlatformPrefix:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-object p1, p0, Lca/psiphon/PsiphonTunnel;->mClientPlatformSuffix:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public declared-synchronized startRouting()Z
    .registers 2

    monitor-enter p0

    :try_start_1
    const-string v0, "socks2tun"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    invoke-direct {p0}, Lca/psiphon/PsiphonTunnel;->startVpn()Z

    move-result v0
    :try_end_a
    .catchall {:try_start_1 .. :try_end_a} :catchall_c

    monitor-exit p0

    return v0

    :catchall_c
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized startTunneling(Ljava/lang/String;)V
    .registers 2

    monitor-enter p0

    :try_start_1
    invoke-direct {p0, p1}, Lca/psiphon/PsiphonTunnel;->startPsiphon(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_1 .. :try_end_4} :catchall_6

    monitor-exit p0

    return-void

    :catchall_6
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized stop()V
    .registers 3

    monitor-enter p0

    :try_start_1
    invoke-direct {p0}, Lca/psiphon/PsiphonTunnel;->stopVpn()V

    invoke-direct {p0}, Lca/psiphon/PsiphonTunnel;->stopPsiphon()V

    iget-object v0, p0, Lca/psiphon/PsiphonTunnel;->mVpnMode:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, p0, Lca/psiphon/PsiphonTunnel;->mLocalSocksProxyPort:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V
    :try_end_12
    .catchall {:try_start_1 .. :try_end_12} :catchall_14

    monitor-exit p0

    return-void

    :catchall_14
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public writeRuntimeProfiles(Ljava/lang/String;II)V
    .registers 6

    int-to-long v0, p2

    int-to-long p2, p3

    invoke-static {p1, v0, v1, p2, p3}, Lpsi/Psi;->writeRuntimeProfiles(Ljava/lang/String;JJ)V

    return-void
.end method
