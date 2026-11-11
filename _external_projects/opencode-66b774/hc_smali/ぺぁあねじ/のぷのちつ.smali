.class public final Lぺぁあねじ/のぷのちつ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lぺぁあねじ/ぶでにく〼〳;


# instance fields
.field public final 〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

.field public final くし〴〺ぅ:Ljava/util/zip/Inflater;

.field public づざかべべ:Z

.field public びぐびあび:I


# direct methods
.method public constructor <init>(Lぺぁあねじ/ぁごぐすすぃ;Ljava/util/zip/Inflater;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lぺぁあねじ/のぷのちつ;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    iput-object p2, p0, Lぺぁあねじ/のぷのちつ;->くし〴〺ぅ:Ljava/util/zip/Inflater;

    return-void
.end method


# virtual methods
.method public close()V
    .registers 2

    iget-boolean v0, p0, Lぺぁあねじ/のぷのちつ;->づざかべべ:Z

    if-eqz v0, :cond_5

    return-void

    :cond_5
    iget-object v0, p0, Lぺぁあねじ/のぷのちつ;->くし〴〺ぅ:Ljava/util/zip/Inflater;

    invoke-virtual {v0}, Ljava/util/zip/Inflater;->end()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lぺぁあねじ/のぷのちつ;->づざかべべ:Z

    iget-object v0, p0, Lぺぁあねじ/のぷのちつ;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v0}, Lぺぁあねじ/ぶでにく〼〳;->close()V

    return-void
.end method

.method public 〺つふすそ()Lぺぁあねじ/〻ぞまぎな〻;
    .registers 2

    iget-object v0, p0, Lぺぁあねじ/のぷのちつ;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v0}, Lぺぁあねじ/ぶでにく〼〳;->〺つふすそ()Lぺぁあねじ/〻ぞまぎな〻;

    move-result-object v0

    return-object v0
.end method

