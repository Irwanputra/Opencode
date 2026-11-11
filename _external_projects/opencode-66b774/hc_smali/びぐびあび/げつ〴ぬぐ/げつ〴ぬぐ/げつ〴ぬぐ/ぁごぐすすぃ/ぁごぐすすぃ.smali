.class public Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぁごぐすすぃ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/びぐびあび;


# instance fields
.field public げつ〴ぬぐ:Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/〺つふすそ;


# direct methods
.method public constructor <init>(Landroid/support/v4/media/session/MediaSessionCompat$Token;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1
    iget-object p1, p1, Landroid/support/v4/media/session/MediaSessionCompat$Token;->〺つふすそ:Ljava/lang/Object;

    .line 2
    check-cast p1, Landroid/os/IBinder;

    invoke-static {p1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/〺つふすそ$げつ〴ぬぐ;->〺つふすそ(Landroid/os/IBinder;)Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/〺つふすそ;

    move-result-object p1

    iput-object p1, p0, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぁごぐすすぃ;->げつ〴ぬぐ:Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/〺つふすそ;

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(Landroid/view/KeyEvent;)Z
    .registers 3

    :try_start_0
    iget-object v0, p0, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぁごぐすすぃ;->げつ〴ぬぐ:Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/〺つふすそ;

    invoke-interface {v0, p1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/〺つふすそ;->どぇぞほだ(Landroid/view/KeyEvent;)Z
    :try_end_5
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_5} :catch_5

    :catch_5
    const/4 p1, 0x0

    return p1
.end method
