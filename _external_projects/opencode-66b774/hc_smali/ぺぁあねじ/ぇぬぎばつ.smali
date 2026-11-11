.class public final Lぺぁあねじ/ぇぬぎばつ;
.super Lぺぁあねじ/くし〴〺ぅ;
.source ""


# instance fields
.field public final synthetic ぺふねづ〺:Ljava/net/Socket;


# direct methods
.method public constructor <init>(Ljava/net/Socket;)V
    .registers 2

    iput-object p1, p0, Lぺぁあねじ/ぇぬぎばつ;->ぺふねづ〺:Ljava/net/Socket;

    invoke-direct {p0}, Lぺぁあねじ/くし〴〺ぅ;-><init>()V

    return-void
.end method


# virtual methods
.method public てぜきぽく(Ljava/io/IOException;)Ljava/io/IOException;
    .registers 4
    .param p1    # Ljava/io/IOException;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    new-instance v0, Ljava/net/SocketTimeoutException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/net/SocketTimeoutException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_c

    invoke-virtual {v0, p1}, Ljava/io/InterruptedIOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_c
    return-object v0
.end method

.method public のぷのちつ()V
    .registers 6

    const-string v0, "Failed to close timed out socket "

    :try_start_2
    iget-object v1, p0, Lぺぁあねじ/ぇぬぎばつ;->ぺふねづ〺:Ljava/net/Socket;

    invoke-virtual {v1}, Ljava/net/Socket;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_7} :catch_1a
    .catch Ljava/lang/AssertionError; {:try_start_2 .. :try_end_7} :catch_8

    goto :goto_33

    :catch_8
    move-exception v1

    invoke-static {v1}, Lぺぁあねじ/おぐぴう〸ず;->げつ〴ぬぐ(Ljava/lang/AssertionError;)Z

    move-result v2

    if-eqz v2, :cond_19

    sget-object v2, Lぺぁあねじ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/logging/Logger;

    sget-object v3, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    goto :goto_24

    :cond_19
    throw v1

    :catch_1a
    move-exception v1

    sget-object v2, Lぺぁあねじ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/logging/Logger;

    sget-object v3, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    :goto_24
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lぺぁあねじ/ぇぬぎばつ;->ぺふねづ〺:Ljava/net/Socket;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v3, v0, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_33
    return-void
.end method
