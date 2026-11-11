.class public Landroidx/media/MediaBrowserServiceCompat$びぐびあび;
.super Landroidx/media/MediaBrowserServiceCompat$くし〴〺ぅ;
.source ""

# interfaces
.implements Lづざかべべ/おぐぴう〸ず/でどあくず;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media/MediaBrowserServiceCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3073\u3050\u3073\u3042\u3073"
.end annotation


# instance fields
.field public final synthetic づざかべべ:Landroidx/media/MediaBrowserServiceCompat;


# direct methods
.method public constructor <init>(Landroidx/media/MediaBrowserServiceCompat;)V
    .registers 2

    iput-object p1, p0, Landroidx/media/MediaBrowserServiceCompat$びぐびあび;->づざかべべ:Landroidx/media/MediaBrowserServiceCompat;

    invoke-direct {p0, p1}, Landroidx/media/MediaBrowserServiceCompat$くし〴〺ぅ;-><init>(Landroidx/media/MediaBrowserServiceCompat;)V

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Ljava/lang/String;Lづざかべべ/おぐぴう〸ず/は〲ぱなで;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "L\u3065\u3056\u304b\u3079\u3079/\u304a\u3050\u3074\u3046\u3038\u305a/\u306f\u3032\u3071\u306a\u3067<",
            "Landroid/os/Parcel;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Landroidx/media/MediaBrowserServiceCompat$びぐびあび$げつ〴ぬぐ;

    invoke-direct {v0, p0, p1, p2}, Landroidx/media/MediaBrowserServiceCompat$びぐびあび$げつ〴ぬぐ;-><init>(Landroidx/media/MediaBrowserServiceCompat$びぐびあび;Ljava/lang/Object;Lづざかべべ/おぐぴう〸ず/は〲ぱなで;)V

    iget-object p1, p0, Landroidx/media/MediaBrowserServiceCompat$びぐびあび;->づざかべべ:Landroidx/media/MediaBrowserServiceCompat;

    invoke-virtual {p1, v0}, Landroidx/media/MediaBrowserServiceCompat;->づざかべべ(Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;)V

    return-void
.end method

.method public づざかべべ()V
    .registers 3

    iget-object v0, p0, Landroidx/media/MediaBrowserServiceCompat$びぐびあび;->づざかべべ:Landroidx/media/MediaBrowserServiceCompat;

    .line 1
    new-instance v1, Lづざかべべ/おぐぴう〸ず/ざっざへづ;

    invoke-direct {v1, v0, p0}, Lづざかべべ/おぐぴう〸ず/ざっざへづ;-><init>(Landroid/content/Context;Lづざかべべ/おぐぴう〸ず/でどあくず;)V

    .line 2
    iput-object v1, p0, Landroidx/media/MediaBrowserServiceCompat$くし〴〺ぅ;->〺つふすそ:Ljava/lang/Object;

    .line 3
    check-cast v1, Landroid/service/media/MediaBrowserService;

    invoke-virtual {v1}, Landroid/service/media/MediaBrowserService;->onCreate()V

    return-void
.end method
