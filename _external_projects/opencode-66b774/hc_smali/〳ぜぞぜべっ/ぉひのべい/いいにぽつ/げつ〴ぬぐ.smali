.class public L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/げつ〴ぬぐ;
.super L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/げつ〴ぬぐ$〺つふすそ;,
        L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/げつ〴ぬぐ$くし〴〺ぅ;,
        L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/げつ〴ぬぐ$げつ〴ぬぐ;
    }
.end annotation


# instance fields
.field public final 〳ぜぞぜべっ:L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/げつ〴ぬぐ$くし〴〺ぅ;

.field public final ぁごぐすすぃ:L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/づざかべべ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u3033\u305c\u305e\u305c\u3079\u3063/\u3049\u3072\u306e\u3079\u3044/\u3044\u3044\u306b\u307d\u3064/\u3065\u3056\u304b\u3079\u3079<",
            "Ljava/net/Socket;",
            ">;"
        }
    .end annotation
.end field

.field public final くし〴〺ぅ:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final づざかべべ:L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/づざかべべ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u3033\u305c\u305e\u305c\u3079\u3063/\u3049\u3072\u306e\u3079\u3044/\u3044\u3044\u306b\u307d\u3064/\u3065\u3056\u304b\u3079\u3079<",
            "Ljava/net/Socket;",
            ">;"
        }
    .end annotation
.end field

.field public final なぎぱいぢぎ:L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/づざかべべ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u3033\u305c\u305e\u305c\u3079\u3063/\u3049\u3072\u306e\u3079\u3044/\u3044\u3044\u306b\u307d\u3064/\u3065\u3056\u304b\u3079\u3079<",
            "Ljava/net/Socket;",
            ">;"
        }
    .end annotation
.end field

