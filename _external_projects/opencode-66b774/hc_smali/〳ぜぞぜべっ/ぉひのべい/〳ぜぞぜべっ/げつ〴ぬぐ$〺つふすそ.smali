.class public abstract L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lぺぁあねじ/ぶでにく〼〳;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "\u303a\u3064\u3075\u3059\u305d"
.end annotation


# instance fields
.field public final 〺つふすそ:Lぺぁあねじ/ぺふねづ〺;

.field public くし〴〺ぅ:Z

.field public final synthetic づざかべべ:L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;

.field public びぐびあび:J


# direct methods
.method public constructor <init>(L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$げつ〴ぬぐ;)V
    .registers 3

    .line 1
    iput-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$〺つふすそ;->づざかべべ:L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p2, Lぺぁあねじ/ぺふねづ〺;

    iget-object p1, p1, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {p1}, Lぺぁあねじ/ぶでにく〼〳;->〺つふすそ()Lぺぁあねじ/〻ぞまぎな〻;

    move-result-object p1

    invoke-direct {p2, p1}, Lぺぁあねじ/ぺふねづ〺;-><init>(Lぺぁあねじ/〻ぞまぎな〻;)V

    iput-object p2, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$〺つふすそ;->〺つふすそ:Lぺぁあねじ/ぺふねづ〺;

    const-wide/16 p1, 0x0

    iput-wide p1, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$〺つふすそ;->びぐびあび:J

    return-void
.end method


# virtual methods
.method public 〺つふすそ()Lぺぁあねじ/〻ぞまぎな〻;
    .registers 2

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$〺つふすそ;->〺つふすそ:Lぺぁあねじ/ぺふねづ〺;

    return-object v0
.end method

.method public ざっざへづ(Lぺぁあねじ/づざかべべ;J)J
    .registers 6

    :try_start_0
    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$〺つふすそ;->づざかべべ:L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;

    iget-object v0, v0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v0, p1, p2, p3}, Lぺぁあねじ/ぶでにく〼〳;->ざっざへづ(Lぺぁあねじ/づざかべべ;J)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long p3, p1, v0

    if-lez p3, :cond_13

    iget-wide v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$〺つふすそ;->びぐびあび:J

    add-long/2addr v0, p1

    iput-wide v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$〺つふすそ;->びぐびあび:J
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_13} :catch_14

    :cond_13
    return-wide p1

    :catch_14
    move-exception p1

    const/4 p2, 0x0

    invoke-virtual {p0, p2, p1}, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$〺つふすそ;->じぜこほぱ(ZLjava/io/IOException;)V

    throw p1
.end method

.method public final じぜこほぱ(ZLjava/io/IOException;)V
    .registers 12

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$〺つふすそ;->づざかべべ:L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;

    iget v1, v0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->づざかべべ:I

    const/4 v2, 0x6

    if-ne v1, v2, :cond_8

    return-void

    :cond_8
    const/4 v3, 0x5

    if-ne v1, v3, :cond_21

    iget-object v1, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$〺つふすそ;->〺つふすそ:Lぺぁあねじ/ぺふねづ〺;

    invoke-virtual {v0, v1}, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->ぁごぐすすぃ(Lぺぁあねじ/ぺふねづ〺;)V

    iget-object v5, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$〺つふすそ;->づざかべべ:L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;

    iput v2, v5, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->づざかべべ:I

    iget-object v3, v5, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->〺つふすそ:L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;

    if-eqz v3, :cond_20

    xor-int/lit8 v4, p1, 0x1

    iget-wide v6, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$〺つふすそ;->びぐびあび:J

    move-object v8, p2

    invoke-virtual/range {v3 .. v8}, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ;->ぺぁあねじ(ZL〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/くし〴〺ぅ;JLjava/io/IOException;)V

    :cond_20
    return-void

    :cond_21
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "state: "

    invoke-static {p2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$〺つふすそ;->づざかべべ:L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;

    iget v0, v0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->づざかべべ:I

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
