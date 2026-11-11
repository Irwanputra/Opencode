.class public Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ;
.super Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$〺つふすそ;,
        Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;
    }
.end annotation


# instance fields
.field public いいにぽつ:Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;

.field public ぺふねづ〺:Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$〺つふすそ;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .registers 4

    sget-object v0, Lいいにぽつ/〺つふすそ/づざかべべ/なぎぱいぢぎ;->くし〴〺ぅ:Lいいにぽつ/〺つふすそ/づざかべべ/なぎぱいぢぎ;

    const-string v1, "#root"

    invoke-static {v1, v0}, Lいいにぽつ/〺つふすそ/づざかべべ/ぁごぐすすぃ;->げつ〴ぬぐ(Ljava/lang/String;Lいいにぽつ/〺つふすそ/づざかべべ/なぎぱいぢぎ;)Lいいにぽつ/〺つふすそ/づざかべべ/ぁごぐすすぃ;

    move-result-object v0

    const/4 v1, 0x0

    .line 1
    invoke-direct {p0, v0, p1, v1}, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;-><init>(Lいいにぽつ/〺つふすそ/づざかべべ/ぁごぐすすぃ;Ljava/lang/String;Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;)V

    .line 2
    new-instance p1, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;

    invoke-direct {p1}, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;-><init>()V

    iput-object p1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ;->いいにぽつ:Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;

    sget-object p1, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$〺つふすそ;->〺つふすそ:Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$〺つふすそ;

    iput-object p1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ;->ぺふねづ〺:Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$〺つふすそ;

    return-void
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .registers 2

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ;->ぷぞてのほき()Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic ぁごぐすすぃ()Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;
    .registers 2

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ;->ぷぞてのほき()Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ;

    move-result-object v0

    return-object v0
.end method

.method public ぇぬぎばつ()Ljava/lang/String;
    .registers 2

    const-string v0, "#document"

    return-object v0
.end method

.method public ぉざぅち〻()Ljava/lang/String;
    .registers 6

    .line 1
    invoke-static {}, Lいいにぽつ/〺つふすそ/くし〴〺ぅ/〺つふすそ;->ぁごぐすすぃ()Ljava/lang/StringBuilder;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;->なぎぱいぢぎ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_23

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;

    .line 3
    new-instance v3, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ$げつ〴ぬぐ;

    invoke-virtual {v2}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->ぺふねづ〺()Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;

    move-result-object v4

    invoke-direct {v3, v0, v4}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ$げつ〴ぬぐ;-><init>(Ljava/lang/Appendable;Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;)V

    invoke-static {v3, v2}, Lづざかべべ/は〲ぱなで/〺つふすそ;->しげにけぃ(Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/づざかべべ;Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;)V

    goto :goto_a

    .line 4
    :cond_23
    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->ぺふねづ〺()Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;

    move-result-object v1

    .line 5
    iget-boolean v1, v1, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;->なぎぱいぢぎ:Z

    .line 6
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz v1, :cond_33

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    :cond_33
    return-object v0
.end method

.method public bridge synthetic びえぁぜい()Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;
    .registers 2

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ;->ぷぞてのほき()Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ;

    move-result-object v0

    return-object v0
.end method

.method public ぷぞてのほき()Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ;
    .registers 3

    invoke-super {p0}, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;->びえぁぜい()Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;

    move-result-object v0

    check-cast v0, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ;

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ;->いいにぽつ:Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;

    invoke-virtual {v1}, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;->げつ〴ぬぐ()Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;

    move-result-object v1

    iput-object v1, v0, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ;->いいにぽつ:Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;

    return-object v0
.end method
