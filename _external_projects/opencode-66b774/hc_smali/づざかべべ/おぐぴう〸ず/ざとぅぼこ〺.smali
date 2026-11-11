.class public Lづざかべべ/おぐぴう〸ず/ざとぅぼこ〺;
.super Landroid/service/media/MediaBrowserService;
.source ""


# instance fields
.field public final 〺つふすそ:Lづざかべべ/おぐぴう〸ず/ごづごきえ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lづざかべべ/おぐぴう〸ず/ごづごきえ;)V
    .registers 3

    invoke-direct {p0}, Landroid/service/media/MediaBrowserService;-><init>()V

    invoke-virtual {p0, p1}, Landroid/service/media/MediaBrowserService;->attachBaseContext(Landroid/content/Context;)V

    iput-object p2, p0, Lづざかべべ/おぐぴう〸ず/ざとぅぼこ〺;->〺つふすそ:Lづざかべべ/おぐぴう〸ず/ごづごきえ;

    return-void
.end method


# virtual methods
.method public onGetRoot(Ljava/lang/String;ILandroid/os/Bundle;)Landroid/service/media/MediaBrowserService$BrowserRoot;
    .registers 7

    invoke-static {p3}, Landroid/support/v4/media/session/MediaSessionCompat;->げつ〴ぬぐ(Landroid/os/Bundle;)V

    iget-object v0, p0, Lづざかべべ/おぐぴう〸ず/ざとぅぼこ〺;->〺つふすそ:Lづざかべべ/おぐぴう〸ず/ごづごきえ;

    const/4 v1, 0x0

    if-nez p3, :cond_a

    move-object v2, v1

    goto :goto_f

    :cond_a
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2, p3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    :goto_f
    invoke-interface {v0, p1, p2, v2}, Lづざかべべ/おぐぴう〸ず/ごづごきえ;->なぎぱいぢぎ(Ljava/lang/String;ILandroid/os/Bundle;)Lづざかべべ/おぐぴう〸ず/ぉざぅち〻;

    move-result-object p1

    if-nez p1, :cond_16

    return-object v1

    :cond_16
    new-instance p1, Landroid/service/media/MediaBrowserService$BrowserRoot;

    throw v1
.end method

.method public onLoadChildren(Ljava/lang/String;Landroid/service/media/MediaBrowserService$Result;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/service/media/MediaBrowserService$Result<",
            "Ljava/util/List<",
            "Landroid/media/browse/MediaBrowser$MediaItem;",
            ">;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lづざかべべ/おぐぴう〸ず/ざとぅぼこ〺;->〺つふすそ:Lづざかべべ/おぐぴう〸ず/ごづごきえ;

    new-instance v1, Lづざかべべ/おぐぴう〸ず/は〲ぱなで;

    invoke-direct {v1, p2}, Lづざかべべ/おぐぴう〸ず/は〲ぱなで;-><init>(Landroid/service/media/MediaBrowserService$Result;)V

    invoke-interface {v0, p1, v1}, Lづざかべべ/おぐぴう〸ず/ごづごきえ;->げつ〴ぬぐ(Ljava/lang/String;Lづざかべべ/おぐぴう〸ず/は〲ぱなで;)V

    return-void
.end method
