.class public final Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$ぺづげぺが;
.super Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u307a\u3065\u3052\u307a\u304c"
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

    const-string v0, ":root"

    return-object v0
.end method

.method public げつ〴ぬぐ(Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;)Z
    .registers 5

    instance-of v0, p1, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ;

    const/4 v1, 0x0

    if-eqz v0, :cond_f

    .line 1
    invoke-virtual {p1}, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;->ぉ〲なぱぽた()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;

    :cond_f
    if-ne p2, p1, :cond_12

    const/4 v1, 0x1

    :cond_12
    return v1
.end method
