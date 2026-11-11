.class public final Lぺぁあねじ/ぉざぅち〻;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lぺぁあねじ/なぎぱいぢぎ;


# instance fields
.field public final 〺つふすそ:Lぺぁあねじ/づざかべべ;

.field public final くし〴〺ぅ:Lぺぁあねじ/でどあくず;

.field public びぐびあび:Z


# direct methods
.method public constructor <init>(Lぺぁあねじ/でどあくず;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lぺぁあねじ/づざかべべ;

    invoke-direct {v0}, Lぺぁあねじ/づざかべべ;-><init>()V

    iput-object v0, p0, Lぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    if-eqz p1, :cond_f

    iput-object p1, p0, Lぺぁあねじ/ぉざぅち〻;->くし〴〺ぅ:Lぺぁあねじ/でどあくず;

    return-void

    :cond_f
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "sink == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public close()V
    .registers 8

    iget-boolean v0, p0, Lぺぁあねじ/ぉざぅち〻;->びぐびあび:Z

    if-eqz v0, :cond_5

    return-void

    :cond_5
    const/4 v0, 0x0

    :try_start_6
    iget-object v1, p0, Lぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    iget-wide v2, v1, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-lez v6, :cond_17

    iget-object v4, p0, Lぺぁあねじ/ぉざぅち〻;->くし〴〺ぅ:Lぺぁあねじ/でどあくず;

    invoke-interface {v4, v1, v2, v3}, Lぺぁあねじ/でどあくず;->びぐびあび(Lぺぁあねじ/づざかべべ;J)V
    :try_end_15
    .catchall {:try_start_6 .. :try_end_15} :catchall_16

    goto :goto_17

    :catchall_16
    move-exception v0

    :cond_17
    :goto_17
    :try_start_17
    iget-object v1, p0, Lぺぁあねじ/ぉざぅち〻;->くし〴〺ぅ:Lぺぁあねじ/でどあくず;

    invoke-interface {v1}, Lぺぁあねじ/でどあくず;->close()V
    :try_end_1c
    .catchall {:try_start_17 .. :try_end_1c} :catchall_1d

    goto :goto_21

    :catchall_1d
    move-exception v1

    if-nez v0, :cond_21

    move-object v0, v1

    :cond_21
    :goto_21
    const/4 v1, 0x1

    iput-boolean v1, p0, Lぺぁあねじ/ぉざぅち〻;->びぐびあび:Z

    if-nez v0, :cond_27

    return-void

    .line 1
    :cond_27
    sget-object v1, Lぺぁあねじ/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/nio/charset/Charset;

    .line 2
    throw v0
.end method

.method public flush()V
    .registers 7

    iget-boolean v0, p0, Lぺぁあねじ/ぉざぅち〻;->びぐびあび:Z

    if-nez v0, :cond_19

    iget-object v0, p0, Lぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    iget-wide v1, v0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_13

    iget-object v3, p0, Lぺぁあねじ/ぉざぅち〻;->くし〴〺ぅ:Lぺぁあねじ/でどあくず;

    invoke-interface {v3, v0, v1, v2}, Lぺぁあねじ/でどあくず;->びぐびあび(Lぺぁあねじ/づざかべべ;J)V

    :cond_13
    iget-object v0, p0, Lぺぁあねじ/ぉざぅち〻;->くし〴〺ぅ:Lぺぁあねじ/でどあくず;

    invoke-interface {v0}, Lぺぁあねじ/でどあくず;->flush()V

    return-void

    :cond_19
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public isOpen()Z
    .registers 2

    iget-boolean v0, p0, Lぺぁあねじ/ぉざぅち〻;->びぐびあび:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    const-string v0, "buffer("

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lぺぁあねじ/ぉざぅち〻;->くし〴〺ぅ:Lぺぁあねじ/でどあくず;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public write(Ljava/nio/ByteBuffer;)I
    .registers 3

    iget-boolean v0, p0, Lぺぁあねじ/ぉざぅち〻;->びぐびあび:Z

    if-nez v0, :cond_e

    iget-object v0, p0, Lぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    invoke-virtual {v0, p1}, Lぺぁあねじ/づざかべべ;->write(Ljava/nio/ByteBuffer;)I

    move-result p1

    invoke-virtual {p0}, Lぺぁあねじ/ぉざぅち〻;->ごづごきえ()Lぺぁあねじ/なぎぱいぢぎ;

    return p1

    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public 〳ぜぞぜべっ(I)Lぺぁあねじ/なぎぱいぢぎ;
    .registers 3

    iget-boolean v0, p0, Lぺぁあねじ/ぉざぅち〻;->びぐびあび:Z

    if-nez v0, :cond_d

    iget-object v0, p0, Lぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    invoke-virtual {v0, p1}, Lぺぁあねじ/づざかべべ;->のね〱ばぁぢ(I)Lぺぁあねじ/づざかべべ;

    invoke-virtual {p0}, Lぺぁあねじ/ぉざぅち〻;->ごづごきえ()Lぺぁあねじ/なぎぱいぢぎ;

    return-object p0

    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public 〺つふすそ()Lぺぁあねじ/〻ぞまぎな〻;
    .registers 2

    iget-object v0, p0, Lぺぁあねじ/ぉざぅち〻;->くし〴〺ぅ:Lぺぁあねじ/でどあくず;

    invoke-interface {v0}, Lぺぁあねじ/でどあくず;->〺つふすそ()Lぺぁあねじ/〻ぞまぎな〻;

    move-result-object v0

    return-object v0
.end method

.method public いいにぽつ(I)Lぺぁあねじ/なぎぱいぢぎ;
    .registers 3

    iget-boolean v0, p0, Lぺぁあねじ/ぉざぅち〻;->びぐびあび:Z

    if-nez v0, :cond_d

    iget-object v0, p0, Lぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    invoke-virtual {v0, p1}, Lぺぁあねじ/づざかべべ;->ぺがぅす〹ち(I)Lぺぁあねじ/づざかべべ;

    invoke-virtual {p0}, Lぺぁあねじ/ぉざぅち〻;->ごづごきえ()Lぺぁあねじ/なぎぱいぢぎ;

    return-object p0

    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ぇ〳〲〺すっ(J)Lぺぁあねじ/なぎぱいぢぎ;
    .registers 4

    iget-boolean v0, p0, Lぺぁあねじ/ぉざぅち〻;->びぐびあび:Z

    if-nez v0, :cond_e

    iget-object v0, p0, Lぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    invoke-virtual {v0, p1, p2}, Lぺぁあねじ/づざかべべ;->ごまけがぢは(J)Lぺぁあねじ/づざかべべ;

    invoke-virtual {p0}, Lぺぁあねじ/ぉざぅち〻;->ごづごきえ()Lぺぁあねじ/なぎぱいぢぎ;

    move-result-object p1

    return-object p1

    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ぉ〲なぱぽた(Ljava/lang/String;)Lぺぁあねじ/なぎぱいぢぎ;
    .registers 3

    iget-boolean v0, p0, Lぺぁあねじ/ぉざぅち〻;->びぐびあび:Z

    if-nez v0, :cond_e

    iget-object v0, p0, Lぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    invoke-virtual {v0, p1}, Lぺぁあねじ/づざかべべ;->くねねぱす〻(Ljava/lang/String;)Lぺぁあねじ/づざかべべ;

    invoke-virtual {p0}, Lぺぁあねじ/ぉざぅち〻;->ごづごきえ()Lぺぁあねじ/なぎぱいぢぎ;

    move-result-object p1

    return-object p1

    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ぉざぅち〻([B)Lぺぁあねじ/なぎぱいぢぎ;
    .registers 3

    iget-boolean v0, p0, Lぺぁあねじ/ぉざぅち〻;->びぐびあび:Z

    if-nez v0, :cond_e

    iget-object v0, p0, Lぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    invoke-virtual {v0, p1}, Lぺぁあねじ/づざかべべ;->ておぞぞはね([B)Lぺぁあねじ/づざかべべ;

    invoke-virtual {p0}, Lぺぁあねじ/ぉざぅち〻;->ごづごきえ()Lぺぁあねじ/なぎぱいぢぎ;

    move-result-object p1

    return-object p1

    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public くし〴〺ぅ([BII)Lぺぁあねじ/なぎぱいぢぎ;
    .registers 5

    iget-boolean v0, p0, Lぺぁあねじ/ぉざぅち〻;->びぐびあび:Z

    if-nez v0, :cond_e

    iget-object v0, p0, Lぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    invoke-virtual {v0, p1, p2, p3}, Lぺぁあねじ/づざかべべ;->ち〴みぎ〻び([BII)Lぺぁあねじ/づざかべべ;

    invoke-virtual {p0}, Lぺぁあねじ/ぉざぅち〻;->ごづごきえ()Lぺぁあねじ/なぎぱいぢぎ;

    move-result-object p1

    return-object p1

    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public げつ〴ぬぐ()Lぺぁあねじ/づざかべべ;
    .registers 2

    iget-object v0, p0, Lぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    return-object v0
.end method

.method public ごづごきえ()Lぺぁあねじ/なぎぱいぢぎ;
    .registers 9

    iget-boolean v0, p0, Lぺぁあねじ/ぉざぅち〻;->びぐびあび:Z

    if-nez v0, :cond_2d

    iget-object v0, p0, Lぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    .line 1
    iget-wide v1, v0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-nez v5, :cond_10

    move-wide v1, v3

    goto :goto_23

    :cond_10
    iget-object v5, v0, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    iget-object v5, v5, Lぺぁあねじ/は〲ぱなで;->ぁごぐすすぃ:Lぺぁあねじ/は〲ぱなで;

    iget v6, v5, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    const/16 v7, 0x2000

    if-ge v6, v7, :cond_23

    iget-boolean v7, v5, Lぺぁあねじ/は〲ぱなで;->づざかべべ:Z

    if-eqz v7, :cond_23

    iget v5, v5, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    sub-int/2addr v6, v5

    int-to-long v5, v6

    sub-long/2addr v1, v5

    :cond_23
    :goto_23
    cmp-long v5, v1, v3

    if-lez v5, :cond_2c

    .line 2
    iget-object v3, p0, Lぺぁあねじ/ぉざぅち〻;->くし〴〺ぅ:Lぺぁあねじ/でどあくず;

    invoke-interface {v3, v0, v1, v2}, Lぺぁあねじ/でどあくず;->びぐびあび(Lぺぁあねじ/づざかべべ;J)V

    :cond_2c
    return-object p0

    :cond_2d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ざとぅぼこ〺(Lぺぁあねじ/〳ぜぞぜべっ;)Lぺぁあねじ/なぎぱいぢぎ;
    .registers 3

    iget-boolean v0, p0, Lぺぁあねじ/ぉざぅち〻;->びぐびあび:Z

    if-nez v0, :cond_e

    iget-object v0, p0, Lぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    invoke-virtual {v0, p1}, Lぺぁあねじ/づざかべべ;->ぃぜぶの〸ぃ(Lぺぁあねじ/〳ぜぞぜべっ;)Lぺぁあねじ/づざかべべ;

    invoke-virtual {p0}, Lぺぁあねじ/ぉざぅち〻;->ごづごきえ()Lぺぁあねじ/なぎぱいぢぎ;

    move-result-object p1

    return-object p1

    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public づざかべべ(J)Lぺぁあねじ/なぎぱいぢぎ;
    .registers 4

    iget-boolean v0, p0, Lぺぁあねじ/ぉざぅち〻;->びぐびあび:Z

    if-nez v0, :cond_e

    iget-object v0, p0, Lぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    invoke-virtual {v0, p1, p2}, Lぺぁあねじ/づざかべべ;->こ〲しでおか(J)Lぺぁあねじ/づざかべべ;

    invoke-virtual {p0}, Lぺぁあねじ/ぉざぅち〻;->ごづごきえ()Lぺぁあねじ/なぎぱいぢぎ;

    move-result-object p1

    return-object p1

    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public びぐびあび(Lぺぁあねじ/づざかべべ;J)V
    .registers 5

    iget-boolean v0, p0, Lぺぁあねじ/ぉざぅち〻;->びぐびあび:Z

    if-nez v0, :cond_d

    iget-object v0, p0, Lぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    invoke-virtual {v0, p1, p2, p3}, Lぺぁあねじ/づざかべべ;->びぐびあび(Lぺぁあねじ/づざかべべ;J)V

    invoke-virtual {p0}, Lぺぁあねじ/ぉざぅち〻;->ごづごきえ()Lぺぁあねじ/なぎぱいぢぎ;

    return-void

    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public へぬ〴づぞ(I)Lぺぁあねじ/なぎぱいぢぎ;
    .registers 3

    iget-boolean v0, p0, Lぺぁあねじ/ぉざぅち〻;->びぐびあび:Z

    if-nez v0, :cond_d

    iget-object v0, p0, Lぺぁあねじ/ぉざぅち〻;->〺つふすそ:Lぺぁあねじ/づざかべべ;

    invoke-virtual {v0, p1}, Lぺぁあねじ/づざかべべ;->ばおぢでぎか(I)Lぺぁあねじ/づざかべべ;

    invoke-virtual {p0}, Lぺぁあねじ/ぉざぅち〻;->ごづごきえ()Lぺぁあねじ/なぎぱいぢぎ;

    return-object p0

    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
