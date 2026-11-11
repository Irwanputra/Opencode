.class public final L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$づざかべべ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lぺぁあねじ/でどあくず;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u3065\u3056\u304b\u3079\u3079"
.end annotation


# instance fields
.field public final 〺つふすそ:Lぺぁあねじ/ぺふねづ〺;

.field public くし〴〺ぅ:Z

.field public final synthetic づざかべべ:L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;

.field public びぐびあび:J


# direct methods
.method public constructor <init>(L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;J)V
    .registers 5

    iput-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$づざかべべ;->づざかべべ:L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lぺぁあねじ/ぺふねづ〺;

    iget-object p1, p1, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->びぐびあび:Lぺぁあねじ/なぎぱいぢぎ;

    invoke-interface {p1}, Lぺぁあねじ/でどあくず;->〺つふすそ()Lぺぁあねじ/〻ぞまぎな〻;

    move-result-object p1

    invoke-direct {v0, p1}, Lぺぁあねじ/ぺふねづ〺;-><init>(Lぺぁあねじ/〻ぞまぎな〻;)V

    iput-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$づざかべべ;->〺つふすそ:Lぺぁあねじ/ぺふねづ〺;

    iput-wide p2, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$づざかべべ;->びぐびあび:J

    return-void
.end method


# virtual methods
.method public close()V
    .registers 6

    iget-boolean v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$づざかべべ;->くし〴〺ぅ:Z

    if-eqz v0, :cond_5

    return-void

    :cond_5
    const/4 v0, 0x1

    iput-boolean v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$づざかべべ;->くし〴〺ぅ:Z

    iget-wide v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$づざかべべ;->びぐびあび:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_1d

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$づざかべべ;->づざかべべ:L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;

    iget-object v1, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$づざかべべ;->〺つふすそ:Lぺぁあねじ/ぺふねづ〺;

    invoke-virtual {v0, v1}, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->ぁごぐすすぃ(Lぺぁあねじ/ぺふねづ〺;)V

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$づざかべべ;->づざかべべ:L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;

    const/4 v1, 0x3

    iput v1, v0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->づざかべべ:I

    return-void

    :cond_1d
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "unexpected end of stream"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public flush()V
    .registers 2

    iget-boolean v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$づざかべべ;->くし〴〺ぅ:Z

    if-eqz v0, :cond_5

    return-void

    :cond_5
    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$づざかべべ;->づざかべべ:L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;

    iget-object v0, v0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->びぐびあび:Lぺぁあねじ/なぎぱいぢぎ;

    invoke-interface {v0}, Lぺぁあねじ/なぎぱいぢぎ;->flush()V

    return-void
.end method

.method public 〺つふすそ()Lぺぁあねじ/〻ぞまぎな〻;
    .registers 2

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$づざかべべ;->〺つふすそ:Lぺぁあねじ/ぺふねづ〺;

    return-object v0
.end method

.method public びぐびあび(Lぺぁあねじ/づざかべべ;J)V
    .registers 11

    iget-boolean v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$づざかべべ;->くし〴〺ぅ:Z

    if-nez v0, :cond_3c

    .line 1
    iget-wide v1, p1, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    const-wide/16 v3, 0x0

    move-wide v5, p2

    .line 2
    invoke-static/range {v1 .. v6}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->びぐびあび(JJJ)V

    iget-wide v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$づざかべべ;->びぐびあび:J

    cmp-long v2, p2, v0

    if-gtz v2, :cond_1f

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$づざかべべ;->づざかべべ:L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;

    iget-object v0, v0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ;->びぐびあび:Lぺぁあねじ/なぎぱいぢぎ;

    invoke-interface {v0, p1, p2, p3}, Lぺぁあねじ/でどあくず;->びぐびあび(Lぺぁあねじ/づざかべべ;J)V

    iget-wide v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$づざかべべ;->びぐびあび:J

    sub-long/2addr v0, p2

    iput-wide v0, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$づざかべべ;->びぐびあび:J

    return-void

    :cond_1f
    new-instance p1, Ljava/net/ProtocolException;

    const-string v0, "expected "

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, L〳ぜぞぜべっ/ぉひのべい/〳ぜぞぜべっ/げつ〴ぬぐ$づざかべべ;->びぐびあび:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " bytes but received "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3c
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
