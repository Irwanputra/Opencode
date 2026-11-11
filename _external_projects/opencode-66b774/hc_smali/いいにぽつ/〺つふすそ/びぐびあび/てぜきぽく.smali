.class public abstract Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;
.super Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;
.source ""


# static fields
.field public static final づざかべべ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "L\u3044\u3044\u306b\u307d\u3064/\u303a\u3064\u3075\u3059\u305d/\u3073\u3050\u3073\u3042\u3073/\u3078\u306c\u3034\u3065\u305e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public びぐびあび:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    sput-object v0, Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;->づざかべべ:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;-><init>()V

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Ljava/lang/String;)Ljava/lang/String;
    .registers 3

    invoke-static {p1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ずまげせび〳(Ljava/lang/Object;)V

    .line 1
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;->びぐびあび:Ljava/lang/Object;

    instance-of v0, v0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;

    if-nez v0, :cond_1b

    .line 2
    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->ぇぬぎばつ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_18

    iget-object p1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;->びぐびあび:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    goto :goto_1a

    :cond_18
    const-string p1, ""

    :goto_1a
    return-object p1

    :cond_1b
    invoke-super {p0, p1}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->〺つふすそ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final 〻ぞまぎな〻()V
    .registers 4

    .line 1
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;->びぐびあび:Ljava/lang/Object;

    instance-of v1, v0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;

    if-nez v1, :cond_18

    .line 2
    new-instance v1, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;

    invoke-direct {v1}, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;-><init>()V

    iput-object v1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;->びぐびあび:Ljava/lang/Object;

    if-eqz v0, :cond_18

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->ぇぬぎばつ()Ljava/lang/String;

    move-result-object v2

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->ぺふねづ〺(Ljava/lang/String;Ljava/lang/String;)Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;

    :cond_18
    return-void
.end method

.method public いいにぽつ()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "L\u3044\u3044\u306b\u307d\u3064/\u303a\u3064\u3075\u3059\u305d/\u3073\u3050\u3073\u3042\u3073/\u3078\u306c\u3034\u3065\u305e;",
            ">;"
        }
    .end annotation

    sget-object v0, Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;->づざかべべ:Ljava/util/List;

    return-object v0
.end method

.method public くし〴〺ぅ(Ljava/lang/String;Ljava/lang/String;)Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;
    .registers 4

    .line 1
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;->びぐびあび:Ljava/lang/Object;

    instance-of v0, v0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;

    if-nez v0, :cond_11

    const-string v0, "#doctype"

    .line 2
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    iput-object p2, p0, Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;->びぐびあび:Ljava/lang/Object;

    goto :goto_17

    :cond_11
    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;->〻ぞまぎな〻()V

    invoke-super {p0, p1, p2}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->くし〴〺ぅ(Ljava/lang/String;Ljava/lang/String;)Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;

    :goto_17
    return-object p0
.end method

.method public げつ〴ぬぐ(Ljava/lang/String;)Ljava/lang/String;
    .registers 2

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;->〻ぞまぎな〻()V

    invoke-super {p0, p1}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->げつ〴ぬぐ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public づざかべべ()Ljava/lang/String;
    .registers 3

    .line 1
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->〺つふすそ:Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;

    if-eqz v0, :cond_6

    const/4 v1, 0x1

    goto :goto_7

    :cond_6
    const/4 v1, 0x0

    :goto_7
    if-eqz v1, :cond_e

    .line 2
    invoke-virtual {v0}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->づざかべべ()Ljava/lang/String;

    move-result-object v0

    goto :goto_10

    :cond_e
    const-string v0, ""

    :goto_10
    return-object v0
.end method

.method public てぜきぽく(Ljava/lang/String;)Z
    .registers 2

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;->〻ぞまぎな〻()V

    invoke-super {p0, p1}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->てぜきぽく(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public なぎぱいぢぎ()I
    .registers 2

    const/4 v0, 0x0

    return v0
.end method

.method public final のぷのちつ()Z
    .registers 2

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;->びぐびあび:Ljava/lang/Object;

    instance-of v0, v0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;

    return v0
.end method

.method public final びぐびあび()Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;
    .registers 2

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;->〻ぞまぎな〻()V

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;->びぐびあび:Ljava/lang/Object;

    check-cast v0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;

    return-object v0
.end method

.method public ぶでにく〼〳()Ljava/lang/String;
    .registers 2

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->ぇぬぎばつ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;->〺つふすそ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ぺぁあねじ(Ljava/lang/String;)V
    .registers 2

    return-void
.end method
