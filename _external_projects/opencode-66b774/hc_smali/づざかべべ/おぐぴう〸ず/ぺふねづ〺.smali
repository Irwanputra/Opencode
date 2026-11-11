.class public Lづざかべべ/おぐぴう〸ず/ぺふねづ〺;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 〺つふすそ:Landroidx/media/MediaBrowserServiceCompat$いいにぽつ;

.field public final synthetic くし〴〺ぅ:Ljava/lang/String;

.field public final synthetic づざかべべ:Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;

.field public final synthetic びぐびあび:Landroid/os/IBinder;


# direct methods
.method public constructor <init>(Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;Landroidx/media/MediaBrowserServiceCompat$いいにぽつ;Ljava/lang/String;Landroid/os/IBinder;)V
    .registers 5

    iput-object p1, p0, Lづざかべべ/おぐぴう〸ず/ぺふねづ〺;->づざかべべ:Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;

    iput-object p2, p0, Lづざかべべ/おぐぴう〸ず/ぺふねづ〺;->〺つふすそ:Landroidx/media/MediaBrowserServiceCompat$いいにぽつ;

    iput-object p3, p0, Lづざかべべ/おぐぴう〸ず/ぺふねづ〺;->くし〴〺ぅ:Ljava/lang/String;

    iput-object p4, p0, Lづざかべべ/おぐぴう〸ず/ぺふねづ〺;->びぐびあび:Landroid/os/IBinder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 10

    iget-object v0, p0, Lづざかべべ/おぐぴう〸ず/ぺふねづ〺;->〺つふすそ:Landroidx/media/MediaBrowserServiceCompat$いいにぽつ;

    check-cast v0, Landroidx/media/MediaBrowserServiceCompat$ぺふねづ〺;

    invoke-virtual {v0}, Landroidx/media/MediaBrowserServiceCompat$ぺふねづ〺;->げつ〴ぬぐ()Landroid/os/IBinder;

    move-result-object v0

    iget-object v1, p0, Lづざかべべ/おぐぴう〸ず/ぺふねづ〺;->づざかべべ:Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;

    iget-object v1, v1, Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;->げつ〴ぬぐ:Landroidx/media/MediaBrowserServiceCompat;

    iget-object v1, v1, Landroidx/media/MediaBrowserServiceCompat;->くし〴〺ぅ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    invoke-virtual {v1, v0}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ;

    if-nez v0, :cond_17

    return-void

    :cond_17
    iget-object v1, p0, Lづざかべべ/おぐぴう〸ず/ぺふねづ〺;->づざかべべ:Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;

    iget-object v1, v1, Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;->げつ〴ぬぐ:Landroidx/media/MediaBrowserServiceCompat;

    iget-object v2, p0, Lづざかべべ/おぐぴう〸ず/ぺふねづ〺;->くし〴〺ぅ:Ljava/lang/String;

    iget-object v3, p0, Lづざかべべ/おぐぴう〸ず/ぺふねづ〺;->びぐびあび:Landroid/os/IBinder;

    .line 1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-nez v3, :cond_30

    :try_start_26
    iget-object v0, v0, Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ;->くし〴〺ぅ:Ljava/util/HashMap;

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_5e

    const/4 v4, 0x1

    goto :goto_5e

    :cond_30
    iget-object v6, v0, Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ;->くし〴〺ぅ:Ljava/util/HashMap;

    invoke-virtual {v6, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    if-eqz v6, :cond_5e

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_3e
    :goto_3e
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_53

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/〺つふすそ;

    iget-object v8, v8, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/〺つふすそ;->げつ〴ぬぐ:Ljava/lang/Object;

    if-ne v3, v8, :cond_3e

    invoke-interface {v7}, Ljava/util/Iterator;->remove()V

    const/4 v4, 0x1

    goto :goto_3e

    :cond_53
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v3

    if-nez v3, :cond_5e

    iget-object v0, v0, Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ;->くし〴〺ぅ:Ljava/util/HashMap;

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5e
    .catchall {:try_start_26 .. :try_end_5e} :catchall_62

    :cond_5e
    :goto_5e
    invoke-virtual {v1}, Landroidx/media/MediaBrowserServiceCompat;->〳ぜぞぜべっ()V

    return-void

    :catchall_62
    move-exception v0

    invoke-virtual {v1}, Landroidx/media/MediaBrowserServiceCompat;->〳ぜぞぜべっ()V

    goto :goto_68

    :goto_67
    throw v0

    :goto_68
    goto :goto_67
.end method
