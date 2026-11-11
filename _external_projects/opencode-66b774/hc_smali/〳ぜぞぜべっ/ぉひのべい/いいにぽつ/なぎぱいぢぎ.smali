.class public L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final 〺つふすそ:Ljava/util/logging/Logger;

.field public static final げつ〴ぬぐ:L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;


# direct methods
.method public static constructor <clinit>()V
    .registers 12

    .line 1
    const-class v0, [B

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    :try_start_5
    const-string v4, "com.android.org.conscrypt.SSLParametersImpl"

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4
    :try_end_b
    .catch Ljava/lang/ClassNotFoundException; {:try_start_5 .. :try_end_b} :catch_d

    :goto_b
    move-object v6, v4

    goto :goto_14

    :catch_d
    :try_start_d
    const-string v4, "org.apache.harmony.xnet.provider.jsse.SSLParametersImpl"

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    goto :goto_b

    :goto_14
    new-instance v7, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/づざかべべ;

    const-string v4, "setUseSessionTickets"

    new-array v5, v3, [Ljava/lang/Class;

    sget-object v8, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v8, v5, v2

    invoke-direct {v7, v1, v4, v5}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/づざかべべ;-><init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V

    new-instance v8, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/づざかべべ;

    const-string v4, "setHostname"

    new-array v5, v3, [Ljava/lang/Class;

    const-class v9, Ljava/lang/String;

    aput-object v9, v5, v2

    invoke-direct {v8, v1, v4, v5}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/づざかべべ;-><init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V

    const-string v4, "GMSCore_OpenSSL"

    .line 2
    invoke-static {v4}, Ljava/security/Security;->getProvider(Ljava/lang/String;)Ljava/security/Provider;

    move-result-object v4
    :try_end_34
    .catch Ljava/lang/ClassNotFoundException; {:try_start_d .. :try_end_34} :catch_61

    if-eqz v4, :cond_37

    goto :goto_3c

    :cond_37
    :try_start_37
    const-string v4, "android.net.Network"

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_3c
    .catch Ljava/lang/ClassNotFoundException; {:try_start_37 .. :try_end_3c} :catch_3e

    :goto_3c
    const/4 v4, 0x1

    goto :goto_3f

    :catch_3e
    const/4 v4, 0x0

    :goto_3f
    if-eqz v4, :cond_58

    .line 3
    :try_start_41
    new-instance v4, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/づざかべべ;

    const-string v5, "getAlpnSelectedProtocol"

    new-array v9, v2, [Ljava/lang/Class;

    invoke-direct {v4, v0, v5, v9}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/づざかべべ;-><init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V

    new-instance v5, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/づざかべべ;

    const-string v9, "setAlpnProtocols"

    new-array v10, v3, [Ljava/lang/Class;

    aput-object v0, v10, v2

    invoke-direct {v5, v1, v9, v10}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/づざかべべ;-><init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V

    move-object v9, v4

    move-object v10, v5

    goto :goto_5a

    :cond_58
    move-object v9, v1

    move-object v10, v9

    :goto_5a
    new-instance v0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/げつ〴ぬぐ;

    move-object v5, v0

    invoke-direct/range {v5 .. v10}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/げつ〴ぬぐ;-><init>(Ljava/lang/Class;L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/づざかべべ;L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/づざかべべ;L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/づざかべべ;L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/づざかべべ;)V
    :try_end_60
    .catch Ljava/lang/ClassNotFoundException; {:try_start_41 .. :try_end_60} :catch_61

    goto :goto_62

    :catch_61
    move-object v0, v1

    :goto_62
    if-eqz v0, :cond_66

    goto/16 :goto_104

    :cond_66
    const-string v0, "okhttp.platform"

    .line 4
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v4, "conscrypt"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_76

    const/4 v0, 0x1

    goto :goto_86

    :cond_76
    invoke-static {}, Ljava/security/Security;->getProviders()[Ljava/security/Provider;

    move-result-object v0

    aget-object v0, v0, v2

    invoke-virtual {v0}, Ljava/security/Provider;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v4, "Conscrypt"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    :goto_86
    if-eqz v0, :cond_90

    .line 5
    invoke-static {}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/〺つふすそ;->おぐぴう〸ず()L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;

    move-result-object v0

    if-eqz v0, :cond_90

    goto/16 :goto_104

    .line 6
    :cond_90
    :try_start_90
    const-class v0, Ljavax/net/ssl/SSLParameters;

    const-string v4, "setApplicationProtocols"

    new-array v5, v3, [Ljava/lang/Class;

    const-class v6, [Ljava/lang/String;

    aput-object v6, v5, v2

    invoke-virtual {v0, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const-class v4, Ljavax/net/ssl/SSLSocket;

    const-string v5, "getApplicationProtocol"

    new-array v6, v2, [Ljava/lang/Class;

    invoke-virtual {v4, v5, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    new-instance v5, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/くし〴〺ぅ;

    invoke-direct {v5, v0, v4}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/くし〴〺ぅ;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V
    :try_end_ad
    .catch Ljava/lang/NoSuchMethodException; {:try_start_90 .. :try_end_ad} :catch_af

    move-object v0, v5

    goto :goto_b0

    :catch_af
    move-object v0, v1

    :goto_b0
    if-eqz v0, :cond_b3

    goto :goto_104

    :cond_b3
    const-string v0, "org.eclipse.jetty.alpn.ALPN"

    .line 7
    :try_start_b5
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v4, "org.eclipse.jetty.alpn.ALPN$Provider"

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    const-string v5, "org.eclipse.jetty.alpn.ALPN$ClientProvider"

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    const-string v5, "org.eclipse.jetty.alpn.ALPN$ServerProvider"

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v11

    const-string v5, "put"

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Class;

    const-class v7, Ljavax/net/ssl/SSLSocket;

    aput-object v7, v6, v2

    aput-object v4, v6, v3

    invoke-virtual {v0, v5, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    const-string v4, "get"

    new-array v5, v3, [Ljava/lang/Class;

    const-class v6, Ljavax/net/ssl/SSLSocket;

    aput-object v6, v5, v2

    invoke-virtual {v0, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    const-string v4, "remove"

    new-array v3, v3, [Ljava/lang/Class;

    const-class v5, Ljavax/net/ssl/SSLSocket;

    aput-object v5, v3, v2

    invoke-virtual {v0, v4, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    new-instance v0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/びぐびあび;

    move-object v6, v0

    invoke-direct/range {v6 .. v11}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/びぐびあび;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;)V
    :try_end_f8
    .catch Ljava/lang/ClassNotFoundException; {:try_start_b5 .. :try_end_f8} :catch_fa
    .catch Ljava/lang/NoSuchMethodException; {:try_start_b5 .. :try_end_f8} :catch_fa

    move-object v1, v0

    goto :goto_fb

    :catch_fa
    nop

    :goto_fb
    if-eqz v1, :cond_ff

    move-object v0, v1

    goto :goto_104

    .line 8
    :cond_ff
    new-instance v0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;

    invoke-direct {v0}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;-><init>()V

    .line 9
    :goto_104
    sput-object v0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;

    const-class v0, L〳ぜぞぜべっ/でどあくず;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;->〺つふすそ:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static 〺つふすそ(Ljava/util/List;)Ljava/util/List;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "L\u3033\u305c\u305e\u305c\u3079\u3063/\u3076\u3067\u306b\u304f\u303c\u3033;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_e
    if-ge v2, v1, :cond_23

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, L〳ぜぞぜべっ/ぶでにく〼〳;

    sget-object v4, L〳ぜぞぜべっ/ぶでにく〼〳;->くし〴〺ぅ:L〳ぜぞぜべっ/ぶでにく〼〳;

    if-ne v3, v4, :cond_1b

    goto :goto_20

    .line 1
    :cond_1b
    iget-object v3, v3, L〳ぜぞぜべっ/ぶでにく〼〳;->〺つふすそ:Ljava/lang/String;

    .line 2
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_20
    add-int/lit8 v2, v2, 0x1

    goto :goto_e

    :cond_23
    return-object v0
.end method

.method public static のぷのちつ(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    const-class v0, Ljava/lang/Object;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    :goto_6
    const/4 v2, 0x0

    if-eq v1, v0, :cond_2f

    :try_start_9
    invoke-virtual {v1, p2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    invoke-virtual {v3, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_23

    invoke-virtual {p1, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1e

    goto :goto_23

    :cond_1e
    invoke-virtual {p1, v3}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_22
    .catch Ljava/lang/NoSuchFieldException; {:try_start_9 .. :try_end_22} :catch_2a
    .catch Ljava/lang/IllegalAccessException; {:try_start_9 .. :try_end_22} :catch_24

    return-object p0

    :cond_23
    :goto_23
    return-object v2

    :catch_24
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0

    :catch_2a
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_6

    :cond_2f
    const-string v1, "delegate"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_42

    invoke-static {p0, v0, v1}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;->のぷのちつ(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_42

    invoke-static {p0, p1, p2}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;->のぷのちつ(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_42
    return-object v2
.end method


# virtual methods
.method public 〳ぜぞぜべっ(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;
    .registers 2
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public ぁごぐすすぃ()Ljavax/net/ssl/SSLContext;
    .registers 4

    :try_start_0
    const-string v0, "TLS"

    invoke-static {v0}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v0
    :try_end_6
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_6} :catch_7

    return-object v0

    :catch_7
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "No TLS provider"

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public いいにぽつ(Ljava/lang/String;)Z
    .registers 2

    const/4 p1, 0x1

    return p1
.end method

.method public くし〴〺ぅ(Ljavax/net/ssl/X509TrustManager;)L〳ぜぞぜべっ/ぉひのべい/てぜきぽく/くし〴〺ぅ;
    .registers 3

    new-instance v0, L〳ぜぞぜべっ/ぉひのべい/てぜきぽく/げつ〴ぬぐ;

    invoke-virtual {p0, p1}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;->びぐびあび(Ljavax/net/ssl/X509TrustManager;)L〳ぜぞぜべっ/ぉひのべい/てぜきぽく/づざかべべ;

    move-result-object p1

    invoke-direct {v0, p1}, L〳ぜぞぜべっ/ぉひのべい/てぜきぽく/げつ〴ぬぐ;-><init>(L〳ぜぞぜべっ/ぉひのべい/てぜきぽく/づざかべべ;)V

    return-object v0
.end method

.method public げつ〴ぬぐ(Ljavax/net/ssl/SSLSocket;)V
    .registers 2

    return-void
.end method

.method public づざかべべ(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/net/ssl/SSLSocket;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "L\u3033\u305c\u305e\u305c\u3079\u3063/\u3076\u3067\u306b\u304f\u303c\u3033;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public てぜきぽく(Ljava/lang/String;Ljava/lang/Object;)V
    .registers 4

    if-nez p2, :cond_8

    const-string v0, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);"

    invoke-static {p1, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_8
    const/4 v0, 0x5

    check-cast p2, Ljava/lang/Throwable;

    invoke-virtual {p0, v0, p1, p2}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;->ぺふねづ〺(ILjava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public なぎぱいぢぎ(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V
    .registers 4

    invoke-virtual {p1, p2, p3}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    return-void
.end method

.method public びぐびあび(Ljavax/net/ssl/X509TrustManager;)L〳ぜぞぜべっ/ぉひのべい/てぜきぽく/づざかべべ;
    .registers 3

    new-instance v0, L〳ぜぞぜべっ/ぉひのべい/てぜきぽく/〺つふすそ;

    invoke-interface {p1}, Ljavax/net/ssl/X509TrustManager;->getAcceptedIssuers()[Ljava/security/cert/X509Certificate;

    move-result-object p1

    invoke-direct {v0, p1}, L〳ぜぞぜべっ/ぉひのべい/てぜきぽく/〺つふすそ;-><init>([Ljava/security/cert/X509Certificate;)V

    return-object v0
.end method

.method public へぬ〴づぞ(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;
    .registers 5

    const/4 v0, 0x0

    :try_start_1
    const-string v1, "sun.security.ssl.SSLContextImpl"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "context"

    invoke-static {p1, v1, v2}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;->のぷのちつ(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_10

    return-object v0

    :cond_10
    const-class v1, Ljavax/net/ssl/X509TrustManager;

    const-string v2, "trustManager"

    invoke-static {p1, v1, v2}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;->のぷのちつ(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljavax/net/ssl/X509TrustManager;
    :try_end_1a
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1a} :catch_1b

    return-object p1

    :catch_1b
    return-object v0
.end method

.method public ぺぁあねじ(Ljava/lang/String;)Ljava/lang/Object;
    .registers 4

    sget-object v0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;->〺つふすそ:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v0

    if-eqz v0, :cond_10

    new-instance v0, Ljava/lang/Throwable;

    invoke-direct {v0, p1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_10
    const/4 p1, 0x0

    return-object p1
.end method

.method public ぺふねづ〺(ILjava/lang/String;Ljava/lang/Throwable;)V
    .registers 5

    const/4 v0, 0x5

    if-ne p1, v0, :cond_6

    sget-object p1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    goto :goto_8

    :cond_6
    sget-object p1, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    :goto_8
    sget-object v0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;->〺つふすそ:Ljava/util/logging/Logger;

    invoke-virtual {v0, p1, p2, p3}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
