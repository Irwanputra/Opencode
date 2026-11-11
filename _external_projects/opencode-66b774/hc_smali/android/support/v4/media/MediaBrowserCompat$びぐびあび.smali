.class public Landroid/support/v4/media/MediaBrowserCompat$びぐびあび;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/support/v4/media/MediaBrowserCompat$くし〴〺ぅ;
.implements Landroid/support/v4/media/MediaBrowserCompat$〳ぜぞぜべっ;
.implements Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ$げつ〴ぬぐ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/MediaBrowserCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3073\u3050\u3073\u3042\u3073"
.end annotation


# instance fields
.field public 〳ぜぞぜべっ:Landroid/support/v4/media/session/MediaSessionCompat$Token;

.field public final 〺つふすそ:Ljava/lang/Object;

.field public ぁごぐすすぃ:Landroid/os/Messenger;

.field public final くし〴〺ぅ:Landroid/os/Bundle;

.field public final げつ〴ぬぐ:Landroid/content/Context;

.field public final づざかべべ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u3065\u3056\u304b\u3079\u3079/\u3065\u3056\u304b\u3079\u3079/\u3052\u3064\u3034\u306c\u3050<",
            "Ljava/lang/String;",
            "Landroid/support/v4/media/MediaBrowserCompat$\u3044\u3044\u306b\u307d\u3064;",
            ">;"
        }
    .end annotation
.end field

.field public なぎぱいぢぎ:Landroid/support/v4/media/MediaBrowserCompat$ぺぁあねじ;

