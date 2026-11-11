.class public Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/ぺぁあねじ;
.super Lぺぁあねじ/いいにぽつ;
.source ""


# instance fields
.field public くし〴〺ぅ:J

.field public final synthetic びぐびあび:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/いいにぽつ;


# direct methods
.method public constructor <init>(Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/いいにぽつ;Lぺぁあねじ/ぶでにく〼〳;)V
    .registers 3

    iput-object p1, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/ぺぁあねじ;->びぐびあび:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/いいにぽつ;

    invoke-direct {p0, p2}, Lぺぁあねじ/いいにぽつ;-><init>(Lぺぁあねじ/ぶでにく〼〳;)V

    return-void
.end method


# virtual methods
.method public ざっざへづ(Lぺぁあねじ/づざかべべ;J)J
    .registers 11

    .line 1
    iget-object v0, p0, Lぺぁあねじ/いいにぽつ;->〺つふすそ:Lぺぁあねじ/ぶでにく〼〳;

    invoke-interface {v0, p1, p2, p3}, Lぺぁあねじ/ぶでにく〼〳;->ざっざへづ(Lぺぁあねじ/づざかべべ;J)J

    move-result-wide p1

    .line 2
    iget-wide v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/ぺぁあねじ;->くし〴〺ぅ:J

    const-wide/16 v2, -0x1

    cmp-long p3, p1, v2

    if-eqz p3, :cond_10

    move-wide v2, p1

    goto :goto_12

    :cond_10
    const-wide/16 v2, 0x0

    :goto_12
    add-long/2addr v0, v2

    iput-wide v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/ぺぁあねじ;->くし〴〺ぅ:J

    iget-object p3, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/ぺぁあねじ;->びぐびあび:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/いいにぽつ;

    .line 3
    iget-object v2, p3, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/いいにぽつ;->びぐびあび:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/びぐびあび;

    if-eqz v2, :cond_2e

    const/4 v3, 0x1

    .line 4
    new-instance v4, Lなぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/くし〴〺ぅ;

    .line 5
    iget-object p3, p3, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/いいにぽつ;->〺つふすそ:L〳ぜぞぜべっ/ぅみぱぎぎ;

    .line 6
    invoke-virtual {p3}, L〳ぜぞぜべっ/ぅみぱぎぎ;->じぜこほぱ()J

    move-result-wide v5

    invoke-direct {v4, v0, v1, v5, v6}, Lなぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/くし〴〺ぅ;-><init>(JJ)V

    invoke-virtual {v2, v3, v4}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p3

    invoke-virtual {p3}, Landroid/os/Message;->sendToTarget()V

    :cond_2e
    return-wide p1
.end method
