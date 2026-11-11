.class public Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$げつ〴ぬぐ;
.super Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public 〺つふすそ:[D

.field public げつ〴ぬぐ:D


# direct methods
.method public constructor <init>(D[D)V
    .registers 4

    invoke-direct {p0}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;-><init>()V

    iput-wide p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$げつ〴ぬぐ;->げつ〴ぬぐ:D

    iput-object p3, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:[D

    return-void
.end method


# virtual methods
.method public 〺つふすそ(DI)D
    .registers 4

    iget-object p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:[D

    aget-wide p2, p1, p3

    return-wide p2
.end method

.method public ぁごぐすすぃ()[D
    .registers 5

    const/4 v0, 0x1

    new-array v0, v0, [D

    iget-wide v1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$げつ〴ぬぐ;->げつ〴ぬぐ:D

    const/4 v3, 0x0

    aput-wide v1, v0, v3

    return-object v0
.end method

.method public くし〴〺ぅ(D[D)V
    .registers 5

    iget-object p1, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:[D

    array-length p2, p1

    const/4 v0, 0x0

    invoke-static {p1, v0, p3, v0, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public づざかべべ(DI)D
    .registers 4

    const-wide/16 p1, 0x0

    return-wide p1
.end method

.method public なぎぱいぢぎ(D[D)V
    .registers 6

    const/4 p1, 0x0

    :goto_1
    iget-object p2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:[D

    array-length p2, p2

    if-ge p1, p2, :cond_d

    const-wide/16 v0, 0x0

    aput-wide v0, p3, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_d
    return-void
.end method

.method public びぐびあび(D[F)V
    .registers 6

    const/4 p1, 0x0

    :goto_1
    iget-object p2, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:[D

    array-length v0, p2

    if-ge p1, v0, :cond_e

    aget-wide v0, p2, p1

    double-to-float p2, v0

    aput p2, p3, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_e
    return-void
.end method
