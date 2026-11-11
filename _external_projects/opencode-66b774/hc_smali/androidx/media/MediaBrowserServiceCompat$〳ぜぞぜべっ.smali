.class public Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media/MediaBrowserServiceCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3033\u305c\u305e\u305c\u3079\u3063"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public 〺つふすそ:Z

.field public くし〴〺ぅ:Z

.field public final げつ〴ぬぐ:Ljava/lang/Object;

.field public びぐびあび:I


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;->げつ〴ぬぐ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Landroid/os/Bundle;)V
    .registers 4

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "It is not supported to send an error for "

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;->げつ〴ぬぐ:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public くし〴〺ぅ(Ljava/lang/Object;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    const p0, 0x0

    throw p0
.end method

.method public げつ〴ぬぐ()Z
    .registers 2

    iget-boolean v0, p0, Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;->〺つふすそ:Z

    if-nez v0, :cond_b

    iget-boolean v0, p0, Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;->くし〴〺ぅ:Z

    if-eqz v0, :cond_9

    goto :goto_b

    :cond_9
    const/4 v0, 0x0

    goto :goto_c

    :cond_b
    :goto_b
    const/4 v0, 0x1

    :goto_c
    return v0
.end method

.method public びぐびあび(Ljava/lang/Object;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-boolean p1, p0, Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;->〺つふすそ:Z

    if-nez p1, :cond_10

    iget-boolean p1, p0, Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;->くし〴〺ぅ:Z

    if-nez p1, :cond_10

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;->〺つふすそ:Z

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;->くし〴〺ぅ(Ljava/lang/Object;)V

    return-void

    :cond_10
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "sendResult() called when either sendResult() or sendError() had already been called for: "

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Landroidx/media/MediaBrowserServiceCompat$〳ぜぞぜべっ;->げつ〴ぬぐ:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
