.class public final Lぺぁあねじ/ざとぅぼこ〺;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lぺぁあねじ/ぁごぐすすぃ;


# instance fields
.field public final 〺つふすそ:Lぺぁあねじ/づざかべべ;

.field public final くし〴〺ぅ:Lぺぁあねじ/ぶでにく〼〳;

.field public びぐびあび:Z


# direct methods
.method public constructor <init>(Lぺぁあねじ/ぶでにく〼〳;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lぺぁあねじ/づざかべべ;

    invoke-direct {v0}, Lぺぁあねじ/づざかべべ;-><init>()V

    iput-object v0, p0, Lぺぁあねじ/ざとぅぼこ〺;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    if-eqz p1, :cond_f

    iput-object p1, p0, Lぺぁあねじ/ざとぅぼこ〺;->くし〴〺ぅ:Lぺぁあねじ/ぶでにく〼〳;

    return-void

    :cond_f
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "source == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public close()V
    .registers 2

    iget-boolean v0, p0, Lぺぁあねじ/ざとぅぼこ〺;->びぐびあび:Z

    if-eqz v0, :cond_5

    return-void

    :cond_5
    const/4 v0, 0x1

    iput-boolean v0, p0, Lぺぁあねじ/ざとぅぼこ〺;->びぐびあび:Z

    iget-object v0, p0, Lぺぁあねじ/ざとぅぼこ〺;->くし〴〺ぅ:Lぺぁあねじ/ぶでにく〼〳;

    invoke-interface {v0}, Lぺぁあねじ/ぶでにく〼〳;->close()V

    iget-object v0, p0, Lぺぁあねじ/ざとぅぼこ〺;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    invoke-virtual {v0}, Lぺぁあねじ/づざかべべ;->じぜこほぱ()V

    return-void
.end method

.method public isOpen()Z
    .registers 2

    iget-boolean v0, p0, Lぺぁあねじ/ざとぅぼこ〺;->びぐびあび:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public read(Ljava/nio/ByteBuffer;)I
    .registers 8

    iget-object v0, p0, Lぺぁあねじ/ざとぅぼこ〺;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    iget-wide v1, v0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-nez v5, :cond_1a

    iget-object v1, p0, Lぺぁあねじ/ざとぅぼこ〺;->くし〴〺ぅ:Lぺぁあねじ/ぶでにく〼〳;

    const-wide/16 v2, 0x2000

    invoke-interface {v1, v0, v2, v3}, Lぺぁあねじ/ぶでにく〼〳;->ざっざへづ(Lぺぁあねじ/づざかべべ;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-nez v4, :cond_1a

    const/4 p1, -0x1

    return p1

    :cond_1a
    iget-object v0, p0, Lぺぁあねじ/ざとぅぼこ〺;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    invoke-virtual {v0, p1}, Lぺぁあねじ/づざかべべ;->read(Ljava/nio/ByteBuffer;)I

    move-result p1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    const-string v0, "buffer("

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lぺぁあねじ/ざとぅぼこ〺;->くし〴〺ぅ:Lぺぁあねじ/ぶでにく〼〳;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public 〺つふすそ()Lぺぁあねじ/〻ぞまぎな〻;
    .registers 2

    iget-object v0, p0, Lぺぁあねじ/ざとぅぼこ〺;->くし〴〺ぅ:Lぺぁあねじ/ぶでにく〼〳;

    invoke-interface {v0}, Lぺぁあねじ/ぶでにく〼〳;->〺つふすそ()Lぺぁあねじ/〻ぞまぎな〻;

    move-result-object v0

    return-object v0
.end method

.method public 〻ぞまぎな〻(J)V
    .registers 3

    invoke-virtual {p0, p1, p2}, Lぺぁあねじ/ざとぅぼこ〺;->ぉひのべい(J)Z

    move-result p1

    if-eqz p1, :cond_7

    return-void

    :cond_7
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1
.end method

.method public ぁごぐすすぃ(J)V
    .registers 9

    iget-boolean v0, p0, Lぺぁあねじ/ざとぅぼこ〺;->びぐびあび:Z

    if-nez v0, :cond_37

    :goto_4
    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_36

    iget-object v2, p0, Lぺぁあねじ/ざとぅぼこ〺;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    iget-wide v3, v2, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    cmp-long v5, v3, v0

    if-nez v5, :cond_27

    iget-object v0, p0, Lぺぁあねじ/ざとぅぼこ〺;->くし〴〺ぅ:Lぺぁあねじ/ぶでにく〼〳;

    const-wide/16 v3, 0x2000

    invoke-interface {v0, v2, v3, v4}, Lぺぁあねじ/ぶでにく〼〳;->ざっざへづ(Lぺぁあねじ/づざかべべ;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_21

    goto :goto_27

    :cond_21
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :cond_27
    :goto_27
    iget-object v0, p0, Lぺぁあねじ/ざとぅぼこ〺;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    .line 1
    iget-wide v0, v0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    .line 2
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    iget-object v2, p0, Lぺぁあねじ/ざとぅぼこ〺;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    invoke-virtual {v2, v0, v1}, Lぺぁあねじ/づざかべべ;->ぁごぐすすぃ(J)V

    sub-long/2addr p1, v0

    goto :goto_4

    :cond_36
    return-void

    :cond_37
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_40

    :goto_3f
    throw p1

    :goto_40
    goto :goto_3f
.end method

.method public ぅみぱぎぎ()B
    .registers 3

    const-wide/16 v0, 0x1

    invoke-virtual {p0, v0, v1}, Lぺぁあねじ/ざとぅぼこ〺;->〻ぞまぎな〻(J)V

    iget-object v0, p0, Lぺぁあねじ/ざとぅぼこ〺;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    invoke-virtual {v0}, Lぺぁあねじ/づざかべべ;->ぅみぱぎぎ()B

    move-result v0

    return v0
.end method

.method public ぇぬぎばつ()Ljava/lang/String;
    .registers 3

    iget-object v0, p0, Lぺぁあねじ/ざとぅぼこ〺;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    iget-object v1, p0, Lぺぁあねじ/ざとぅぼこ〺;->くし〴〺ぅ:Lぺぁあねじ/ぶでにく〼〳;

    invoke-virtual {v0, v1}, Lぺぁあねじ/づざかべべ;->えがぐせほち(Lぺぁあねじ/ぶでにく〼〳;)J

    iget-object v0, p0, Lぺぁあねじ/ざとぅぼこ〺;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    invoke-virtual {v0}, Lぺぁあねじ/づざかべべ;->ぇぬぎばつ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ぉひのべい(J)Z
    .registers 8

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_2c

    iget-boolean v0, p0, Lぺぁあねじ/ざとぅぼこ〺;->びぐびあび:Z

    if-nez v0, :cond_24

    :cond_a
    iget-object v0, p0, Lぺぁあねじ/ざとぅぼこ〺;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    iget-wide v1, v0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    cmp-long v3, v1, p1

    if-gez v3, :cond_22

    iget-object v1, p0, Lぺぁあねじ/ざとぅぼこ〺;->くし〴〺ぅ:Lぺぁあねじ/ぶでにく〼〳;

    const-wide/16 v2, 0x2000

    invoke-interface {v1, v0, v2, v3}, Lぺぁあねじ/ぶでにく〼〳;->ざっざへづ(Lぺぁあねじ/づざかべべ;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-nez v4, :cond_a

    const/4 p1, 0x0

    return p1

    :cond_22
    const/4 p1, 0x1

    return p1

    :cond_24
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "byteCount < 0: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_44

    :goto_43
    throw v0

    :goto_44
    goto :goto_43
.end method

.method public おぐぴう〸ず(J)[B
    .registers 4

    .line 1
    invoke-virtual {p0, p1, p2}, Lぺぁあねじ/ざとぅぼこ〺;->ぉひのべい(J)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 2
    iget-object v0, p0, Lぺぁあねじ/ざとぅぼこ〺;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    invoke-virtual {v0, p1, p2}, Lぺぁあねじ/づざかべべ;->おぐぴう〸ず(J)[B

    move-result-object p1

    return-object p1

    .line 3
    :cond_d
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1
.end method

.method public げつ〴ぬぐ()Lぺぁあねじ/づざかべべ;
    .registers 2

    iget-object v0, p0, Lぺぁあねじ/ざとぅぼこ〺;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    return-object v0
.end method

.method public ざっざへづ(Lぺぁあねじ/づざかべべ;J)J
    .registers 10

    if-eqz p1, :cond_51

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_3a

    iget-boolean v2, p0, Lぺぁあねじ/ざとぅぼこ〺;->びぐびあび:Z

    if-nez v2, :cond_32

    iget-object v2, p0, Lぺぁあねじ/ざとぅぼこ〺;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    iget-wide v3, v2, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    cmp-long v5, v3, v0

    if-nez v5, :cond_23

    iget-object v0, p0, Lぺぁあねじ/ざとぅぼこ〺;->くし〴〺ぅ:Lぺぁあねじ/ぶでにく〼〳;

    const-wide/16 v3, 0x2000

    invoke-interface {v0, v2, v3, v4}, Lぺぁあねじ/ぶでにく〼〳;->ざっざへづ(Lぺぁあねじ/づざかべべ;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-nez v4, :cond_23

    return-wide v2

    :cond_23
    iget-object v0, p0, Lぺぁあねじ/ざとぅぼこ〺;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    iget-wide v0, v0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    iget-object v0, p0, Lぺぁあねじ/ざとぅぼこ〺;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    invoke-virtual {v0, p1, p2, p3}, Lぺぁあねじ/づざかべべ;->ざっざへづ(Lぺぁあねじ/づざかべべ;J)J

    move-result-wide p1

    return-wide p1

    :cond_32
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3a
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

    :cond_51
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "sink == null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public じぜこほぱ(BJJ)J
    .registers 15

    iget-boolean v0, p0, Lぺぁあねじ/ざとぅぼこ〺;->びぐびあび:Z

    if-nez v0, :cond_5a

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_3d

    cmp-long v0, p4, p2

    if-ltz v0, :cond_3d

    :goto_e
    const-wide/16 v7, -0x1

    cmp-long v0, p2, p4

    if-gez v0, :cond_3c

    iget-object v1, p0, Lぺぁあねじ/ざとぅぼこ〺;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-virtual/range {v1 .. v6}, Lぺぁあねじ/づざかべべ;->せづっ〸ちね(BJJ)J

    move-result-wide v0

    cmp-long v2, v0, v7

    if-eqz v2, :cond_22

    return-wide v0

    :cond_22
    iget-object v0, p0, Lぺぁあねじ/ざとぅぼこ〺;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    iget-wide v1, v0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    cmp-long v3, v1, p4

    if-gez v3, :cond_3c

    iget-object v3, p0, Lぺぁあねじ/ざとぅぼこ〺;->くし〴〺ぅ:Lぺぁあねじ/ぶでにく〼〳;

    const-wide/16 v4, 0x2000

    invoke-interface {v3, v0, v4, v5}, Lぺぁあねじ/ぶでにく〼〳;->ざっざへづ(Lぺぁあねじ/づざかべべ;J)J

    move-result-wide v3

    cmp-long v0, v3, v7

    if-nez v0, :cond_37

    goto :goto_3c

    :cond_37
    invoke-static {p2, p3, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p2

    goto :goto_e

    :cond_3c
    :goto_3c
    return-wide v7

    :cond_3d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    aput-object p2, v0, v1

    const/4 p2, 0x1

    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    aput-object p3, v0, p2

    const-string p2, "fromIndex=%s toIndex=%s"

    invoke-static {p2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_63

    :goto_62
    throw p1

    :goto_63
    goto :goto_62
.end method

.method public てぜきぽく()I
    .registers 3

    const-wide/16 v0, 0x4

    invoke-virtual {p0, v0, v1}, Lぺぁあねじ/ざとぅぼこ〺;->〻ぞまぎな〻(J)V

    iget-object v0, p0, Lぺぁあねじ/ざとぅぼこ〺;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    invoke-virtual {v0}, Lぺぁあねじ/づざかべべ;->てぜきぽく()I

    move-result v0

    return v0
.end method

.method public でどあくず(J)Ljava/lang/String;
    .registers 15

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_9f

    const-wide/16 v0, 0x1

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v4, p1, v2

    if-nez v4, :cond_13

    move-wide v4, v2

    goto :goto_15

    :cond_13
    add-long v4, p1, v0

    :goto_15
    const/16 v7, 0xa

    const-wide/16 v8, 0x0

    move-object v6, p0

    move-wide v10, v4

    invoke-virtual/range {v6 .. v11}, Lぺぁあねじ/ざとぅぼこ〺;->じぜこほぱ(BJJ)J

    move-result-wide v6

    const-wide/16 v8, -0x1

    cmp-long v10, v6, v8

    if-eqz v10, :cond_2c

    iget-object p1, p0, Lぺぁあねじ/ざとぅぼこ〺;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    invoke-virtual {p1, v6, v7}, Lぺぁあねじ/づざかべべ;->げがぴうあだ(J)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2c
    cmp-long v6, v4, v2

    if-gez v6, :cond_5a

    invoke-virtual {p0, v4, v5}, Lぺぁあねじ/ざとぅぼこ〺;->ぉひのべい(J)Z

    move-result v2

    if-eqz v2, :cond_5a

    iget-object v2, p0, Lぺぁあねじ/ざとぅぼこ〺;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    sub-long v6, v4, v0

    invoke-virtual {v2, v6, v7}, Lぺぁあねじ/づざかべべ;->ぉひのべい(J)B

    move-result v2

    const/16 v3, 0xd

    if-ne v2, v3, :cond_5a

    add-long/2addr v0, v4

    invoke-virtual {p0, v0, v1}, Lぺぁあねじ/ざとぅぼこ〺;->ぉひのべい(J)Z

    move-result v0

    if-eqz v0, :cond_5a

    iget-object v0, p0, Lぺぁあねじ/ざとぅぼこ〺;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    invoke-virtual {v0, v4, v5}, Lぺぁあねじ/づざかべべ;->ぉひのべい(J)B

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_5a

    iget-object p1, p0, Lぺぁあねじ/ざとぅぼこ〺;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    invoke-virtual {p1, v4, v5}, Lぺぁあねじ/づざかべべ;->げがぴうあだ(J)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_5a
    new-instance v6, Lぺぁあねじ/づざかべべ;

    invoke-direct {v6}, Lぺぁあねじ/づざかべべ;-><init>()V

    iget-object v0, p0, Lぺぁあねじ/ざとぅぼこ〺;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x20

    .line 1
    iget-wide v7, v0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    .line 2
    invoke-static {v4, v5, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    move-object v1, v6

    invoke-virtual/range {v0 .. v5}, Lぺぁあねじ/づざかべべ;->ぺづげぺが(Lぺぁあねじ/づざかべべ;JJ)Lぺぁあねじ/づざかべべ;

    new-instance v0, Ljava/io/EOFException;

    const-string v1, "\\n not found: limit="

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lぺぁあねじ/ざとぅぼこ〺;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    .line 3
    iget-wide v2, v2, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    .line 4
    invoke-static {v2, v3, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " content="

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Lぺぁあねじ/づざかべべ;->おかぷせ〱()Lぺぁあねじ/〳ぜぞぜべっ;

    move-result-object p1

    invoke-virtual {p1}, Lぺぁあねじ/〳ぜぞぜべっ;->ぁごぐすすぃ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x2026

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "limit < 0: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public どぇぞほだ()Ljava/io/InputStream;
    .registers 2

    new-instance v0, Lぺぁあねじ/ざとぅぼこ〺$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Lぺぁあねじ/ざとぅぼこ〺$げつ〴ぬぐ;-><init>(Lぺぁあねじ/ざとぅぼこ〺;)V

    return-object v0
.end method

.method public なぎぱいぢぎ(J)Lぺぁあねじ/〳ぜぞぜべっ;
    .registers 4

    .line 1
    invoke-virtual {p0, p1, p2}, Lぺぁあねじ/ざとぅぼこ〺;->ぉひのべい(J)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 2
    iget-object v0, p0, Lぺぁあねじ/ざとぅぼこ〺;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    invoke-virtual {v0, p1, p2}, Lぺぁあねじ/づざかべべ;->なぎぱいぢぎ(J)Lぺぁあねじ/〳ぜぞぜべっ;

    move-result-object p1

    return-object p1

    .line 3
    :cond_d
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1
.end method

.method public なぶひせが()J
    .registers 7

    const-wide/16 v0, 0x1

    invoke-virtual {p0, v0, v1}, Lぺぁあねじ/ざとぅぼこ〺;->〻ぞまぎな〻(J)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_7
    add-int/lit8 v2, v1, 0x1

    int-to-long v3, v2

    invoke-virtual {p0, v3, v4}, Lぺぁあねじ/ざとぅぼこ〺;->ぉひのべい(J)Z

    move-result v3

    if-eqz v3, :cond_4a

    iget-object v3, p0, Lぺぁあねじ/ざとぅぼこ〺;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    int-to-long v4, v1

    invoke-virtual {v3, v4, v5}, Lぺぁあねじ/づざかべべ;->ぉひのべい(J)B

    move-result v3

    const/16 v4, 0x30

    if-lt v3, v4, :cond_1f

    const/16 v4, 0x39

    if-le v3, v4, :cond_30

    :cond_1f
    const/16 v4, 0x61

    if-lt v3, v4, :cond_27

    const/16 v4, 0x66

    if-le v3, v4, :cond_30

    :cond_27
    const/16 v4, 0x41

    if-lt v3, v4, :cond_32

    const/16 v4, 0x46

    if-le v3, v4, :cond_30

    goto :goto_32

    :cond_30
    move v1, v2

    goto :goto_7

    :cond_32
    :goto_32
    if-eqz v1, :cond_35

    goto :goto_4a

    :cond_35
    new-instance v1, Ljava/lang/NumberFormatException;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v3

    aput-object v3, v2, v0

    const-string v0, "Expected leading [0-9a-fA-F] character but was %#x"

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4a
    :goto_4a
    iget-object v0, p0, Lぺぁあねじ/ざとぅぼこ〺;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    invoke-virtual {v0}, Lぺぁあねじ/づざかべべ;->なぶひせが()J

    move-result-wide v0

    return-wide v0
.end method

.method public のぷのちつ()Z
    .registers 6

    iget-boolean v0, p0, Lぺぁあねじ/ざとぅぼこ〺;->びぐびあび:Z

    if-nez v0, :cond_20

    iget-object v0, p0, Lぺぁあねじ/ざとぅぼこ〺;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    invoke-virtual {v0}, Lぺぁあねじ/づざかべべ;->のぷのちつ()Z

    move-result v0

    if-eqz v0, :cond_1e

    iget-object v0, p0, Lぺぁあねじ/ざとぅぼこ〺;->くし〴〺ぅ:Lぺぁあねじ/ぶでにく〼〳;

    iget-object v1, p0, Lぺぁあねじ/ざとぅぼこ〺;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    const-wide/16 v2, 0x2000

    invoke-interface {v0, v1, v2, v3}, Lぺぁあねじ/ぶでにく〼〳;->ざっざへづ(Lぺぁあねじ/づざかべべ;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-nez v4, :cond_1e

    const/4 v0, 0x1

    goto :goto_1f

    :cond_1e
    const/4 v0, 0x0

    :goto_1f
    return v0

    :cond_20
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public は〲ぱなで()S
    .registers 3

    const-wide/16 v0, 0x2

    invoke-virtual {p0, v0, v1}, Lぺぁあねじ/ざとぅぼこ〺;->〻ぞまぎな〻(J)V

    iget-object v0, p0, Lぺぁあねじ/ざとぅぼこ〺;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    invoke-virtual {v0}, Lぺぁあねじ/づざかべべ;->は〲ぱなで()S

    move-result v0

    return v0
.end method

.method public びえぁぜい(B)J
    .registers 8

    const-wide/16 v2, 0x0

    const-wide v4, 0x7fffffffffffffffL

    move-object v0, p0

    move v1, p1

    invoke-virtual/range {v0 .. v5}, Lぺぁあねじ/ざとぅぼこ〺;->じぜこほぱ(BJJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public ぶでにく〼〳()S
    .registers 3

    const-wide/16 v0, 0x2

    invoke-virtual {p0, v0, v1}, Lぺぁあねじ/ざとぅぼこ〺;->〻ぞまぎな〻(J)V

    iget-object v0, p0, Lぺぁあねじ/ざとぅぼこ〺;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    invoke-virtual {v0}, Lぺぁあねじ/づざかべべ;->ぶでにく〼〳()S

    move-result v0

    return v0
.end method

.method public ぺぁあねじ()I
    .registers 3

    const-wide/16 v0, 0x4

    invoke-virtual {p0, v0, v1}, Lぺぁあねじ/ざとぅぼこ〺;->〻ぞまぎな〻(J)V

    iget-object v0, p0, Lぺぁあねじ/ざとぅぼこ〺;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    invoke-virtual {v0}, Lぺぁあねじ/づざかべべ;->ぺぁあねじ()I

    move-result v0

    return v0
.end method

.method public ぺづげぺが([B)V
    .registers 10

    :try_start_0
    array-length v0, p1

    int-to-long v0, v0

    invoke-virtual {p0, v0, v1}, Lぺぁあねじ/ざとぅぼこ〺;->〻ぞまぎな〻(J)V
    :try_end_5
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_5} :catch_b

    iget-object v0, p0, Lぺぁあねじ/ざとぅぼこ〺;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    invoke-virtual {v0, p1}, Lぺぁあねじ/づざかべべ;->〺でおいここ([B)V

    return-void

    :catch_b
    move-exception v0

    const/4 v1, 0x0

    :goto_d
    iget-object v2, p0, Lぺぁあねじ/ざとぅぼこ〺;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    iget-wide v3, v2, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    const-wide/16 v5, 0x0

    cmp-long v7, v3, v5

    if-lez v7, :cond_27

    long-to-int v4, v3

    invoke-virtual {v2, p1, v1, v4}, Lぺぁあねじ/づざかべべ;->ぷぞてのほき([BII)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_21

    add-int/2addr v1, v2

    goto :goto_d

    :cond_21
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_27
    goto :goto_29

    :goto_28
    throw v0

    :goto_29
    goto :goto_28
.end method

.method public ぺふねづ〺()Ljava/lang/String;
    .registers 3

    const-wide v0, 0x7fffffffffffffffL

    invoke-virtual {p0, v0, v1}, Lぺぁあねじ/ざとぅぼこ〺;->でどあくず(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
