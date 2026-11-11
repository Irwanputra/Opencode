.class public abstract Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$おぐぴう〸ず;
.super Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "\u304a\u3050\u3074\u3046\u3038\u305a"
.end annotation


# instance fields
.field public final 〺つふすそ:I

.field public final げつ〴ぬぐ:I


# direct methods
.method public constructor <init>(II)V
    .registers 3

    invoke-direct {p0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;-><init>()V

    iput p1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$おぐぴう〸ず;->げつ〴ぬぐ:I

    iput p2, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$おぐぴう〸ず;->〺つふすそ:I

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 6

    iget v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$おぐぴう〸ず;->げつ〴ぬぐ:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-nez v0, :cond_1e

    new-array v0, v3, [Ljava/lang/Object;

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$おぐぴう〸ず;->くし〴〺ぅ()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v0, v2

    iget v2, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$おぐぴう〸ず;->〺つふすそ:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const-string v1, ":%s(%d)"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1e
    iget v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$おぐぴう〸ず;->〺つふすそ:I

    if-nez v0, :cond_39

    new-array v0, v3, [Ljava/lang/Object;

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$おぐぴう〸ず;->くし〴〺ぅ()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v0, v2

    iget v2, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$おぐぴう〸ず;->げつ〴ぬぐ:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const-string v1, ":%s(%dn)"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_39
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$おぐぴう〸ず;->くし〴〺ぅ()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v0, v2

    iget v2, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$おぐぴう〸ず;->げつ〴ぬぐ:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    iget v1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$おぐぴう〸ず;->〺つふすそ:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v3

    const-string v1, ":%s(%dn%+d)"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract 〺つふすそ(Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;)I
.end method

.method public abstract くし〴〺ぅ()Ljava/lang/String;
.end method

.method public げつ〴ぬぐ(Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;)Z
    .registers 7

    .line 1
    iget-object v0, p2, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->〺つふすそ:Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;

    check-cast v0, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;

    const/4 v1, 0x0

    if-eqz v0, :cond_28

    .line 2
    instance-of v0, v0, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ;

    if-eqz v0, :cond_c

    goto :goto_28

    :cond_c
    invoke-virtual {p0, p1, p2}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$おぐぴう〸ず;->〺つふすそ(Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;)I

    move-result p1

    iget p2, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$おぐぴう〸ず;->げつ〴ぬぐ:I

    const/4 v0, 0x1

    if-nez p2, :cond_1b

    iget p2, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$おぐぴう〸ず;->〺つふすそ:I

    if-ne p1, p2, :cond_1a

    const/4 v1, 0x1

    :cond_1a
    return v1

    :cond_1b
    iget v2, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$おぐぴう〸ず;->〺つふすそ:I

    sub-int v3, p1, v2

    mul-int v3, v3, p2

    if-ltz v3, :cond_28

    sub-int/2addr p1, v2

    rem-int/2addr p1, p2

    if-nez p1, :cond_28

    const/4 v1, 0x1

    :cond_28
    :goto_28
    return v1
.end method
