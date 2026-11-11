.class public final Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ$げつ〴ぬぐ;
.super Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# direct methods
.method public constructor <init>(Ljava/util/Collection;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "L\u3044\u3044\u306b\u307d\u3064/\u303a\u3064\u3075\u3059\u305d/\u306a\u304e\u3071\u3044\u3062\u304e/\u3073\u3050\u3073\u3042\u3073;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ;-><init>()V

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ;->〺つふすそ()V

    return-void
.end method

.method public varargs constructor <init>([Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;)V
    .registers 2

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ$げつ〴ぬぐ;-><init>(Ljava/util/Collection;)V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 3

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    const-string v1, " "

    invoke-static {v0, v1}, Lいいにぽつ/〺つふすそ/くし〴〺ぅ/〺つふすそ;->づざかべべ(Ljava/util/Collection;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public げつ〴ぬぐ(Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;)Z
    .registers 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_2
    iget v2, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ;->〺つふすそ:I

    if-ge v1, v2, :cond_18

    iget-object v2, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;

    invoke-virtual {v2, p1, p2}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;->げつ〴ぬぐ(Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;)Z

    move-result v2

    if-nez v2, :cond_15

    return v0

    :cond_15
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_18
    const/4 p1, 0x1

    return p1
.end method
