.class public Landroidx/media/session/MediaButtonReceiver$げつ〴ぬぐ;
.super Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media/session/MediaButtonReceiver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public final くし〴〺ぅ:Landroid/content/Context;

.field public final づざかべべ:Landroid/content/BroadcastReceiver$PendingResult;

.field public なぎぱいぢぎ:Landroid/support/v4/media/MediaBrowserCompat;

.field public final びぐびあび:Landroid/content/Intent;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/Intent;Landroid/content/BroadcastReceiver$PendingResult;)V
    .registers 4

    invoke-direct {p0}, Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ;-><init>()V

    iput-object p1, p0, Landroidx/media/session/MediaButtonReceiver$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/content/Context;

    iput-object p2, p0, Landroidx/media/session/MediaButtonReceiver$げつ〴ぬぐ;->びぐびあび:Landroid/content/Intent;

    iput-object p3, p0, Landroidx/media/session/MediaButtonReceiver$げつ〴ぬぐ;->づざかべべ:Landroid/content/BroadcastReceiver$PendingResult;

    return-void
.end method


# virtual methods
.method public final 〺つふすそ()V
    .registers 2

    iget-object v0, p0, Landroidx/media/session/MediaButtonReceiver$げつ〴ぬぐ;->なぎぱいぢぎ:Landroid/support/v4/media/MediaBrowserCompat;

    .line 1
    iget-object v0, v0, Landroid/support/v4/media/MediaBrowserCompat;->げつ〴ぬぐ:Landroid/support/v4/media/MediaBrowserCompat$くし〴〺ぅ;

    invoke-interface {v0}, Landroid/support/v4/media/MediaBrowserCompat$くし〴〺ぅ;->づざかべべ()V

    .line 2
    iget-object v0, p0, Landroidx/media/session/MediaButtonReceiver$げつ〴ぬぐ;->づざかべべ:Landroid/content/BroadcastReceiver$PendingResult;

    invoke-virtual {v0}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    return-void
.end method

.method public げつ〴ぬぐ()V
    .registers 5

    :try_start_0
    iget-object v0, p0, Landroidx/media/session/MediaButtonReceiver$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/content/Context;

    iget-object v1, p0, Landroidx/media/session/MediaButtonReceiver$げつ〴ぬぐ;->なぎぱいぢぎ:Landroid/support/v4/media/MediaBrowserCompat;

    .line 1
    iget-object v1, v1, Landroid/support/v4/media/MediaBrowserCompat;->げつ〴ぬぐ:Landroid/support/v4/media/MediaBrowserCompat$くし〴〺ぅ;

    invoke-interface {v1}, Landroid/support/v4/media/MediaBrowserCompat$くし〴〺ぅ;->〺つふすそ()Landroid/support/v4/media/session/MediaSessionCompat$Token;

    move-result-object v1

    .line 2
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    if-eqz v1, :cond_4e

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x18

    if-lt v2, v3, :cond_1d

    new-instance v2, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/なぎぱいぢぎ;

    invoke-direct {v2, v0, v1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/なぎぱいぢぎ;-><init>(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    goto :goto_36

    :cond_1d
    const/16 v3, 0x17

    if-lt v2, v3, :cond_27

    new-instance v2, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/づざかべべ;

    invoke-direct {v2, v0, v1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/づざかべべ;-><init>(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    goto :goto_36

    :cond_27
    const/16 v3, 0x15

    if-lt v2, v3, :cond_31

    new-instance v2, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;

    invoke-direct {v2, v0, v1}, Landroid/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;-><init>(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    goto :goto_36

    :cond_31
    new-instance v2, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぁごぐすすぃ;

    invoke-direct {v2, v1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぁごぐすすぃ;-><init>(Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    .line 3
    :goto_36
    iget-object v0, p0, Landroidx/media/session/MediaButtonReceiver$げつ〴ぬぐ;->びぐびあび:Landroid/content/Intent;

    const-string v1, "android.intent.extra.KEY_EVENT"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/view/KeyEvent;

    if-eqz v0, :cond_46

    .line 4
    invoke-interface {v2, v0}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/びぐびあび;->げつ〴ぬぐ(Landroid/view/KeyEvent;)Z

    goto :goto_56

    :cond_46
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "KeyEvent may not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 5
    :cond_4e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "sessionToken must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_56
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_56} :catch_56

    .line 6
    :catch_56
    :goto_56
    invoke-virtual {p0}, Landroidx/media/session/MediaButtonReceiver$げつ〴ぬぐ;->〺つふすそ()V

    return-void
.end method
