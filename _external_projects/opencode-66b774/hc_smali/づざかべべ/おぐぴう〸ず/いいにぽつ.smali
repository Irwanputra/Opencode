.class public Lづざかべべ/おぐぴう〸ず/いいにぽつ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 〺つふすそ:Landroidx/media/MediaBrowserServiceCompat$いいにぽつ;

.field public final synthetic くし〴〺ぅ:Ljava/lang/String;

.field public final synthetic づざかべべ:Landroid/os/Bundle;

.field public final synthetic なぎぱいぢぎ:Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;

.field public final synthetic びぐびあび:Landroid/os/IBinder;


# direct methods
.method public constructor <init>(Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;Landroidx/media/MediaBrowserServiceCompat$いいにぽつ;Ljava/lang/String;Landroid/os/IBinder;Landroid/os/Bundle;)V
    .registers 6

    iput-object p1, p0, Lづざかべべ/おぐぴう〸ず/いいにぽつ;->なぎぱいぢぎ:Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;

    iput-object p2, p0, Lづざかべべ/おぐぴう〸ず/いいにぽつ;->〺つふすそ:Landroidx/media/MediaBrowserServiceCompat$いいにぽつ;

    iput-object p3, p0, Lづざかべべ/おぐぴう〸ず/いいにぽつ;->くし〴〺ぅ:Ljava/lang/String;

    iput-object p4, p0, Lづざかべべ/おぐぴう〸ず/いいにぽつ;->びぐびあび:Landroid/os/IBinder;

    iput-object p5, p0, Lづざかべべ/おぐぴう〸ず/いいにぽつ;->づざかべべ:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 13

    iget-object v0, p0, Lづざかべべ/おぐぴう〸ず/いいにぽつ;->〺つふすそ:Landroidx/media/MediaBrowserServiceCompat$いいにぽつ;

    check-cast v0, Landroidx/media/MediaBrowserServiceCompat$ぺふねづ〺;

    invoke-virtual {v0}, Landroidx/media/MediaBrowserServiceCompat$ぺふねづ〺;->げつ〴ぬぐ()Landroid/os/IBinder;

    move-result-object v0

    iget-object v1, p0, Lづざかべべ/おぐぴう〸ず/いいにぽつ;->なぎぱいぢぎ:Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;

    iget-object v1, v1, Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;->げつ〴ぬぐ:Landroidx/media/MediaBrowserServiceCompat;

    iget-object v1, v1, Landroidx/media/MediaBrowserServiceCompat;->くし〴〺ぅ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    invoke-virtual {v1, v0}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ;

    if-nez v0, :cond_17

    return-void

    :cond_17
    iget-object v1, p0, Lづざかべべ/おぐぴう〸ず/いいにぽつ;->なぎぱいぢぎ:Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;

    iget-object v8, v1, Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;->げつ〴ぬぐ:Landroidx/media/MediaBrowserServiceCompat;

    iget-object v9, p0, Lづざかべべ/おぐぴう〸ず/いいにぽつ;->くし〴〺ぅ:Ljava/lang/String;

    iget-object v1, p0, Lづざかべべ/おぐぴう〸ず/いいにぽつ;->びぐびあび:Landroid/os/IBinder;

    iget-object v10, p0, Lづざかべべ/おぐぴう〸ず/いいにぽつ;->づざかべべ:Landroid/os/Bundle;

    .line 1
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v0, Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ;->くし〴〺ぅ:Ljava/util/HashMap;

    invoke-virtual {v2, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-nez v2, :cond_33

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :cond_33
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_37
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_52

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/〺つふすそ;

    iget-object v5, v4, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/〺つふすそ;->げつ〴ぬぐ:Ljava/lang/Object;

    if-ne v1, v5, :cond_37

    iget-object v4, v4, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/〺つふすそ;->〺つふすそ:Ljava/lang/Object;

    check-cast v4, Landroid/os/Bundle;

    invoke-static {v10, v4}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->くし〴〺ぅ(Landroid/os/Bundle;Landroid/os/Bundle;)Z

    move-result v4

    if-eqz v4, :cond_37

    goto :goto_7d

    :cond_52
    new-instance v3, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/〺つふすそ;

    invoke-direct {v3, v1, v10}, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/〺つふすそ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ;->くし〴〺ぅ:Ljava/util/HashMap;

    invoke-virtual {v1, v9, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v7, 0x0

    .line 2
    new-instance v11, Lづざかべべ/おぐぴう〸ず/びぐびあび;

    move-object v1, v11

    move-object v2, v8

    move-object v3, v9

    move-object v4, v0

    move-object v5, v9

    move-object v6, v10

    invoke-direct/range {v1 .. v7}, Lづざかべべ/おぐぴう〸ず/びぐびあび;-><init>(Landroidx/media/MediaBrowserServiceCompat;Ljava/lang/Object;Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)V

    if-nez v10, :cond_71

    invoke-virtual {v8, v9, v11}, Landroidx/media/MediaBrowserServiceCompat;->くし〴〺ぅ(Ljava/lang/String;Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;)V

    goto :goto_74

    :cond_71
    invoke-virtual {v8, v9, v11}, Landroidx/media/MediaBrowserServiceCompat;->びぐびあび(Ljava/lang/String;Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;)V

    :goto_74
    invoke-virtual {v11}, Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;->げつ〴ぬぐ()Z

    move-result v1

    if-eqz v1, :cond_7e

    .line 3
    invoke-virtual {v8}, Landroidx/media/MediaBrowserServiceCompat;->ぁごぐすすぃ()V

    :goto_7d
    return-void

    .line 4
    :cond_7e
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "onLoadChildren must call detach() or sendResult() before returning for package="

    invoke-static {v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v0, v0, Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " id="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_9c

    :goto_9b
    throw v1

    :goto_9c
    goto :goto_9b
.end method