.field public final びぐびあび:Landroid/support/v4/media/MediaBrowserCompat$げつ〴ぬぐ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/ComponentName;Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ;Landroid/os/Bundle;)V
    .registers 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/support/v4/media/MediaBrowserCompat$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Landroid/support/v4/media/MediaBrowserCompat$げつ〴ぬぐ;-><init>(Landroid/support/v4/media/MediaBrowserCompat$〳ぜぞぜべっ;)V

    iput-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$びぐびあび;->びぐびあび:Landroid/support/v4/media/MediaBrowserCompat$げつ〴ぬぐ;

    new-instance v0, Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    invoke-direct {v0}, Lづざかべべ/づざかべべ/げつ〴ぬぐ;-><init>()V

    iput-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$びぐびあび;->づざかべべ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    iput-object p1, p0, Landroid/support/v4/media/MediaBrowserCompat$びぐびあび;->げつ〴ぬぐ:Landroid/content/Context;

    new-instance v0, Landroid/os/Bundle;

    if-eqz p4, :cond_1b

    invoke-direct {v0, p4}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    goto :goto_1e

    :cond_1b
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    :goto_1e
    iput-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$びぐびあび;->くし〴〺ぅ:Landroid/os/Bundle;

    const/4 p4, 0x1

    const-string v1, "extra_client_version"

    invoke-virtual {v0, v1, p4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1
    iput-object p0, p3, Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ;->〺つふすそ:Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ$げつ〴ぬぐ;

    .line 2
    iget-object p3, p3, Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ;->げつ〴ぬぐ:Ljava/lang/Object;

    .line 3
    new-instance p4, Landroid/media/browse/MediaBrowser;

    check-cast p3, Landroid/media/browse/MediaBrowser$ConnectionCallback;

    invoke-direct {p4, p1, p2, p3, v0}, Landroid/media/browse/MediaBrowser;-><init>(Landroid/content/Context;Landroid/content/ComponentName;Landroid/media/browse/MediaBrowser$ConnectionCallback;Landroid/os/Bundle;)V

    .line 4
    iput-object p4, p0, Landroid/support/v4/media/MediaBrowserCompat$びぐびあび;->〺つふすそ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public 〺つふすそ()Landroid/support/v4/media/session/MediaSessionCompat$Token;
    .registers 3

    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$びぐびあび;->〳ぜぞぜべっ:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    if-nez v0, :cond_13

    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$びぐびあび;->〺つふすそ:Ljava/lang/Object;

    .line 1
    check-cast v0, Landroid/media/browse/MediaBrowser;

    invoke-virtual {v0}, Landroid/media/browse/MediaBrowser;->getSessionToken()Landroid/media/session/MediaSession$Token;

    move-result-object v0

    const/4 v1, 0x0

    .line 2
    invoke-static {v0, v1}, Landroid/support/v4/media/session/MediaSessionCompat$Token;->なぎぱいぢぎ(Ljava/lang/Object;Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/〺つふすそ;)Landroid/support/v4/media/session/MediaSessionCompat$Token;

    move-result-object v0

    .line 3
    iput-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$びぐびあび;->〳ぜぞぜべっ:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    :cond_13
    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$びぐびあび;->〳ぜぞぜべっ:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    return-object v0
.end method

.method public くし〴〺ぅ(Landroid/os/Messenger;Ljava/lang/String;Landroid/support/v4/media/session/MediaSessionCompat$Token;Landroid/os/Bundle;)V
    .registers 5

    return-void
.end method

.method public げつ〴ぬぐ(Landroid/os/Messenger;)V
    .registers 2

    return-void
.end method

.method public づざかべべ()V
    .registers 5

    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$びぐびあび;->なぎぱいぢぎ:Landroid/support/v4/media/MediaBrowserCompat$ぺぁあねじ;

    if-eqz v0, :cond_d

    iget-object v1, p0, Landroid/support/v4/media/MediaBrowserCompat$びぐびあび;->ぁごぐすすぃ:Landroid/os/Messenger;

    if-eqz v1, :cond_d

    const/4 v2, 0x7

    const/4 v3, 0x0

    .line 1
    :try_start_a
    invoke-virtual {v0, v2, v3, v1}, Landroid/support/v4/media/MediaBrowserCompat$ぺぁあねじ;->げつ〴ぬぐ(ILandroid/os/Bundle;Landroid/os/Messenger;)V
    :try_end_d
    .catch Landroid/os/RemoteException; {:try_start_a .. :try_end_d} :catch_d

    .line 2
    :catch_d
    :cond_d
    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$びぐびあび;->〺つふすそ:Ljava/lang/Object;

    .line 3
    check-cast v0, Landroid/media/browse/MediaBrowser;

    invoke-virtual {v0}, Landroid/media/browse/MediaBrowser;->disconnect()V

    return-void
.end method

.method public なぎぱいぢぎ()V
    .registers 2

    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$びぐびあび;->〺つふすそ:Ljava/lang/Object;

    .line 1
    check-cast v0, Landroid/media/browse/MediaBrowser;

    invoke-virtual {v0}, Landroid/media/browse/MediaBrowser;->connect()V

    return-void
.end method

.method public びぐびあび(Landroid/os/Messenger;Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;Landroid/os/Bundle;)V
    .registers 6

    iget-object p3, p0, Landroid/support/v4/media/MediaBrowserCompat$びぐびあび;->ぁごぐすすぃ:Landroid/os/Messenger;

    if-eq p3, p1, :cond_5

    return-void

    :cond_5
    iget-object p1, p0, Landroid/support/v4/media/MediaBrowserCompat$びぐびあび;->づざかべべ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    const/4 p3, 0x0

    .line 1
    invoke-virtual {p1, p2, p3}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 2
    check-cast p1, Landroid/support/v4/media/MediaBrowserCompat$いいにぽつ;

    if-nez p1, :cond_13

    sget-boolean p1, Landroid/support/v4/media/MediaBrowserCompat;->〺つふすそ:Z

    return-void

    :cond_13
    invoke-virtual {p1, p4}, Landroid/support/v4/media/MediaBrowserCompat$いいにぽつ;->げつ〴ぬぐ(Landroid/os/Bundle;)Landroid/support/v4/media/MediaBrowserCompat$ぺふねづ〺;

    return-void
.end method
