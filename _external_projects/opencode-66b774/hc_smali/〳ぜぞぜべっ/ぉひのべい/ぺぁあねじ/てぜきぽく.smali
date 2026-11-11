.class public L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/てぜきぽく;
.super L〳ぜぞぜべっ/ぉひのべい/〺つふすそ;
.source ""


# instance fields
.field public final synthetic くし〴〺ぅ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

.field public final synthetic びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;


# direct methods
.method public varargs constructor <init>(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;Ljava/lang/String;[Ljava/lang/Object;L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;)V
    .registers 5

    iput-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/てぜきぽく;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;

    iput-object p4, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/てぜきぽく;->くし〴〺ぅ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

    invoke-direct {p0, p2, p3}, L〳ぜぞぜべっ/ぉひのべい/〺つふすそ;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ()V
    .registers 6

    :try_start_0
    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/てぜきぽく;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;

    iget-object v0, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    iget-object v0, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->くし〴〺ぅ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$びぐびあび;

    iget-object v1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/てぜきぽく;->くし〴〺ぅ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

    invoke-virtual {v0, v1}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$びぐびあび;->〺つふすそ(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;)V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_b} :catch_c

    goto :goto_2d

    :catch_c
    move-exception v0

    .line 1
    sget-object v1, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;

    const/4 v2, 0x4

    const-string v3, "Http2Connection.Listener failure for "

    .line 2
    invoke-static {v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/てぜきぽく;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;

    iget-object v4, v4, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$なぎぱいぢぎ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    iget-object v4, v4, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->づざかべべ:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3, v0}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;->ぺふねづ〺(ILjava/lang/String;Ljava/lang/Throwable;)V

    :try_start_26
    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/てぜきぽく;->くし〴〺ぅ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;

    sget-object v1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;

    invoke-virtual {v0, v1}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぇぬぎばつ;->くし〴〺ぅ(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;)V
    :try_end_2d
    .catch Ljava/io/IOException; {:try_start_26 .. :try_end_2d} :catch_2d

    :catch_2d
    :goto_2d
    return-void
.end method
