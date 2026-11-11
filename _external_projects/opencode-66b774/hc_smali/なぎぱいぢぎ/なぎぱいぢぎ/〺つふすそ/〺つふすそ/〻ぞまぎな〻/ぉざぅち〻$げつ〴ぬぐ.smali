.class public Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/ぉざぅち〻$げつ〴ぬぐ;
.super Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/ぉざぅち〻;->づおぴ〱いづ(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$でどあくず;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/ぉざぅち〻;Landroid/content/Context;)V
    .registers 3

    invoke-direct {p0, p2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public づざかべべ(Landroid/util/DisplayMetrics;)F
    .registers 3

    iget p1, p1, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float p1, p1

    const/high16 v0, 0x42c80000    # 100.0f

    div-float/2addr v0, p1

    return v0
.end method
