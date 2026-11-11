.class public Landroidx/lifecycle/LiveData$LifecycleBoundObserver;
.super Landroidx/lifecycle/LiveData$げつ〴ぬぐ;
.source ""

# interfaces
.implements Lづざかべべ/のぷのちつ/づざかべべ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/LiveData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "LifecycleBoundObserver"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/lifecycle/LiveData<",
        "TT;>.\u3052\u3064\u3034\u306c\u3050;",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final づざかべべ:Lづざかべべ/のぷのちつ/ぁごぐすすぃ;

.field public final synthetic なぎぱいぢぎ:Landroidx/lifecycle/LiveData;


# virtual methods
.method public いいにぽつ()Z
    .registers 3

    iget-object v0, p0, Landroidx/lifecycle/LiveData$LifecycleBoundObserver;->づざかべべ:Lづざかべべ/のぷのちつ/ぁごぐすすぃ;

    invoke-interface {v0}, Lづざかべべ/のぷのちつ/ぁごぐすすぃ;->くし〴〺ぅ()Lづざかべべ/のぷのちつ/びぐびあび;

    move-result-object v0

    check-cast v0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    .line 1
    iget-object v0, v0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->〺つふすそ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    .line 2
    sget-object v1, Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;->づざかべべ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    .line 3
    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-ltz v0, :cond_14

    const/4 v0, 0x1

    goto :goto_15

    :cond_14
    const/4 v0, 0x0

    :goto_15
    return v0
.end method

.method public びぐびあび(Lづざかべべ/のぷのちつ/ぁごぐすすぃ;Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;)V
    .registers 3

    iget-object p1, p0, Landroidx/lifecycle/LiveData$LifecycleBoundObserver;->づざかべべ:Lづざかべべ/のぷのちつ/ぁごぐすすぃ;

    invoke-interface {p1}, Lづざかべべ/のぷのちつ/ぁごぐすすぃ;->くし〴〺ぅ()Lづざかべべ/のぷのちつ/びぐびあび;

    move-result-object p1

    check-cast p1, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    .line 1
    iget-object p1, p1, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->〺つふすそ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    .line 2
    sget-object p2, Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;->〺つふすそ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    if-ne p1, p2, :cond_16

    iget-object p1, p0, Landroidx/lifecycle/LiveData$LifecycleBoundObserver;->なぎぱいぢぎ:Landroidx/lifecycle/LiveData;

    iget-object p2, p0, Landroidx/lifecycle/LiveData$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/のぷのちつ/のぷのちつ;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/LiveData;->なぎぱいぢぎ(Lづざかべべ/のぷのちつ/のぷのちつ;)V

    return-void

    :cond_16
    invoke-virtual {p0}, Landroidx/lifecycle/LiveData$LifecycleBoundObserver;->いいにぽつ()Z

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/lifecycle/LiveData$げつ〴ぬぐ;->〳ぜぞぜべっ(Z)V

    return-void
.end method

.method public ぺぁあねじ()V
    .registers 2

    iget-object v0, p0, Landroidx/lifecycle/LiveData$LifecycleBoundObserver;->づざかべべ:Lづざかべべ/のぷのちつ/ぁごぐすすぃ;

    invoke-interface {v0}, Lづざかべべ/のぷのちつ/ぁごぐすすぃ;->くし〴〺ぅ()Lづざかべべ/のぷのちつ/びぐびあび;

    move-result-object v0

    check-cast v0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    .line 1
    iget-object v0, v0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->げつ〴ぬぐ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;

    invoke-virtual {v0, p0}, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;->びぐびあび(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
