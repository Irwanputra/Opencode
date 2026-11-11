.class public Landroidx/media/MediaBrowserServiceCompat$づざかべべ;
.super Landroidx/media/MediaBrowserServiceCompat$びぐびあび;
.source ""

# interfaces
.implements Lづざかべべ/おぐぴう〸ず/ぶでにく〼〳$くし〴〺ぅ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media/MediaBrowserServiceCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3065\u3056\u304b\u3079\u3079"
.end annotation


# instance fields
.field public final synthetic なぎぱいぢぎ:Landroidx/media/MediaBrowserServiceCompat;


# direct methods
.method public constructor <init>(Landroidx/media/MediaBrowserServiceCompat;)V
    .registers 2

    iput-object p1, p0, Landroidx/media/MediaBrowserServiceCompat$づざかべべ;->なぎぱいぢぎ:Landroidx/media/MediaBrowserServiceCompat;

    invoke-direct {p0, p1}, Landroidx/media/MediaBrowserServiceCompat$びぐびあび;-><init>(Landroidx/media/MediaBrowserServiceCompat;)V

    return-void
.end method


# virtual methods
.method public づざかべべ()V
    .registers 3

    iget-object v0, p0, Landroidx/media/MediaBrowserServiceCompat$づざかべべ;->なぎぱいぢぎ:Landroidx/media/MediaBrowserServiceCompat;

    .line 1
    sget-object v1, Lづざかべべ/おぐぴう〸ず/ぶでにく〼〳;->げつ〴ぬぐ:Ljava/lang/reflect/Field;

    new-instance v1, Lづざかべべ/おぐぴう〸ず/ぶでにく〼〳$げつ〴ぬぐ;

    invoke-direct {v1, v0, p0}, Lづざかべべ/おぐぴう〸ず/ぶでにく〼〳$げつ〴ぬぐ;-><init>(Landroid/content/Context;Lづざかべべ/おぐぴう〸ず/ぶでにく〼〳$くし〴〺ぅ;)V

    .line 2
    iput-object v1, p0, Landroidx/media/MediaBrowserServiceCompat$くし〴〺ぅ;->〺つふすそ:Ljava/lang/Object;

    .line 3
    check-cast v1, Landroid/service/media/MediaBrowserService;

    invoke-virtual {v1}, Landroid/service/media/MediaBrowserService;->onCreate()V

    return-void
.end method

.method public びぐびあび(Ljava/lang/String;Lづざかべべ/おぐぴう〸ず/ぶでにく〼〳$〺つふすそ;Landroid/os/Bundle;)V
    .registers 4

    new-instance p3, Landroidx/media/MediaBrowserServiceCompat$づざかべべ$げつ〴ぬぐ;

    invoke-direct {p3, p0, p1, p2}, Landroidx/media/MediaBrowserServiceCompat$づざかべべ$げつ〴ぬぐ;-><init>(Landroidx/media/MediaBrowserServiceCompat$づざかべべ;Ljava/lang/Object;Lづざかべべ/おぐぴう〸ず/ぶでにく〼〳$〺つふすそ;)V

    iget-object p2, p0, Landroidx/media/MediaBrowserServiceCompat$づざかべべ;->なぎぱいぢぎ:Landroidx/media/MediaBrowserServiceCompat;

    invoke-virtual {p2, p1, p3}, Landroidx/media/MediaBrowserServiceCompat;->びぐびあび(Ljava/lang/String;Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;)V

    return-void
.end method
