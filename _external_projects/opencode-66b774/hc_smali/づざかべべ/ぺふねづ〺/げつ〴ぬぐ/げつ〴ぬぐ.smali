.class public final Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;
.super Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;
.source ""

# interfaces
.implements Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$〳ぜぞぜべっ;


# instance fields
.field public final ぉざぅち〻:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

.field public ざとぅぼこ〺:Z

.field public は〲ぱなで:I


# direct methods
.method public constructor <init>(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;)V
    .registers 3

    invoke-direct {p0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->は〲ぱなで:I

    iput-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->ぉざぅち〻:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    return-void
.end method

.method public static ぇぬぎばつ(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;)Z
    .registers 2

    iget-object p0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->〺つふすそ:Landroidx/fragment/app/Fragment;

    if-eqz p0, :cond_16

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->てぜきぽく:Z

    if-eqz v0, :cond_16

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->ぉひのべい:Landroid/view/View;

    if-eqz v0, :cond_16

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->びえぁぜい:Z

    if-nez v0, :cond_16

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->ぇ〳〲〺すっ:Z

    if-nez v0, :cond_16

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->おかぷせ〱:Landroidx/fragment/app/Fragment$げつ〴ぬぐ;

    :cond_16
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 3

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "BackStackEntry{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->は〲ぱなで:I

    if-ltz v1, :cond_25

    const-string v1, " #"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->は〲ぱなで:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_25
    iget-object v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->ぺぁあねじ:Ljava/lang/String;

    if-eqz v1, :cond_33

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->ぺぁあねじ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_33
    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public 〳ぜぞぜべっ(Landroidx/fragment/app/Fragment;Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;)Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;
    .registers 5

    iget-object v0, p1, Landroidx/fragment/app/Fragment;->は〲ぱなで:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    iget-object v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->ぉざぅち〻:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    if-ne v0, v1, :cond_35

    sget-object v0, Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;->びぐびあび:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    .line 1
    invoke-virtual {p2, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-ltz v1, :cond_10

    const/4 v1, 0x1

    goto :goto_11

    :cond_10
    const/4 v1, 0x0

    :goto_11
    if-eqz v1, :cond_1e

    .line 2
    new-instance v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;

    const/16 v1, 0xa

    invoke-direct {v0, v1, p1, p2}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;-><init>(ILandroidx/fragment/app/Fragment;Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;)V

    invoke-virtual {p0, v0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->〺つふすそ(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;)V

    return-object p0

    .line 3
    :cond_1e
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot set maximum Lifecycle below "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_35
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Cannot setMaxLifecycle for Fragment not attached to FragmentManager "

    invoke-static {p2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->ぉざぅち〻:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ぁごぐすすぃ(Landroidx/fragment/app/Fragment;)Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;
    .registers 4

    iget-object v0, p1, Landroidx/fragment/app/Fragment;->は〲ぱなで:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    if-eqz v0, :cond_25

    iget-object v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->ぉざぅち〻:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    if-ne v0, v1, :cond_9

    goto :goto_25

    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot remove Fragment attached to a different FragmentManager. Fragment "

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " is already attached to a FragmentManager."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1
    :cond_25
    :goto_25
    new-instance v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;-><init>(ILandroidx/fragment/app/Fragment;)V

    invoke-virtual {p0, v0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->〺つふすそ(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;)V

    return-object p0
.end method

.method public いいにぽつ(Z)I
    .registers 6

    iget-boolean v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->ざとぅぼこ〺:Z

    if-nez v0, :cond_58

    sget-object v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->せづっ〸ちね:Landroid/view/animation/Interpolator;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->ざとぅぼこ〺:Z

    iget-boolean v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->〳ぜぞぜべっ:Z

    const/4 v1, -0x1

    if-eqz v0, :cond_4e

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->ぉざぅち〻:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    .line 1
    monitor-enter v0

    :try_start_11
    iget-object v2, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->へぬ〴づぞ:Ljava/util/ArrayList;

    if-eqz v2, :cond_33

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-gtz v2, :cond_1c

    goto :goto_33

    :cond_1c
    iget-object v2, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->へぬ〴づぞ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/2addr v3, v1

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v2, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->のぷのちつ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1, p0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_49

    :cond_33
    :goto_33
    iget-object v1, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->のぷのちつ:Ljava/util/ArrayList;

    if-nez v1, :cond_3e

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->のぷのちつ:Ljava/util/ArrayList;

    :cond_3e
    iget-object v1, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->のぷのちつ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    iget-object v2, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->のぷのちつ:Ljava/util/ArrayList;

    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_49
    monitor-exit v0

    goto :goto_4e

    :catchall_4b
    move-exception p1

    monitor-exit v0
    :try_end_4d
    .catchall {:try_start_11 .. :try_end_4d} :catchall_4b

    throw p1

    .line 2
    :cond_4e
    :goto_4e
    iput v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->は〲ぱなで:I

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->ぉざぅち〻:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-virtual {v0, p0, p1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ち〴みぎ〻び(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$〳ぜぞぜべっ;Z)V

    iget p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->は〲ぱなで:I

    return p1

    :cond_58
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "commit already called"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public おぐぴう〸ず(Ljava/util/ArrayList;II)Z
    .registers 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "L\u3065\u3056\u304b\u3079\u3079/\u307a\u3075\u306d\u3065\u303a/\u3052\u3064\u3034\u306c\u3050/\u3052\u3064\u3034\u306c\u3050;",
            ">;II)Z"
        }
    .end annotation

    const/4 v0, 0x0

    if-ne p3, p2, :cond_4

    return v0

    :cond_4
    iget-object v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, -0x1

    const/4 v3, 0x0

    :goto_c
    if-ge v3, v1, :cond_52

    iget-object v4, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;

    iget-object v4, v4, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->〺つふすそ:Landroidx/fragment/app/Fragment;

    if-eqz v4, :cond_1d

    iget v4, v4, Landroidx/fragment/app/Fragment;->〻ぞまぎな〻:I

    goto :goto_1e

    :cond_1d
    const/4 v4, 0x0

    :goto_1e
    if-eqz v4, :cond_4f

    if-eq v4, v2, :cond_4f

    move v2, p2

    :goto_23
    if-ge v2, p3, :cond_4e

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    iget-object v6, v5, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    const/4 v7, 0x0

    :goto_32
    if-ge v7, v6, :cond_4b

    iget-object v8, v5, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;

    iget-object v8, v8, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->〺つふすそ:Landroidx/fragment/app/Fragment;

    if-eqz v8, :cond_43

    iget v8, v8, Landroidx/fragment/app/Fragment;->〻ぞまぎな〻:I

    goto :goto_44

    :cond_43
    const/4 v8, 0x0

    :goto_44
    if-ne v8, v4, :cond_48

    const/4 p1, 0x1

    return p1

    :cond_48
    add-int/lit8 v7, v7, 0x1

    goto :goto_32

    :cond_4b
    add-int/lit8 v2, v2, 0x1

    goto :goto_23

    :cond_4e
    move v2, v4

    :cond_4f
    add-int/lit8 v3, v3, 0x1

    goto :goto_c

    :cond_52
    return v0
.end method

.method public くし〴〺ぅ()I
    .registers 2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->いいにぽつ(Z)I

    move-result v0

    return v0
.end method

.method public げつ〴ぬぐ(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "L\u3065\u3056\u304b\u3079\u3079/\u307a\u3075\u306d\u3065\u303a/\u3052\u3064\u3034\u306c\u3050/\u3052\u3064\u3034\u306c\u3050;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    sget-object v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->せづっ〸ちね:Landroid/view/animation/Interpolator;

    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-boolean p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->〳ぜぞぜべっ:Z

    if-eqz p1, :cond_20

    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->ぉざぅち〻:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    .line 1
    iget-object p2, p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ぺぁあねじ:Ljava/util/ArrayList;

    if-nez p2, :cond_1b

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ぺぁあねじ:Ljava/util/ArrayList;

    :cond_1b
    iget-object p1, p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ぺぁあねじ:Ljava/util/ArrayList;

    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_20
    const/4 p1, 0x1

    return p1
.end method

.method public づざかべべ(Landroidx/fragment/app/Fragment;)Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;
    .registers 4

    iget-object v0, p1, Landroidx/fragment/app/Fragment;->は〲ぱなで:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    if-eqz v0, :cond_25

    iget-object v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->ぉざぅち〻:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    if-ne v0, v1, :cond_9

    goto :goto_25

    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot detach Fragment attached to a different FragmentManager. Fragment "

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " is already attached to a FragmentManager."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1
    :cond_25
    :goto_25
    new-instance v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;

    const/4 v1, 0x6

    invoke-direct {v0, v1, p1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;-><init>(ILandroidx/fragment/app/Fragment;)V

    invoke-virtual {p0, v0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->〺つふすそ(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;)V

    return-object p0
.end method

.method public てぜきぽく()V
    .registers 10

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_8
    const/4 v3, 0x1

    if-ge v2, v0, :cond_c6

    iget-object v4, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;

    iget-object v5, v4, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->〺つふすそ:Landroidx/fragment/app/Fragment;

    if-eqz v5, :cond_2d

    iget v6, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->なぎぱいぢぎ:I

    iget v7, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->ぁごぐすすぃ:I

    .line 1
    iget-object v8, v5, Landroidx/fragment/app/Fragment;->おかぷせ〱:Landroidx/fragment/app/Fragment$げつ〴ぬぐ;

    if-nez v8, :cond_24

    if-nez v6, :cond_24

    if-nez v7, :cond_24

    goto :goto_2d

    :cond_24
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->〺つふすそ()Landroidx/fragment/app/Fragment$げつ〴ぬぐ;

    iget-object v8, v5, Landroidx/fragment/app/Fragment;->おかぷせ〱:Landroidx/fragment/app/Fragment$げつ〴ぬぐ;

    iput v6, v8, Landroidx/fragment/app/Fragment$げつ〴ぬぐ;->づざかべべ:I

    iput v7, v8, Landroidx/fragment/app/Fragment$げつ〴ぬぐ;->なぎぱいぢぎ:I

    .line 2
    :cond_2d
    :goto_2d
    iget v6, v4, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->げつ〴ぬぐ:I

    packed-switch v6, :pswitch_data_d2

    :pswitch_32
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unknown cmd: "

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v4, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->げつ〴ぬぐ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_47
    iget-object v6, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->ぉざぅち〻:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    iget-object v7, v4, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->〳ぜぞぜべっ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    invoke-virtual {v6, v5, v7}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ぅばづそほせ(Landroidx/fragment/app/Fragment;Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;)V

    goto :goto_b3

    :pswitch_4f
    iget-object v6, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->ぉざぅち〻:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    const/4 v7, 0x0

    invoke-virtual {v6, v7}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->せだてはぺて(Landroidx/fragment/app/Fragment;)V

    goto :goto_b3

    :pswitch_56
    iget-object v6, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->ぉざぅち〻:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-virtual {v6, v5}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->せだてはぺて(Landroidx/fragment/app/Fragment;)V

    goto :goto_b3

    :pswitch_5c
    iget v6, v4, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->くし〴〺ぅ:I

    invoke-virtual {v5, v6}, Landroidx/fragment/app/Fragment;->のびぶけせ(I)V

    iget-object v6, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->ぉざぅち〻:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-virtual {v6, v5}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ぺぁあねじ(Landroidx/fragment/app/Fragment;)V

    goto :goto_b3

    :pswitch_67
    iget v6, v4, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->びぐびあび:I

    invoke-virtual {v5, v6}, Landroidx/fragment/app/Fragment;->のびぶけせ(I)V

    iget-object v6, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->ぉざぅち〻:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-virtual {v6, v5}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->へぬ〴づぞ(Landroidx/fragment/app/Fragment;)V

    goto :goto_b3

    :pswitch_72
    iget v6, v4, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->くし〴〺ぅ:I

    invoke-virtual {v5, v6}, Landroidx/fragment/app/Fragment;->のびぶけせ(I)V

    iget-object v6, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->ぉざぅち〻:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    .line 3
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v6, v5, Landroidx/fragment/app/Fragment;->ぇ〳〲〺すっ:Z

    if-eqz v6, :cond_b3

    iput-boolean v1, v5, Landroidx/fragment/app/Fragment;->ぇ〳〲〺すっ:Z

    iget-boolean v6, v5, Landroidx/fragment/app/Fragment;->ぇとしたべど:Z

    xor-int/2addr v6, v3

    iput-boolean v6, v5, Landroidx/fragment/app/Fragment;->ぇとしたべど:Z

    goto :goto_b3

    .line 4
    :pswitch_88
    iget v6, v4, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->びぐびあび:I

    invoke-virtual {v5, v6}, Landroidx/fragment/app/Fragment;->のびぶけせ(I)V

    iget-object v6, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->ぉざぅち〻:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    .line 5
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v6, v5, Landroidx/fragment/app/Fragment;->ぇ〳〲〺すっ:Z

    if-nez v6, :cond_b3

    iput-boolean v3, v5, Landroidx/fragment/app/Fragment;->ぇ〳〲〺すっ:Z

    iget-boolean v6, v5, Landroidx/fragment/app/Fragment;->ぇとしたべど:Z

    xor-int/2addr v6, v3

    iput-boolean v6, v5, Landroidx/fragment/app/Fragment;->ぇとしたべど:Z

    goto :goto_b3

    .line 6
    :pswitch_9e
    iget v6, v4, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->びぐびあび:I

    invoke-virtual {v5, v6}, Landroidx/fragment/app/Fragment;->のびぶけせ(I)V

    iget-object v6, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->ぉざぅち〻:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-virtual {v6, v5}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->びちづぼぬ(Landroidx/fragment/app/Fragment;)V

    goto :goto_b3

    :pswitch_a9
    iget v6, v4, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->くし〴〺ぅ:I

    invoke-virtual {v5, v6}, Landroidx/fragment/app/Fragment;->のびぶけせ(I)V

    iget-object v6, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->ぉざぅち〻:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-virtual {v6, v5, v1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ぁごぐすすぃ(Landroidx/fragment/app/Fragment;Z)V

    :cond_b3
    :goto_b3
    iget-boolean v6, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->ぇぬぎばつ:Z

    if-nez v6, :cond_c2

    iget v4, v4, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->げつ〴ぬぐ:I

    if-eq v4, v3, :cond_c2

    if-eqz v5, :cond_c2

    iget-object v3, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->ぉざぅち〻:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-virtual {v3, v5}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->〱かけばぜぐ(Landroidx/fragment/app/Fragment;)V

    :cond_c2
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_8

    :cond_c6
    iget-boolean v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->ぇぬぎばつ:Z

    if-nez v0, :cond_d1

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->ぉざぅち〻:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    iget v1, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ぇぬぎばつ:I

    invoke-virtual {v0, v1, v3}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ぎきぁ〱ぢ(IZ)V

    :cond_d1
    return-void

    :pswitch_data_d2
    .packed-switch 0x1
        :pswitch_a9
        :pswitch_32
        :pswitch_9e
        :pswitch_88
        :pswitch_72
        :pswitch_67
        :pswitch_5c
        :pswitch_56
        :pswitch_4f
        :pswitch_47
    .end packed-switch
.end method

.method public なぎぱいぢぎ(ILandroidx/fragment/app/Fragment;Ljava/lang/String;I)V
    .registers 8

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getModifiers()I

    move-result v1

    invoke-virtual {v0}, Ljava/lang/Class;->isAnonymousClass()Z

    move-result v2

    if-nez v2, :cond_bf

    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v2

    if-eqz v2, :cond_bf

    invoke-virtual {v0}, Ljava/lang/Class;->isMemberClass()Z

    move-result v2

    if-eqz v2, :cond_20

    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v1

    if-eqz v1, :cond_bf

    :cond_20
    const-string v0, " now "

    const-string v1, ": was "

    if-eqz p3, :cond_58

    iget-object v2, p2, Landroidx/fragment/app/Fragment;->ぉ〲なぱぽた:Ljava/lang/String;

    if-eqz v2, :cond_56

    invoke-virtual {p3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_31

    goto :goto_56

    :cond_31
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Can\'t change tag of fragment "

    invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p2, Landroidx/fragment/app/Fragment;->ぉ〲なぱぽた:Ljava/lang/String;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_56
    :goto_56
    iput-object p3, p2, Landroidx/fragment/app/Fragment;->ぉ〲なぱぽた:Ljava/lang/String;

    :cond_58
    if-eqz p1, :cond_b2

    const/4 v2, -0x1

    if-eq p1, v2, :cond_8e

    iget p3, p2, Landroidx/fragment/app/Fragment;->ぶでにく〼〳:I

    if-eqz p3, :cond_89

    if-ne p3, p1, :cond_64

    goto :goto_89

    :cond_64
    new-instance p3, Ljava/lang/IllegalStateException;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Can\'t change container ID of fragment "

    invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p2, Landroidx/fragment/app/Fragment;->ぶでにく〼〳:I

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p3

    :cond_89
    :goto_89
    iput p1, p2, Landroidx/fragment/app/Fragment;->ぶでにく〼〳:I

    iput p1, p2, Landroidx/fragment/app/Fragment;->〻ぞまぎな〻:I

    goto :goto_b2

    :cond_8e
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Can\'t add fragment "

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " with tag "

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " to container view with no id"

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b2
    :goto_b2
    new-instance p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;

    invoke-direct {p1, p4, p2}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;-><init>(ILandroidx/fragment/app/Fragment;)V

    invoke-virtual {p0, p1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->〺つふすそ(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;)V

    .line 2
    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->ぉざぅち〻:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    iput-object p1, p2, Landroidx/fragment/app/Fragment;->は〲ぱなで:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    return-void

    .line 3
    :cond_bf
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Fragment "

    invoke-static {p2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " must be a public static class to be  properly recreated from instance state."

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public のぷのちつ(Z)V
    .registers 11

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_8
    if-ltz v0, :cond_dc

    iget-object v2, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;

    iget-object v3, v2, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->〺つふすそ:Landroidx/fragment/app/Fragment;

    const/4 v4, 0x0

    if-eqz v3, :cond_42

    iget v5, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->なぎぱいぢぎ:I

    .line 1
    sget-object v6, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->せづっ〸ちね:Landroid/view/animation/Interpolator;

    const/16 v6, 0x2002

    const/16 v7, 0x1003

    const/16 v8, 0x1001

    if-eq v5, v8, :cond_2e

    if-eq v5, v7, :cond_2c

    if-eq v5, v6, :cond_29

    const/4 v6, 0x0

    goto :goto_2e

    :cond_29
    const/16 v6, 0x1001

    goto :goto_2e

    :cond_2c
    const/16 v6, 0x1003

    .line 2
    :cond_2e
    :goto_2e
    iget v5, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->ぁごぐすすぃ:I

    .line 3
    iget-object v7, v3, Landroidx/fragment/app/Fragment;->おかぷせ〱:Landroidx/fragment/app/Fragment$げつ〴ぬぐ;

    if-nez v7, :cond_39

    if-nez v6, :cond_39

    if-nez v5, :cond_39

    goto :goto_42

    :cond_39
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->〺つふすそ()Landroidx/fragment/app/Fragment$げつ〴ぬぐ;

    iget-object v7, v3, Landroidx/fragment/app/Fragment;->おかぷせ〱:Landroidx/fragment/app/Fragment$げつ〴ぬぐ;

    iput v6, v7, Landroidx/fragment/app/Fragment$げつ〴ぬぐ;->づざかべべ:I

    iput v5, v7, Landroidx/fragment/app/Fragment$げつ〴ぬぐ;->なぎぱいぢぎ:I

    .line 4
    :cond_42
    :goto_42
    iget v5, v2, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->げつ〴ぬぐ:I

    packed-switch v5, :pswitch_data_ea

    :pswitch_47
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unknown cmd: "

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v2, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->げつ〴ぬぐ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_5c
    iget-object v4, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->ぉざぅち〻:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    iget-object v5, v2, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->ぁごぐすすぃ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    invoke-virtual {v4, v3, v5}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ぅばづそほせ(Landroidx/fragment/app/Fragment;Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;)V

    goto :goto_c8

    :pswitch_64
    iget-object v4, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->ぉざぅち〻:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-virtual {v4, v3}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->せだてはぺて(Landroidx/fragment/app/Fragment;)V

    goto :goto_c8

    :pswitch_6a
    iget-object v4, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->ぉざぅち〻:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->せだてはぺて(Landroidx/fragment/app/Fragment;)V

    goto :goto_c8

    :pswitch_71
    iget v4, v2, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->なぎぱいぢぎ:I

    invoke-virtual {v3, v4}, Landroidx/fragment/app/Fragment;->のびぶけせ(I)V

    iget-object v4, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->ぉざぅち〻:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-virtual {v4, v3}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->へぬ〴づぞ(Landroidx/fragment/app/Fragment;)V

    goto :goto_c8

    :pswitch_7c
    iget v4, v2, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->づざかべべ:I

    invoke-virtual {v3, v4}, Landroidx/fragment/app/Fragment;->のびぶけせ(I)V

    iget-object v4, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->ぉざぅち〻:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-virtual {v4, v3}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ぺぁあねじ(Landroidx/fragment/app/Fragment;)V

    goto :goto_c8

    :pswitch_87
    iget v4, v2, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->なぎぱいぢぎ:I

    invoke-virtual {v3, v4}, Landroidx/fragment/app/Fragment;->のびぶけせ(I)V

    iget-object v4, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->ぉざぅち〻:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    .line 5
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v4, v3, Landroidx/fragment/app/Fragment;->ぇ〳〲〺すっ:Z

    if-nez v4, :cond_c8

    iput-boolean v1, v3, Landroidx/fragment/app/Fragment;->ぇ〳〲〺すっ:Z

    iget-boolean v4, v3, Landroidx/fragment/app/Fragment;->ぇとしたべど:Z

    xor-int/2addr v4, v1

    iput-boolean v4, v3, Landroidx/fragment/app/Fragment;->ぇとしたべど:Z

    goto :goto_c8

    .line 6
    :pswitch_9d
    iget v5, v2, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->づざかべべ:I

    invoke-virtual {v3, v5}, Landroidx/fragment/app/Fragment;->のびぶけせ(I)V

    iget-object v5, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->ぉざぅち〻:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    .line 7
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v5, v3, Landroidx/fragment/app/Fragment;->ぇ〳〲〺すっ:Z

    if-eqz v5, :cond_c8

    iput-boolean v4, v3, Landroidx/fragment/app/Fragment;->ぇ〳〲〺すっ:Z

    iget-boolean v4, v3, Landroidx/fragment/app/Fragment;->ぇとしたべど:Z

    xor-int/2addr v4, v1

    iput-boolean v4, v3, Landroidx/fragment/app/Fragment;->ぇとしたべど:Z

    goto :goto_c8

    .line 8
    :pswitch_b3
    iget v5, v2, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->づざかべべ:I

    invoke-virtual {v3, v5}, Landroidx/fragment/app/Fragment;->のびぶけせ(I)V

    iget-object v5, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->ぉざぅち〻:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-virtual {v5, v3, v4}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ぁごぐすすぃ(Landroidx/fragment/app/Fragment;Z)V

    goto :goto_c8

    :pswitch_be
    iget v4, v2, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->なぎぱいぢぎ:I

    invoke-virtual {v3, v4}, Landroidx/fragment/app/Fragment;->のびぶけせ(I)V

    iget-object v4, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->ぉざぅち〻:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-virtual {v4, v3}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->びちづぼぬ(Landroidx/fragment/app/Fragment;)V

    :cond_c8
    :goto_c8
    iget-boolean v4, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->ぇぬぎばつ:Z

    if-nez v4, :cond_d8

    iget v2, v2, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->げつ〴ぬぐ:I

    const/4 v4, 0x3

    if-eq v2, v4, :cond_d8

    if-eqz v3, :cond_d8

    iget-object v2, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->ぉざぅち〻:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-virtual {v2, v3}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->〱かけばぜぐ(Landroidx/fragment/app/Fragment;)V

    :cond_d8
    add-int/lit8 v0, v0, -0x1

    goto/16 :goto_8

    :cond_dc
    iget-boolean v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->ぇぬぎばつ:Z

    if-nez v0, :cond_e9

    if-eqz p1, :cond_e9

    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->ぉざぅち〻:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    iget v0, p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ぇぬぎばつ:I

    invoke-virtual {p1, v0, v1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ぎきぁ〱ぢ(IZ)V

    :cond_e9
    return-void

    :pswitch_data_ea
    .packed-switch 0x1
        :pswitch_be
        :pswitch_47
        :pswitch_b3
        :pswitch_9d
        :pswitch_87
        :pswitch_7c
        :pswitch_71
        :pswitch_6a
        :pswitch_64
        :pswitch_5c
    .end packed-switch
.end method

.method public びぐびあび()V
    .registers 5

    .line 1
    iget-boolean v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->〳ぜぞぜべっ:Z

    if-nez v0, :cond_36

    .line 2
    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->ぉざぅち〻:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    .line 3
    iget-object v1, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ぉざぅち〻:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    if-eqz v1, :cond_35

    iget-boolean v1, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->〻ぞまぎな〻:Z

    if-eqz v1, :cond_f

    goto :goto_35

    :cond_f
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->えがぐせほち(Z)V

    iget-object v2, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    iget-object v3, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->びえぁぜい:Ljava/util/ArrayList;

    invoke-virtual {p0, v2, v3}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    iput-boolean v1, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->づざかべべ:Z

    :try_start_1c
    iget-object v1, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ぇ〳〲〺すっ:Ljava/util/ArrayList;

    iget-object v2, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->びえぁぜい:Ljava/util/ArrayList;

    invoke-virtual {v0, v1, v2}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ぉねぞはがぞ(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_23
    .catchall {:try_start_1c .. :try_end_23} :catchall_30

    invoke-virtual {v0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->てぜきぽく()V

    invoke-virtual {v0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->〺〲に〼へ〸()V

    invoke-virtual {v0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ぃぜぶの〸ぃ()V

    invoke-virtual {v0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->いいにぽつ()V

    goto :goto_35

    :catchall_30
    move-exception v1

    invoke-virtual {v0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->てぜきぽく()V

    throw v1

    :cond_35
    :goto_35
    return-void

    .line 4
    :cond_36
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This transaction is already being added to the back stack"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public へぬ〴づぞ(I)Z
    .registers 6

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_8
    if-ge v2, v0, :cond_23

    iget-object v3, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;

    iget-object v3, v3, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->〺つふすそ:Landroidx/fragment/app/Fragment;

    if-eqz v3, :cond_19

    iget v3, v3, Landroidx/fragment/app/Fragment;->〻ぞまぎな〻:I

    goto :goto_1a

    :cond_19
    const/4 v3, 0x0

    :goto_1a
    if-eqz v3, :cond_20

    if-ne v3, p1, :cond_20

    const/4 p1, 0x1

    return p1

    :cond_20
    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_23
    return v1
.end method

.method public ぺぁあねじ(I)V
    .registers 6

    iget-boolean v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->〳ぜぞぜべっ:Z

    if-nez v0, :cond_5

    return-void

    :cond_5
    sget-object v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->せづっ〸ちね:Landroid/view/animation/Interpolator;

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_e
    if-ge v1, v0, :cond_26

    iget-object v2, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;

    iget-object v2, v2, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->〺つふすそ:Landroidx/fragment/app/Fragment;

    if-eqz v2, :cond_23

    iget v3, v2, Landroidx/fragment/app/Fragment;->ざとぅぼこ〺:I

    add-int/2addr v3, p1

    iput v3, v2, Landroidx/fragment/app/Fragment;->ざとぅぼこ〺:I

    sget-object v2, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->せづっ〸ちね:Landroid/view/animation/Interpolator;

    :cond_23
    add-int/lit8 v1, v1, 0x1

    goto :goto_e

    :cond_26
    return-void
.end method

.method public ぺふねづ〺(Ljava/lang/String;Ljava/io/PrintWriter;Z)V
    .registers 9

    if-eqz p3, :cond_da

    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mName="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->ぺぁあねじ:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mIndex="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->は〲ぱなで:I

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(I)V

    const-string v0, " mCommitted="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->ざとぅぼこ〺:Z

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Z)V

    iget v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->なぎぱいぢぎ:I

    if-eqz v0, :cond_46

    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mTransition=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->なぎぱいぢぎ:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mTransitionStyle=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->ぁごぐすすぃ:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :cond_46
    iget v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->〺つふすそ:I

    if-nez v0, :cond_4e

    iget v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->くし〴〺ぅ:I

    if-eqz v0, :cond_6d

    :cond_4e
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mEnterAnim=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->〺つふすそ:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mExitAnim=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->くし〴〺ぅ:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :cond_6d
    iget v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->びぐびあび:I

    if-nez v0, :cond_75

    iget v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->づざかべべ:I

    if-eqz v0, :cond_94

    :cond_75
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mPopEnterAnim=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->びぐびあび:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mPopExitAnim=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->づざかべべ:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :cond_94
    iget v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->いいにぽつ:I

    if-nez v0, :cond_9c

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->ぺふねづ〺:Ljava/lang/CharSequence;

    if-eqz v0, :cond_b7

    :cond_9c
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mBreadCrumbTitleRes=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->いいにぽつ:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mBreadCrumbTitleText="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->ぺふねづ〺:Ljava/lang/CharSequence;

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_b7
    iget v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->てぜきぽく:I

    if-nez v0, :cond_bf

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->のぷのちつ:Ljava/lang/CharSequence;

    if-eqz v0, :cond_da

    :cond_bf
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mBreadCrumbShortTitleRes=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->てぜきぽく:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mBreadCrumbShortTitleText="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->のぷのちつ:Ljava/lang/CharSequence;

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_da
    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1a1

    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Operations:"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_f1
    if-ge v1, v0, :cond_1a1

    iget-object v2, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;

    iget v3, v2, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->げつ〴ぬぐ:I

    packed-switch v3, :pswitch_data_1a2

    const-string v3, "cmd="

    invoke-static {v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, v2, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->げつ〴ぬぐ:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_130

    :pswitch_110
    const-string v3, "OP_SET_MAX_LIFECYCLE"

    goto :goto_130

    :pswitch_113
    const-string v3, "UNSET_PRIMARY_NAV"

    goto :goto_130

    :pswitch_116
    const-string v3, "SET_PRIMARY_NAV"

    goto :goto_130

    :pswitch_119
    const-string v3, "ATTACH"

    goto :goto_130

    :pswitch_11c
    const-string v3, "DETACH"

    goto :goto_130

    :pswitch_11f
    const-string v3, "SHOW"

    goto :goto_130

    :pswitch_122
    const-string v3, "HIDE"

    goto :goto_130

    :pswitch_125
    const-string v3, "REMOVE"

    goto :goto_130

    :pswitch_128
    const-string v3, "REPLACE"

    goto :goto_130

    :pswitch_12b
    const-string v3, "ADD"

    goto :goto_130

    :pswitch_12e
    const-string v3, "NULL"

    :goto_130
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v4, "  Op #"

    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(I)V

    const-string v4, ": "

    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, " "

    invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v3, v2, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->〺つふすそ:Landroidx/fragment/app/Fragment;

    invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    if-eqz p3, :cond_19d

    iget v3, v2, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->くし〴〺ぅ:I

    if-nez v3, :cond_157

    iget v3, v2, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->びぐびあび:I

    if-eqz v3, :cond_176

    :cond_157
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "enterAnim=#"

    invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v3, v2, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->くし〴〺ぅ:I

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, " exitAnim=#"

    invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v3, v2, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->びぐびあび:I

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :cond_176
    iget v3, v2, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->づざかべべ:I

    if-nez v3, :cond_17e

    iget v3, v2, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->なぎぱいぢぎ:I

    if-eqz v3, :cond_19d

    :cond_17e
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "popEnterAnim=#"

    invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v3, v2, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->づざかべべ:I

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, " popExitAnim=#"

    invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v2, v2, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ$げつ〴ぬぐ;->なぎぱいぢぎ:I

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :cond_19d
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_f1

    :cond_1a1
    return-void

    :pswitch_data_1a2
    .packed-switch 0x0
        :pswitch_12e
        :pswitch_12b
        :pswitch_128
        :pswitch_125
        :pswitch_122
        :pswitch_11f
        :pswitch_11c
        :pswitch_119
        :pswitch_116
        :pswitch_113
        :pswitch_110
    .end packed-switch
.end method