.method public ざっざへづ(Lぺぁあねじ/づざかべべ;J)J
    .registers 10

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_b3

    iget-boolean v2, p0, Lぺぁあねじ/のぷのちつ;->づざかべべ:Z

    if-nez v2, :cond_ab

    cmp-long v2, p2, v0

    if-nez v2, :cond_f

    return-wide v0

    .line 1
    :cond_f
    :goto_f
    iget-object v0, p0, Lぺぁあねじ/のぷのちつ;->くし〴〺ぅ:Ljava/util/zip/Inflater;

    invoke-virtual {v0}, Ljava/util/zip/Inflater;->needsInput()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1a

    goto :goto_45

    :cond_1a
    invoke-virtual {p0}, Lぺぁあねじ/のぷのちつ;->じぜこほぱ()V

    iget-object v0, p0, Lぺぁあねじ/のぷのちつ;->くし〴〺ぅ:Ljava/util/zip/Inflater;

    invoke-virtual {v0}, Ljava/util/zip/Inflater;->getRemaining()I

    move-result v0

    if-nez v0, :cond_a3

    iget-object v0, p0, Lぺぁあねじ/のぷのちつ;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v0}, Lぺぁあねじ/ぁごぐすすぃ;->のぷのちつ()Z

    move-result v0

    if-eqz v0, :cond_2f

    const/4 v1, 0x1

    goto :goto_45

    :cond_2f
    iget-object v0, p0, Lぺぁあねじ/のぷのちつ;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v0}, Lぺぁあねじ/ぁごぐすすぃ;->げつ〴ぬぐ()Lぺぁあねじ/づざかべべ;

    move-result-object v0

    iget-object v0, v0, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    iget v3, v0, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    iget v4, v0, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    sub-int/2addr v3, v4

    iput v3, p0, Lぺぁあねじ/のぷのちつ;->びぐびあび:I

    iget-object v5, p0, Lぺぁあねじ/のぷのちつ;->くし〴〺ぅ:Ljava/util/zip/Inflater;

    iget-object v0, v0, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ:[B

    invoke-virtual {v5, v0, v4, v3}, Ljava/util/zip/Inflater;->setInput([BII)V

    .line 2
    :goto_45
    :try_start_45
    invoke-virtual {p1, v2}, Lぺぁあねじ/づざかべべ;->ながふずは(I)Lぺぁあねじ/は〲ぱなで;

    move-result-object v0

    iget v2, v0, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    rsub-int v2, v2, 0x2000

    int-to-long v2, v2

    invoke-static {p2, p3, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int v3, v2

    iget-object v2, p0, Lぺぁあねじ/のぷのちつ;->くし〴〺ぅ:Ljava/util/zip/Inflater;

    iget-object v4, v0, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ:[B

    iget v5, v0, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    invoke-virtual {v2, v4, v5, v3}, Ljava/util/zip/Inflater;->inflate([BII)I

    move-result v2

    if-lez v2, :cond_6b

    iget p2, v0, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    add-int/2addr p2, v2

    iput p2, v0, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    iget-wide p2, p1, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    int-to-long v0, v2

    add-long/2addr p2, v0

    iput-wide p2, p1, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    return-wide v0

    :cond_6b
    iget-object v2, p0, Lぺぁあねじ/のぷのちつ;->くし〴〺ぅ:Ljava/util/zip/Inflater;

    invoke-virtual {v2}, Ljava/util/zip/Inflater;->finished()Z

    move-result v2

    if-nez v2, :cond_87

    iget-object v2, p0, Lぺぁあねじ/のぷのちつ;->くし〴〺ぅ:Ljava/util/zip/Inflater;

    invoke-virtual {v2}, Ljava/util/zip/Inflater;->needsDictionary()Z

    move-result v2

    if-eqz v2, :cond_7c

    goto :goto_87

    :cond_7c
    if-nez v1, :cond_7f

    goto :goto_f

    :cond_7f
    new-instance p1, Ljava/io/EOFException;

    const-string p2, "source exhausted prematurely"

    invoke-direct {p1, p2}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_87
    :goto_87
    invoke-virtual {p0}, Lぺぁあねじ/のぷのちつ;->じぜこほぱ()V

    iget p2, v0, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    iget p3, v0, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    if-ne p2, p3, :cond_99

    invoke-virtual {v0}, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ()Lぺぁあねじ/は〲ぱなで;

    move-result-object p2

    iput-object p2, p1, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    invoke-static {v0}, Lぺぁあねじ/ごづごきえ;->げつ〴ぬぐ(Lぺぁあねじ/は〲ぱなで;)V
    :try_end_99
    .catch Ljava/util/zip/DataFormatException; {:try_start_45 .. :try_end_99} :catch_9c

    :cond_99
    const-wide/16 p1, -0x1

    return-wide p1

    :catch_9c
    move-exception p1

    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    .line 3
    :cond_a3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "?"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 4
    :cond_ab
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "byteCount < 0: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_cb

    :goto_ca
    throw p1

    :goto_cb
    goto :goto_ca
.end method

.method public final じぜこほぱ()V
    .registers 5

    iget v0, p0, Lぺぁあねじ/のぷのちつ;->びぐびあび:I

    if-nez v0, :cond_5

    return-void

    :cond_5
    iget-object v1, p0, Lぺぁあねじ/のぷのちつ;->くし〴〺ぅ:Ljava/util/zip/Inflater;

    invoke-virtual {v1}, Ljava/util/zip/Inflater;->getRemaining()I

    move-result v1

    sub-int/2addr v0, v1

    iget v1, p0, Lぺぁあねじ/のぷのちつ;->びぐびあび:I

    sub-int/2addr v1, v0

    iput v1, p0, Lぺぁあねじ/のぷのちつ;->びぐびあび:I

    iget-object v1, p0, Lぺぁあねじ/のぷのちつ;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    int-to-long v2, v0

    invoke-interface {v1, v2, v3}, Lぺぁあねじ/ぁごぐすすぃ;->ぁごぐすすぃ(J)V

    return-void
.end method
