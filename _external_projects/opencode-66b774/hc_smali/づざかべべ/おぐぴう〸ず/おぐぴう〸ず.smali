.class public Lづざかべべ/おぐぴう〸ず/おぐぴう〸ず;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 〺つふすそ:Landroidx/media/MediaBrowserServiceCompat$いいにぽつ;

.field public final synthetic くし〴〺ぅ:Ljava/lang/String;

.field public final synthetic づざかべべ:Landroid/support/v4/os/ResultReceiver;

.field public final synthetic なぎぱいぢぎ:Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;

.field public final synthetic びぐびあび:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;Landroidx/media/MediaBrowserServiceCompat$いいにぽつ;Ljava/lang/String;Landroid/os/Bundle;Landroid/support/v4/os/ResultReceiver;)V
    .registers 6

    iput-object p1, p0, Lづざかべべ/おぐぴう〸ず/おぐぴう〸ず;->なぎぱいぢぎ:Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;

    iput-object p2, p0, Lづざかべべ/おぐぴう〸ず/おぐぴう〸ず;->〺つふすそ:Landroidx/media/MediaBrowserServiceCompat$いいにぽつ;

    iput-object p3, p0, Lづざかべべ/おぐぴう〸ず/おぐぴう〸ず;->くし〴〺ぅ:Ljava/lang/String;

    iput-object p4, p0, Lづざかべべ/おぐぴう〸ず/おぐぴう〸ず;->びぐびあび:Landroid/os/Bundle;

    iput-object p5, p0, Lづざかべべ/おぐぴう〸ず/おぐぴう〸ず;->づざかべべ:Landroid/support/v4/os/ResultReceiver;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 5

    iget-object v0, p0, Lづざかべべ/おぐぴう〸ず/おぐぴう〸ず;->〺つふすそ:Landroidx/media/MediaBrowserServiceCompat$いいにぽつ;

    check-cast v0, Landroidx/media/MediaBrowserServiceCompat$ぺふねづ〺;

    invoke-virtual {v0}, Landroidx/media/MediaBrowserServiceCompat$ぺふねづ〺;->げつ〴ぬぐ()Landroid/os/IBinder;

    move-result-object v0

    iget-object v1, p0, Lづざかべべ/おぐぴう〸ず/おぐぴう〸ず;->なぎぱいぢぎ:Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;

    iget-object v1, v1, Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;->げつ〴ぬぐ:Landroidx/media/MediaBrowserServiceCompat;

    iget-object v1, v1, Landroidx/media/MediaBrowserServiceCompat;->くし〴〺ぅ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    invoke-virtual {v1, v0}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ;

    if-nez v0, :cond_17

    return-void

    :cond_17
    iget-object v0, p0, Lづざかべべ/おぐぴう〸ず/おぐぴう〸ず;->なぎぱいぢぎ:Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;

    iget-object v0, v0, Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;->げつ〴ぬぐ:Landroidx/media/MediaBrowserServiceCompat;

    iget-object v1, p0, Lづざかべべ/おぐぴう〸ず/おぐぴう〸ず;->くし〴〺ぅ:Ljava/lang/String;

    iget-object v2, p0, Lづざかべべ/おぐぴう〸ず/おぐぴう〸ず;->づざかべべ:Landroid/support/v4/os/ResultReceiver;

    .line 1
    new-instance v3, Lづざかべべ/おぐぴう〸ず/なぎぱいぢぎ;

    invoke-direct {v3, v0, v1, v2}, Lづざかべべ/おぐぴう〸ず/なぎぱいぢぎ;-><init>(Landroidx/media/MediaBrowserServiceCompat;Ljava/lang/Object;Landroid/support/v4/os/ResultReceiver;)V

    invoke-virtual {v0, v3}, Landroidx/media/MediaBrowserServiceCompat;->なぎぱいぢぎ(Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;)V

    invoke-virtual {v3}, Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;->げつ〴ぬぐ()Z

    move-result v0

    if-eqz v0, :cond_2e

    return-void

    :cond_2e
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "onSearch must call detach() or sendResult() before returning for query="

    invoke-static {v2, v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
