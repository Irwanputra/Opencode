.class public Lづざかべべ/おぐぴう〸ず/ぶでにく〼〳$げつ〴ぬぐ;
.super Lづざかべべ/おぐぴう〸ず/ざっざへづ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/おぐぴう〸ず/ぶでにく〼〳;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Lづざかべべ/おぐぴう〸ず/ぶでにく〼〳$くし〴〺ぅ;)V
    .registers 3

    invoke-direct {p0, p1, p2}, Lづざかべべ/おぐぴう〸ず/ざっざへづ;-><init>(Landroid/content/Context;Lづざかべべ/おぐぴう〸ず/でどあくず;)V

    return-void
.end method


# virtual methods
.method public onLoadChildren(Ljava/lang/String;Landroid/service/media/MediaBrowserService$Result;Landroid/os/Bundle;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/service/media/MediaBrowserService$Result<",
            "Ljava/util/List<",
            "Landroid/media/browse/MediaBrowser$MediaItem;",
            ">;>;",
            "Landroid/os/Bundle;",
            ")V"
        }
    .end annotation

    invoke-static {p3}, Landroid/support/v4/media/session/MediaSessionCompat;->げつ〴ぬぐ(Landroid/os/Bundle;)V

    iget-object v0, p0, Lづざかべべ/おぐぴう〸ず/ざとぅぼこ〺;->〺つふすそ:Lづざかべべ/おぐぴう〸ず/ごづごきえ;

    check-cast v0, Lづざかべべ/おぐぴう〸ず/ぶでにく〼〳$くし〴〺ぅ;

    new-instance v1, Lづざかべべ/おぐぴう〸ず/ぶでにく〼〳$〺つふすそ;

    invoke-direct {v1, p2}, Lづざかべべ/おぐぴう〸ず/ぶでにく〼〳$〺つふすそ;-><init>(Landroid/service/media/MediaBrowserService$Result;)V

    invoke-interface {v0, p1, v1, p3}, Lづざかべべ/おぐぴう〸ず/ぶでにく〼〳$くし〴〺ぅ;->びぐびあび(Ljava/lang/String;Lづざかべべ/おぐぴう〸ず/ぶでにく〼〳$〺つふすそ;Landroid/os/Bundle;)V

    return-void
.end method
