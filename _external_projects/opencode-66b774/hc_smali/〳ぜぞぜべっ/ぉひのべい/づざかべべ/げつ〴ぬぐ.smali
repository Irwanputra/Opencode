.class public L〳ぜぞぜべっ/ぉひのべい/づざかべべ/げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lぺぁあねじ/ぶでにく〼〳;


# instance fields
.field public 〺つふすそ:Z

.field public final synthetic くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

.field public final synthetic づざかべべ:Lぺぁあねじ/なぎぱいぢぎ;

.field public final synthetic びぐびあび:L〳ぜぞぜべっ/ぉひのべい/づざかべべ/くし〴〺ぅ;


# direct methods
.method public constructor <init>(L〳ぜぞぜべっ/ぉひのべい/づざかべべ/〺つふすそ;Lぺぁあねじ/ぁごぐすすぃ;L〳ぜぞぜべっ/ぉひのべい/づざかべべ/くし〴〺ぅ;Lぺぁあねじ/なぎぱいぢぎ;)V
    .registers 5

    iput-object p2, p0, L〳ぜぞぜべっ/ぉひのべい/づざかべべ/げつ〴ぬぐ;->くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

    iput-object p3, p0, L〳ぜぞぜべっ/ぉひのべい/づざかべべ/げつ〴ぬぐ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/づざかべべ/くし〴〺ぅ;

    iput-object p4, p0, L〳ぜぞぜべっ/ぉひのべい/づざかべべ/げつ〴ぬぐ;->づざかべべ:Lぺぁあねじ/なぎぱいぢぎ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public close()V
    .registers 3

    iget-boolean v0, p0, L〳ぜぞぜべっ/ぉひのべい/づざかべべ/げつ〴ぬぐ;->〺つふすそ:Z

    if-nez v0, :cond_16

    const/16 v0, 0x64

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p0, v0, v1}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->ぺふねづ〺(Lぺぁあねじ/ぶでにく〼〳;ILjava/util/concurrent/TimeUnit;)Z

    move-result v0

    if-nez v0, :cond_16

    const/4 v0, 0x1

    iput-boolean v0, p0, L〳ぜぞぜべっ/ぉひのべい/づざかべべ/げつ〴ぬぐ;->〺つふすそ:Z

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/づざかべべ/げつ〴ぬぐ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/づざかべべ/くし〴〺ぅ;

    invoke-interface {v0}, L〳ぜぞぜべっ/ぉひのべい/づざかべべ/くし〴〺ぅ;->〺つふすそ()V

    :cond_16
    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/づざかべべ/げつ〴ぬぐ;->くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v0}, Lぺぁあねじ/ぶでにく〼〳;->close()V

    return-void
.end method

.method public 〺つふすそ()Lぺぁあねじ/〻ぞまぎな〻;
    .registers 2

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/づざかべべ/げつ〴ぬぐ;->くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v0}, Lぺぁあねじ/ぶでにく〼〳;->〺つふすそ()Lぺぁあねじ/〻ぞまぎな〻;

    move-result-object v0

    return-object v0
.end method

.method public ざっざへづ(Lぺぁあねじ/づざかべべ;J)J
    .registers 12

    const/4 v0, 0x1

    :try_start_1
    iget-object v1, p0, L〳ぜぞぜべっ/ぉひのべい/づざかべべ/げつ〴ぬぐ;->くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v1, p1, p2, p3}, Lぺぁあねじ/ぶでにく〼〳;->ざっざへづ(Lぺぁあねじ/づざかべべ;J)J

    move-result-wide p2
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_7} :catch_2e

    const-wide/16 v1, -0x1

    cmp-long v3, p2, v1

    if-nez v3, :cond_19

    iget-boolean p1, p0, L〳ぜぞぜべっ/ぉひのべい/づざかべべ/げつ〴ぬぐ;->〺つふすそ:Z

    if-nez p1, :cond_18

    iput-boolean v0, p0, L〳ぜぞぜべっ/ぉひのべい/づざかべべ/げつ〴ぬぐ;->〺つふすそ:Z

    iget-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/づざかべべ/げつ〴ぬぐ;->づざかべべ:Lぺぁあねじ/なぎぱいぢぎ;

    invoke-interface {p1}, Lぺぁあねじ/でどあくず;->close()V

    :cond_18
    return-wide v1

    :cond_19
    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/づざかべべ/げつ〴ぬぐ;->づざかべべ:Lぺぁあねじ/なぎぱいぢぎ;

    invoke-interface {v0}, Lぺぁあねじ/なぎぱいぢぎ;->げつ〴ぬぐ()Lぺぁあねじ/づざかべべ;

    move-result-object v3

    .line 1
    iget-wide v0, p1, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    sub-long v4, v0, p2

    move-object v2, p1

    move-wide v6, p2

    .line 2
    invoke-virtual/range {v2 .. v7}, Lぺぁあねじ/づざかべべ;->ぺづげぺが(Lぺぁあねじ/づざかべべ;JJ)Lぺぁあねじ/づざかべべ;

    iget-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/づざかべべ/げつ〴ぬぐ;->づざかべべ:Lぺぁあねじ/なぎぱいぢぎ;

    invoke-interface {p1}, Lぺぁあねじ/なぎぱいぢぎ;->ごづごきえ()Lぺぁあねじ/なぎぱいぢぎ;

    return-wide p2

    :catch_2e
    move-exception p1

    iget-boolean p2, p0, L〳ぜぞぜべっ/ぉひのべい/づざかべべ/げつ〴ぬぐ;->〺つふすそ:Z

    if-nez p2, :cond_3a

    iput-boolean v0, p0, L〳ぜぞぜべっ/ぉひのべい/づざかべべ/げつ〴ぬぐ;->〺つふすそ:Z

    iget-object p2, p0, L〳ぜぞぜべっ/ぉひのべい/づざかべべ/げつ〴ぬぐ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/づざかべべ/くし〴〺ぅ;

    invoke-interface {p2}, L〳ぜぞぜべっ/ぉひのべい/づざかべべ/くし〴〺ぅ;->〺つふすそ()V

    :cond_3a
    throw p1
.end method
