.class public Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/なぎぱいぢぎ;
.super Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/くし〴〺ぅ;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u307a\u3075\u306d\u3065\u303a/\u3052\u3064\u3034\u306c\u3050/\u3052\u3064\u3034\u306c\u3050/\u3033\u305c\u305e\u305c\u3079\u3063/\u304f\u3057\u3034\u303a\u3045<",
        "Landroidx/fragment/app/Fragment;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroidx/fragment/app/Fragment;)V
    .registers 2

    invoke-direct {p0, p1}, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/くし〴〺ぅ;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public 〺つふすそ()Landroid/content/Context;
    .registers 2

    .line 1
    iget-object v0, p0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/づざかべべ;->げつ〴ぬぐ:Ljava/lang/Object;

    .line 2
    check-cast v0, Landroidx/fragment/app/Fragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->びぐびあび()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    return-object v0
.end method

.method public varargs げつ〴ぬぐ(I[Ljava/lang/String;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/づざかべべ;->げつ〴ぬぐ:Ljava/lang/Object;

    .line 2
    check-cast v0, Landroidx/fragment/app/Fragment;

    .line 3
    iget-object v1, v0, Landroidx/fragment/app/Fragment;->ごづごきえ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    if-eqz v1, :cond_c

    invoke-virtual {v1, v0, p2, p1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->てぜきぽく(Landroidx/fragment/app/Fragment;[Ljava/lang/String;I)V

    return-void

    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Fragment "

    const-string v1, " not attached to Activity"

    invoke-static {p2, v0, v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->せづっ〸ちね(Ljava/lang/String;Landroidx/fragment/app/Fragment;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public なぎぱいぢぎ()Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;
    .registers 2

    .line 1
    iget-object v0, p0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/づざかべべ;->げつ〴ぬぐ:Ljava/lang/Object;

    .line 2
    check-cast v0, Landroidx/fragment/app/Fragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->ぺぁあねじ()Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;

    move-result-object v0

    return-object v0
.end method

.method public びぐびあび(Ljava/lang/String;)Z
    .registers 3

    .line 1
    iget-object v0, p0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/づざかべべ;->げつ〴ぬぐ:Ljava/lang/Object;

    .line 2
    check-cast v0, Landroidx/fragment/app/Fragment;

    .line 3
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->ごづごきえ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;

    if-eqz v0, :cond_d

    invoke-virtual {v0, p1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->へぬ〴づぞ(Ljava/lang/String;)Z

    move-result p1

    goto :goto_e

    :cond_d
    const/4 p1, 0x0

    :goto_e
    return p1
.end method
