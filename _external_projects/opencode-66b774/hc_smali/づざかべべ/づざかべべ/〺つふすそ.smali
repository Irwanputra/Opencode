.class public Lづざかべべ/づざかべべ/〺つふすそ;
.super Lづざかべべ/づざかべべ/ぁごぐすすぃ;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u3065\u3056\u304b\u3079\u3079/\u3065\u3056\u304b\u3079\u3079/\u3041\u3054\u3050\u3059\u3059\u3043<",
        "TE;TE;>;"
    }
.end annotation


# instance fields
.field public final synthetic びぐびあび:Lづざかべべ/づざかべべ/くし〴〺ぅ;


# direct methods
.method public constructor <init>(Lづざかべべ/づざかべべ/くし〴〺ぅ;)V
    .registers 2

    iput-object p1, p0, Lづざかべべ/づざかべべ/〺つふすそ;->びぐびあび:Lづざかべべ/づざかべべ/くし〴〺ぅ;

    invoke-direct {p0}, Lづざかべべ/づざかべべ/ぁごぐすすぃ;-><init>()V

    return-void
.end method


# virtual methods
.method public 〳ぜぞぜべっ(I)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/づざかべべ/〺つふすそ;->びぐびあび:Lづざかべべ/づざかべべ/くし〴〺ぅ;

    invoke-virtual {v0, p1}, Lづざかべべ/づざかべべ/くし〴〺ぅ;->づざかべべ(I)Ljava/lang/Object;

    return-void
.end method

.method public 〺つふすそ(II)Ljava/lang/Object;
    .registers 3

    iget-object p2, p0, Lづざかべべ/づざかべべ/〺つふすそ;->びぐびあび:Lづざかべべ/づざかべべ/くし〴〺ぅ;

    iget-object p2, p2, Lづざかべべ/づざかべべ/くし〴〺ぅ;->くし〴〺ぅ:[Ljava/lang/Object;

    aget-object p1, p2, p1

    return-object p1
.end method

.method public ぁごぐすすぃ(Ljava/lang/Object;Ljava/lang/Object;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;TE;)V"
        }
    .end annotation

    iget-object p2, p0, Lづざかべべ/づざかべべ/〺つふすそ;->びぐびあび:Lづざかべべ/づざかべべ/くし〴〺ぅ;

    invoke-virtual {p2, p1}, Lづざかべべ/づざかべべ/くし〴〺ぅ;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public くし〴〺ぅ()Ljava/util/Map;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "TE;TE;>;"
        }
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "not a map"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public げつ〴ぬぐ()V
    .registers 2

    iget-object v0, p0, Lづざかべべ/づざかべべ/〺つふすそ;->びぐびあび:Lづざかべべ/づざかべべ/くし〴〺ぅ;

    invoke-virtual {v0}, Lづざかべべ/づざかべべ/くし〴〺ぅ;->clear()V

    return-void
.end method

.method public づざかべべ(Ljava/lang/Object;)I
    .registers 3

    iget-object v0, p0, Lづざかべべ/づざかべべ/〺つふすそ;->びぐびあび:Lづざかべべ/づざかべべ/くし〴〺ぅ;

    invoke-virtual {v0, p1}, Lづざかべべ/づざかべべ/くし〴〺ぅ;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public なぎぱいぢぎ(Ljava/lang/Object;)I
    .registers 3

    iget-object v0, p0, Lづざかべべ/づざかべべ/〺つふすそ;->びぐびあび:Lづざかべべ/づざかべべ/くし〴〺ぅ;

    invoke-virtual {v0, p1}, Lづざかべべ/づざかべべ/くし〴〺ぅ;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public びぐびあび()I
    .registers 2

    iget-object v0, p0, Lづざかべべ/づざかべべ/〺つふすそ;->びぐびあび:Lづざかべべ/づざかべべ/くし〴〺ぅ;

    iget v0, v0, Lづざかべべ/づざかべべ/くし〴〺ぅ;->びぐびあび:I

    return v0
.end method

.method public ぺぁあねじ(ILjava/lang/Object;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)TE;"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "not a map"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
