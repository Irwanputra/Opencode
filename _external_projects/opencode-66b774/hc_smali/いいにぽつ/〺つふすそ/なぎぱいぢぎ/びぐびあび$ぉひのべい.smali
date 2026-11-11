.class public final Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$ぉひのべい;
.super Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u3049\u3072\u306e\u3079\u3044"
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

    const-string v0, ":matchText"

    return-object v0
.end method

.method public げつ〴ぬぐ(Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;)Z
    .registers 10

    instance-of p1, p2, Lいいにぽつ/〺つふすそ/びぐびあび/おぐぴう〸ず;

    const/4 v0, 0x1

    if-eqz p1, :cond_6

    return v0

    .line 1
    :cond_6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p2, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;->なぎぱいぢぎ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_14
    :goto_14
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;

    instance-of v3, v2, Lいいにぽつ/〺つふすそ/びぐびあび/ぇぬぎばつ;

    if-eqz v3, :cond_14

    check-cast v2, Lいいにぽつ/〺つふすそ/びぐびあび/ぇぬぎばつ;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_14

    :cond_2a
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 2
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_32
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_8a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lいいにぽつ/〺つふすそ/びぐびあび/ぇぬぎばつ;

    new-instance v3, Lいいにぽつ/〺つふすそ/びぐびあび/おぐぴう〸ず;

    .line 3
    iget-object v4, p2, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;->びぐびあび:Lいいにぽつ/〺つふすそ/づざかべべ/ぁごぐすすぃ;

    .line 4
    iget-object v4, v4, Lいいにぽつ/〺つふすそ/づざかべべ/ぁごぐすすぃ;->げつ〴ぬぐ:Ljava/lang/String;

    .line 5
    sget-object v5, Lいいにぽつ/〺つふすそ/づざかべべ/なぎぱいぢぎ;->びぐびあび:Lいいにぽつ/〺つふすそ/づざかべべ/なぎぱいぢぎ;

    invoke-static {v4, v5}, Lいいにぽつ/〺つふすそ/づざかべべ/ぁごぐすすぃ;->げつ〴ぬぐ(Ljava/lang/String;Lいいにぽつ/〺つふすそ/づざかべべ/なぎぱいぢぎ;)Lいいにぽつ/〺つふすそ/づざかべべ/ぁごぐすすぃ;

    move-result-object v4

    .line 6
    iget-object v5, p2, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;->〳ぜぞぜべっ:Ljava/lang/String;

    .line 7
    invoke-virtual {p2}, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;->びぐびあび()Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;

    move-result-object v6

    invoke-direct {v3, v4, v5, v6}, Lいいにぽつ/〺つふすそ/びぐびあび/おぐぴう〸ず;-><init>(Lいいにぽつ/〺つふすそ/づざかべべ/ぁごぐすすぃ;Ljava/lang/String;Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;)V

    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ずまげせび〳(Ljava/lang/Object;)V

    iget-object v4, v1, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->〺つふすそ:Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;

    invoke-static {v4}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ずまげせび〳(Ljava/lang/Object;)V

    iget-object v4, v1, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->〺つふすそ:Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;

    .line 9
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v5, v1, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->〺つふすそ:Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;

    if-ne v5, v4, :cond_69

    const/4 v2, 0x1

    :cond_69
    invoke-static {v2}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ばおぢでぎか(Z)V

    invoke-static {v3}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ずまげせび〳(Ljava/lang/Object;)V

    iget-object v2, v3, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->〺つふすそ:Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;

    if-eqz v2, :cond_76

    invoke-virtual {v2, v3}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->でどあくず(Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;)V

    :cond_76
    iget v2, v1, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->くし〴〺ぅ:I

    invoke-virtual {v4}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->いいにぽつ()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v2, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    iput-object v4, v3, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->〺つふすそ:Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;

    .line 10
    iput v2, v3, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->くし〴〺ぅ:I

    const/4 v2, 0x0

    .line 11
    iput-object v2, v1, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->〺つふすそ:Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;

    .line 12
    invoke-virtual {v3, v1}, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;->ぶでにく〼〳(Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;)Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;

    goto :goto_32

    :cond_8a
    return v2
.end method
