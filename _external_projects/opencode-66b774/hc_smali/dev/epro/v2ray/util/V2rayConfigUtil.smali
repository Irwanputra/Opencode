.class public Ldev/epro/v2ray/util/V2rayConfigUtil;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static volatile DNS_AGENT:Ljava/lang/String; = "1.1.1.1"

.field public static final DNS_DIRECT:Ljava/lang/String; = "223.5.5.5"

.field public static volatile PREF_CURR_CONFIG_DOMAIN:Ljava/lang/String; = ""

.field public static volatile PREF_CURR_CONFIG_OUTBOUND_TAGS:Ljava/util/LinkedHashSet; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static volatile PREF_LOCAL_DNS_ENABLED:Z = false

.field public static final SOCKS_PROTOCOL:Ljava/lang/String; = "socks://"

.field public static final SS_PROTOCOL:Ljava/lang/String; = "ss://"

.field public static final TAG_AGENT:Ljava/lang/String; = "proxy"

.field public static final TAG_BLOCKED:Ljava/lang/String; = "block"

.field public static final TAG_DIRECT:Ljava/lang/String; = "direct"

.field public static volatile TYPE_PROTOCOL:Ljava/lang/String; = null

.field public static final VMESS_PROTOCOL:Ljava/lang/String; = "vmess://"

.field public static isProxySharing:Z

.field public static isSniffingEnable:Z

.field private static jsonStr:Ljava/lang/String;

