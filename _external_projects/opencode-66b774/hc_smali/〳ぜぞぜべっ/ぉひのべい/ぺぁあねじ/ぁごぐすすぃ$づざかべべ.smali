.class public final L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$づざかべべ;
.super L〳ぜぞぜべっ/ぉひのべい/〺つふすそ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u3065\u3056\u304b\u3079\u3079"
.end annotation


# instance fields
.field public final くし〴〺ぅ:Z

.field public final づざかべべ:I

.field public final synthetic なぎぱいぢぎ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

.field public final びぐびあび:I


# direct methods
.method public constructor <init>(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;ZII)V
    .registers 7

    iput-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$づざかべべ;->なぎぱいぢぎ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    iget-object p1, p1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->づざかべべ:Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x1

    aput-object p1, v0, v1

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x2

    aput-object p1, v0, v1

    const-string p1, "OkHttp %s ping %08x%08x"

    invoke-direct {p0, p1, v0}, L〳ぜぞぜべっ/ぉひのべい/〺つふすそ;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    iput-boolean p2, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$づざかべべ;->くし〴〺ぅ:Z

    iput p3, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$づざかべべ;->びぐびあび:I

    iput p4, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$づざかべべ;->づざかべべ:I

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ()V
    .registers 8

    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$づざかべべ;->なぎぱいぢぎ:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;

    iget-boolean v1, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$づざかべべ;->くし〴〺ぅ:Z

    iget v2, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$づざかべべ;->びぐびあび:I

    iget v3, p0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ$づざかべべ;->づざかべべ:I

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;->びぐびあび:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;

    if-nez v1, :cond_1f

    monitor-enter v0

    :try_start_10
    iget-boolean v5, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->てぜきぽく:Z

    const/4 v6, 0x1

    iput-boolean v6, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->てぜきぽく:Z

    monitor-exit v0
    :try_end_16
    .catchall {:try_start_10 .. :try_end_16} :catchall_1c

    if-eqz v5, :cond_1f

    .line 2
    :catch_18
    :try_start_18
    invoke-virtual {v0, v4, v4}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->ぺづげぺが(L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/〺つふすそ;)V
    :try_end_1b
    .catch Ljava/io/IOException; {:try_start_18 .. :try_end_1b} :catch_24

    goto :goto_24

    :catchall_1c
    move-exception v1

    .line 3
    :try_start_1d
    monitor-exit v0
    :try_end_1e
    .catchall {:try_start_1d .. :try_end_1e} :catchall_1c

    throw v1

    :cond_1f
    :try_start_1f
    iget-object v5, v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぁごぐすすぃ;->は〲ぱなで:L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;

    invoke-virtual {v5, v1, v2, v3}, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/ぉざぅち〻;->けときぜと(ZII)V
    :try_end_24
    .catch Ljava/io/IOException; {:try_start_1f .. :try_end_24} :catch_18

    :catch_24
    :goto_24
    return-void
.end method
