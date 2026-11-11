.class public final L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/くし〴〺ぅ;
.super L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;
.source ""


# instance fields
.field public final くし〴〺ぅ:Ljava/lang/reflect/Method;

.field public final びぐびあび:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V
    .registers 3

    invoke-direct {p0}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;-><init>()V

    iput-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/くし〴〺ぅ;->くし〴〺ぅ:Ljava/lang/reflect/Method;

    iput-object p2, p0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/くし〴〺ぅ;->びぐびあび:Ljava/lang/reflect/Method;

    return-void
.end method


# virtual methods
.method public 〳ぜぞぜべっ(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;
    .registers 4
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    :try_start_0
    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/くし〴〺ぅ;->びぐびあび:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_17

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_13
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_13} :catch_1b
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_13} :catch_19

    if-eqz v0, :cond_16

    goto :goto_17

    :cond_16
    return-object p1

    :cond_17
    :goto_17
    const/4 p1, 0x0

    return-object p1

    :catch_19
    move-exception p1

    goto :goto_1c

    :catch_1b
    move-exception p1

    :goto_1c
    const-string v0, "unable to get selected protocols"

    invoke-static {v0, p1}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->げつ〴ぬぐ(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1
.end method

.method public づざかべべ(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V
    .registers 8
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

    :try_start_0
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getSSLParameters()Ljavax/net/ssl/SSLParameters;

    move-result-object p2

    invoke-static {p3}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;->〺つふすそ(Ljava/util/List;)Ljava/util/List;

    move-result-object p3

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/くし〴〺ぅ;->くし〴〺ぅ:Ljava/lang/reflect/Method;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    check-cast p3, Ljava/util/ArrayList;

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result v3

    new-array v3, v3, [Ljava/lang/String;

    invoke-virtual {p3, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    aput-object p3, v1, v2

    invoke-virtual {v0, p2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1, p2}, Ljavax/net/ssl/SSLSocket;->setSSLParameters(Ljavax/net/ssl/SSLParameters;)V
    :try_end_22
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_22} :catch_25
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_22} :catch_23

    return-void

    :catch_23
    move-exception p1

    goto :goto_26

    :catch_25
    move-exception p1

    :goto_26
    const-string p2, "unable to set ssl parameters"

    invoke-static {p2, p1}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->げつ〴ぬぐ(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1
.end method

.method public へぬ〴づぞ(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;
    .registers 3

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
