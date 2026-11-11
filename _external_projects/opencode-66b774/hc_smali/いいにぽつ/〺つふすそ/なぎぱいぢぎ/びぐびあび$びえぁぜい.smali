.class public final Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$びえぁぜい;
.super Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$おぐぴう〸ず;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u3073\u3048\u3041\u305c\u3044"
.end annotation


# direct methods
.method public constructor <init>(II)V
    .registers 3

    invoke-direct {p0, p1, p2}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$おぐぴう〸ず;-><init>(II)V

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;)I
    .registers 3

    .line 1
    iget-object p1, p2, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->〺つふすそ:Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;

    check-cast p1, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;

    .line 2
    invoke-virtual {p1}, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;->ぇ〳〲〺すっ()Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/くし〴〺ぅ;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    invoke-virtual {p2}, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;->どぇぞほだ()I

    move-result p2

    sub-int/2addr p1, p2

    return p1
.end method

.method public くし〴〺ぅ()Ljava/lang/String;
    .registers 2

    const-string v0, "nth-last-child"

    return-object v0
.end method
