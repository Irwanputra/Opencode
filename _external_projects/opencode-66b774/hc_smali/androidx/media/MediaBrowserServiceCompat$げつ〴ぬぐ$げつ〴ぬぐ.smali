.class public Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ;->binderDied()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ;


# direct methods
.method public constructor <init>(Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ;)V
    .registers 2

    iput-object p1, p0, Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ:Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 3

    iget-object v0, p0, Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ:Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ;

    iget-object v1, v0, Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ;->びぐびあび:Landroidx/media/MediaBrowserServiceCompat;

    iget-object v1, v1, Landroidx/media/MediaBrowserServiceCompat;->くし〴〺ぅ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    iget-object v0, v0, Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ;->〺つふすそ:Landroidx/media/MediaBrowserServiceCompat$いいにぽつ;

    check-cast v0, Landroidx/media/MediaBrowserServiceCompat$ぺふねづ〺;

    invoke-virtual {v0}, Landroidx/media/MediaBrowserServiceCompat$ぺふねづ〺;->げつ〴ぬぐ()Landroid/os/IBinder;

    move-result-object v0

    invoke-virtual {v1, v0}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
