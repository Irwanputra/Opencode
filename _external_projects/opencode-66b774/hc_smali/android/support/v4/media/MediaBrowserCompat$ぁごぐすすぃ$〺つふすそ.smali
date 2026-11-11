.class public Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->づざかべべ()V
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

    iput-object p1, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$〺つふすそ;->〺つふすそ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 5

    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$〺つふすそ;->〺つふすそ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;

    iget-object v1, v0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->いいにぽつ:Landroid/os/Messenger;

    if-eqz v1, :cond_1e

    :try_start_6
    iget-object v0, v0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぺぁあねじ:Landroid/support/v4/media/MediaBrowserCompat$ぺぁあねじ;

    const/4 v2, 0x2

    const/4 v3, 0x0

    .line 1
    invoke-virtual {v0, v2, v3, v1}, Landroid/support/v4/media/MediaBrowserCompat$ぺぁあねじ;->げつ〴ぬぐ(ILandroid/os/Bundle;Landroid/os/Messenger;)V
    :try_end_d
    .catch Landroid/os/RemoteException; {:try_start_6 .. :try_end_d} :catch_e

    goto :goto_1e

    :catch_e
    const-string v0, "RemoteException during connect for "

    .line 2
    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$〺つふすそ;->〺つふすそ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;

    iget-object v1, v1, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->〺つふすそ:Landroid/content/ComponentName;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    :cond_1e
    :goto_1e
    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$〺つふすそ;->〺つふすそ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;

    iget v1, v0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぁごぐすすぃ:I

    invoke-virtual {v0}, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->〳ぜぞぜべっ()V

    if-eqz v1, :cond_2b

    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$〺つふすそ;->〺つふすそ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;

    iput v1, v0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぁごぐすすぃ:I

    :cond_2b
    sget-boolean v0, Landroid/support/v4/media/MediaBrowserCompat;->〺つふすそ:Z

    if-eqz v0, :cond_34

    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$〺つふすそ;->〺つふすそ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;

    invoke-virtual {v0}, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぁごぐすすぃ()V

    :cond_34
    return-void
.end method
