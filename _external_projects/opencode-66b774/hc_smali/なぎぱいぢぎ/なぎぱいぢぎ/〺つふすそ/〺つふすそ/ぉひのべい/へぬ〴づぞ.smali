.class public Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/へぬ〴づぞ;
.super Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$なぎぱいぢぎ;
.source ""


# instance fields
.field public final synthetic 〺つふすそ:Ljava/util/List;

.field public final synthetic くし〴〺ぅ:Landroid/graphics/Matrix;


# direct methods
.method public constructor <init>(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず;Ljava/util/List;Landroid/graphics/Matrix;)V
    .registers 4

    iput-object p2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/へぬ〴づぞ;->〺つふすそ:Ljava/util/List;

    iput-object p3, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/へぬ〴づぞ;->くし〴〺ぅ:Landroid/graphics/Matrix;

    invoke-direct {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$なぎぱいぢぎ;-><init>()V

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(Landroid/graphics/Matrix;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぺづげぺが/げつ〴ぬぐ;ILandroid/graphics/Canvas;)V
    .registers 7

    iget-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/へぬ〴づぞ;->〺つふすそ:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$なぎぱいぢぎ;

    iget-object v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/へぬ〴づぞ;->くし〴〺ぅ:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1, p2, p3, p4}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/おぐぴう〸ず$なぎぱいぢぎ;->げつ〴ぬぐ(Landroid/graphics/Matrix;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぺづげぺが/げつ〴ぬぐ;ILandroid/graphics/Canvas;)V

    goto :goto_6

    :cond_18
    return-void
.end method
