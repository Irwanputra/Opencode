.class public Lづざかべべ/おぐぴう〸ず/ざっざへづ;
.super Lづざかべべ/おぐぴう〸ず/ざとぅぼこ〺;
.source ""


# direct methods
.method public constructor <init>(Landroid/content/Context;Lづざかべべ/おぐぴう〸ず/でどあくず;)V
    .registers 3

    invoke-direct {p0, p1, p2}, Lづざかべべ/おぐぴう〸ず/ざとぅぼこ〺;-><init>(Landroid/content/Context;Lづざかべべ/おぐぴう〸ず/ごづごきえ;)V

    return-void
.end method


# virtual methods
.method public onLoadItem(Ljava/lang/String;Landroid/service/media/MediaBrowserService$Result;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/service/media/MediaBrowserService$Result<",
            "Landroid/media/browse/MediaBrowser$MediaItem;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lづざかべべ/おぐぴう〸ず/ざとぅぼこ〺;->〺つふすそ:Lづざかべべ/おぐぴう〸ず/ごづごきえ;

    check-cast v0, Lづざかべべ/おぐぴう〸ず/でどあくず;

    new-instance v1, Lづざかべべ/おぐぴう〸ず/は〲ぱなで;

    invoke-direct {v1, p2}, Lづざかべべ/おぐぴう〸ず/は〲ぱなで;-><init>(Landroid/service/media/MediaBrowserService$Result;)V

    invoke-interface {v0, p1, v1}, Lづざかべべ/おぐぴう〸ず/でどあくず;->〺つふすそ(Ljava/lang/String;Lづざかべべ/おぐぴう〸ず/は〲ぱなで;)V

    return-void
.end method
