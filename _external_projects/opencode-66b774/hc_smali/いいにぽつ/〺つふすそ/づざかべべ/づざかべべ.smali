.class public Lいいにぽつ/〺つふすそ/づざかべべ/づざかべべ;
.super Ljava/util/ArrayList;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/ArrayList<",
        "L\u3044\u3044\u306b\u307d\u3064/\u303a\u3064\u3075\u3059\u305d/\u3065\u3056\u304b\u3079\u3079/\u3073\u3050\u3073\u3042\u3073;",
        ">;"
    }
.end annotation


# instance fields
.field public final 〺つふすそ:I


# direct methods
.method public constructor <init>(II)V
    .registers 3

    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(I)V

    iput p2, p0, Lいいにぽつ/〺つふすそ/づざかべべ/づざかべべ;->〺つふすそ:I

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ()Z
    .registers 3

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/づざかべべ;->〺つふすそ:I

    if-ge v0, v1, :cond_a

    const/4 v0, 0x1

    goto :goto_b

    :cond_a
    const/4 v0, 0x0

    :goto_b
    return v0
.end method
