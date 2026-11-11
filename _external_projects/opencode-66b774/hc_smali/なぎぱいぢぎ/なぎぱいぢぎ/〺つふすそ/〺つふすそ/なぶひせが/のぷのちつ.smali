.class public Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/のぷのちつ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/へぬ〴づぞ;


# instance fields
.field public final げつ〴ぬぐ:Landroid/view/ViewOverlay;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/view/View;->getOverlay()Landroid/view/ViewOverlay;

    move-result-object p1

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/のぷのちつ;->げつ〴ぬぐ:Landroid/view/ViewOverlay;

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Landroid/graphics/drawable/Drawable;)V
    .registers 3

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/のぷのちつ;->げつ〴ぬぐ:Landroid/view/ViewOverlay;

    invoke-virtual {v0, p1}, Landroid/view/ViewOverlay;->remove(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public げつ〴ぬぐ(Landroid/graphics/drawable/Drawable;)V
    .registers 3

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/のぷのちつ;->げつ〴ぬぐ:Landroid/view/ViewOverlay;

    invoke-virtual {v0, p1}, Landroid/view/ViewOverlay;->add(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method
