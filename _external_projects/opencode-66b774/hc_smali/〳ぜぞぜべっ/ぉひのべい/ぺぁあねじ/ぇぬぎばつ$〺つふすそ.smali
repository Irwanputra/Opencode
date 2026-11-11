.class public final L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lぺぁあねじ/ぶでにく〼〳;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u303a\u3064\u3075\u3059\u305d"
.end annotation


# instance fields
.field public final 〺つふすそ:Lぺぁあねじ/づざかべべ;

.field public final synthetic ぁごぐすすぃ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

.field public final くし〴〺ぅ:Lぺぁあねじ/づざかべべ;

.field public づざかべべ:Z

.field public なぎぱいぢぎ:Z

.field public final びぐびあび:J


# direct methods
.method public constructor <init>(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;J)V
    .registers 4

    iput-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$〺つふすそ;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lぺぁあねじ/づざかべべ;

    invoke-direct {p1}, Lぺぁあねじ/づざかべべ;-><init>()V

    iput-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$〺つふすそ;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    new-instance p1, Lぺぁあねじ/づざかべべ;

    invoke-direct {p1}, Lぺぁあねじ/づざかべべ;-><init>()V

    iput-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$〺つふすそ;->くし〴〺ぅ:Lぺぁあねじ/づざかべべ;

    iput-wide p2, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$〺つふすそ;->びぐびあび:J

    return-void
.end method


# virtual methods
.method public close()V
    .registers 3

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$〺つふすそ;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_4
    iput-boolean v1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$〺つふすそ;->づざかべべ:Z

    iget-object v1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$〺つふすそ;->くし〴〺ぅ:Lぺぁあねじ/づざかべべ;

    invoke-virtual {v1}, Lぺぁあねじ/づざかべべ;->じぜこほぱ()V

    iget-object v1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$〺つふすそ;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v0
    :try_end_11
    .catchall {:try_start_4 .. :try_end_11} :catchall_17

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$〺つふすそ;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

    invoke-virtual {v0}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->げつ〴ぬぐ()V

    return-void

    :catchall_17
    move-exception v1

    :try_start_18
    monitor-exit v0
    :try_end_19
    .catchall {:try_start_18 .. :try_end_19} :catchall_17

    throw v1
.end method

.method public 〺つふすそ()Lぺぁあねじ/〻ぞまぎな〻;
    .registers 2

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$〺つふすそ;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

    iget-object v0, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->いいにぽつ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$くし〴〺ぅ;

    return-object v0
.end method

