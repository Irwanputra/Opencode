.class public L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$びぐびあび;
.super L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$〺つふすそ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3073\u3050\u3073\u3042\u3073"
.end annotation


# instance fields
.field public 〳ぜぞぜべっ:Z

.field public ぁごぐすすぃ:J

.field public final なぎぱいぢぎ:L〳ぜぞぜべっ/ざとぅぼこ〺;

.field public final synthetic ぺぁあねじ:L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;


# direct methods
.method public constructor <init>(L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;L〳ぜぞぜべっ/ざとぅぼこ〺;)V
    .registers 5

    iput-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$びぐびあび;->ぺぁあねじ:L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$〺つふすそ;-><init>(L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$げつ〴ぬぐ;)V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$びぐびあび;->ぁごぐすすぃ:J

    const/4 p1, 0x1

    iput-boolean p1, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$びぐびあび;->〳ぜぞぜべっ:Z

    iput-object p2, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$びぐびあび;->なぎぱいぢぎ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    return-void
.end method


# virtual methods
.method public close()V
    .registers 3

    iget-boolean v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$〺つふすそ;->くし〴〺ぅ:Z

    if-eqz v0, :cond_5

    return-void

    :cond_5
    iget-boolean v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$びぐびあび;->〳ぜぞぜべっ:Z

    if-eqz v0, :cond_18

    const/16 v0, 0x64

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p0, v0, v1}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->ぺふねづ〺(Lぺぁあねじ/ぶでにく〼〳;ILjava/util/concurrent/TimeUnit;)Z

    move-result v0

    if-nez v0, :cond_18

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$〺つふすそ;->じぜこほぱ(ZLjava/io/IOException;)V

    :cond_18
    const/4 v0, 0x1

    iput-boolean v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$〺つふすそ;->くし〴〺ぅ:Z

    return-void
.end method

.method public ざっざへづ(Lぺぁあねじ/づざかべべ;J)J
    .registers 13

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_c5

    iget-boolean v2, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$〺つふすそ;->くし〴〺ぅ:Z

    if-nez v2, :cond_bd

    iget-boolean v2, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$びぐびあび;->〳ぜぞぜべっ:Z

    const-wide/16 v3, -0x1

    if-nez v2, :cond_11

    return-wide v3

    :cond_11
    iget-wide v5, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$びぐびあび;->ぁごぐすすぃ:J

    const/4 v2, 0x0

    cmp-long v7, v5, v0

    if-eqz v7, :cond_1c

    cmp-long v7, v5, v3

    if-nez v7, :cond_72

    :cond_1c
    cmp-long v7, v5, v3

    if-eqz v7, :cond_27

    .line 1
    iget-object v5, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$びぐびあび;->ぺぁあねじ:L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;

    iget-object v5, v5, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v5}, Lぺぁあねじ/ぁごぐすすぃ;->ぺふねづ〺()Ljava/lang/String;

    :cond_27
    :try_start_27
    iget-object v5, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$びぐびあび;->ぺぁあねじ:L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;

    iget-object v5, v5, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v5}, Lぺぁあねじ/ぁごぐすすぃ;->なぶひせが()J

    move-result-wide v5

    iput-wide v5, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$びぐびあび;->ぁごぐすすぃ:J

    iget-object v5, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$びぐびあび;->ぺぁあねじ:L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;

    iget-object v5, v5, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v5}, Lぺぁあねじ/ぁごぐすすぃ;->ぺふねづ〺()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    iget-wide v6, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$びぐびあび;->ぁごぐすすぃ:J

    cmp-long v8, v6, v0

    if-ltz v8, :cond_91

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_51

    const-string v6, ";"

    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6
    :try_end_4f
    .catch Ljava/lang/NumberFormatException; {:try_start_27 .. :try_end_4f} :catch_b2

    if-eqz v6, :cond_91

    :cond_51
    iget-wide v5, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$びぐびあび;->ぁごぐすすぃ:J

    cmp-long v7, v5, v0

    if-nez v7, :cond_6d

    iput-boolean v2, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$びぐびあび;->〳ぜぞぜべっ:Z

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$びぐびあび;->ぺぁあねじ:L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;

    iget-object v1, v0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/でどあくず;

    .line 2
    iget-object v1, v1, L〳ぜぞぜべっ/でどあくず;->いいにぽつ:L〳ぜぞぜべっ/いいにぽつ;

    .line 3
    iget-object v5, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$びぐびあび;->なぎぱいぢぎ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    invoke-virtual {v0}, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->いいにぽつ()L〳ぜぞぜべっ/ぉざぅち〻;

    move-result-object v0

    invoke-static {v1, v5, v0}, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/づざかべべ;->びぐびあび(L〳ぜぞぜべっ/いいにぽつ;L〳ぜぞぜべっ/ざとぅぼこ〺;L〳ぜぞぜべっ/ぉざぅち〻;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$〺つふすそ;->じぜこほぱ(ZLjava/io/IOException;)V

    .line 4
    :cond_6d
    iget-boolean v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$びぐびあび;->〳ぜぞぜべっ:Z

    if-nez v0, :cond_72

    return-wide v3

    :cond_72
    iget-wide v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$びぐびあび;->ぁごぐすすぃ:J

    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    invoke-super {p0, p1, p2, p3}, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$〺つふすそ;->ざっざへづ(Lぺぁあねじ/づざかべべ;J)J

    move-result-wide p1

    cmp-long p3, p1, v3

    if-eqz p3, :cond_86

    iget-wide v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$びぐびあび;->ぁごぐすすぃ:J

    sub-long/2addr v0, p1

    iput-wide v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$びぐびあび;->ぁごぐすすぃ:J

    return-wide p1

    :cond_86
    new-instance p1, Ljava/net/ProtocolException;

    const-string p2, "unexpected end of stream"

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v2, p1}, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$〺つふすそ;->じぜこほぱ(ZLjava/io/IOException;)V

    throw p1

    .line 5
    :cond_91
    :try_start_91
    new-instance p1, Ljava/net/ProtocolException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "expected chunk size and optional extensions but was \""

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$びぐびあび;->ぁごぐすすぃ:J

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "\""

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_b2
    .catch Ljava/lang/NumberFormatException; {:try_start_91 .. :try_end_b2} :catch_b2

    :catch_b2
    move-exception p1

    new-instance p2, Ljava/net/ProtocolException;

    invoke-virtual {p1}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 6
    :cond_bd
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c5
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
