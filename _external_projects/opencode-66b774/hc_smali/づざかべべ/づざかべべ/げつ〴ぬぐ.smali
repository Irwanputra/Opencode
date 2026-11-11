.class public Lづざかべべ/づざかべべ/げつ〴ぬぐ;
.super Lづざかべべ/づざかべべ/〳ぜぞぜべっ;
.source ""

# interfaces
.implements Ljava/util/Map;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "L\u3065\u3056\u304b\u3079\u3079/\u3065\u3056\u304b\u3079\u3079/\u3033\u305c\u305e\u305c\u3079\u3063<",
        "TK;TV;>;",
        "Ljava/util/Map<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field public ぺぁあねじ:Lづざかべべ/づざかべべ/ぁごぐすすぃ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u3065\u3056\u304b\u3079\u3079/\u3065\u3056\u304b\u3079\u3079/\u3041\u3054\u3050\u3059\u3059\u3043<",
            "TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .registers 2

    invoke-direct {p0, p1}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lづざかべべ/づざかべべ/〳ぜぞぜべっ;)V
    .registers 6

    .line 1
    invoke-direct {p0}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;-><init>()V

    if-eqz p1, :cond_37

    .line 2
    iget v0, p1, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->びぐびあび:I

    iget v1, p0, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->びぐびあび:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->〺つふすそ(I)V

    iget v1, p0, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->びぐびあび:I

    const/4 v2, 0x0

    if-nez v1, :cond_27

    if-lez v0, :cond_37

    iget-object v1, p1, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->〺つふすそ:[I

    iget-object v3, p0, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->〺つふすそ:[I

    invoke-static {v1, v2, v3, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p1, p1, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->くし〴〺ぅ:[Ljava/lang/Object;

    iget-object v1, p0, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->くし〴〺ぅ:[Ljava/lang/Object;

    shl-int/lit8 v3, v0, 0x1

    invoke-static {p1, v2, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput v0, p0, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->びぐびあび:I

    goto :goto_37

    :cond_27
    :goto_27
    if-ge v2, v0, :cond_37

    invoke-virtual {p1, v2}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->〳ぜぞぜべっ(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v2}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->ぺふねづ〺(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v1, v3}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_27

    :cond_37
    :goto_37
    return-void
.end method


# virtual methods
.method public entrySet()Ljava/util/Set;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lづざかべべ/づざかべべ/げつ〴ぬぐ;->てぜきぽく()Lづざかべべ/づざかべべ/ぁごぐすすぃ;

    move-result-object v0

    .line 1
    iget-object v1, v0, Lづざかべべ/づざかべべ/ぁごぐすすぃ;->げつ〴ぬぐ:Lづざかべべ/づざかべべ/ぁごぐすすぃ$〺つふすそ;

    if-nez v1, :cond_f

    new-instance v1, Lづざかべべ/づざかべべ/ぁごぐすすぃ$〺つふすそ;

    invoke-direct {v1, v0}, Lづざかべべ/づざかべべ/ぁごぐすすぃ$〺つふすそ;-><init>(Lづざかべべ/づざかべべ/ぁごぐすすぃ;)V

    iput-object v1, v0, Lづざかべべ/づざかべべ/ぁごぐすすぃ;->げつ〴ぬぐ:Lづざかべべ/づざかべべ/ぁごぐすすぃ$〺つふすそ;

    :cond_f
    iget-object v0, v0, Lづざかべべ/づざかべべ/ぁごぐすすぃ;->げつ〴ぬぐ:Lづざかべべ/づざかべべ/ぁごぐすすぃ$〺つふすそ;

    return-object v0
.end method

.method public keySet()Ljava/util/Set;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "TK;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lづざかべべ/づざかべべ/げつ〴ぬぐ;->てぜきぽく()Lづざかべべ/づざかべべ/ぁごぐすすぃ;

    move-result-object v0

    .line 1
    iget-object v1, v0, Lづざかべべ/づざかべべ/ぁごぐすすぃ;->〺つふすそ:Lづざかべべ/づざかべべ/ぁごぐすすぃ$くし〴〺ぅ;

    if-nez v1, :cond_f

    new-instance v1, Lづざかべべ/づざかべべ/ぁごぐすすぃ$くし〴〺ぅ;

    invoke-direct {v1, v0}, Lづざかべべ/づざかべべ/ぁごぐすすぃ$くし〴〺ぅ;-><init>(Lづざかべべ/づざかべべ/ぁごぐすすぃ;)V

    iput-object v1, v0, Lづざかべべ/づざかべべ/ぁごぐすすぃ;->〺つふすそ:Lづざかべべ/づざかべべ/ぁごぐすすぃ$くし〴〺ぅ;

    :cond_f
    iget-object v0, v0, Lづざかべべ/づざかべべ/ぁごぐすすぃ;->〺つふすそ:Lづざかべべ/づざかべべ/ぁごぐすすぃ$くし〴〺ぅ;

    return-object v0
.end method

.method public putAll(Ljava/util/Map;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "+TK;+TV;>;)V"
        }
    .end annotation

    iget v0, p0, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->びぐびあび:I

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->〺つふすそ(I)V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_12
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_12

    :cond_2a
    return-void
.end method

.method public values()Ljava/util/Collection;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lづざかべべ/づざかべべ/げつ〴ぬぐ;->てぜきぽく()Lづざかべべ/づざかべべ/ぁごぐすすぃ;

    move-result-object v0

    .line 1
    iget-object v1, v0, Lづざかべべ/づざかべべ/ぁごぐすすぃ;->くし〴〺ぅ:Lづざかべべ/づざかべべ/ぁごぐすすぃ$づざかべべ;

    if-nez v1, :cond_f

    new-instance v1, Lづざかべべ/づざかべべ/ぁごぐすすぃ$づざかべべ;

    invoke-direct {v1, v0}, Lづざかべべ/づざかべべ/ぁごぐすすぃ$づざかべべ;-><init>(Lづざかべべ/づざかべべ/ぁごぐすすぃ;)V

    iput-object v1, v0, Lづざかべべ/づざかべべ/ぁごぐすすぃ;->くし〴〺ぅ:Lづざかべべ/づざかべべ/ぁごぐすすぃ$づざかべべ;

    :cond_f
    iget-object v0, v0, Lづざかべべ/づざかべべ/ぁごぐすすぃ;->くし〴〺ぅ:Lづざかべべ/づざかべべ/ぁごぐすすぃ$づざかべべ;

    return-object v0
.end method

.method public final てぜきぽく()Lづざかべべ/づざかべべ/ぁごぐすすぃ;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "L\u3065\u3056\u304b\u3079\u3079/\u3065\u3056\u304b\u3079\u3079/\u3041\u3054\u3050\u3059\u3059\u3043<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lづざかべべ/づざかべべ/げつ〴ぬぐ;->ぺぁあねじ:Lづざかべべ/づざかべべ/ぁごぐすすぃ;

    if-nez v0, :cond_b

    new-instance v0, Lづざかべべ/づざかべべ/げつ〴ぬぐ$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Lづざかべべ/づざかべべ/げつ〴ぬぐ$げつ〴ぬぐ;-><init>(Lづざかべべ/づざかべべ/げつ〴ぬぐ;)V

    iput-object v0, p0, Lづざかべべ/づざかべべ/げつ〴ぬぐ;->ぺぁあねじ:Lづざかべべ/づざかべべ/ぁごぐすすぃ;

    :cond_b
    iget-object v0, p0, Lづざかべべ/づざかべべ/げつ〴ぬぐ;->ぺぁあねじ:Lづざかべべ/づざかべべ/ぁごぐすすぃ;

    return-object v0
.end method
