.class public Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/ぁごぐすすぃ;
.super Lぺぁあねじ/ぺぁあねじ;
.source ""


# instance fields
.field public くし〴〺ぅ:J

.field public final synthetic づざかべべ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〳ぜぞぜべっ;

.field public びぐびあび:J


# direct methods
.method public constructor <init>(Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〳ぜぞぜべっ;Lぺぁあねじ/でどあくず;)V
    .registers 3

    iput-object p1, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/ぁごぐすすぃ;->づざかべべ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〳ぜぞぜべっ;

    invoke-direct {p0, p2}, Lぺぁあねじ/ぺぁあねじ;-><init>(Lぺぁあねじ/でどあくず;)V

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/ぁごぐすすぃ;->くし〴〺ぅ:J

    iput-wide p1, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/ぁごぐすすぃ;->びぐびあび:J

    return-void
.end method


# virtual methods
.method public びぐびあび(Lぺぁあねじ/づざかべべ;J)V
    .registers 8

    .line 1
    iget-object v0, p0, Lぺぁあねじ/ぺぁあねじ;->〺つふすそ:Lぺぁあねじ/でどあくず;

    invoke-interface {v0, p1, p2, p3}, Lぺぁあねじ/でどあくず;->びぐびあび(Lぺぁあねじ/づざかべべ;J)V

    .line 2
    iget-wide v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/ぁごぐすすぃ;->びぐびあび:J

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-nez p1, :cond_15

    iget-object p1, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/ぁごぐすすぃ;->づざかべべ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〳ぜぞぜべっ;

    invoke-virtual {p1}, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〳ぜぞぜべっ;->げつ〴ぬぐ()J

    move-result-wide v0

    iput-wide v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/ぁごぐすすぃ;->びぐびあび:J

    :cond_15
    iget-wide v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/ぁごぐすすぃ;->くし〴〺ぅ:J

    add-long/2addr v0, p2

    iput-wide v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/ぁごぐすすぃ;->くし〴〺ぅ:J

    iget-object p1, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/ぁごぐすすぃ;->づざかべべ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〳ぜぞぜべっ;

    .line 3
    iget-object p1, p1, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〳ぜぞぜべっ;->くし〴〺ぅ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/ぺふねづ〺;

    if-eqz p1, :cond_2f

    const/4 p2, 0x1

    .line 4
    new-instance p3, Lなぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/くし〴〺ぅ;

    iget-wide v2, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/ぁごぐすすぃ;->びぐびあび:J

    invoke-direct {p3, v0, v1, v2, v3}, Lなぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/くし〴〺ぅ;-><init>(JJ)V

    invoke-virtual {p1, p2, p3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    :cond_2f
    return-void
.end method
