.class public Landroid/support/v4/media/MediaBrowserCompat$ぺぁあねじ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/MediaBrowserCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u307a\u3041\u3042\u306d\u3058"
.end annotation


# instance fields
.field public 〺つふすそ:Landroid/os/Bundle;

.field public げつ〴ぬぐ:Landroid/os/Messenger;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;Landroid/os/Bundle;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Messenger;

    invoke-direct {v0, p1}, Landroid/os/Messenger;-><init>(Landroid/os/IBinder;)V

    iput-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$ぺぁあねじ;->げつ〴ぬぐ:Landroid/os/Messenger;

    iput-object p2, p0, Landroid/support/v4/media/MediaBrowserCompat$ぺぁあねじ;->〺つふすそ:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final げつ〴ぬぐ(ILandroid/os/Bundle;Landroid/os/Messenger;)V
    .registers 5

    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    iput p1, v0, Landroid/os/Message;->what:I

    const/4 p1, 0x1

    iput p1, v0, Landroid/os/Message;->arg1:I

    invoke-virtual {v0, p2}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    iput-object p3, v0, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    iget-object p1, p0, Landroid/support/v4/media/MediaBrowserCompat$ぺぁあねじ;->げつ〴ぬぐ:Landroid/os/Messenger;

    invoke-virtual {p1, v0}, Landroid/os/Messenger;->send(Landroid/os/Message;)V

    return-void
.end method
