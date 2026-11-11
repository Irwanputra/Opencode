.class public Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;->onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Landroid/content/ComponentName;

.field public final synthetic くし〴〺ぅ:Landroid/os/IBinder;

.field public final synthetic びぐびあび:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;


# direct methods
.method public constructor <init>(Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .registers 4

    iput-object p1, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ$げつ〴ぬぐ;->びぐびあび:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;

    iput-object p2, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ$げつ〴ぬぐ;->〺つふすそ:Landroid/content/ComponentName;

    iput-object p3, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/os/IBinder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 6

    sget-boolean v0, Landroid/support/v4/media/MediaBrowserCompat;->〺つふすそ:Z

    if-eqz v0, :cond_23

    const-string v1, "MediaServiceConnection.onServiceConnected name="

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ$げつ〴ぬぐ;->〺つふすそ:Landroid/content/ComponentName;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " binder="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/os/IBinder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    iget-object v1, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ$げつ〴ぬぐ;->びぐびあび:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;

    iget-object v1, v1, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;->げつ〴ぬぐ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;

    invoke-virtual {v1}, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぁごぐすすぃ()V

    :cond_23
    iget-object v1, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ$げつ〴ぬぐ;->びぐびあび:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;

    const-string v2, "onServiceConnected"

    invoke-virtual {v1, v2}, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;->げつ〴ぬぐ(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2e

    return-void

    :cond_2e
    iget-object v1, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ$げつ〴ぬぐ;->びぐびあび:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;

    iget-object v1, v1, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;->げつ〴ぬぐ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;

    new-instance v2, Landroid/support/v4/media/MediaBrowserCompat$ぺぁあねじ;

    iget-object v3, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/os/IBinder;

    iget-object v4, v1, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->びぐびあび:Landroid/os/Bundle;

    invoke-direct {v2, v3, v4}, Landroid/support/v4/media/MediaBrowserCompat$ぺぁあねじ;-><init>(Landroid/os/IBinder;Landroid/os/Bundle;)V

    iput-object v2, v1, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぺぁあねじ:Landroid/support/v4/media/MediaBrowserCompat$ぺぁあねじ;

    iget-object v1, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ$げつ〴ぬぐ;->びぐびあび:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;

    iget-object v1, v1, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;->げつ〴ぬぐ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;

    new-instance v2, Landroid/os/Messenger;

    iget-object v3, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ$げつ〴ぬぐ;->びぐびあび:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;

    iget-object v3, v3, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;->げつ〴ぬぐ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;

    iget-object v3, v3, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->づざかべべ:Landroid/support/v4/media/MediaBrowserCompat$げつ〴ぬぐ;

    invoke-direct {v2, v3}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    iput-object v2, v1, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->いいにぽつ:Landroid/os/Messenger;

    iget-object v1, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ$げつ〴ぬぐ;->びぐびあび:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;

    iget-object v1, v1, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;->げつ〴ぬぐ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;

    iget-object v2, v1, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->づざかべべ:Landroid/support/v4/media/MediaBrowserCompat$げつ〴ぬぐ;

    iget-object v1, v1, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->いいにぽつ:Landroid/os/Messenger;

    invoke-virtual {v2, v1}, Landroid/support/v4/media/MediaBrowserCompat$げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/os/Messenger;)V

    iget-object v1, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ$げつ〴ぬぐ;->びぐびあび:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;

    iget-object v1, v1, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;->げつ〴ぬぐ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;

    const/4 v2, 0x2

    iput v2, v1, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぁごぐすすぃ:I

    if-eqz v0, :cond_65

    :try_start_62
    invoke-virtual {v1}, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぁごぐすすぃ()V

    :cond_65
    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ$げつ〴ぬぐ;->びぐびあび:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;

    iget-object v0, v0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;->げつ〴ぬぐ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;

    iget-object v1, v0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぺぁあねじ:Landroid/support/v4/media/MediaBrowserCompat$ぺぁあねじ;

    iget-object v2, v0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->げつ〴ぬぐ:Landroid/content/Context;

    iget-object v0, v0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->いいにぽつ:Landroid/os/Messenger;

    .line 1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const-string v4, "data_package_name"

    invoke-virtual {v3, v4, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, v1, Landroid/support/v4/media/MediaBrowserCompat$ぺぁあねじ;->〺つふすそ:Landroid/os/Bundle;

    const-string v4, "data_root_hints"

    invoke-virtual {v3, v4, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    const/4 v2, 0x1

    invoke-virtual {v1, v2, v3, v0}, Landroid/support/v4/media/MediaBrowserCompat$ぺぁあねじ;->げつ〴ぬぐ(ILandroid/os/Bundle;Landroid/os/Messenger;)V
    :try_end_8b
    .catch Landroid/os/RemoteException; {:try_start_62 .. :try_end_8b} :catch_8c

    goto :goto_aa

    :catch_8c
    nop

    const-string v0, "RemoteException during connect for "

    .line 2
    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ$げつ〴ぬぐ;->びぐびあび:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;

    iget-object v1, v1, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;->げつ〴ぬぐ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;

    iget-object v1, v1, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->〺つふすそ:Landroid/content/ComponentName;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    sget-boolean v0, Landroid/support/v4/media/MediaBrowserCompat;->〺つふすそ:Z

    if-eqz v0, :cond_aa

    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ$げつ〴ぬぐ;->びぐびあび:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;

    iget-object v0, v0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;->げつ〴ぬぐ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;

    invoke-virtual {v0}, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぁごぐすすぃ()V

    :cond_aa
    :goto_aa
    return-void
.end method
