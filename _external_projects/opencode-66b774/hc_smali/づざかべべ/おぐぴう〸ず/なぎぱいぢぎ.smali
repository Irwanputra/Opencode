.class public Lづざかべべ/おぐぴう〸ず/なぎぱいぢぎ;
.super Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/media/MediaBrowserServiceCompat$\u3033\u305c\u305e\u305c\u3079\u3063<",
        "Ljava/util/List<",
        "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic づざかべべ:Landroid/support/v4/os/ResultReceiver;


# direct methods
.method public constructor <init>(Landroidx/media/MediaBrowserServiceCompat;Ljava/lang/Object;Landroid/support/v4/os/ResultReceiver;)V
    .registers 4

    iput-object p3, p0, Lづざかべべ/おぐぴう〸ず/なぎぱいぢぎ;->づざかべべ:Landroid/support/v4/os/ResultReceiver;

    invoke-direct {p0, p2}, Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public くし〴〺ぅ(Ljava/lang/Object;)V
    .registers 5

    check-cast p1, Ljava/util/List;

    .line 1
    iget v0, p0, Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;->びぐびあび:I

    and-int/lit8 v0, v0, 0x4

    if-nez v0, :cond_24

    if-nez p1, :cond_b

    goto :goto_24

    .line 2
    :cond_b
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const/4 v1, 0x0

    new-array v2, v1, [Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    invoke-interface {p1, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Landroid/os/Parcelable;

    const-string v2, "search_results"

    invoke-virtual {v0, v2, p1}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    iget-object p1, p0, Lづざかべべ/おぐぴう〸ず/なぎぱいぢぎ;->づざかべべ:Landroid/support/v4/os/ResultReceiver;

    invoke-virtual {p1, v1, v0}, Landroid/support/v4/os/ResultReceiver;->ぁごぐすすぃ(ILandroid/os/Bundle;)V

    goto :goto_2b

    :cond_24
    :goto_24
    iget-object p1, p0, Lづざかべべ/おぐぴう〸ず/なぎぱいぢぎ;->づざかべべ:Landroid/support/v4/os/ResultReceiver;

    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/support/v4/os/ResultReceiver;->ぁごぐすすぃ(ILandroid/os/Bundle;)V

    :goto_2b
    return-void
.end method
