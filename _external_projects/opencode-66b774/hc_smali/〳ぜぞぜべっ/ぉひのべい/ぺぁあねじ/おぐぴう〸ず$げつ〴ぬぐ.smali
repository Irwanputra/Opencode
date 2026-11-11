.class public final L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lぺぁあねじ/ぶでにく〼〳;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public final 〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

.field public ぁごぐすすぃ:S

.field public くし〴〺ぅ:I

.field public づざかべべ:I

.field public なぎぱいぢぎ:I

.field public びぐびあび:B


# direct methods
.method public constructor <init>(Lぺぁあねじ/ぁごぐすすぃ;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$げつ〴ぬぐ;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    return-void
.end method


# virtual methods
.method public close()V
    .registers 1

    return-void
.end method

.method public 〺つふすそ()Lぺぁあねじ/〻ぞまぎな〻;
    .registers 2

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$げつ〴ぬぐ;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v0}, Lぺぁあねじ/ぶでにく〼〳;->〺つふすそ()Lぺぁあねじ/〻ぞまぎな〻;

    move-result-object v0

    return-object v0
.end method

.method public ざっざへづ(Lぺぁあねじ/づざかべべ;J)J
    .registers 12

    :goto_0
    iget v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$げつ〴ぬぐ;->なぎぱいぢぎ:I

    const-wide/16 v1, -0x1

    if-nez v0, :cond_7a

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$げつ〴ぬぐ;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    iget-short v3, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$げつ〴ぬぐ;->ぁごぐすすぃ:S

    int-to-long v3, v3

    invoke-interface {v0, v3, v4}, Lぺぁあねじ/ぁごぐすすぃ;->ぁごぐすすぃ(J)V

    const/4 v0, 0x0

    iput-short v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$げつ〴ぬぐ;->ぁごぐすすぃ:S

    iget-byte v3, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$げつ〴ぬぐ;->びぐびあび:B

    and-int/lit8 v3, v3, 0x4

    if-eqz v3, :cond_18

    return-wide v1

    .line 1
    :cond_18
    iget v1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$げつ〴ぬぐ;->づざかべべ:I

    iget-object v2, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$げつ〴ぬぐ;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-static {v2}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->けときぜと(Lぺぁあねじ/ぁごぐすすぃ;)I

    move-result v2

    iput v2, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$げつ〴ぬぐ;->なぎぱいぢぎ:I

    iput v2, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$げつ〴ぬぐ;->くし〴〺ぅ:I

    iget-object v2, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$げつ〴ぬぐ;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v2}, Lぺぁあねじ/ぁごぐすすぃ;->ぅみぱぎぎ()B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    iget-object v3, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$げつ〴ぬぐ;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v3}, Lぺぁあねじ/ぁごぐすすぃ;->ぅみぱぎぎ()B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    iput-byte v3, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$げつ〴ぬぐ;->びぐびあび:B

    sget-object v3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず;->なぎぱいぢぎ:Ljava/util/logging/Logger;

    sget-object v4, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v3, v4}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_50

    iget v4, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$げつ〴ぬぐ;->づざかべべ:I

    iget v6, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$げつ〴ぬぐ;->くし〴〺ぅ:I

    iget-byte v7, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$げつ〴ぬぐ;->びぐびあび:B

    invoke-static {v5, v4, v6, v2, v7}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->げつ〴ぬぐ(ZIIBB)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_50
    iget-object v3, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$げつ〴ぬぐ;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v3}, Lぺぁあねじ/ぁごぐすすぃ;->ぺぁあねじ()I

    move-result v3

    const v4, 0x7fffffff

    and-int/2addr v3, v4

    iput v3, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$げつ〴ぬぐ;->づざかべべ:I

    const/16 v4, 0x9

    const/4 v6, 0x0

    if-ne v2, v4, :cond_6c

    if-ne v3, v1, :cond_64

    goto :goto_0

    :cond_64
    new-array p1, v0, [Ljava/lang/Object;

    const-string p2, "TYPE_CONTINUATION streamId changed"

    invoke-static {p2, p1}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->くし〴〺ぅ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    throw v6

    :cond_6c
    new-array p1, v5, [Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p2

    aput-object p2, p1, v0

    const-string p2, "%s != TYPE_CONTINUATION"

    invoke-static {p2, p1}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->くし〴〺ぅ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    throw v6

    .line 2
    :cond_7a
    iget-object v3, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$げつ〴ぬぐ;->〺つふすそ:Lぺぁあねじ/ぁごぐすすぃ;

    int-to-long v4, v0

    invoke-static {p2, p3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    invoke-interface {v3, p1, p2, p3}, Lぺぁあねじ/ぶでにく〼〳;->ざっざへづ(Lぺぁあねじ/づざかべべ;J)J

    move-result-wide p1

    cmp-long p3, p1, v1

    if-nez p3, :cond_8a

    return-wide v1

    :cond_8a
    iget p3, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$げつ〴ぬぐ;->なぎぱいぢぎ:I

    int-to-long v0, p3

    sub-long/2addr v0, p1

    long-to-int p3, v0

    iput p3, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/おぐぴう〸ず$げつ〴ぬぐ;->なぎぱいぢぎ:I

    return-wide p1
.end method
