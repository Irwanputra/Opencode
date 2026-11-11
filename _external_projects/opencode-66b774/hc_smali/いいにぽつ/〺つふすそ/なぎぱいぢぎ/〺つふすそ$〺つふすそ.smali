.class public final Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ$〺つふすそ;
.super Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u303a\u3064\u3075\u3059\u305d"
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ;-><init>()V

    return-void
.end method

.method public varargs constructor <init>([Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;)V
    .registers 4

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 1
    invoke-direct {p0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ;-><init>()V

    iget v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ;->〺つふすそ:I

    const/4 v1, 0x1

    if-le v0, v1, :cond_17

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    new-instance v1, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ$げつ〴ぬぐ;

    invoke-direct {v1, p1}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ$げつ〴ぬぐ;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1c

    :cond_17
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :goto_1c
    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ;->〺つふすそ()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 3

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    const-string v1, ", "

    invoke-static {v0, v1}, Lいいにぽつ/〺つふすそ/くし〴〺ぅ/〺つふすそ;->づざかべべ(Ljava/util/Collection;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public くし〴〺ぅ(Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;)V
    .registers 3

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ;->〺つふすそ()V

    return-void
.end method

.method public げつ〴ぬぐ(Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;)Z
    .registers 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_2
    iget v2, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ;->〺つふすそ:I

    if-ge v1, v2, :cond_19

    iget-object v2, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;

    invoke-virtual {v2, p1, p2}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;->げつ〴ぬぐ(Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;)Z

    move-result v2

    if-eqz v2, :cond_16

    const/4 p1, 0x1

    return p1

    :cond_16
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_19
    return v0
.end method
