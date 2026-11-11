.class public final Lづざかべべ/ぉざぅち〻/〺つふすそ;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final 〺つふすそ:Lづざかべべ/ぉざぅち〻/げつ〴ぬぐ;

.field public final げつ〴ぬぐ:Lづざかべべ/ぉざぅち〻/くし〴〺ぅ;


# direct methods
.method public constructor <init>(Lづざかべべ/ぉざぅち〻/くし〴〺ぅ;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lづざかべべ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/ぉざぅち〻/くし〴〺ぅ;

    new-instance p1, Lづざかべべ/ぉざぅち〻/げつ〴ぬぐ;

    invoke-direct {p1}, Lづざかべべ/ぉざぅち〻/げつ〴ぬぐ;-><init>()V

    iput-object p1, p0, Lづざかべべ/ぉざぅち〻/〺つふすそ;->〺つふすそ:Lづざかべべ/ぉざぅち〻/げつ〴ぬぐ;

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Landroid/os/Bundle;)V
    .registers 6

    iget-object v0, p0, Lづざかべべ/ぉざぅち〻/〺つふすそ;->〺つふすそ:Lづざかべべ/ぉざぅち〻/げつ〴ぬぐ;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iget-object v2, v0, Lづざかべべ/ぉざぅち〻/げつ〴ぬぐ;->〺つふすそ:Landroid/os/Bundle;

    if-eqz v2, :cond_11

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_11
    iget-object v0, v0, Lづざかべべ/ぉざぅち〻/げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;

    invoke-virtual {v0}, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;->〺つふすそ()Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$びぐびあび;

    move-result-object v0

    :goto_17
    invoke-virtual {v0}, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$びぐびあび;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_37

    invoke-virtual {v0}, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$びぐびあび;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lづざかべべ/ぉざぅち〻/げつ〴ぬぐ$〺つふすそ;

    invoke-interface {v2}, Lづざかべべ/ぉざぅち〻/げつ〴ぬぐ$〺つふすそ;->げつ〴ぬぐ()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_17

    :cond_37
    const-string v0, "androidx.lifecycle.BundlableSavedStateRegistry.key"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public げつ〴ぬぐ(Landroid/os/Bundle;)V
    .registers 5

    iget-object v0, p0, Lづざかべべ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/ぉざぅち〻/くし〴〺ぅ;

    invoke-interface {v0}, Lづざかべべ/のぷのちつ/ぁごぐすすぃ;->くし〴〺ぅ()Lづざかべべ/のぷのちつ/びぐびあび;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;

    .line 1
    iget-object v1, v1, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->〺つふすそ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    .line 2
    sget-object v2, Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;->くし〴〺ぅ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    if-ne v1, v2, :cond_3d

    new-instance v1, Landroidx/savedstate/Recreator;

    iget-object v2, p0, Lづざかべべ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/ぉざぅち〻/くし〴〺ぅ;

    invoke-direct {v1, v2}, Landroidx/savedstate/Recreator;-><init>(Lづざかべべ/ぉざぅち〻/くし〴〺ぅ;)V

    invoke-virtual {v0, v1}, Lづざかべべ/のぷのちつ/びぐびあび;->げつ〴ぬぐ(Lづざかべべ/のぷのちつ/なぎぱいぢぎ;)V

    iget-object v1, p0, Lづざかべべ/ぉざぅち〻/〺つふすそ;->〺つふすそ:Lづざかべべ/ぉざぅち〻/げつ〴ぬぐ;

    .line 3
    iget-boolean v2, v1, Lづざかべべ/ぉざぅち〻/げつ〴ぬぐ;->くし〴〺ぅ:Z

    if-nez v2, :cond_35

    if-eqz p1, :cond_29

    const-string v2, "androidx.lifecycle.BundlableSavedStateRegistry.key"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    iput-object p1, v1, Lづざかべべ/ぉざぅち〻/げつ〴ぬぐ;->〺つふすそ:Landroid/os/Bundle;

    :cond_29
    new-instance p1, Landroidx/savedstate/SavedStateRegistry$1;

    invoke-direct {p1, v1}, Landroidx/savedstate/SavedStateRegistry$1;-><init>(Lづざかべべ/ぉざぅち〻/げつ〴ぬぐ;)V

    invoke-virtual {v0, p1}, Lづざかべべ/のぷのちつ/びぐびあび;->げつ〴ぬぐ(Lづざかべべ/のぷのちつ/なぎぱいぢぎ;)V

    const/4 p1, 0x1

    iput-boolean p1, v1, Lづざかべべ/ぉざぅち〻/げつ〴ぬぐ;->くし〴〺ぅ:Z

    return-void

    :cond_35
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "SavedStateRegistry was already restored."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 4
    :cond_3d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Restarter must be created only during owner\'s initialization stage"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
