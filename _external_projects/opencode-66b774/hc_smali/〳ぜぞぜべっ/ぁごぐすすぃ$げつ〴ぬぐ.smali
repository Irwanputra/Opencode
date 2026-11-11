.class public L〳ぜぞぜべっ/ぁごぐすすぃ$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L〳ぜぞぜべっ/ぁごぐすすぃ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:L〳ぜぞぜべっ/ぁごぐすすぃ;


# direct methods
.method public constructor <init>(L〳ぜぞぜべっ/ぁごぐすすぃ;)V
    .registers 2

    iput-object p1, p0, L〳ぜぞぜべっ/ぁごぐすすぃ$げつ〴ぬぐ;->〺つふすそ:L〳ぜぞぜべっ/ぁごぐすすぃ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 15

    :cond_0
    :goto_0
    iget-object v0, p0, L〳ぜぞぜべっ/ぁごぐすすぃ$げつ〴ぬぐ;->〺つふすそ:L〳ぜぞぜべっ/ぁごぐすすぃ;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    .line 1
    monitor-enter v0

    :try_start_7
    iget-object v3, v0, L〳ぜぞぜべっ/ぁごぐすすぃ;->びぐびあび:Ljava/util/Deque;

    invoke-interface {v3}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    const-wide/high16 v5, -0x8000000000000000L

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    :cond_13
    :goto_13
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_35

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;

    invoke-virtual {v0, v10, v1, v2}, L〳ぜぞぜべっ/ぁごぐすすぃ;->げつ〴ぬぐ(L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;J)I

    move-result v11

    if-lez v11, :cond_28

    add-int/lit8 v9, v9, 0x1

    goto :goto_13

    :cond_28
    add-int/lit8 v8, v8, 0x1

    iget-wide v11, v10, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->おぐぴう〸ず:J

    sub-long v11, v1, v11

    cmp-long v13, v11, v5

    if-lez v13, :cond_13

    move-object v4, v10

    move-wide v5, v11

    goto :goto_13

    :cond_35
    iget-wide v1, v0, L〳ぜぞぜべっ/ぁごぐすすぃ;->〺つふすそ:J

    const-wide/16 v10, -0x1

    const-wide/16 v12, 0x0

    cmp-long v3, v5, v1

    if-gez v3, :cond_52

    iget v3, v0, L〳ぜぞぜべっ/ぁごぐすすぃ;->げつ〴ぬぐ:I

    if-le v8, v3, :cond_44

    goto :goto_52

    :cond_44
    if-lez v8, :cond_49

    sub-long/2addr v1, v5

    monitor-exit v0

    goto :goto_5e

    :cond_49
    if-lez v9, :cond_4d

    monitor-exit v0

    goto :goto_5e

    :cond_4d
    iput-boolean v7, v0, L〳ぜぞぜべっ/ぁごぐすすぃ;->なぎぱいぢぎ:Z

    monitor-exit v0

    move-wide v1, v10

    goto :goto_5e

    :cond_52
    :goto_52
    iget-object v1, v0, L〳ぜぞぜべっ/ぁごぐすすぃ;->びぐびあび:Ljava/util/Deque;

    invoke-interface {v1, v4}, Ljava/util/Deque;->remove(Ljava/lang/Object;)Z

    monitor-exit v0
    :try_end_58
    .catchall {:try_start_7 .. :try_end_58} :catchall_7f

    .line 2
    iget-object v0, v4, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->づざかべべ:Ljava/net/Socket;

    .line 3
    invoke-static {v0}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->なぎぱいぢぎ(Ljava/net/Socket;)V

    move-wide v1, v12

    :goto_5e
    cmp-long v0, v1, v10

    if-nez v0, :cond_63

    return-void

    :cond_63
    cmp-long v0, v1, v12

    if-lez v0, :cond_0

    const-wide/32 v3, 0xf4240

    .line 4
    div-long v5, v1, v3

    mul-long v3, v3, v5

    sub-long/2addr v1, v3

    iget-object v0, p0, L〳ぜぞぜべっ/ぁごぐすすぃ$げつ〴ぬぐ;->〺つふすそ:L〳ぜぞぜべっ/ぁごぐすすぃ;

    monitor-enter v0

    :try_start_72
    iget-object v3, p0, L〳ぜぞぜべっ/ぁごぐすすぃ$げつ〴ぬぐ;->〺つふすそ:L〳ぜぞぜべっ/ぁごぐすすぃ;

    long-to-int v2, v1

    invoke-virtual {v3, v5, v6, v2}, Ljava/lang/Object;->wait(JI)V
    :try_end_78
    .catch Ljava/lang/InterruptedException; {:try_start_72 .. :try_end_78} :catch_7b
    .catchall {:try_start_72 .. :try_end_78} :catchall_79

    goto :goto_7b

    :catchall_79
    move-exception v1

    goto :goto_7d

    :catch_7b
    :goto_7b
    :try_start_7b
    monitor-exit v0

    goto :goto_0

    :goto_7d
    monitor-exit v0
    :try_end_7e
    .catchall {:try_start_7b .. :try_end_7e} :catchall_79

    throw v1

    :catchall_7f
    move-exception v1

    .line 5
    :try_start_80
    monitor-exit v0
    :try_end_81
    .catchall {:try_start_80 .. :try_end_81} :catchall_7f

    goto :goto_83

    :goto_82
    throw v1

    :goto_83
    goto :goto_82
.end method
