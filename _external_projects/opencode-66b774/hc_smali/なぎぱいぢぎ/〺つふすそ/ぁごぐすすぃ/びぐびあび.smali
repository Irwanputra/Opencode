.class public Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/びぐびあび;
.super Landroid/os/Handler;
.source ""


# instance fields
.field public final げつ〴ぬぐ:Lなぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ/びぐびあび;


# direct methods
.method public constructor <init>(Lなぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ/びぐびあび;)V
    .registers 3

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/びぐびあび;->げつ〴ぬぐ:Lなぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ/びぐびあび;

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .registers 7

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_9

    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    goto :goto_18

    :cond_9
    iget-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/びぐびあび;->げつ〴ぬぐ:Lなぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ/びぐびあび;

    if-eqz v0, :cond_18

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lなぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/くし〴〺ぅ;

    iget-wide v1, p1, Lなぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/くし〴〺ぅ;->〺つふすそ:J

    iget-wide v3, p1, Lなぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/くし〴〺ぅ;->くし〴〺ぅ:J

    invoke-interface {v0, v1, v2, v3, v4}, Lなぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ/びぐびあび;->げつ〴ぬぐ(JJ)V

    :cond_18
    :goto_18
    return-void
.end method
