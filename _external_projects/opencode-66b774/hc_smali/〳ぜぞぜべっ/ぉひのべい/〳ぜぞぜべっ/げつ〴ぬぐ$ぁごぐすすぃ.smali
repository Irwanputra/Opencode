.class public L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$ぁごぐすすぃ;
.super L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$〺つふすそ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3041\u3054\u3050\u3059\u3059\u3043"
.end annotation


# instance fields
.field public なぎぱいぢぎ:Z


# direct methods
.method public constructor <init>(L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$〺つふすそ;-><init>(L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$げつ〴ぬぐ;)V

    return-void
.end method


# virtual methods
.method public close()V
    .registers 3

    iget-boolean v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$〺つふすそ;->くし〴〺ぅ:Z

    if-eqz v0, :cond_5

    return-void

    :cond_5
    iget-boolean v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$ぁごぐすすぃ;->なぎぱいぢぎ:Z

    if-nez v0, :cond_e

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$〺つふすそ;->じぜこほぱ(ZLjava/io/IOException;)V

    :cond_e
    const/4 v0, 0x1

    iput-boolean v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$〺つふすそ;->くし〴〺ぅ:Z

    return-void
.end method

.method public ざっざへづ(Lぺぁあねじ/づざかべべ;J)J
    .registers 7

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_2a

    iget-boolean v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$〺つふすそ;->くし〴〺ぅ:Z

    if-nez v0, :cond_22

    iget-boolean v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$ぁごぐすすぃ;->なぎぱいぢぎ:Z

    const-wide/16 v1, -0x1

    if-eqz v0, :cond_11

    return-wide v1

    :cond_11
    invoke-super {p0, p1, p2, p3}, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$〺つふすそ;->ざっざへづ(Lぺぁあねじ/づざかべべ;J)J

    move-result-wide p1

    cmp-long p3, p1, v1

    if-nez p3, :cond_21

    const/4 p1, 0x1

    iput-boolean p1, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$ぁごぐすすぃ;->なぎぱいぢぎ:Z

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$〺つふすそ;->じぜこほぱ(ZLjava/io/IOException;)V

    return-wide v1

    :cond_21
    return-wide p1

    :cond_22
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "byteCount < 0: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
