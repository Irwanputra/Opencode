.class public abstract Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ$げつ〴ぬぐ;
    }
.end annotation


# instance fields
.field public 〺つふすそ:Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;

.field public くし〴〺ぅ:I


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .registers 2

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->ぁごぐすすぃ()Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 2

    if-ne p0, p1, :cond_4

    const/4 p1, 0x1

    goto :goto_5

    :cond_4
    const/4 p1, 0x0

    :goto_5
    return p1
.end method

.method public toString()Ljava/lang/String;
    .registers 2

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->ぉざぅち〻()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public 〳ぜぞぜべっ(Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;)Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;
    .registers 3

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;
    :try_end_6
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_6} :catch_11

    iput-object p1, v0, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->〺つふすそ:Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;

    if-nez p1, :cond_c

    const/4 p1, 0x0

    goto :goto_e

    :cond_c
    iget p1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->くし〴〺ぅ:I

    :goto_e
    iput p1, v0, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->くし〴〺ぅ:I

    return-object v0

    :catch_11
    move-exception p1

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public 〺つふすそ(Ljava/lang/String;)Ljava/lang/String;
    .registers 5

    invoke-static {p1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ずまげせび〳(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->のぷのちつ()Z

    move-result v0

    const-string v1, ""

    if-nez v0, :cond_c

    return-object v1

    :cond_c
    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->びぐびあび()Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;

    move-result-object v0

    invoke-virtual {v0, p1}, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->ぁごぐすすぃ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_1b

    return-object v0

    :cond_1b
    const-string v0, "abs:"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2d

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->げつ〴ぬぐ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2d
    return-object v1
.end method

.method public ぁごぐすすぃ()Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;
    .registers 8

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->〳ぜぞぜべっ(Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;)Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;

    move-result-object v0

    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    invoke-virtual {v1, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    :cond_d
    invoke-virtual {v1}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_37

    invoke-virtual {v1}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;

    invoke-virtual {v2}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->なぎぱいぢぎ()I

    move-result v3

    const/4 v4, 0x0

    :goto_1e
    if-ge v4, v3, :cond_d

    invoke-virtual {v2}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->いいにぽつ()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;

    invoke-virtual {v6, v2}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->〳ぜぞぜべっ(Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;)Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;

    move-result-object v6

    invoke-interface {v5, v4, v6}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, v6}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_1e

    :cond_37
    return-object v0
.end method

.method public abstract いいにぽつ()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "L\u3044\u3044\u306b\u307d\u3064/\u303a\u3064\u3075\u3059\u305d/\u3073\u3050\u3073\u3042\u3073/\u3078\u306c\u3034\u3065\u305e;",
            ">;"
        }
    .end annotation
.end method

.method public abstract ぇぬぎばつ()Ljava/lang/String;
.end method

.method public ぉざぅち〻()Ljava/lang/String;
    .registers 4

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1
    new-instance v1, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ$げつ〴ぬぐ;

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->ぺふねづ〺()Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ$げつ〴ぬぐ;-><init>(Ljava/lang/Appendable;Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;)V

    invoke-static {v1, p0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->しげにけぃ(Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/づざかべべ;Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;)V

    .line 2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public おぐぴう〸ず()Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;
    .registers 5

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->〺つふすそ:Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return-object v1

    :cond_6
    invoke-virtual {v0}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->いいにぽつ()Ljava/util/List;

    move-result-object v0

    iget v2, p0, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->くし〴〺ぅ:I

    add-int/lit8 v2, v2, 0x1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-le v3, v2, :cond_1b

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;

    return-object v0

    :cond_1b
    return-object v1
.end method

.method public くし〴〺ぅ(Ljava/lang/String;Ljava/lang/String;)Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;
    .registers 6

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->びぐびあび()Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;

    move-result-object v0

    .line 1
    invoke-virtual {v0, p1}, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->いいにぽつ(Ljava/lang/String;)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1e

    iget-object v2, v0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->びぐびあび:[Ljava/lang/String;

    aput-object p2, v2, v1

    iget-object p2, v0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->くし〴〺ぅ:[Ljava/lang/String;

    aget-object p2, p2, v1

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_21

    iget-object p2, v0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->くし〴〺ぅ:[Ljava/lang/String;

    aput-object p1, p2, v1

    goto :goto_21

    :cond_1e
    invoke-virtual {v0, p1, p2}, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->げつ〴ぬぐ(Ljava/lang/String;Ljava/lang/String;)V

    :cond_21
    :goto_21
    return-object p0
.end method

.method public げつ〴ぬぐ(Ljava/lang/String;)Ljava/lang/String;
    .registers 5

    invoke-static {p1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->〱こか〺ぃせ(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->てぜきぽく(Ljava/lang/String;)Z

    move-result v0

    const-string v1, ""

    if-nez v0, :cond_c

    return-object v1

    :cond_c
    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->づざかべべ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->〺つふすそ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1
    sget-object v2, Lいいにぽつ/〺つふすそ/くし〴〺ぅ/〺つふすそ;->げつ〴ぬぐ:[Ljava/lang/String;

    :try_start_16
    new-instance v2, Ljava/net/URL;

    invoke-direct {v2, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_1b
    .catch Ljava/net/MalformedURLException; {:try_start_16 .. :try_end_1b} :catch_24

    :try_start_1b
    invoke-static {v2, p1}, Lいいにぽつ/〺つふすそ/くし〴〺ぅ/〺つふすそ;->なぎぱいぢぎ(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URL;

    move-result-object p1

    invoke-virtual {p1}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;

    move-result-object v1

    goto :goto_2d

    :catch_24
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;

    move-result-object v1
    :try_end_2d
    .catch Ljava/net/MalformedURLException; {:try_start_1b .. :try_end_2d} :catch_2d

    :catch_2d
    :goto_2d
    return-object v1
.end method

.method public final ごづごきえ(I)V
    .registers 4

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->いいにぽつ()Ljava/util/List;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_15

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;

    .line 1
    iput p1, v1, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->くし〴〺ぅ:I

    add-int/lit8 p1, p1, 0x1

    goto :goto_4

    :cond_15
    return-void
.end method

.method public ざっざへづ()V
    .registers 2

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->〺つふすそ:Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;

    invoke-static {v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ずまげせび〳(Ljava/lang/Object;)V

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->〺つふすそ:Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;

    invoke-virtual {v0, p0}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->でどあくず(Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;)V

    return-void
.end method

.method public abstract ざとぅぼこ〺(Ljava/lang/Appendable;ILいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;)V
.end method

.method public abstract づざかべべ()Ljava/lang/String;
.end method

.method public てぜきぽく(Ljava/lang/String;)Z
    .registers 7

    invoke-static {p1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ずまげせび〳(Ljava/lang/Object;)V

    const-string v0, "abs:"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, -0x1

    if-eqz v0, :cond_2f

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->びぐびあび()Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;

    move-result-object v4

    .line 1
    invoke-virtual {v4, v0}, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->いいにぽつ(Ljava/lang/String;)I

    move-result v4

    if-eq v4, v3, :cond_1f

    const/4 v4, 0x1

    goto :goto_20

    :cond_1f
    const/4 v4, 0x0

    :goto_20
    if-eqz v4, :cond_2f

    .line 2
    invoke-virtual {p0, v0}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->げつ〴ぬぐ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v4, ""

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2f

    return v2

    :cond_2f
    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->びぐびあび()Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;

    move-result-object v0

    .line 3
    invoke-virtual {v0, p1}, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->いいにぽつ(Ljava/lang/String;)I

    move-result p1

    if-eq p1, v3, :cond_3a

    const/4 v1, 0x1

    :cond_3a
    return v1
.end method

.method public でどあくず(Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;)V
    .registers 4

    iget-object v0, p1, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->〺つふすそ:Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;

    if-ne v0, p0, :cond_6

    const/4 v0, 0x1

    goto :goto_7

    :cond_6
    const/4 v0, 0x0

    :goto_7
    invoke-static {v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ばおぢでぎか(Z)V

    iget v0, p1, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->くし〴〺ぅ:I

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->いいにぽつ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->ごづごきえ(I)V

    const/4 v0, 0x0

    iput-object v0, p1, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->〺つふすそ:Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;

    return-void
.end method

.method public abstract なぎぱいぢぎ()I
.end method

.method public abstract のぷのちつ()Z
.end method

.method public abstract は〲ぱなで(Ljava/lang/Appendable;ILいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;)V
.end method

.method public abstract びぐびあび()Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;
.end method

.method public へぬ〴づぞ(Ljava/lang/Appendable;ILいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;)V
    .registers 6

    const/16 v0, 0xa

    invoke-interface {p1, v0}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    move-result-object p1

    .line 1
    iget p3, p3, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;->ぁごぐすすぃ:I

    mul-int p2, p2, p3

    .line 2
    sget-object p3, Lいいにぽつ/〺つふすそ/くし〴〺ぅ/〺つふすそ;->げつ〴ぬぐ:[Ljava/lang/String;

    if-ltz p2, :cond_2a

    sget-object p3, Lいいにぽつ/〺つふすそ/くし〴〺ぅ/〺つふすそ;->げつ〴ぬぐ:[Ljava/lang/String;

    array-length v0, p3

    if-ge p2, v0, :cond_16

    aget-object p2, p3, p2

    goto :goto_26

    :cond_16
    new-array p3, p2, [C

    const/4 v0, 0x0

    :goto_19
    if-ge v0, p2, :cond_22

    const/16 v1, 0x20

    aput-char v1, p3, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_19

    :cond_22
    invoke-static {p3}, Ljava/lang/String;->valueOf([C)Ljava/lang/String;

    move-result-object p2

    .line 3
    :goto_26
    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    return-void

    .line 4
    :cond_2a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "width must be > 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_33

    :goto_32
    throw p1

    :goto_33
    goto :goto_32
.end method

.method public abstract ぺぁあねじ(Ljava/lang/String;)V
.end method

.method public ぺふねづ〺()Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;
    .registers 3

    move-object v0, p0

    .line 1
    :goto_1
    iget-object v1, v0, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->〺つふすそ:Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;

    if-eqz v1, :cond_7

    move-object v0, v1

    goto :goto_1

    .line 2
    :cond_7
    instance-of v1, v0, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ;

    if-eqz v1, :cond_e

    check-cast v0, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ;

    goto :goto_f

    :cond_e
    const/4 v0, 0x0

    :goto_f
    if-eqz v0, :cond_14

    .line 3
    :goto_11
    iget-object v0, v0, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ;->いいにぽつ:Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;

    goto :goto_1c

    .line 4
    :cond_14
    new-instance v0, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ;

    const-string v1, ""

    invoke-direct {v0, v1}, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ;-><init>(Ljava/lang/String;)V

    goto :goto_11

    :goto_1c
    return-object v0
.end method
