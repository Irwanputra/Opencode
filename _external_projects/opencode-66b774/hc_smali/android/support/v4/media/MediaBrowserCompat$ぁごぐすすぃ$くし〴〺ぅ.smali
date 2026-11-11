.class public Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u304f\u3057\u3034\u303a\u3045"
.end annotation


# instance fields
.field public final synthetic げつ〴ぬぐ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;


# direct methods
.method public constructor <init>(Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;)V
    .registers 2

    iput-object p1, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;->げつ〴ぬぐ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .registers 4

    new-instance v0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ$げつ〴ぬぐ;

    invoke-direct {v0, p0, p1, p2}, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ$げつ〴ぬぐ;-><init>(Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;Landroid/content/ComponentName;Landroid/os/IBinder;)V

    invoke-virtual {p0, v0}, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;->〺つふすそ(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .registers 3

    new-instance v0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ$〺つふすそ;

    invoke-direct {v0, p0, p1}, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ$〺つふすそ;-><init>(Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;Landroid/content/ComponentName;)V

    invoke-virtual {p0, v0}, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;->〺つふすそ(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final 〺つふすそ(Ljava/lang/Runnable;)V
    .registers 4

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;->げつ〴ぬぐ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;

    iget-object v1, v1, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->づざかべべ:Landroid/support/v4/media/MediaBrowserCompat$げつ〴ぬぐ;

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_16

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    goto :goto_1d

    :cond_16
    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;->げつ〴ぬぐ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;

    iget-object v0, v0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->づざかべべ:Landroid/support/v4/media/MediaBrowserCompat$げつ〴ぬぐ;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_1d
    return-void
.end method

.method public げつ〴ぬぐ(Ljava/lang/String;)Z
    .registers 5

    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;->げつ〴ぬぐ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;

    iget-object v1, v0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->〳ぜぞぜべっ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;

    const/4 v2, 0x1

    if-ne v1, p0, :cond_f

    iget v1, v0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぁごぐすすぃ:I

    if-eqz v1, :cond_f

    if-ne v1, v2, :cond_e

    goto :goto_f

    :cond_e
    return v2

    :cond_f
    :goto_f
    iget v0, v0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぁごぐすすぃ:I

    if-eqz v0, :cond_39

    if-eq v0, v2, :cond_39

    const-string v0, " for "

    invoke-static {p1, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->いいにぽつ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;->げつ〴ぬぐ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;

    iget-object v0, v0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->〺つふすそ:Landroid/content/ComponentName;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " with mServiceConnection="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;->げつ〴ぬぐ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;

    iget-object v0, v0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->〳ぜぞぜべっ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " this="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    :cond_39
    const/4 p1, 0x0

    return p1
.end method