.method public ざっざへづ(Lぺぁあねじ/づざかべべ;J)J
    .registers 11

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_95

    iget-object v2, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$〺つふすそ;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

    monitor-enter v2

    :try_start_9
    invoke-virtual {p0}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$〺つふすそ;->じぜこほぱ()V

    .line 1
    iget-boolean v3, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$〺つふすそ;->づざかべべ:Z

    if-nez v3, :cond_8a

    iget-object v3, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$〺つふすそ;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

    iget-object v3, v3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->てぜきぽく:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;

    if-nez v3, :cond_80

    .line 2
    iget-object v3, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$〺つふすそ;->くし〴〺ぅ:Lぺぁあねじ/づざかべべ;

    .line 3
    iget-wide v4, v3, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    cmp-long v6, v4, v0

    if-nez v6, :cond_22

    const-wide/16 p1, -0x1

    .line 4
    monitor-exit v2

    return-wide p1

    :cond_22
    invoke-static {p2, p3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    invoke-virtual {v3, p1, p2, p3}, Lぺぁあねじ/づざかべべ;->ざっざへづ(Lぺぁあねじ/づざかべべ;J)J

    move-result-wide p1

    iget-object p3, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$〺つふすそ;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

    iget-wide v3, p3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->げつ〴ぬぐ:J

    add-long/2addr v3, p1

    iput-wide v3, p3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->げつ〴ぬぐ:J

    iget-object p3, p3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    iget-object p3, p3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->おぐぴう〸ず:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;

    invoke-virtual {p3}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;->げつ〴ぬぐ()I

    move-result p3

    div-int/lit8 p3, p3, 0x2

    int-to-long v5, p3

    cmp-long p3, v3, v5

    if-ltz p3, :cond_4f

    iget-object p3, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$〺つふすそ;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

    iget-object v3, p3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    iget v4, p3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->くし〴〺ぅ:I

    iget-wide v5, p3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->げつ〴ぬぐ:J

    invoke-virtual {v3, v4, v5, v6}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->げがぴうあだ(IJ)V

    iget-object p3, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$〺つふすそ;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

    iput-wide v0, p3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->げつ〴ぬぐ:J

    :cond_4f
    monitor-exit v2
    :try_end_50
    .catchall {:try_start_9 .. :try_end_50} :catchall_92

    iget-object p3, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$〺つふすそ;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

    iget-object p3, p3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    monitor-enter p3

    :try_start_55
    iget-object v2, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$〺つふすそ;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

    iget-object v2, v2, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    iget-wide v3, v2, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->のぷのちつ:J

    add-long/2addr v3, p1

    iput-wide v3, v2, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->のぷのちつ:J

    iget-object v2, v2, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->おぐぴう〸ず:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;

    invoke-virtual {v2}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ごづごきえ;->げつ〴ぬぐ()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-long v5, v2

    cmp-long v2, v3, v5

    if-ltz v2, :cond_7b

    iget-object v2, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$〺つふすそ;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

    iget-object v2, v2, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    const/4 v3, 0x0

    iget-wide v4, v2, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->のぷのちつ:J

    invoke-virtual {v2, v3, v4, v5}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->げがぴうあだ(IJ)V

    iget-object v2, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$〺つふすそ;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

    iget-object v2, v2, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    iput-wide v0, v2, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->のぷのちつ:J

    :cond_7b
    monitor-exit p3

    return-wide p1

    :catchall_7d
    move-exception p1

    monitor-exit p3
    :try_end_7f
    .catchall {:try_start_55 .. :try_end_7f} :catchall_7d

    throw p1

    .line 5
    :cond_80
    :try_start_80
    new-instance p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ざっざへづ;

    iget-object p2, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$〺つふすそ;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

    iget-object p2, p2, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->てぜきぽく:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;

    invoke-direct {p1, p2}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ざっざへづ;-><init>(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;)V

    throw p1

    :cond_8a
    new-instance p1, Ljava/io/IOException;

    const-string p2, "stream closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_92
    move-exception p1

    .line 6
    monitor-exit v2
    :try_end_94
    .catchall {:try_start_80 .. :try_end_94} :catchall_92

    throw p1

    :cond_95
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

.method public final じぜこほぱ()V
    .registers 6

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$〺つふすそ;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

    iget-object v0, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->いいにぽつ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$くし〴〺ぅ;

    invoke-virtual {v0}, Lぺぁあねじ/くし〴〺ぅ;->ぺぁあねじ()V

    :goto_7
    :try_start_7
    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$〺つふすそ;->くし〴〺ぅ:Lぺぁあねじ/づざかべべ;

    .line 1
    iget-wide v0, v0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_23

    .line 2
    iget-boolean v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$〺つふすそ;->なぎぱいぢぎ:Z

    if-nez v0, :cond_23

    iget-boolean v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$〺つふすそ;->づざかべべ:Z

    if-nez v0, :cond_23

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$〺つふすそ;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

    iget-object v1, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->てぜきぽく:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;

    if-nez v1, :cond_23

    invoke-virtual {v0}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->いいにぽつ()V
    :try_end_22
    .catchall {:try_start_7 .. :try_end_22} :catchall_2b

    goto :goto_7

    :cond_23
    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$〺つふすそ;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

    iget-object v0, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->いいにぽつ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$くし〴〺ぅ;

    invoke-virtual {v0}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$くし〴〺ぅ;->へぬ〴づぞ()V

    return-void

    :catchall_2b
    move-exception v0

    iget-object v1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$〺つふすそ;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

    iget-object v1, v1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->いいにぽつ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$くし〴〺ぅ;

    invoke-virtual {v1}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ$くし〴〺ぅ;->へぬ〴づぞ()V

    goto :goto_35

    :goto_34
    throw v0

    :goto_35
    goto :goto_34
.end method
