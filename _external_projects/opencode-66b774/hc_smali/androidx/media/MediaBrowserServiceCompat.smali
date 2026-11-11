.class public abstract Landroidx/media/MediaBrowserServiceCompat;
.super Landroid/app/Service;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media/MediaBrowserServiceCompat$ぺふねづ〺;,
        Landroidx/media/MediaBrowserServiceCompat$いいにぽつ;,
        Landroidx/media/MediaBrowserServiceCompat$ぺぁあねじ;,
        Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;,
        Landroidx/media/MediaBrowserServiceCompat$げつ〴ぬぐ;,
        Landroidx/media/MediaBrowserServiceCompat$てぜきぽく;,
        Landroidx/media/MediaBrowserServiceCompat$なぎぱいぢぎ;,
        Landroidx/media/MediaBrowserServiceCompat$づざかべべ;,
        Landroidx/media/MediaBrowserServiceCompat$びぐびあび;,
        Landroidx/media/MediaBrowserServiceCompat$くし〴〺ぅ;,
        Landroidx/media/MediaBrowserServiceCompat$ぁごぐすすぃ;,
        Landroidx/media/MediaBrowserServiceCompat$〺つふすそ;
    }
.end annotation


# static fields
.field public static final づざかべべ:Z


# instance fields
.field public 〺つふすそ:Landroidx/media/MediaBrowserServiceCompat$〺つふすそ;

.field public final くし〴〺ぅ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u3065\u3056\u304b\u3079\u3079/\u3065\u3056\u304b\u3079\u3079/\u3052\u3064\u3034\u306c\u3050<",
            "Landroid/os/IBinder;",
            "Landroidx/media/MediaBrowserServiceCompat$\u3052\u3064\u3034\u306c\u3050;",
            ">;"
        }
    .end annotation
.end field

.field public final びぐびあび:Landroidx/media/MediaBrowserServiceCompat$てぜきぽく;


# direct methods
.method public static constructor <clinit>()V
    .registers 2

    const-string v0, "MBServiceCompat"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    sput-boolean v0, Landroidx/media/MediaBrowserServiceCompat;->づざかべべ:Z

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    new-instance v0, Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    invoke-direct {v0}, Lづざかべべ/づざかべべ/げつ〴ぬぐ;-><init>()V

    iput-object v0, p0, Landroidx/media/MediaBrowserServiceCompat;->くし〴〺ぅ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    new-instance v0, Landroidx/media/MediaBrowserServiceCompat$てぜきぽく;

    invoke-direct {v0, p0}, Landroidx/media/MediaBrowserServiceCompat$てぜきぽく;-><init>(Landroidx/media/MediaBrowserServiceCompat;)V

    iput-object v0, p0, Landroidx/media/MediaBrowserServiceCompat;->びぐびあび:Landroidx/media/MediaBrowserServiceCompat$てぜきぽく;

    return-void
.end method


