.class public L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/なぎぱいぢぎ$げつ〴ぬぐ;
.super Lぺぁあねじ/いいにぽつ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/なぎぱいぢぎ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public くし〴〺ぅ:Z

.field public final synthetic づざかべべ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/なぎぱいぢぎ;

.field public びぐびあび:J


# direct methods
.method public constructor <init>(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/なぎぱいぢぎ;Lぺぁあねじ/ぶでにく〼〳;)V
    .registers 3

    iput-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/なぎぱいぢぎ$げつ〴ぬぐ;->づざかべべ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/なぎぱいぢぎ;

    invoke-direct {p0, p2}, Lぺぁあねじ/いいにぽつ;-><init>(Lぺぁあねじ/ぶでにく〼〳;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/なぎぱいぢぎ$げつ〴ぬぐ;->くし〴〺ぅ:Z

    const-wide/16 p1, 0x0

    iput-wide p1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/なぎぱいぢぎ$げつ〴ぬぐ;->びぐびあび:J

    return-void
.end method


# virtual methods
.method public close()V
    .registers 2

    .line 1
    iget-object v0, p0, Lぺぁあねじ/いいにぽつ;->〺つふすそ:Lぺぁあねじ/ぶでにく〼〳;

    invoke-interface {v0}, Lぺぁあねじ/ぶでにく〼〳;->close()V

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/なぎぱいぢぎ$げつ〴ぬぐ;->じぜこほぱ(Ljava/io/IOException;)V

    return-void
.end method

.method public ざっざへづ(Lぺぁあねじ/づざかべべ;J)J
    .registers 6

    .line 1
    :try_start_0
    iget-object v0, p0, Lぺぁあねじ/いいにぽつ;->〺つふすそ:Lぺぁあねじ/ぶでにく〼〳;

    .line 2
    invoke-interface {v0, p1, p2, p3}, Lぺぁあねじ/ぶでにく〼〳;->ざっざへづ(Lぺぁあねじ/づざかべべ;J)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long p3, p1, v0

    if-lez p3, :cond_11

    iget-wide v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/なぎぱいぢぎ$げつ〴ぬぐ;->びぐびあび:J

    add-long/2addr v0, p1

    iput-wide v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/なぎぱいぢぎ$げつ〴ぬぐ;->びぐびあび:J
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_11} :catch_12

    :cond_11
    return-wide p1

    :catch_12
    move-exception p1

    invoke-virtual {p0, p1}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/なぎぱいぢぎ$げつ〴ぬぐ;->じぜこほぱ(Ljava/io/IOException;)V

    throw p1
.end method

.method public final じぜこほぱ(Ljava/io/IOException;)V
    .registers 9

    iget-boolean v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/なぎぱいぢぎ$げつ〴ぬぐ;->くし〴〺ぅ:Z

    if-eqz v0, :cond_5

    return-void

    :cond_5
    const/4 v0, 0x1

    iput-boolean v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/なぎぱいぢぎ$げつ〴ぬぐ;->くし〴〺ぅ:Z

    iget-object v3, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/なぎぱいぢぎ$げつ〴ぬぐ;->づざかべべ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/なぎぱいぢぎ;

    iget-object v1, v3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/なぎぱいぢぎ;->〺つふすそ:L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;

    const/4 v2, 0x0

    iget-wide v4, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/なぎぱいぢぎ$げつ〴ぬぐ;->びぐびあび:J

    move-object v6, p1

    invoke-virtual/range {v1 .. v6}, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;->ぺぁあねじ(ZL〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/くし〴〺ぅ;JLjava/io/IOException;)V

    return-void
.end method
