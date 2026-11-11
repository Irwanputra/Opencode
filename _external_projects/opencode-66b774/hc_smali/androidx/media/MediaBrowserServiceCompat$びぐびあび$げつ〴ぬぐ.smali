.class public Landroidx/media/MediaBrowserServiceCompat$びぐびあび$げつ〴ぬぐ;
.super Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media/MediaBrowserServiceCompat$びぐびあび;->〺つふすそ(Ljava/lang/String;Lづざかべべ/おぐぴう〸ず/は〲ぱなで;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/media/MediaBrowserServiceCompat$\u3033\u305c\u305e\u305c\u3079\u3063<",
        "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic づざかべべ:Lづざかべべ/おぐぴう〸ず/は〲ぱなで;


# direct methods
.method public constructor <init>(Landroidx/media/MediaBrowserServiceCompat$びぐびあび;Ljava/lang/Object;Lづざかべべ/おぐぴう〸ず/は〲ぱなで;)V
    .registers 4

    iput-object p3, p0, Landroidx/media/MediaBrowserServiceCompat$びぐびあび$げつ〴ぬぐ;->づざかべべ:Lづざかべべ/おぐぴう〸ず/は〲ぱなで;

    invoke-direct {p0, p2}, Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public くし〴〺ぅ(Ljava/lang/Object;)V
    .registers 4

    check-cast p1, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    if-nez p1, :cond_8

    .line 1
    iget-object p1, p0, Landroidx/media/MediaBrowserServiceCompat$びぐびあび$げつ〴ぬぐ;->づざかべべ:Lづざかべべ/おぐぴう〸ず/は〲ぱなで;

    const/4 v0, 0x0

    goto :goto_12

    :cond_8
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object p1, p0, Landroidx/media/MediaBrowserServiceCompat$びぐびあび$げつ〴ぬぐ;->づざかべべ:Lづざかべべ/おぐぴう〸ず/は〲ぱなで;

    :goto_12
    invoke-virtual {p1, v0}, Lづざかべべ/おぐぴう〸ず/は〲ぱなで;->げつ〴ぬぐ(Ljava/lang/Object;)V

    return-void
.end method
