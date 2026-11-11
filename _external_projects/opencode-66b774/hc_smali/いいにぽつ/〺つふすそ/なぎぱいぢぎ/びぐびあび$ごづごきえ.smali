.class public final Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$ごづごきえ;
.super Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$ざとぅぼこ〺;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u3054\u3065\u3054\u304d\u3048"
.end annotation


# direct methods
.method public constructor <init>(I)V
    .registers 2

    invoke-direct {p0, p1}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$ざとぅぼこ〺;-><init>(I)V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 4

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iget v1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$ざとぅぼこ〺;->げつ〴ぬぐ:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, ":lt(%d)"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public げつ〴ぬぐ(Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;)Z
    .registers 3

    if-eq p1, p2, :cond_c

    invoke-virtual {p2}, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;->どぇぞほだ()I

    move-result p1

    iget p2, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$ざとぅぼこ〺;->げつ〴ぬぐ:I

    if-ge p1, p2, :cond_c

    const/4 p1, 0x1

    goto :goto_d

    :cond_c
    const/4 p1, 0x0

    :goto_d
    return p1
.end method