.field public final びぐびあび:L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/づざかべべ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u3033\u305c\u305e\u305c\u3079\u3063/\u3049\u3072\u306e\u3079\u3044/\u3044\u3044\u306b\u307d\u3064/\u3065\u3056\u304b\u3079\u3079<",
            "Ljava/net/Socket;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/づざかべべ;L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/づざかべべ;L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/づざかべべ;L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/づざかべべ;)V
    .registers 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "L\u3033\u305c\u305e\u305c\u3079\u3063/\u3049\u3072\u306e\u3079\u3044/\u3044\u3044\u306b\u307d\u3064/\u3065\u3056\u304b\u3079\u3079<",
            "Ljava/net/Socket;",
            ">;",
            "L\u3033\u305c\u305e\u305c\u3079\u3063/\u3049\u3072\u306e\u3079\u3044/\u3044\u3044\u306b\u307d\u3064/\u3065\u3056\u304b\u3079\u3079<",
            "Ljava/net/Socket;",
            ">;",
            "L\u3033\u305c\u305e\u305c\u3079\u3063/\u3049\u3072\u306e\u3079\u3044/\u3044\u3044\u306b\u307d\u3064/\u3065\u3056\u304b\u3079\u3079<",
            "Ljava/net/Socket;",
            ">;",
            "L\u3033\u305c\u305e\u305c\u3079\u3063/\u3049\u3072\u306e\u3079\u3044/\u3044\u3044\u306b\u307d\u3064/\u3065\u3056\u304b\u3079\u3079<",
            "Ljava/net/Socket;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;-><init>()V

    const/4 v0, 0x0

    :try_start_4
    const-string v1, "dalvik.system.CloseGuard"

    .line 1
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "get"

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Class;

    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    const-string v4, "open"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Class;

    const-class v6, Ljava/lang/String;

    aput-object v6, v5, v3

    invoke-virtual {v1, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    const-string v5, "warnIfOpen"

    new-array v3, v3, [Ljava/lang/Class;

    invoke-virtual {v1, v5, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0
    :try_end_28
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_28} :catch_2b

    move-object v1, v0

    move-object v0, v2

    goto :goto_2d

    :catch_2b
    move-object v1, v0

    move-object v4, v1

    :goto_2d
    new-instance v2, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/げつ〴ぬぐ$くし〴〺ぅ;

    invoke-direct {v2, v0, v4, v1}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/げつ〴ぬぐ$くし〴〺ぅ;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    .line 2
    iput-object v2, p0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/げつ〴ぬぐ;->〳ぜぞぜべっ:L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/げつ〴ぬぐ$くし〴〺ぅ;

    iput-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/げつ〴ぬぐ;->くし〴〺ぅ:Ljava/lang/Class;

    iput-object p2, p0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/げつ〴ぬぐ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/づざかべべ;

    iput-object p3, p0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/げつ〴ぬぐ;->づざかべべ:L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/づざかべべ;

    iput-object p4, p0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/げつ〴ぬぐ;->なぎぱいぢぎ:L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/づざかべべ;

    iput-object p5, p0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/げつ〴ぬぐ;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/づざかべべ;

    return-void
.end method


# virtual methods
.method public 〳ぜぞぜべっ(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;
    .registers 5
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/げつ〴ぬぐ;->なぎぱいぢぎ:L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/づざかべべ;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return-object v1

    .line 1
    :cond_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v2}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/づざかべべ;->げつ〴ぬぐ(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_13

    const/4 v0, 0x1

    goto :goto_14

    :cond_13
    const/4 v0, 0x0

    :goto_14
    if-nez v0, :cond_17

    return-object v1

    .line 2
    :cond_17
    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/げつ〴ぬぐ;->なぎぱいぢぎ:L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/づざかべべ;

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v2}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/づざかべべ;->びぐびあび(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    if-eqz p1, :cond_2a

    new-instance v1, Ljava/lang/String;

    sget-object v0, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->ぺぁあねじ:Ljava/nio/charset/Charset;

    invoke-direct {v1, p1, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    :cond_2a
    return-object v1
.end method

.method public いいにぽつ(Ljava/lang/String;)Z
    .registers 6

    :try_start_0
    const-string v0, "android.security.NetworkSecurityPolicy"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getInstance"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    const/4 v3, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/げつ〴ぬぐ;->おぐぴう〸ず(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Z

    move-result p1
    :try_end_1a
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_1a} :catch_27
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_1a} :catch_27
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_1a} :catch_1f
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_1a} :catch_1d
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_1a} :catch_1b

    return p1

    :catch_1b
    move-exception p1

    goto :goto_20

    :catch_1d
    move-exception p1

    goto :goto_20

    :catch_1f
    move-exception p1

    :goto_20
    const-string v0, "unable to determine cleartext support"

    invoke-static {v0, p1}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->げつ〴ぬぐ(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :catch_27
    const/4 p1, 0x1

    return p1
.end method

.method public final おぐぴう〸ず(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Z
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation

    const-string v0, "isCleartextTrafficPermitted"

    const/4 v1, 0x0

    const/4 v2, 0x1

    :try_start_4
    new-array v3, v2, [Ljava/lang/Class;

    const-class v4, Ljava/lang/String;

    aput-object v4, v3, v1

    invoke-virtual {p2, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    new-array v4, v2, [Ljava/lang/Object;

    aput-object p1, v4, v1

    invoke-virtual {v3, p3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1
    :try_end_1c
    .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_1c} :catch_1d

    return p1

    :catch_1d
    :try_start_1d
    new-array p1, v1, [Ljava/lang/Class;

    .line 1
    invoke-virtual {p2, v0, p1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    new-array p2, v1, [Ljava/lang/Object;

    invoke-virtual {p1, p3, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2
    :try_end_2f
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1d .. :try_end_2f} :catch_2f

    :catch_2f
    return v2
.end method

.method public くし〴〺ぅ(Ljavax/net/ssl/X509TrustManager;)L〳ぜぞぜべっ/ぉひのべい/てぜきぽく/くし〴〺ぅ;
    .registers 10

    const-class v0, Ljava/lang/String;

    :try_start_2
    const-string v1, "android.net.http.X509TrustManagerExtensions"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Class;

    const-class v4, Ljavax/net/ssl/X509TrustManager;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v1, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    new-array v4, v2, [Ljava/lang/Object;

    aput-object p1, v4, v5

    invoke-virtual {v3, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "checkServerTrusted"

    const/4 v6, 0x3

    new-array v6, v6, [Ljava/lang/Class;

    const-class v7, [Ljava/security/cert/X509Certificate;

    aput-object v7, v6, v5

    aput-object v0, v6, v2

    const/4 v2, 0x2

    aput-object v0, v6, v2

    invoke-virtual {v1, v4, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-instance v1, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/げつ〴ぬぐ$げつ〴ぬぐ;

    invoke-direct {v1, v3, v0}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/げつ〴ぬぐ$げつ〴ぬぐ;-><init>(Ljava/lang/Object;Ljava/lang/reflect/Method;)V
    :try_end_33
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_33} :catch_34

    return-object v1

    .line 1
    :catch_34
    new-instance v0, L〳ぜぞぜべっ/ぉひのべい/てぜきぽく/げつ〴ぬぐ;

    invoke-virtual {p0, p1}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/げつ〴ぬぐ;->びぐびあび(Ljavax/net/ssl/X509TrustManager;)L〳ぜぞぜべっ/ぉひのべい/てぜきぽく/づざかべべ;

    move-result-object p1

    invoke-direct {v0, p1}, L〳ぜぞぜべっ/ぉひのべい/てぜきぽく/げつ〴ぬぐ;-><init>(L〳ぜぞぜべっ/ぉひのべい/てぜきぽく/づざかべべ;)V

    return-object v0
.end method

.method public づざかべべ(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V
    .registers 10
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

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p2, :cond_18

    iget-object v2, p0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/げつ〴ぬぐ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/づざかべべ;

    new-array v3, v0, [Ljava/lang/Object;

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    aput-object v4, v3, v1

    invoke-virtual {v2, p1, v3}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/づざかべべ;->くし〴〺ぅ(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/げつ〴ぬぐ;->づざかべべ:L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/づざかべべ;

    new-array v3, v0, [Ljava/lang/Object;

    aput-object p2, v3, v1

    invoke-virtual {v2, p1, v3}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/づざかべべ;->くし〴〺ぅ(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    :cond_18
    iget-object p2, p0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/げつ〴ぬぐ;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/づざかべべ;

    if-eqz p2, :cond_60

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p2, v2}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/づざかべべ;->げつ〴ぬぐ(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p2

    if-eqz p2, :cond_28

    const/4 p2, 0x1

    goto :goto_29

    :cond_28
    const/4 p2, 0x0

    :goto_29
    if-eqz p2, :cond_60

    new-array p2, v0, [Ljava/lang/Object;

    .line 2
    new-instance v0, Lぺぁあねじ/づざかべべ;

    invoke-direct {v0}, Lぺぁあねじ/づざかべべ;-><init>()V

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_37
    if-ge v3, v2, :cond_55

    invoke-interface {p3, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, L〳ぜぞぜべっ/ぶでにく〼〳;

    sget-object v5, L〳ぜぞぜべっ/ぶでにく〼〳;->くし〴〺ぅ:L〳ぜぞぜべっ/ぶでにく〼〳;

    if-ne v4, v5, :cond_44

    goto :goto_52

    .line 3
    :cond_44
    iget-object v5, v4, L〳ぜぞぜべっ/ぶでにく〼〳;->〺つふすそ:Ljava/lang/String;

    .line 4
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    invoke-virtual {v0, v5}, Lぺぁあねじ/づざかべべ;->ばおぢでぎか(I)Lぺぁあねじ/づざかべべ;

    .line 5
    iget-object v4, v4, L〳ぜぞぜべっ/ぶでにく〼〳;->〺つふすそ:Ljava/lang/String;

    .line 6
    invoke-virtual {v0, v4}, Lぺぁあねじ/づざかべべ;->くねねぱす〻(Ljava/lang/String;)Lぺぁあねじ/づざかべべ;

    :goto_52
    add-int/lit8 v3, v3, 0x1

    goto :goto_37

    :cond_55
    invoke-virtual {v0}, Lぺぁあねじ/づざかべべ;->けときぜと()[B

    move-result-object p3

    aput-object p3, p2, v1

    .line 7
    iget-object p3, p0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/げつ〴ぬぐ;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/づざかべべ;

    invoke-virtual {p3, p1, p2}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/づざかべべ;->びぐびあび(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    :cond_60
    return-void
.end method

.method public てぜきぽく(Ljava/lang/String;Ljava/lang/Object;)V
    .registers 6

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/げつ〴ぬぐ;->〳ぜぞぜべっ:L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/げつ〴ぬぐ$くし〴〺ぅ;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    if-eqz p2, :cond_10

    :try_start_8
    iget-object v0, v0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/げつ〴ぬぐ$くし〴〺ぅ;->くし〴〺ぅ:Ljava/lang/reflect/Method;

    new-array v2, v1, [Ljava/lang/Object;

    invoke-virtual {v0, p2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_f} :catch_10

    const/4 v1, 0x1

    :catch_10
    :cond_10
    if-nez v1, :cond_17

    const/4 p2, 0x5

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p2, p1, v0}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/げつ〴ぬぐ;->ぺふねづ〺(ILjava/lang/String;Ljava/lang/Throwable;)V

    :cond_17
    return-void
.end method

.method public なぎぱいぢぎ(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V
    .registers 5

    const-string v0, "Exception in connect"

    :try_start_2
    invoke-virtual {p1, p2, p3}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V
    :try_end_5
    .catch Ljava/lang/AssertionError; {:try_start_2 .. :try_end_5} :catch_21
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_5} :catch_17
    .catch Ljava/lang/ClassCastException; {:try_start_2 .. :try_end_5} :catch_6

    return-void

    :catch_6
    move-exception p1

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x1a

    if-ne p2, p3, :cond_16

    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/io/IOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw p2

    :cond_16
    throw p1

    :catch_17
    move-exception p1

    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/io/IOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw p2

    :catch_21
    move-exception p1

    invoke-static {p1}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->は〲ぱなで(Ljava/lang/AssertionError;)Z

    move-result p2

    if-eqz p2, :cond_2e

    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_2e
    throw p1
.end method

.method public びぐびあび(Ljavax/net/ssl/X509TrustManager;)L〳ぜぞぜべっ/ぉひのべい/てぜきぽく/づざかべべ;
    .registers 8

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "findTrustAnchorByIssuerAndSignature"

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Class;

    const/4 v4, 0x0

    const-class v5, Ljava/security/cert/X509Certificate;

    aput-object v5, v3, v4

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    new-instance v1, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/げつ〴ぬぐ$〺つふすそ;

    invoke-direct {v1, p1, v0}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/げつ〴ぬぐ$〺つふすそ;-><init>(Ljavax/net/ssl/X509TrustManager;Ljava/lang/reflect/Method;)V
    :try_end_1a
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_1a} :catch_1b

    return-object v1

    .line 1
    :catch_1b
    new-instance v0, L〳ぜぞぜべっ/ぉひのべい/てぜきぽく/〺つふすそ;

    invoke-interface {p1}, Ljavax/net/ssl/X509TrustManager;->getAcceptedIssuers()[Ljava/security/cert/X509Certificate;

    move-result-object p1

    invoke-direct {v0, p1}, L〳ぜぞぜべっ/ぉひのべい/てぜきぽく/〺つふすそ;-><init>([Ljava/security/cert/X509Certificate;)V

    return-object v0
.end method

.method public へぬ〴づぞ(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;
    .registers 6

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/げつ〴ぬぐ;->くし〴〺ぅ:Ljava/lang/Class;

    const-string v1, "sslParameters"

    invoke-static {p1, v0, v1}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;->のぷのちつ(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_23

    :try_start_a
    const-string v0, "com.google.android.gms.org.conscrypt.SSLParametersImpl"

    const/4 v2, 0x0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-static {v0, v2, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    invoke-static {p1, v0, v1}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;->のぷのちつ(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1d
    .catch Ljava/lang/ClassNotFoundException; {:try_start_a .. :try_end_1d} :catch_1e

    goto :goto_23

    :catch_1e
    invoke-super {p0, p1}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;->へぬ〴づぞ(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;

    move-result-object p1

    return-object p1

    :cond_23
    :goto_23
    const-class p1, Ljavax/net/ssl/X509TrustManager;

    const-string v1, "x509TrustManager"

    invoke-static {v0, p1, v1}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;->のぷのちつ(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljavax/net/ssl/X509TrustManager;

    if-eqz p1, :cond_30

    return-object p1

    :cond_30
    const-class p1, Ljavax/net/ssl/X509TrustManager;

    const-string v1, "trustManager"

    invoke-static {v0, p1, v1}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;->のぷのちつ(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljavax/net/ssl/X509TrustManager;

    return-object p1
.end method

.method public ぺぁあねじ(Ljava/lang/String;)Ljava/lang/Object;
    .registers 7

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/げつ〴ぬぐ;->〳ぜぞぜべっ:L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/げつ〴ぬぐ$くし〴〺ぅ;

    .line 1
    iget-object v1, v0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/げつ〴ぬぐ$くし〴〺ぅ;->げつ〴ぬぐ:Ljava/lang/reflect/Method;

    const/4 v2, 0x0

    if-eqz v1, :cond_19

    const/4 v3, 0x0

    :try_start_8
    new-array v4, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iget-object v0, v0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/げつ〴ぬぐ$くし〴〺ぅ;->〺つふすそ:Ljava/lang/reflect/Method;

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    aput-object p1, v4, v3

    invoke-virtual {v0, v1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_18} :catch_19

    move-object v2, v1

    :catch_19
    :cond_19
    return-object v2
.end method

.method public ぺふねづ〺(ILjava/lang/String;Ljava/lang/Throwable;)V
    .registers 9

    const/4 v0, 0x5

    if-ne p1, v0, :cond_4

    goto :goto_5

    :cond_4
    const/4 v0, 0x3

    :goto_5
    const/16 p1, 0xa

    if-eqz p3, :cond_1f

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p3}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    :cond_1f
    const/4 p3, 0x0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    :goto_24
    if-ge p3, v1, :cond_45

    invoke-virtual {p2, p1, p3}, Ljava/lang/String;->indexOf(II)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_2e

    goto :goto_2f

    :cond_2e
    move v2, v1

    :goto_2f
    add-int/lit16 v3, p3, 0xfa0

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-virtual {p2, p3, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p3

    const-string v4, "OkHttp"

    invoke-static {v0, v4, p3}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    if-lt v3, v2, :cond_43

    add-int/lit8 p3, v3, 0x1

    goto :goto_24

    :cond_43
    move p3, v3

    goto :goto_2f

    :cond_45
    return-void
.end method
