.class public Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->なぎぱいぢぎ()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;


# direct methods
.method public constructor <init>(Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;)V
    .registers 2

    iput-object p1, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$げつ〴ぬぐ;->〺つふすそ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 6

    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$げつ〴ぬぐ;->〺つふすそ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;

    iget v1, v0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぁごぐすすぃ:I

    if-nez v1, :cond_7

    return-void

    :cond_7
    const/4 v1, 0x2

    iput v1, v0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぁごぐすすぃ:I

    sget-boolean v1, Landroid/support/v4/media/MediaBrowserCompat;->〺つふすそ:Z

    if-eqz v1, :cond_2a

    iget-object v1, v0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->〳ぜぞぜべっ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;

    if-nez v1, :cond_13

    goto :goto_2a

    :cond_13
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "mServiceConnection should be null. Instead it is "

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$げつ〴ぬぐ;->〺つふすそ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;

    iget-object v2, v2, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->〳ぜぞぜべっ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2a
    :goto_2a
    iget-object v1, v0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぺぁあねじ:Landroid/support/v4/media/MediaBrowserCompat$ぺぁあねじ;

    if-nez v1, :cond_93

    iget-object v0, v0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->いいにぽつ:Landroid/os/Messenger;

    if-nez v0, :cond_7c

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.media.browse.MediaBrowserService"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$げつ〴ぬぐ;->〺つふすそ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;

    iget-object v1, v1, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->〺つふすそ:Landroid/content/ComponentName;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    iget-object v1, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$げつ〴ぬぐ;->〺つふすそ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;

    new-instance v2, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;

    invoke-direct {v2, v1}, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;-><init>(Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;)V

    iput-object v2, v1, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->〳ぜぞぜべっ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;

    const/4 v3, 0x0

    :try_start_4a
    iget-object v1, v1, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->げつ〴ぬぐ:Landroid/content/Context;

    const/4 v4, 0x1

    invoke-virtual {v1, v0, v2, v4}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v3
    :try_end_51
    .catch Ljava/lang/Exception; {:try_start_4a .. :try_end_51} :catch_52

    goto :goto_62

    :catch_52
    const-string v0, "Failed binding to service "

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$げつ〴ぬぐ;->〺つふすそ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;

    iget-object v1, v1, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->〺つふすそ:Landroid/content/ComponentName;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    :goto_62
    if-nez v3, :cond_72

    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$げつ〴ぬぐ;->〺つふすそ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;

    invoke-virtual {v0}, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->〳ぜぞぜべっ()V

    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$げつ〴ぬぐ;->〺つふすそ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;

    iget-object v0, v0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->くし〴〺ぅ:Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ;

    check-cast v0, Landroidx/media/session/MediaButtonReceiver$げつ〴ぬぐ;

    .line 1
    invoke-virtual {v0}, Landroidx/media/session/MediaButtonReceiver$げつ〴ぬぐ;->〺つふすそ()V

    .line 2
    :cond_72
    sget-boolean v0, Landroid/support/v4/media/MediaBrowserCompat;->〺つふすそ:Z

    if-eqz v0, :cond_7b

    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$げつ〴ぬぐ;->〺つふすそ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;

    invoke-virtual {v0}, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぁごぐすすぃ()V

    :cond_7b
    return-void

    :cond_7c
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "mCallbacksMessenger should be null. Instead it is "

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$げつ〴ぬぐ;->〺つふすそ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;

    iget-object v2, v2, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->いいにぽつ:Landroid/os/Messenger;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_93
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "mServiceBinderWrapper should be null. Instead it is "

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$げつ〴ぬぐ;->〺つふすそ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;

    iget-object v2, v2, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぺぁあねじ:Landroid/support/v4/media/MediaBrowserCompat$ぺぁあねじ;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