# virtual methods
.method public dump(Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .registers 4

    return-void
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .registers 3

    iget-object v0, p0, Landroidx/media/MediaBrowserServiceCompat;->〺つふすそ:Landroidx/media/MediaBrowserServiceCompat$〺つふすそ;

    invoke-interface {v0, p1}, Landroidx/media/MediaBrowserServiceCompat$〺つふすそ;->くし〴〺ぅ(Landroid/content/Intent;)Landroid/os/IBinder;

    move-result-object p1

    return-object p1
.end method

.method public onCreate()V
    .registers 3

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_f

    new-instance v0, Landroidx/media/MediaBrowserServiceCompat$なぎぱいぢぎ;

    invoke-direct {v0, p0}, Landroidx/media/MediaBrowserServiceCompat$なぎぱいぢぎ;-><init>(Landroidx/media/MediaBrowserServiceCompat;)V

    goto :goto_32

    :cond_f
    const/16 v1, 0x1a

    if-lt v0, v1, :cond_19

    new-instance v0, Landroidx/media/MediaBrowserServiceCompat$づざかべべ;

    invoke-direct {v0, p0}, Landroidx/media/MediaBrowserServiceCompat$づざかべべ;-><init>(Landroidx/media/MediaBrowserServiceCompat;)V

    goto :goto_32

    :cond_19
    const/16 v1, 0x17

    if-lt v0, v1, :cond_23

    new-instance v0, Landroidx/media/MediaBrowserServiceCompat$びぐびあび;

    invoke-direct {v0, p0}, Landroidx/media/MediaBrowserServiceCompat$びぐびあび;-><init>(Landroidx/media/MediaBrowserServiceCompat;)V

    goto :goto_32

    :cond_23
    const/16 v1, 0x15

    if-lt v0, v1, :cond_2d

    new-instance v0, Landroidx/media/MediaBrowserServiceCompat$くし〴〺ぅ;

    invoke-direct {v0, p0}, Landroidx/media/MediaBrowserServiceCompat$くし〴〺ぅ;-><init>(Landroidx/media/MediaBrowserServiceCompat;)V

    goto :goto_32

    :cond_2d
    new-instance v0, Landroidx/media/MediaBrowserServiceCompat$ぁごぐすすぃ;

    invoke-direct {v0, p0}, Landroidx/media/MediaBrowserServiceCompat$ぁごぐすすぃ;-><init>(Landroidx/media/MediaBrowserServiceCompat;)V

    :goto_32
    iput-object v0, p0, Landroidx/media/MediaBrowserServiceCompat;->〺つふすそ:Landroidx/media/MediaBrowserServiceCompat$〺つふすそ;

    invoke-interface {v0}, Landroidx/media/MediaBrowserServiceCompat$〺つふすそ;->づざかべべ()V

    return-void
.end method

.method public 〳ぜぞぜべっ()V
    .registers 1

    return-void
.end method

.method public abstract 〺つふすそ(Ljava/lang/String;ILandroid/os/Bundle;)V
.end method

.method public ぁごぐすすぃ()V
    .registers 1

    return-void
.end method

.method public abstract くし〴〺ぅ(Ljava/lang/String;Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroidx/media/MediaBrowserServiceCompat$\u3033\u305c\u305e\u305c\u3079\u3063<",
            "Ljava/util/List<",
            "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;",
            ">;>;)V"
        }
    .end annotation
.end method

.method public げつ〴ぬぐ(Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/os/Bundle;",
            "Landroidx/media/MediaBrowserServiceCompat$\u3033\u305c\u305e\u305c\u3079\u3063<",
            "Landroid/os/Bundle;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-boolean v0, p1, Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;->〺つふすそ:Z

    if-nez v0, :cond_10

    iget-boolean v0, p1, Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;->くし〴〺ぅ:Z

    if-nez v0, :cond_10

    const/4 v0, 0x1

    iput-boolean v0, p1, Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;->くし〴〺ぅ:Z

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;->〺つふすそ(Landroid/os/Bundle;)V

    return-void

    :cond_10
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "sendError() called when either sendResult() or sendError() had already been called for: "

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object p1, p1, Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;->げつ〴ぬぐ:Ljava/lang/Object;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public づざかべべ(Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroidx/media/MediaBrowserServiceCompat$\u3033\u305c\u305e\u305c\u3079\u3063<",
            "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x2

    .line 1
    iput v0, p1, Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;->びぐびあび:I

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;->びぐびあび(Ljava/lang/Object;)V

    return-void
.end method

.method public なぎぱいぢぎ(Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/os/Bundle;",
            "Landroidx/media/MediaBrowserServiceCompat$\u3033\u305c\u305e\u305c\u3079\u3063<",
            "Ljava/util/List<",
            "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;",
            ">;>;)V"
        }
    .end annotation

    const/4 v0, 0x4

    .line 1
    iput v0, p1, Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;->びぐびあび:I

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;->びぐびあび(Ljava/lang/Object;)V

    return-void
.end method

.method public びぐびあび(Ljava/lang/String;Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroidx/media/MediaBrowserServiceCompat$\u3033\u305c\u305e\u305c\u3079\u3063<",
            "Ljava/util/List<",
            "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;",
            ">;>;",
            "Landroid/os/Bundle;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    iput v0, p2, Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;->びぐびあび:I

    .line 2
    invoke-virtual {p0, p1, p2}, Landroidx/media/MediaBrowserServiceCompat;->くし〴〺ぅ(Ljava/lang/String;Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;)V

    return-void
.end method
