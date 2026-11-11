.class public L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$くし〴〺ぅ;
.super Lぺぁあねじ/くし〴〺ぅ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u304f\u3057\u3034\u303a\u3045"
.end annotation


# instance fields
.field public final synthetic ぺふねづ〺:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;


# direct methods
.method public constructor <init>(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;)V
    .registers 2

    iput-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$くし〴〺ぅ;->ぺふねづ〺:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

    invoke-direct {p0}, Lぺぁあねじ/くし〴〺ぅ;-><init>()V

    return-void
.end method


# virtual methods
.method public てぜきぽく(Ljava/io/IOException;)Ljava/io/IOException;
    .registers 4

    new-instance v0, Ljava/net/SocketTimeoutException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/net/SocketTimeoutException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_c

    invoke-virtual {v0, p1}, Ljava/net/SocketTimeoutException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_c
    return-object v0
.end method

.method public のぷのちつ()V
    .registers 3

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$くし〴〺ぅ;->ぺふねづ〺:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

    sget-object v1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;->〳ぜぞぜべっ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;

    invoke-virtual {v0, v1}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->づざかべべ(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;)V

    return-void
.end method

.method public へぬ〴づぞ()V
    .registers 2

    invoke-virtual {p0}, Lぺぁあねじ/くし〴〺ぅ;->ぺふねづ〺()Z

    move-result v0

    if-nez v0, :cond_7

    return-void

    :cond_7
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$くし〴〺ぅ;->てぜきぽく(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method
