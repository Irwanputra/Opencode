.class public Lづざかべべ/おぐぴう〸ず/づざかべべ;
.super Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/media/MediaBrowserServiceCompat$\u3033\u305c\u305e\u305c\u3079\u3063<",
        "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic づざかべべ:Landroid/support/v4/os/ResultReceiver;


# direct methods
.method public constructor <init>(Landroidx/media/MediaBrowserServiceCompat;Ljava/lang/Object;Landroid/support/v4/os/ResultReceiver;)V
    .registers 4

    iput-object p3, p0, Lづざかべべ/おぐぴう〸ず/づざかべべ;->づざかべべ:Landroid/support/v4/os/ResultReceiver;

    invoke-direct {p0, p2}, Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public くし〴〺ぅ(Ljava/lang/Object;)V
    .registers 4

    check-cast p1, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    .line 1
    iget v0, p0, Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;->びぐびあび:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_10

    .line 2
    iget-object p1, p0, Lづざかべべ/おぐぴう〸ず/づざかべべ;->づざかべべ:Landroid/support/v4/os/ResultReceiver;

    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/support/v4/os/ResultReceiver;->ぁごぐすすぃ(ILandroid/os/Bundle;)V

    goto :goto_20

    :cond_10
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "media_item"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    iget-object p1, p0, Lづざかべべ/おぐぴう〸ず/づざかべべ;->づざかべべ:Landroid/support/v4/os/ResultReceiver;

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Landroid/support/v4/os/ResultReceiver;->ぁごぐすすぃ(ILandroid/os/Bundle;)V

    :goto_20
    return-void
.end method
