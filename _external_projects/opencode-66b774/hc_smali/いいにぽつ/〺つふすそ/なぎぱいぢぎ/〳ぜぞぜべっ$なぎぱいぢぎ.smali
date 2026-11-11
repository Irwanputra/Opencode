.class public Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〳ぜぞぜべっ$なぎぱいぢぎ;
.super Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〳ぜぞぜべっ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〳ぜぞぜべっ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u306a\u304e\u3071\u3044\u3062\u304e"
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

    const-string v1, ":prev*%s"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public げつ〴ぬぐ(Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;)Z
    .registers 5

    const/4 v0, 0x0

    if-ne p1, p2, :cond_4

    return v0

    :cond_4
    invoke-virtual {p2}, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;->ぉひのべい()Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;

    move-result-object p2

    if-eqz p2, :cond_14

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〳ぜぞぜべっ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;

    invoke-virtual {v1, p1, p2}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;->げつ〴ぬぐ(Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 p1, 0x1

    return p1

    :cond_14
    return v0
.end method
