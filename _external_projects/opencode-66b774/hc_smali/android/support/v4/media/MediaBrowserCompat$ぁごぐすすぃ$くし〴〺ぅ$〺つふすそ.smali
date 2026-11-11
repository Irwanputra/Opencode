.class public Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ$〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;->onServiceDisconnected(Landroid/content/ComponentName;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Landroid/content/ComponentName;

.field public final synthetic くし〴〺ぅ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;


# direct methods
.method public constructor <init>(Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;Landroid/content/ComponentName;)V
    .registers 3

    iput-object p1, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ$〺つふすそ;->くし〴〺ぅ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;

    iput-object p2, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ$〺つふすそ;->〺つふすそ:Landroid/content/ComponentName;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 3

    sget-boolean v0, Landroid/support/v4/media/MediaBrowserCompat;->〺つふすそ:Z

    if-eqz v0, :cond_2f

    const-string v0, "MediaServiceConnection.onServiceDisconnected name="

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ$〺つふすそ;->〺つふすそ:Landroid/content/ComponentName;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " this="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " mServiceConnection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ$〺つふすそ;->くし〴〺ぅ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;

    iget-object v1, v1, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;->げつ〴ぬぐ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;

    iget-object v1, v1, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->〳ぜぞぜべっ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ$〺つふすそ;->くし〴〺ぅ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;

    iget-object v0, v0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;->げつ〴ぬぐ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;

    invoke-virtual {v0}, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぁごぐすすぃ()V

    :cond_2f
    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ$〺つふすそ;->くし〴〺ぅ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;

    const-string v1, "onServiceDisconnected"

    invoke-virtual {v0, v1}, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;->げつ〴ぬぐ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3a

    return-void

    :cond_3a
    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ$〺つふすそ;->くし〴〺ぅ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;

    iget-object v0, v0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;->げつ〴ぬぐ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;

    const/4 v1, 0x0

    iput-object v1, v0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぺぁあねじ:Landroid/support/v4/media/MediaBrowserCompat$ぺぁあねじ;

    iput-object v1, v0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->いいにぽつ:Landroid/os/Messenger;

    iget-object v0, v0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->づざかべべ:Landroid/support/v4/media/MediaBrowserCompat$げつ〴ぬぐ;

    invoke-virtual {v0, v1}, Landroid/support/v4/media/MediaBrowserCompat$げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/os/Messenger;)V

    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ$〺つふすそ;->くし〴〺ぅ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;

    iget-object v0, v0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;->げつ〴ぬぐ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;

    const/4 v1, 0x4

    iput v1, v0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぁごぐすすぃ:I

    iget-object v0, v0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->くし〴〺ぅ:Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ;

    check-cast v0, Landroidx/media/session/MediaButtonReceiver$げつ〴ぬぐ;

    .line 1
    invoke-virtual {v0}, Landroidx/media/session/MediaButtonReceiver$げつ〴ぬぐ;->〺つふすそ()V

    return-void
.end method
