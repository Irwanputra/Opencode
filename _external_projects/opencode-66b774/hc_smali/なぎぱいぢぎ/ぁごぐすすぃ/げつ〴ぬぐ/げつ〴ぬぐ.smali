.class public abstract Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;
    }
.end annotation


# instance fields
.field public 〺つふすそ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "L\u306a\u304e\u3071\u3044\u3062\u304e/\u3041\u3054\u3050\u3059\u3059\u3043/\u3052\u3064\u3034\u306c\u3050/\u3052\u3064\u3034\u306c\u3050$\u3052\u3064\u3034\u306c\u3050;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .registers 2

    invoke-virtual {p0}, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ()Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ;

    move-result-object v0

    return-object v0
.end method

.method public 〺つふすそ()Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ;
    .registers 7

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ;

    iget-object v1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:Ljava/util/ArrayList;

    if-eqz v1, :cond_24

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_16
    if-ge v3, v2, :cond_24

    iget-object v4, v0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_21
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_21} :catch_25

    add-int/lit8 v3, v3, 0x1

    goto :goto_16

    :cond_24
    return-object v0

    :catch_25
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    goto :goto_2c

    :goto_2b
    throw v0

    :goto_2c
    goto :goto_2b
.end method

.method public くし〴〺ぅ()V
    .registers 1

    return-void
.end method

.method public げつ〴ぬぐ(Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;)V
    .registers 3

    iget-object v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:Ljava/util/ArrayList;

    if-nez v0, :cond_b

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:Ljava/util/ArrayList;

    :cond_b
    iget-object v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public づざかべべ(Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;)V
    .registers 3

    iget-object v0, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:Ljava/util/ArrayList;

    if-nez v0, :cond_5

    return-void

    :cond_5
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-nez p1, :cond_13

    const/4 p1, 0x0

    iput-object p1, p0, Lなぎぱいぢぎ/ぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:Ljava/util/ArrayList;

    :cond_13
    return-void
.end method

.method public なぎぱいぢぎ()V
    .registers 1

    return-void
.end method

.method public abstract びぐびあび()Z
.end method
