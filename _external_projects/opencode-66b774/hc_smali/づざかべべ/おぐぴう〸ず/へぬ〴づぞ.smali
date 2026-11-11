.class public Lづざかべべ/おぐぴう〸ず/へぬ〴づぞ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 〺つふすそ:Landroidx/media/MediaBrowserServiceCompat$いいにぽつ;

.field public final synthetic くし〴〺ぅ:Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;


# direct methods
.method public constructor <init>(Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;Landroidx/media/MediaBrowserServiceCompat$いいにぽつ;)V
    .registers 3

    iput-object p1, p0, Lづざかべべ/おぐぴう〸ず/へぬ〴づぞ;->くし〴〺ぅ:Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;

    iput-object p2, p0, Lづざかべべ/おぐぴう〸ず/へぬ〴づぞ;->〺つふすそ:Landroidx/media/MediaBrowserServiceCompat$いいにぽつ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 4

    iget-object v0, p0, Lづざかべべ/おぐぴう〸ず/へぬ〴づぞ;->〺つふすそ:Landroidx/media/MediaBrowserServiceCompat$いいにぽつ;

    check-cast v0, Landroidx/media/MediaBrowserServiceCompat$ぺふねづ〺;

    invoke-virtual {v0}, Landroidx/media/MediaBrowserServiceCompat$ぺふねづ〺;->げつ〴ぬぐ()Landroid/os/IBinder;

    move-result-object v0

    iget-object v1, p0, Lづざかべべ/おぐぴう〸ず/へぬ〴づぞ;->くし〴〺ぅ:Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;

    iget-object v1, v1, Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;->げつ〴ぬぐ:Landroidx/media/MediaBrowserServiceCompat;

    iget-object v1, v1, Landroidx/media/MediaBrowserServiceCompat;->くし〴〺ぅ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    invoke-virtual {v1, v0}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ;

    if-eqz v1, :cond_1a

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    :cond_1a
    return-void
.end method
