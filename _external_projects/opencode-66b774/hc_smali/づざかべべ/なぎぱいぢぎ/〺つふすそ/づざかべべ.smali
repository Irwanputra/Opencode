.class public Lづざかべべ/なぎぱいぢぎ/〺つふすそ/づざかべべ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "L\u3065\u3056\u304b\u3079\u3079/\u306a\u304e\u3071\u3044\u3062\u304e/\u303a\u3064\u3075\u3059\u305d/\u3065\u3056\u304b\u3079\u3079<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public 〺つふすそ:I

.field public final げつ〴ぬぐ:[Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-lez p1, :cond_a

    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/づざかべべ;->げつ〴ぬぐ:[Ljava/lang/Object;

    return-void

    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The max pool size must be > 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public 〺つふすそ(Ljava/lang/Object;)Z
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    iget v0, p0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/づざかべべ;->〺つふすそ:I

    iget-object v1, p0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/づざかべべ;->げつ〴ぬぐ:[Ljava/lang/Object;

    array-length v2, v1

    if-ge v0, v2, :cond_e

    aput-object p1, v1, v0

    const/4 p1, 0x1

    add-int/2addr v0, p1

    iput v0, p0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/づざかべべ;->〺つふすそ:I

    return p1

    :cond_e
    const/4 p1, 0x0

    return p1
.end method

.method public げつ〴ぬぐ()Ljava/lang/Object;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget v0, p0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/づざかべべ;->〺つふすそ:I

    const/4 v1, 0x0

    if-lez v0, :cond_12

    add-int/lit8 v2, v0, -0x1

    iget-object v3, p0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/づざかべべ;->げつ〴ぬぐ:[Ljava/lang/Object;

    aget-object v4, v3, v2

    aput-object v1, v3, v2

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/づざかべべ;->〺つふすそ:I

    return-object v4

    :cond_12
    return-object v1
.end method