.field private static requestObj:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ごづごきえ;


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    sput-object v0, Ldev/epro/v2ray/util/V2rayConfigUtil;->PREF_CURR_CONFIG_OUTBOUND_TAGS:Ljava/util/LinkedHashSet;

    const/4 v0, 0x0

    sput-boolean v0, Ldev/epro/v2ray/util/V2rayConfigUtil;->isProxySharing:Z

    const/4 v0, 0x1

    sput-boolean v0, Ldev/epro/v2ray/util/V2rayConfigUtil;->isSniffingEnable:Z

    const-string v0, "{\"version\":\"1.1\",\"method\":\"GET\",\"path\":[\"/\"],\"headers\":{\"User-Agent\":[\"Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.75 Safari/537.36\",\"Mozilla/5.0 (iPhone; CPU iPhone OS 10_0_2 like Mac OS X) AppleWebKit/601.1 (KHTML, like Gecko) CriOS/53.0.2785.109 Mobile/14A456 Safari/601.1.46\"],\"Accept-Encoding\":[\"gzip, deflate\"],\"Connection\":[\"keep-alive\"],\"Pragma\":\"no-cache\"}}"

    sput-object v0, Ldev/epro/v2ray/util/V2rayConfigUtil;->jsonStr:Ljava/lang/String;

    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;

    invoke-direct {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;-><init>()V

    sget-object v1, Ldev/epro/v2ray/util/V2rayConfigUtil;->jsonStr:Ljava/lang/String;

    const-class v2, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ごづごきえ;

    invoke-virtual {v0, v1, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;->〺つふすそ(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ごづごきえ;

    sput-object v0, Ldev/epro/v2ray/util/V2rayConfigUtil;->requestObj:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ごづごきえ;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static ResolveVmess4Kitsunebi(Ljava/lang/String;)Ldev/epro/v2ray/util/VmessBean;
    .registers 7

    new-instance v0, Ldev/epro/v2ray/util/VmessBean;

    invoke-direct {v0}, Ldev/epro/v2ray/util/VmessBean;-><init>()V

    const-string v1, "vmess://"

    const-string v2, ""

    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "?"

    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_1a

    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    :cond_1a
    invoke-static {p0}, Ldev/epro/v2ray/util/Utils;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "@"

    invoke-virtual {p0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    array-length v1, p0

    const/4 v3, 0x2

    if-eq v1, v3, :cond_29

    return-object v0

    :cond_29
    aget-object v1, p0, v2

    const-string v4, ":"

    invoke-virtual {v1, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const/4 v5, 0x1

    aget-object p0, p0, v5

    invoke-virtual {p0, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    array-length v4, v1

    if-ne v4, v3, :cond_65

    array-length v4, p0

    if-eq v4, v3, :cond_3f

    goto :goto_65

    :cond_3f
    aget-object v3, p0, v2

    iput-object v3, v0, Ldev/epro/v2ray/util/VmessBean;->address:Ljava/lang/String;

    aget-object p0, p0, v5

    invoke-static {p0}, Ldev/epro/v2ray/util/Utils;->parseInt(Ljava/lang/String;)I

    move-result p0

    iput p0, v0, Ldev/epro/v2ray/util/VmessBean;->port:I

    aget-object p0, v1, v2

    iput-object p0, v0, Ldev/epro/v2ray/util/VmessBean;->security:Ljava/lang/String;

    aget-object p0, v1, v5

    iput-object p0, v0, Ldev/epro/v2ray/util/VmessBean;->id:Ljava/lang/String;

    const-string p0, "chacha20-poly1305"

    iput-object p0, v0, Ldev/epro/v2ray/util/VmessBean;->security:Ljava/lang/String;

    const-string p0, "tcp"

    iput-object p0, v0, Ldev/epro/v2ray/util/VmessBean;->network:Ljava/lang/String;

    const-string p0, "none"

    iput-object p0, v0, Ldev/epro/v2ray/util/VmessBean;->headerType:Ljava/lang/String;

    const-string p0, "Alien"

    iput-object p0, v0, Ldev/epro/v2ray/util/VmessBean;->remarks:Ljava/lang/String;

    iput v2, v0, Ldev/epro/v2ray/util/VmessBean;->alterId:I

    :cond_65
    :goto_65
    return-object v0
.end method

.method private static boundStreamSettings(Ldev/epro/v2ray/util/VmessBean;)Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;
    .registers 11

    new-instance v9, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;

    const-string v1, ""

    const-string v2, ""

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ldev/epro/v2ray/bean/outbounds/stream/tcp/TcpSettingsBean;Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;Ldev/epro/v2ray/bean/outbounds/stream/ws/WsSettingsBean;Ldev/epro/v2ray/bean/outbounds/stream/HttpSettingsBean;Ldev/epro/v2ray/bean/outbounds/stream/TlsSettingsBean;Ldev/epro/v2ray/bean/outbounds/stream/quic/QuicSettingBean;)V

    :try_start_10
    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessBean;->getNetwork()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->setNetwork(Ljava/lang/String;)V

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessBean;->getStreamSecurity()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->setSecurity(Ljava/lang/String;)V

    invoke-virtual {v9}, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->getNetwork()Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    const/16 v3, 0xcca

    const/4 v4, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eq v2, v3, :cond_5c

    const/16 v3, 0xedc

    if-eq v2, v3, :cond_52

    const v3, 0x19e18

    if-eq v2, v3, :cond_48

    const v3, 0x35223e

    if-eq v2, v3, :cond_3e

    goto :goto_65

    :cond_3e
    const-string v2, "quic"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_65

    const/4 v1, 0x3

    goto :goto_65

    :cond_48
    const-string v2, "kcp"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_65

    const/4 v1, 0x0

    goto :goto_65

    :cond_52
    const-string v2, "ws"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_65

    const/4 v1, 0x1

    goto :goto_65

    :cond_5c
    const-string v2, "h2"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_62
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_62} :catch_1ff

    if-eqz v0, :cond_65

    const/4 v1, 0x2

    :cond_65
    :goto_65
    if-eqz v1, :cond_1c7

    if-eq v1, v7, :cond_17f

    const-string v0, ","

    if-eq v1, v6, :cond_146

    if-eq v1, v5, :cond_113

    :try_start_6f
    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessBean;->getHeaderType()Ljava/lang/String;

    move-result-object v1

    const-string v2, "http"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1ff

    new-instance v1, Ldev/epro/v2ray/bean/outbounds/stream/tcp/TcpSettingsBean;

    invoke-direct {v1}, Ldev/epro/v2ray/bean/outbounds/stream/tcp/TcpSettingsBean;-><init>()V

    new-instance v2, Ldev/epro/v2ray/bean/outbounds/stream/tcp/HeaderBean;

    invoke-direct {v2}, Ldev/epro/v2ray/bean/outbounds/stream/tcp/HeaderBean;-><init>()V

    invoke-virtual {v1, v2}, Ldev/epro/v2ray/bean/outbounds/stream/tcp/TcpSettingsBean;->setHeader(Ldev/epro/v2ray/bean/outbounds/stream/tcp/HeaderBean;)V

    invoke-virtual {v1}, Ldev/epro/v2ray/bean/outbounds/stream/tcp/TcpSettingsBean;->getHeader()Ldev/epro/v2ray/bean/outbounds/stream/tcp/HeaderBean;

    move-result-object v2

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessBean;->getHeaderType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldev/epro/v2ray/bean/outbounds/stream/tcp/HeaderBean;->setType(Ljava/lang/String;)V

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessBean;->getRequestHost()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_cf

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessBean;->getRequestHost()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    sget-object v3, Ldev/epro/v2ray/util/V2rayConfigUtil;->requestObj:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ごづごきえ;

    const-string v4, "headers"

    invoke-virtual {v3, v4}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ごづごきえ;->くし〴〺ぅ(Ljava/lang/String;)Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ごづごきえ;

    move-result-object v3

    const-string v4, "Host"

    new-instance v5, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;

    invoke-direct {v5}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;-><init>()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->toString()Ljava/lang/String;

    move-result-object v2

    const-class v6, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/へぬ〴づぞ;

    invoke-virtual {v5, v2, v6}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;->〺つふすそ(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉざぅち〻;

    invoke-virtual {v3, v4, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ごづごきえ;->〺つふすそ(Ljava/lang/String;Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉざぅち〻;)V

    :cond_cf
    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessBean;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_105

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessBean;->getRequestHost()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    sget-object p0, Ldev/epro/v2ray/util/V2rayConfigUtil;->requestObj:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ごづごきえ;

    const-string v0, "path"

    new-instance v3, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;

    invoke-direct {v3}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;-><init>()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->toString()Ljava/lang/String;

    move-result-object v2

    const-class v4, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/へぬ〴づぞ;

    invoke-virtual {v3, v2, v4}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;->〺つふすそ(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉざぅち〻;

    invoke-virtual {p0, v0, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ごづごきえ;->〺つふすそ(Ljava/lang/String;Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉざぅち〻;)V

    :cond_105
    invoke-virtual {v1}, Ldev/epro/v2ray/bean/outbounds/stream/tcp/TcpSettingsBean;->getHeader()Ldev/epro/v2ray/bean/outbounds/stream/tcp/HeaderBean;

    move-result-object p0

    sget-object v0, Ldev/epro/v2ray/util/V2rayConfigUtil;->requestObj:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ごづごきえ;

    invoke-virtual {p0, v0}, Ldev/epro/v2ray/bean/outbounds/stream/tcp/HeaderBean;->setRequest(Ljava/lang/Object;)V

    invoke-virtual {v9, v1}, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->setTcpSettings(Ldev/epro/v2ray/bean/outbounds/stream/tcp/TcpSettingsBean;)V

    goto/16 :goto_1ff

    :cond_113
    new-instance v0, Ldev/epro/v2ray/bean/outbounds/stream/quic/QuicSettingBean;

    invoke-direct {v0}, Ldev/epro/v2ray/bean/outbounds/stream/quic/QuicSettingBean;-><init>()V

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessBean;->getRequestHost()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessBean;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1}, Ldev/epro/v2ray/bean/outbounds/stream/quic/QuicSettingBean;->setSecurity(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ldev/epro/v2ray/bean/outbounds/stream/quic/QuicSettingBean;->setKey(Ljava/lang/String;)V

    new-instance v1, Ldev/epro/v2ray/bean/outbounds/stream/quic/HeaderBean;

    invoke-direct {v1}, Ldev/epro/v2ray/bean/outbounds/stream/quic/HeaderBean;-><init>()V

    invoke-virtual {v0, v1}, Ldev/epro/v2ray/bean/outbounds/stream/quic/QuicSettingBean;->setHeader(Ldev/epro/v2ray/bean/outbounds/stream/quic/HeaderBean;)V

    invoke-virtual {v0}, Ldev/epro/v2ray/bean/outbounds/stream/quic/QuicSettingBean;->getHeader()Ldev/epro/v2ray/bean/outbounds/stream/quic/HeaderBean;

    move-result-object v1

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessBean;->getHeaderType()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ldev/epro/v2ray/bean/outbounds/stream/quic/HeaderBean;->setType(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->setQuicSettings(Ldev/epro/v2ray/bean/outbounds/stream/quic/QuicSettingBean;)V

    goto/16 :goto_1ff

    :cond_146
    new-instance v1, Ldev/epro/v2ray/bean/outbounds/stream/HttpSettingsBean;

    invoke-direct {v1}, Ldev/epro/v2ray/bean/outbounds/stream/HttpSettingsBean;-><init>()V

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessBean;->getRequestHost()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessBean;->getPath()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_16c

    invoke-virtual {v2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, Ldev/epro/v2ray/bean/outbounds/stream/HttpSettingsBean;->setHost(Ljava/util/List;)V

    :cond_16c
    invoke-virtual {v1, p0}, Ldev/epro/v2ray/bean/outbounds/stream/HttpSettingsBean;->setPath(Ljava/lang/String;)V

    invoke-virtual {v9, v1}, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->setHttpSettings(Ldev/epro/v2ray/bean/outbounds/stream/HttpSettingsBean;)V

    new-instance p0, Ldev/epro/v2ray/bean/outbounds/stream/TlsSettingsBean;

    invoke-direct {p0}, Ldev/epro/v2ray/bean/outbounds/stream/TlsSettingsBean;-><init>()V

    invoke-virtual {p0, v7}, Ldev/epro/v2ray/bean/outbounds/stream/TlsSettingsBean;->setAllowInsecure(Z)V

    :cond_17a
    :goto_17a
    invoke-virtual {v9, p0}, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->setTlsSettings(Ldev/epro/v2ray/bean/outbounds/stream/TlsSettingsBean;)V

    goto/16 :goto_1ff

    :cond_17f
    new-instance v0, Ldev/epro/v2ray/bean/outbounds/stream/ws/WsSettingsBean;

    invoke-direct {v0}, Ldev/epro/v2ray/bean/outbounds/stream/ws/WsSettingsBean;-><init>()V

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessBean;->getRequestHost()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessBean;->getPath()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1a9

    new-instance v2, Ldev/epro/v2ray/bean/outbounds/stream/ws/HeadersBean;

    invoke-direct {v2}, Ldev/epro/v2ray/bean/outbounds/stream/ws/HeadersBean;-><init>()V

    invoke-virtual {v0, v2}, Ldev/epro/v2ray/bean/outbounds/stream/ws/WsSettingsBean;->setHeaders(Ldev/epro/v2ray/bean/outbounds/stream/ws/HeadersBean;)V

    invoke-virtual {v0}, Ldev/epro/v2ray/bean/outbounds/stream/ws/WsSettingsBean;->getHeaders()Ldev/epro/v2ray/bean/outbounds/stream/ws/HeadersBean;

    move-result-object v2

    invoke-virtual {v2, v1}, Ldev/epro/v2ray/bean/outbounds/stream/ws/HeadersBean;->setHost(Ljava/lang/String;)V

    :cond_1a9
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1b2

    invoke-virtual {v0, p0}, Ldev/epro/v2ray/bean/outbounds/stream/ws/WsSettingsBean;->setPath(Ljava/lang/String;)V

    :cond_1b2
    invoke-virtual {v9, v0}, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->setWsSettings(Ldev/epro/v2ray/bean/outbounds/stream/ws/WsSettingsBean;)V

    new-instance p0, Ldev/epro/v2ray/bean/outbounds/stream/TlsSettingsBean;

    invoke-direct {p0}, Ldev/epro/v2ray/bean/outbounds/stream/TlsSettingsBean;-><init>()V

    invoke-virtual {p0, v7}, Ldev/epro/v2ray/bean/outbounds/stream/TlsSettingsBean;->setAllowInsecure(Z)V

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_17a

    invoke-virtual {p0, v1}, Ldev/epro/v2ray/bean/outbounds/stream/TlsSettingsBean;->setServerName(Ljava/lang/String;)V

    goto :goto_17a

    :cond_1c7
    new-instance v0, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;

    invoke-direct {v0}, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;-><init>()V

    const/16 v1, 0x546

    invoke-virtual {v0, v1}, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->setMtu(I)V

    const/16 v1, 0x32

    invoke-virtual {v0, v1}, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->setTti(I)V

    const/16 v1, 0xc

    invoke-virtual {v0, v1}, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->setUplinkCapacity(I)V

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->setDownlinkCapacity(I)V

    invoke-virtual {v0, v4}, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->setCongestion(Z)V

    invoke-virtual {v0, v7}, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->setReadBufferSize(I)V

    invoke-virtual {v0, v7}, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->setWriteBufferSize(I)V

    new-instance v1, Ldev/epro/v2ray/bean/outbounds/stream/kcp/HeaderBean;

    invoke-direct {v1}, Ldev/epro/v2ray/bean/outbounds/stream/kcp/HeaderBean;-><init>()V

    invoke-virtual {v0, v1}, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->setHeader(Ldev/epro/v2ray/bean/outbounds/stream/kcp/HeaderBean;)V

    invoke-virtual {v0}, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->getHeader()Ldev/epro/v2ray/bean/outbounds/stream/kcp/HeaderBean;

    move-result-object v1

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessBean;->getHeaderType()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ldev/epro/v2ray/bean/outbounds/stream/kcp/HeaderBean;->setType(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->setKcpSettings(Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;)V
    :try_end_1ff
    .catch Ljava/lang/Exception; {:try_start_6f .. :try_end_1ff} :catch_1ff

    :catch_1ff
    :cond_1ff
    :goto_1ff
    return-object v9
.end method

.method private static customLocalDns(Ldev/epro/v2ray/util/V2rayConfig;)Z
    .registers 15

    const-string v0, "53"

    const-string v1, "field"

    const-string v2, ""

    const/4 v3, 0x0

    :try_start_7
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    sget-object v6, Ldev/epro/v2ray/util/V2rayConfigUtil;->DNS_AGENT:Ljava/lang/String;

    invoke-static {v6}, Ldev/epro/v2ray/util/Utils;->getRemoteDnsServers(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1b
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2b

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1b

    :cond_2b
    const-string v7, "223.5.5.5"

    invoke-static {v7}, Ldev/epro/v2ray/util/Utils;->getDomesticDnsServers(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v7

    invoke-static {v2}, Ldev/epro/v2ray/util/V2rayConfigUtil;->userRule2Domian(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v8

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v9

    const/16 v10, 0x35

    if-lez v9, :cond_4b

    new-instance v9, Ldev/epro/v2ray/bean/dns/ServersBean;

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-direct {v9, v11, v10, v8}, Ldev/epro/v2ray/bean/dns/ServersBean;-><init>(Ljava/lang/String;ILjava/util/List;)V

    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4b
    invoke-static {v2}, Ldev/epro/v2ray/util/V2rayConfigUtil;->userRule2Domian(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v8

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-lez v9, :cond_63

    new-instance v9, Ldev/epro/v2ray/bean/dns/ServersBean;

    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-direct {v9, v11, v10, v8}, Ldev/epro/v2ray/bean/dns/ServersBean;-><init>(Ljava/lang/String;ILjava/util/List;)V

    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_63
    invoke-static {v2}, Ldev/epro/v2ray/util/V2rayConfigUtil;->userRule2Domian(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v8
    :try_end_6b
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_6b} :catch_1a6

    const-string v9, "127.0.0.1"

    if-lez v8, :cond_83

    :try_start_6f
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_73
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_83

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v4, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_73

    :cond_83
    const-string v2, "domain:googleapis.cn"

    const-string v8, "googleapis.com"

    invoke-virtual {v4, v2, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ldev/epro/v2ray/bean/dns/DnsBean;

    invoke-direct {v2, v5, v4}, Ldev/epro/v2ray/bean/dns/DnsBean;-><init>(Ljava/util/List;Ljava/util/Map;)V

    invoke-virtual {p0, v2}, Ldev/epro/v2ray/util/V2rayConfig;->setDns(Ldev/epro/v2ray/bean/dns/DnsBean;)V

    invoke-virtual {p0}, Ldev/epro/v2ray/util/V2rayConfig;->getInbounds()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v4, 0x0

    :cond_9b
    :goto_9b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5
    :try_end_9f
    .catch Ljava/lang/Exception; {:try_start_6f .. :try_end_9f} :catch_1a6

    const/4 v8, 0x1

    const-string v11, "dokodemo-door"

    const-string v12, "dns-in"

    if-eqz v5, :cond_c2

    :try_start_a6
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ldev/epro/v2ray/bean/inbounds/InboundBean;

    invoke-virtual {v5}, Ldev/epro/v2ray/bean/inbounds/InboundBean;->getProtocol()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_9b

    invoke-virtual {v5}, Ldev/epro/v2ray/bean/inbounds/InboundBean;->getTag()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9b

    const/4 v4, 0x1

    goto :goto_9b

    :cond_c2
    const/4 v2, 0x0

    if-nez v4, :cond_ff

    new-instance v4, Ldev/epro/v2ray/bean/inbounds/InSettingsBean;

    invoke-direct {v4}, Ldev/epro/v2ray/bean/inbounds/InSettingsBean;-><init>()V

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v4, v5}, Ldev/epro/v2ray/bean/inbounds/InSettingsBean;->setAddress(Ljava/lang/String;)V

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5}, Ldev/epro/v2ray/bean/inbounds/InSettingsBean;->setPort(Ljava/lang/Integer;)V

    const-string v5, "tcp,udp"

    invoke-virtual {v4, v5}, Ldev/epro/v2ray/bean/inbounds/InSettingsBean;->setNetwork(Ljava/lang/String;)V

    new-instance v5, Ldev/epro/v2ray/bean/inbounds/InboundBean;

    invoke-direct {v5}, Ldev/epro/v2ray/bean/inbounds/InboundBean;-><init>()V

    invoke-virtual {v5, v12}, Ldev/epro/v2ray/bean/inbounds/InboundBean;->setTag(Ljava/lang/String;)V

    const/16 v10, 0x2a37

    invoke-virtual {v5, v10}, Ldev/epro/v2ray/bean/inbounds/InboundBean;->setPort(I)V

    invoke-virtual {v5, v9}, Ldev/epro/v2ray/bean/inbounds/InboundBean;->setListen(Ljava/lang/String;)V

    invoke-virtual {v5, v11}, Ldev/epro/v2ray/bean/inbounds/InboundBean;->setProtocol(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ldev/epro/v2ray/bean/inbounds/InboundBean;->setSettings(Ldev/epro/v2ray/bean/inbounds/InSettingsBean;)V

    invoke-virtual {v5, v2}, Ldev/epro/v2ray/bean/inbounds/InboundBean;->setSniffing(Ldev/epro/v2ray/bean/inbounds/SniffingBean;)V

    invoke-virtual {p0}, Ldev/epro/v2ray/util/V2rayConfig;->getInbounds()Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_ff
    invoke-virtual {p0}, Ldev/epro/v2ray/util/V2rayConfig;->getOutbounds()Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v5, 0x0

    :cond_108
    :goto_108
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v9
    :try_end_10c
    .catch Ljava/lang/Exception; {:try_start_a6 .. :try_end_10c} :catch_1a6

    const-string v10, "dns"

    const-string v11, "dns-out"

    if-eqz v9, :cond_12e

    :try_start_112
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ldev/epro/v2ray/bean/outbounds/OutboundBean;

    invoke-virtual {v9}, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->getProtocol()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_108

    invoke-virtual {v9}, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->getTag()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_108

    const/4 v5, 0x1

    goto :goto_108

    :cond_12e
    if-nez v5, :cond_14b

    new-instance v4, Ldev/epro/v2ray/bean/outbounds/OutboundBean;

    invoke-direct {v4}, Ldev/epro/v2ray/bean/outbounds/OutboundBean;-><init>()V

    invoke-virtual {v4, v10}, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->setProtocol(Ljava/lang/String;)V

    invoke-virtual {v4, v11}, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->setTag(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->setSettings(Ldev/epro/v2ray/bean/outbounds/settings/OutSettingsBean;)V

    invoke-virtual {v4, v2}, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->setStreamSettings(Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;)V

    invoke-virtual {v4, v2}, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->setMux(Ldev/epro/v2ray/bean/outbounds/MuxBean;)V

    invoke-virtual {p0}, Ldev/epro/v2ray/util/V2rayConfig;->getOutbounds()Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_14b
    new-instance v4, Ldev/epro/v2ray/bean/routing/RulesBean;

    invoke-direct {v4}, Ldev/epro/v2ray/bean/routing/RulesBean;-><init>()V

    invoke-virtual {v4, v1}, Ldev/epro/v2ray/bean/routing/RulesBean;->setType(Ljava/lang/String;)V

    const-string v5, "direct"

    invoke-virtual {v4, v5}, Ldev/epro/v2ray/bean/routing/RulesBean;->setOutboundTag(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ldev/epro/v2ray/bean/routing/RulesBean;->setPort(Ljava/lang/String;)V

    invoke-virtual {v4, v7}, Ldev/epro/v2ray/bean/routing/RulesBean;->setIp(Ljava/util/ArrayList;)V

    invoke-virtual {v4, v2}, Ldev/epro/v2ray/bean/routing/RulesBean;->setDomain(Ljava/util/ArrayList;)V

    invoke-virtual {p0}, Ldev/epro/v2ray/util/V2rayConfig;->getRouting()Ldev/epro/v2ray/bean/routing/RoutingBean;

    move-result-object v5

    invoke-virtual {v5}, Ldev/epro/v2ray/bean/routing/RoutingBean;->getRules()Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v4, Ldev/epro/v2ray/bean/routing/RulesBean;

    invoke-direct {v4}, Ldev/epro/v2ray/bean/routing/RulesBean;-><init>()V

    invoke-virtual {v4, v1}, Ldev/epro/v2ray/bean/routing/RulesBean;->setType(Ljava/lang/String;)V

    const-string v5, "proxy"

    invoke-virtual {v4, v5}, Ldev/epro/v2ray/bean/routing/RulesBean;->setOutboundTag(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ldev/epro/v2ray/bean/routing/RulesBean;->setPort(Ljava/lang/String;)V

    invoke-virtual {v4, v6}, Ldev/epro/v2ray/bean/routing/RulesBean;->setIp(Ljava/util/ArrayList;)V

    invoke-virtual {v4, v2}, Ldev/epro/v2ray/bean/routing/RulesBean;->setDomain(Ljava/util/ArrayList;)V

    invoke-virtual {p0}, Ldev/epro/v2ray/util/V2rayConfig;->getRouting()Ldev/epro/v2ray/bean/routing/RoutingBean;

    move-result-object p0

    invoke-virtual {p0}, Ldev/epro/v2ray/bean/routing/RoutingBean;->getRules()Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p0, Ldev/epro/v2ray/bean/routing/RulesBean;

    invoke-direct {p0}, Ldev/epro/v2ray/bean/routing/RulesBean;-><init>()V

    invoke-virtual {p0, v1}, Ldev/epro/v2ray/bean/routing/RulesBean;->setType(Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, v0}, Ldev/epro/v2ray/bean/routing/RulesBean;->setInboundTag(Ljava/util/ArrayList;)V

    invoke-virtual {p0, v11}, Ldev/epro/v2ray/bean/routing/RulesBean;->setOutboundTag(Ljava/lang/String;)V

    invoke-virtual {p0, v2}, Ldev/epro/v2ray/bean/routing/RulesBean;->setDomain(Ljava/util/ArrayList;)V
    :try_end_1a6
    .catch Ljava/lang/Exception; {:try_start_112 .. :try_end_1a6} :catch_1a6

    :catch_1a6
    return v3
.end method

.method private static customRemoteDns(Ldev/epro/v2ray/util/V2rayConfig;)Z
    .registers 4

    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sget-object v1, Ldev/epro/v2ray/util/V2rayConfigUtil;->DNS_AGENT:Ljava/lang/String;

    invoke-static {v1}, Ldev/epro/v2ray/util/Utils;->getRemoteDnsServers(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_f

    :cond_1f
    new-instance v1, Ldev/epro/v2ray/bean/dns/DnsBean;

    invoke-direct {v1}, Ldev/epro/v2ray/bean/dns/DnsBean;-><init>()V

    invoke-virtual {v1, v0}, Ldev/epro/v2ray/bean/dns/DnsBean;->setServers(Ljava/util/List;)V

    invoke-virtual {p0, v1}, Ldev/epro/v2ray/util/V2rayConfig;->setDns(Ldev/epro/v2ray/bean/dns/DnsBean;)V
    :try_end_2a
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_2a} :catch_2c

    const/4 p0, 0x1

    return p0

    :catch_2c
    const/4 p0, 0x0

    return p0
.end method

.method public static getV2rayConfig(Landroid/content/Context;Ldev/epro/v2ray/util/VmessBean;Ljava/lang/String;)Ldev/epro/v2ray/util/Result;
    .registers 6

    new-instance v0, Ldev/epro/v2ray/util/Result;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-string v2, ""

    invoke-direct {v0, v1, v2}, Ldev/epro/v2ray/util/Result;-><init>(Ljava/lang/Boolean;Ljava/lang/String;)V

    invoke-virtual {p1}, Ldev/epro/v2ray/util/VmessBean;->getConfigType()I

    move-result v0

    sget-object v1, Ldev/epro/v2ray/util/EConfigType;->CUSTOM:Ldev/epro/v2ray/util/EConfigType;

    iget v1, v1, Ldev/epro/v2ray/util/EConfigType;->value:I

    if-ne v0, v1, :cond_18

    invoke-static {p2}, Ldev/epro/v2ray/util/V2rayConfigUtil;->getV2rayConfigType2(Ljava/lang/String;)Ldev/epro/v2ray/util/Result;

    move-result-object p0

    goto :goto_1c

    :cond_18
    invoke-static {p0, p1}, Ldev/epro/v2ray/util/V2rayConfigUtil;->getV2rayConfigType1(Landroid/content/Context;Ldev/epro/v2ray/util/VmessBean;)Ldev/epro/v2ray/util/Result;

    move-result-object p0

    :goto_1c
    return-object p0
.end method

.method private static getV2rayConfigType1(Landroid/content/Context;Ldev/epro/v2ray/util/VmessBean;)Ldev/epro/v2ray/util/Result;
    .registers 5

    new-instance v0, Ldev/epro/v2ray/util/Result;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-string v2, ""

    invoke-direct {v0, v1, v2}, Ldev/epro/v2ray/util/Result;-><init>(Ljava/lang/Boolean;Ljava/lang/String;)V

    :try_start_9
    const-string v1, "v2ray_config.json"

    invoke-static {p0, v1}, Ldev/epro/v2ray/util/V2rayConfigUtil;->readTextFromAssets(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_16

    return-object v0

    :cond_16
    new-instance v1, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;

    invoke-direct {v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;-><init>()V

    const-class v2, Ldev/epro/v2ray/util/V2rayConfig;

    invoke-virtual {v1, p0, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;->〺つふすそ(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ldev/epro/v2ray/util/V2rayConfig;

    if-nez p0, :cond_26

    return-object v0

    :cond_26
    invoke-static {p0}, Ldev/epro/v2ray/util/V2rayConfigUtil;->inbounds(Ldev/epro/v2ray/util/V2rayConfig;)Z

    invoke-static {p1, p0}, Ldev/epro/v2ray/util/V2rayConfigUtil;->outbounds(Ldev/epro/v2ray/util/VmessBean;Ldev/epro/v2ray/util/V2rayConfig;)Z

    invoke-static {p0}, Ldev/epro/v2ray/util/V2rayConfigUtil;->routing(Ldev/epro/v2ray/util/V2rayConfig;)Z

    sget-boolean p1, Ldev/epro/v2ray/util/V2rayConfigUtil;->PREF_LOCAL_DNS_ENABLED:Z

    if-eqz p1, :cond_37

    invoke-static {p0}, Ldev/epro/v2ray/util/V2rayConfigUtil;->customLocalDns(Ldev/epro/v2ray/util/V2rayConfig;)Z

    goto :goto_3a

    :cond_37
    invoke-static {p0}, Ldev/epro/v2ray/util/V2rayConfigUtil;->customRemoteDns(Ldev/epro/v2ray/util/V2rayConfig;)Z

    :goto_3a
    new-instance p1, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/てぜきぽく;

    invoke-direct {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/てぜきぽく;-><init>()V

    const/4 v1, 0x1

    .line 1
    iput-boolean v1, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/てぜきぽく;->いいにぽつ:Z

    .line 2
    invoke-virtual {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/てぜきぽく;->げつ〴ぬぐ()Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;

    move-result-object p1

    invoke-virtual {p1, p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;->ぁごぐすすぃ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, p1}, Ldev/epro/v2ray/util/Result;->setStatus(Ljava/lang/Boolean;)V

    invoke-virtual {v0, p0}, Ldev/epro/v2ray/util/Result;->setContent(Ljava/lang/String;)V
    :try_end_52
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_52} :catch_52

    :catch_52
    return-object v0
.end method

.method private static getV2rayConfigType2(Ljava/lang/String;)Ldev/epro/v2ray/util/Result;
    .registers 4

    new-instance v0, Ldev/epro/v2ray/util/Result;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-string v2, ""

    invoke-direct {v0, v1, v2}, Ldev/epro/v2ray/util/Result;-><init>(Ljava/lang/Boolean;Ljava/lang/String;)V

    :try_start_9
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ldev/epro/v2ray/util/Result;->setStatus(Ljava/lang/Boolean;)V

    invoke-virtual {v0, p0}, Ldev/epro/v2ray/util/Result;->setContent(Ljava/lang/String;)V

    invoke-static {p0}, Ldev/epro/v2ray/util/V2rayConfigUtil;->parseDomainNameAndTag(Ljava/lang/String;)V
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_14} :catch_14

    :catch_14
    return-object v0
.end method

.method public static importConfig(Ljava/lang/String;Ljava/lang/String;)Ldev/epro/v2ray/util/VmessBean;
    .registers 13

    const-string v0, "socks://"

    const-string v1, "ss://"

    const-string v2, "vmess://"

    new-instance v3, Ldev/epro/v2ray/util/VmessBean;

    invoke-direct {v3}, Ldev/epro/v2ray/util/VmessBean;-><init>()V

    if-eqz p0, :cond_21b

    :try_start_d
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_15

    goto/16 :goto_21b

    :cond_15
    invoke-virtual {p0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_19} :catch_21b

    const-string v5, ""

    if-eqz v4, :cond_104

    :try_start_1d
    sput-object v2, Ldev/epro/v2ray/util/V2rayConfigUtil;->TYPE_PROTOCOL:Ljava/lang/String;

    const-string v0, "?"

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    invoke-static {p0}, Ldev/epro/v2ray/util/V2rayConfigUtil;->tryParseNewVmess(Ljava/lang/String;)Ldev/epro/v2ray/util/VmessBean;

    move-result-object v1
    :try_end_29
    .catch Ljava/lang/Exception; {:try_start_1d .. :try_end_29} :catch_21b

    if-eqz v1, :cond_34

    :try_start_2b
    invoke-virtual {v1, p1}, Ldev/epro/v2ray/util/VmessBean;->setSubid(Ljava/lang/String;)V
    :try_end_2e
    .catch Ljava/lang/Exception; {:try_start_2b .. :try_end_2e} :catch_31

    move-object v3, v1

    goto/16 :goto_fe

    :catch_31
    move-object v3, v1

    goto/16 :goto_21b

    :cond_34
    if-lez v0, :cond_3d

    :try_start_36
    invoke-static {p0}, Ldev/epro/v2ray/util/V2rayConfigUtil;->ResolveVmess4Kitsunebi(Ljava/lang/String;)Ldev/epro/v2ray/util/VmessBean;

    move-result-object p0

    move-object v3, p0

    goto/16 :goto_fe

    :cond_3d
    invoke-virtual {p0, v2, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ldev/epro/v2ray/util/Utils;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4c

    return-object v3

    :cond_4c
    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;

    invoke-direct {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;-><init>()V

    const-class v1, Ldev/epro/v2ray/util/VmessQRCode;

    invoke-virtual {v0, p0, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;->〺つふすそ(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ldev/epro/v2ray/util/VmessQRCode;

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessQRCode;->getAdd()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_103

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessQRCode;->getPort()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_103

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessQRCode;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_103

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessQRCode;->getAid()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_103

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessQRCode;->getNet()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_8c

    goto :goto_103

    :cond_8c
    sget-object v0, Ldev/epro/v2ray/util/EConfigType;->VMESS:Ldev/epro/v2ray/util/EConfigType;

    iget v0, v0, Ldev/epro/v2ray/util/EConfigType;->value:I

    invoke-virtual {v3, v0}, Ldev/epro/v2ray/util/VmessBean;->setConfigType(I)V

    const-string v0, "auto"

    invoke-virtual {v3, v0}, Ldev/epro/v2ray/util/VmessBean;->setSecurity(Ljava/lang/String;)V

    const-string v0, "tcp"

    invoke-virtual {v3, v0}, Ldev/epro/v2ray/util/VmessBean;->setNetwork(Ljava/lang/String;)V

    const-string v0, "none"

    invoke-virtual {v3, v0}, Ldev/epro/v2ray/util/VmessBean;->setHeaderType(Ljava/lang/String;)V

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessQRCode;->getV()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ldev/epro/v2ray/util/Utils;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v3, v0}, Ldev/epro/v2ray/util/VmessBean;->setConfigVersion(I)V

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessQRCode;->getPs()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ldev/epro/v2ray/util/VmessBean;->setRemarks(Ljava/lang/String;)V

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessQRCode;->getAdd()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ldev/epro/v2ray/util/VmessBean;->setAddress(Ljava/lang/String;)V

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessQRCode;->getPort()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v3, v0}, Ldev/epro/v2ray/util/VmessBean;->setPort(I)V

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessQRCode;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ldev/epro/v2ray/util/VmessBean;->setId(Ljava/lang/String;)V

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessQRCode;->getAid()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v3, v0}, Ldev/epro/v2ray/util/VmessBean;->setAlterId(I)V

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessQRCode;->getNet()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ldev/epro/v2ray/util/VmessBean;->setNetwork(Ljava/lang/String;)V

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessQRCode;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ldev/epro/v2ray/util/VmessBean;->setHeaderType(Ljava/lang/String;)V

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessQRCode;->getHost()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ldev/epro/v2ray/util/VmessBean;->setRequestHost(Ljava/lang/String;)V

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessQRCode;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ldev/epro/v2ray/util/VmessBean;->setPath(Ljava/lang/String;)V

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessQRCode;->getTls()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ldev/epro/v2ray/util/VmessBean;->setStreamSecurity(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ldev/epro/v2ray/util/VmessBean;->setSubid(Ljava/lang/String;)V

    :goto_fe
    invoke-static {v3}, Ldev/epro/v2ray/util/V2rayConfigUtil;->upgradeConfigVersion(Ldev/epro/v2ray/util/VmessBean;)I

    goto/16 :goto_21b

    :cond_103
    :goto_103
    return-object v3

    :cond_104
    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2
    :try_end_108
    .catch Ljava/lang/Exception; {:try_start_36 .. :try_end_108} :catch_21b

    const-string v4, "]"

    const-string v6, "["

    const/4 v7, 0x2

    const-string v8, "#"

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eqz v2, :cond_1ae

    :try_start_113
    sput-object v1, Ldev/epro/v2ray/util/V2rayConfigUtil;->TYPE_PROTOCOL:Ljava/lang/String;

    invoke-virtual {p0, v1, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0, v8}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0
    :try_end_11d
    .catch Ljava/lang/Exception; {:try_start_113 .. :try_end_11d} :catch_21b

    if-lez v0, :cond_133

    add-int/lit8 v1, v0, 0x1

    :try_start_121
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ldev/epro/v2ray/util/Utils;->urlDecode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v3, Ldev/epro/v2ray/util/VmessBean;->remarks:Ljava/lang/String;
    :try_end_12f
    .catch Ljava/lang/Exception; {:try_start_121 .. :try_end_12f} :catch_12f

    :catch_12f
    :try_start_12f
    invoke-virtual {p0, v9, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    :cond_133
    const-string v0, "@"

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_15b

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v9, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ldev/epro/v2ray/util/Utils;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {p0, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_15f

    :cond_15b
    invoke-static {p0}, Ldev/epro/v2ray/util/Utils;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :goto_15f
    const-string v0, "^(.+?):(.*)@(.+?):(\\d+?)/?$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    if-nez p0, :cond_16c

    return-object v3

    :cond_16c
    invoke-virtual {p0, v10}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Ldev/epro/v2ray/util/VmessBean;->security:Ljava/lang/String;

    invoke-virtual {p0, v7}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Ldev/epro/v2ray/util/VmessBean;->id:Ljava/lang/String;

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Ldev/epro/v2ray/util/VmessBean;->address:Ljava/lang/String;

    if-eqz v0, :cond_1a0

    invoke-virtual {v0, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1a0

    iget-object v0, v3, Ldev/epro/v2ray/util/VmessBean;->address:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1a0

    iget-object v0, v3, Ldev/epro/v2ray/util/VmessBean;->address:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v1, v10

    invoke-virtual {v0, v10, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Ldev/epro/v2ray/util/VmessBean;->address:Ljava/lang/String;

    :cond_1a0
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    :goto_1a9
    iput p0, v3, Ldev/epro/v2ray/util/VmessBean;->port:I

    iput-object p1, v3, Ldev/epro/v2ray/util/VmessBean;->subid:Ljava/lang/String;

    goto :goto_21b

    :cond_1ae
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_219

    sput-object v0, Ldev/epro/v2ray/util/V2rayConfigUtil;->TYPE_PROTOCOL:Ljava/lang/String;

    invoke-virtual {p0, v0, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0, v8}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0
    :try_end_1be
    .catch Ljava/lang/Exception; {:try_start_12f .. :try_end_1be} :catch_21b

    if-lez v0, :cond_1d4

    add-int/lit8 v1, v0, 0x1

    :try_start_1c2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ldev/epro/v2ray/util/Utils;->urlDecode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v3, Ldev/epro/v2ray/util/VmessBean;->remarks:Ljava/lang/String;
    :try_end_1d0
    .catch Ljava/lang/Exception; {:try_start_1c2 .. :try_end_1d0} :catch_1d0

    :catch_1d0
    :try_start_1d0
    invoke-virtual {p0, v9, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    :cond_1d4
    const-string v0, ":"

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-gez v0, :cond_1e0

    invoke-static {p0}, Ldev/epro/v2ray/util/Utils;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :cond_1e0
    const-string v0, "^(.+?):(\\d+?)$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    if-nez p0, :cond_1ed

    return-object v3

    :cond_1ed
    invoke-virtual {p0, v10}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Ldev/epro/v2ray/util/VmessBean;->address:Ljava/lang/String;

    if-eqz v0, :cond_210

    invoke-virtual {v0, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_210

    iget-object v0, v3, Ldev/epro/v2ray/util/VmessBean;->address:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_210

    iget-object v0, v3, Ldev/epro/v2ray/util/VmessBean;->address:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v1, v10

    invoke-virtual {v0, v10, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Ldev/epro/v2ray/util/VmessBean;->address:Ljava/lang/String;

    :cond_210
    invoke-virtual {p0, v7}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0
    :try_end_218
    .catch Ljava/lang/Exception; {:try_start_1d0 .. :try_end_218} :catch_21b

    goto :goto_1a9

    :cond_219
    const/4 p0, 0x0

    return-object p0

    :catch_21b
    :cond_21b
    :goto_21b
    return-object v3
.end method

.method private static inbounds(Ldev/epro/v2ray/util/V2rayConfig;)Z
    .registers 5

    const/4 v0, 0x0

    :try_start_1
    invoke-virtual {p0}, Ldev/epro/v2ray/util/V2rayConfig;->getInbounds()Ljava/util/ArrayList;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_9
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ldev/epro/v2ray/bean/inbounds/InboundBean;

    sget-boolean v3, Ldev/epro/v2ray/util/V2rayConfigUtil;->isProxySharing:Z

    if-nez v3, :cond_9

    const-string v3, "127.0.0.1"

    invoke-virtual {v2, v3}, Ldev/epro/v2ray/bean/inbounds/InboundBean;->setListen(Ljava/lang/String;)V

    goto :goto_9

    :cond_1f
    invoke-virtual {p0}, Ldev/epro/v2ray/util/V2rayConfig;->getInbounds()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldev/epro/v2ray/bean/inbounds/InboundBean;

    const/16 v2, 0x438

    invoke-virtual {v1, v2}, Ldev/epro/v2ray/bean/inbounds/InboundBean;->setPort(I)V

    invoke-virtual {p0}, Ldev/epro/v2ray/util/V2rayConfig;->getInbounds()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldev/epro/v2ray/bean/inbounds/InboundBean;

    invoke-virtual {v1}, Ldev/epro/v2ray/bean/inbounds/InboundBean;->getSniffing()Ldev/epro/v2ray/bean/inbounds/SniffingBean;

    move-result-object v1

    if-eqz v1, :cond_51

    invoke-virtual {p0}, Ldev/epro/v2ray/util/V2rayConfig;->getInbounds()Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ldev/epro/v2ray/bean/inbounds/InboundBean;

    invoke-virtual {p0}, Ldev/epro/v2ray/bean/inbounds/InboundBean;->getSniffing()Ldev/epro/v2ray/bean/inbounds/SniffingBean;

    move-result-object p0

    sget-boolean v1, Ldev/epro/v2ray/util/V2rayConfigUtil;->isSniffingEnable:Z

    invoke-virtual {p0, v1}, Ldev/epro/v2ray/bean/inbounds/SniffingBean;->setEnabled(Z)V
    :try_end_51
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_51} :catch_53

    :cond_51
    const/4 p0, 0x1

    return p0

    :catch_53
    return v0
.end method

.method public static isValidConfig(Ljava/lang/String;)Z
    .registers 3

    const/4 v0, 0x0

    :try_start_1
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p0, "outbounds"

    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_16

    const-string p0, "outbound"

    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p0
    :try_end_14
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_14} :catch_17

    if-eqz p0, :cond_17

    :cond_16
    const/4 v0, 0x1

    :catch_17
    :cond_17
    return v0
.end method

.method private static outbounds(Ldev/epro/v2ray/util/VmessBean;Ldev/epro/v2ray/util/V2rayConfig;)Z
    .registers 7

    const/4 v0, 0x0

    :try_start_1
    invoke-virtual {p1}, Ldev/epro/v2ray/util/V2rayConfig;->getOutbounds()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldev/epro/v2ray/bean/outbounds/OutboundBean;

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessBean;->getConfigType()I

    move-result v2

    invoke-static {v2}, Ldev/epro/v2ray/util/EConfigType;->fromInt(I)Ldev/epro/v2ray/util/EConfigType;

    move-result-object v2

    if-eqz v2, :cond_20

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->setProtocol(Ljava/lang/String;)V

    :cond_20
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-eqz v2, :cond_28

    goto/16 :goto_c2

    :cond_28
    invoke-virtual {v1}, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->getSettings()Ldev/epro/v2ray/bean/outbounds/settings/OutSettingsBean;

    move-result-object v2

    if-eqz v2, :cond_36

    invoke-virtual {v1}, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->getSettings()Ldev/epro/v2ray/bean/outbounds/settings/OutSettingsBean;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ldev/epro/v2ray/bean/outbounds/settings/OutSettingsBean;->setServers(Ljava/util/List;)V

    :cond_36
    invoke-virtual {p1}, Ldev/epro/v2ray/util/V2rayConfig;->getOutbounds()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ldev/epro/v2ray/bean/outbounds/OutboundBean;

    invoke-virtual {v2}, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->getSettings()Ldev/epro/v2ray/bean/outbounds/settings/OutSettingsBean;

    move-result-object v2

    if-eqz v2, :cond_ae

    invoke-virtual {p1}, Ldev/epro/v2ray/util/V2rayConfig;->getOutbounds()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ldev/epro/v2ray/bean/outbounds/OutboundBean;

    invoke-virtual {v2}, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->getSettings()Ldev/epro/v2ray/bean/outbounds/settings/OutSettingsBean;

    move-result-object v2

    invoke-virtual {v2}, Ldev/epro/v2ray/bean/outbounds/settings/OutSettingsBean;->getVnext()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_ae

    invoke-virtual {p1}, Ldev/epro/v2ray/util/V2rayConfig;->getOutbounds()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ldev/epro/v2ray/bean/outbounds/OutboundBean;

    invoke-virtual {v2}, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->getSettings()Ldev/epro/v2ray/bean/outbounds/settings/OutSettingsBean;

    move-result-object v2

    invoke-virtual {v2}, Ldev/epro/v2ray/bean/outbounds/settings/OutSettingsBean;->getVnext()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ldev/epro/v2ray/bean/outbounds/settings/vnext/VnextBean;

    if-eqz v2, :cond_ae

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessBean;->getAddress()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldev/epro/v2ray/bean/outbounds/settings/vnext/VnextBean;->setAddress(Ljava/lang/String;)V

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessBean;->getPort()I

    move-result v3

    invoke-virtual {v2, v3}, Ldev/epro/v2ray/bean/outbounds/settings/vnext/VnextBean;->setPort(I)V

    invoke-virtual {v2}, Ldev/epro/v2ray/bean/outbounds/settings/vnext/VnextBean;->getUsers()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_ae

    invoke-virtual {v2}, Ldev/epro/v2ray/bean/outbounds/settings/vnext/VnextBean;->getUsers()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ldev/epro/v2ray/bean/outbounds/settings/vnext/UsersBean;

    if-eqz v2, :cond_ae

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessBean;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldev/epro/v2ray/bean/outbounds/settings/vnext/UsersBean;->setId(Ljava/lang/String;)V

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessBean;->getAlterId()I

    move-result v3

    invoke-virtual {v2, v3}, Ldev/epro/v2ray/bean/outbounds/settings/vnext/UsersBean;->setAlterId(I)V

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessBean;->getSecurity()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldev/epro/v2ray/bean/outbounds/settings/vnext/UsersBean;->setSecurity(Ljava/lang/String;)V

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Ldev/epro/v2ray/bean/outbounds/settings/vnext/UsersBean;->setLevel(I)V

    :cond_ae
    invoke-virtual {v1}, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->getMux()Ldev/epro/v2ray/bean/outbounds/MuxBean;

    move-result-object v2

    if-eqz v2, :cond_bb

    invoke-virtual {v1}, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->getMux()Ldev/epro/v2ray/bean/outbounds/MuxBean;

    move-result-object v2

    invoke-virtual {v2, v0}, Ldev/epro/v2ray/bean/outbounds/MuxBean;->setEnabled(Z)V

    :cond_bb
    invoke-static {p0}, Ldev/epro/v2ray/util/V2rayConfigUtil;->boundStreamSettings(Ldev/epro/v2ray/util/VmessBean;)Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;

    move-result-object v2

    invoke-virtual {v1, v2}, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->setStreamSettings(Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;)V

    :goto_c2
    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessBean;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ldev/epro/v2ray/util/Utils;->isIpv6Address(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_e7

    const-string v1, "[%s]:%s"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessBean;->getAddress()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v0

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessBean;->getPort()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    goto :goto_ff

    :cond_e7
    const-string v1, "%s:%s"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessBean;->getAddress()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v0

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessBean;->getPort()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    :goto_ff
    sput-object p0, Ldev/epro/v2ray/util/V2rayConfigUtil;->PREF_CURR_CONFIG_DOMAIN:Ljava/lang/String;

    new-instance p0, Ljava/util/LinkedHashSet;

    invoke-direct {p0}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-virtual {p1}, Ldev/epro/v2ray/util/V2rayConfig;->getOutbounds()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_10e
    :goto_10e
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_12c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldev/epro/v2ray/bean/outbounds/OutboundBean;

    invoke-virtual {v1}, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->getTag()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_10e

    invoke-virtual {v1}, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->getTag()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z

    goto :goto_10e

    :cond_12c
    sput-object p0, Ldev/epro/v2ray/util/V2rayConfigUtil;->PREF_CURR_CONFIG_OUTBOUND_TAGS:Ljava/util/LinkedHashSet;
    :try_end_12e
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_12e} :catch_12f

    return v3

    :catch_12f
    return v0
.end method

.method private static parseDomainNameAndTag(Lorg/json/JSONObject;)Landroid/util/Pair;
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "servers"

    const-string v1, "vnext"

    const-string v2, "tag"

    const-string v3, ""

    const-string v4, "settings"

    :try_start_a
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_15

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_14} :catch_8a

    goto :goto_16

    :cond_15
    move-object v2, v3

    :goto_16
    :try_start_16
    invoke-virtual {p0, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_8b

    invoke-virtual {p0, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    invoke-virtual {v5, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2f

    invoke-virtual {p0, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p0

    goto :goto_41

    :cond_2f
    invoke-virtual {p0, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_84

    invoke-virtual {p0, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p0

    :goto_41
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lez v0, :cond_8b

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object p0

    const-string v1, "address"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "port"

    invoke-virtual {p0, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v1}, Ldev/epro/v2ray/util/Utils;->isIpv6Address(Ljava/lang/String;)Z

    move-result v4

    const/4 v5, 0x1

    const/4 v6, 0x2

    if-eqz v4, :cond_72

    new-instance v4, Landroid/util/Pair;

    const-string v7, "[%s]:%s"

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v1, v6, v0

    aput-object p0, v6, v5

    invoke-static {v7, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v4, p0, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v4

    :cond_72
    new-instance v4, Landroid/util/Pair;

    const-string v7, "%s:%s"

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v1, v6, v0

    aput-object p0, v6, v5

    invoke-static {v7, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v4, p0, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v4

    :cond_84
    new-instance p0, Landroid/util/Pair;

    invoke-direct {p0, v3, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_89
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_89} :catch_8b

    return-object p0

    :catch_8a
    move-object v2, v3

    :catch_8b
    :cond_8b
    new-instance p0, Landroid/util/Pair;

    invoke-direct {p0, v3, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0
.end method

.method private static parseDomainNameAndTag(Ljava/lang/String;)V
    .registers 10

    const-string v0, "outbound"

    const-string v1, "outboundDetour"

    const-string v2, "outbounds"

    :try_start_6
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p0, ""

    new-instance v4, Ljava/util/LinkedHashSet;

    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_39

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    invoke-static {p0}, Ldev/epro/v2ray/util/V2rayConfigUtil;->parseDomainNameAndTag(Lorg/json/JSONObject;)Landroid/util/Pair;

    move-result-object p0

    iget-object p0, p0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Ldev/epro/v2ray/util/V2rayConfigUtil;->parseDomainNameAndTag(Lorg/json/JSONObject;)Landroid/util/Pair;

    move-result-object v0

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_39

    invoke-virtual {v4, v0}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z

    :cond_39
    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    const/4 v5, 0x0

    if-eqz v0, :cond_84

    const/4 v0, 0x0

    :goto_41
    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v6

    if-ge v0, v6, :cond_84

    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    invoke-virtual {v6, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    invoke-static {v6}, Ldev/epro/v2ray/util/V2rayConfigUtil;->parseDomainNameAndTag(Lorg/json/JSONObject;)Landroid/util/Pair;

    move-result-object v6

    iget-object v6, v6, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v7

    invoke-virtual {v7, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v7

    invoke-static {v7}, Ldev/epro/v2ray/util/V2rayConfigUtil;->parseDomainNameAndTag(Lorg/json/JSONObject;)Landroid/util/Pair;

    move-result-object v7

    iget-object v7, v7, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_78

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_78

    move-object p0, v6

    :cond_78
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_81

    invoke-virtual {v4, v7}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z

    :cond_81
    add-int/lit8 v0, v0, 0x1

    goto :goto_41

    :cond_84
    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_cd

    :goto_8a
    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v5, v0, :cond_cd

    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-virtual {v0, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Ldev/epro/v2ray/util/V2rayConfigUtil;->parseDomainNameAndTag(Lorg/json/JSONObject;)Landroid/util/Pair;

    move-result-object v0

    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {v2, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    invoke-static {v2}, Ldev/epro/v2ray/util/V2rayConfigUtil;->parseDomainNameAndTag(Lorg/json/JSONObject;)Landroid/util/Pair;

    move-result-object v2

    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_c1

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_c1

    move-object p0, v0

    :cond_c1
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_ca

    invoke-virtual {v4, v2}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z

    :cond_ca
    add-int/lit8 v5, v5, 0x1

    goto :goto_8a

    :cond_cd
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_d5

    sput-object p0, Ldev/epro/v2ray/util/V2rayConfigUtil;->PREF_CURR_CONFIG_DOMAIN:Ljava/lang/String;

    :cond_d5
    sput-object v4, Ldev/epro/v2ray/util/V2rayConfigUtil;->PREF_CURR_CONFIG_OUTBOUND_TAGS:Ljava/util/LinkedHashSet;
    :try_end_d7
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_d7} :catch_d7

    :catch_d7
    return-void
.end method

.method public static parseTypeProtocol(Ljava/lang/String;)V
    .registers 3

    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;

    invoke-direct {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;-><init>()V

    const-class v1, Ldev/epro/v2ray/util/V2rayConfig;

    invoke-virtual {v0, p0, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;->〺つふすそ(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ldev/epro/v2ray/util/V2rayConfig;

    invoke-virtual {p0}, Ldev/epro/v2ray/util/V2rayConfig;->getOutbounds()Ljava/util/ArrayList;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ldev/epro/v2ray/bean/outbounds/OutboundBean;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->getProtocol()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "://"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    sput-object p0, Ldev/epro/v2ray/util/V2rayConfigUtil;->TYPE_PROTOCOL:Ljava/lang/String;

    return-void
.end method

.method private static readTextFromAssets(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .registers 2

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p0

    invoke-virtual {p0}, Ljava/io/InputStream;->available()I

    move-result p1

    new-array p1, p1, [B

    invoke-virtual {p0, p1}, Ljava/io/InputStream;->read([B)I

    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, p1}, Ljava/lang/String;-><init>([B)V
    :try_end_19
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_19} :catch_1a

    goto :goto_1c

    :catch_1a
    const-string p0, ""

    :goto_1c
    return-object p0
.end method

.method private static routing(Ldev/epro/v2ray/util/V2rayConfig;)Z
    .registers 4

    const-string v0, "proxy"

    const-string v1, ""

    :try_start_4
    invoke-static {v1, v0, p0}, Ldev/epro/v2ray/util/V2rayConfigUtil;->routingUserRule(Ljava/lang/String;Ljava/lang/String;Ldev/epro/v2ray/util/V2rayConfig;)V

    const-string v2, "direct"

    invoke-static {v1, v2, p0}, Ldev/epro/v2ray/util/V2rayConfigUtil;->routingUserRule(Ljava/lang/String;Ljava/lang/String;Ldev/epro/v2ray/util/V2rayConfig;)V

    const-string v2, "block"

    invoke-static {v1, v2, p0}, Ldev/epro/v2ray/util/V2rayConfigUtil;->routingUserRule(Ljava/lang/String;Ljava/lang/String;Ldev/epro/v2ray/util/V2rayConfig;)V

    invoke-virtual {p0}, Ldev/epro/v2ray/util/V2rayConfig;->getRouting()Ldev/epro/v2ray/bean/routing/RoutingBean;

    move-result-object p0

    const-string v1, "IPIfNonMatch"

    invoke-virtual {p0, v1}, Ldev/epro/v2ray/bean/routing/RoutingBean;->setDomainStrategy(Ljava/lang/String;)V

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    const-string v1, "domain:googleapis.cn"

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Ldev/epro/v2ray/bean/routing/RulesBean;

    const-string v2, "field"

    invoke-direct {v1, v2, p0, v0}, Ldev/epro/v2ray/bean/routing/RulesBean;-><init>(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)V
    :try_end_2b
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_2b} :catch_2d

    const/4 p0, 0x1

    return p0

    :catch_2d
    const/4 p0, 0x0

    return p0
.end method

.method private static routingGeo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldev/epro/v2ray/util/V2rayConfig;)V
    .registers 10

    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9e

    const-string v0, "ip"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_c} :catch_9e

    const-string v1, "field"

    const-string v2, ""

    if-nez v0, :cond_18

    :try_start_12
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_54

    :cond_18
    new-instance v0, Ldev/epro/v2ray/bean/routing/RulesBean;

    invoke-direct {v0}, Ldev/epro/v2ray/bean/routing/RulesBean;-><init>()V

    invoke-virtual {v0, v1}, Ldev/epro/v2ray/bean/routing/RulesBean;->setType(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ldev/epro/v2ray/bean/routing/RulesBean;->setOutboundTag(Ljava/lang/String;)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v3}, Ldev/epro/v2ray/bean/routing/RulesBean;->setIp(Ljava/util/ArrayList;)V

    invoke-virtual {v0}, Ldev/epro/v2ray/bean/routing/RulesBean;->getIp()Ljava/util/ArrayList;

    move-result-object v3

    if-eqz v3, :cond_49

    invoke-virtual {v0}, Ldev/epro/v2ray/bean/routing/RulesBean;->getIp()Ljava/util/ArrayList;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "geoip:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_49
    invoke-virtual {p3}, Ldev/epro/v2ray/util/V2rayConfig;->getRouting()Ldev/epro/v2ray/bean/routing/RoutingBean;

    move-result-object v3

    invoke-virtual {v3}, Ldev/epro/v2ray/bean/routing/RoutingBean;->getRules()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_54
    const-string v0, "domain"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_62

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_9e

    :cond_62
    new-instance p0, Ldev/epro/v2ray/bean/routing/RulesBean;

    invoke-direct {p0}, Ldev/epro/v2ray/bean/routing/RulesBean;-><init>()V

    invoke-virtual {p0, v1}, Ldev/epro/v2ray/bean/routing/RulesBean;->setType(Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Ldev/epro/v2ray/bean/routing/RulesBean;->setOutboundTag(Ljava/lang/String;)V

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, p2}, Ldev/epro/v2ray/bean/routing/RulesBean;->setDomain(Ljava/util/ArrayList;)V

    invoke-virtual {p0}, Ldev/epro/v2ray/bean/routing/RulesBean;->getDomain()Ljava/util/ArrayList;

    move-result-object p2

    if-eqz p2, :cond_93

    invoke-virtual {p0}, Ldev/epro/v2ray/bean/routing/RulesBean;->getDomain()Ljava/util/ArrayList;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "geosite:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_93
    invoke-virtual {p3}, Ldev/epro/v2ray/util/V2rayConfig;->getRouting()Ldev/epro/v2ray/bean/routing/RoutingBean;

    move-result-object p1

    invoke-virtual {p1}, Ldev/epro/v2ray/bean/routing/RoutingBean;->getRules()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_9e
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_9e} :catch_9e

    :catch_9e
    :cond_9e
    return-void
.end method

.method private static routingUserRule(Ljava/lang/String;Ljava/lang/String;Ldev/epro/v2ray/util/V2rayConfig;)V
    .registers 8

    const-string v0, "field"

    :try_start_2
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_b1

    new-instance v1, Ldev/epro/v2ray/bean/routing/RulesBean;

    invoke-direct {v1}, Ldev/epro/v2ray/bean/routing/RulesBean;-><init>()V

    invoke-virtual {v1, v0}, Ldev/epro/v2ray/bean/routing/RulesBean;->setType(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ldev/epro/v2ray/bean/routing/RulesBean;->setOutboundTag(Ljava/lang/String;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1, v2}, Ldev/epro/v2ray/bean/routing/RulesBean;->setDomain(Ljava/util/ArrayList;)V

    new-instance v2, Ldev/epro/v2ray/bean/routing/RulesBean;

    invoke-direct {v2}, Ldev/epro/v2ray/bean/routing/RulesBean;-><init>()V

    invoke-virtual {v2, v0}, Ldev/epro/v2ray/bean/routing/RulesBean;->setType(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ldev/epro/v2ray/bean/routing/RulesBean;->setOutboundTag(Ljava/lang/String;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2, p1}, Ldev/epro/v2ray/bean/routing/RulesBean;->setIp(Ljava/util/ArrayList;)V

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    const-string p1, "\n"

    const-string v0, ""

    invoke-virtual {p0, p1, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    const-string p1, ","

    invoke-virtual {p0, p1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    array-length p1, p0

    const/4 v0, 0x0

    :goto_42
    if-ge v0, p1, :cond_7b

    aget-object v3, p0, v0

    invoke-static {v3}, Ldev/epro/v2ray/util/Utils;->isIpAddress(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_6d

    const-string v4, "geoip:"

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_55

    goto :goto_6d

    :cond_55
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_78

    invoke-virtual {v1}, Ldev/epro/v2ray/bean/routing/RulesBean;->getDomain()Ljava/util/ArrayList;

    move-result-object v4

    if-eqz v4, :cond_78

    invoke-virtual {v1}, Ldev/epro/v2ray/bean/routing/RulesBean;->getDomain()Ljava/util/ArrayList;

    move-result-object v4

    :goto_69
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_78

    :cond_6d
    :goto_6d
    invoke-virtual {v2}, Ldev/epro/v2ray/bean/routing/RulesBean;->getIp()Ljava/util/ArrayList;

    move-result-object v4

    if-eqz v4, :cond_78

    invoke-virtual {v2}, Ldev/epro/v2ray/bean/routing/RulesBean;->getIp()Ljava/util/ArrayList;

    move-result-object v4

    goto :goto_69

    :cond_78
    :goto_78
    add-int/lit8 v0, v0, 0x1

    goto :goto_42

    :cond_7b
    invoke-virtual {v1}, Ldev/epro/v2ray/bean/routing/RulesBean;->getDomain()Ljava/util/ArrayList;

    move-result-object p0

    if-eqz p0, :cond_96

    invoke-virtual {v1}, Ldev/epro/v2ray/bean/routing/RulesBean;->getDomain()Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p0

    if-lez p0, :cond_96

    invoke-virtual {p2}, Ldev/epro/v2ray/util/V2rayConfig;->getRouting()Ldev/epro/v2ray/bean/routing/RoutingBean;

    move-result-object p0

    invoke-virtual {p0}, Ldev/epro/v2ray/bean/routing/RoutingBean;->getRules()Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_96
    invoke-virtual {v2}, Ldev/epro/v2ray/bean/routing/RulesBean;->getIp()Ljava/util/ArrayList;

    move-result-object p0

    if-eqz p0, :cond_b1

    invoke-virtual {v2}, Ldev/epro/v2ray/bean/routing/RulesBean;->getIp()Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p0

    if-lez p0, :cond_b1

    invoke-virtual {p2}, Ldev/epro/v2ray/util/V2rayConfig;->getRouting()Ldev/epro/v2ray/bean/routing/RoutingBean;

    move-result-object p0

    invoke-virtual {p0}, Ldev/epro/v2ray/bean/routing/RoutingBean;->getRules()Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_b1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_b1} :catch_b1

    :catch_b1
    :cond_b1
    return-void
.end method

.method private static tryParseNewVmess(Ljava/lang/String;)Ldev/epro/v2ray/util/VmessBean;
    .registers 18

    const-string v0, "key"

    const-string v1, "seed"

    const-string v2, "security"

    :try_start_6
    new-instance v4, Ljava/net/URI;

    move-object/from16 v5, p0

    invoke-direct {v4, v5}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v5

    const-string v6, "vmess"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_204

    invoke-virtual {v4}, Ljava/net/URI;->getUserInfo()Ljava/lang/String;

    move-result-object v5

    const-string v6, "(tcp|http|ws|kcp|quic)(\\+tls)?:([0-9a-z]{8}-[0-9a-z]{4}-[0-9a-z]{4}-[0-9a-z]{4}-[0-9a-z]{12})-([0-9]+)"

    invoke-static {v6}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/regex/Matcher;->find()Z

    move-result v6

    if-eqz v6, :cond_204

    const/4 v6, 0x1

    invoke-virtual {v5, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x2

    invoke-virtual {v5, v8}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x3

    invoke-virtual {v5, v10}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x4

    invoke-virtual {v5, v12}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v5

    const/4 v13, 0x0

    if-eqz v9, :cond_4c

    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_4c

    const/4 v9, 0x1

    goto :goto_4d

    :cond_4c
    const/4 v9, 0x0

    :goto_4d
    new-instance v14, Ljava/util/HashMap;

    invoke-direct {v14}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v4}, Ljava/net/URI;->getRawQuery()Ljava/lang/String;

    move-result-object v15

    const-string v3, "&"

    invoke-virtual {v15, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    array-length v15, v3

    const/4 v12, 0x0

    :goto_5e
    if-ge v12, v15, :cond_7b

    aget-object v10, v3, v12

    const-string v8, "="

    invoke-virtual {v10, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8

    aget-object v10, v8, v13

    aget-object v8, v8, v6

    const-string v13, "utf-8"

    invoke-static {v8, v13}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v14, v10, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v12, v12, 0x1

    const/4 v8, 0x2

    const/4 v10, 0x3

    const/4 v13, 0x0

    goto :goto_5e

    :cond_7b
    new-instance v3, Ldev/epro/v2ray/util/VmessBean;

    invoke-direct {v3}, Ldev/epro/v2ray/util/VmessBean;-><init>()V
    :try_end_80
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_80} :catch_204

    :try_start_80
    invoke-virtual {v4}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v8}, Ldev/epro/v2ray/util/VmessBean;->setAddress(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/net/URI;->getPort()I

    move-result v8

    invoke-virtual {v3, v8}, Ldev/epro/v2ray/util/VmessBean;->setPort(I)V

    invoke-virtual {v3, v11}, Ldev/epro/v2ray/util/VmessBean;->setId(Ljava/lang/String;)V

    if-eqz v5, :cond_9a

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v3, v5}, Ldev/epro/v2ray/util/VmessBean;->setAlterId(I)V
    :try_end_9a
    .catch Ljava/lang/Exception; {:try_start_80 .. :try_end_9a} :catch_205

    :cond_9a
    const-string v5, ""

    if-eqz v9, :cond_a1

    :try_start_9e
    const-string v8, "tls"

    goto :goto_a2

    :cond_a1
    move-object v8, v5

    :goto_a2
    invoke-virtual {v3, v8}, Ldev/epro/v2ray/util/VmessBean;->setStreamSecurity(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/net/URI;->getFragment()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ldev/epro/v2ray/util/VmessBean;->setRemarks(Ljava/lang/String;)V

    const-string v4, "auto"

    invoke-virtual {v3, v4}, Ldev/epro/v2ray/util/VmessBean;->setSecurity(Ljava/lang/String;)V

    if-eqz v7, :cond_205

    const/4 v4, -0x1

    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v8
    :try_end_b8
    .catch Ljava/lang/Exception; {:try_start_9e .. :try_end_b8} :catch_205

    const-string v9, "quic"

    const-string v10, "tcp"

    const-string v11, "kcp"

    const-string v12, "ws"

    sparse-switch v8, :sswitch_data_206

    goto :goto_ed

    :sswitch_c4
    :try_start_c4
    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_ed

    const/4 v4, 0x4

    goto :goto_ed

    :sswitch_cc
    const-string v8, "http"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_ed

    const/4 v4, 0x1

    goto :goto_ed

    :sswitch_d6
    invoke-virtual {v7, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_ed

    const/4 v4, 0x0

    goto :goto_ed

    :sswitch_de
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_ed

    const/4 v4, 0x3

    goto :goto_ed

    :sswitch_e6
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7
    :try_end_ea
    .catch Ljava/lang/Exception; {:try_start_c4 .. :try_end_ea} :catch_205

    if-eqz v7, :cond_ed

    const/4 v4, 0x2

    :cond_ed
    :goto_ed
    const-string v7, "none"

    const-string v8, "host"

    const-string v13, "type"

    if-eqz v4, :cond_1df

    const-string v10, "\\|"

    const-string v15, "/"

    move-object/from16 v16, v5

    const-string v5, "path"

    if-eq v4, v6, :cond_1a3

    const/4 v6, 0x2

    if-eq v4, v6, :cond_164

    const/4 v6, 0x3

    if-eq v4, v6, :cond_144

    const/4 v5, 0x4

    if-eq v4, v5, :cond_10a

    goto/16 :goto_205

    :cond_10a
    :try_start_10a
    invoke-virtual {v3, v9}, Ldev/epro/v2ray/util/VmessBean;->setNetwork(Ljava/lang/String;)V

    invoke-virtual {v14, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_115

    move-object v1, v7

    goto :goto_11b

    :cond_115
    invoke-virtual {v14, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    :goto_11b
    invoke-virtual {v3, v1}, Ldev/epro/v2ray/util/VmessBean;->setRequestHost(Ljava/lang/String;)V

    invoke-virtual {v14, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_125

    goto :goto_12c

    :cond_125
    invoke-virtual {v14, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Ljava/lang/String;

    :goto_12c
    invoke-virtual {v3, v7}, Ldev/epro/v2ray/util/VmessBean;->setHeaderType(Ljava/lang/String;)V

    invoke-virtual {v14, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_138

    :goto_135
    move-object/from16 v5, v16

    goto :goto_13f

    :cond_138
    invoke-virtual {v14, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_13c
    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    :goto_13f
    invoke-virtual {v3, v5}, Ldev/epro/v2ray/util/VmessBean;->setPath(Ljava/lang/String;)V

    goto/16 :goto_205

    :cond_144
    invoke-virtual {v3, v11}, Ldev/epro/v2ray/util/VmessBean;->setNetwork(Ljava/lang/String;)V

    invoke-virtual {v14, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_14e

    goto :goto_155

    :cond_14e
    invoke-virtual {v14, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    :goto_155
    invoke-virtual {v3, v7}, Ldev/epro/v2ray/util/VmessBean;->setHeaderType(Ljava/lang/String;)V

    invoke-virtual {v14, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_15f

    goto :goto_135

    :cond_15f
    invoke-virtual {v14, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_13c

    :cond_164
    invoke-virtual {v3, v12}, Ldev/epro/v2ray/util/VmessBean;->setNetwork(Ljava/lang/String;)V

    invoke-virtual {v14, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_170

    :cond_16d
    move-object/from16 v0, v16

    goto :goto_186

    :cond_170
    invoke-virtual {v14, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16d

    invoke-virtual {v14, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :goto_186
    invoke-virtual {v3, v0}, Ldev/epro/v2ray/util/VmessBean;->setHeaderType(Ljava/lang/String;)V

    invoke-virtual {v14, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_192

    :goto_18f
    move-object/from16 v5, v16

    goto :goto_19f

    :cond_192
    invoke-virtual {v14, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0, v10}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v5, v0, v1

    :goto_19f
    invoke-virtual {v3, v5}, Ldev/epro/v2ray/util/VmessBean;->setRequestHost(Ljava/lang/String;)V

    goto :goto_205

    :cond_1a3
    const-string v0, "h2"

    invoke-virtual {v3, v0}, Ldev/epro/v2ray/util/VmessBean;->setNetwork(Ljava/lang/String;)V

    invoke-virtual {v14, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1b1

    :cond_1ae
    move-object/from16 v0, v16

    goto :goto_1c7

    :cond_1b1
    invoke-virtual {v14, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1ae

    invoke-virtual {v14, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :goto_1c7
    invoke-virtual {v3, v0}, Ldev/epro/v2ray/util/VmessBean;->setHeaderType(Ljava/lang/String;)V

    invoke-virtual {v14, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1d1

    goto :goto_18f

    :cond_1d1
    invoke-virtual {v14, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0, v10}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v5, v0, v1

    goto :goto_19f

    :cond_1df
    move-object/from16 v16, v5

    invoke-virtual {v3, v10}, Ldev/epro/v2ray/util/VmessBean;->setNetwork(Ljava/lang/String;)V

    invoke-virtual {v14, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1eb

    goto :goto_1f2

    :cond_1eb
    invoke-virtual {v14, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    :goto_1f2
    invoke-virtual {v3, v7}, Ldev/epro/v2ray/util/VmessBean;->setHeaderType(Ljava/lang/String;)V

    invoke-virtual {v14, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1fc

    goto :goto_18f

    :cond_1fc
    invoke-virtual {v14, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;
    :try_end_203
    .catch Ljava/lang/Exception; {:try_start_10a .. :try_end_203} :catch_205

    goto :goto_19f

    :catch_204
    :cond_204
    const/4 v3, 0x0

    :catch_205
    :cond_205
    :goto_205
    return-object v3

    :sswitch_data_206
    .sparse-switch
        0xedc -> :sswitch_e6
        0x19e18 -> :sswitch_de
        0x1bfe1 -> :sswitch_d6
        0x310888 -> :sswitch_cc
        0x35223e -> :sswitch_c4
    .end sparse-switch
.end method

.method private static upgradeConfigVersion(Ldev/epro/v2ray/util/VmessBean;)I
    .registers 9

    const/4 v0, -0x1

    :try_start_1
    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessBean;->getConfigVersion()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-ne v1, v3, :cond_a

    return v2

    :cond_a
    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessBean;->getNetwork()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v4

    const/16 v5, 0xcca

    const/4 v6, 0x1

    if-eq v4, v5, :cond_35

    const/16 v5, 0xedc

    if-eq v4, v5, :cond_2b

    const v5, 0x19e18

    if-eq v4, v5, :cond_21

    goto :goto_3f

    :cond_21
    const-string v4, "kcp"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3f

    const/4 v1, 0x0

    goto :goto_40

    :cond_2b
    const-string v4, "ws"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3f

    const/4 v1, 0x1

    goto :goto_40

    :cond_35
    const-string v4, "h2"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3f

    const/4 v1, 0x2

    goto :goto_40

    :cond_3f
    :goto_3f
    const/4 v1, -0x1

    :goto_40
    if-eq v1, v6, :cond_45

    if-eq v1, v3, :cond_45

    goto :goto_71

    :cond_45
    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessBean;->getRequestHost()Ljava/lang/String;

    move-result-object v1

    const-string v4, ";"

    invoke-virtual {v1, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    array-length v4, v1
    :try_end_50
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_50} :catch_74

    const-string v5, ""

    if-lez v4, :cond_5b

    :try_start_54
    aget-object v4, v1, v2

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    goto :goto_5c

    :cond_5b
    move-object v4, v5

    :goto_5c
    array-length v7, v1

    if-le v7, v6, :cond_6b

    aget-object v2, v1, v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    aget-object v1, v1, v6

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    :cond_6b
    invoke-virtual {p0, v4}, Ldev/epro/v2ray/util/VmessBean;->setPath(Ljava/lang/String;)V

    invoke-virtual {p0, v5}, Ldev/epro/v2ray/util/VmessBean;->setRequestHost(Ljava/lang/String;)V

    :goto_71
    invoke-virtual {p0, v3}, Ldev/epro/v2ray/util/VmessBean;->setConfigVersion(I)V
    :try_end_74
    .catch Ljava/lang/Exception; {:try_start_54 .. :try_end_74} :catch_74

    :catch_74
    return v0
.end method

.method private static userRule2Domian(Ljava/lang/String;)Ljava/util/ArrayList;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    const-string v1, "\n"

    const-string v2, ""

    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    const-string v1, ","

    invoke-virtual {p0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    array-length v1, p0

    const/4 v2, 0x0

    :goto_19
    if-ge v2, v1, :cond_3d

    aget-object v3, p0, v2

    const-string v4, "geosite:"

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_2d

    const-string v4, "domain:"

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3a

    :cond_2d
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_3a

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3a
    add-int/lit8 v2, v2, 0x1

    goto :goto_19

    :cond_3d
    return-object v0
.end method
