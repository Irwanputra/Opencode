.class public Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$なぶひせが;
.super Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$おぐぴう〸ず;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u306a\u3076\u3072\u305b\u304c"
.end annotation


# direct methods
.method public constructor <init>(II)V
    .registers 3

    invoke-direct {p0, p1, p2}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$おぐぴう〸ず;-><init>(II)V

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;)I
    .registers 7

    .line 1
    iget-object p1, p2, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->〺つふすそ:Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;

    check-cast p1, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;

    .line 2
    invoke-virtual {p1}, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;->ぇ〳〲〺すっ()Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/くし〴〺ぅ;

    move-result-object p1

    invoke-virtual {p2}, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;->どぇぞほだ()I

    move-result v0

    const/4 v1, 0x0

    :goto_d
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_28

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;

    .line 3
    iget-object v2, v2, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;->びぐびあび:Lいいにぽつ/〺つふすそ/づざかべべ/ぁごぐすすぃ;

    iget-object v3, p2, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;->びぐびあび:Lいいにぽつ/〺つふすそ/づざかべべ/ぁごぐすすぃ;

    .line 4
    invoke-virtual {v2, v3}, Lいいにぽつ/〺つふすそ/づざかべべ/ぁごぐすすぃ;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_25

    add-int/lit8 v1, v1, 0x1

    :cond_25
    add-int/lit8 v0, v0, 0x1

    goto :goto_d

    :cond_28
    return v1
.end method

.method public くし〴〺ぅ()Ljava/lang/String;
    .registers 2

    const-string v0, "nth-last-of-type"

    return-object v0
.end method
