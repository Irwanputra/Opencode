.class public Landroidx/media/MediaBrowserServiceCompat$くし〴〺ぅ$げつ〴ぬぐ;
.super Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media/MediaBrowserServiceCompat$くし〴〺ぅ;->げつ〴ぬぐ(Ljava/lang/String;Lづざかべべ/おぐぴう〸ず/は〲ぱなで;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/media/MediaBrowserServiceCompat$\u3033\u305c\u305e\u305c\u3079\u3063<",
        "Ljava/util/List<",
        "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic づざかべべ:Lづざかべべ/おぐぴう〸ず/は〲ぱなで;


# direct methods
.method public constructor <init>(Landroidx/media/MediaBrowserServiceCompat$くし〴〺ぅ;Ljava/lang/Object;Lづざかべべ/おぐぴう〸ず/は〲ぱなで;)V
    .registers 4

    iput-object p3, p0, Landroidx/media/MediaBrowserServiceCompat$くし〴〺ぅ$げつ〴ぬぐ;->づざかべべ:Lづざかべべ/おぐぴう〸ず/は〲ぱなで;

    invoke-direct {p0, p2}, Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public くし〴〺ぅ(Ljava/lang/Object;)V
    .registers 6

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_25

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_d
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_26

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;->writeToParcel(Landroid/os/Parcel;I)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :cond_25
    const/4 v0, 0x0

    :cond_26
    iget-object p1, p0, Landroidx/media/MediaBrowserServiceCompat$くし〴〺ぅ$げつ〴ぬぐ;->づざかべべ:Lづざかべべ/おぐぴう〸ず/は〲ぱなで;

    invoke-virtual {p1, v0}, Lづざかべべ/おぐぴう〸ず/は〲ぱなで;->げつ〴ぬぐ(Ljava/lang/Object;)V

    return-void
.end method
