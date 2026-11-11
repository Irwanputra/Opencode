.class public final Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$じぜこほぱ;
.super Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u3058\u305c\u3053\u307b\u3071"
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

    const-string v0, ":only-of-type"

    return-object v0
.end method

.method public げつ〴ぬぐ(Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;)Z
    .registers 7

    .line 1
    iget-object p1, p2, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->〺つふすそ:Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;

    check-cast p1, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;

    const/4 v0, 0x0

    if-eqz p1, :cond_32

    .line 2
    instance-of v1, p1, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ;

    if-eqz v1, :cond_c

    goto :goto_32

    :cond_c
    invoke-virtual {p1}, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;->ぇ〳〲〺すっ()Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/くし〴〺ぅ;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    :cond_15
    :goto_15
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2e

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;

    .line 3
    iget-object v2, v2, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;->びぐびあび:Lいいにぽつ/〺つふすそ/づざかべべ/ぁごぐすすぃ;

    iget-object v3, p2, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;->びぐびあび:Lいいにぽつ/〺つふすそ/づざかべべ/ぁごぐすすぃ;

    .line 4
    invoke-virtual {v2, v3}, Lいいにぽつ/〺つふすそ/づざかべべ/ぁごぐすすぃ;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_15

    add-int/lit8 v1, v1, 0x1

    goto :goto_15

    :cond_2e
    const/4 p1, 0x1

    if-ne v1, p1, :cond_32

    const/4 v0, 0x1

    :cond_32
    :goto_32
    return v0
.end method
