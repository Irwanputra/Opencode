.class public final Lづざかべべ/づざかべべ/ぁごぐすすぃ$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/づざかべべ/ぁごぐすすぃ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final 〺つふすそ:I

.field public くし〴〺ぅ:I

.field public づざかべべ:Z

.field public final synthetic なぎぱいぢぎ:Lづざかべべ/づざかべべ/ぁごぐすすぃ;

.field public びぐびあび:I


# direct methods
.method public constructor <init>(Lづざかべべ/づざかべべ/ぁごぐすすぃ;I)V
    .registers 4

    iput-object p1, p0, Lづざかべべ/づざかべべ/ぁごぐすすぃ$げつ〴ぬぐ;->なぎぱいぢぎ:Lづざかべべ/づざかべべ/ぁごぐすすぃ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lづざかべべ/づざかべべ/ぁごぐすすぃ$げつ〴ぬぐ;->づざかべべ:Z

    iput p2, p0, Lづざかべべ/づざかべべ/ぁごぐすすぃ$げつ〴ぬぐ;->〺つふすそ:I

    invoke-virtual {p1}, Lづざかべべ/づざかべべ/ぁごぐすすぃ;->びぐびあび()I

    move-result p1

    iput p1, p0, Lづざかべべ/づざかべべ/ぁごぐすすぃ$げつ〴ぬぐ;->くし〴〺ぅ:I

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .registers 3

    iget v0, p0, Lづざかべべ/づざかべべ/ぁごぐすすぃ$げつ〴ぬぐ;->びぐびあび:I

    iget v1, p0, Lづざかべべ/づざかべべ/ぁごぐすすぃ$げつ〴ぬぐ;->くし〴〺ぅ:I

    if-ge v0, v1, :cond_8

    const/4 v0, 0x1

    goto :goto_9

    :cond_8
    const/4 v0, 0x0

    :goto_9
    return v0
.end method

.method public next()Ljava/lang/Object;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lづざかべべ/づざかべべ/ぁごぐすすぃ$げつ〴ぬぐ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_19

    iget-object v0, p0, Lづざかべべ/づざかべべ/ぁごぐすすぃ$げつ〴ぬぐ;->なぎぱいぢぎ:Lづざかべべ/づざかべべ/ぁごぐすすぃ;

    iget v1, p0, Lづざかべべ/づざかべべ/ぁごぐすすぃ$げつ〴ぬぐ;->びぐびあび:I

    iget v2, p0, Lづざかべべ/づざかべべ/ぁごぐすすぃ$げつ〴ぬぐ;->〺つふすそ:I

    invoke-virtual {v0, v1, v2}, Lづざかべべ/づざかべべ/ぁごぐすすぃ;->〺つふすそ(II)Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lづざかべべ/づざかべべ/ぁごぐすすぃ$げつ〴ぬぐ;->びぐびあび:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, p0, Lづざかべべ/づざかべべ/ぁごぐすすぃ$げつ〴ぬぐ;->びぐびあび:I

    iput-boolean v2, p0, Lづざかべべ/づざかべべ/ぁごぐすすぃ$げつ〴ぬぐ;->づざかべべ:Z

    return-object v0

    :cond_19
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public remove()V
    .registers 3

    iget-boolean v0, p0, Lづざかべべ/づざかべべ/ぁごぐすすぃ$げつ〴ぬぐ;->づざかべべ:Z

    if-eqz v0, :cond_19

    iget v0, p0, Lづざかべべ/づざかべべ/ぁごぐすすぃ$げつ〴ぬぐ;->びぐびあび:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lづざかべべ/づざかべべ/ぁごぐすすぃ$げつ〴ぬぐ;->びぐびあび:I

    iget v1, p0, Lづざかべべ/づざかべべ/ぁごぐすすぃ$げつ〴ぬぐ;->くし〴〺ぅ:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lづざかべべ/づざかべべ/ぁごぐすすぃ$げつ〴ぬぐ;->くし〴〺ぅ:I

    const/4 v1, 0x0

    iput-boolean v1, p0, Lづざかべべ/づざかべべ/ぁごぐすすぃ$げつ〴ぬぐ;->づざかべべ:Z

    iget-object v1, p0, Lづざかべべ/づざかべべ/ぁごぐすすぃ$げつ〴ぬぐ;->なぎぱいぢぎ:Lづざかべべ/づざかべべ/ぁごぐすすぃ;

    invoke-virtual {v1, v0}, Lづざかべべ/づざかべべ/ぁごぐすすぃ;->〳ぜぞぜべっ(I)V

    return-void

    :cond_19
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
