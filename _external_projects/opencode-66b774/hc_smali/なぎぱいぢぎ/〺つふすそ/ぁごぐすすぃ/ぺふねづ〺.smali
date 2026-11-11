.class public Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/ぺふねづ〺;
.super Landroid/os/Handler;
.source ""


# instance fields
.field public final げつ〴ぬぐ:Lなぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ/ぁごぐすすぃ;


# direct methods
.method public constructor <init>(Lなぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ/ぁごぐすすぃ;)V
    .registers 3

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/ぺふねづ〺;->げつ〴ぬぐ:Lなぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ/ぁごぐすすぃ;

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .registers 9

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_9

    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    goto :goto_21

    :cond_9
    iget-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/ぺふねづ〺;->げつ〴ぬぐ:Lなぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ/ぁごぐすすぃ;

    if-eqz v0, :cond_21

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lなぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/くし〴〺ぅ;

    iget-wide v1, p1, Lなぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/くし〴〺ぅ;->〺つふすそ:J

    iget-wide v3, p1, Lなぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/くし〴〺ぅ;->くし〴〺ぅ:J

    check-cast v0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/くし〴〺ぅ;

    .line 1
    iget-object p1, v0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/くし〴〺ぅ;->げつ〴ぬぐ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;

    const-wide/16 v5, 0x64

    mul-long v1, v1, v5

    div-long/2addr v1, v3

    long-to-int v0, v1

    .line 2
    iput v0, p1, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->は〲ぱなで:I

    :cond_21
    :goto_21
    return-void
.end method
