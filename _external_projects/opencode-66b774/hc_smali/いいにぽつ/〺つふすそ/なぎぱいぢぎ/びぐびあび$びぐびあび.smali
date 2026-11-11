.class public final Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$びぐびあび;
.super Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u3073\u3050\u3073\u3042\u3073"
.end annotation


# instance fields
.field public げつ〴ぬぐ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .registers 2

    invoke-direct {p0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;-><init>()V

    invoke-static {p1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->〱こか〺ぃせ(Ljava/lang/String;)V

    invoke-static {p1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->のね〱ばぁぢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$びぐびあび;->げつ〴ぬぐ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 4

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$びぐびあび;->げつ〴ぬぐ:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "[^%s]"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public げつ〴ぬぐ(Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;)Z
    .registers 8

    invoke-virtual {p2}, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;->びぐびあび()Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;

    move-result-object p1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p2, Ljava/util/ArrayList;

    iget v0, p1, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->〺つふすそ:I

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_10
    iget v2, p1, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->〺つふすそ:I

    if-ge v1, v2, :cond_36

    iget-object v2, p1, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->びぐびあび:[Ljava/lang/String;

    aget-object v3, v2, v1

    if-nez v3, :cond_24

    new-instance v2, Lいいにぽつ/〺つふすそ/びぐびあび/くし〴〺ぅ;

    iget-object v3, p1, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->くし〴〺ぅ:[Ljava/lang/String;

    aget-object v3, v3, v1

    invoke-direct {v2, v3}, Lいいにぽつ/〺つふすそ/びぐびあび/くし〴〺ぅ;-><init>(Ljava/lang/String;)V

    goto :goto_30

    :cond_24
    new-instance v3, Lいいにぽつ/〺つふすそ/びぐびあび/げつ〴ぬぐ;

    iget-object v4, p1, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->くし〴〺ぅ:[Ljava/lang/String;

    aget-object v4, v4, v1

    aget-object v2, v2, v1

    invoke-direct {v3, v4, v2, p1}, Lいいにぽつ/〺つふすそ/びぐびあび/げつ〴ぬぐ;-><init>(Ljava/lang/String;Ljava/lang/String;Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;)V

    move-object v2, v3

    :goto_30
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_10

    :cond_36
    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 2
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3e
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_5a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lいいにぽつ/〺つふすそ/びぐびあび/げつ〴ぬぐ;

    .line 3
    iget-object p2, p2, Lいいにぽつ/〺つふすそ/びぐびあび/げつ〴ぬぐ;->〺つふすそ:Ljava/lang/String;

    .line 4
    invoke-static {p2}, Lづざかべべ/は〲ぱなで/〺つふすそ;->のね〱ばぁぢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$びぐびあび;->げつ〴ぬぐ:Ljava/lang/String;

    invoke-virtual {p2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_3e

    const/4 p1, 0x1

    return p1

    :cond_5a
    return v0
.end method
