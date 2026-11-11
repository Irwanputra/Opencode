.class public Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final ぁごぐすすぃ:Ljava/util/regex/Pattern;

.field public static final づざかべべ:[Ljava/lang/String;

.field public static final なぎぱいぢぎ:Ljava/util/regex/Pattern;

.field public static final びぐびあび:[Ljava/lang/String;


# instance fields
.field public 〺つふすそ:Ljava/lang/String;

.field public くし〴〺ぅ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "L\u3044\u3044\u306b\u307d\u3064/\u303a\u3064\u3075\u3059\u305d/\u306a\u304e\u3071\u3044\u3062\u304e/\u3073\u3050\u3073\u3042\u3073;",
            ">;"
        }
    .end annotation
.end field

.field public げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;


# direct methods
.method public static constructor <clinit>()V
    .registers 8

    const/4 v0, 0x5

    new-array v1, v0, [Ljava/lang/String;

    const-string v2, ","

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, ">"

    const/4 v4, 0x1

    aput-object v2, v1, v4

    const-string v2, "+"

    const/4 v5, 0x2

    aput-object v2, v1, v5

    const-string v2, "~"

    const/4 v6, 0x3

    aput-object v2, v1, v6

    const-string v2, " "

    const/4 v7, 0x4

    aput-object v2, v1, v7

    sput-object v1, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->びぐびあび:[Ljava/lang/String;

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "="

    aput-object v2, v1, v3

    const-string v2, "!="

    aput-object v2, v1, v4

    const-string v2, "^="

    aput-object v2, v1, v5

    const-string v2, "$="

    aput-object v2, v1, v6

    const-string v2, "*="

    aput-object v2, v1, v7

    const-string v2, "~="

    aput-object v2, v1, v0

    sput-object v1, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->づざかべべ:[Ljava/lang/String;

    const-string v0, "(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?"

    invoke-static {v0, v5}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->なぎぱいぢぎ:Ljava/util/regex/Pattern;

    const-string v0, "([+-])?(\\d+)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->ぁごぐすすぃ:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    iput-object p1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->〺つふすそ:Ljava/lang/String;

    new-instance v0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    invoke-direct {v0, p1}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    return-void
.end method

.method public static 〳ぜぞぜべっ(Ljava/lang/String;)Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;
    .registers 3

    :try_start_0
    new-instance v0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;

    invoke-direct {v0, p0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->ぁごぐすすぃ()Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;

    move-result-object p0
    :try_end_9
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_9} :catch_a

    return-object p0

    :catch_a
    move-exception p0

    new-instance v0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/ぁごぐすすぃ;

    invoke-virtual {p0}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {v0, p0, v1}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/ぁごぐすすぃ;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v0
.end method


# virtual methods
.method public final 〺つふすそ()I
    .registers 6

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〺つふすそ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 1
    sget-object v1, Lいいにぽつ/〺つふすそ/くし〴〺ぅ/〺つふすそ;->げつ〴ぬぐ:[Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_2e

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_18

    goto :goto_2e

    :cond_18
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    :goto_1d
    if-ge v3, v2, :cond_2d

    invoke-virtual {v0, v3}, Ljava/lang/String;->codePointAt(I)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Character;->isDigit(I)Z

    move-result v4

    if-nez v4, :cond_2a

    goto :goto_2e

    :cond_2a
    add-int/lit8 v3, v3, 0x1

    goto :goto_1d

    :cond_2d
    const/4 v1, 0x1

    :cond_2e
    :goto_2e
    if-eqz v1, :cond_35

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    return v0

    .line 3
    :cond_35
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Index must be numeric"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_3e

    :goto_3d
    throw v0

    :goto_3e
    goto :goto_3d
.end method

.method public ぁごぐすすぃ()Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;
    .registers 4

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    invoke-virtual {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->なぎぱいぢぎ()Z

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    sget-object v1, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->びぐびあび:[Ljava/lang/String;

    invoke-virtual {v0, v1}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->いいにぽつ([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_23

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    new-instance v1, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〳ぜぞぜべっ$ぁごぐすすぃ;

    invoke-direct {v1}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〳ぜぞぜべっ$ぁごぐすすぃ;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_19
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    invoke-virtual {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->くし〴〺ぅ()C

    move-result v0

    :goto_1f
    invoke-virtual {p0, v0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ(C)V

    goto :goto_26

    :cond_23
    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->づざかべべ()V

    :goto_26
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    invoke-virtual {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->ぁごぐすすぃ()Z

    move-result v0

    if-nez v0, :cond_44

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    invoke-virtual {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->なぎぱいぢぎ()Z

    move-result v0

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    sget-object v2, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->びぐびあび:[Ljava/lang/String;

    invoke-virtual {v1, v2}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->いいにぽつ([Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3f

    goto :goto_19

    :cond_3f
    if-eqz v0, :cond_23

    const/16 v0, 0x20

    goto :goto_1f

    :cond_44
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_57

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;

    return-object v0

    :cond_57
    new-instance v0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ$げつ〴ぬぐ;

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    invoke-direct {v0, v1}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ$げつ〴ぬぐ;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public final くし〴〺ぅ(Z)V
    .registers 5

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    if-eqz p1, :cond_7

    const-string v1, ":containsOwn"

    goto :goto_9

    :cond_7
    const-string v1, ":contains"

    :goto_9
    invoke-virtual {v0, v1}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->びぐびあび(Ljava/lang/String;)V

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    const/16 v1, 0x28

    const/16 v2, 0x29

    invoke-virtual {v0, v1, v2}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->げつ〴ぬぐ(CC)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->のぷのちつ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ":contains(text) query must not be empty"

    invoke-static {v0, v1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->くぎぶ〼のそ(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_29

    iget-object p1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    new-instance v1, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$のぷのちつ;

    invoke-direct {v1, v0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$のぷのちつ;-><init>(Ljava/lang/String;)V

    goto :goto_30

    :cond_29
    iget-object p1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    new-instance v1, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$へぬ〴づぞ;

    invoke-direct {v1, v0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$へぬ〴づぞ;-><init>(Ljava/lang/String;)V

    :goto_30
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final げつ〴ぬぐ(C)V
    .registers 12

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    invoke-virtual {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->なぎぱいぢぎ()Z

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    :goto_a
    iget-object v1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    invoke-virtual {v1}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->ぁごぐすすぃ()Z

    move-result v1

    if-nez v1, :cond_64

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    const-string v2, "("

    invoke-virtual {v1, v2}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->ぺぁあねじ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2f

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    const/16 v2, 0x28

    const/16 v3, 0x29

    invoke-virtual {v1, v2, v3}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->げつ〴ぬぐ(CC)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    goto :goto_4b

    :cond_2f
    iget-object v1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    const-string v2, "["

    invoke-virtual {v1, v2}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->ぺぁあねじ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4f

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    const/16 v2, 0x5b

    const/16 v3, 0x5d

    invoke-virtual {v1, v2, v3}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->げつ〴ぬぐ(CC)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    :goto_4b
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_a

    :cond_4f
    iget-object v1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    sget-object v2, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->びぐびあび:[Ljava/lang/String;

    invoke-virtual {v1, v2}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->いいにぽつ([Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5a

    goto :goto_64

    :cond_5a
    iget-object v1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    invoke-virtual {v1}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->くし〴〺ぅ()C

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_a

    :cond_64
    :goto_64
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->〳ぜぞぜべっ(Ljava/lang/String;)Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;

    move-result-object v0

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/16 v2, 0x2c

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v1, v3, :cond_9e

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;

    instance-of v5, v1, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ$〺つふすそ;

    if-eqz v5, :cond_a5

    if-eq p1, v2, :cond_a5

    move-object v5, v1

    check-cast v5, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ$〺つふすそ;

    .line 3
    iget v6, v5, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ;->〺つふすそ:I

    if-lez v6, :cond_98

    iget-object v5, v5, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    add-int/lit8 v6, v6, -0x1

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;

    goto :goto_99

    :cond_98
    const/4 v5, 0x0

    :goto_99
    const/4 v6, 0x1

    move-object v9, v5

    move-object v5, v1

    move-object v1, v9

    goto :goto_a7

    .line 4
    :cond_9e
    new-instance v1, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ$げつ〴ぬぐ;

    iget-object v5, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    invoke-direct {v1, v5}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ$げつ〴ぬぐ;-><init>(Ljava/util/Collection;)V

    :cond_a5
    move-object v5, v1

    const/4 v6, 0x0

    :goto_a7
    iget-object v7, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->clear()V

    const/16 v7, 0x3e

    const/4 v8, 0x2

    if-ne p1, v7, :cond_c2

    new-instance p1, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ$げつ〴ぬぐ;

    new-array v2, v8, [Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;

    aput-object v0, v2, v4

    new-instance v0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〳ぜぞぜべっ$〺つふすそ;

    invoke-direct {v0, v1}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〳ぜぞぜべっ$〺つふすそ;-><init>(Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;)V

    aput-object v0, v2, v3

    invoke-direct {p1, v2}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ$げつ〴ぬぐ;-><init>([Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;)V

    goto :goto_119

    :cond_c2
    const/16 v7, 0x20

    if-ne p1, v7, :cond_d7

    new-instance p1, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ$げつ〴ぬぐ;

    new-array v2, v8, [Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;

    aput-object v0, v2, v4

    new-instance v0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〳ぜぞぜべっ$づざかべべ;

    invoke-direct {v0, v1}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〳ぜぞぜべっ$づざかべべ;-><init>(Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;)V

    aput-object v0, v2, v3

    invoke-direct {p1, v2}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ$げつ〴ぬぐ;-><init>([Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;)V

    goto :goto_119

    :cond_d7
    const/16 v7, 0x2b

    if-ne p1, v7, :cond_ec

    new-instance p1, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ$げつ〴ぬぐ;

    new-array v2, v8, [Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;

    aput-object v0, v2, v4

    new-instance v0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〳ぜぞぜべっ$くし〴〺ぅ;

    invoke-direct {v0, v1}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〳ぜぞぜべっ$くし〴〺ぅ;-><init>(Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;)V

    aput-object v0, v2, v3

    invoke-direct {p1, v2}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ$げつ〴ぬぐ;-><init>([Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;)V

    goto :goto_119

    :cond_ec
    const/16 v7, 0x7e

    if-ne p1, v7, :cond_101

    new-instance p1, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ$げつ〴ぬぐ;

    new-array v2, v8, [Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;

    aput-object v0, v2, v4

    new-instance v0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〳ぜぞぜべっ$なぎぱいぢぎ;

    invoke-direct {v0, v1}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〳ぜぞぜべっ$なぎぱいぢぎ;-><init>(Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;)V

    aput-object v0, v2, v3

    invoke-direct {p1, v2}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ$げつ〴ぬぐ;-><init>([Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;)V

    goto :goto_119

    :cond_101
    if-ne p1, v2, :cond_12f

    instance-of p1, v1, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ$〺つふすそ;

    if-eqz p1, :cond_10e

    check-cast v1, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ$〺つふすそ;

    invoke-virtual {v1, v0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ$〺つふすそ;->くし〴〺ぅ(Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;)V

    move-object p1, v1

    goto :goto_119

    :cond_10e
    new-instance p1, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ$〺つふすそ;

    invoke-direct {p1}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ$〺つふすそ;-><init>()V

    invoke-virtual {p1, v1}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ$〺つふすそ;->くし〴〺ぅ(Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;)V

    invoke-virtual {p1, v0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ$〺つふすそ;->くし〴〺ぅ(Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;)V

    :goto_119
    if-eqz v6, :cond_128

    move-object v0, v5

    check-cast v0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ$〺つふすそ;

    .line 5
    iget-object v1, v0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    iget v0, v0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ;->〺つふすそ:I

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v1, v0, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_129

    :cond_128
    move-object v5, p1

    .line 6
    :goto_129
    iget-object p1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    invoke-interface {p1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_12f
    new-instance v0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/ぁごぐすすぃ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown combinator: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v1, v4, [Ljava/lang/Object;

    invoke-direct {v0, p1, v1}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/ぁごぐすすぃ;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_149

    :goto_148
    throw v0

    :goto_149
    goto :goto_148
.end method

.method public final づざかべべ()V
    .registers 11

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    const-string v1, "#"

    invoke-virtual {v0, v1}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〳ぜぞぜべっ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1f

    .line 1
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    invoke-virtual {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->づざかべべ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->〱こか〺ぃせ(Ljava/lang/String;)V

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    new-instance v2, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$ぇぬぎばつ;

    invoke-direct {v2, v0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$ぇぬぎばつ;-><init>(Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3f2

    .line 2
    :cond_1f
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    const-string v1, "."

    invoke-virtual {v0, v1}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〳ぜぞぜべっ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_42

    .line 3
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    invoke-virtual {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->づざかべべ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->〱こか〺ぃせ(Ljava/lang/String;)V

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    new-instance v2, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$ぺふねづ〺;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$ぺふねづ〺;-><init>(Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3f2

    .line 4
    :cond_42
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    invoke-virtual {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->ぺふねづ〺()Z

    move-result v0

    const-string v1, "*|"

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v0, :cond_372

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    invoke-virtual {v0, v1}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->ぺぁあねじ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_59

    goto/16 :goto_372

    :cond_59
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    const-string v1, "["

    invoke-virtual {v0, v1}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->ぺぁあねじ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_150

    .line 5
    new-instance v0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    const/16 v5, 0x5b

    const/16 v6, 0x5d

    invoke-virtual {v1, v5, v6}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->げつ〴ぬぐ(CC)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;-><init>(Ljava/lang/String;)V

    sget-object v1, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->づざかべべ:[Ljava/lang/String;

    .line 6
    iget v5, v0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〺つふすそ:I

    :goto_76
    invoke-virtual {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->ぁごぐすすぃ()Z

    move-result v6

    if-nez v6, :cond_88

    invoke-virtual {v0, v1}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->いいにぽつ([Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_88

    iget v6, v0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〺つふすそ:I

    add-int/2addr v6, v3

    iput v6, v0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〺つふすそ:I

    goto :goto_76

    :cond_88
    iget-object v1, v0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/lang/String;

    iget v6, v0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〺つふすそ:I

    invoke-virtual {v1, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 7
    invoke-static {v1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->〱こか〺ぃせ(Ljava/lang/String;)V

    invoke-virtual {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->なぎぱいぢぎ()Z

    invoke-virtual {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->ぁごぐすすぃ()Z

    move-result v5

    if-eqz v5, :cond_bc

    const-string v0, "^"

    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b0

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    new-instance v2, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$びぐびあび;

    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$びぐびあび;-><init>(Ljava/lang/String;)V

    goto :goto_b7

    :cond_b0
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    new-instance v2, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$〺つふすそ;

    invoke-direct {v2, v1}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$〺つふすそ;-><init>(Ljava/lang/String;)V

    :goto_b7
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3f2

    :cond_bc
    const-string v5, "="

    invoke-virtual {v0, v5}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〳ぜぞぜべっ(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_d0

    iget-object v2, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    new-instance v3, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$づざかべべ;

    invoke-virtual {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->てぜきぽく()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v1, v0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$づざかべべ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_137

    :cond_d0
    const-string v5, "!="

    invoke-virtual {v0, v5}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〳ぜぞぜべっ(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_e4

    iget-object v2, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    new-instance v3, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$ぺぁあねじ;

    invoke-virtual {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->てぜきぽく()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v1, v0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$ぺぁあねじ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_137

    :cond_e4
    const-string v5, "^="

    invoke-virtual {v0, v5}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〳ぜぞぜべっ(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_f8

    iget-object v2, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    new-instance v3, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$いいにぽつ;

    invoke-virtual {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->てぜきぽく()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v1, v0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$いいにぽつ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_137

    :cond_f8
    const-string v5, "$="

    invoke-virtual {v0, v5}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〳ぜぞぜべっ(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_10c

    iget-object v2, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    new-instance v3, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$ぁごぐすすぃ;

    invoke-virtual {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->てぜきぽく()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v1, v0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$ぁごぐすすぃ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_137

    :cond_10c
    const-string v5, "*="

    invoke-virtual {v0, v5}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〳ぜぞぜべっ(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_120

    iget-object v2, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    new-instance v3, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$なぎぱいぢぎ;

    invoke-virtual {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->てぜきぽく()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v1, v0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$なぎぱいぢぎ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_137

    :cond_120
    const-string v5, "~="

    invoke-virtual {v0, v5}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〳ぜぞぜべっ(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_13c

    iget-object v2, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    new-instance v3, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$〳ぜぞぜべっ;

    invoke-virtual {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->てぜきぽく()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-direct {v3, v1, v0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$〳ぜぞぜべっ;-><init>(Ljava/lang/String;Ljava/util/regex/Pattern;)V

    :goto_137
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3f2

    :cond_13c
    new-instance v1, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/ぁごぐすすぃ;

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v5, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->〺つふすそ:Ljava/lang/String;

    aput-object v5, v2, v4

    invoke-virtual {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->てぜきぽく()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v2, v3

    const-string v0, "Could not parse attribute query \'%s\': unexpected token at \'%s\'"

    invoke-direct {v1, v0, v2}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/ぁごぐすすぃ;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v1

    .line 8
    :cond_150
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    const-string v1, "*"

    invoke-virtual {v0, v1}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〳ぜぞぜべっ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_166

    .line 9
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    new-instance v1, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$げつ〴ぬぐ;

    invoke-direct {v1}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$げつ〴ぬぐ;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3f2

    .line 10
    :cond_166
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    const-string v1, ":lt("

    invoke-virtual {v0, v1}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〳ぜぞぜべっ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_180

    .line 11
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    new-instance v1, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$ごづごきえ;

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->〺つふすそ()I

    move-result v2

    invoke-direct {v1, v2}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$ごづごきえ;-><init>(I)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3f2

    .line 12
    :cond_180
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    const-string v1, ":gt("

    invoke-virtual {v0, v1}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〳ぜぞぜべっ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_19a

    .line 13
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    new-instance v1, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$は〲ぱなで;

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->〺つふすそ()I

    move-result v2

    invoke-direct {v1, v2}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$は〲ぱなで;-><init>(I)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3f2

    .line 14
    :cond_19a
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    const-string v1, ":eq("

    invoke-virtual {v0, v1}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〳ぜぞぜべっ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1b4

    .line 15
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    new-instance v1, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$ぉざぅち〻;

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->〺つふすそ()I

    move-result v2

    invoke-direct {v1, v2}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$ぉざぅち〻;-><init>(I)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3f2

    .line 16
    :cond_1b4
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    const-string v1, ":has("

    invoke-virtual {v0, v1}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->ぺぁあねじ(Ljava/lang/String;)Z

    move-result v0

    const/16 v1, 0x29

    const/16 v5, 0x28

    if-eqz v0, :cond_1e4

    .line 17
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    const-string v2, ":has"

    invoke-virtual {v0, v2}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->びぐびあび(Ljava/lang/String;)V

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    invoke-virtual {v0, v5, v1}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->げつ〴ぬぐ(CC)Ljava/lang/String;

    move-result-object v0

    const-string v1, ":has(el) subselect must not be empty"

    invoke-static {v0, v1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->くぎぶ〼のそ(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    new-instance v2, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〳ぜぞぜべっ$げつ〴ぬぐ;

    invoke-static {v0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->〳ぜぞぜべっ(Ljava/lang/String;)Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;

    move-result-object v0

    invoke-direct {v2, v0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〳ぜぞぜべっ$げつ〴ぬぐ;-><init>(Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3f2

    .line 18
    :cond_1e4
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    const-string v6, ":contains("

    invoke-virtual {v0, v6}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->ぺぁあねじ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1f3

    invoke-virtual {p0, v4}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ(Z)V

    goto/16 :goto_3f2

    :cond_1f3
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    const-string v6, ":containsOwn("

    invoke-virtual {v0, v6}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->ぺぁあねじ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_202

    invoke-virtual {p0, v3}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ(Z)V

    goto/16 :goto_3f2

    :cond_202
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    const-string v6, ":containsData("

    invoke-virtual {v0, v6}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->ぺぁあねじ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_22e

    .line 19
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    const-string v2, ":containsData"

    invoke-virtual {v0, v2}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->びぐびあび(Ljava/lang/String;)V

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    invoke-virtual {v0, v5, v1}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->げつ〴ぬぐ(CC)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->のぷのちつ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ":containsData(text) query must not be empty"

    invoke-static {v0, v1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->くぎぶ〼のそ(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    new-instance v2, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$てぜきぽく;

    invoke-direct {v2, v0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$てぜきぽく;-><init>(Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3f2

    .line 20
    :cond_22e
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    const-string v6, ":matches("

    invoke-virtual {v0, v6}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->ぺぁあねじ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_23d

    invoke-virtual {p0, v4}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->なぎぱいぢぎ(Z)V

    goto/16 :goto_3f2

    :cond_23d
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    const-string v6, ":matchesOwn("

    invoke-virtual {v0, v6}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->ぺぁあねじ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_24c

    invoke-virtual {p0, v3}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->なぎぱいぢぎ(Z)V

    goto/16 :goto_3f2

    :cond_24c
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    const-string v6, ":not("

    invoke-virtual {v0, v6}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->ぺぁあねじ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_278

    .line 21
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    const-string v2, ":not"

    invoke-virtual {v0, v2}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->びぐびあび(Ljava/lang/String;)V

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    invoke-virtual {v0, v5, v1}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->げつ〴ぬぐ(CC)Ljava/lang/String;

    move-result-object v0

    const-string v1, ":not(selector) subselect must not be empty"

    invoke-static {v0, v1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->くぎぶ〼のそ(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    new-instance v2, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〳ぜぞぜべっ$びぐびあび;

    invoke-static {v0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->〳ぜぞぜべっ(Ljava/lang/String;)Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;

    move-result-object v0

    invoke-direct {v2, v0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〳ぜぞぜべっ$びぐびあび;-><init>(Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3f2

    .line 22
    :cond_278
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    const-string v1, ":nth-child("

    invoke-virtual {v0, v1}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〳ぜぞぜべっ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_287

    invoke-virtual {p0, v4, v4}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->びぐびあび(ZZ)V

    goto/16 :goto_3f2

    :cond_287
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    const-string v1, ":nth-last-child("

    invoke-virtual {v0, v1}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〳ぜぞぜべっ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_296

    invoke-virtual {p0, v3, v4}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->びぐびあび(ZZ)V

    goto/16 :goto_3f2

    :cond_296
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    const-string v1, ":nth-of-type("

    invoke-virtual {v0, v1}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〳ぜぞぜべっ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2a5

    invoke-virtual {p0, v4, v3}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->びぐびあび(ZZ)V

    goto/16 :goto_3f2

    :cond_2a5
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    const-string v1, ":nth-last-of-type("

    invoke-virtual {v0, v1}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〳ぜぞぜべっ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2b4

    invoke-virtual {p0, v3, v3}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->びぐびあび(ZZ)V

    goto/16 :goto_3f2

    :cond_2b4
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    const-string v1, ":first-child"

    invoke-virtual {v0, v1}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〳ぜぞぜべっ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2ca

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    new-instance v1, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$でどあくず;

    invoke-direct {v1}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$でどあくず;-><init>()V

    :goto_2c5
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3f2

    :cond_2ca
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    const-string v1, ":last-child"

    invoke-virtual {v0, v1}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〳ぜぞぜべっ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2dc

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    new-instance v1, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$〻ぞまぎな〻;

    invoke-direct {v1}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$〻ぞまぎな〻;-><init>()V

    goto :goto_2c5

    :cond_2dc
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    const-string v1, ":first-of-type"

    invoke-virtual {v0, v1}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〳ぜぞぜべっ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2ee

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    new-instance v1, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$ぶでにく〼〳;

    invoke-direct {v1}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$ぶでにく〼〳;-><init>()V

    goto :goto_2c5

    :cond_2ee
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    const-string v1, ":last-of-type"

    invoke-virtual {v0, v1}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〳ぜぞぜべっ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_300

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    new-instance v1, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$ぉ〲なぱぽた;

    invoke-direct {v1}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$ぉ〲なぱぽた;-><init>()V

    goto :goto_2c5

    :cond_300
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    const-string v1, ":only-child"

    invoke-virtual {v0, v1}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〳ぜぞぜべっ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_312

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    new-instance v1, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$ぅみぱぎぎ;

    invoke-direct {v1}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$ぅみぱぎぎ;-><init>()V

    goto :goto_2c5

    :cond_312
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    const-string v1, ":only-of-type"

    invoke-virtual {v0, v1}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〳ぜぞぜべっ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_324

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    new-instance v1, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$じぜこほぱ;

    invoke-direct {v1}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$じぜこほぱ;-><init>()V

    goto :goto_2c5

    :cond_324
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    const-string v1, ":empty"

    invoke-virtual {v0, v1}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〳ぜぞぜべっ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_336

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    new-instance v1, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$ざっざへづ;

    invoke-direct {v1}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$ざっざへづ;-><init>()V

    goto :goto_2c5

    :cond_336
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    const-string v1, ":root"

    invoke-virtual {v0, v1}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〳ぜぞぜべっ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_349

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    new-instance v1, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$ぺづげぺが;

    invoke-direct {v1}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$ぺづげぺが;-><init>()V

    goto/16 :goto_2c5

    :cond_349
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    const-string v1, ":matchText"

    invoke-virtual {v0, v1}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〳ぜぞぜべっ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_35c

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    new-instance v1, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$ぉひのべい;

    invoke-direct {v1}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$ぉひのべい;-><init>()V

    goto/16 :goto_2c5

    :cond_35c
    new-instance v0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/ぁごぐすすぃ;

    new-array v1, v2, [Ljava/lang/Object;

    iget-object v2, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->〺つふすそ:Ljava/lang/String;

    aput-object v2, v1, v4

    iget-object v2, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    invoke-virtual {v2}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->てぜきぽく()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v3

    const-string v2, "Could not parse query \'%s\': unexpected token at \'%s\'"

    invoke-direct {v0, v2, v1}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/ぁごぐすすぃ;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v0

    .line 23
    :cond_372
    :goto_372
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    .line 24
    iget v5, v0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〺つふすそ:I

    :goto_376
    invoke-virtual {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->ぁごぐすすぃ()Z

    move-result v6

    const-string v7, "|"

    if-nez v6, :cond_3a0

    invoke-virtual {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->ぺふねづ〺()Z

    move-result v6

    if-nez v6, :cond_39a

    const/4 v6, 0x4

    new-array v6, v6, [Ljava/lang/String;

    aput-object v1, v6, v4

    aput-object v7, v6, v3

    const-string v8, "_"

    aput-object v8, v6, v2

    const/4 v8, 0x3

    const-string v9, "-"

    aput-object v9, v6, v8

    invoke-virtual {v0, v6}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->いいにぽつ([Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3a0

    :cond_39a
    iget v6, v0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〺つふすそ:I

    add-int/2addr v6, v3

    iput v6, v0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〺つふすそ:I

    goto :goto_376

    :cond_3a0
    iget-object v6, v0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->げつ〴ぬぐ:Ljava/lang/String;

    iget v0, v0, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〺つふすそ:I

    invoke-virtual {v6, v5, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 25
    invoke-static {v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->〱こか〺ぃせ(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    const-string v6, ":"

    if-eqz v5, :cond_3da

    iget-object v5, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    new-instance v7, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ$〺つふすそ;

    new-array v2, v2, [Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;

    new-instance v8, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$けときぜと;

    invoke-static {v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->くねねぱす〻(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$けときぜと;-><init>(Ljava/lang/String;)V

    aput-object v8, v2, v4

    new-instance v4, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$おかぷせ〱;

    invoke-virtual {v0, v1, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->くねねぱす〻(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$おかぷせ〱;-><init>(Ljava/lang/String;)V

    aput-object v4, v2, v3

    invoke-direct {v7, v2}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/〺つふすそ$〺つふすそ;-><init>([Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;)V

    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3f2

    :cond_3da
    invoke-virtual {v0, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3e4

    invoke-virtual {v0, v7, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    :cond_3e4
    iget-object v1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    new-instance v2, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$けときぜと;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$けときぜと;-><init>(Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_3f2
    return-void
.end method

.method public final なぎぱいぢぎ(Z)V
    .registers 5

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    if-eqz p1, :cond_7

    const-string v1, ":matchesOwn"

    goto :goto_9

    :cond_7
    const-string v1, ":matches"

    :goto_9
    invoke-virtual {v0, v1}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->びぐびあび(Ljava/lang/String;)V

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    const/16 v1, 0x28

    const/16 v2, 0x29

    invoke-virtual {v0, v1, v2}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->げつ〴ぬぐ(CC)Ljava/lang/String;

    move-result-object v0

    const-string v1, ":matches(regex) query must not be empty"

    invoke-static {v0, v1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->くぎぶ〼のそ(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_29

    iget-object p1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    new-instance v1, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$ぷぞてのほき;

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-direct {v1, v0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$ぷぞてのほき;-><init>(Ljava/util/regex/Pattern;)V

    goto :goto_34

    :cond_29
    iget-object p1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    new-instance v1, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$せづっ〸ちね;

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-direct {v1, v0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$せづっ〸ちね;-><init>(Ljava/util/regex/Pattern;)V

    :goto_34
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final びぐびあび(ZZ)V
    .registers 11

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Lいいにぽつ/〺つふすそ/づざかべべ/ぺぁあねじ;->〺つふすそ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->くねねぱす〻(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->なぎぱいぢぎ:Ljava/util/regex/Pattern;

    invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    sget-object v2, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->ぁごぐすすぃ:Ljava/util/regex/Pattern;

    invoke-virtual {v2, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    const-string v3, "odd"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x2

    if-eqz v3, :cond_26

    const/4 v0, 0x1

    :goto_24
    const/4 v4, 0x2

    goto :goto_76

    :cond_26
    const-string v3, "even"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_30

    const/4 v0, 0x0

    goto :goto_24

    :cond_30
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v3

    const-string v6, ""

    const-string v7, "^\\+"

    if-eqz v3, :cond_64

    const/4 v0, 0x3

    invoke-virtual {v1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4d

    invoke-virtual {v1, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v7, v6}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    :cond_4d
    const/4 v0, 0x4

    invoke-virtual {v1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_61

    invoke-virtual {v1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v7, v6}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    move v4, v0

    :cond_61
    move v0, v4

    move v4, v5

    goto :goto_76

    :cond_64
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_9f

    invoke-virtual {v2}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v7, v6}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    :goto_76
    if-eqz p2, :cond_8a

    if-eqz p1, :cond_82

    iget-object p1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    new-instance p2, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$なぶひせが;

    invoke-direct {p2, v4, v0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$なぶひせが;-><init>(II)V

    goto :goto_9b

    :cond_82
    iget-object p1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    new-instance p2, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$どぇぞほだ;

    invoke-direct {p2, v4, v0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$どぇぞほだ;-><init>(II)V

    goto :goto_9b

    :cond_8a
    if-eqz p1, :cond_94

    iget-object p1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    new-instance p2, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$びえぁぜい;

    invoke-direct {p2, v4, v0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$びえぁぜい;-><init>(II)V

    goto :goto_9b

    :cond_94
    iget-object p1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/util/List;

    new-instance p2, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$ぇ〳〲〺すっ;

    invoke-direct {p2, v4, v0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$ぇ〳〲〺すっ;-><init>(II)V

    :goto_9b
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_9f
    new-instance p1, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/ぁごぐすすぃ;

    new-array p2, v5, [Ljava/lang/Object;

    aput-object v0, p2, v4

    const-string v0, "Could not parse nth-index \'%s\': unexpected format"

    invoke-direct {p1, v0, p2}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/ぁごぐすすぃ;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_ac

    :goto_ab
    throw p1

    :goto_ac
    goto :goto_ab
.end method
