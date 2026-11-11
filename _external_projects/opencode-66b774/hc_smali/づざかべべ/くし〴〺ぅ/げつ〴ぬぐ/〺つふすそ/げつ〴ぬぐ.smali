.class public Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;
.super Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "L\u3065\u3056\u304b\u3079\u3079/\u304f\u3057\u3034\u303a\u3045/\u3052\u3064\u3034\u306c\u3050/\u303a\u3064\u3075\u3059\u305d/\u303a\u3064\u3075\u3059\u305d<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field public なぎぱいぢぎ:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "TK;",
            "L\u3065\u3056\u304b\u3079\u3079/\u304f\u3057\u3034\u303a\u3045/\u3052\u3064\u3034\u306c\u3050/\u303a\u3064\u3075\u3059\u305d/\u303a\u3064\u3075\u3059\u305d$\u304f\u3057\u3034\u303a\u3045<",
            "TK;TV;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)Z"
        }
    .end annotation

    iget-object v0, p0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public げつ〴ぬぐ(Ljava/lang/Object;)Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "L\u3065\u3056\u304b\u3079\u3079/\u304f\u3057\u3034\u303a\u3045/\u3052\u3064\u3034\u306c\u3050/\u303a\u3064\u3075\u3059\u305d/\u303a\u3064\u3075\u3059\u305d$\u304f\u3057\u3034\u303a\u3045<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;

    return-object p1
.end method

.method public づざかべべ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;

    if-eqz v0, :cond_d

    .line 2
    iget-object p1, v0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;->くし〴〺ぅ:Ljava/lang/Object;

    return-object p1

    :cond_d
    iget-object v0, p0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/util/HashMap;

    invoke-virtual {p0, p1, p2}, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;->くし〴〺ぅ(Ljava/lang/Object;Ljava/lang/Object;)Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    return-object p1
.end method

.method public びぐびあび(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)TV;"
        }
    .end annotation

    invoke-super {p0, p1}, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;->びぐびあび(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
