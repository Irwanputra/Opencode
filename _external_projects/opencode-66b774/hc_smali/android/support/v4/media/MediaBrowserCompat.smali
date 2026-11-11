.class public final Landroid/support/v4/media/MediaBrowserCompat;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/media/MediaBrowserCompat$CustomActionResultReceiver;,
        Landroid/support/v4/media/MediaBrowserCompat$SearchResultReceiver;,
        Landroid/support/v4/media/MediaBrowserCompat$ItemReceiver;,
        Landroid/support/v4/media/MediaBrowserCompat$ぺぁあねじ;,
        Landroid/support/v4/media/MediaBrowserCompat$げつ〴ぬぐ;,
        Landroid/support/v4/media/MediaBrowserCompat$いいにぽつ;,
        Landroid/support/v4/media/MediaBrowserCompat$なぎぱいぢぎ;,
        Landroid/support/v4/media/MediaBrowserCompat$づざかべべ;,
        Landroid/support/v4/media/MediaBrowserCompat$びぐびあび;,
        Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;,
        Landroid/support/v4/media/MediaBrowserCompat$〳ぜぞぜべっ;,
        Landroid/support/v4/media/MediaBrowserCompat$くし〴〺ぅ;,
        Landroid/support/v4/media/MediaBrowserCompat$ぺふねづ〺;,
        Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ;,
        Landroid/support/v4/media/MediaBrowserCompat$MediaItem;
    }
.end annotation


# static fields
.field public static final 〺つふすそ:Z


# instance fields
.field public final げつ〴ぬぐ:Landroid/support/v4/media/MediaBrowserCompat$くし〴〺ぅ;


# direct methods
.method public static constructor <clinit>()V
    .registers 2

    const-string v0, "MediaBrowserCompat"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    sput-boolean v0, Landroid/support/v4/media/MediaBrowserCompat;->〺つふすそ:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/ComponentName;Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ;Landroid/os/Bundle;)V
    .registers 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget p4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v0, 0x0

    const/16 v1, 0x1a

    if-lt p4, v1, :cond_10

    new-instance p4, Landroid/support/v4/media/MediaBrowserCompat$なぎぱいぢぎ;

    invoke-direct {p4, p1, p2, p3, v0}, Landroid/support/v4/media/MediaBrowserCompat$なぎぱいぢぎ;-><init>(Landroid/content/Context;Landroid/content/ComponentName;Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ;Landroid/os/Bundle;)V

    goto :goto_29

    :cond_10
    const/16 v1, 0x17

    if-lt p4, v1, :cond_1a

    new-instance p4, Landroid/support/v4/media/MediaBrowserCompat$づざかべべ;

    invoke-direct {p4, p1, p2, p3, v0}, Landroid/support/v4/media/MediaBrowserCompat$づざかべべ;-><init>(Landroid/content/Context;Landroid/content/ComponentName;Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ;Landroid/os/Bundle;)V

    goto :goto_29

    :cond_1a
    const/16 v1, 0x15

    if-lt p4, v1, :cond_24

    new-instance p4, Landroid/support/v4/media/MediaBrowserCompat$びぐびあび;

    invoke-direct {p4, p1, p2, p3, v0}, Landroid/support/v4/media/MediaBrowserCompat$びぐびあび;-><init>(Landroid/content/Context;Landroid/content/ComponentName;Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ;Landroid/os/Bundle;)V

    goto :goto_29

    :cond_24
    new-instance p4, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;

    invoke-direct {p4, p1, p2, p3, v0}, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;-><init>(Landroid/content/Context;Landroid/content/ComponentName;Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ;Landroid/os/Bundle;)V

    :goto_29
    iput-object p4, p0, Landroid/support/v4/media/MediaBrowserCompat;->げつ〴ぬぐ:Landroid/support/v4/media/MediaBrowserCompat$くし〴〺ぅ;

    return-void
.end method
