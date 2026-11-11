.class public final Lぺぁあねじ/へぬ〴づぞ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lぺぁあねじ/でどあくず;


# instance fields
.field public final synthetic 〺つふすそ:Lぺぁあねじ/〻ぞまぎな〻;

.field public final synthetic くし〴〺ぅ:Ljava/io/OutputStream;


# direct methods
.method public constructor <init>(Lぺぁあねじ/〻ぞまぎな〻;Ljava/io/OutputStream;)V
    .registers 3

    iput-object p1, p0, Lぺぁあねじ/へぬ〴づぞ;->〺つふすそ:Lぺぁあねじ/〻ぞまぎな〻;

    iput-object p2, p0, Lぺぁあねじ/へぬ〴づぞ;->くし〴〺ぅ:Ljava/io/OutputStream;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public close()V
    .registers 2

    iget-object v0, p0, Lぺぁあねじ/へぬ〴づぞ;->くし〴〺ぅ:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    return-void
.end method

.method public flush()V
    .registers 2

    iget-object v0, p0, Lぺぁあねじ/へぬ〴づぞ;->くし〴〺ぅ:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    const-string v0, "sink("

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lぺぁあねじ/へぬ〴づぞ;->くし〴〺ぅ:Ljava/io/OutputStream;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public 〺つふすそ()Lぺぁあねじ/〻ぞまぎな〻;
    .registers 2

    iget-object v0, p0, Lぺぁあねじ/へぬ〴づぞ;->〺つふすそ:Lぺぁあねじ/〻ぞまぎな〻;

    return-object v0
.end method

.method public びぐびあび(Lぺぁあねじ/づざかべべ;J)V
    .registers 10

    iget-wide v0, p1, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    const-wide/16 v2, 0x0

    move-wide v4, p2

    invoke-static/range {v0 .. v5}, Lぺぁあねじ/ぉ〲なぱぽた;->〺つふすそ(JJJ)V

    :cond_8
    :goto_8
    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-lez v2, :cond_43

    iget-object v0, p0, Lぺぁあねじ/へぬ〴づぞ;->〺つふすそ:Lぺぁあねじ/〻ぞまぎな〻;

    invoke-virtual {v0}, Lぺぁあねじ/〻ぞまぎな〻;->なぎぱいぢぎ()V

    iget-object v0, p1, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    iget v1, v0, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    iget v2, v0, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    sub-int/2addr v1, v2

    int-to-long v1, v1

    invoke-static {p2, p3, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v2, v1

    iget-object v1, p0, Lぺぁあねじ/へぬ〴づぞ;->くし〴〺ぅ:Ljava/io/OutputStream;

    iget-object v3, v0, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ:[B

    iget v4, v0, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    invoke-virtual {v1, v3, v4, v2}, Ljava/io/OutputStream;->write([BII)V

    iget v1, v0, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    add-int/2addr v1, v2

    iput v1, v0, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    int-to-long v2, v2

    sub-long/2addr p2, v2

    iget-wide v4, p1, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    sub-long/2addr v4, v2

    iput-wide v4, p1, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    iget v2, v0, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    if-ne v1, v2, :cond_8

    invoke-virtual {v0}, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ()Lぺぁあねじ/は〲ぱなで;

    move-result-object v1

    iput-object v1, p1, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    invoke-static {v0}, Lぺぁあねじ/ごづごきえ;->げつ〴ぬぐ(Lぺぁあねじ/は〲ぱなで;)V

    goto :goto_8

    :cond_43
    return-void
.end method
