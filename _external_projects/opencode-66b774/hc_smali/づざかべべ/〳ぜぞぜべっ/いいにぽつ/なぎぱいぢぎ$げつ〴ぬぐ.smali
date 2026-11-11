.class public Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/なぎぱいぢぎ$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/なぎぱいぢぎ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/なぎぱいぢぎ;


# direct methods
.method public constructor <init>(Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/なぎぱいぢぎ;)V
    .registers 2

    iput-object p1, p0, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/なぎぱいぢぎ$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/なぎぱいぢぎ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .registers 7

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-eqz v0, :cond_2e

    if-eq v0, v1, :cond_8

    return v1

    :cond_8
    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/なぎぱいぢぎ$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/なぎぱいぢぎ;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Runnable;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    iget-object p1, v0, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/なぎぱいぢぎ;->げつ〴ぬぐ:Ljava/lang/Object;

    monitor-enter p1

    :try_start_17
    iget-object v2, v0, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/なぎぱいぢぎ;->くし〴〺ぅ:Landroid/os/Handler;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeMessages(I)V

    iget-object v0, v0, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/なぎぱいぢぎ;->くし〴〺ぅ:Landroid/os/Handler;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    const/16 v3, 0x2710

    int-to-long v3, v3

    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    monitor-exit p1

    return v1

    :catchall_2b
    move-exception v0

    monitor-exit p1
    :try_end_2d
    .catchall {:try_start_17 .. :try_end_2d} :catchall_2b

    throw v0

    .line 2
    :cond_2e
    iget-object p1, p0, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/なぎぱいぢぎ$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/なぎぱいぢぎ;

    .line 3
    iget-object v0, p1, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/なぎぱいぢぎ;->げつ〴ぬぐ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_33
    iget-object v2, p1, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/なぎぱいぢぎ;->くし〴〺ぅ:Landroid/os/Handler;

    invoke-virtual {v2, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v2

    if-eqz v2, :cond_3d

    :goto_3b
    monitor-exit v0

    goto :goto_48

    :cond_3d
    iget-object v2, p1, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/なぎぱいぢぎ;->〺つふすそ:Landroid/os/HandlerThread;

    invoke-virtual {v2}, Landroid/os/HandlerThread;->quit()Z

    const/4 v2, 0x0

    iput-object v2, p1, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/なぎぱいぢぎ;->〺つふすそ:Landroid/os/HandlerThread;

    iput-object v2, p1, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/なぎぱいぢぎ;->くし〴〺ぅ:Landroid/os/Handler;

    goto :goto_3b

    :goto_48
    return v1

    :catchall_49
    move-exception p1

    monitor-exit v0
    :try_end_4b
    .catchall {:try_start_33 .. :try_end_4b} :catchall_49

    goto :goto_4d

    :goto_4c
    throw p1

    :goto_4d
    goto :goto_4c
.end method
