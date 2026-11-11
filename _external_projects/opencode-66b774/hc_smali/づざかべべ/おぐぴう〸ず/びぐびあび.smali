.class public Lづざかべべ/おぐぴう〸ず/びぐびあび;
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
.field public final synthetic 〳ぜぞぜべっ:Landroid/os/Bundle;

.field public final synthetic ぁごぐすすぃ:Landroid/os/Bundle;

.field public final synthetic づざかべべ:Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ;

.field public final synthetic なぎぱいぢぎ:Ljava/lang/String;

.field public final synthetic ぺぁあねじ:Landroidx/media/MediaBrowserServiceCompat;


# direct methods
.method public constructor <init>(Landroidx/media/MediaBrowserServiceCompat;Ljava/lang/Object;Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)V
    .registers 7

    iput-object p1, p0, Lづざかべべ/おぐぴう〸ず/びぐびあび;->ぺぁあねじ:Landroidx/media/MediaBrowserServiceCompat;

    iput-object p3, p0, Lづざかべべ/おぐぴう〸ず/びぐびあび;->づざかべべ:Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ;

    iput-object p4, p0, Lづざかべべ/おぐぴう〸ず/びぐびあび;->なぎぱいぢぎ:Ljava/lang/String;

    iput-object p5, p0, Lづざかべべ/おぐぴう〸ず/びぐびあび;->ぁごぐすすぃ:Landroid/os/Bundle;

    iput-object p6, p0, Lづざかべべ/おぐぴう〸ず/びぐびあび;->〳ぜぞぜべっ:Landroid/os/Bundle;

    invoke-direct {p0, p2}, Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public くし〴〺ぅ(Ljava/lang/Object;)V
    .registers 7

    check-cast p1, Ljava/util/List;

    .line 1
    iget-object v0, p0, Lづざかべべ/おぐぴう〸ず/びぐびあび;->ぺぁあねじ:Landroidx/media/MediaBrowserServiceCompat;

    iget-object v0, v0, Landroidx/media/MediaBrowserServiceCompat;->くし〴〺ぅ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    iget-object v1, p0, Lづざかべべ/おぐぴう〸ず/びぐびあび;->づざかべべ:Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ;

    iget-object v1, v1, Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ;->〺つふすそ:Landroidx/media/MediaBrowserServiceCompat$いいにぽつ;

    check-cast v1, Landroidx/media/MediaBrowserServiceCompat$ぺふねづ〺;

    invoke-virtual {v1}, Landroidx/media/MediaBrowserServiceCompat$ぺふねづ〺;->げつ〴ぬぐ()Landroid/os/IBinder;

    move-result-object v1

    invoke-virtual {v0, v1}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lづざかべべ/おぐぴう〸ず/びぐびあび;->づざかべべ:Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ;

    if-eq v0, v1, :cond_1f

    sget-boolean p1, Landroidx/media/MediaBrowserServiceCompat;->づざかべべ:Z

    if-eqz p1, :cond_78

    iget-object p1, v1, Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/String;

    goto :goto_78

    .line 2
    :cond_1f
    iget v0, p0, Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;->びぐびあび:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_64

    .line 3
    iget-object v0, p0, Lづざかべべ/おぐぴう〸ず/びぐびあび;->ぺぁあねじ:Landroidx/media/MediaBrowserServiceCompat;

    iget-object v2, p0, Lづざかべべ/おぐぴう〸ず/びぐびあび;->ぁごぐすすぃ:Landroid/os/Bundle;

    .line 4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez p1, :cond_30

    const/4 p1, 0x0

    goto :goto_64

    :cond_30
    const/4 v0, -0x1

    const-string v3, "android.media.browse.extra.PAGE"

    invoke-virtual {v2, v3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v3

    const-string v4, "android.media.browse.extra.PAGE_SIZE"

    invoke-virtual {v2, v4, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    if-ne v3, v0, :cond_42

    if-ne v2, v0, :cond_42

    goto :goto_64

    :cond_42
    mul-int v0, v2, v3

    add-int v4, v0, v2

    if-ltz v3, :cond_60

    if-lt v2, v1, :cond_60

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-lt v0, v1, :cond_51

    goto :goto_60

    :cond_51
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-le v4, v1, :cond_5b

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    :cond_5b
    invoke-interface {p1, v0, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    goto :goto_64

    :cond_60
    :goto_60
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    .line 5
    :cond_64
    :goto_64
    :try_start_64
    iget-object v0, p0, Lづざかべべ/おぐぴう〸ず/びぐびあび;->づざかべべ:Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ;

    iget-object v0, v0, Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ;->〺つふすそ:Landroidx/media/MediaBrowserServiceCompat$いいにぽつ;

    iget-object v1, p0, Lづざかべべ/おぐぴう〸ず/びぐびあび;->なぎぱいぢぎ:Ljava/lang/String;

    iget-object v2, p0, Lづざかべべ/おぐぴう〸ず/びぐびあび;->ぁごぐすすぃ:Landroid/os/Bundle;

    iget-object v3, p0, Lづざかべべ/おぐぴう〸ず/びぐびあび;->〳ぜぞぜべっ:Landroid/os/Bundle;

    check-cast v0, Landroidx/media/MediaBrowserServiceCompat$ぺふねづ〺;

    invoke-virtual {v0, v1, p1, v2, v3}, Landroidx/media/MediaBrowserServiceCompat$ぺふねづ〺;->〺つふすそ(Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;Landroid/os/Bundle;)V
    :try_end_73
    .catch Landroid/os/RemoteException; {:try_start_64 .. :try_end_73} :catch_74

    goto :goto_78

    :catch_74
    iget-object p1, p0, Lづざかべべ/おぐぴう〸ず/びぐびあび;->づざかべべ:Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ;

    iget-object p1, p1, Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/String;

    :cond_78
    :goto_78
    return-void
.end method
