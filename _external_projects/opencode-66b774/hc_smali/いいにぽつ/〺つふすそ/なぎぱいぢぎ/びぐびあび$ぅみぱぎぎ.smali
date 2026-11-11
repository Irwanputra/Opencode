.class public final Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$ぅみぱぎぎ;
.super Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u3045\u307f\u3071\u304e\u304e"
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;-><init>()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 2

    const-string v0, ":only-child"

    return-object v0
.end method

.method public げつ〴ぬぐ(Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;)Z
    .registers 6

    .line 1
    iget-object p1, p2, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->〺つふすそ:Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;

    move-object v0, p1

    check-cast v0, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;

    const/4 v1, 0x0

    if-eqz v0, :cond_43

    .line 2
    instance-of v0, v0, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ;

    if-nez v0, :cond_43

    if-nez p1, :cond_14

    .line 3
    new-instance p1, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/くし〴〺ぅ;

    invoke-direct {p1, v1}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/くし〴〺ぅ;-><init>(I)V

    goto :goto_3c

    .line 4
    :cond_14
    check-cast p1, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;

    .line 5
    invoke-virtual {p1}, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;->ぉ〲なぱぽた()Ljava/util/List;

    move-result-object p1

    new-instance v0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/くし〴〺ぅ;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-direct {v0, v2}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/くし〴〺ぅ;-><init>(I)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_29
    :goto_29
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;

    if-eq v2, p2, :cond_29

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_29

    :cond_3b
    move-object p1, v0

    .line 6
    :goto_3c
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-nez p1, :cond_43

    const/4 v1, 0x1

    :cond_43
    return v1
.end method
