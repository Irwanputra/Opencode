.class public Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〳ぜぞぜべっ$げつ〴ぬぐ;
.super Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〳ぜぞぜべっ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〳ぜぞぜべっ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# direct methods
.method public constructor <init>(Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;)V
    .registers 2

    invoke-direct {p0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〳ぜぞぜべっ;-><init>()V

    iput-object p1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〳ぜぞぜべっ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 4

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〳ぜぞぜべっ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, ":has(%s)"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public げつ〴ぬぐ(Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;)Z
    .registers 6

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$げつ〴ぬぐ;

    invoke-direct {v0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$げつ〴ぬぐ;-><init>()V

    invoke-static {v0, p2}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぁごぐすすぃ(Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;)Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/くし〴〺ぅ;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_28

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;

    if-eq v1, p2, :cond_10

    iget-object v2, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〳ぜぞぜべっ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;

    invoke-virtual {v2, p1, v1}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;->げつ〴ぬぐ(Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;)Z

    move-result v1

    if-eqz v1, :cond_10

    const/4 p1, 0x1

    return p1

    :cond_28
    const/4 p1, 0x0

    return p1
.end method
