.class public Landroidx/media/MediaBrowserServiceCompat$ぁごぐすすぃ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/media/MediaBrowserServiceCompat$〺つふすそ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media/MediaBrowserServiceCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3041\u3054\u3050\u3059\u3059\u3043"
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Landroidx/media/MediaBrowserServiceCompat;

.field public げつ〴ぬぐ:Landroid/os/Messenger;


# direct methods
.method public constructor <init>(Landroidx/media/MediaBrowserServiceCompat;)V
    .registers 2

    iput-object p1, p0, Landroidx/media/MediaBrowserServiceCompat$ぁごぐすすぃ;->〺つふすそ:Landroidx/media/MediaBrowserServiceCompat;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public くし〴〺ぅ(Landroid/content/Intent;)Landroid/os/IBinder;
    .registers 3

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string v0, "android.media.browse.MediaBrowserService"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_13

    iget-object p1, p0, Landroidx/media/MediaBrowserServiceCompat$ぁごぐすすぃ;->げつ〴ぬぐ:Landroid/os/Messenger;

    invoke-virtual {p1}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    move-result-object p1

    return-object p1

    :cond_13
    const/4 p1, 0x0

    return-object p1
.end method

.method public づざかべべ()V
    .registers 3

    new-instance v0, Landroid/os/Messenger;

    iget-object v1, p0, Landroidx/media/MediaBrowserServiceCompat$ぁごぐすすぃ;->〺つふすそ:Landroidx/media/MediaBrowserServiceCompat;

    iget-object v1, v1, Landroidx/media/MediaBrowserServiceCompat;->びぐびあび:Landroidx/media/MediaBrowserServiceCompat$てぜきぽく;

    invoke-direct {v0, v1}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Landroidx/media/MediaBrowserServiceCompat$ぁごぐすすぃ;->げつ〴ぬぐ:Landroid/os/Messenger;

    return-void
.end method
