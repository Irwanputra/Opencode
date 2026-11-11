.class public Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;
.super Landroid/media/browse/MediaBrowser$ConnectionCallback;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "L\u3073\u3050\u3073\u3042\u3073/\u3052\u3064\u3034\u306c\u3050/\u3052\u3064\u3034\u306c\u3050/\u3052\u3064\u3034\u306c\u3050/\u3052\u3064\u3034\u306c\u3050;",
        ">",
        "Landroid/media/browse/MediaBrowser$ConnectionCallback;"
    }
.end annotation


# instance fields
.field public final げつ〴ぬぐ:Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Landroid/media/browse/MediaBrowser$ConnectionCallback;-><init>()V

    iput-object p1, p0, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ:Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;

    return-void
.end method


# virtual methods
.method public onConnected()V
    .registers 9

    iget-object v0, p0, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ:Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;

    check-cast v0, Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ$〺つふすそ;

    .line 1
    iget-object v1, v0, Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ$〺つふすそ;->げつ〴ぬぐ:Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ;

    iget-object v1, v1, Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ;->〺つふすそ:Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ$げつ〴ぬぐ;

    if-eqz v1, :cond_7a

    check-cast v1, Landroid/support/v4/media/MediaBrowserCompat$びぐびあび;

    .line 2
    iget-object v2, v1, Landroid/support/v4/media/MediaBrowserCompat$びぐびあび;->〺つふすそ:Ljava/lang/Object;

    .line 3
    check-cast v2, Landroid/media/browse/MediaBrowser;

    invoke-virtual {v2}, Landroid/media/browse/MediaBrowser;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    if-nez v2, :cond_17

    goto :goto_7a

    :cond_17
    const/4 v3, 0x0

    const-string v4, "extra_service_version"

    .line 4
    invoke-virtual {v2, v4, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    const-string v3, "extra_messenger"

    invoke-static {v2, v3}, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/なぎぱいぢぎ;->げつ〴ぬぐ(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v3

    if-eqz v3, :cond_60

    new-instance v4, Landroid/support/v4/media/MediaBrowserCompat$ぺぁあねじ;

    iget-object v5, v1, Landroid/support/v4/media/MediaBrowserCompat$びぐびあび;->くし〴〺ぅ:Landroid/os/Bundle;

    invoke-direct {v4, v3, v5}, Landroid/support/v4/media/MediaBrowserCompat$ぺぁあねじ;-><init>(Landroid/os/IBinder;Landroid/os/Bundle;)V

    iput-object v4, v1, Landroid/support/v4/media/MediaBrowserCompat$びぐびあび;->なぎぱいぢぎ:Landroid/support/v4/media/MediaBrowserCompat$ぺぁあねじ;

    new-instance v3, Landroid/os/Messenger;

    iget-object v4, v1, Landroid/support/v4/media/MediaBrowserCompat$びぐびあび;->びぐびあび:Landroid/support/v4/media/MediaBrowserCompat$げつ〴ぬぐ;

    invoke-direct {v3, v4}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    iput-object v3, v1, Landroid/support/v4/media/MediaBrowserCompat$びぐびあび;->ぁごぐすすぃ:Landroid/os/Messenger;

    iget-object v4, v1, Landroid/support/v4/media/MediaBrowserCompat$びぐびあび;->びぐびあび:Landroid/support/v4/media/MediaBrowserCompat$げつ〴ぬぐ;

    invoke-virtual {v4, v3}, Landroid/support/v4/media/MediaBrowserCompat$げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/os/Messenger;)V

    :try_start_3c
    iget-object v3, v1, Landroid/support/v4/media/MediaBrowserCompat$びぐびあび;->なぎぱいぢぎ:Landroid/support/v4/media/MediaBrowserCompat$ぺぁあねじ;

    iget-object v4, v1, Landroid/support/v4/media/MediaBrowserCompat$びぐびあび;->げつ〴ぬぐ:Landroid/content/Context;

    iget-object v5, v1, Landroid/support/v4/media/MediaBrowserCompat$びぐびあび;->ぁごぐすすぃ:Landroid/os/Messenger;

    .line 5
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    const-string v7, "data_package_name"

    invoke-virtual {v6, v7, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v4, v3, Landroid/support/v4/media/MediaBrowserCompat$ぺぁあねじ;->〺つふすそ:Landroid/os/Bundle;

    const-string v7, "data_root_hints"

    invoke-virtual {v6, v7, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    const/4 v4, 0x6

    invoke-virtual {v3, v4, v6, v5}, Landroid/support/v4/media/MediaBrowserCompat$ぺぁあねじ;->げつ〴ぬぐ(ILandroid/os/Bundle;Landroid/os/Messenger;)V
    :try_end_5e
    .catch Landroid/os/RemoteException; {:try_start_3c .. :try_end_5e} :catch_5f

    goto :goto_60

    :catch_5f
    nop

    :cond_60
    :goto_60
    const-string v3, "extra_session_binder"

    .line 6
    invoke-static {v2, v3}, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/なぎぱいぢぎ;->げつ〴ぬぐ(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v2

    invoke-static {v2}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/〺つふすそ$げつ〴ぬぐ;->〺つふすそ(Landroid/os/IBinder;)Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/〺つふすそ;

    move-result-object v2

    if-eqz v2, :cond_7a

    iget-object v3, v1, Landroid/support/v4/media/MediaBrowserCompat$びぐびあび;->〺つふすそ:Ljava/lang/Object;

    .line 7
    check-cast v3, Landroid/media/browse/MediaBrowser;

    invoke-virtual {v3}, Landroid/media/browse/MediaBrowser;->getSessionToken()Landroid/media/session/MediaSession$Token;

    move-result-object v3

    .line 8
    invoke-static {v3, v2}, Landroid/support/v4/media/session/MediaSessionCompat$Token;->なぎぱいぢぎ(Ljava/lang/Object;Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/〺つふすそ;)Landroid/support/v4/media/session/MediaSessionCompat$Token;

    move-result-object v2

    iput-object v2, v1, Landroid/support/v4/media/MediaBrowserCompat$びぐびあび;->〳ぜぞぜべっ:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 9
    :cond_7a
    :goto_7a
    iget-object v0, v0, Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ$〺つふすそ;->げつ〴ぬぐ:Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ;

    invoke-virtual {v0}, Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ;->げつ〴ぬぐ()V

    return-void
.end method

.method public onConnectionFailed()V
    .registers 3

    iget-object v0, p0, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ:Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;

    check-cast v0, Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ$〺つふすそ;

    .line 1
    iget-object v0, v0, Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ$〺つふすそ;->げつ〴ぬぐ:Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ;

    iget-object v1, v0, Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ;->〺つふすそ:Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ$げつ〴ぬぐ;

    if-eqz v1, :cond_c

    check-cast v1, Landroid/support/v4/media/MediaBrowserCompat$びぐびあび;

    :cond_c
    check-cast v0, Landroidx/media/session/MediaButtonReceiver$げつ〴ぬぐ;

    .line 2
    invoke-virtual {v0}, Landroidx/media/session/MediaButtonReceiver$げつ〴ぬぐ;->〺つふすそ()V

    return-void
.end method

.method public onConnectionSuspended()V
    .registers 4

    iget-object v0, p0, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ:Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;

    check-cast v0, Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ$〺つふすそ;

    .line 1
    iget-object v1, v0, Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ$〺つふすそ;->げつ〴ぬぐ:Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ;

    iget-object v1, v1, Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ;->〺つふすそ:Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ$げつ〴ぬぐ;

    if-eqz v1, :cond_18

    check-cast v1, Landroid/support/v4/media/MediaBrowserCompat$びぐびあび;

    const/4 v2, 0x0

    .line 2
    iput-object v2, v1, Landroid/support/v4/media/MediaBrowserCompat$びぐびあび;->なぎぱいぢぎ:Landroid/support/v4/media/MediaBrowserCompat$ぺぁあねじ;

    iput-object v2, v1, Landroid/support/v4/media/MediaBrowserCompat$びぐびあび;->ぁごぐすすぃ:Landroid/os/Messenger;

    iput-object v2, v1, Landroid/support/v4/media/MediaBrowserCompat$びぐびあび;->〳ぜぞぜべっ:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    iget-object v1, v1, Landroid/support/v4/media/MediaBrowserCompat$びぐびあび;->びぐびあび:Landroid/support/v4/media/MediaBrowserCompat$げつ〴ぬぐ;

    invoke-virtual {v1, v2}, Landroid/support/v4/media/MediaBrowserCompat$げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/os/Messenger;)V

    .line 3
    :cond_18
    iget-object v0, v0, Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ$〺つふすそ;->げつ〴ぬぐ:Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ;

    check-cast v0, Landroidx/media/session/MediaButtonReceiver$げつ〴ぬぐ;

    .line 4
    invoke-virtual {v0}, Landroidx/media/session/MediaButtonReceiver$げつ〴ぬぐ;->〺つふすそ()V

    return-void
.end method
