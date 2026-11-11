.class public L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/びぐびあび;
.super L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/びぐびあび$げつ〴ぬぐ;
    }
.end annotation


# instance fields
.field public final ぁごぐすすぃ:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final くし〴〺ぅ:Ljava/lang/reflect/Method;

.field public final づざかべべ:Ljava/lang/reflect/Method;

.field public final なぎぱいぢぎ:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final びぐびあび:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Method;",
            "Ljava/lang/reflect/Method;",
            "Ljava/lang/reflect/Method;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;-><init>()V

    iput-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/びぐびあび;->くし〴〺ぅ:Ljava/lang/reflect/Method;

    iput-object p2, p0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/びぐびあび;->びぐびあび:Ljava/lang/reflect/Method;

    iput-object p3, p0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/びぐびあび;->づざかべべ:Ljava/lang/reflect/Method;

    iput-object p4, p0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/びぐびあび;->なぎぱいぢぎ:Ljava/lang/Class;

    iput-object p5, p0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/びぐびあび;->ぁごぐすすぃ:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public 〳ぜぞぜべっ(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;
    .registers 5
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    :try_start_0
    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/びぐびあび;->びぐびあび:Ljava/lang/reflect/Method;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x0

    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/reflect/Proxy;->getInvocationHandler(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;

    move-result-object v0

    check-cast v0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/びぐびあび$げつ〴ぬぐ;

    iget-boolean v1, v0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/びぐびあび$げつ〴ぬぐ;->〺つふすそ:Z

    if-nez v1, :cond_24

    iget-object v2, v0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/びぐびあび$げつ〴ぬぐ;->くし〴〺ぅ:Ljava/lang/String;

    if-nez v2, :cond_24

    .line 1
    sget-object v0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;

    const/4 v1, 0x4

    const-string v2, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?"

    .line 2
    invoke-virtual {v0, v1, v2, p1}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;->ぺふねづ〺(ILjava/lang/String;Ljava/lang/Throwable;)V

    return-object p1

    :cond_24
    if-eqz v1, :cond_27

    goto :goto_29

    :cond_27
    iget-object p1, v0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/びぐびあび$げつ〴ぬぐ;->くし〴〺ぅ:Ljava/lang/String;
    :try_end_29
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_29} :catch_2c
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_29} :catch_2a

    :goto_29
    return-object p1

    :catch_2a
    move-exception p1

    goto :goto_2d

    :catch_2c
    move-exception p1

    :goto_2d
    const-string v0, "unable to get selected protocol"

    invoke-static {v0, p1}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->げつ〴ぬぐ(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1
.end method

.method public げつ〴ぬぐ(Ljavax/net/ssl/SSLSocket;)V
    .registers 6

    :try_start_0
    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/びぐびあび;->づざかべべ:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_c
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_c} :catch_f
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_c} :catch_d

    return-void

    :catch_d
    move-exception p1

    goto :goto_10

    :catch_f
    move-exception p1

    :goto_10
    const-string v0, "unable to remove alpn"

    invoke-static {v0, p1}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->げつ〴ぬぐ(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1
.end method

.method public づざかべべ(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V
    .registers 9
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

    invoke-static {p3}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;->〺つふすそ(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    :try_start_4
    const-class p3, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;

    invoke-virtual {p3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p3

    const/4 v0, 0x2

    new-array v1, v0, [Ljava/lang/Class;

    iget-object v2, p0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/びぐびあび;->なぎぱいぢぎ:Ljava/lang/Class;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/びぐびあび;->ぁごぐすすぃ:Ljava/lang/Class;

    const/4 v4, 0x1

    aput-object v2, v1, v4

    new-instance v2, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/びぐびあび$げつ〴ぬぐ;

    invoke-direct {v2, p2}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/びぐびあび$げつ〴ぬぐ;-><init>(Ljava/util/List;)V

    invoke-static {p3, v1, v2}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p2

    iget-object p3, p0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/びぐびあび;->くし〴〺ぅ:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, v3

    aput-object p2, v0, v4

    invoke-virtual {p3, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2c
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_4 .. :try_end_2c} :catch_2f
    .catch Ljava/lang/IllegalAccessException; {:try_start_4 .. :try_end_2c} :catch_2d

    return-void

    :catch_2d
    move-exception p1

    goto :goto_30

    :catch_2f
    move-exception p1

    :goto_30
    const-string p2, "unable to set alpn"

    invoke-static {p2, p1}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->げつ〴ぬぐ(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1
.end method
