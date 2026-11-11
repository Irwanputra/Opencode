.class public final Lづざかべべ/づざかべべ/ぁごぐすすぃ$くし〴〺ぅ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Set;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/づざかべべ/ぁごぐすすぃ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u304f\u3057\u3034\u303a\u3045"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Set<",
        "TK;>;"
    }
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lづざかべべ/づざかべべ/ぁごぐすすぃ;


# direct methods
.method public constructor <init>(Lづざかべべ/づざかべべ/ぁごぐすすぃ;)V
    .registers 2

    iput-object p1, p0, Lづざかべべ/づざかべべ/ぁごぐすすぃ$くし〴〺ぅ;->〺つふすそ:Lづざかべべ/づざかべべ/ぁごぐすすぃ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public add(Ljava/lang/Object;)Z
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)Z"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public addAll(Ljava/util/Collection;)Z
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+TK;>;)Z"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public clear()V
    .registers 2

    iget-object v0, p0, Lづざかべべ/づざかべべ/ぁごぐすすぃ$くし〴〺ぅ;->〺つふすそ:Lづざかべべ/づざかべべ/ぁごぐすすぃ;

    invoke-virtual {v0}, Lづざかべべ/づざかべべ/ぁごぐすすぃ;->げつ〴ぬぐ()V

    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .registers 3

    iget-object v0, p0, Lづざかべべ/づざかべべ/ぁごぐすすぃ$くし〴〺ぅ;->〺つふすそ:Lづざかべべ/づざかべべ/ぁごぐすすぃ;

    invoke-virtual {v0, p1}, Lづざかべべ/づざかべべ/ぁごぐすすぃ;->づざかべべ(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_a

    const/4 p1, 0x1

    goto :goto_b

    :cond_a
    const/4 p1, 0x0

    :goto_b
    return p1
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    iget-object v0, p0, Lづざかべべ/づざかべべ/ぁごぐすすぃ$くし〴〺ぅ;->〺つふすそ:Lづざかべべ/づざかべべ/ぁごぐすすぃ;

    invoke-virtual {v0}, Lづざかべべ/づざかべべ/ぁごぐすすぃ;->くし〴〺ぅ()Ljava/util/Map;

    move-result-object v0

    .line 1
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    const/4 p1, 0x0

    goto :goto_1d

    :cond_1c
    const/4 p1, 0x1

    :goto_1d
    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 2

    invoke-static {p0, p1}, Lづざかべべ/づざかべべ/ぁごぐすすぃ;->いいにぽつ(Ljava/util/Set;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .registers 5

    iget-object v0, p0, Lづざかべべ/づざかべべ/ぁごぐすすぃ$くし〴〺ぅ;->〺つふすそ:Lづざかべべ/づざかべべ/ぁごぐすすぃ;

    invoke-virtual {v0}, Lづざかべべ/づざかべべ/ぁごぐすすぃ;->びぐびあび()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_a
    if-ltz v0, :cond_1e

    iget-object v3, p0, Lづざかべべ/づざかべべ/ぁごぐすすぃ$くし〴〺ぅ;->〺つふすそ:Lづざかべべ/づざかべべ/ぁごぐすすぃ;

    invoke-virtual {v3, v0, v1}, Lづざかべべ/づざかべべ/ぁごぐすすぃ;->〺つふすそ(II)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_16

    const/4 v3, 0x0

    goto :goto_1a

    :cond_16
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1a
    add-int/2addr v2, v3

    add-int/lit8 v0, v0, -0x1

    goto :goto_a

    :cond_1e
    return v2
.end method

.method public isEmpty()Z
    .registers 2

    iget-object v0, p0, Lづざかべべ/づざかべべ/ぁごぐすすぃ$くし〴〺ぅ;->〺つふすそ:Lづざかべべ/づざかべべ/ぁごぐすすぃ;

    invoke-virtual {v0}, Lづざかべべ/づざかべべ/ぁごぐすすぃ;->びぐびあび()I

    move-result v0

    if-nez v0, :cond_a

    const/4 v0, 0x1

    goto :goto_b

    :cond_a
    const/4 v0, 0x0

    :goto_b
    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TK;>;"
        }
    .end annotation

    new-instance v0, Lづざかべべ/づざかべべ/ぁごぐすすぃ$げつ〴ぬぐ;

    iget-object v1, p0, Lづざかべべ/づざかべべ/ぁごぐすすぃ$くし〴〺ぅ;->〺つふすそ:Lづざかべべ/づざかべべ/ぁごぐすすぃ;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lづざかべべ/づざかべべ/ぁごぐすすぃ$げつ〴ぬぐ;-><init>(Lづざかべべ/づざかべべ/ぁごぐすすぃ;I)V

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .registers 3

    iget-object v0, p0, Lづざかべべ/づざかべべ/ぁごぐすすぃ$くし〴〺ぅ;->〺つふすそ:Lづざかべべ/づざかべべ/ぁごぐすすぃ;

    invoke-virtual {v0, p1}, Lづざかべべ/づざかべべ/ぁごぐすすぃ;->づざかべべ(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_f

    iget-object v0, p0, Lづざかべべ/づざかべべ/ぁごぐすすぃ$くし〴〺ぅ;->〺つふすそ:Lづざかべべ/づざかべべ/ぁごぐすすぃ;

    invoke-virtual {v0, p1}, Lづざかべべ/づざかべべ/ぁごぐすすぃ;->〳ぜぞぜべっ(I)V

    const/4 p1, 0x1

    return p1

    :cond_f
    const/4 p1, 0x0

    return p1
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    iget-object v0, p0, Lづざかべべ/づざかべべ/ぁごぐすすぃ$くし〴〺ぅ;->〺つふすそ:Lづざかべべ/づざかべべ/ぁごぐすすぃ;

    invoke-virtual {v0}, Lづざかべべ/づざかべべ/ぁごぐすすぃ;->くし〴〺ぅ()Ljava/util/Map;

    move-result-object v0

    .line 1
    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_e
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_e

    :cond_1c
    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result p1

    if-eq v1, p1, :cond_24

    const/4 p1, 0x1

    goto :goto_25

    :cond_24
    const/4 p1, 0x0

    :goto_25
    return p1
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    iget-object v0, p0, Lづざかべべ/づざかべべ/ぁごぐすすぃ$くし〴〺ぅ;->〺つふすそ:Lづざかべべ/づざかべべ/ぁごぐすすぃ;

    invoke-virtual {v0}, Lづざかべべ/づざかべべ/ぁごぐすすぃ;->くし〴〺ぅ()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0, p1}, Lづざかべべ/づざかべべ/ぁごぐすすぃ;->ぺふねづ〺(Ljava/util/Map;Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public size()I
    .registers 2

    iget-object v0, p0, Lづざかべべ/づざかべべ/ぁごぐすすぃ$くし〴〺ぅ;->〺つふすそ:Lづざかべべ/づざかべべ/ぁごぐすすぃ;

    invoke-virtual {v0}, Lづざかべべ/づざかべべ/ぁごぐすすぃ;->びぐびあび()I

    move-result v0

    return v0
.end method

.method public toArray()[Ljava/lang/Object;
    .registers 3

    iget-object v0, p0, Lづざかべべ/づざかべべ/ぁごぐすすぃ$くし〴〺ぅ;->〺つふすそ:Lづざかべべ/づざかべべ/ぁごぐすすぃ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lづざかべべ/づざかべべ/ぁごぐすすぃ;->てぜきぽく(I)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    iget-object v0, p0, Lづざかべべ/づざかべべ/ぁごぐすすぃ$くし〴〺ぅ;->〺つふすそ:Lづざかべべ/づざかべべ/ぁごぐすすぃ;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lづざかべべ/づざかべべ/ぁごぐすすぃ;->のぷのちつ([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
