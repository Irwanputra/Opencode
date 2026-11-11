.class public Lづざかべべ/〳ぜぞぜべっ/づざかべべ/びぐびあび;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 〺つふすそ:Ljava/lang/Object;

.field public final synthetic くし〴〺ぅ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .registers 3

    iput-object p1, p0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/びぐびあび;->〺つふすそ:Ljava/lang/Object;

    iput-object p2, p0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/びぐびあび;->くし〴〺ぅ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 8

    :try_start_0
    sget-object v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/づざかべべ;->びぐびあび:Ljava/lang/reflect/Method;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eqz v0, :cond_1c

    iget-object v4, p0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/びぐびあび;->〺つふすそ:Ljava/lang/Object;

    const/4 v5, 0x3

    new-array v5, v5, [Ljava/lang/Object;

    iget-object v6, p0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/びぐびあび;->くし〴〺ぅ:Ljava/lang/Object;

    aput-object v6, v5, v2

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    aput-object v2, v5, v1

    const-string v1, "AppCompat recreation"

    aput-object v1, v5, v3

    invoke-virtual {v0, v4, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4b

    :cond_1c
    sget-object v0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/づざかべべ;->づざかべべ:Ljava/lang/reflect/Method;

    iget-object v4, p0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/びぐびあび;->〺つふすそ:Ljava/lang/Object;

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v5, p0, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/びぐびあび;->くし〴〺ぅ:Ljava/lang/Object;

    aput-object v5, v3, v2

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    aput-object v2, v3, v1

    invoke-virtual {v0, v4, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2d
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_2d} :catch_2e
    .catchall {:try_start_0 .. :try_end_2d} :catchall_4b

    goto :goto_4b

    :catch_2e
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ljava/lang/RuntimeException;

    if-ne v1, v2, :cond_4b

    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4b

    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Unable to stop"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_4a

    goto :goto_4b

    :cond_4a
    throw v0

    :catchall_4b
    :cond_4b
    :goto_4b
    return-void
.end method
