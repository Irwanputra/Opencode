.class public Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/なぎぱいぢぎ;
.super Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "L\u3073\u3050\u3073\u3042\u3073/\u3052\u3064\u3034\u306c\u3050/\u3052\u3064\u3034\u306c\u3050/\u3052\u3064\u3034\u306c\u3050/\u3065\u3056\u304b\u3079\u3079;",
        ">",
        "L\u3073\u3050\u3073\u3042\u3073/\u3052\u3064\u3034\u306c\u3050/\u3052\u3064\u3034\u306c\u3050/\u3052\u3064\u3034\u306c\u3050/\u3073\u3050\u3073\u3042\u3073<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;-><init>(Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;)V

    return-void
.end method


# virtual methods
.method public onChildrenLoaded(Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroid/media/browse/MediaBrowser$MediaItem;",
            ">;",
            "Landroid/os/Bundle;",
            ")V"
        }
    .end annotation

    invoke-static {p3}, Landroid/support/v4/media/session/MediaSessionCompat;->げつ〴ぬぐ(Landroid/os/Bundle;)V

    iget-object v0, p0, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->げつ〴ぬぐ:Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;

    check-cast v0, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    invoke-interface {v0, p1, p2, p3}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ(Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;)V

    return-void
.end method

.method public onError(Ljava/lang/String;Landroid/os/Bundle;)V
    .registers 4

    invoke-static {p2}, Landroid/support/v4/media/session/MediaSessionCompat;->げつ〴ぬぐ(Landroid/os/Bundle;)V

    iget-object v0, p0, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/びぐびあび;->げつ〴ぬぐ:Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/くし〴〺ぅ;

    check-cast v0, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    invoke-interface {v0, p1, p2}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->〺つふすそ(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
