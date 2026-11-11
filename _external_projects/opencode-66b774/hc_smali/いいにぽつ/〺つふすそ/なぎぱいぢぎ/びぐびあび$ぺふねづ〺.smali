.class public final Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$ぺふねづ〺;
.super Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u307a\u3075\u306d\u3065\u303a"
.end annotation


# instance fields
.field public げつ〴ぬぐ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .registers 2

    invoke-direct {p0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;-><init>()V

    iput-object p1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$ぺふねづ〺;->げつ〴ぬぐ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 4

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$ぺふねづ〺;->げつ〴ぬぐ:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, ".%s"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public げつ〴ぬぐ(Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;)Z
    .registers 15

    iget-object p1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$ぺふねづ〺;->げつ〴ぬぐ:Ljava/lang/String;

    .line 1
    invoke-virtual {p2}, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;->びぐびあび()Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;

    move-result-object p2

    const-string v0, "class"

    invoke-virtual {p2, v0}, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->ぁごぐすすぃ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v6

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v7

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v6, :cond_5d

    if-ge v6, v7, :cond_1b

    goto :goto_5d

    :cond_1b
    if-ne v6, v7, :cond_22

    invoke-virtual {p1, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    goto :goto_5e

    :cond_22
    const/4 v0, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_25
    if-ge v11, v6, :cond_4d

    invoke-virtual {p2, v11}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v1

    if-eqz v1, :cond_46

    if-eqz v0, :cond_4a

    sub-int v0, v11, v10

    if-ne v0, v7, :cond_44

    const/4 v1, 0x1

    const/4 v4, 0x0

    move-object v0, p2

    move v2, v10

    move-object v3, p1

    move v5, v7

    invoke-virtual/range {v0 .. v5}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v0

    if-eqz v0, :cond_44

    goto :goto_5e

    :cond_44
    const/4 v0, 0x0

    goto :goto_4a

    :cond_46
    if-nez v0, :cond_4a

    move v10, v11

    const/4 v0, 0x1

    :cond_4a
    :goto_4a
    add-int/lit8 v11, v11, 0x1

    goto :goto_25

    :cond_4d
    if-eqz v0, :cond_5d

    sub-int/2addr v6, v10

    if-ne v6, v7, :cond_5d

    const/4 v1, 0x1

    const/4 v4, 0x0

    move-object v0, p2

    move v2, v10

    move-object v3, p1

    move v5, v7

    invoke-virtual/range {v0 .. v5}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v8

    goto :goto_5e

    :cond_5d
    :goto_5d
    const/4 v8, 0x0

    :goto_5e
    return v8
.end method
