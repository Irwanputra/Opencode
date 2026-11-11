.class public Lcom/google/android/material/appbar/CollapsingToolbarLayout$〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/material/appbar/AppBarLayout$くし〴〺ぅ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/appbar/CollapsingToolbarLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u303a\u3064\u3075\u3059\u305d"
.end annotation


# instance fields
.field public final synthetic げつ〴ぬぐ:Lcom/google/android/material/appbar/CollapsingToolbarLayout;


# direct methods
.method public constructor <init>(Lcom/google/android/material/appbar/CollapsingToolbarLayout;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/appbar/CollapsingToolbarLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(Lcom/google/android/material/appbar/AppBarLayout;I)V
    .registers 11

    iget-object p1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/appbar/CollapsingToolbarLayout;

    iput p2, p1, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぶでにく〼〳:I

    iget-object p1, p1, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->〻ぞまぎな〻:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    const/4 v0, 0x0

    if-eqz p1, :cond_e

    invoke-virtual {p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->づざかべべ()I

    move-result p1

    goto :goto_f

    :cond_e
    const/4 p1, 0x0

    :goto_f
    iget-object v1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/appbar/CollapsingToolbarLayout;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getChildCount()I

    move-result v1

    const/4 v2, 0x0

    :goto_16
    if-ge v2, v1, :cond_4d

    iget-object v3, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/appbar/CollapsingToolbarLayout;

    invoke-virtual {v3, v2}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Lcom/google/android/material/appbar/CollapsingToolbarLayout$LayoutParams;

    invoke-static {v3}, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->びぐびあび(Landroid/view/View;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;

    move-result-object v5

    iget v6, v4, Lcom/google/android/material/appbar/CollapsingToolbarLayout$LayoutParams;->げつ〴ぬぐ:I

    const/4 v7, 0x1

    if-eq v6, v7, :cond_3c

    const/4 v3, 0x2

    if-eq v6, v3, :cond_31

    goto :goto_4a

    :cond_31
    neg-int v3, p2

    int-to-float v3, v3

    iget v4, v4, Lcom/google/android/material/appbar/CollapsingToolbarLayout$LayoutParams;->〺つふすそ:F

    mul-float v3, v3, v4

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    goto :goto_47

    :cond_3c
    neg-int v4, p2

    iget-object v6, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/appbar/CollapsingToolbarLayout;

    invoke-virtual {v6, v3}, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->くし〴〺ぅ(Landroid/view/View;)I

    move-result v3

    invoke-static {v4, v0, v3}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->てぜきぽく(III)I

    move-result v3

    :goto_47
    invoke-virtual {v5, v3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/へぬ〴づぞ/なぎぱいぢぎ;->〺つふすそ(I)Z

    :goto_4a
    add-int/lit8 v2, v2, 0x1

    goto :goto_16

    :cond_4d
    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/appbar/CollapsingToolbarLayout;

    invoke-virtual {v0}, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->なぎぱいぢぎ()V

    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/appbar/CollapsingToolbarLayout;

    iget-object v1, v0, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->ぇぬぎばつ:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_5d

    if-lez p1, :cond_5d

    invoke-static {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->どぇぞほだ(Landroid/view/View;)V

    :cond_5d
    iget-object v0, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/appbar/CollapsingToolbarLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/appbar/CollapsingToolbarLayout;

    invoke-static {v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぇぬぎばつ(Landroid/view/View;)I

    move-result v1

    sub-int/2addr v0, v1

    sub-int/2addr v0, p1

    iget-object p1, p0, Lcom/google/android/material/appbar/CollapsingToolbarLayout$〺つふすそ;->げつ〴ぬぐ:Lcom/google/android/material/appbar/CollapsingToolbarLayout;

    iget-object p1, p1, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->てぜきぽく:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p2

    int-to-float p2, p2

    int-to-float v0, v0

    div-float/2addr p2, v0

    invoke-virtual {p1, p2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/げつ〴ぬぐ;->ぶでにく〼〳(F)V

    return-void
.end method
